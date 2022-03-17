<#setting url_escaping_charset='utf-8'>
<html>
    <head>
        <title>Users</title>
        <style rel="stylesheet">
            th,td {
                border: 1px solid;
            }
            table {
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <h1>Users</h1>
        <div>
            <table>
                <tr>
                    <th>ID</th>
                    <th>First name</th>
                    <th>Last name</th>
                </tr>
                <#list users as it>
                <tr>
                    <td>
                        ${it.id}
                    </td>
                    <td>
                        ${it.firstName}
                    </td>
                    <td>
                        ${it.lastName}
                    </td>
                </tr>
                </#list>
            </table>
        </div>
    </body>
</html>