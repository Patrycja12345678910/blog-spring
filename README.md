# Laboratorium 2 - aplikacja blogowa (Spring Boot)


## Opis projektu:

**Celem laboratorium było stworzenie prostej aplikacji blogowej oraz opanowanie pracy na gałęziach (Feature Branch Workflow) w systemie Git. Wykorzystałam framework Spring Boot oraz język Kotlin.
Aplikacja umożliwia tworzenie, wyświetlanie oraz przeglądanie wpisów blogowych.**

## Funkcjonalności:

* wyświetlanie listy postów
* podgląd szczegółów posta
* dodawanie nowych postów
* zapis danych w bazie H2


## Technologie:

* Kotlin
* Spring Boot
* Spring Data JPA
* Thymeleaf
* H2 Database
* Maven

## Struktura projektu:

* model - encja Post
* repository - dostęp do bazy danych
* conroller - obsługa żądań HTTP
* templates - widoki Thymeleaf
* static - style CSS


Uruchomienie aplikacji:

`.\mvnw spring-boot:run`

Po uruchomieniu aplikacja będzie dostępna pod adresem:

`http://localhost:8081/`

## Endpointy:

* / - lista postów
* /post/{id} - szczegóły posta
* /create - formularz dodawania posta