package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

public final class I0D {
    public AnonymousClass5VN A00;
    public AnonymousClass5VN A01;
    public C3022462f A02;
    public JS3 A03;
    public C285975Tl A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Object A0B = new Object();
    public final Matrix A0C = new Matrix();
    public final CursorAnchorInfo.Builder A0D = new CursorAnchorInfo.Builder();
    public final MRM A0E;
    public final 0sP A0F;
    public final float[] A0G = AnonymousClass5S4.A06();

    public static final void A00(I0D i0d) {
        I0D i0d2 = i0d;
        C56854IFb iFb = (C56854IFb) i0d2.A0E;
        AnonymousClass0eM r4 = iFb.A01;
        View view = iFb.A00;
        if (((InputMethodManager) r4.getValue()).isActive(view)) {
            float[] fArr = i0d2.A0G;
            AnonymousClass5S4.A02(fArr);
            i0d2.A0F.invoke(new AnonymousClass5S4(fArr));
            AnonymousClass5VN r0 = i0d2.A00;
            0qQ.A0A(r0);
            float f = -r0.A01;
            AnonymousClass5VN r02 = i0d2.A00;
            0qQ.A0A(r02);
            AnonymousClass5S4.A04(fArr, f, -r02.A03);
            Matrix matrix = i0d2.A0C;
            C298435tQ.A00(matrix, fArr);
            CursorAnchorInfo.Builder builder = i0d2.A0D;
            C285975Tl r12 = i0d2.A04;
            0qQ.A0A(r12);
            JS3 js3 = i0d2.A03;
            0qQ.A0A(js3);
            C3022462f r10 = i0d2.A02;
            0qQ.A0A(r10);
            AnonymousClass5VN r8 = i0d2.A01;
            0qQ.A0A(r8);
            AnonymousClass5VN r9 = i0d2.A00;
            0qQ.A0A(r9);
            ((InputMethodManager) r4.getValue()).updateCursorAnchorInfo(view, C56166Htv.A00(matrix, builder, r8, r9, r10, js3, r12, i0d2.A08, i0d2.A06, i0d2.A07, i0d2.A09));
            i0d2.A05 = false;
        }
    }

    public I0D(MRM mrm, 0sP r3) {
        this.A0F = r3;
        this.A0E = mrm;
    }
}
