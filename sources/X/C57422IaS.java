package X;

import android.content.Context;

/* renamed from: X.IaS  reason: case insensitive filesystem */
public final class C57422IaS implements C311686d5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ C314786iq A03;
    public final /* synthetic */ String A04;

    public C57422IaS(Context context, AnonymousClass0iw r2, C314786iq r3, String str, int i) {
        this.A03 = r3;
        this.A01 = context;
        this.A04 = str;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void DYA() {
        C314786iq r1 = this.A03;
        if (!r1.A01) {
            r1.A06.EHd();
        } else {
            r1.A01 = false;
        }
    }

    public final void DYB() {
        C314786iq r3 = this.A03;
        C255773uh Au5 = r3.A06.Au5();
        if (Au5 == null || !Au5.A1V()) {
            C275794rx r0 = r3.A00;
            if (r0 != null) {
                r0.A03(true);
            }
            r3.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r1 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick() {
        /*
            r9 = this;
            X.6iq r2 = r9.A03
            X.4mU r1 = r2.A06
            X.3uh r0 = r1.Au5()
            r3 = 1
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r0.A1V()
            if (r0 != r3) goto L_0x00cd
            X.3uh r7 = r1.Au5()
            if (r7 == 0) goto L_0x00cd
            java.lang.String r1 = r9.A04
            X.0iw r6 = r9.A02
            int r8 = r9.A00
            r2.A01 = r3
            com.instagram.common.session.UserSession r5 = r2.A04
            android.app.Activity r4 = r2.A02
            X.DbS.A1X(r4)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.String r0 = "barcelona://media?id="
            java.lang.String r2 = X.002.A0R(r0, r1)
            java.lang.String r1 = "tisu"
            r0 = 0
            X.C49965FGy.A04(r4, r5, r2, r1, r0)
            X.0wc r1 = X.AnonymousClass0kN.A01(r6, r5)
            java.lang.String r0 = "ig_threads_in_stories_unit_post_tap"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.4gD r6 = r7.A0D
            r0 = 21
            java.lang.String r5 = X.C273654mx.A00(r0)
            X.17k.A07(r6, r5)
            r7 = 0
            if (r6 == 0) goto L_0x00ce
            X.3IS r0 = r6.A00
            java.util.List r0 = r0.BPz()
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x00ce
            java.lang.String r3 = "three_media"
        L_0x005c:
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "ig_threads_in_stories_unit"
            X.DbS.A1O(r4, r0)
            X.17k.A07(r6, r5)
            if (r6 == 0) goto L_0x00d1
            X.3IS r1 = r6.A00
            java.util.List r0 = r1.BPz()
            if (r0 == 0) goto L_0x00d1
            X.1Xj r0 = X.DbZ.A0T(r0, r8)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x00d1
            r2 = 10
            java.lang.Long r0 = X.00y.A0n(r2, r0)
            if (r0 == 0) goto L_0x00d1
            X.C51965G9l.A1E(r4, r0)
            X.17k.A07(r6, r5)
            java.util.List r0 = r1.BPz()
            if (r0 == 0) goto L_0x0098
            int r7 = r0.size()
        L_0x0098:
            X.C51969G9p.A17(r4, r7)
            X.C51969G9p.A16(r4, r8)
            X.DbY.A1C(r4)
            X.17k.A07(r6, r5)
            java.lang.String r0 = r1.Bir()
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = ""
        L_0x00ac:
            java.lang.Long r1 = X.00y.A0n(r2, r0)
            java.lang.String r0 = "quick_promotion_id"
            r4.A9F(r0, r1)
            X.17k.A07(r6, r5)
            java.lang.String r0 = r6.getId()
            java.lang.Long r1 = X.00y.A0n(r2, r0)
            java.lang.String r0 = "netego_id"
            r4.A9F(r0, r1)
            java.lang.String r0 = "displayed_card_type"
            r4.AAJ(r0, r3)
            r4.Cgf()
        L_0x00cd:
            return
        L_0x00ce:
            java.lang.String r3 = "one_media"
            goto L_0x005c
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57422IaS.onClick():void");
    }
}
