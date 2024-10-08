package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.ONf  reason: case insensitive filesystem */
public final class C70833ONf {
    public final UserSession A00;
    public final MZB A01;
    public final 1Ou A02;
    public final C72186Oxv A03;
    public final OO1 A04;
    public final 2Dm A05;
    public final 1Ou A06;

    public final void A02(String str) {
        1bp r3;
        0qQ.A0B(str, 0);
        OH2 oh2 = (OH2) this.A03.A00.get(str);
        if (oh2 != null) {
            r3 = oh2.A03;
        } else {
            r3 = null;
        }
        if (r3 instanceof 1bp) {
            if (182.A06(0Tu.A05, this.A00, 36324033071492807L)) {
                1bp r2 = r3;
                r2.A01 = C69343Nji.INSTAMADILLO_STAGING;
                1Ou r1 = this.A06;
                String str2 = r2.A05;
                AnonymousClass5DE r22 = r1.A0A;
                Pair A012 = r22.A01(str2);
                if (A012 != null) {
                    r22.A02((1OS) A012.first, (C74248Prc) A012.second);
                }
            }
        }
        this.A01.A00(new NT5(r3, str));
    }

    public final void A00(TransportPayload transportPayload, C74551Pwk pwk, 1OS r20, DirectThreadKey directThreadKey, String str, String str2, String str3, long j) {
        String str4 = str;
        String str5 = str2;
        AnonymousClass7TG.A1R(str4, str5);
        long j2 = j;
        1OS r4 = r20;
        this.A01.A00(new NT7(r4, (C270214gN) null, AnonymousClass05K.A00, Long.valueOf(j2), str5, (String) null, str3));
        this.A03.A00.put(str4, new OH2(transportPayload, pwk, r4, directThreadKey, str5, j2));
    }

    public final void A01(TransportPayload transportPayload, C74551Pwk pwk, C270214gN r17, String str) {
        C270214gN r8 = r17;
        C74551Pwk pwk2 = pwk;
        AnonymousClass7TG.A1O(r8, pwk2);
        0qQ.A0B(transportPayload, 3);
        String str2 = r8.A03;
        String str3 = r8.A04;
        0KC.A0O("ArmadilloExpressSendEventListener", "Send message failed: errorCode=%s, errorMessage=%s", new Object[]{str2, str3});
        pwk2.DTM(r8, (String) null);
        String str4 = str;
        OH2 oh2 = (OH2) this.A03.A00.remove(str4);
        if (oh2 != null) {
            MZB mzb = this.A01;
            Integer num = AnonymousClass05K.A0C;
            Long valueOf = Long.valueOf(oh2.A00);
            1OS r7 = oh2.A03;
            String str5 = oh2.A04.A00;
            if (str5 != null) {
                mzb.A00(new NT7(r7, r8, num, valueOf, (String) null, str5, (String) null));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C70628ODz A002 = C70134Nxo.A00(this.A00);
        int hashCode = str4.hashCode();
        if (str3 != null) {
            A002.A00.markerAnnotate(20128010, hashCode, "error", str3);
        }
        A002.A00.markerEnd(20128010, hashCode, 3);
    }

    public C70833ONf(UserSession userSession) {
        this.A00 = userSession;
        this.A02 = 1Ou.A01(userSession);
        this.A01 = MZC.A00(userSession);
        this.A03 = C70177NyV.A00(userSession);
        this.A06 = 1Ou.A01(userSession);
        this.A05 = 2L2.A00(userSession);
        this.A04 = C70178NyW.A00(userSession);
    }
}
