<!DOCTYPE html>
<#import "/spring.ftl" as spring />
<html>
<head>
    <title>Rides</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

<div id="header">
    <h2>Spring MVC with FreeMarker and MongoDB</h2>
</div>
<div id="content">
    <fieldset>
        <legend>Add Ride</legend>
        <form action="/ride" method="post" >
            Departure : <input type="text" name="departure" /><br/>
            Arrival: <input type="text" name="arrival" /><br/>
            Price: <input type="text" name="price" /><br/>
            <input type="submit" value="Add" />
        </form>
    </fieldset>
    <br/>
    <table class="datatable">
        <tr>
            <th>Departure</th>
            <th>Arrival</th>
            <th>Price</th>
        </tr>
        <#list model["rideList"] as ride>
            <tr>
                <td>${ride.departure}</td>
                <td>${ride.arrival}</td>
                <td>${ride.price}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>