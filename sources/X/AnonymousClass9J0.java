package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashSet;

/* renamed from: X.9J0  reason: invalid class name */
public final class AnonymousClass9J0 extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    public AnonymousClass9J0(Object obj, Object obj2, String str, int i, boolean z) {
        this.A03 = i;
        this.A04 = obj;
        this.A02 = z;
        this.A00 = obj2;
        this.A01 = str;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9J0) || ((AnonymousClass9J0) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        r0 = X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f6, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x003b;
                case 2: goto L_0x005f;
                case 3: goto L_0x007f;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0005;
                case 6: goto L_0x00c9;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x00fa
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00f8
            X.9J0 r3 = (X.AnonymousClass9J0) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x00fa
            goto L_0x00f8
        L_0x003b:
            if (r2 == r3) goto L_0x00fa
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00f8
            X.9J0 r3 = (X.AnonymousClass9J0) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x00f8
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x00a2
        L_0x005f:
            if (r2 == r3) goto L_0x00fa
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00f8
            X.9J0 r3 = (X.AnonymousClass9J0) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x00f8
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x009e
        L_0x007f:
            if (r2 == r3) goto L_0x00fa
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00f8
            X.9J0 r3 = (X.AnonymousClass9J0) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x00f8
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x009e:
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x00a2:
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x00f2
        L_0x00a9:
            if (r2 == r3) goto L_0x00fa
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00f8
            X.9J0 r3 = (X.AnonymousClass9J0) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x00f8
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x00f2
        L_0x00c9:
            if (r2 == r3) goto L_0x00fa
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00f8
            X.9J0 r3 = (X.AnonymousClass9J0) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f8
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x00f8
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
        L_0x00f2:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00fa
        L_0x00f8:
            r0 = 0
            return r0
        L_0x00fa:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J0.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        r3 = (r1 + r2) * 31;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d1, code lost:
        return r0 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x0083;
                case 2: goto L_0x0069;
                case 3: goto L_0x004b;
                case 4: goto L_0x0029;
                case 5: goto L_0x0005;
                case 6: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = super.hashCode()
            return r0
        L_0x000a:
            java.lang.Object r0 = r4.A00
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r4.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r4.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0023
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0023:
            int r2 = r2 + r0
            int r3 = r2 * 31
            java.lang.Object r0 = r4.A04
            goto L_0x00a3
        L_0x0029:
            java.lang.Object r0 = r4.A00
            r3 = 0
            if (r0 != 0) goto L_0x0046
            r0 = 0
        L_0x002f:
            int r2 = r0 * 31
            boolean r1 = r4.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0039
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0039:
            int r2 = r2 + r0
            int r0 = r2 * 31
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x00d0
            int r3 = r1.hashCode()
            goto L_0x00d0
        L_0x0046:
            int r0 = r0.hashCode()
            goto L_0x002f
        L_0x004b:
            boolean r1 = r4.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0053
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0053:
            int r1 = r0 * 31
            java.lang.Object r0 = r4.A04
            if (r0 != 0) goto L_0x0064
            r0 = 0
        L_0x005a:
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r4.A01
            int r1 = r0.hashCode()
            goto L_0x009e
        L_0x0064:
            int r0 = r0.hashCode()
            goto L_0x005a
        L_0x0069:
            java.lang.String r0 = r4.A01
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            boolean r1 = r4.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0079
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0079:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.Object r0 = r4.A04
            int r1 = r0.hashCode()
            goto L_0x009e
        L_0x0083:
            boolean r1 = r4.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x008b
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x008b:
            int r1 = r0 * 31
            java.lang.String r0 = r4.A01
            r2 = 0
            if (r0 != 0) goto L_0x00a8
            r0 = 0
        L_0x0093:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A04
            if (r0 == 0) goto L_0x009e
            int r2 = r0.hashCode()
        L_0x009e:
            int r1 = r1 + r2
            int r3 = r1 * 31
            java.lang.Object r0 = r4.A00
        L_0x00a3:
            int r0 = r0.hashCode()
            goto L_0x00d0
        L_0x00a8:
            int r0 = r0.hashCode()
            goto L_0x0093
        L_0x00ad:
            java.lang.String r0 = r4.A01
            r2 = 0
            if (r0 != 0) goto L_0x00d7
            r0 = 0
        L_0x00b3:
            int r1 = r0 * 31
            java.lang.Object r0 = r4.A04
            if (r0 != 0) goto L_0x00d2
            r0 = 0
        L_0x00ba:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A00
            if (r0 == 0) goto L_0x00c5
            int r2 = r0.hashCode()
        L_0x00c5:
            int r1 = r1 + r2
            int r3 = r1 * 31
            boolean r1 = r4.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x00d0
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x00d0:
            int r0 = r0 + r3
            return r0
        L_0x00d2:
            int r0 = r0.hashCode()
            goto L_0x00ba
        L_0x00d7:
            int r0 = r0.hashCode()
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J0.hashCode():int");
    }

    public final String toString() {
        if (6 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Interrupt(event=");
        sb.append(this.A00);
        sb.append(Pxd.A00(49));
        sb.append(this.A01);
        sb.append(", preventSuccess=");
        sb.append(this.A02);
        sb.append(", trigger=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9J0(C376459Ib r2, ImageUrl imageUrl, String str, boolean z) {
        this.A03 = 3;
        this.A02 = z;
        this.A04 = imageUrl;
        this.A01 = str;
        this.A00 = r2;
    }

    public AnonymousClass9J0(1Jn r3, String str, boolean z) {
        1Jn r0;
        this.A03 = 6;
        if ((r3 instanceof C252823pl) || (r3 instanceof C317976o9) || !(r3 instanceof 1Jp)) {
            r0 = r3;
        } else {
            r0 = ((1Jp) r3).A00;
        }
        this.A03 = 6;
        this.A00 = r3;
        this.A01 = str;
        this.A02 = z;
        this.A04 = r0;
    }

    public AnonymousClass9J0(C376509Ig r2, AnonymousClass3W1 r3, String str, boolean z) {
        this.A03 = 2;
        this.A01 = str;
        this.A02 = z;
        this.A04 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9J0(java.lang.Long r9, java.lang.Long r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r4 = r10
            r3 = r9
            r6 = 0
            r2 = r8
            r8.A03 = r6
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto L_0x000c
            r3 = r1
        L_0x000c:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0011
            r4 = r1
        L_0x0011:
            r5 = r11
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J0.<init>(java.lang.Long, java.lang.Long, java.lang.String, int):void");
    }

    public AnonymousClass9J0() {
        this.A03 = 4;
        this.A03 = 4;
        this.A00 = null;
        this.A02 = false;
        this.A01 = null;
        this.A04 = new HashSet();
    }
}
