package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.P2f  reason: case insensitive filesystem */
public final class C72340P2f implements C74394PuA {
    public C46448DfA A00;
    public final Context A01;
    public final UserSession A02;
    public final N4P A03;
    public final C67350MmR A04;

    public C72340P2f(Context context, UserSession userSession, N4P n4p, C67350MmR mmR) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = n4p;
        this.A04 = mmR;
    }

    public final boolean isEnabled() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r3 = r7.A01;
        r1.A0G = r3.getString(2131958948);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (X.FFK.A03(r5, X.C71123OdH.A00(r5, r4), r2) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r2 == X.C67350MmR.ADMINS_AND_MODERATORS) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r2 == X.C67350MmR.COLLABORATOR) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r1 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r0 = com.instagram.android.R.attr.igds_color_secondary_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r1.A00 = X.AnonymousClass7TF.A03(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r1 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        r0 = com.instagram.android.R.attr.igds_color_primary_button;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r3.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if (r0.A0D == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r3 = new X.C46448DfA(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r7.A00 = r3;
        r5 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (X.C69949Nup.A00(r5, r4, r2) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 == null) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r7 = this;
            X.N4P r4 = r7.A03
            int r1 = r4.A09
            java.lang.String r6 = "headerItem"
            r0 = 29
            if (r1 != r0) goto L_0x00ae
            X.MmR r2 = r7.A04
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x0069;
                case 2: goto L_0x008c;
                case 3: goto L_0x009f;
                case 4: goto L_0x00a4;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = 2131958919(0x7f131c87, float:1.9554464E38)
        L_0x0016:
            X.DfA r3 = new X.DfA
            r3.<init>((int) r0)
        L_0x001b:
            r7.A00 = r3
            com.instagram.common.session.UserSession r5 = r7.A02
            boolean r0 = X.C69949Nup.A00(r5, r4, r2)
            if (r0 == 0) goto L_0x0053
            X.DfA r1 = r7.A00
            if (r1 == 0) goto L_0x00f6
            android.content.Context r3 = r7.A01
            r0 = 2131958948(0x7f131ca4, float:1.9554523E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0G = r0
            X.Dri r0 = X.C71123OdH.A00(r5, r4)
            boolean r0 = X.FFK.A03(r5, r0, r2)
            if (r0 != 0) goto L_0x0061
            X.MmR r0 = X.C67350MmR.ADMINS_AND_MODERATORS
            if (r2 == r0) goto L_0x0061
            X.MmR r0 = X.C67350MmR.COLLABORATOR
            if (r2 == r0) goto L_0x0061
            X.DfA r1 = r7.A00
            if (r1 == 0) goto L_0x00f6
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x004d:
            int r0 = X.AnonymousClass7TF.A03(r3, r0)
            r1.A00 = r0
        L_0x0053:
            X.DfA r1 = r7.A00
            if (r1 == 0) goto L_0x00f6
            X.O8d r0 = new X.O8d
            r0.<init>(r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            return r0
        L_0x0061:
            X.DfA r1 = r7.A00
            if (r1 == 0) goto L_0x00f6
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            goto L_0x004d
        L_0x0069:
            r0 = 2131958926(0x7f131c8e, float:1.9554478E38)
            X.DfA r3 = new X.DfA
            r3.<init>((int) r0)
            X.MmR r1 = X.C67350MmR.ADMINS_AND_MODERATORS
            r3.A0C = r1
            com.instagram.common.session.UserSession r0 = r7.A02
            boolean r0 = X.C69949Nup.A00(r0, r4, r1)
            if (r0 == 0) goto L_0x0088
            android.content.Context r1 = r7.A01
            r0 = 2131958941(0x7f131c9d, float:1.9554508E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0H = r0
        L_0x0088:
            r0 = 2131440242(0x7f0b3272, float:1.8502462E38)
            goto L_0x009b
        L_0x008c:
            r0 = 2131958933(0x7f131c95, float:1.9554492E38)
            X.DfA r3 = new X.DfA
            r3.<init>((int) r0)
            X.MmR r0 = X.C67350MmR.COLLABORATOR
            r3.A0C = r0
            r0 = 2131440241(0x7f0b3271, float:1.850246E38)
        L_0x009b:
            r3.A01 = r0
            goto L_0x001b
        L_0x009f:
            r0 = 2131958922(0x7f131c8a, float:1.955447E38)
            goto L_0x0016
        L_0x00a4:
            r0 = 2131958921(0x7f131c89, float:1.9554468E38)
            goto L_0x0016
        L_0x00a9:
            r0 = 2131958947(0x7f131ca3, float:1.955452E38)
            goto L_0x0016
        L_0x00ae:
            com.instagram.common.session.UserSession r3 = r7.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326889224157230(0x810f1d0000382e, double:3.036609249774402E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ed
            X.N9q r0 = r4.A07()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0.A0D
            r1 = 1
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            X.0eM r0 = r4.A0a
            java.util.List r0 = X.JTO.A15(r0)
            int r0 = r0.size()
            if (r1 != 0) goto L_0x00d7
            int r0 = r0 + 1
        L_0x00d7:
            android.content.Context r2 = r7.A01
            r1 = 2131959729(0x7f131fb1, float:1.9556107E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            X.DfA r1 = new X.DfA
            r1.<init>((java.lang.CharSequence) r0)
        L_0x00e9:
            r7.A00 = r1
            goto L_0x0053
        L_0x00ed:
            r0 = 2131959728(0x7f131fb0, float:1.9556105E38)
            X.DfA r1 = new X.DfA
            r1.<init>((int) r0)
            goto L_0x00e9
        L_0x00f6:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72340P2f.getItems():java.util.List");
    }
}
