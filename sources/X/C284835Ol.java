package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5Ol  reason: invalid class name and case insensitive filesystem */
public final class C284835Ol implements AnonymousClass4TH, AnonymousClass4TQ {
    public int A00;
    public boolean A01;
    public byte[] A02;
    public final long A03;
    public final C256683wB A04;
    public final C265174Sv A05;
    public final C264844Rn A06;
    public final C265084Sm A07;
    public final AnonymousClass4XY A08 = new AnonymousClass4XY("Loader:SingleSampleMediaPeriod");
    public final AnonymousClass4SX A09;
    public final C257263x7 A0A;
    public final C250823m7 A0B;
    public final ArrayList A0C = new ArrayList();

    public final void AGR(long j) {
    }

    public final void APR(long j, boolean z) {
    }

    public final long AZp(AnonymousClass4P6 r1, long j) {
        return j;
    }

    public final void Cnk() {
    }

    public final /* bridge */ /* synthetic */ void DOA(C266204Xy r15, long j, long j2) {
        C296785qd r5 = (C296785qd) r15;
        C266214Xz r3 = r5.A03;
        this.A00 = (int) r3.A00;
        byte[] bArr = r5.A00;
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = true;
        this.A05.A05(this.A04, new AnonymousClass4Y0(r3.A01, r5.A02, r3.A02), (Object) null, r5, (Object) null, 1, -1, 0, 0, this.A03);
    }

    public final /* synthetic */ void DOS(C266204Xy r1, int i, long j, long j2) {
    }

    public final long E3Q(long j) {
        return 0;
    }

    public final long E6K() {
        return -9223372036854775807L;
    }

    public final void EB7(long j) {
    }

    public final long EL5(long j, boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return j;
            }
            C296705qV r2 = (C296705qV) arrayList.get(i);
            if (r2.A00 == 2) {
                r2.A00 = 1;
            }
            i++;
        }
    }

    public final long ELF(AnonymousClass4TD[] r5, AnonymousClass4RX[] r6, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < r6.length; i++) {
            AnonymousClass4TD r3 = r5[i];
            if (r3 != null && (r6[i] == null || !zArr[i])) {
                this.A0C.remove(r3);
                r5[i] = null;
            }
            if (r5[i] == null && r6[i] != null) {
                C296705qV r1 = new C296705qV(this);
                this.A0C.add(r1);
                r5[i] = r1;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public final void Efw(boolean z) {
    }

    public final void FKi(byte b, boolean z) {
    }

    public final boolean AJh(long j, long j2) {
        if (this.A01) {
            return false;
        }
        AnonymousClass4XY r4 = this.A08;
        if (r4.A01 != null || r4.A02 != null) {
            return false;
        }
        C257113ws ALo = this.A09.ALo();
        C250823m7 r0 = this.A0B;
        if (r0 != null) {
            ALo.addTransferListener(r0);
        }
        C257263x7 r2 = this.A0A;
        C296785qd r1 = new C296785qd(ALo, r2);
        int i = ((C265074Sl) this.A07).A00;
        if (i == -1) {
            i = 3;
        }
        r4.A02(this, r1, i);
        this.A05.A04(this.A04, new AnonymousClass4Y0(r2), (Object) null, 1, -1, 0, 0, this.A03);
        return true;
    }

    public final /* synthetic */ boolean AJi(C21415XaP xaP) {
        return AJh(xaP.A01, -9223372036854775807L);
    }

    public final long AiS(long j) {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public final long AiU() {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public final long BWC() {
        if (this.A01 || this.A08.A01 != null) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public final C264844Rn C99() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ void DO6(C266204Xy r13, long j, long j2, boolean z) {
        C296785qd r132 = (C296785qd) r13;
        C266214Xz r0 = r132.A03;
        this.A05.A03((C256683wB) null, new AnonymousClass4Y0(r0.A01, r132.A02, r0.A02), (Object) null, 1, -1, 0, 0, this.A03);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass4XZ DOC(C266204Xy r33, IOException iOException, int i, long j, long j2) {
        AnonymousClass4XZ r2;
        C296785qd r1 = (C296785qd) r33;
        C266214Xz r0 = r1.A03;
        AnonymousClass4Y0 r14 = new AnonymousClass4Y0(r0.A01, r1.A02, r0.A02);
        C256683wB r13 = this.A04;
        long j3 = this.A03;
        AnonymousClass4Y4 r22 = new AnonymousClass4Y4(r13, (Object) null, 1, -1, 0, 0, Util.A08(j3));
        C265084Sm r23 = this.A07;
        IOException iOException2 = iOException;
        int i2 = i;
        long Bo4 = r23.Bo4(new XDS(r14, r22, iOException2, i2));
        if (Bo4 != -9223372036854775807L) {
            int i3 = ((C265074Sl) r23).A00;
            if (i3 == -1) {
                i3 = 3;
            }
            if (i2 < i3) {
                r2 = new AnonymousClass4XZ(0, Bo4);
                int i4 = r2.A00;
                boolean z = true;
                if (!(i4 == 0 || i4 == 1)) {
                    z = false;
                }
                this.A05.A01(r13, r14, iOException2, (Object) null, 1, -1, 0, 0, j3, !z);
                return r2;
            }
        }
        2AG.A06("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
        this.A01 = true;
        r2 = AnonymousClass4XY.A04;
        int i42 = r2.A00;
        boolean z2 = true;
        z2 = false;
        this.A05.A01(r13, r14, iOException2, (Object) null, 1, -1, 0, 0, j3, !z2);
        return r2;
    }

    public final boolean isLoading() {
        if (this.A08.A01 != null) {
            return true;
        }
        return false;
    }

    public C284835Ol(C256683wB r4, C265174Sv r5, AnonymousClass4SX r6, C257263x7 r7, C265084Sm r8, C250823m7 r9, long j) {
        this.A0A = r7;
        this.A09 = r6;
        this.A0B = r9;
        this.A04 = r4;
        this.A03 = j;
        this.A07 = r8;
        this.A05 = r5;
        C264844Rn r0 = C264844Rn.A03;
        this.A06 = new C264844Rn(new C264854Ro("", r4));
    }

    public final void E3p(C264924Rv r1, long j) {
        r1.DZ1(this);
    }
}
