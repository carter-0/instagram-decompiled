package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.HrC  reason: case insensitive filesystem */
public final class C56006HrC {
    public C55483HiR A00;
    public C59621JQp A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04 = false;
    public final UserSession A05;
    public final JQF A06;
    public final C324356z9 A07;
    public final AnonymousClass4DU A08;
    public final HashMap A09;

    public final void A00(C231312rP r6) {
        1NY Bn7 = this.A06.Bn7(r6);
        HashMap hashMap = this.A09;
        if (hashMap != null) {
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                C51974G9v.A1C(Bn7, A0s);
            }
        }
        C324356z9 r4 = this.A07;
        C3724090s.A06(Bn7, r4.A03.A07);
        1OC A0M = Bn7.A0M();
        C59621JQp jQp = this.A01;
        jQp.getClass();
        r4.A03(A0M, new C54379HAu(2, this, jQp));
    }

    public C56006HrC(Context context, AnonymousClass07i r8, UserSession userSession, JQF jqf, AnonymousClass4DU r11, String str, HashMap hashMap, boolean z) {
        this.A05 = userSession;
        this.A08 = r11;
        this.A06 = jqf;
        this.A09 = hashMap;
        this.A03 = z;
        this.A00 = new C55483HiR(userSession);
        this.A07 = new C324356z9(context, r8, userSession, str, true);
    }
}
