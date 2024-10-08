package X;

import android.content.Context;
import java.util.ArrayList;

public final class E9I extends 2Ru implements C231272rL {
    public final C47617EAd A00;
    public final ArrayList A01 = AnonymousClass7TE.A1C();
    public final Context A02;
    public final C46437Dez A03;
    public final C229122ms A04;
    public final C231762sK A05;
    public final G82 A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public E9I(Context context, AnonymousClass0iw r6, C229122ms r7, G82 g82, String str, boolean z, boolean z2, boolean z3) {
        super(false);
        this.A02 = context;
        this.A07 = str;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = g82;
        this.A04 = r7;
        C46437Dez dez = new C46437Dez(context);
        this.A03 = dez;
        C47617EAd eAd = new C47617EAd(r6, g82, false, z3);
        this.A00 = eAd;
        C231762sK r0 = new C231762sK(context);
        this.A05 = r0;
        init(new C231642s0[]{dez, eAd, r0});
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r9.A08 == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.E9I r9) {
        /*
            r9.clear()
            java.util.ArrayList r1 = r9.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x001d
            android.content.Context r1 = r9.A02
            r0 = 2131968382(0x7f13417e, float:1.9573657E38)
            java.lang.String r1 = r1.getString(r0)
            X.Dez r0 = r9.A03
        L_0x0016:
            r9.addModel(r1, r0)
        L_0x0019:
            r9.updateListView()
            return
        L_0x001d:
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r1)
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r4 = X.AnonymousClass7TF.A0a(r2)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r1 = r9.A07
            java.lang.String r0 = "BATCH_MANAGE_NON_RECIP_FOLLOWERS"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r6 = r4.getUsername()
            java.lang.String r1 = r4.B8Q()
            r7 = 0
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x004f
            X.4Cl r0 = r4.A03
            java.lang.String r7 = r0.Bgn()
            boolean r0 = r9.A08
            r5 = r1
            if (r0 != 0) goto L_0x0051
        L_0x004f:
            r5 = r6
            r6 = r1
        L_0x0051:
            r8 = 0
        L_0x0052:
            X.F06 r3 = new X.F06
            r3.<init>(r4, r5, r6, r7, r8)
            X.EAd r0 = r9.A00
            r9.addModel(r3, r0)
            goto L_0x0021
        L_0x005d:
            X.G82 r0 = r9.A06
            boolean r8 = r0.CZf(r4)
            java.lang.String r5 = r4.getUsername()
            java.lang.String r6 = r4.getFullName()
            java.lang.String r7 = X.DbS.A0o(r4)
            goto L_0x0052
        L_0x0070:
            X.2ms r1 = r9.A04
            if (r1 == 0) goto L_0x0019
            boolean r0 = r1.CKB()
            if (r0 == 0) goto L_0x0019
            X.2sK r0 = r9.A05
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9I.A00(X.E9I):void");
    }
}
