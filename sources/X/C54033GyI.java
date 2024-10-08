package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.GyI  reason: case insensitive filesystem */
public final class C54033GyI extends GCG {
    public final long A00;
    public final long A01;
    public final long A02;
    public final 0wc A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C57281IVq A09;
    public final String A0A;
    public final String A0B;

    public final void Ck7(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A01);
            GCG.A03(A0e, this, this.A02);
            GCG.A04(A0e, this);
            GCG.A05(A0e, A00(this, false));
            A0e.AAJ("answer_id", str);
            C51970G9q.A1B(A0e, this.A00);
            C51969G9p.A1C(A0e, this.A06);
        }
    }

    public final void Cl2(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A01);
            GCG.A03(A0e, this, this.A02);
            GCG.A04(A0e, this);
            GCG.A05(A0e, A00(this, false));
            A0e.AAJ("answer_id", str);
            C51970G9q.A1B(A0e, this.A00);
            C51969G9p.A1C(A0e, this.A06);
        }
    }

    public final void Cis() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A01);
            GCG.A03(A0e, this, this.A02);
            GCG.A04(A0e, this);
            GCG.A05(A0e, A00(this, true));
            C51970G9q.A1B(A0e, this.A00);
            C51969G9p.A1C(A0e, this.A06);
        }
    }

    public final void Ckv(long j) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_ads_feedback_interface_timespent");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A01);
            GCG.A03(A0e, this, this.A02);
            GCG.A04(A0e, this);
            GCG.A05(A0e, A00(this, false));
            C51970G9q.A1B(A0e, this.A00);
            A0e.AAJ("client_session_id", this.A06);
            A0e.A8D("timespent", Double.valueOf(((double) j) * 0.001d));
            A0e.Cgf();
        }
    }

    public C54033GyI(AnonymousClass0iw r4, UserSession userSession, C57281IVq iVq, String str) {
        long j;
        long j2;
        Long A10;
        C51974G9v.A1P(userSession, str, r4, iVq);
        this.A08 = userSession;
        this.A06 = str;
        this.A07 = r4;
        this.A09 = iVq;
        this.A03 = C51972G9s.A0a(r4, userSession);
        1Xj r2 = iVq.A02;
        String A072 = C231122qu.A07(userSession, r2);
        if (A072 == null || (A10 = AnonymousClass7TE.A10(A072)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        this.A01 = j;
        String A0F = C231122qu.A0F(userSession, r2);
        String str2 = "";
        this.A04 = A0F == null ? str2 : A0F;
        String A2T = r2.A2T();
        this.A0A = A2T != null ? A2T : str2;
        Integer A052 = C231122qu.A05(userSession, r2);
        if (A052 != null) {
            j2 = (long) A052.intValue();
        } else {
            j2 = -1;
        }
        this.A00 = j2;
        this.A05 = AFI_TYPE.DWELL_FEED_REPETITION.A00;
        this.A0B = String.valueOf(C231122qu.A0O(userSession, r2));
        this.A02 = Long.parseLong(userSession.A06);
    }

    public static final LinkedHashMap A00(C54033GyI gyI, boolean z) {
        double d;
        double d2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (z) {
            long j = gyI.A09.A00;
            if (j != -1) {
                d2 = (double) C51966G9m.A07(j);
                d = 0.001d;
            } else {
                d = 1.0d;
                d2 = (double) j;
            }
            A1H.put("ad_dwell_time", String.valueOf(d2 * d));
        }
        A1H.put("ads_category", gyI.A0A);
        A1H.put("is_iaa_eligible", gyI.A0B);
        String Bm4 = gyI.A09.A01.Bm4();
        if (Bm4 == null) {
            Bm4 = "";
        }
        A1H.put("repetition_type", Bm4);
        return A1H;
    }
}
