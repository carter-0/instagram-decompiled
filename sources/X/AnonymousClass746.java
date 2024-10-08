package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.746  reason: invalid class name */
public final class AnonymousClass746 implements C328287Ef {
    public final C328047Df A00;
    public final C331277Qg A01;
    public final Collection A02;
    public final Collection A03;
    public final Collection A04;
    public final Collection A05;
    public final Collection A06;
    public final Collection A07;
    public final Collection A08;
    public final Collection A09;

    public final void Ehf(C242553Us r6) {
        0qQ.A0B(r6, 0);
        C328047Df r4 = this.A00;
        if (r4.A02(r6, AnonymousClass05K.A00)) {
            for (C328047Df A022 : this.A07) {
                A022.A02(r4.A09, AnonymousClass05K.A0C);
            }
            for (C328047Df A023 : this.A09) {
                A023.A02(r4.A09, AnonymousClass05K.A0N);
            }
            for (C328047Df A024 : this.A03) {
                A024.A02(r4.A09, AnonymousClass05K.A0j);
            }
            for (C328047Df A025 : this.A05) {
                A025.A02(r4.A09, AnonymousClass05K.A0u);
            }
        }
    }

    public final void FM4(C242553Us r4, float f) {
        0qQ.A0B(r4, 0);
        if (this.A01.A05(r4, AnonymousClass05K.A00, f)) {
            for (C331277Qg A052 : this.A06) {
                A052.A05(r4, AnonymousClass05K.A0C, f);
            }
            for (C331277Qg A053 : this.A08) {
                A053.A05(r4, AnonymousClass05K.A0N, f);
            }
            for (C331277Qg A054 : this.A02) {
                A054.A05(r4, AnonymousClass05K.A0j, f);
            }
            for (C331277Qg A055 : this.A04) {
                A055.A05(r4, AnonymousClass05K.A0u, f);
            }
        }
    }

    public final void AHu() {
        C328047Df r6 = this.A00;
        Integer num = AnonymousClass05K.A00;
        C242553Us r5 = r6.A0A;
        if (r5.A00 != num || r5.A01[0] != 0.0f) {
            Arrays.fill(r5.A01, C242553Us.A00(num), C328647Fp.A00(AnonymousClass05K.A15) + 1, 0.0f);
            C242553Us.A01(r5);
            r6.A03 = true;
            for (C331277Qg A042 : this.A06) {
                A042.A04(AnonymousClass05K.A0C);
            }
            for (C331277Qg A043 : this.A08) {
                A043.A04(AnonymousClass05K.A0N);
            }
            for (C331277Qg A044 : this.A02) {
                A044.A04(AnonymousClass05K.A0j);
            }
            for (C331277Qg A045 : this.A04) {
                A045.A04(AnonymousClass05K.A0u);
            }
        }
    }

    public final C242553Us BKr() {
        return this.A00.A08;
    }

    public final C242553Us BzG() {
        return this.A00.A09;
    }

    public final void CsL(float f) {
        for (C331277Qg r0 : this.A06) {
            AnonymousClass7PT.A00(r0.A01, (int) f);
        }
        for (C331277Qg r02 : this.A08) {
            AnonymousClass7PT.A00(r02.A01, (int) f);
        }
        for (C331277Qg r03 : this.A02) {
            AnonymousClass7PT.A00(r03.A01, (int) f);
        }
        for (C331277Qg r04 : this.A04) {
            AnonymousClass7PT.A00(r04.A01, (int) f);
        }
    }

    public final void EI5() {
        C328047Df r0 = this.A00;
        r0.A08.A08(r0.A09, AnonymousClass05K.A00);
        for (C328047Df r02 : this.A07) {
            r02.A08.A08(r02.A09, AnonymousClass05K.A0C);
        }
        for (C328047Df r03 : this.A09) {
            r03.A08.A08(r03.A09, AnonymousClass05K.A0N);
        }
        for (C328047Df r04 : this.A03) {
            r04.A08.A08(r04.A09, AnonymousClass05K.A0j);
        }
        for (C328047Df r05 : this.A05) {
            r05.A08.A08(r05.A09, AnonymousClass05K.A0u);
        }
    }

