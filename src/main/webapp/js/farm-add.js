const handleAddAnimal = async () => {
  const name = document.getElementById("name").value
  const type = document.getElementById("type").value
  const age = document.getElementById("age").value

  const animal = { name, type, age }

  await fetch("http://localhost:8080/Controller?command=Add", {
      method: "POST",
      headers: {
        // Accept Header tells the API that it is expecting the response in the specified media type e.g. application/json
        Accept: "application/json",
        // Content-Type tells the API about the media type of the request being sent in the request body e.g. application/json
        "Content-Type": "application/json",
      },
      body: JSON.stringify(animal),
    })
}

document
    .getElementById("add-animal-form")
    .addEventListener("submit", (event) => {
      event.preventDefault()
      handleAddAnimal()
    })
