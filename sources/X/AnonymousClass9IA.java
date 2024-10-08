package X;

import kotlinx.serialization.json.JsonObject;

/* renamed from: X.9IA  reason: invalid class name */
public final class AnonymousClass9IA extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9IA(int r2, int r3, boolean r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.A00 = r3
            r0 = r2 & 1
            if (r3 == 0) goto L_0x0018
            if (r0 == 0) goto L_0x0009
            r4 = 1
        L_0x0009:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x000e
            r5 = 0
        L_0x000e:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0013
            r6 = 0
        L_0x0013:
            r0 = 2
        L_0x0014:
            r1.<init>(r4, r5, r6, r0)
            return
        L_0x0018:
            if (r0 == 0) goto L_0x001b
            r4 = 0
        L_0x001b:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0020
            r5 = 0
        L_0x0020:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0025
            r6 = 0
        L_0x0025:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IA.<init>(int, int, boolean, boolean, boolean):void");
    }

    public final JsonObject A00() {
        C271104hu r2 = new C271104hu();
        r2.A01("is_internet_available", C271114hv.A04(Boolean.valueOf(this.A01)));
        r2.A01("is_java_memory_red", C271114hv.A04(Boolean.valueOf(this.A02)));
        r2.A01("is_system_memory_red", C271114hv.A04(Boolean.valueOf(this.A03)));
        return r2.A00();
    }

    public final boolean equals(Object obj) {
        AnonymousClass9IA r3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9IA) {
                    r3 = (AnonymousClass9IA) obj;
                    if (r3.A00 == 0 && this.A01 == r3.A01) {
                        z = this.A03;
                        z2 = r3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9IA) {
                    r3 = (AnonymousClass9IA) obj;
                    if (r3.A00 == 1 && this.A03 == r3.A03) {
                        z = this.A01;
                        z2 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9IA) {
                    AnonymousClass9IA r32 = (AnonymousClass9IA) obj;
                    if (r32.A00 == 2 && this.A01 == r32.A01 && this.A02 == r32.A02) {
                        z3 = this.A03;
                        z4 = r32.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (z != z2) {
            return false;
        }
        z3 = this.A02;
        z4 = r3.A02;
        if (z3 != z4) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        switch (this.A00) {
            case 0:
                int i3 = 1237;
                if (this.A01) {
                    i3 = 1231;
                }
                i = i3 * 31;
                z = this.A03;
                break;
            case 1:
                int i4 = 1237;
                if (this.A03) {
                    i4 = 1231;
                }
                i = i4 * 31;
                z = this.A01;
                break;
            default:
                int i5 = 1237;
                if (this.A01) {
                    i5 = 1231;
                }
                int i6 = i5 * 31;
                int i7 = 1237;
                if (this.A02) {
                    i7 = 1231;
                }
                i2 = (i6 + i7) * 31;
                z2 = this.A03;
                break;
        }
        int i8 = 1237;
        if (z) {
            i8 = 1231;
        }
        i2 = (i + i8) * 31;
        z2 = this.A02;
        int i9 = 1237;
        if (z2) {
            i9 = 1231;
        }
        return i2 + i9;
    }

    public AnonymousClass9IA(boolean z, boolean z2, boolean z3, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A01 = z;
                this.A03 = z2;
                break;
            case 1:
                this.A03 = z;
                this.A01 = z2;
                break;
            default:
                this.A01 = z;
                this.A02 = z2;
                this.A03 = z3;
                return;
        }
        this.A02 = z3;
    }
}
