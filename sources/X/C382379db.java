package X;

import android.graphics.RectF;
import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: X.9db  reason: invalid class name and case insensitive filesystem */
public final class C382379db extends C366058o7 implements C344777sP {
    public static final RectF A06 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public int A00;
    public int A01;
    public final SparseArray A02 = new SparseArray();
    public final A6X A03 = new A6X();
    public final C40142ATi A04 = new C40142ATi(this.A01);
    public final ArrayList A05 = AnonymousClass7TE.A1C();

    public C382379db() {
        super(new C344407ro());
    }

    public final void E4c(C344907sc r3) {
        int ordinal = r3.CAG().ordinal();
        if (ordinal == 40) {
            throw AnonymousClass7TE.A11("getBackgroundGradientColor");
        } else if (ordinal == 41) {
            throw AnonymousClass7TE.A11("getZoomCropProperties");
        }
    }

    public final void E4d(C344907sc r1, C345237tA r2) {
        E4c(r1);
    }
}
