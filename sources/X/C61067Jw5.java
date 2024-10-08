package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jw5  reason: case insensitive filesystem */
public final class C61067Jw5 extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public static final C61067Jw5 A00(Product product, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 0);
        return new C61067Jw5(product, list, z, z2);
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C61067Jw5) || ((C61067Jw5) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0106, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012d, code lost:
        if (r1 == r0) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0131, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0139, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0071;
                case 2: goto L_0x002c;
                case 3: goto L_0x0097;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00da;
                case 6: goto L_0x010e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x013d
            r0 = 7
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 == r0) goto L_0x0106
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            if (r2 == r3) goto L_0x013d
            r0 = 2
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0135
        L_0x004f:
            if (r2 == r3) goto L_0x013d
            r0 = 0
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0131
            goto L_0x002a
        L_0x0071:
            if (r2 == r3) goto L_0x013d
            r0 = 1
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0101
            goto L_0x002a
        L_0x0097:
            if (r2 == r3) goto L_0x013d
            r0 = 3
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0106
            goto L_0x002a
        L_0x00ba:
            if (r2 == r3) goto L_0x013d
            r0 = 4
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            goto L_0x012d
        L_0x00da:
            if (r2 == r3) goto L_0x013d
            r0 = 5
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            if (r1 == r0) goto L_0x0101
            goto L_0x002a
        L_0x0101:
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            goto L_0x010a
        L_0x0106:
            boolean r1 = r2.A04
            boolean r0 = r3.A04
        L_0x010a:
            if (r1 == r0) goto L_0x013d
            goto L_0x002a
        L_0x010e:
            if (r2 == r3) goto L_0x013d
            r0 = 6
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw5 r3 = (X.C61067Jw5) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A03
            boolean r0 = r3.A03
        L_0x012d:
            if (r1 == r0) goto L_0x0131
            goto L_0x002a
        L_0x0131:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0135:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x013d
            goto L_0x002a
        L_0x013d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61067Jw5.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        r2 = r1 * 31;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        r1 = r3.A01.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r2 = (r2 + r0) * 31;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0 == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r1 = 1231;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x0099;
                case 2: goto L_0x007d;
                case 3: goto L_0x006a;
                case 4: goto L_0x0057;
                case 5: goto L_0x0041;
                case 6: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            boolean r1 = r3.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x001b
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x001b:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r0 = r3.A04
        L_0x0020:
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L_0x0026
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x0026:
            int r1 = r1 + r2
            return r1
        L_0x0028:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            boolean r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            boolean r0 = r3.A03
            int r2 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x0026
        L_0x0041:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.DbS.A06(r0, r1)
            goto L_0x00af
        L_0x0057:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            boolean r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A09(r0, r1)
            goto L_0x00c7
        L_0x006a:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            boolean r0 = r3.A03
            int r2 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            goto L_0x001b
        L_0x007d:
            boolean r0 = r3.A03
            int r1 = X.C51965G9l.A05(r0)
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0026
        L_0x0099:
            boolean r0 = r3.A04
            int r1 = X.C51965G9l.A05(r0)
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
        L_0x00af:
            int r2 = r1 * 31
            boolean r0 = r3.A03
            goto L_0x0020
        L_0x00b5:
            boolean r0 = r3.A04
            int r1 = X.C51965G9l.A05(r0)
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
        L_0x00c7:
            java.lang.Object r0 = r3.A01
            int r1 = r0.hashCode()
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61067Jw5.hashCode():int");
    }

    public final String toString() {
        if (7 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(header=");
        A1A.append(this.A02);
        A1A.append(", clipsGridItems=");
        A1A.append(this.A01);
        A1A.append(", hasMoreClips=");
        A1A.append(this.A03);
        A1A.append(", isFirstPage=");
        return G9t.A1C(A1A, this.A04);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61067Jw5(List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        this((Object) null, (Object) null, 1, false, false);
        this.A00 = 1;
    }

    public C61067Jw5(C53400GnX gnX, List list, boolean z, boolean z2) {
        this.A00 = 4;
        this.A02 = list;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = gnX;
    }

    public C61067Jw5(C266444Yx r2, C273014lo r3, boolean z, boolean z2) {
        this.A00 = 3;
        this.A02 = r2;
        this.A03 = z;
        this.A01 = r3;
        this.A04 = z2;
    }

    public C61067Jw5(Product product, List list, boolean z, boolean z2) {
        this.A00 = 5;
        this.A01 = list;
        this.A02 = product;
        this.A04 = z;
        this.A03 = z2;
    }

    public C61067Jw5(User user, Integer num, boolean z, boolean z2) {
        this.A00 = 6;
        this.A02 = user;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = num;
    }

    public C61067Jw5(L0M l0m, MQL mql, boolean z, boolean z2) {
        this.A00 = 0;
        C51972G9s.A1D(mql, l0m);
        this.A04 = z;
        this.A03 = z2;
        this.A02 = mql;
        this.A01 = l0m;
    }

    public C61067Jw5(C53381GnB gnB, List list, boolean z, boolean z2) {
        this.A00 = 7;
        0qQ.A0B(list, 2);
        this.A02 = gnB;
        this.A01 = list;
        this.A03 = z;
        this.A04 = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61067Jw5(L0M l0m, MQL mql) {
        this(l0m, mql, false, false);
        this.A00 = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61067Jw5() {
        this((Product) null, (List) 0sn.A00, true, false);
        this.A00 = 5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61067Jw5(C266444Yx r2, C273014lo r3, boolean z) {
        this(r2, r3, z, false);
        this.A00 = 3;
    }

    public C61067Jw5(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A04 = z2;
        this.A02 = obj2;
    }
}
