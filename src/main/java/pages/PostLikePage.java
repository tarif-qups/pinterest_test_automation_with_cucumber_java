package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostLikePage {
    WebDriver driver;

    private By likeIcon = By.xpath("//div[@aria-label=\"reaction\"]");
    private By reactionCount = By.xpath("//div[@class=\"tBJ dyH iFc sAJ O2T zDA IZT swG\"]");

    public PostLikePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLickIcon(){
        driver.findElement(likeIcon).click();
    }

    public String getReactionCount(){
        return driver.findElement(reactionCount).getText();
    }
}
