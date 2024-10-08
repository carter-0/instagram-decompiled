package X;

import java.util.List;

/* renamed from: X.6GO  reason: invalid class name */
public final class AnonymousClass6GO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C55997Hr3 A06;
    public C286025Tq A07;
    public AnonymousClass62Z A08;
    public C3022462f A09;
    public AnonymousClass5Z4 A0A;
    public C286305Uu A0B;
    public C268024cd A0C;
    public List A0D;
    public boolean A0E;
    public AnonymousClass5Q8 A0F;

    public static final AnonymousClass62Z A01(AnonymousClass6GO r7, AnonymousClass5Q8 r8) {
        AnonymousClass62Z r1 = r7.A08;
        if (r1 == null || r8 != r7.A0F || r1.BC8()) {
            r7.A0F = r8;
            C286025Tq r2 = r7.A07;
            AnonymousClass5Z4 A002 = C291695hj.A00(r7.A0A, r8);
            C268024cd r5 = r7.A0C;
            0qQ.A0A(r5);
            C286305Uu r4 = r7.A0B;
            0sn r6 = r7.A0D;
            if (r6 == null) {
                r6 = 0sn.A00;
            }
            r1 = new AnonymousClass62Z(r2, A002, r4, r5, r6);
        }
        r7.A08 = r1;
        return r1;
    }

    public final int A02(AnonymousClass5Q8 r4, int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int A002 = AnonymousClass5iI.A00(A00(this, r4, AnonymousClass5SF.A04(0, i, 0, Integer.MAX_VALUE)).A00);
        this.A01 = i;
        this.A00 = A002;
        return A002;
    }

    public final void A03(C268024cd r8) {
        long j;
        C268024cd r2 = this.A0C;
        if (r8 != null) {
            long j2 = C291675hh.A00;
            float AwL = r8.AwL();
            float B77 = r8.B77();
            long floatToRawIntBits = (long) Float.floatToRawIntBits(AwL);
            j = (((long) Float.floatToRawIntBits(B77)) & 4294967295L) | (floatToRawIntBits << 32);
        } else {
            j = C291675hh.A00;
        }
        if (r2 == null) {
            this.A0C = r8;
            this.A05 = j;
        } else if (r8 == null || this.A05 != j) {
            this.A0C = r8;
            this.A05 = j;
            this.A08 = null;
            this.A09 = null;
            this.A00 = -1;
            this.A01 = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 == 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C3022262d A00(X.AnonymousClass6GO r4, X.AnonymousClass5Q8 r5, long r6) {
        /*
            X.62Z r3 = A01(r4, r5)
            boolean r2 = r4.A0E
            int r1 = r4.A04
            float r0 = r3.BP9()
            long r5 = X.C292035iH.A00(r0, r1, r6, r2)
            boolean r0 = r4.A0E
            int r2 = r4.A04
            int r1 = r4.A02
            r4 = 1
            if (r0 != 0) goto L_0x0023
            r0 = 2
            if (r2 != r0) goto L_0x0023
        L_0x001c:
            r7 = 1
        L_0x001d:
            X.62d r2 = new X.62d
            r2.<init>(r3, r4, r5, r7)
            return r2
        L_0x0023:
            if (r1 >= r4) goto L_0x0026
            r1 = 1
        L_0x0026:
            r4 = r1
            r0 = 2
            r7 = 0
            if (r2 != r0) goto L_0x001d
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GO.A00(X.6GO, X.5Q8, long):X.62d");
    }
}
