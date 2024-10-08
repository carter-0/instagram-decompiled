package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class OZF {
    public static OZF A01;
    public static final OIv A02 = new Object();
    public final 2Dh A00;

    public final void A00(AnonymousClass5HJ r34, UserSession userSession) {
        C254783t2 r14;
        N4O n4o;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass5HJ r4 = r34;
        AnonymousClass3F2.A00().A08(r4, PushChannelType.MSYS, (String) null);
        2Db r7 = (2Db) userSession2.A01(2Db.class, new C73899Pla(userSession2, 44));
        String str = r4.A0g;
        if (str == null) {
            str = "";
        }
        Uri A09 = DbT.A09(str);
        String str2 = r4.A0X;
        0qQ.A07(str2);
        String A002 = AnonymousClass7QG.A00(A09, str2);
        if (!r7.A01(A002)) {
            return;
        }
        if (A002 != null) {
            Context context = C60960kU.A00;
            0qQ.A07(context);
            String A022 = AnonymousClass7QG.A02(userSession2.A06, A002, (String) null);
            if (A09.getBooleanQueryParameter("is_vanish_mode", false) || ((n4o = r4.A05) != null && n4o.A00())) {
                r14 = C66580MXl.A0g(A002);
            } else {
                r14 = C66580MXl.A0j((Long) null, Long.parseLong(A002));
            }
            C254783t2 r142 = r14;
            String str3 = r4.A1I;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = r4.A0r;
            0qQ.A07(str4);
            String str5 = r4.A11;
            String A023 = C66630MZz.A02(r4);
            ImageUrl imageUrl = r4.A0C;
            ImageUrl imageUrl2 = r4.A0D;
            boolean z = r4.A1U;
            PushChannelType pushChannelType = r4.A0B;
            0qQ.A07(pushChannelType);
            Long l = r4.A0L;
            String str6 = r4.A12;
            0qQ.A07(str6);
            String str7 = A002;
            2Dh.A00(context, (Drawable) null, pushChannelType, userSession2, imageUrl, imageUrl2, r142, l, A022, str7, str3, str4, "message_recieved", str5, (String) null, A023, str6, (String) null, (String) null, 0, false, false, false, z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public OZF() {
    }

    public OZF(2Dh r1) {
        this.A00 = r1;
    }
}
