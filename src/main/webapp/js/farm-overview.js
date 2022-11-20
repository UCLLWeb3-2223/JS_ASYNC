const fetchAnimals = async () => {
    const response =  await fetch("http://localhost:8080/Controller?command=Overview")
    const farm = await response.json()
    return farm
}

const renderAnimals = (farm) => {
    const id = "animals"
    clearElement(id)
    farm.forEach((animal) => {
        const p = document.createElement("p")
        const text = document.createTextNode(`${animal.name} 
                   is een ${animal.type.toLocaleLowerCase()} van 
                   ${animal.age} jaar oud.`)
        p.appendChild(text)
        document.getElementById(id).appendChild(p)
    })
}

const fetchAndRenderAnimals = async () => {
    const animals = await fetchAnimals()
    renderAnimals(animals)
}

setInterval(fetchAndRenderAnimals, 1000)