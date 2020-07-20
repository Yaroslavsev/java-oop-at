package ru.geekbrains.example.junit.annotations;

import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;

@DisplayName("Примеры аннотаций")
class AnnotationsExamples {

    @DisplayName("Тест аннотаций")
    @Test
    void annotationTest(){
        System.out.println("Тест");
    }

    @BeforeEach
    void annotationBeforeEach(){
        System.out.println("Запускается ПЕРЕД каждым тестом");
    }

    @AfterEach
    void annotationAfterEach(){
        System.out.println("Запускается ПОСЛЕ каждого теста");
    }

    @BeforeAll
    static void annotationBeforeAllBeforeAll(){
        System.out.println("Запускается ОДИН раз ПЕРЕД всеми тестами");
    }

    @AfterAll
    static void annotationAfterAllAfterAll(){
        System.out.println("Запускается ОДИН раз ПОСЛЕ всех тестов");
    }

    @Disabled
    @DisplayName("Пропускаемы тест аннотаций")
    @Test
    void disabledTest() {
        System.out.println("Тест будет пропускаться");
    }

    @Timeout(value = 3)
    @Test
    void timeOutTest() throws InterruptedException{
        sleep(2000);
        System.out.println("Задаёт время на выполнение теста");
    }

    @RepeatedTest(value = 3)
    void repeatTest() {
        System.out.println("Задаёт количество повторений теста");
    }
}
