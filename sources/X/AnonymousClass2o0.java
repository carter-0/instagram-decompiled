package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2o0  reason: invalid class name */
public final class AnonymousClass2o0 {
    public final FragmentActivity A00;
    public final 0wc A01;
    public final UserSession A02;
    public final C229762nz A03;
    public final C229752ny A04;
    public final String A05;

    public AnonymousClass2o0(FragmentActivity fragmentActivity, 0wc r3, UserSession userSession, C229762nz r5, C229752ny r6, String str) {
        0qQ.A0B(r5, 4);
        0qQ.A0B(str, 5);
        this.A00 = fragmentActivity;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A05 = str;
        this.A02 = userSession;
    }

    public final void A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (intValue == 7) {
            FC7.A01(this.A00, this.A02);
            return;
        }
        C229752ny r2 = this.A04;
        switch (intValue) {
            case 2:
                str = "Following_Feed";
                break;
            case 3:
                str = "Favorites_Feed";
                break;
            case 4:
                str = "Ifr_Only_Feed";
                break;
            case 5:
                str = "Fan_Club_Feed";
                break;
            case 6:
                str = "Throwback_Feed";
                break;
            default:
                str = "";
                break;
        }
        String string = this.A00.getString(AnonymousClass3VU.A00(num));
        0qQ.A07(string);
        String A012 = AnonymousClass3VU.A01(num);
        r2.A00(str, string, A012, AnonymousClass1FM.A00(), AnonymousClass3VU.A02(num), (String) null, (String) null);
        0wc r3 = this.A01;
        String str2 = this.A05;
        0Aj A002 = r3.A00(r3.A00, "instagram_feed_picker_selection");
        if (A002.isSampled()) {
            A002.AAJ("module", str2);
            A002.AAJ("detail", A012);
            A002.Cgf();
        }
    }
}
