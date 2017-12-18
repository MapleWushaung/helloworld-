<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<form action="InsertProduct" method="post">
		<table style="text-align: center">
			<tr>
				<td>商品名称</td>
				<td><input type="text" id="name" name="name" size="25" value="" /></td>
			</tr>
			<tr>
				<td>商品图片</td>
				<td><input type="text" id="img_path" name="product_imgPath"
					size="25" value="media/image/jwj.png" /></td>
			</tr>
			<tr>
				<td>商品编号</td>
				<td><input type="text" id="code" name="code" size="25"
					value="JWJ000" /></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" id="price" name="price" size="25"
					value="" /></td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td><input type="text" id="count" name="count" size="25" /></td>
			</tr>
			<tr>
				<td>商品状态</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;上架<input type="radio" id="pstauts"
					name="product_status" value="0" checked="checked" />
					&nbsp;&nbsp;&nbsp;&nbsp;下架 <input type="radio" id="pstauts2"
					name="product_status" value="1" /></td>
			</tr>
			<tr>
				<td>商品类别</td>
				<td><select name="category_id">
						<option value="1" selected="selected">食品类</option>
						<option value="2">酒水类</option>
						<option value="3">服饰类</option>
				</select></td>
			</tr>
			<tr>
				<td>商品品牌</td>
				<td><select name="brand_id">
						<option value="1" selected="selected">盼盼</option>
						<option value="2">达利园</option>
						<option value="3">旺仔</option>
				</select></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><textarea rows="3" cols="45" id="remark"
						name="product_desc"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input class="btn green" type="submit"
					value="保存" /> <input class="btn green" type="button" value="返回"
					onclick="history.back()" /></td>

			</tr>
		</table>
	</form>
</body>
</html>