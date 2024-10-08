package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.List;

/* renamed from: X.4Sa  reason: invalid class name and case insensitive filesystem */
public final class C264974Sa implements C264984Sb {
    public AnonymousClass4SV A00 = null;
    public 27s A01 = null;
    public C264114Oq A02 = null;
    public C264034Oi A03 = null;
    public 27k A04 = null;
    public boolean A05 = false;
    public AnonymousClass4SX A06;
    public AnonymousClass4SX A07;
    public C250823m7 A08;
    public boolean A09;
    public final int A0A;
    public final AnonymousClass4SZ A0B;
    public final C257163wx A0C;
    public final AnonymousClass4SY A0D;
    public final C265034Sg A0E;
    public final AnonymousClass4SX A0F;

    public C264974Sa(AnonymousClass4SZ r4, AnonymousClass4SV r5, 27s r6, C257163wx r7, C264114Oq r8, C264034Oi r9, AnonymousClass4SY r10, 27k r11, AnonymousClass4SX r12, AnonymousClass4SX r13, AnonymousClass4SX r14, C250823m7 r15, int i, boolean z) {
        C265034Sg r2 = C264994Sc.A0A;
        this.A0E = r2;
        this.A0F = r12;
        this.A0A = i * IgNetworkConsentStorage.MAX_ENTRIES;
        this.A0B = r4;
        this.A0D = r10;
        this.A0C = r7;
        this.A05 = true;
        this.A07 = r13;
        this.A06 = r14;
        this.A09 = z;
        this.A03 = r9;
        this.A04 = r11;
        this.A02 = r8;
        this.A01 = r6;
        this.A00 = r5;
        this.A08 = r15;
        if (r7 == null) {
            throw new NullPointerException(C273654mx.A00(1414));
        }
    }

    public final AnonymousClass4XO ALm(C264544Qh r49, C264894Rs r50, C265174Sv r51, C265194Sx r52, C290505fQ r53, AnonymousClass4TL r54, C256633w6 r55, AnonymousClass4RX r56, AnonymousClass4T1 r57, C250823m7 r58, List list, int[] iArr, int i, int i2, long j, boolean z) {
        AnonymousClass4SX r1;
        int i3 = i2;
        if (i3 == 1) {
            r1 = this.A06;
        } else if (i3 == 2) {
            r1 = this.A07;
        } else {
            r1 = this.A0F;
        }
        C257113ws ALo = r1.ALo();
        C265034Sg r14 = this.A0E;
        int i4 = this.A0A;
        boolean z2 = this.A05;
        boolean z3 = this.A09;
        C264544Qh r15 = r49;
        boolean z4 = r15.A0K;
        C264034Oi r8 = this.A03;
        27k r7 = this.A04;
        C264114Oq r6 = this.A02;
        27s r5 = this.A01;
        C257163wx r4 = this.A0C;
        AnonymousClass4SZ r3 = this.A0B;
        AnonymousClass4SY r2 = this.A0D;
        AnonymousClass4SV r12 = this.A00;
        List list2 = list;
        long j2 = j;
        int i5 = i;
        return new AnonymousClass4XN(r3, r12, r5, r4, r15, r6, r8, r2, r7, r50, r51, r14, r52, r53, r54, r55, r56, ALo, r57, this.A08, list2, iArr, i5, i3, i4, j2, z, z2, z3, z4);
    }
}
