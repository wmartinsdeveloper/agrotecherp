const divHtmlCultura = document.querySelector('#divCultura')

async function listar(){
    const endpoint = await fetch('http://192.168.3.110:8001/cultura/listar')
    const resultSet = await endpoint.json()

    listarCultura(resultSet)

}


 function listarCultura(resultSet){
    divCultura.innerHTML= ""
    resultSet.forEach(cultura => {
                                    const dados = `<div> <p>Cultura: ${cultura.nome} </p></div>`
                                    divCultura.innerHTML = divCultura.innerHTML + dados
        
                                  }
                      )
 }



