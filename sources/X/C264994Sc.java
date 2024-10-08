package X;

import android.util.SparseArray;

/* renamed from: X.4Sc  reason: invalid class name and case insensitive filesystem */
public final class C264994Sc implements C265004Sd, C265014Se {
    public static final C265044Sh A09 = new Object();
    public static final C265034Sg A0A = new C265024Sf();
    public AnonymousClass4YO A00;
    public C256683wB[] A01;
    public long A02;
    public C266084Xm A03;
    public boolean A04;
    public final AnonymousClass4XT A05;
    public final int A06;
    public final SparseArray A07 = new SparseArray();
    public final C256683wB A08;

    public final void ASU() {
        SparseArray sparseArray = this.A07;
        C256683wB[] r2 = new C256683wB[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C256683wB r0 = ((AnonymousClass4YJ) sparseArray.valueAt(i)).A00;
            C256703wD.A01(r0);
            r2[i] = r0;
        }
        this.A01 = r2;
    }

    public final void CMd(C266084Xm r7, long j, long j2) {
        this.A03 = r7;
        this.A02 = j2;
        boolean z = this.A04;
        AnonymousClass4XT r3 = this.A05;
        if (!z) {
            r3.CMc(this);
            if (j != -9223372036854775807L) {
                r3.EKu(0, j);
            }
            this.A04 = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        r3.EKu(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A07;
            if (i < sparseArray.size()) {
                ((AnonymousClass4YJ) sparseArray.valueAt(i)).A00(r7, j2);
                i++;
            } else {
                return;
            }
        }
    }

    public final C265994Xd FHW(int i, int i2) {
        C256683wB r0;
        SparseArray sparseArray = this.A07;
        AnonymousClass4YJ r3 = (AnonymousClass4YJ) sparseArray.get(i);
        if (r3 != null) {
            return r3;
        }
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        C256703wD.A04(z);
        if (i2 == this.A06) {
            r0 = this.A08;
        } else {
            r0 = null;
        }
        AnonymousClass4YJ r32 = new AnonymousClass4YJ(r0, i, i2);
        r32.A00(this.A03, this.A02);
        sparseArray.put(i, r32);
        return r32;
    }

    public C264994Sc(C256683wB r2, AnonymousClass4XT r3, int i) {
        this.A05 = r3;
        this.A06 = i;
        this.A08 = r2;
    }

    public final void EKx(AnonymousClass4YO r1) {
        this.A00 = r1;
    }
}
