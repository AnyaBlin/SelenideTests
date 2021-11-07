package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchWikiGithub {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;

    }

    @Test
    void searchSoftAssertions() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".markdown-body").shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension"));

    }
}
