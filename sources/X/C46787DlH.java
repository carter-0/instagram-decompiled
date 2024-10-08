package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.DlH  reason: case insensitive filesystem */
public abstract class C46787DlH extends 2YL {
    public final C251033mS A00;
    public final Set A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final boolean A04;

    public /* synthetic */ C46787DlH(UserSession userSession, int i) {
        C251033mS r1 = null;
        boolean z = (i & 2) != 0;
        r1 = (i & 4) != 0 ? C251033mS.A00(userSession) : r1;
        0qQ.A0B(r1, 3);
        this.A04 = z;
        this.A00 = r1;
        02z A012 = 106.A01((Object) null);
        this.A02 = A012;
        this.A03 = 10b.A03(A012);
        this.A01 = DbS.A0y();
    }

    public abstract Integer A02();

    public abstract AnonymousClass0r6 A04();

    public abstract void A06();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.4Yx] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C46787DlH r9, java.util.List r10, java.util.Set r11, int r12) {
        /*
            r0 = r12 & 1
            if (r0 == 0) goto L_0x002e
            X.05G r0 = r9.A02
            java.lang.Object r0 = r0.getValue()
            X.ExB r0 = (X.ExB) r0
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x002c
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r1.next()
            X.Jw5 r0 = (X.C61067Jw5) r0
            java.lang.Object r0 = r0.A02
            r10.add(r0)
            goto L_0x001a
        L_0x002c:
            X.0sn r10 = X.0sn.A00
        L_0x002e:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0080
            X.05G r0 = r9.A02
            java.lang.Object r0 = r0.getValue()
            X.ExB r0 = (X.ExB) r0
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0079
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0048:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Jw5 r0 = (X.C61067Jw5) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0048
            r3.add(r1)
            goto L_0x0048
        L_0x005d:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0065:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.next()
            X.Jw5 r0 = (X.C61067Jw5) r0
            java.lang.Object r0 = r0.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.DbU.A1V(r0, r2)
            goto L_0x0065
        L_0x0079:
            X.0sl r11 = X.0sl.A00
            goto L_0x0080
        L_0x007c:
            java.util.Set r11 = X.00k.A0k(r2)
        L_0x0080:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r8 = r10.iterator()
        L_0x0088:
            boolean r0 = r8.hasNext()
            r1 = 0
            r5 = 0
            if (r0 == 0) goto L_0x00cd
            com.instagram.user.model.User r7 = X.DbT.A0k(r8)
            boolean r6 = X.DbV.A1a(r7, r11)
            X.3mS r3 = r9.A00
            java.lang.String r0 = r7.getId()
            X.3mU r0 = r3.A02(r0)
            r2 = 1
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A05
            if (r0 != r2) goto L_0x00aa
            r5 = 1
        L_0x00aa:
            java.lang.String r0 = r7.getId()
            X.3mU r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x00c4
            long r0 = r0.A01
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 / r0
            int r0 = (int) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00c4:
            X.Jw5 r0 = new X.Jw5
            r0.<init>((com.instagram.user.model.User) r7, (java.lang.Integer) r1, (boolean) r6, (boolean) r5)
            r4.add(r0)
            goto L_0x0088
        L_0x00cd:
            X.05G r2 = r9.A02
            java.lang.Integer r0 = r9.A02()
            if (r0 == 0) goto L_0x00df
            int r1 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.GKO r1 = X.DbS.A0Q(r0, r1)
        L_0x00df:
            X.ExB r0 = new X.ExB
            r0.<init>(r1, r4)
            r2.Epw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46787DlH.A00(X.DlH, java.util.List, java.util.Set, int):void");
    }

    public int A01() {
        return 100;
    }

    public final Set A03() {
        List list;
        ExB exB = (ExB) this.A02.getValue();
        if (exB == null || (list = exB.A01) == null) {
            return 0sl.A00;
        }
        ArrayList<C61067Jw5> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((C61067Jw5) next).A04) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (C61067Jw5 jw5 : A1C) {
            A0r.add(jw5.A02);
        }
        return 00k.A0k(A0r);
    }

    public final void A05() {
        DbY.A19(this, new MHB(this, (AnonymousClass4D7) null, 25), A04());
    }
}
