package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.MbG  reason: case insensitive filesystem */
public final class C66709MbG extends AnonymousClass0T0 {
    public final int A00 = 3;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C66709MbG(C241973Sc r3, long j) {
        this.A01 = j;
        this.A03 = r3;
        this.A02 = AnonymousClass0eN.A01(new C73920Pm0(this, 30));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        r1 = r5.A03;
        r0 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        r1 = r5.A02;
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0026;
                case 2: goto L_0x0046;
                case 3: goto L_0x0066;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r6)
            return r0
        L_0x000a:
            if (r5 == r6) goto L_0x008d
            r1 = 0
            boolean r0 = r6 instanceof X.C66709MbG
            if (r0 == 0) goto L_0x007b
            X.MbG r6 = (X.C66709MbG) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x007b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            if (r1 == r0) goto L_0x007d
            goto L_0x007b
        L_0x0026:
            if (r5 == r6) goto L_0x008d
            r1 = 1
            boolean r0 = r6 instanceof X.C66709MbG
            if (r0 == 0) goto L_0x007b
            X.MbG r6 = (X.C66709MbG) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x007b
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0082
            goto L_0x007b
        L_0x0046:
            if (r5 == r6) goto L_0x008d
            r1 = 2
            boolean r0 = r6 instanceof X.C66709MbG
            if (r0 == 0) goto L_0x007b
            X.MbG r6 = (X.C66709MbG) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x007b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0082
            goto L_0x007b
        L_0x0066:
            if (r5 == r6) goto L_0x008d
            r1 = 3
            boolean r0 = r6 instanceof X.C66709MbG
            if (r0 == 0) goto L_0x007b
            X.MbG r6 = (X.C66709MbG) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x007b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007d
        L_0x007b:
            r0 = 0
            return r0
        L_0x007d:
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            goto L_0x0086
        L_0x0082:
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
        L_0x0086:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008d
            goto L_0x007b
        L_0x008d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66709MbG.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r0 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x0023;
                case 2: goto L_0x000a;
                case 3: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            long r0 = r3.A01
            int r1 = X.C51975G9x.A03(r0)
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            goto L_0x0031
        L_0x0017:
            long r0 = r3.A01
            int r1 = X.C51975G9x.A03(r0)
            java.lang.Object r0 = r3.A03
            if (r0 != 0) goto L_0x0042
            r0 = 0
            goto L_0x0046
        L_0x0023:
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r2 = r0 * 31
            long r0 = r3.A01
            int r1 = X.C51972G9s.A07(r0, r2)
        L_0x0031:
            java.lang.Object r0 = r3.A02
            goto L_0x0042
        L_0x0034:
            long r0 = r3.A01
            int r1 = X.C51975G9x.A03(r0)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A03
        L_0x0042:
            int r0 = r0.hashCode()
        L_0x0046:
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66709MbG.hashCode():int");
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("promptType: ");
        A1A.append(this.A02);
        A1A.append(" createdAt: ");
        A1A.append(this.A01);
        A1A.append(" updatedFields: ");
        return AnonymousClass7TF.A0i(this.A03, A1A);
    }

    public C66709MbG(ImageUrl imageUrl, 1Xj r3, long j) {
        this.A03 = imageUrl;
        this.A01 = j;
        this.A02 = r3;
    }

    public C66709MbG(C327637Bp r2, List list, long j) {
        this.A01 = j;
        this.A03 = r2;
        this.A02 = list;
    }

    public C66709MbG(C21243XQo xQo, List list, long j) {
        AnonymousClass7TG.A1Q(xQo, list);
        this.A01 = j;
        this.A02 = xQo;
        this.A03 = list;
    }

    public C66709MbG(DirectThreadKey directThreadKey, Integer num, long j) {
        0qQ.A0B(num, 2);
        this.A03 = directThreadKey;
        this.A02 = num;
        this.A01 = j;
    }
}
