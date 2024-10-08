package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: X.5pF  reason: invalid class name and case insensitive filesystem */
public final class C295975pF implements AnonymousClass4TH, C264924Rv {
    public C264924Rv A00;
    public AnonymousClass4TI A01;
    public C264844Rn A02;
    public AnonymousClass4TH[] A03;
    public final AnonymousClass4TH[] A04;
    public final C265104So A05;
    public final ArrayList A06 = new ArrayList();
    public final HashMap A07 = new HashMap();
    public final IdentityHashMap A08;

    public final long E3Q(long j) {
        return 0;
    }

    public final void AGR(long j) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass4TI) arrayList.get(i)).AGR(j);
            }
            return;
        }
        this.A01.AGR(j);
    }

    public final boolean AJh(long j, long j2) {
        ArrayList arrayList = this.A06;
        if (arrayList.isEmpty()) {
            return this.A01.AJh(j, j2);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass4TH) arrayList.get(i)).AJh(j, j2);
        }
        return false;
    }

    public final /* synthetic */ boolean AJi(C21415XaP xaP) {
        return AJh(xaP.A01, -9223372036854775807L);
    }

    public final void APR(long j, boolean z) {
        for (AnonymousClass4TH APR : this.A03) {
            APR.APR(j, z);
        }
    }

    public final long AZp(AnonymousClass4P6 r4, long j) {
        AnonymousClass4TH[] r2 = this.A03;
        if (r2.length <= 0) {
            r2 = this.A04;
        }
        return r2[0].AZp(r4, j);
    }

    public final long AiS(long j) {
        return this.A01.AiS(j);
    }

    public final long AiU() {
        return this.A01.AiU();
    }

    public final long BWC() {
        return this.A01.BWC();
    }

    public final C264844Rn C99() {
        C264844Rn r0 = this.A02;
        r0.getClass();
        return r0;
    }

    public final void Cnk() {
        for (AnonymousClass4TH Cnk : this.A04) {
            Cnk.Cnk();
        }
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r2) {
        C264924Rv r0 = this.A00;
        r0.getClass();
        r0.D6K(this);
    }

    public final void DZ1(AnonymousClass4TH r13) {
        ArrayList arrayList = this.A06;
        arrayList.remove(r13);
        if (arrayList.isEmpty()) {
            AnonymousClass4TH[] r10 = this.A04;
            int i = 0;
            for (AnonymousClass4TH C99 : r10) {
                i += C99.C99().A01;
            }
            C264854Ro[] r8 = new C264854Ro[i];
            int i2 = 0;
            for (int i3 = 0; i3 < r9; i3++) {
                C264844Rn C992 = r10[i3].C99();
                int i4 = C992.A01;
                int i5 = 0;
                while (i5 < i4) {
                    C264854Ro r3 = (C264854Ro) C992.A02.get(i5);
                    C264854Ro r1 = new C264854Ro(002.A04(i3, ":", r3.A03), r3.A04);
                    this.A07.put(r1, r3);
                    r8[i2] = r1;
                    i5++;
                    i2++;
                }
            }
            this.A02 = new C264844Rn(r8);
            C264924Rv r0 = this.A00;
            r0.getClass();
            r0.DZ1(this);
        }
    }

    public final void E3p(C264924Rv r5, long j) {
        this.A00 = r5;
        ArrayList arrayList = this.A06;
        AnonymousClass4TH[] r3 = this.A04;
        Collections.addAll(arrayList, r3);
        for (AnonymousClass4TH E3p : r3) {
            E3p.E3p(this, j);
        }
    }

    public final long E6K() {
        long j = -9223372036854775807L;
        for (AnonymousClass4TH r11 : this.A03) {
            long E6K = r11.E6K();
            if (E6K != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    AnonymousClass4TH[] r14 = this.A03;
                    int length = r14.length;
                    int i = 0;
                    while (i < length) {
                        AnonymousClass4TH r0 = r14[i];
                        if (r0 == r11) {
                            break;
                        } else if (r0.EL5(E6K, false) == E6K) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = E6K;
                } else if (E6K != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || r11.EL5(j, false) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final void EB7(long j) {
        this.A01.EB7(j);
    }

    public final long EL5(long j, boolean z) {
        long EL5 = this.A03[0].EL5(j, z);
        int i = 1;
        while (true) {
            AnonymousClass4TH[] r1 = this.A03;
            if (i >= r1.length) {
                return EL5;
            }
            if (r1[i].EL5(EL5, z) == EL5) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long ELF(AnonymousClass4TD[] r28, AnonymousClass4RX[] r29, boolean[] zArr, boolean[] zArr2, long j) {
        AnonymousClass4TD[] r18;
        AnonymousClass4TD r0;
        int intValue;
        long j2 = j;
        int length = r29.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            Number number = null;
            r18 = r28;
            if (i >= length) {
                break;
            }
            AnonymousClass4TD r1 = r28[i];
            if (r1 != null) {
                number = (Number) this.A08.get(r1);
            }
            int i2 = -1;
            if (number == null) {
                intValue = -1;
            } else {
                intValue = number.intValue();
            }
            iArr[i] = intValue;
            AnonymousClass4RX r02 = r29[i];
            if (r02 != null) {
                String str = r02.C98().A03;
                i2 = Integer.parseInt(str.substring(0, str.indexOf(":")));
            }
            iArr2[i] = i2;
            i++;
        }
        IdentityHashMap identityHashMap = this.A08;
        identityHashMap.clear();
        AnonymousClass4TD[] r15 = new AnonymousClass4TD[length];
        AnonymousClass4TD[] r7 = new AnonymousClass4TD[length];
        AnonymousClass4RX[] r14 = new AnonymousClass4RX[length];
        AnonymousClass4TH[] r6 = this.A04;
        int length2 = r6.length;
        ArrayList arrayList = new ArrayList(length2);
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (iArr[i4] == i3) {
                    r0 = r28[i4];
                } else {
                    r0 = null;
                }
                r7[i4] = r0;
                if (iArr2[i4] == i3) {
                    AnonymousClass4RX r16 = r29[i4];
                    r16.getClass();
                    Object obj = this.A07.get(r16.C98());
                    obj.getClass();
                    r14[i4] = new C295995pH((C264854Ro) obj, r16);
                } else {
                    r14[i4] = null;
                }
            }
            long ELF = r6[i3].ELF(r7, r14, zArr, zArr2, j2);
            if (i3 == 0) {
                j2 = ELF;
            } else if (ELF != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    AnonymousClass4TD r13 = r7[i5];
                    r13.getClass();
                    r15[i5] = r7[i5];
                    identityHashMap.put(r13, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (r7[i5] != null) {
                        z2 = false;
                    }
                    C256703wD.A04(z2);
                }
            }
            if (z) {
                arrayList.add(r6[i3]);
            }
        }
        System.arraycopy(r15, 0, r18, 0, length);
        AnonymousClass4TH[] r12 = (AnonymousClass4TH[]) arrayList.toArray(new AnonymousClass4TH[0]);
        this.A03 = r12;
        this.A01 = new AnonymousClass4TT(r12);
        return j2;
    }

    public final void Efw(boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass4TI) arrayList.get(i)).Efw(z);
            }
            return;
        }
        this.A01.Efw(z);
    }

    public final void FKi(byte b, boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass4TI) arrayList.get(i)).FKi(b, z);
            }
            return;
        }
        this.A01.FKi(b, z);
    }

    public final boolean isLoading() {
        return this.A01.isLoading();
    }

    public C295975pF(C265104So r7, long[] jArr, AnonymousClass4TH... r9) {
        this.A05 = r7;
        this.A04 = r9;
        this.A01 = new AnonymousClass4TT(new AnonymousClass4TI[0]);
        this.A08 = new IdentityHashMap();
        this.A03 = new AnonymousClass4TH[0];
        for (int i = 0; i < r9.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.A04[i] = new C300565xQ(r9[i], j);
            }
        }
    }
}