    public AnonymousClass746(Collection collection, Collection collection2, Collection collection3, Collection collection4, Collection collection5, Collection collection6, Collection collection7, Collection collection8) {
        C328047Df A002;
        C328047Df A003;
        C328047Df A004;
        C328047Df A005;
        C328047Df r1 = new C328047Df((C242553Us) null, 127);
        this.A00 = r1;
        new Object();
        C331277Qg r0 = (C331277Qg) AnonymousClass762.A00(r1, false).A01;
        this.A01 = r0;
        Collection collection9 = collection5;
        this.A06 = collection9;
        Collection collection10 = collection7;
        this.A08 = collection10;
        this.A02 = collection;
        this.A04 = collection3;
        this.A07 = collection6;
        this.A09 = collection8;
        this.A03 = collection2;
        this.A05 = collection4;
        C331277Qg r10 = (C331277Qg) 00k.A0A(collection9);
        C331277Qg r9 = (C331277Qg) 00k.A0A(collection10);
        C331277Qg r8 = (C331277Qg) 00k.A0A(collection);
        C331277Qg r7 = (C331277Qg) 00k.A0A(collection3);
        Shape shape = r0.A03;
        boolean z = false;
        if (shape instanceof C328047Df) {
            if (!(r10 == null || (A005 = r10.A00()) == null)) {
                C328047Df r4 = (C328047Df) shape;
                C242553Us r02 = A005.A09;
                Integer num = AnonymousClass05K.A0C;
                r4.A02(r02, num);
                C242553Us r2 = A005.A0A;
                0qQ.A0B(r2, 0);
                r4.A0A.A08(r2, num);
                r4.A03 = true;
                Drawable drawable = (Drawable) r10.A05.get();
                if (drawable != null) {
                    drawable.invalidateSelf();
                }
                z = true;
            }
            if (!(r9 == null || (A004 = r9.A00()) == null)) {
                C328047Df r42 = (C328047Df) shape;
                C242553Us r03 = A004.A09;
                Integer num2 = AnonymousClass05K.A0N;
                r42.A02(r03, num2);
                C242553Us r22 = A004.A0A;
                0qQ.A0B(r22, 0);
                r42.A0A.A08(r22, num2);
                r42.A03 = true;
                Drawable drawable2 = (Drawable) r9.A05.get();
                if (drawable2 != null) {
                    drawable2.invalidateSelf();
                }
                z = true;
            }
            if (!(r8 == null || (A003 = r8.A00()) == null)) {
                C328047Df r43 = (C328047Df) shape;
                C242553Us r04 = A003.A09;
                Integer num3 = AnonymousClass05K.A0j;
                r43.A02(r04, num3);
                C242553Us r23 = A003.A0A;
                0qQ.A0B(r23, 0);
                r43.A0A.A08(r23, num3);
                r43.A03 = true;
                Drawable drawable3 = (Drawable) r8.A05.get();
                if (drawable3 != null) {
                    drawable3.invalidateSelf();
                }
                z = true;
            }
            if (r7 != null && (A002 = r7.A00()) != null) {
                C328047Df r44 = (C328047Df) shape;
                C242553Us r05 = A002.A09;
                Integer num4 = AnonymousClass05K.A0u;
                r44.A02(r05, num4);
                C242553Us r24 = A002.A0A;
                0qQ.A0B(r24, 0);
                r44.A0A.A08(r24, num4);
                r44.A03 = true;
                Drawable drawable4 = (Drawable) r7.A05.get();
                if (drawable4 != null) {
                    drawable4.invalidateSelf();
                }
            } else if (!z) {
                return;
            }
            C328047Df r5 = (C328047Df) shape;
            r5.A08.A08(r5.A09, AnonymousClass05K.A00);
        }
    }
}
