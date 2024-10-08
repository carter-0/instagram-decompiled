package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;

public abstract class GY4 {
    public static final ImageUrl A00(User user) {
        SimpleImageUrl C50 = user.A03.C50();
        if (C50 == null) {
            C50 = User.A08;
        }
        String url = C50.getUrl();
        0qQ.A07(url);
        if (url.length() <= 0) {
            return user.Bh3();
        }
        return C50;
    }
}
