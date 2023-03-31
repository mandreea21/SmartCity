const earthquake = async () => {
    const response = await fetch('http://localhost:8081/cutremur');
    const data = await response.json();
    const tmpObj = JSON.parse(JSON.stringify(data));
    return tmpObj;
}

export {earthquake};