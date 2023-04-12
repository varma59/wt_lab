<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
    <h1> Country details</h1>
    <table border="1">
    <tr bgcolor="blue">
        <th>name</th>
        <th>Continent</th>

    </tr>
    <xsl:for-each select="County/Details">
    <tr>
        <td><xsl:value-of select="name"/></td>
        <td><xsl:value-of select="Continent"/></td>
    </tr>
    </xsl:for-each>
    </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
