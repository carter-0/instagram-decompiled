package X;

/* renamed from: X.9Hy  reason: invalid class name and case insensitive filesystem */
public final class C376429Hy extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final int A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376429Hy(int r8) {
        /*
            r7 = this;
            r0 = r7
            r7.A04 = r8
            switch(r8) {
                case 1: goto L_0x0016;
                case 2: goto L_0x0011;
                default: goto L_0x0006;
            }
        L_0x0006:
            r1 = 0
            r3 = 15
            r5 = 3
        L_0x000a:
            r2 = r1
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0011:
            r1 = 0
            r3 = 15
            r5 = 2
            goto L_0x000a
        L_0x0016:
            r1 = 1
            r7.A04 = r1
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376429Hy.<init>(int):void");
    }

    public final boolean A00() {
        if (this.A03 == 1.0f && this.A02 == 0.0f && this.A00 == 0.0f && this.A01 == 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        float f;
        float f2;
        C376429Hy r3;
        float f3;
        float f4;
        switch (this.A04) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376429Hy) {
                    C376429Hy r32 = (C376429Hy) obj;
                    if (r32.A04 == 1 && Float.compare(this.A02, r32.A02) == 0 && Float.compare(this.A03, r32.A03) == 0 && Float.compare(this.A01, r32.A01) == 0) {
                        f = this.A00;
                        f2 = r32.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376429Hy) {
                    r3 = (C376429Hy) obj;
                    if (r3.A04 == 2 && Float.compare(this.A03, r3.A03) == 0 && Float.compare(this.A02, r3.A02) == 0) {
                        f3 = this.A00;
                        f4 = r3.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376429Hy) {
                    r3 = (C376429Hy) obj;
                    if (r3.A04 == 3 && Float.compare(this.A02, r3.A02) == 0 && Float.compare(this.A00, r3.A00) == 0) {
                        f3 = this.A03;
                        f4 = r3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                return super.equals(obj);
        }
        if (Float.compare(f3, f4) != 0) {
            return false;
        }
        f = this.A01;
        f2 = r3.A01;
        if (Float.compare(f, f2) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        float f;
        int i2;
        float f2;
        switch (this.A04) {
            case 1:
                i = ((((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A01)) * 31;
                f = this.A00;
                break;
            case 2:
                i2 = ((Float.floatToIntBits(this.A03) * 31) + Float.floatToIntBits(this.A02)) * 31;
                f2 = this.A00;
                break;
            case 3:
                i2 = ((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A00)) * 31;
                f2 = this.A03;
                break;
            default:
                return super.hashCode();
        }
        i = (i2 + Float.floatToIntBits(f2)) * 31;
        f = this.A01;
        return i + Float.floatToIntBits(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r0.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376429Hy(int r1, float r2, float r3, float r4, float r5) {
        /*
            r0 = this;
            r0.A04 = r1
            switch(r1) {
                case 0: goto L_0x0025;
                case 1: goto L_0x001b;
                case 2: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0.<init>()
            r0.A02 = r2
            r0.A00 = r3
            r0.A03 = r4
        L_0x000e:
            r0.A01 = r5
            return
        L_0x0011:
            r0.<init>()
            r0.A03 = r2
            r0.A02 = r3
            r0.A00 = r4
            goto L_0x000e
        L_0x001b:
            r0.<init>()
            r0.A02 = r2
            r0.A03 = r3
            r0.A01 = r4
            goto L_0x002e
        L_0x0025:
            r0.<init>()
            r0.A01 = r2
            r0.A02 = r3
            r0.A03 = r4
        L_0x002e:
            r0.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376429Hy.<init>(int, float, float, float, float):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376429Hy(float r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            r7 = this;
            r1 = r7
            r6 = r13
            r5 = r11
            r4 = r9
            r3 = r8
            r7.A04 = r12
            r0 = r10 & 1
            switch(r12) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0039;
                case 2: goto L_0x0024;
                default: goto L_0x000c;
            }
        L_0x000c:
            if (r0 == 0) goto L_0x0010
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0010:
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0015
            r4 = 0
        L_0x0015:
            r0 = r10 & 4
            if (r0 == 0) goto L_0x001a
            r5 = 0
        L_0x001a:
            r0 = r10 & 8
            if (r0 == 0) goto L_0x001f
            r6 = 0
        L_0x001f:
            r2 = 3
        L_0x0020:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L_0x0024:
            if (r0 == 0) goto L_0x0028
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0028:
            r0 = r10 & 2
            if (r0 == 0) goto L_0x002d
            r4 = 0
        L_0x002d:
            r0 = r10 & 4
            if (r0 == 0) goto L_0x0032
            r5 = 0
        L_0x0032:
            r0 = r10 & 8
            if (r0 == 0) goto L_0x0037
            r6 = 0
        L_0x0037:
            r2 = 2
            goto L_0x0020
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            r3 = 0
        L_0x003c:
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0041
            r4 = 0
        L_0x0041:
            r0 = r10 & 4
            if (r0 == 0) goto L_0x0046
            r5 = 0
        L_0x0046:
            r0 = r10 & 8
            if (r0 == 0) goto L_0x004b
            r6 = 0
        L_0x004b:
            r2 = 1
            goto L_0x0020
        L_0x004d:
            if (r0 == 0) goto L_0x0050
            r3 = 0
        L_0x0050:
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0055
            r4 = 0
        L_0x0055:
            r0 = r10 & 4
            if (r0 == 0) goto L_0x005a
            r5 = 0
        L_0x005a:
            r0 = r10 & 8
            if (r0 == 0) goto L_0x005f
            r6 = 0
        L_0x005f:
            r2 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376429Hy.<init>(float, float, int, float, int, float):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376429Hy(float f) {
        this(1, f, f, f, f);
        this.A04 = 1;
    }
}
