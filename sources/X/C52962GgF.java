package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgF  reason: case insensitive filesystem */
public final class C52962GgF extends C361478gI {
    public final UserSession A00;
    public final C56510Hzh A01;
    public final C56605I4e A02;
    public final C362088hK A03;
    public final 1Av A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08 = ((C54436HDl) this.A05.getValue()).A05;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52962GgF(Application application, UserSession userSession, C56605I4e i4e, C362088hK r11, String str, boolean z, boolean z2) {
        super(application);
        C54632HLp hLp;
        C351838Ap r4 = new C351838Ap(userSession);
        C54441HDu hDu = new C54441HDu(userSession);
        0qQ.A0B(userSession, 0);
        C56510Hzh hzh = (C56510Hzh) userSession.A01(C56510Hzh.class, new C58678Ivn(userSession, 30));
        AnonymousClass7TG.A1O(application, userSession);
        AnonymousClass7TG.A1S(r11, i4e);
        0qQ.A0B(hzh, 8);
        this.A00 = userSession;
        this.A03 = r11;
        this.A02 = i4e;
        this.A01 = hzh;
        this.A0B = z;
        this.A0A = z2;
        this.A05 = C58717IwQ.A00(r4, new AnonymousClass8ZA(r4.A00), 11);
        this.A06 = C58717IwQ.A00(hDu, new AnonymousClass8ZA(hDu.A00), 12);
        this.A04 = 1Au.A00(userSession);
        C56510Hzh hzh2 = this.A01;
        C362088hK r6 = this.A03;
        C56026HrY hrY = hzh2.A02;
        1Av r42 = hrY.A00;
        0s0 r1 = r42.A3t;
        AnonymousClass0YZ[] r2 = 1Av.A8a;
        if (AnonymousClass7TG.A1a(r42, r1, r2, 460) || AnonymousClass7TG.A1a(r42, r42.A3u, r2, 461) || hrY.A01(r6)) {
            C362088hK r22 = this.A03;
            if (r22 != C362088hK.A0A) {
                1Av r0 = this.A04;
                if (r0.A01.getInt(1Av.A00(r22), 0) < 3 && (r22 != C362088hK.A09 || !this.A0A)) {
                    hLp = C54632HLp.TOOL_NUX;
                }
            }
            if (this.A0B) {
                hLp = C54632HLp.TOPIC_EDIT;
            } else {
                hLp = C54632HLp.TOOL;
            }
        } else {
            hLp = C54632HLp.DISCLOSURE_NUX;
        }
        02z A10 = DbS.A10(new JV5(r11, hLp, 182.A06(0Tu.A05, userSession, 36319918494981884L)));
        this.A07 = A10;
        this.A09 = A10;
        C54436HDl hDl = (C54436HDl) this.A05.getValue();
        hDl.A00 = r11;
        I12 i12 = C54436HDl.A00(hDl).A01;
        if (i12 != null) {
            hDl.A05(i12);
        }
        ((HDW) this.A06.getValue()).A00.Epw(str);
    }

    public final void A0E(String str, boolean z) {
        Object value;
        C54632HLp hLp;
        C362088hK r3;
        boolean z2;
        this.A02.A00.A04 = str;
        ((HDW) this.A06.getValue()).A00.Epw(str);
        05G r5 = this.A07;
        do {
            value = r5.getValue();
            JV5 jv5 = (JV5) value;
            if (z) {
                hLp = C54632HLp.TOOL;
            } else {
                hLp = (C54632HLp) jv5.A03;
            }
            r3 = (C362088hK) jv5.A00;
            z2 = jv5.A01;
            AnonymousClass7TG.A1N(r3, hLp);
        } while (!r5.AIY(value, new JV5(r3, hLp, z2)));
    }
}
