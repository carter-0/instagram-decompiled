package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;

public abstract class O1A {
    public static final C68137N2b A00(GifUrlImpl gifUrlImpl, String str, String str2) {
        DirectAnimatedMediaUser directAnimatedMediaUser;
        if (str2 != null) {
            directAnimatedMediaUser = new DirectAnimatedMediaUser(str2, true);
        } else {
            directAnimatedMediaUser = null;
        }
        return new C68137N2b(new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, false, (Boolean) null, str, false), new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, (Boolean) null, (Boolean) null, str, false), false);
    }
}
