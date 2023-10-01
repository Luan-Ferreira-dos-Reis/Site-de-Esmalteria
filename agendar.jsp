<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.belasUnhas.Servico" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovoServico" var="linkServletNovoServico"/>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilo.css">
    <link rel="stylesheet" href="responsivo.css">
    <link rel="stylesheet" href="dropdown.css">
    <link rel="stylesheet" href="estiloForm.css">
    <title>Agende um horário</title>
</head>

<body>

    <nav class="navbar">
        <div class="logo">
            <h1>Belas Unhas</h1>
        </div>
        <div class="menu">
            <a href="index.html">Inicio</a>
            <a href="sobrenos.html">Sobre nós</a>
            <!-- <a href="#">Serviços</a> -->
            <li class="dropdown">
                <a class="dropbtn" href="#"> Serviços </a>
                <div class="dropdown-content">
                    <a href="maniPedi.html"> Manicure e Pedicure </a>
                    <a href="unhaGel.html"> Unha em Gel </a>
                    <a href="podologia.html"> Podologia </a>
                    <a href="spaDoPe.html"> Spa do Pé </a>
                </div>
            </li>

            <a id="botao" href="faleConosco.html">Fale Conosco</a>
        </div>

    </nav>

    <header class="header">


    </header>

    <section>

        <div id="area">
            <form id="formulario" autocomplete="off" action="${linkServletNovoServico}" method="post">
                <fieldset>
                    <legend>Agendamento de Serviço</legend>

                    <label>Nome:</label> <input class="campo_nome" type="text" name="nome"><br>

                    <label>Telefone:</label> <input class="campo_fone" type="text" name="fone"><br><br>

                    <label for="data">Horário:</label>
                    <input type="time" id="appt" name="horario" min="07:00" max="18:00" required />
                    <label for="appt"></label>
                    <input id="date" name="data" type="date" /> <br>
                    <small>Horário de funcionamento das 7:00 às 18:00 </small> <br>

                    <label>Serviço: </label><br><textarea class="msg"  name="descricao" cols="35" rows="8"></textarea><br>
                    <input class="btn_submit" type="submit" value="Enviar" >
                </fieldset>
            </form>
        </div>


    </section>

    <br><br>
    <a href="index.html" class="contact-btn">Voltar</a>

    <footer>
        <div class="logo-rodape">
            <h1 class="agencia" style="color:white">Belas Unhas</h1>
            <p style="color:white">Você mais bela a cada dia!</p>
        </div>
        <b style="color:white">© Todos os direitos reservados.</b>
    </footer>

    <a href="https://api.whatsapp.com/send?phone=5583996090606" class="whatsapp-simbolo" target="_blank">
        <img src="img/whatsapp.png" style="width: 50px;">
    </a>

</body>

</html>