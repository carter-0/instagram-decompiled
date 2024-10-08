package X;

import android.os.SystemClock;
import android.webkit.URLUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;

/* renamed from: X.4AM  reason: invalid class name */
public final class AnonymousClass4AM implements AnonymousClass4AN {
    public final UserSession A00;
    public final HashMap A01 = new HashMap();

    public AnonymousClass4AM(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final ImageUrl E6y(AnonymousClass48P r11) {
        C66943Mfc mfc;
        0qQ.A0B(r11, 0);
        if (182.A06(0Tu.A05, this.A00, 36330471226884749L)) {
            String str = r11.A01;
            HashMap hashMap = this.A01;
            C66943Mfc mfc2 = (C66943Mfc) hashMap.get(str);
            if (mfc2 != null) {
                if (SystemClock.elapsedRealtime() > mfc2.A00) {
                    SystemClock.elapsedRealtime();
                } else {
                    ImageUrl imageUrl = mfc2.A01;
                    String url = imageUrl.getUrl();
                    ImageUrl imageUrl2 = r11.A00;
                    String url2 = imageUrl2.getUrl();
                    if (!0qQ.A0K(url, url2)) {
                        String guessFileName = URLUtil.guessFileName(url2, (String) null, (String) null);
                        Object value = mfc2.A02.getValue();
                        0qQ.A07(value);
                        if (value.equals(guessFileName)) {
                            return imageUrl;
                        }
                        mfc = new C66943Mfc(imageUrl2, guessFileName);
                        hashMap.put(str, mfc);
                    }
                }
            }
            mfc = new C66943Mfc(r11.A00, (String) null);
            hashMap.put(str, mfc);
        }
        return r11.A00;
    }
}
