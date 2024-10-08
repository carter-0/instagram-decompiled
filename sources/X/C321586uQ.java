package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6uQ  reason: invalid class name and case insensitive filesystem */
public final class C321586uQ {
    public final UserSession A00;
    public final 2el A01;
    public final AnonymousClass4DU A02;
    public final 0wc A03;

    public C321586uQ(UserSession userSession, 2el r3, AnonymousClass4DU r4) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        this.A02 = r4;
        this.A00 = userSession;
        this.A01 = r3;
        this.A03 = AnonymousClass0kN.A01(r4, userSession);
    }

    public final void A00(View view, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str;
        0qQ.A0B(str9, 1);
        String str10 = str3;
        0qQ.A0B(str10, 3);
        String str11 = str6;
        0qQ.A0B(str11, 6);
        C17930ViL viL = new C17930ViL(num, str9, str2, str10, str4, str5, str11, str7, str8);
        2el r5 = this.A01;
        C60340gF r2 = C60340gF.A00;
        String A002 = viL.A00();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r4 = new C2354830a(viL, r2, A002);
        UserSession userSession = this.A00;
        0wc r3 = this.A03;
        0qQ.A0B(r3, 1);
        1Bk r22 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r22);
        r4.A00(new C15885Uk9(r3, r22, C19312WTu.A00));
        r5.A05(view, r4.A01());
    }
}
