# Проект автоматизации тестирования сайта Geekbrains.ru

Данный учебный проект создан в рамках курса "ООП в Java" образовательного портала Geekbrains

Автотесты написаны для сайта https://geekbrains.ru/


## Используемые фреймворки и бибилиотеки

  - [Maven](https://maven.apache.org/)
  - [Selenium](https://www.selenium.dev/)
  - [JUnit](https://junit.org/junit5/)
  - [Hamcrest](http://hamcrest.org/)
  - [Allure](http://allure.qatools.ru/)
  - [AspectJ](https://www.eclipse.org/aspectj/)
  - [Lombok](https://projectlombok.org/)

## Сборка проекта и полуение отчёта

Удаление всех созданных в процессе сборки артефактов: .class, .jar и др. файлов.
В простейшем случае результат — просто удаление каталога target:

    mvn clean

Тестирование с помощью JUnit тестов:

    mvn test
    
Вывод отчёта через фреймворк Allure:

    allure:serve

В случае последовательного использования команд:
    
    mvn clean test allure:serve

## Автор

  - **Ярославцев Антон** - *Автор проекта*


