package X;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.4Pw  reason: invalid class name and case insensitive filesystem */
public abstract class C264434Pw implements C264394Ps {
    public C264444Px A00;
    public ByteBuffer A01;
    public C264444Px A02;
    public C264444Px A03;
    public ByteBuffer A04;
    public boolean A05;
    public C264444Px A06;

    public final void E5u() {
        this.A05 = true;
        if (this instanceof AnonymousClass4Q8) {
            AnonymousClass4Q8 r4 = (AnonymousClass4Q8) this;
            if (r4.A05) {
                int i = r4.A00;
                if (i > 0) {
                    r4.A04 += (long) (i / r4.A00.A00);
                }
                r4.A00 = 0;
            }
        } else if (this instanceof C264424Pv) {
            C264424Pv r42 = (C264424Pv) this;
            int i2 = r42.A01;
            if (i2 > 0) {
                C264424Pv.A00(r42, r42.A07, i2);
            }
            if (!r42.A06) {
                r42.A04 += (long) (r42.A02 / r42.A00);
            }
        }
    }

    public final ByteBuffer A02(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C264444Px AIv(X.C264444Px r4) {
        /*
            r3 = this;
            r3.A02 = r4
            r2 = r3
            boolean r0 = r3 instanceof X.AnonymousClass4Q8
            if (r0 == 0) goto L_0x0024
            X.4Q8 r2 = (X.AnonymousClass4Q8) r2
            int r1 = r4.A02
            r0 = 2
            if (r1 != r0) goto L_0x0076
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0019
            int r0 = r2.A02
        L_0x0017:
            if (r0 == 0) goto L_0x0073
        L_0x0019:
            r3.A03 = r4
            boolean r0 = r3.isActive()
            if (r0 != 0) goto L_0x0023
            X.4Px r4 = X.C264444Px.A04
        L_0x0023:
            return r4
        L_0x0024:
            boolean r0 = r3 instanceof X.C264424Pv
            if (r0 == 0) goto L_0x0032
            X.4Pv r2 = (X.C264424Pv) r2
            int r1 = r4.A02
            r0 = 2
            if (r1 != r0) goto L_0x007c
            boolean r0 = r2.A05
            goto L_0x0017
        L_0x0032:
            boolean r0 = r3 instanceof X.AnonymousClass4Q7
            if (r0 != 0) goto L_0x0073
            boolean r0 = r3 instanceof X.AnonymousClass4Q9
            int r1 = r4.A02
            if (r0 == 0) goto L_0x0057
            r2 = 2
            r0 = 3
            if (r1 == r0) goto L_0x0069
            if (r1 == r2) goto L_0x0073
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == r0) goto L_0x0069
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0069
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0069
            r0 = 4
            if (r1 == r0) goto L_0x0069
            X.4UJ r0 = new X.4UJ
            r0.<init>(r4)
            throw r0
        L_0x0057:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0068
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0068
            r0 = 4
            if (r1 == r0) goto L_0x0073
            X.4UJ r0 = new X.4UJ
            r0.<init>(r4)
            throw r0
        L_0x0068:
            r2 = 4
        L_0x0069:
            int r1 = r4.A03
            int r0 = r4.A01
            X.4Px r4 = new X.4Px
            r4.<init>(r1, r0, r2)
            goto L_0x0019
        L_0x0073:
            X.4Px r4 = X.C264444Px.A04
            goto L_0x0019
        L_0x0076:
            X.4UJ r0 = new X.4UJ
            r0.<init>(r4)
            throw r0
        L_0x007c:
            X.4UJ r0 = new X.4UJ
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264434Pw.AIv(X.4Px):X.4Px");
    }

    public ByteBuffer BZT() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C264394Ps.A00;
        return byteBuffer;
    }

    public boolean CSi() {
        if (!this.A05 || this.A01 != C264394Ps.A00) {
            return false;
        }
        return true;
    }

    public final void flush() {
        this.A01 = C264394Ps.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        if (this instanceof C264424Pv) {
            C264424Pv r3 = (C264424Pv) this;
            if (r3.A05) {
                C264444Px r0 = r3.A00;
                int i = r0.A00;
                r3.A00 = i;
                long j = (long) r0.A03;
                int i2 = ((int) ((150000 * j) / 1000000)) * i;
                if (r3.A07.length != i2) {
                    r3.A07 = new byte[i2];
                }
                int i3 = ((int) ((20000 * j) / 1000000)) * i;
                r3.A02 = i3;
                if (r3.A08.length != i3) {
                    r3.A08 = new byte[i3];
                }
            }
            r3.A03 = 0;
            r3.A04 = 0;
            r3.A01 = 0;
            r3.A06 = false;
        } else if (this instanceof AnonymousClass4Q8) {
            AnonymousClass4Q8 r32 = (AnonymousClass4Q8) this;
            if (r32.A05) {
                r32.A05 = false;
                int i4 = r32.A02;
                int i5 = r32.A00.A00;
                r32.A06 = new byte[(i4 * i5)];
                r32.A01 = r32.A03 * i5;
            }
            r32.A00 = 0;
        }
    }

    public final boolean isActive() {
        if (this instanceof C264424Pv) {
            return ((C264424Pv) this).A05;
        }
        if (this.A03 != C264444Px.A04) {
            return true;
        }
        return false;
    }

    public C264434Pw() {
        ByteBuffer byteBuffer = C264394Ps.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        C264444Px r0 = C264444Px.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A06 = r0;
    }

    public final void reset() {
        flush();
        this.A04 = C264394Ps.A00;
        C264444Px r0 = C264444Px.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A06 = r0;
        if (this instanceof AnonymousClass4Q8) {
            ((AnonymousClass4Q8) this).A06 = Util.A06;
        } else if (this instanceof C264424Pv) {
            C264424Pv r1 = (C264424Pv) this;
            r1.A05 = false;
            r1.A02 = 0;
            byte[] bArr = Util.A06;
            r1.A07 = bArr;
            r1.A08 = bArr;
        }
    }
}
