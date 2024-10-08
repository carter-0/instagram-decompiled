package X;

import com.instagram.android.R;

public final class ULT extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public ULT(int i, int i2, int i3, int i4) {
        this.A00 = i4;
        switch (i4) {
            case 0:
            case 4:
                this.A02 = i;
                this.A03 = i2;
                this.A01 = i3;
                return;
            case 1:
            case 3:
                this.A01 = i;
                this.A02 = i2;
                break;
            default:
                this.A02 = i;
                this.A01 = i2;
                break;
        }
        this.A03 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if ((r3 instanceof X.ULT) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        r3 = (X.ULT) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r3.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x000a;
                case 2: goto L_0x000e;
                case 3: goto L_0x0026;
                case 4: goto L_0x0044;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0065
            r1 = 1
            goto L_0x0029
        L_0x000e:
            if (r2 == r3) goto L_0x0065
            r1 = 2
            boolean r0 = r3 instanceof X.ULT
            if (r0 == 0) goto L_0x0063
            X.ULT r3 = (X.ULT) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0063
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L_0x0063
            int r1 = r2.A01
            int r0 = r3.A01
            goto L_0x003d
        L_0x0026:
            if (r2 == r3) goto L_0x0065
            r1 = 3
        L_0x0029:
            boolean r0 = r3 instanceof X.ULT
            if (r0 == 0) goto L_0x0063
            X.ULT r3 = (X.ULT) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0063
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x0063
            int r1 = r2.A02
            int r0 = r3.A02
        L_0x003d:
            if (r1 != r0) goto L_0x0063
            int r1 = r2.A03
            int r0 = r3.A03
            goto L_0x0061
        L_0x0044:
            if (r2 == r3) goto L_0x0065
            r1 = 4
            boolean r0 = r3 instanceof X.ULT
            if (r0 == 0) goto L_0x0063
            X.ULT r3 = (X.ULT) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0063
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L_0x0063
            int r1 = r2.A03
            int r0 = r3.A03
            if (r1 != r0) goto L_0x0063
            int r1 = r2.A01
            int r0 = r3.A01
        L_0x0061:
            if (r1 == r0) goto L_0x0065
        L_0x0063:
            r0 = 0
            return r0
        L_0x0065:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ULT.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 1:
            case 3:
                i3 = this.A01 * 31;
                i4 = this.A02;
                break;
            case 2:
                i3 = this.A02 * 31;
                i4 = this.A01;
                break;
            case 4:
                i = ((this.A02 * 31) + this.A03) * 31;
                i2 = this.A01;
                break;
            default:
                return super.hashCode();
        }
        i = (i3 + i4) * 31;
        i2 = this.A03;
        return i + i2;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SavedState(firstVisiblePosition=");
        sb.append(this.A01);
        sb.append(", offsetX=");
        sb.append(this.A02);
        sb.append(", offsetY=");
        return C51975G9x.A0j(sb, this.A03);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ULT() {
        this(R.drawable.instagram_error_pano_outline_24, 2131961749, 2131975553, 4);
        this.A00 = 4;
    }
}
