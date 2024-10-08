package X;

import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import java.util.List;

/* renamed from: X.GnW  reason: case insensitive filesystem */
public final class C53399GnW extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53399GnW(X.C54617HLa r2, java.lang.Integer r3, java.lang.Integer r4, kotlin.jvm.internal.DefaultConstructorMarker r5, X.AnonymousClass62P r6, X.AnonymousClass62P r7, int r8, int r9, boolean r10) {
        /*
            r1 = this;
            r0 = 2
            r1.A00 = r0
            X.62M r5 = X.AnonymousClass62M.A01
            X.HLa r2 = X.C54617HLa.LOADING
            r3 = 0
            r7 = 0
            r4 = r3
            r6 = r5
            r1.<init>((X.C54617HLa) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (X.AnonymousClass62P) r5, (X.AnonymousClass62P) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53399GnW.<init>(X.HLa, java.lang.Integer, java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker, X.62P, X.62P, int, int, boolean):void");
    }

    public static /* synthetic */ C53399GnW A00(C61042Jvg jvg, C61082JwK jwK, C53399GnW gnW, C61046Jvk jvk, C54617HLa hLa, C54617HLa hLa2, int i) {
        C61042Jvg jvg2 = jvg;
        C61082JwK jwK2 = jwK;
        C61046Jvk jvk2 = jvk;
        C54617HLa hLa3 = hLa2;
        C54617HLa hLa4 = hLa;
        boolean z = false;
        if ((i & 1) != 0) {
            hLa4 = (C54617HLa) gnW.A03;
        }
        if ((i & 2) != 0) {
            hLa3 = (C54617HLa) gnW.A05;
        }
        if ((i & 4) != 0) {
            z = gnW.A06;
        }
        if ((i & 8) != 0) {
            jvk2 = (C61046Jvk) gnW.A04;
        }
        if ((i & 16) != 0) {
            jwK2 = (C61082JwK) gnW.A02;
        }
        if ((i & 32) != 0) {
            jvg2 = (C61042Jvg) gnW.A01;
        }
        C51973G9u.A0r(3, jvk2, jwK2, jvg2);
        return new C53399GnW(jvg2, jwK2, jvk2, hLa4, hLa3, z);
    }

    public static /* synthetic */ C53399GnW A01(C53399GnW gnW, C59494JLs jLs, I12 i12, HLZ hlz, AnonymousClass62O r11, int i, boolean z) {
        HLZ hlz2 = hlz;
        boolean z2 = z;
        C59494JLs jLs2 = jLs;
        AnonymousClass62O r5 = r11;
        I12 i122 = i12;
        HLB hlb = null;
        if ((i & 1) != 0) {
            i122 = (I12) gnW.A02;
        }
        if ((i & 2) != 0) {
            r5 = (AnonymousClass62O) gnW.A01;
        }
        if ((i & 4) != 0) {
            jLs2 = (C59494JLs) gnW.A04;
        }
        if ((i & 8) != 0) {
            z2 = gnW.A06;
        }
        if ((i & 16) != 0) {
            hlz2 = (HLZ) gnW.A03;
        }
        if ((i & 32) != 0) {
            hlb = (HLB) gnW.A05;
        }
        C51974G9v.A1L(r5, jLs2, hlz2);
        return new C53399GnW(jLs2, hlb, i122, hlz2, r5, z2);
    }

