function eliminarUsuario(id)
{
	swal({
		title: "¿Está segur@ de eliminar el registro?",
		text: "¡Una vez eliminado, el registro no podrá ser recuperado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
	.then((OK) => {
		if (OK) {
			$.ajax({
				url:"/eliminarUsuario/"+id,
				success: function(res){
					console.log(res);
				}
			})
			swal("¡El registro ha sido eliminado!", {
				icon: "success",
			})
			.then((OK) => {
				if(OK) {
					location.href="/listarUsuarios";
				}
			})
		} else {
			swal("¡El registro NO se ha eliminado!");
		}
	});
}

function eliminarCliente(id)
{
	swal({
		title: "¿Está segur@ de eliminar el registro?",
		text: "¡Una vez eliminado, el registro no podrá ser recuperado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
	.then((OK) => {
		if (OK) {
			$.ajax({
				url:"/eliminarCliente/"+id,
				success: function(res){
					console.log(res);
				}
			})
			swal("¡El registro ha sido eliminado!", {
				icon: "success",
			})
			.then((OK) => {
				if(OK) {
					location.href="/listarClientes";
				}
			})
		} else {
			swal("¡El registro NO se ha eliminado!");
		}
	});
}

function eliminarProveedor(id)
{
	swal({
		title: "¿Está segur@ de eliminar el registro?",
		text: "¡Una vez eliminado, el registro no podrá ser recuperado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
	.then((OK) => {
		if (OK) {
			$.ajax({
				url:"/eliminarProveedor/"+id,
				success: function(res){
					console.log(res);
				}
			})
			swal("¡El registro ha sido eliminado!", {
				icon: "success",
			})
			.then((OK) => {
				if(OK) {
					location.href="/listarProveedores";
				}
			})
		} else {
			swal("¡El registro NO se ha eliminado!");
		}
	});
}

function eliminarProducto(id)
{
	swal({
		title: "¿Está segur@ de eliminar el registro?",
		text: "¡Una vez eliminado, el registro no podrá ser recuperado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
	.then((OK) => {
		if (OK) {
			$.ajax({
				url:"/eliminarProducto/"+id,
				success: function(res){
					console.log(res);
				}
			})
			swal("¡El registro ha sido eliminado!", {
				icon: "success",
			})
			.then((OK) => {
				if(OK) {
					location.href="/listarProductos";
				}
			})
		} else {
			swal("¡El registro NO se ha eliminado!");
		}
	});
}

function completarUsuario()
{
	var nombreUsuario = document.getElementById("selectUsuario").value;
	document.getElementById("inputUsuario").value = nombreUsuario;
	
	console.log(nombreUsuario)
}

function completarCliente()
{
	var nombreCliente = document.getElementById("selectCliente").value;
	var cliente = document.getElementById("selectCliente").selectedOptions[0].text;
	document.getElementById("inputCliente").value = nombreCliente;
	document.getElementById("nombre_cli_vta").value = cliente;
}

function completarProducto1()
{
	var codigoProducto = document.getElementById("selectProducto1").value;
	var producto1 = productos.find(item=>item.codigo_Producto == codigoProducto);
	document.getElementById("inputProducto1").value = producto1.codigo_Producto;
	document.getElementById("precioSinIVA1").value = producto1.precio_Compra;
}

function completarProducto2()
{
	var codigoProducto = document.getElementById("selectProducto2").value;
	var producto2 = productos.find(item=>item.codigo_Producto == codigoProducto);
	document.getElementById("inputProducto2").value = producto2.codigo_Producto;
	document.getElementById("precioSinIVA2").value = producto2.precio_Compra;
}

function completarProducto3()
{
	var codigoProducto = document.getElementById("selectProducto3").value;
	var producto3 = productos.find(item=>item.codigo_Producto == codigoProducto);
	document.getElementById("inputProducto3").value = producto3.codigo_Producto;
	document.getElementById("precioSinIVA3").value = producto3.precio_Compra;
}

function showHour()
{
	var hoy = new Date();
	var hora = hoy.getHours() + ":" + hoy.getMinutes() + ":" + hoy.getSeconds();
	document.getElementById("HoraActual").value = hora;
	setTimeout("showHour()", 1000);
}

showDate()
function showDate()
{
	var hoy = new Date();
	var fecha = hoy.getDate() + " / " + (hoy.getMonth()+1) + " / " + hoy.getSeconds();
	document.getElementById("FechaActual").value = fecha;
}

function hallarValorTotalSinIVA1()
{
	let valorUnidad = document.getElementById("precio_SinIVA1").value;
	let cantidad = document.getElementById("cantidadProducto1").value;
	let totalSinIVA = valorUnidad * cantidad;
	document.getElementById("inputTotalSinIVA1").value = totalSinIVA;
	hallarValorSubTotalSinIVA();
}

function hallarValorTotalSinIVA2()
{
	let valorUnidad = document.getElementById("precio_SinIVA2").value;
	let cantidad = document.getElementById("cantidadProducto2").value;
	let totalSinIVA = valorUnidad * cantidad;
	document.getElementById("inputTotalSinIVA2").value = totalSinIVA;
	hallarValorSubTotalSinIVA();
}

function hallarValorTotalSinIVA3()
{
	let valorUnidad = document.getElementById("precio_SinIVA3").value;
	let cantidad = document.getElementById("cantidadProducto3").value;
	let totalSinIVA = valorUnidad * cantidad;
	document.getElementById("inputTotalSinIVA3").value = totalSinIVA;
	hallarValorSubTotalSinIVA();
}

function hallarValorSubTotalSinIVA()
{
	let valor1 = isNaN(parseInt(document.getElementById("inputTotalSinIVA1").value)) ? 0 : parseInt(document.getElementById("inputTotalSinIVA1").value);
	let valor2 = isNaN(parseInt(document.getElementById("inputTotalSinIVA2").value)) ? 0 : parseInt(document.getElementById("inputTotalSinIVA2").value);
	let valor3 = isNaN(parseInt(document.getElementById("inputTotalSinIVA3").value)) ? 0 : parseInt(document.getElementById("inputTotalSinIVA3").value);
	let valorSubTotalSinIVA = valor1 + valor2 + valor3;
	document.getElementById("inputSubTotalSinIVA").value = valorSubTotalSinIVA;
	hallarValorIVA();
	totalFactura();
	asignarDatosTotales();
}

function hallarValorIVA()
{
	let porcentajeIVA = 0.19;
	let valorSubTotalSinIVA = isNaN(parseInt(document.getElementById("inputSubTotalSinIVA").value)) ? 0 : parseInt(document.getElementById("inputSubTotalSinIVA").value);
	let valorIVA = valorSubTotalSinIVA * porcentajeIVA;
	document.getElementById("inputValorIVA").value = valorIVA;
}

function totalFactura()
{
	let valorSubTotalSinIVA = isNaN(parseInt(document.getElementById("inputSubTotalSinIVA").value)) ? 0 : parseInt(document.getElementById("inputSubTotalSinIVA").value);
	let valorIVA = isNaN(parseInt(document.getElementById("inputValorIVA").value)) ? 0 : parseInt(document.getElementById("inputValorIVA").value);
	let totalFactura = valorSubTotalSinIVA + valorIVA;
	document.getElementById("inputValorTotalFactura").value = totalFactura;
}

function eliminarFilaProducto1()
{
	document.getElementById("inputProducto1").value = "";
	document.getElementById("selectProducto1").value = 0;
	document.getElementById("precio_SinIVA1").value = "";
	document.getElementById("cantidadProducto1").value = "";
	document.getElementById("inputTotalSinIVA1").value = "";
}

function eliminarFilaProducto2()
{
	document.getElementById("inputProducto2").value = "";
	document.getElementById("selectProducto2").value = 0;
	document.getElementById("precio_SinIVA2").value = "";
	document.getElementById("cantidadProducto2").value = "";
	document.getElementById("inputTotalSinIVA2").value = "";
}

function eliminarFilaProducto3()
{
	document.getElementById("inputProducto3").value = "";
	document.getElementById("selectProducto3").value = 0;
	document.getElementById("precio_SinIVA3").value = "";
	document.getElementById("cantidadProducto3").value = "";
	document.getElementById("inputTotalSinIVA3").value = "";
}

function asignarDatosTotales()
{
	let valorIVA = isNaN(parseInt(document.getElementById("inputValorIVA").value)) ? 0 : parseInt(document.getElementById("inputValorIVA").value);
	let valorTotalFactura = isNaN(parseInt(document.getElementById("inputValorTotalFactura").value)) ? 0 : parseInt(document.getElementById("inputValorTotalFactura").value);
	document.getElementById("datoValorFactura").value = valorTotalFactura;
	document.getElementById("datoValorIVA").value = valorIVA;
}