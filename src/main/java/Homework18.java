


public class Homework18 extends BaseTest  {
    @Test
    public void playSong() {
        provideEmail("Paul.Adams@testpro.io");
        providePassword("Amanda$12");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }

    public void clickPlay() {
        WebElement playNextButton = driver.findElement(By.xpath(xpathExpression:"//i[@data-testid='play-next-btn']"));
        WebElement playButton = driver.findElement(By.xpath(xpathExpression:"//span[@data-testid= 'play-btn']"));
        playNextButton.click();
        playButton.click();
    }
    public boolean is SongPlaying();    {
        WebElement  soundBar = driver.findElement(By.xpath(xpathExpression "//div[@data-testid='sound-bar-play']"));
        return soundBar.isDisplayed();

    }
}mework18 {
}
