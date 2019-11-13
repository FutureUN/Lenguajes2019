// Generated from /home/sebastian/UN/lenguajes/Lenguajes2019/P4/grammar/sr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link srParser}.
 */
public interface srListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link srParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(srParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(srParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(srParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(srParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(srParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(srParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(srParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(srParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#global_content}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_content(srParser.Global_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#global_content}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_content(srParser.Global_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(srParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(srParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(srParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(srParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#r_elements}.
	 * @param ctx the parse tree
	 */
	void enterR_elements(srParser.R_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#r_elements}.
	 * @param ctx the parse tree
	 */
	void exitR_elements(srParser.R_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#r_declaration}.
	 * @param ctx the parse tree
	 */
	void enterR_declaration(srParser.R_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#r_declaration}.
	 * @param ctx the parse tree
	 */
	void exitR_declaration(srParser.R_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#assign_dec}.
	 * @param ctx the parse tree
	 */
	void enterAssign_dec(srParser.Assign_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#assign_dec}.
	 * @param ctx the parse tree
	 */
	void exitAssign_dec(srParser.Assign_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#op_function}.
	 * @param ctx the parse tree
	 */
	void enterOp_function(srParser.Op_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#op_function}.
	 * @param ctx the parse tree
	 */
	void exitOp_function(srParser.Op_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#op_return}.
	 * @param ctx the parse tree
	 */
	void enterOp_return(srParser.Op_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#op_return}.
	 * @param ctx the parse tree
	 */
	void exitOp_return(srParser.Op_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(srParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(srParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#if_array}.
	 * @param ctx the parse tree
	 */
	void enterIf_array(srParser.If_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#if_array}.
	 * @param ctx the parse tree
	 */
	void exitIf_array(srParser.If_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#b_params}.
	 * @param ctx the parse tree
	 */
	void enterB_params(srParser.B_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#b_params}.
	 * @param ctx the parse tree
	 */
	void exitB_params(srParser.B_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(srParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(srParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(srParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(srParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(srParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(srParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#type_dec}.
	 * @param ctx the parse tree
	 */
	void enterType_dec(srParser.Type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#type_dec}.
	 * @param ctx the parse tree
	 */
	void exitType_dec(srParser.Type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(srParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(srParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(srParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(srParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#function_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_id(srParser.Function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#function_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_id(srParser.Function_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(srParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(srParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link srParser#ob_parameters}.
	 * @param ctx the parse tree
	 */
	void enterOb_parameters(srParser.Ob_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link srParser#ob_parameters}.
	 * @param ctx the parse tree
	 */
	void exitOb_parameters(srParser.Ob_parametersContext ctx);
}