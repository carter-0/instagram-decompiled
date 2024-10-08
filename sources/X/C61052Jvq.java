package X;

import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Jvq  reason: case insensitive filesystem */
public final class C61052Jvq extends AnonymousClass0T0 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C61052Jvq(List list, int i, int i2, boolean z) {
        this.A03 = i2;
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        if ((r3 instanceof X.C61052Jvq) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r3 = (X.C61052Jvq) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0060, code lost:
        if ((r3 instanceof X.C61052Jvq) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
        r3 = (X.C61052Jvq) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0066, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        if (r2.A01 == r3.A01) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0073, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0079, code lost:
        if (r2.A02 == r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if ((r3 instanceof X.C61052Jvq) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r3 = (X.C61052Jvq) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2.A02 != r3.A02) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x002f;
                case 2: goto L_0x0033;
                case 3: goto L_0x0037;
                case 4: goto L_0x003b;
                case 5: goto L_0x003f;
                case 6: goto L_0x0057;
                case 7: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x007c
            r1 = 8
        L_0x0009:
            boolean r0 = r3 instanceof X.C61052Jvq
            if (r0 == 0) goto L_0x0029
            X.Jvq r3 = (X.C61052Jvq) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0029
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0029
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0029
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007c
        L_0x0029:
            r0 = 0
            return r0
        L_0x002b:
            if (r2 == r3) goto L_0x007c
            r1 = 0
            goto L_0x0009
        L_0x002f:
            if (r2 == r3) goto L_0x007c
            r1 = 1
            goto L_0x0009
        L_0x0033:
            if (r2 == r3) goto L_0x007c
            r1 = 2
            goto L_0x005e
        L_0x0037:
            if (r2 == r3) goto L_0x007c
            r1 = 3
            goto L_0x0042
        L_0x003b:
            if (r2 == r3) goto L_0x007c
            r1 = 4
            goto L_0x0042
        L_0x003f:
            if (r2 == r3) goto L_0x007c
            r1 = 5
        L_0x0042:
            boolean r0 = r3 instanceof X.C61052Jvq
            if (r0 == 0) goto L_0x0029
            X.Jvq r3 = (X.C61052Jvq) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0029
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0029
        L_0x0057:
            if (r2 == r3) goto L_0x007c
            r1 = 6
            goto L_0x0009
        L_0x005b:
            if (r2 == r3) goto L_0x007c
            r1 = 7
        L_0x005e:
            boolean r0 = r3 instanceof X.C61052Jvq
            if (r0 == 0) goto L_0x0029
            X.Jvq r3 = (X.C61052Jvq) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0029
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x006f
            goto L_0x0029
        L_0x006f:
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0029
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x007c
            goto L_0x0029
        L_0x007c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61052Jvq.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r2 = ((r0 * 31) + r3.A00) * 31;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r3.A02 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        return r2 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 2: goto L_0x0036;
                case 3: goto L_0x002f;
                case 4: goto L_0x0029;
                case 5: goto L_0x002f;
                case 6: goto L_0x0005;
                case 7: goto L_0x0029;
                case 8: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r3.A02
            int r1 = X.C51965G9l.A05(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A01
        L_0x0012:
            int r0 = r0.hashCode()
        L_0x0016:
            int r2 = r2 + r0
            return r2
        L_0x0018:
            boolean r0 = r3.A02
            int r1 = X.C51965G9l.A05(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0012
            r0 = 0
            goto L_0x0016
        L_0x0029:
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0031
            r0 = 0
            goto L_0x0045
        L_0x002f:
            java.lang.Object r0 = r3.A01
        L_0x0031:
            int r0 = r0.hashCode()
            goto L_0x0045
        L_0x0036:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0055;
                case 2: goto L_0x0058;
                default: goto L_0x003f;
            }
        L_0x003f:
            java.lang.String r0 = "TrimStarted"
        L_0x0041:
            int r0 = X.C51966G9m.A04(r0, r1)
        L_0x0045:
            int r1 = r0 * 31
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0016
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0016
        L_0x0055:
            java.lang.String r0 = "TrimUpdate"
            goto L_0x0041
        L_0x0058:
            java.lang.String r0 = "TrimCompleted"
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61052Jvq.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A03) {
            case 2:
                sb = AnonymousClass7TE.A1A();
                sb.append("StackedTimelineTrimEvent(state=");
                Number number = (Number) this.A01;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str2 = "TrimUpdate";
                            break;
                        case 2:
                            str2 = "TrimCompleted";
                            break;
                        default:
                            str2 = "TrimStarted";
                            break;
                    }
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                sb.append(", trimmerPositionMs=");
                sb.append(this.A00);
                str = ", isLeftTrimHandle=";
                break;
            case 7:
                sb = AnonymousClass7TE.A1A();
                sb.append("IgLiveSupporterInfo(supportTier=");
                sb.append(this.A01);
                sb.append(", badgesCount=");
                sb.append(this.A00);
                str = ", showHighlight=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        return G9t.A1C(sb, this.A02);
    }

    public C61052Jvq(C266444Yx r2, int i, boolean z) {
        this.A03 = i;
        this.A02 = z;
        this.A00 = R.drawable.instagram_party_popper_pano_outline_24;
        this.A01 = r2;
    }

    public C61052Jvq(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61052Jvq(Integer num, int i, int i2, boolean z) {
        this(num, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
        this.A03 = 2;
    }

    public C61052Jvq(Integer num, int i, boolean z) {
        this.A03 = 2;
        this.A01 = num;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61052Jvq() {
        this((Object) null, 0, 7, false);
        this.A03 = 7;
        this.A03 = 7;
    }
}
