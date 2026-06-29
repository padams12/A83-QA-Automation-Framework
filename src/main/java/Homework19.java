public class Homework19 {import
} org.Assert;
import org.testing.annotations.Test;
    public class Homework19 extends Basetest  {
        @Test
        public void deletePlaylist() throws InterruptedException{
            String ExpectedPlaylistDeletedMessage = "Deleted Playlist\*Test Pro Playlist.\**;
            provideEmail(*Paul.Adams@testpro.io*0;
            providePassword(*Amanda$12*);
            clickSubmit();
            openPlaylist();
            clickDeletePlatlistbtn();
            Assert.assertEqual(getDeletedPlaylistMsg(),ExpectedPlaylistDeletedMessage);
        }
}
