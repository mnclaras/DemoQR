<!DOCTYPE html>

<title>Hello world</title>

<link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<body>
<br>
<h1 style="text-align: center;">Etiquetado de material de entrada</h1>
<br>
<div class="container">
    <table class="table table-striped">
        <tr>
            <th>Entidad</th>
            <th>Valor</th>
        </tr>
        <tr>
            <td>R. Interna</td>
            <td>${rinterno}</td>
        </tr>
        <tr>
            <td>Proveedor (V)</td>
            <td>${suplier}</td>
        </tr>
        <tr>
            <td>Referencia (P)</td>
            <td>${part}</td>
        </tr>
        <tr>
            <td>Cantidad (Q)</td>
            <td>${qty}</td>
        </tr>
        <tr>
            <td>Etiqueta (S)</td>
            <td>${serial}</td>
        </tr>
        <tr>
            <td>Lote (H)</td>
            <td>${batch}</td>
        </tr>
    </table>
</div>
</body>

</html>
