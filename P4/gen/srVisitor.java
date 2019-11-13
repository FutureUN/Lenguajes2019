// Generated from /home/jimmy/UNAL/UNAL/2019-2/lenguajes/ANTLR/P4/grammar/sr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link srParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface srVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link srParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(srParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(srParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(srParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(srParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#global_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_content(srParser.Global_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(srParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(srParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#r_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_elements(srParser.R_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#r_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_declaration(srParser.R_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#assign_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_dec(srParser.Assign_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#op_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_function(srParser.Op_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#op_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_return(srParser.Op_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(srParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#if_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_array(srParser.If_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#b_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_params(srParser.B_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(srParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(srParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(srParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dec(srParser.Type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(srParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(srParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#function_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_id(srParser.Function_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link srParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(srParser.StatementContext ctx);
}