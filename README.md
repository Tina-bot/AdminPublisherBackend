![tumblr_8c0bef384157f513e6600226f24d20bb_eee3361d_2048](https://github.com/Tina-bot/AdminPublisherBackend/assets/72955349/e306a4c8-7c12-4192-8adb-f96b5a5e994e)

# AdminPublisherBackend 🎮
![](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)


>> Backend of my crud project, using Spring Boot and MySQL,
>> Pretending to be the administration page of a Publisher
>> Here the Frontend part -> <a href="https://github.com/Tina-bot/AdminPublisherFrontend"> AdminPublisherFrontend </a>


## What does this? 👀
Receives requests from the frontend to create, edit and delete games to the MySQL database.

<i>As the database is hosted on localhost and not on the web, I leave screenshots below to show how it looks with data</i>
## Screenshots 📷

![Screenshot_13](https://github.com/Tina-bot/AdminPublisherBackend/assets/72955349/edccb585-eba1-4e88-9965-17316c09a6bd)


## I want to test it 🔬
You can download it, the backend is already prepared to create everything, but eliminate the method of creating the automatic database due to some problems that it generated already having it,
it is solved in _application.properties_ by changing `spring.jpa.hibernate.ddl-auto = update` to  `spring. jpa.hibernate.ddl-auto = create`

![tumblr_8c0bef384157f513e6600226f24d20bb_eee3361d_2048](https://github.com/Tina-bot/AdminPublisherBackend/assets/72955349/185cc981-9ad4-4a2d-8bed-fc712c3b99ef)
