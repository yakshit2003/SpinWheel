<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <title>Spin Wheel</title>

    <link rel="stylesheet" href="Assets/style1.css">

</head>

<body>

    <div class="container">

        <div class="spinBtn">Spin</div>

        <div class="wheel">

            <div class="number" style="--i:1;--clr:#db7093;">

                <span><img src="Assets/icons8-chocolate-96.png"></span></div>

            <div class="number" style="--i:2;--clr:#20b2aa;">

                <span>20% off</span></div>

            <div class="number" style="--i:3;--clr:#daa520;">

                <span><img src="Assets/icons8-chocolate-96.png"></span></div>

            <div class="number" style="--i:4;--clr:#ff340f;">

                <span>Try Again</span></div>

            <div class="number" style="--i:5;--clr:#4169e1;">

                <span><img src="Assets/icons8-chocolate-96.png"></span></div>

            <div class="number" style="--i:6;--clr:#3cb371;">

                <span>30% Off</span></div>

            <div class="number" style="--i:7;--clr:#d63e92;">

                <span><img src="Assets/icons8-chocolate-96.png"></span></div>

            <div class="number" style="--i:8;--clr:#ff7f50;">

                <span>50% Off</span></div>

        </div>

    </div>

    <script>

        let wheel = document.querySelector('.wheel');

        let spinBtn = document.querySelector('.spinBtn');

        let value = Math.ceil(Math.random() * 3600);



        spinBtn.onclick = function(){

            wheel.style.transform = "rotate(" + value + "deg)"



            value += Math.ceil(Math.random() * 3600);

        }

    </script>

</body>

</html>