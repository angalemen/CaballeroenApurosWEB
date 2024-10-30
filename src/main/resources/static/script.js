const apiUrl = 'https://tu-url-de-railway.app'; // tengo que añadir aqui mi direccin render pero ahora no funciona

async function fetchData() {
    try {
        const response = await fetch(`${apiUrl}/data`);
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error fetching data:', error);
    }
}

fetchData();

async function sendData(newData) {
    try {
        const response = await fetch(`${apiUrl}/data`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newData)
        });
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error sending data:', error);
    }
}