    public final boolean equals(Object obj) {
        C53399GnW gnW;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53399GnW)) {
                    return false;
                }
                C53399GnW gnW2 = (C53399GnW) obj;
                if (gnW2.A00 == 0 && 0qQ.A0K(this.A02, gnW2.A02) && 0qQ.A0K(this.A01, gnW2.A01) && 0qQ.A0K(this.A04, gnW2.A04) && this.A06 == gnW2.A06 && this.A03 == gnW2.A03 && this.A05 == gnW2.A05) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53399GnW)) {
                    return false;
                }
                C53399GnW gnW3 = (C53399GnW) obj;
                if (gnW3.A00 == 1 && this.A03 == gnW3.A03 && this.A05 == gnW3.A05 && this.A06 == gnW3.A06 && 0qQ.A0K(this.A04, gnW3.A04) && 0qQ.A0K(this.A02, gnW3.A02) && 0qQ.A0K(this.A01, gnW3.A01)) {
                    return true;
                }
                return false;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53399GnW) {
                    gnW = (C53399GnW) obj;
                    if (gnW.A00 == 2 && 0qQ.A0K(this.A05, gnW.A05) && 0qQ.A0K(this.A03, gnW.A03) && this.A04 == gnW.A04 && 0qQ.A0K(this.A01, gnW.A01)) {
                        obj2 = this.A02;
                        obj3 = gnW.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53399GnW) {
                    gnW = (C53399GnW) obj;
                    if (gnW.A00 == 3 && 0qQ.A0K(this.A01, gnW.A01) && 0qQ.A0K(this.A02, gnW.A02) && 0qQ.A0K(this.A05, gnW.A05) && 0qQ.A0K(this.A04, gnW.A04)) {
                        obj2 = this.A03;
                        obj3 = gnW.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3) || this.A06 != gnW.A06) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07;
        int A0L;
        int A072;
        switch (this.A00) {
            case 0:
                A07 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A02) * 31))));
                A0L = AnonymousClass7TE.A0L(this.A05);
                break;
            case 1:
                A0L = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A06, ((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31)));
                A07 = this.A01.hashCode();
                break;
            case 2:
                A072 = ((AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A05))) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
                break;
            default:
                Object obj = this.A05;
                A072 = AnonymousClass7TE.A0N(this.A03, (AnonymousClass7TF.A07(obj, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31);
                break;
        }
        A0L = A072 * 31;
        A07 = 1237;
        if (this.A06) {
            A07 = 1231;
        }
        return A07 + A0L;
    }

    public C53399GnW(C61042Jvg jvg, C61082JwK jwK, C61046Jvk jvk, C54617HLa hLa, C54617HLa hLa2, boolean z) {
        this.A03 = hLa;
        this.A05 = hLa2;
        this.A06 = z;
        this.A04 = jvk;
        this.A02 = jwK;
        this.A01 = jvg;
    }

    public C53399GnW(1Xj r3, ProductCollectionCover productCollectionCover, CharSequence charSequence, CharSequence charSequence2, List list, boolean z) {
        0qQ.A0B(productCollectionCover, 1);
        DbW.A1N(charSequence, 3, list);
        this.A01 = productCollectionCover;
        this.A02 = r3;
        this.A05 = charSequence;
        this.A04 = charSequence2;
        this.A03 = list;
        this.A06 = z;
    }

    public C53399GnW(C54617HLa hLa, Integer num, Integer num2, AnonymousClass62P r5, AnonymousClass62P r6, boolean z) {
        this.A05 = r5;
        this.A03 = r6;
        this.A04 = hLa;
        this.A01 = num;
        this.A02 = num2;
        this.A06 = z;
    }

    public C53399GnW(C59494JLs jLs, HLB hlb, I12 i12, HLZ hlz, AnonymousClass62O r6, boolean z) {
        this.A02 = i12;
        this.A01 = r6;
        this.A04 = jLs;
        this.A06 = z;
        this.A03 = hlz;
        this.A05 = hlb;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53399GnW() {
        /*
            r10 = this;
            r9 = 1
            r3 = r10
            r10.A00 = r9
            r7 = 0
            r2 = 3
            r1 = 0
            r0 = 7
            X.Jvk r6 = new X.Jvk
            r6.<init>(r0)
            r0 = 19
            X.JwK r5 = new X.JwK
            r5.<init>((java.util.List) r7, (int) r2, (int) r0)
            r0 = 11
            X.Jvg r4 = new X.Jvg
            r4.<init>((int) r2, (int) r0, (boolean) r1)
            r8 = r7
            r3.<init>((X.C61042Jvg) r4, (X.C61082JwK) r5, (X.C61046Jvk) r6, (X.C54617HLa) r7, (X.C54617HLa) r8, (boolean) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53399GnW.<init>():void");
    }
}
