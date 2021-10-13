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