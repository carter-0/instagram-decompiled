package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.4cl  reason: invalid class name and case insensitive filesystem */
public abstract class C268104cl {
    public boolean A00;

    public int A01() {
        return ((AndroidComposeView) ((C268114cm) this).A00).A0Y.A0U.A0J.A01;
    }

    public AnonymousClass5Q8 A02() {
        return ((C268114cm) this).A00.getLayoutDirection();
    }

    public final void A04(GraphicsLayer graphicsLayer, C267974cY r7, long j) {
        if (!(A02() == AnonymousClass5Q8.Ltr || A01() == 0)) {
            j = AnonymousClass5TW.A00((A01() - r7.A01) - ((int) (j >> 32)), (int) (j & 4294967295L));
        }
        A00(r7);
        r7.A0I(graphicsLayer, 0.0f, C289165d8.A01(j, r7.A02));
    }

    public final void A07(C267974cY r10, int i, int i2) {
        long A002 = AnonymousClass5TW.A00(i, i2);
        if (!(A02() == AnonymousClass5Q8.Ltr || A01() == 0)) {
            A002 = AnonymousClass5TW.A00((A01() - r10.A01) - ((int) (A002 >> 32)), (int) (A002 & 4294967295L));
        }
        A00(r10);
        r10.A0J((0sP) null, 0.0f, C289165d8.A01(A002, r10.A02));
    }

    public final void A08(C267974cY r7, long j) {
        if (!(A02() == AnonymousClass5Q8.Ltr || A01() == 0)) {
            j = AnonymousClass5TW.A00((A01() - r7.A01) - ((int) (j >> 32)), (int) (j & 4294967295L));
        }
        A00(r7);
        r7.A0J((0sP) null, 0.0f, C289165d8.A01(j, r7.A02));
    }

    public final void A0B(C267974cY r8, 0sP r9, int i, int i2) {
        long A002 = AnonymousClass5TW.A00(i, i2);
        if (!(A02() == AnonymousClass5Q8.Ltr || A01() == 0)) {
            A002 = AnonymousClass5TW.A00((A01() - r8.A01) - ((int) (A002 >> 32)), (int) (A002 & 4294967295L));
        }
        A00(r8);
        r8.A0J(r9, 0.0f, C289165d8.A01(A002, r8.A02));
    }

    public final void A0C(C267974cY r6, 0sP r7, long j) {
        if (!(A02() == AnonymousClass5Q8.Ltr || A01() == 0)) {
            j = AnonymousClass5TW.A00((A01() - r6.A01) - ((int) (j >> 32)), (int) (j & 4294967295L));
        }
        A00(r6);
        r6.A0J(r7, 0.0f, C289165d8.A01(j, r6.A02));
    }

    private final void A00(C267974cY r2) {
        if (r2 instanceof C268044cf) {
            ((C268044cf) r2).Efr(this.A00);
        }
    }

    public final void A03(GraphicsLayer graphicsLayer, C267974cY r4, float f, long j) {
        A00(r4);
        r4.A0I(graphicsLayer, f, C289165d8.A01(j, r4.A02));
    }

    public final void A05(C267974cY r5, float f, int i, int i2) {
        long A002 = AnonymousClass5TW.A00(i, i2);
        A00(r5);
        r5.A0J((0sP) null, f, C289165d8.A01(A002, r5.A02));
    }

    public final void A06(C267974cY r4, float f, long j) {
        A00(r4);
        r4.A0J((0sP) null, f, C289165d8.A01(j, r4.A02));
    }

    public final void A09(C267974cY r5, 0sP r6, float f, int i, int i2) {
        long A002 = AnonymousClass5TW.A00(i, i2);
        A00(r5);
        r5.A0J(r6, f, C289165d8.A01(A002, r5.A02));
    }

    public final void A0A(C267974cY r3, 0sP r4, float f, long j) {
        A00(r3);
        r3.A0J(r4, f, C289165d8.A01(j, r3.A02));
    }
}
