/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.ParserRuleContext;

/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class SRtoNL extends srBaseListener {
    /** Translate { to " */

    /** Translate } to " */
    @Override
    public void exitInit(srParser.InitContext ctx) {
        System.out.println("Traduccion finalizada");
    }

    /** Translate integers to 4-digit hexadecimal strings prefixed with \\u */
    @Override
    public void enterGlobal(srParser.GlobalContext ctx) {
        System.out.println("Se Inicia la declaracion bloque global con identificador " + ctx.ID_TOKEN());
    }

    @Override
    public void exitGlobal(srParser.GlobalContext ctx) {
        System.out.println("Final declaracion bloque global con identificador " + ctx.ID_TOKEN());
    }
    @Override public void enterGlobal_content(srParser.Global_contentContext ctx) {
        for (int i=0; i<ctx.depth()-2; i++)
            System.out.print('\t');
    }
    @Override
    public void enterR_declaration(srParser.R_declarationContext ctx) {
        if (ctx.CONST() != null) {
            System.out.println("Declaracion de constante con identificador " + ctx.ID_TOKEN() + " con valor " + ctx.expression().getText() );
        } else if (ctx.TYPE() != null) {
            System.out.println("Declaracion alias de tipo " + ctx.ID_TOKEN() + " como " + ctx.type().get(0).getText());
        } else if (ctx.VAR() != null) {
            System.out.println("Declaracion de variable(S) con identificador " + ctx.var_id().getText() + " de tipo  " + ctx.type_def().type().getText() + " con valor(es) " + ctx.assign_dec().getText()  );
        } else {
            System.out.println("//TODO :D");
        }
    }

    @Override public void enterResource(srParser.ResourceContext ctx) {
        System.out.print("Se Inicia la declaracion de recurso con identificador " + ctx.ID_TOKEN());
        if (ctx.parameters()!=null) {
            System.out.print(" con parametros " + ctx.parameters().getText());
        }
        System.out.println("");

    }

    @Override public void exitResource(srParser.ResourceContext ctx) {
        System.out.println("Fin de declaracion de recurso con identificador " + ctx.ID_TOKEN());
    }

    @Override public void enterR_elements(srParser.R_elementsContext ctx) {

        for (int i=0; i<ctx.depth()-2; i++)
            System.out.print('\t');
        if (ctx.function_id() != null)  {
            System.out.println("Llamado a la funcion " + ctx.function_id().getText() + " con parametros " + ctx.parameters().getText());
        } else if (ctx.statement() == null) {
            System.out.println("TODO, no disponible");
        }
     }

    @Override public void enterBody(srParser.BodyContext ctx) {
        for (int i=0; i<ctx.depth()-2; i++)
            System.out.print('\t');
        System.out.print("Declaracion del cuerpo del recurso");
        if (ctx.parameters()!=null) {
            System.out.print(" con parametros " + ctx.parameters().getText());
        }
        System.out.println("");

    }
    @Override public void exitBody(srParser.BodyContext ctx) {
        for (int i=0; i<ctx.depth()-2; i++)
            System.out.print('\t');
        System.out.println("Fin Declaracion del cuerpo del recurso ");
    }

    @Override public void enterStatement(srParser.StatementContext ctx) {
        System.out.println("Asignacion de variable " + ctx.identifier().get(0).getText() + " con valor " + ctx.identifier().get(1).getText());
    }












}