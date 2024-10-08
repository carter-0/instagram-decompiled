package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.MaX  reason: case insensitive filesystem */
public final class C66664MaX {
    public final Context A00;
    public final Fragment A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final McQ A04;

    private final void A00(DialogInterface.OnClickListener onClickListener, C74385Pu1 pu1, AnonymousClass2Ep r18, User user, String str, String str2, String str3, boolean z) {
        McQ mcQ = this.A04;
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131960220);
        User user2 = user;
        int i = 2131960219;
        if (user2.CXO()) {
            i = 2131960229;
        }
        String A0c = DbY.A0c(context, str, i);
        C74385Pu1 pu12 = pu1;
        C49997FIg fIg = new C49997FIg(0, pu12, r18, this, user2, z);
        String A162 = AnonymousClass7TE.A16(context, 2131954722);
        C71249OgE A002 = C71249OgE.A00(pu12, 13);
        C358248ab A0g = DbX.A0g(mcQ.A00, str3, str2);
        A0g.A0s(false);
        A0g.A0r(true);
        A0g.A0W(fIg, C358278ae.RED_BOLD, A0c, true);
        A0g.A0b(A002, A162);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        if (onClickListener != null) {
            A0g.A0Y(onClickListener2, C358278ae.BLUE_BOLD, A16, true);
        }
        DbT.A1V(A0g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (X.0qQ.A0K(r1, "UNKNOWN") != false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C74385Pu1 r20, X.AnonymousClass2Ep r21) {
        /*
            r19 = this;
            r3 = 0
            r18 = 1
            r13 = r21
            java.util.List r0 = r13.BRZ()
            boolean r0 = r0.isEmpty()
            r9 = 0
            if (r0 != 0) goto L_0x014b
            com.instagram.model.direct.DirectThreadKey r0 = r13.BJy()
            java.lang.String r4 = r0.A00
            r10 = r19
            com.instagram.common.session.UserSession r5 = r10.A03
            boolean r0 = r13.CUG()
            if (r0 != 0) goto L_0x014b
            if (r4 == 0) goto L_0x014b
            java.util.List r0 = r13.BRZ()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x014b
            java.util.List r0 = r13.BRZ()
            java.lang.Object r8 = X.00k.A0O(r0, r3)
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            if (r8 == 0) goto L_0x014b
            X.5xW r0 = r13.AxB()
            if (r0 == 0) goto L_0x012c
            long r0 = r0.A00
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x012c
            java.lang.String r15 = X.AnonymousClass50n.A07(r8)
            if (r15 == 0) goto L_0x014b
            int r0 = r15.length()
            if (r0 == 0) goto L_0x014b
            X.5xW r0 = r13.AxB()
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = r0.A00()
        L_0x005c:
            java.util.List r0 = r13.BRZ()
            java.lang.Object r14 = r0.get(r3)
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
            int r1 = r2.hashCode()
            r0 = -790381913(0xffffffffd0e3baa7, float:-3.05652838E10)
            r12 = r20
            if (r1 == r0) goto L_0x00dc
            r0 = -706419847(0xffffffffd5e4e379, float:-3.14582048E13)
            if (r1 == r0) goto L_0x0105
            r0 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r1 != r0) goto L_0x0125
            java.lang.String r0 = "UNKNOWN"
        L_0x007d:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0125
            r7 = 0
            X.5xW r0 = r13.AxB()
            if (r0 == 0) goto L_0x00da
            long r2 = r0.A00
            long r0 = r0.A01
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x00a4
            X.5xW r0 = r13.AxB()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r0.A00()
        L_0x009c:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00da
        L_0x00a4:
            android.content.Context r1 = r10.A00
            if (r7 == 0) goto L_0x00cc
            r0 = 2131960227(0x7f1321a3, float:1.9557117E38)
            java.lang.String r16 = r1.getString(r0)
            r0 = 2131960223(0x7f13219f, float:1.9557109E38)
        L_0x00b2:
            java.lang.String r17 = X.DbW.A0h(r1, r15, r0)
            java.lang.String r3 = r14.getId()
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00f2
            java.lang.Class<X.Oxu> r1 = X.C72185Oxu.class
            X.PkC r0 = X.C73813PkC.A00
            java.lang.Object r2 = r5.A01(r1, r0)
            X.Oxu r2 = (X.C72185Oxu) r2
            monitor-enter(r2)
            goto L_0x00e3
        L_0x00cc:
            r0 = 2131960224(0x7f1321a0, float:1.955711E38)
            java.lang.String r16 = r1.getString(r0)
            r0 = 2131960221(0x7f13219d, float:1.9557105E38)
            goto L_0x00b2
        L_0x00d7:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x009c
        L_0x00da:
            r7 = 1
            goto L_0x00a4
        L_0x00dc:
            java.lang.String r0 = "REVEALABLE"
            goto L_0x007d
        L_0x00df:
            java.lang.String r2 = "UNKNOWN"
            goto L_0x005c
        L_0x00e3:
            java.util.Set r1 = r2.A00     // Catch:{ all -> 0x0148 }
            r0 = 46
            java.lang.String r0 = X.002.A0T(r4, r3, r0)     // Catch:{ all -> 0x0148 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0148 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0124
        L_0x00f2:
            java.lang.String r4 = r14.getId()
            X.Of9 r11 = new X.Of9
            r0 = r11
            r1 = r12
            r2 = r10
            r3 = r13
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            return r18
        L_0x0105:
            java.lang.String r0 = "NON_REVEALABLE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0125
            android.content.Context r1 = r10.A00
            r0 = 2131960225(0x7f1321a1, float:1.9557113E38)
            java.lang.String r16 = r1.getString(r0)
            r0 = 2131960222(0x7f13219e, float:1.9557107E38)
            java.lang.String r17 = X.DbW.A0h(r1, r15, r0)
            r11 = 0
            r18 = r3
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            r9 = 1
        L_0x0124:
            return r9
        L_0x0125:
            java.lang.String r0 = "Invalid policy violation visibility"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x012c:
            java.lang.String r6 = r8.getId()
            java.lang.Class<X.Oxu> r1 = X.C72185Oxu.class
            X.PkC r0 = X.C73813PkC.A00
            java.lang.Object r2 = r5.A01(r1, r0)
            X.Oxu r2 = (X.C72185Oxu) r2
            monitor-enter(r2)
            java.util.Set r1 = r2.A00     // Catch:{ all -> 0x0148 }
            r0 = 46
            java.lang.String r0 = X.002.A0T(r4, r6, r0)     // Catch:{ all -> 0x0148 }
            r1.remove(r0)     // Catch:{ all -> 0x0148 }
            monitor-exit(r2)
            return r3
        L_0x0148:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x014b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66664MaX.A01(X.Pu1, X.2Ep):boolean");
    }

    public C66664MaX(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession) {
        C51972G9s.A1C(userSession, r4);
        McQ mcQ = new McQ(context);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragment;
        this.A02 = r4;
        this.A04 = mcQ;
    }
}
