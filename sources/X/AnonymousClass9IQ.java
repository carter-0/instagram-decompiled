package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9IQ  reason: invalid class name */
public final class AnonymousClass9IQ extends AnonymousClass0T0 {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public AnonymousClass9IQ(C62636KjH kjH) {
        this.A03 = 1;
        this.A03 = 1;
        this.A00 = kjH;
        this.A02 = true;
        this.A01 = true;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9IQ r3;
        boolean z;
        boolean z2;
        int i;
        switch (this.A03) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9IQ)) {
                    return false;
                }
                AnonymousClass9IQ r32 = (AnonymousClass9IQ) obj;
                if (r32.A03 == 1 && this.A00 == r32.A00 && this.A02 == r32.A02 && this.A01 == r32.A01) {
                    return true;
                }
                return false;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9IQ) {
                    r3 = (AnonymousClass9IQ) obj;
                    if (r3.A03 == 2 && this.A02 == r3.A02) {
                        z = this.A01;
                        z2 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof AnonymousClass9IQ)) {
            return false;
        }
        r3 = (AnonymousClass9IQ) obj;
        if (r3.A03 != i || this.A01 != r3.A01) {
            return false;
        }
        z = this.A02;
        z2 = r3.A02;
        if (z != z2 || !0qQ.A0K(this.A00, r3.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0041;
                case 2: goto L_0x000a;
                case 3: goto L_0x0005;
                case 4: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0012
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0012:
            int r2 = r0 * 31
            boolean r1 = r3.A01
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x001c
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x001c:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x003c
            r0 = 0
            goto L_0x005c
        L_0x0025:
            boolean r1 = r3.A01
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x002d
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x002d:
            int r2 = r0 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0037
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0037:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.Object r0 = r3.A00
        L_0x003c:
            int r0 = r0.hashCode()
            goto L_0x005c
        L_0x0041:
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0051
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0051:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r1 = r3.A01
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x005c
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x005c:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IQ.hashCode():int");
    }

    public final String toString() {
        if (this.A03 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SubtitlesState(enabled=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(2056));
        sb.append(this.A02);
        sb.append(", cues=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9IQ(Object obj, int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A00 = obj;
    }

    public AnonymousClass9IQ(Set set, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        this.A03 = 3;
        HashSet hashSet = new HashSet();
        this.A03 = 3;
        this.A00 = hashSet;
        this.A01 = false;
        this.A02 = false;
    }

    public AnonymousClass9IQ() {
        this.A03 = 3;
        this.A03 = 3;
        HashSet hashSet = new HashSet();
        this.A03 = 3;
        this.A00 = hashSet;
        this.A01 = false;
        this.A02 = false;
    }

    public AnonymousClass9IQ(List list, boolean z, boolean z2) {
        this.A03 = 0;
        this.A01 = z;
        this.A02 = z2;
        this.A00 = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IQ(Integer num, int i, boolean z) {
        this((i & 4) != 0 ? null : num, 2, false, z);
        this.A03 = 2;
    }
}
