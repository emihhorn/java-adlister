
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1></h1>
<form action="/pizza-order" method="post">
    <label for="crust">Choose Crust</label>
    <select name="crust" id="crust">
        <option value="Handmade Pan">Handmade Pan</option>
        <option value="thin">Thin Crust</option>
        <option value="stuffed">Stuffed Crust</option>
        <option value="Hand tossed">Hand Tossed</option>
        <option value="Gluten Free">Gluten Free</option>
    </select>
    <br>
    <label for="sauce">Choose Sauce</label>
    <select name="sauce" id="sauce">
        <option value="no sauce"> None </option>
        <option value="bbq">BBQ Sauce</option>
        <option value="tomato">Tomato Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
        <option value="Hot Buffalo">Hot Buffalo Sauce</option>
    </select>
    <br>
    <label for="size">Choose Size</label>
    <select name="size" id="size">
        <option value="small">Small (10")</option>
        <option value="medium">Medium(12")</option>
        <option value="large">Large (14")</option>
    </select>
    <p>Choose Toppings</p>
    <input type="checkbox" id="pepperoni" name="toppings">
    <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" id="veggies" name="toppings">
    <label for="veggies">Veggies</label>
    <input type="checkbox" id="mushroom" name="toppings">
    <label for="mushroom">Mushroom</label>
    <input type="checkbox" id="Bacon" name="toppings">
    <label for="Bacon">Bacon</label>
    <br>

<%--    <h3>~OR~</h3>--%>
<%--    <form action="/pizza-order" method="post">--%>
<%--    <p>Order Now</p>--%>

<%--    <input type="hidden" id="Meat Lovers" name="orderNow">--%>

<%--    <input type="hidden" id="Pacific Veggie" name="orderNow">--%>

<%--    <input type="hidden" id="Chicken Taco" name="orderNow">--%>

<%--    <input type="hidden" id="Memphis BBQ Chicken" name="orderNow">--%>

<%--    <button> Order Special Now!<label for="Meat Lovers">Meat Lovers</label>  </button>--%>
<%--    <button> Veggie Special<label for="Pacific Veggie">Pacific Veggie</label>  </button>--%>
<%--    <button> Chicken Taco <label for="Chicken Taco">Chicken Taco</label></button>--%>
<%--    <button> BBQ <label for="Memphis BBQ Chicken">Memphis BBQ Chicken</label> </button>--%>
<%--    </form>--%>


     <br>

      <form action="/pizza-order" method="POST">
            <input type="hidden" name="crust-type" value="deep-dish">
            <input type="hidden" name="sauce-type" value="red">
            <input type="hidden" name="address" value="123 Codeup Way"><label for="address">Delivery address:</label>
            <input type="hidden" name="toppings" value="pepperoni"><input type="text" name="address" id="address">
            <input type="hidden" name="toppings" value="onions"><br>
            <button>Order Special NOW!</button><button type="submit" id="submitBtn">Submit</button>
      </form>
</body>
</html>