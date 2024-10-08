package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Deprecated;

@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* renamed from: X.5Ue  reason: invalid class name and case insensitive filesystem */
public final class C286165Ue {
    public AnonymousClass5VN A00;
    public AnonymousClass5VN A01;
    public C3022462f A02;
    public JS3 A03;
    public C285975Tl A04;
    public 0sP A05 = C286175Uf.A00;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Object A0C = new Object();
    public final Matrix A0D = new Matrix();
    public final CursorAnchorInfo.Builder A0E = new CursorAnchorInfo.Builder();
    public final C268134cp A0F;
    public final C285925Tg A0G;
    public final float[] A0H = AnonymousClass5S4.A06();

    public static final void A00(C286165Ue r15) {
        C285915Tf r1 = (C285915Tf) r15.A0G;
        AnonymousClass0eM r3 = r1.A02;
        View view = r1.A00;
        if (((InputMethodManager) r3.getValue()).isActive(view)) {
            0sP r4 = r15.A05;
            float[] fArr = r15.A0H;
            r4.invoke(new AnonymousClass5S4(fArr));
            r15.A0F.CgZ(fArr);
            Matrix matrix = r15.A0D;
            C298435tQ.A00(matrix, fArr);
            CursorAnchorInfo.Builder builder = r15.A0E;
            C285975Tl r10 = r15.A04;
            0qQ.A0A(r10);
            JS3 js3 = r15.A03;
            0qQ.A0A(js3);
            C3022462f r8 = r15.A02;
            0qQ.A0A(r8);
            AnonymousClass5VN r6 = r15.A01;
            0qQ.A0A(r6);
            AnonymousClass5VN r7 = r15.A00;
            0qQ.A0A(r7);
            ((InputMethodManager) r3.getValue()).updateCursorAnchorInfo(view, C56171Hu0.A00(matrix, builder, r6, r7, r8, js3, r10, r15.A09, r15.A07, r15.A08, r15.A0A));
            r15.A06 = false;
        }
    }

    public C286165Ue(C268134cp r2, C285925Tg r3) {
        this.A0F = r2;
        this.A0G = r3;
    }
}
