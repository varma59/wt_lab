<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
	<h1> Emp details</h1>
	<table border="1">
	<tr bgcolor="blue">
		<th>Name</th>
		<th>Dept</th>
		<th>mail</th>
		<th>Phno</th>
		<th>Marks</th>
	</tr>
	<xsl:for-each select="empl/Details">
	<tr>
		<td><xsl:value-of select="Name"/></td>
		<td><xsl:value-of select="Dept"/></td>
		<td><xsl:value-of select="mail"/></td>
		<td><xsl:value-of select="Phno"/></td>
		<td><xsl:value-of select="Marks"/></td>
	</tr>
	</xsl:for-each>
	</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
