document.getElementById("btnX").addEventListener('click', async (event) => {
    const titulo = document.getElementById("titulo").value;
    const anoLancamento = document.getElementById("anoLancamento").value;
    const capa = document.getElementById("capa").value;
    const faixas = document.getElementById("faixas").value;
    const artista = document.getElementById("artista").value;
    const generos = document.getElementById("generos").value;

    const artista2 = {
        id: artista
    }

    const faixas2 = [{
        id: faixas
    }]

    const generos2 = [{
        id: generos
    }]

    const disco = {
        titulo: titulo,
        anoLancamento: anoLancamento,
        capa: capa,
        faixas: faixas2,
        artista: artista2,
        generos: generos2
    };

    try {
        const response = await fetch('http://localhost:8080/discos', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(disco)
        });

        if (response.ok) {
            alert('Disco cadastrado com sucesso!');
            document.getElementById('form-cadastrar-disco').reset();
        } else {
            throw new Error('Erro ao cadastrar disco: ' + response.status);
        }
    } catch (error) {
        console.error('Erro ao cadastrar disco:', error);
    }
});

document.getElementById("btnY").addEventListener('click', async (event) => {
    const nome = document.getElementById("nome").value;
    const discos = document.getElementById("discos").value;

    const discos2 = {
        id: discos
    }

    const artista = {
        nome: nome,
        discos: discos2
    };

    try {
        const response = await fetch('http://localhost:8080/discos', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(artista)
        });

        if (response.ok) {
            alert('Artista cadastrado com sucesso!');
            document.getElementById('form-cadastrar-artista').reset();
        } else {
            throw new Error('Erro ao cadastrar artista: ' + response.status);
        }
    } catch (error) {
        console.error('Erro ao cadastrar artista:', error);
    }
});

document.getElementById('btnDeletarDisco').addEventListener('click', async (event) => {

    const id = document.getElementById('idDelete').value;

    try {
        const response = await fetch(`http://localhost:8080/discos/${id}`, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json',
            },
        });

        if (response.ok) {
            alert('Disco deletado com sucesso!');
            document.getElementById('idDelete').reset();
        } else {
            throw new Error('Erro ao deletar disco: ' + response.status);
        }
    } catch (error) {
        console.error('Erro ao deletar disco:', error);
    }
});

function carregarDiscos() {
    fetch('/discos', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        }
    })
        .then(response => response.json())
        .then(discos => {
            const tabela = document.getElementById('tabelaDiscos').getElementsByTagName('tbody')[0];

            tabela.innerHTML = '';

            discos.forEach(disco => {
                const novaLinha = tabela.insertRow();

                const celulaTitulo = novaLinha.insertCell(0);
                const celulaAno = novaLinha.insertCell(1);
                const celulaCapa = novaLinha.insertCell(2);
                const celulaFaixas = novaLinha.insertCell(3);

                celulaTitulo.textContent = disco.titulo;
                celulaAno.textContent = disco.anoLancamento;
                celulaCapa.textContent = disco.capa;
                celulaFaixas.textContent = disco.faixas;
            });
        })
        .catch(error => {
            console.error('Erro ao carregar a lista de discos:', error);
        });
}

setInterval(carregarDiscos, 1000);