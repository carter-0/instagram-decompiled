package X;

import java.io.IOException;

/* renamed from: X.4Xw  reason: invalid class name and case insensitive filesystem */
public final class C266184Xw extends C266194Xx {
    public C266084Xm A00;
    public long A01;
    public final C265014Se A02;
    public volatile boolean A03;

    public C266184Xw(C256683wB r12, C265014Se r13, C257113ws r14, C257263x7 r15, Object obj, int i) {
        super(r12, r14, r15, obj, 2, i, -9223372036854775807L, -9223372036854775807L);
        this.A02 = r13;
    }

    public final void AGO() {
        this.A03 = true;
    }

    public final void Cg1() {
        C257263x7 r5;
        AnonymousClass4Y6 r6;
        if (this.A01 == 0) {
            this.A02.CMd(this.A00, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            r5 = this.A06;
            long j = this.A01;
            long j2 = r5.A03;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            C257263x7 A002 = r5.A00(j, j3);
            C266214Xz r7 = this.A07;
            r6 = new AnonymousClass4Y6(r7, A002.A02, r7.open(A002));
            while (!this.A03) {
                int E68 = ((C264994Sc) this.A02).A05.E68(r6, C264994Sc.A09);
                boolean z = false;
                if (E68 != 1) {
                    z = true;
                }
                C256703wD.A04(z);
                if (E68 == 0) {
                }
            }
            this.A01 = r6.A02 - r5.A02;
            try {
                r7.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
