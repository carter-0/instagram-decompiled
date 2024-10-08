package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.GyJ  reason: case insensitive filesystem */
public final class C54034GyJ extends GCG {
    public final String A00;
    public final String A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final AnonymousClass0iw A05;
    public final 0wc A06;
    public final UserSession A07;
    public final C255773uh A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final void Ck7(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, this.A04);
            GCG.A05(A0e, DbY.A0q("is_product_tag_data_available", this.A09, A00(A0e, this), AnonymousClass7TE.A1L("is_social_context_data_available", this.A0A)));
            A0e.AAJ("answer_id", str);
            C51970G9q.A1B(A0e, this.A02);
            C51969G9p.A1C(A0e, this.A0B);
        }
    }

    public final void Cl2(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, this.A04);
            GCG.A05(A0e, DbY.A0q("is_product_tag_data_available", this.A09, A00(A0e, this), AnonymousClass7TE.A1L("is_social_context_data_available", this.A0A)));
            A0e.AAJ("answer_id", str);
            C51970G9q.A1B(A0e, this.A02);
            C51969G9p.A1C(A0e, this.A0B);
        }
    }

    public static 0eP A00(0Aj r2, C54034GyJ gyJ) {
        r2.AAJ("afi_type", AFI_TYPE.DWELL_STORY_SEE_MORE_LESS.A00);
        r2.AAJ("ad_tracking_token", gyJ.A01);
        return new 0eP("ads_category", gyJ.A00);
    }

    public final void Cis() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, this.A04);
            GCG.A05(A0e, DbY.A0q("is_product_tag_data_available", this.A09, A00(A0e, this), AnonymousClass7TE.A1L("is_social_context_data_available", this.A0A)));
            C51970G9q.A1B(A0e, this.A02);
            C51969G9p.A1C(A0e, this.A0B);
        }
    }

    public final void Ckv(long j) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_ads_feedback_interface_timespent");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, this.A04);
            GCG.A05(A0e, DbY.A0q("is_product_tag_data_available", this.A09, A00(A0e, this), AnonymousClass7TE.A1L("is_social_context_data_available", this.A0A)));
            C51970G9q.A1B(A0e, this.A02);
            A0e.AAJ("client_session_id", this.A0B);
            C51974G9v.A0m(A0e, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r1 == null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54034GyJ(X.AnonymousClass0iw r4, com.instagram.common.session.UserSession r5, X.C255773uh r6, java.lang.String r7, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.A07 = r5
            r3.A0B = r7
            r3.A05 = r4
            r3.A08 = r6
            X.0wc r0 = X.C51972G9s.A0a(r4, r5)
            r3.A06 = r0
            X.1Xj r2 = r6.A0b
            if (r2 == 0) goto L_0x006e
            java.lang.String r0 = X.C231122qu.A07(r5, r2)
            if (r0 == 0) goto L_0x006e
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x006e
            long r0 = r0.longValue()
        L_0x0025:
            r3.A03 = r0
            java.lang.String r0 = X.C231122qu.A06(r5, r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0030
            r0 = r1
        L_0x0030:
            r3.A01 = r0
            if (r2 == 0) goto L_0x003b
            java.lang.String r0 = r2.A2T()
            if (r0 == 0) goto L_0x003b
            r1 = r0
        L_0x003b:
            r3.A00 = r1
            r3.A02 = r8
            if (r2 == 0) goto L_0x0050
            X.1Xy r0 = r2.A0C
            X.41Z r0 = r0.BUC()
            if (r0 == 0) goto L_0x0050
            X.4hQ r1 = r0.B7C()
            r0 = 1
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A0A = r0
            java.lang.Boolean r0 = r6.A0N()
            boolean r0 = r0.booleanValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A09 = r0
            java.lang.String r0 = r5.A06
            long r0 = java.lang.Long.parseLong(r0)
            r3.A04 = r0
            return
        L_0x006e:
            r0 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54034GyJ.<init>(X.0iw, com.instagram.common.session.UserSession, X.3uh, java.lang.String, long):void");
    }
}
