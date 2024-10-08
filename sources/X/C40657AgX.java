package X;

import android.app.Activity;
import android.net.Uri;
import android.webkit.URLUtil;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.AgX  reason: case insensitive filesystem */
public final class C40657AgX implements C332277Ui {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ZonePolicy A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1as A04;
    public final /* synthetic */ C254743sy A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public final void D9a() {
    }

    public C40657AgX(Activity activity, ZonePolicy zonePolicy, AnonymousClass4DH r3, UserSession userSession, 1as r5, C254743sy r6, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = r5;
        this.A03 = userSession;
        this.A00 = activity;
        this.A02 = r3;
        this.A0B = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A05 = r6;
        this.A01 = zonePolicy;
    }

    public final void D9V() {
        String guessUrl;
        UserSession userSession = this.A03;
        Activity activity = this.A00;
        AnonymousClass4DH r12 = this.A02;
        0qQ.A0A(r12);
        String str = this.A0B;
        String str2 = this.A09;
        String str3 = this.A0A;
        String str4 = this.A08;
        String str5 = this.A06;
        String str6 = this.A07;
        C254743sy r14 = this.A05;
        ZonePolicy zonePolicy = this.A01;
        1Av A002 = 1Au.A00(userSession);
        boolean A1a = AnonymousClass7TG.A1a(A002, A002.A15, 1Av.A8a, 476);
        ZonePolicy zonePolicy2 = ZonePolicy.A0D;
        if (A1a) {
            if (zonePolicy != zonePolicy2) {
                1Ln A003 = C3265677h.A00(r12, userSession, r14, false, 0oI.A0A(activity), C321406u6.A06(str));
                A003.A0R("destination", "system_browser");
                A003.A0R("web_link_entry_source", str5);
                A003.A0R("viewer_session_id", str3);
                A003.A0R("message_id", str6);
                if (str2 != null) {
                    A003.A0Q("sender_id", AnonymousClass7TE.A10(str2));
                }
                A003.Cgf();
                new C39760A8a().A00(r12, userSession, str, str2, false);
            }
            0kR.A0F(activity, 0cp.A03(str));
            return;
        }
        if (zonePolicy != zonePolicy2) {
            1Ln A004 = C3265677h.A00(r12, userSession, r14, false, 0oI.A0A(activity), C321406u6.A06(str));
            A004.A0R("destination", "in_app_browser");
            A004.A0R("web_link_entry_source", str5);
            A004.A0R("viewer_session_id", str3);
            A004.A0R("message_id", str6);
            if (str2 != null) {
                A004.A0Q("sender_id", AnonymousClass7TE.A10(str2));
            }
            A004.Cgf();
            new C39760A8a().A00(r12, userSession, str, str2, false);
        }
        Uri A012 = 0cp.A01(new 1Q7("IgSecureUriParser").A00, str);
        if (A012 == null || A012.getScheme() == null) {
            guessUrl = URLUtil.guessUrl(str);
            if (guessUrl == null) {
                guessUrl = "";
            }
        } else {
            guessUrl = A012.toString();
            0qQ.A07(guessUrl);
        }
        SUL sul = new SUL(activity, userSession, 2EG.A1V, guessUrl, false);
        sul.A0E(userSession.A06);
        sul.A0F(str3);
        sul.A0S = str4;
        sul.A0r = false;
        sul.A0D = zonePolicy;
        sul.A0A();
    }
}
