import java.util.HashMap;

public class MyVisitor<T> extends srBaseVisitor<T> {

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public T visitInit(srParser.InitContext ctx){
        if (ctx.global() != null) {
            visitGlobal(ctx.global());
        }
        return null;
    }

    public T visitGlobal(srParser.GlobalContext ctx) {

        return null;
    }

    /*
    @Override
    public T visitRepeat(srParser.RepeatContext ctx) {

        int times = (int) (double) (Double) visitExpr(ctx.expr());
        for (int i = 0; i < times; i++) {
            for(int j=0; j < ctx.command().size(); j++ ) {
                visitCommand(ctx.command().get(j));
            }
        }

        return null;
    }

    @Override
    public T visitBooleanExpr(srParser.BooleanExprContext ctx) {
        String op = ctx.ROP().getText();

        Double num1 = (Double) visitExpr(ctx.expr(0));
        Double num2 = (Double) visitExpr(ctx.expr(1));

        Boolean ans = null;

        switch (op) {
            case "<":
                ans = num1 < num2;
                break;
            case "<=":
                ans = num1 <= num2;
                break;
            case ">":
                ans = num1 > num2;
                break;
            case ">=":
                ans = num1 >= num2;
                break;
            case "==":
                ans = Math.abs(num1 - num2) < 0.000000001;
                break;
            case "!=":
                ans = Math.abs(num1 - num2) > 0.000000001;
                break;
        }
        return (T) (Boolean) ans;
    }
    @Override
    public T visitConditional(srParser.ConditionalContext ctx) {

        Boolean ans = (Boolean) visitBooleanExpr(ctx.booleanExpr());

        if (ans) {
            for(int j=0; j < ctx.command().size(); j++ ) {
                visitCommand(ctx.command().get(j));
            }
        } else if (ctx.else_cond() != null) {
            visitElse_cond(ctx.else_cond());
        }


        return null;
    }
    @Override public T visitWhilecmd(srParser.WhilecmdContext ctx) {
        while ((Boolean) visitBooleanExpr(ctx.booleanExpr())) {
            for(int j=0; j < ctx.command().size(); j++ ) {
                visitCommand(ctx.command().get(j));
            }
        }
        return null;
    }

    @Override
    public T visitElse_cond(srParser.Else_condContext ctx) {
        for(int j=0; j < ctx.command().size(); j++ ) {
            visitCommand(ctx.command().get(j));
        }
        return null; }
    @Override
    public T visitCommand(srParser.CommandContext ctx) {

        if (ctx.printexpr() != null) {
            Double ans = (Double) visitExpr(ctx.printexpr().expr());
            Double aux = Math.floor(ans);

            if (ans - aux < 1e-6) {
                System.out.println(aux);
            } else {
                System.out.println(ans);
            }
        } else if (ctx.VAR() != null) {
            String name = ctx.ID().getText();
            if (table.get(name) != null) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" ya fue declarada.\n", line, col);
                System.exit(-1);
            } else {
                table.put(name, visitExpr(ctx.expr()));
            }
        } else if (ctx.SET() != null){
            String name = ctx.ID().getText();
            if (table.get(name) == null ) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" no ha sido declarada.\n", line, col);
                System.exit(-1) ;
            } else {
                table.put(name, visitExpr(ctx.expr()));
            }
        }
        else {
            return visitChildren(ctx);
        }

        return super.visitCommand(ctx);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitExpr(srParser.ExprContext ctx) {
        if (ctx.DOUBLE() != null) {
            Double num = new Double(ctx.DOUBLE().getText());
            //System.out.println(num);
            return (T) num;
        } else if (ctx.PIZQ() != null) {
            return visitExpr(ctx.expr(0));
        } else if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            Object value;
            if ((value = table.get(name)) == null) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                //Prodria ser en .out tambien.
                System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
                System.exit(-1);
                return null;
            } else {
                //System.out.println(value);
                return (T) value;
            }
        } else {
            String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
            Double num1 = (Double) visitExpr(ctx.expr(0));
            Double num2 = (Double) visitExpr(ctx.expr(1));
            Double ans = null;

            switch (op) {
                case "+":
                    ans = num1 + num2;
                    break;
                case "-":
                    ans = num1 - num2;
                    break;
                case "*":
                    ans = num1 * num2;
                    break;
                case "/":
                    ans = num1 / num2;
                    break;
            }
            //System.out.println(ans);
            return (T) (Double) ans;
        }
    }
    */

}

