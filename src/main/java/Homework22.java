public class Homework22 extends BaseTest {

    @Test
    public void renamedPlaylist()  {

        String newPlaylistName= "Test Pro Edited Playlist";
        String updatedPlaylisting= "Updated playlist \"Test Pro Edited Playlist.\"";

        LoginPage  loginPage =  newLginPage(driver);
        Homepage  homePage = newHomePage(driver);

        loginPage.login();
        homePage. doubleClickPlaylist();

        homePage.enterNewPlaylistName(newPlaylistName);
        Assert.assertEquals(homepage.getRenamePlaylistSuccessMessage(),UpdatedPlaylistMsg);
        }
}
