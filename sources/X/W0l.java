package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

public abstract class W0l {
    public static Bundle A00(Hashtag hashtag, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C66579MXk.A00(30), hashtag);
        bundle.putString(AnonymousClass000.A00(447), str);
        bundle.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", str2);
        return bundle;
    }

    public static void A03(0xI r2, Hashtag hashtag) {
        r2.A07(C298085sr.A02, hashtag.getId());
        r2.A07(C298085sr.A03, hashtag.getName());
        r2.A07(C298085sr.A01, C281965Ag.A02(hashtag));
    }

    public static Fragment A01(UserSession userSession) {
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36322718810909042L)) {
            return new C15272UZa();
        }
        return new C15381Ube();
    }

    public static Fragment A02(UserSession userSession, Hashtag hashtag, String str, String str2) {
        Fragment A01 = A01(userSession);
        A01.setArguments(A00(hashtag, str, str2));
        return A01;
    }
}
