package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.65X  reason: invalid class name */
public final class AnonymousClass65X {
    public final Context A00;
    public final AnonymousClass65N A01;
    public final AnonymousClass65Y A02;

    public AnonymousClass65X(AnonymousClass65N r3) {
        AnonymousClass65Y r1 = new AnonymousClass65Y(C60960kU.A00);
        Context applicationContext = C60960kU.A00.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A02 = r1;
        this.A00 = applicationContext;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.5ER, java.lang.Object] */
    public static final AnonymousClass5HJ A00(UserSession userSession, ImageUrl imageUrl, AnonymousClass65X r20, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, long j) {
        String str9;
        String A0R;
        String str10;
        String str11 = str3;
        String str12 = str;
        String str13 = str12;
        AnonymousClass65X r6 = r20;
        String str14 = str2;
        if (str == null) {
            if (str2 == null) {
                0wb.A04("notification_senderName_null", "No group notification should be rendered", 1);
                str13 = "";
            } else {
                str13 = r6.A00.getString(2131963993, new Object[]{str14});
                0qQ.A07(str13);
            }
        }
        if (str3 == null) {
            0wb.A04("armadillo_notification_message_null", "No group notification should be rendered", 1);
            str11 = "";
        }
        int i3 = i2;
        String A012 = r6.A02.A01(l, (Long) null, String.valueOf(j), i3, true, false);
        String str15 = str4;
        if (i3 != 2) {
            if (i3 != 13) {
                str9 = "direct_v2_message";
            } else {
                str9 = AnonymousClass000.A00(590);
            }
            A0R = str15;
        } else {
            str9 = "direct_v2_delete_item";
            A0R = 002.A0R(str15, "_unsend");
        }
        if (i == 18) {
            str10 = AnonymousClass000.A00(1284);
        } else {
            str10 = "direct_v2_text";
        }
        AnonymousClass5HJ r62 = new AnonymousClass5HJ(new Object(), imageUrl, false, (Boolean) null, true, str13, str11, A012, str9, A0R, str10, userSession.A06, str15, (String) null, str7, str8);
        r62.A0u = str6;
        if (i3 == 13) {
            r62.A1N = true;
        }
        r62.A1A = str5;
        r62.A19 = str14;
        r62.A0b = str12;
        C70414O5r o5r = new C70414O5r();
        o5r.A00 = true;
        r62.A09 = new C71943OtU(o5r);
        r62.A0c = String.valueOf(1);
        return r62;
    }
}
