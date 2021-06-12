<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Rooms</title>
</head>
<body>
<center>
<h3>List of Rooms</h3>
</center>
<table class="table table-dark table-striped table table-bordered border-warning" align="center" style="width: 1500px;">

    <th>ID</th>
    <th>Name</th>
    <th>Capacity</th>
    <th>Delete</th>
    </thead>
    <#list rooms as room>
    <tr>
        <td>${room.id}</td>
        <td>${room.name}</td>
        <td>${room.capacity}</td>
        <td><button><a href="/ui/rooms/delete/${room.id}">Delete</button></td>
    </tr>
</#list>
</table>
<center><button><a href="/index.html">Return</a></button></center>
<center><button><a href="/index.html">ReNew</a></button></center>
</body>
</html>
