package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.GkZ  reason: case insensitive filesystem */
public final class C53225GkZ extends C53226Gka implements C59650JRs {
    public final ViewGroup A00;
    public final I4U A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53225GkZ(View view, ViewGroup viewGroup, I4U i4u, C56500HzW hzW, Integer num) {
        super(viewGroup, i4u, hzW, num == null ? AnonymousClass05K.A00 : num, view);
        this.A01 = i4u;
        this.A00 = viewGroup;
    }

    public final C61082JwK BMF() {
        boolean A1Z;
        Object obj = this.A02;
        if (0qQ.A0K(obj.getClass(), View.class)) {
            View view = (View) obj;
            if (view.getBackground() == null && view.getForeground() == null) {
                A1Z = false;
                View view2 = (View) obj;
                0qQ.A0B(view2, 0);
                int[] iArr = I4U.A0B;
                view2.getLocationOnScreen(iArr);
                Rect A07 = C51976G9y.A07(view2);
                A07.offsetTo(iArr[0], iArr[1]);
                return new C61082JwK(1, (Object) A07, A1Z);
            }
        }
        A1Z = AnonymousClass7TF.A1Z(this.A07);
        View view22 = (View) obj;
        0qQ.A0B(view22, 0);
        int[] iArr2 = I4U.A0B;
        view22.getLocationOnScreen(iArr2);
        Rect A072 = C51976G9y.A07(view22);
        A072.offsetTo(iArr2[0], iArr2[1]);
        return new C61082JwK(1, (Object) A072, A1Z);
    }
}
