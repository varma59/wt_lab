<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
	<h1> System Hardware List</h1>
	<table border="1">
	<tr bgcolor="blue">
		<th>brand</th>
		<th>storage</th>
		<th>processer</th>
		<th>Card</th>
		<th>Price</th>
	</tr>
	<xsl:for-each select="hardware/item">
	<tr>
		<td><xsl:value-of select="brand"/></td>
		<td><xsl:value-of select="storage"/></td>
		<td><xsl:value-of select="processer"/></td>
		<td><xsl:value-of select="card"/></td>
		<td><xsl:value-of select="price"/></td>
	</tr>
	</xsl:for-each>
	</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
