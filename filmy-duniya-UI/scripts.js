const app = document.getElementById("root");

const logo = document.createElement("img");
logo.src = "logo.png";

const container = document.createElement("div");
container.setAttribute("class", "container");

app.appendChild(logo);
app.appendChild(container);

var request = new XMLHttpRequest();
request.open("GET", "http://localhost:8080/api/movies", true);
request.onload = function () {
  // Begin accessing JSON data here
  var data = JSON.parse(this.response);
  if (request.status >= 200 && request.status < 400) {
    data.forEach((movie) => {
      const card = document.createElement("div");
      card.setAttribute("class", "card");
      //	  card.addEventListener('click', handleClick);
      card.movieData = movie;

      const movieTitle = document.createElement("h1");
      movieTitle.textContent = movie.name;

      const movieCast = document.createElement("p");
      movieCast.textContent = `Cast:- ${movie.cast}`;

      const movieReleaseDate = document.createElement("p");
      movieReleaseDate.textContent = `Release Date:- ${movie.releaseDate}`;

      const movieRating = document.createElement("p");
      movieRating.textContent = `Rating:- ${movie.rating}`;

      const movieType = document.createElement("p");
      movieType.textContent = `Type:- ${movie.type}`;

      container.appendChild(card);
      card.appendChild(movieTitle);
      card.appendChild(movieCast);
      card.appendChild(movieReleaseDate);
      card.appendChild(movieRating);
      card.appendChild(movieType);
    });
  } else {
    const errorMessage = document.createElement("marquee");
    errorMessage.textContent = `Ops.., it's not working!`;
    app.appendChild(errorMessage);
  }
};

request.send();
