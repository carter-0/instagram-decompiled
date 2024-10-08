package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class FT5 implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public FT5(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A05 = z;
    }

    public final Object apply(Object obj) {
        String str;
        Object obj2 = obj;
        int i = this.A00;
        Context context = (Context) this.A01;
        if (i != 0) {
            1Xj r3 = (1Xj) this.A02;
            UserSession userSession = (UserSession) this.A03;
            AnonymousClass0iw r10 = (AnonymousClass0iw) this.A04;
            boolean z = this.A05;
            String str2 = (String) obj2;
            Resources resources = context.getResources();
            int i2 = 2131970998;
            if (r3.A5G()) {
                i2 = 2131971000;
            }
            String string = resources.getString(i2);
            String format = new SimpleDateFormat(AnonymousClass000.A00(61)).format(new Date(r3.A1A() * 1000));
            int i3 = 2131971003;
            if (r3.A5G()) {
                i3 = 2131971005;
            }
            String A0e = AnonymousClass7TF.A0e(resources, format, i3);
            User CCd = r3.A0C.CCd();
            if (CCd == null || 0mp.A0B(CCd.getUsername())) {
                str = null;
            } else {
                str = AnonymousClass7TF.A0e(resources, 002.A0R("@", CCd.getUsername()), 2131970991);
            }
            String A30 = r3.A30();
            Locale locale = Locale.ROOT;
            new LT3(context, r10, userSession, new C50998Fml(r10, userSession, r3, str2, 1, z), str2, A30, string, A0e.toUpperCase(locale), str.toUpperCase(locale), false).A04();
            return null;
        }
        UserSession userSession2 = (UserSession) this.A02;
        AnonymousClass0iw r32 = (AnonymousClass0iw) this.A03;
        Hashtag hashtag = (Hashtag) this.A04;
        String str3 = (String) obj2;
        Context context2 = context;
        AnonymousClass0iw r16 = r32;
        UserSession userSession3 = userSession2;
        new LT3(context2, r16, userSession3, new C50998Fml(r32, userSession2, hashtag, str3, 3, this.A05), str3, hashtag.getId(), context.getResources().getString(2131970995), 002.A0R("#", hashtag.getName().toUpperCase(Locale.ROOT)), (String) null, false).A04();
        return null;
    }
}
