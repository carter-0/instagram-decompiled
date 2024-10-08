package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public final class AWH implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AWH(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr optionalTreeField;
        String optionalStringField;
        switch (this.A00) {
            case 0:
                Number number = (Number) obj;
                InteractiveDrawableContainer interactiveDrawableContainer = (InteractiveDrawableContainer) this.A01;
                0qQ.A0A(number);
                int intValue = number.intValue();
                Drawable A0M = interactiveDrawableContainer.A0M(intValue);
                C369458un A0N = interactiveDrawableContainer.A0N(intValue);
                if (A0M == null || A0N == null) {
                    return null;
                }
                if ((!(A0M instanceof AnonymousClass9XH) && !(A0M instanceof AnonymousClass9XG) && (AnonymousClass9SF.A04(A0M) || AnonymousClass9SF.A01(A0M) != null)) || A0M.getBounds().height() <= 0 || AnonymousClass7TF.A06(A0M) <= 0) {
                    return null;
                }
                TreeSet treeSet = new TreeSet();
                RectF rectF = new RectF(A0M.getBounds());
                Matrix matrix = (Matrix) this.A03;
                matrix.reset();
                float f = A0N.A06;
                matrix.preScale(f, f, A0N.A03, A0N.A04);
                matrix.preTranslate(A0N.A01, A0N.A02);
                matrix.mapRect(rectF);
                treeSet.add(new C282765Eq(rectF, A0N.A05, intValue, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight()));
                ((LinkedHashMap) this.A02).put(A0M, treeSet);
                return null;
            case 1:
                C250663lr r14 = (C250663lr) obj;
                if (!(r14 == null || (optionalTreeField = r14.getOptionalTreeField(0, Pxd.A00(648), C383069ey.class, -2029332908)) == null || (optionalStringField = optionalTreeField.getOptionalStringField(0, "encrypted_card_number")) == null)) {
                    ((C2818659w) this.A02).A02(C11097S9y.A00(((2HJ) this.A01).A01(optionalStringField)));
                    ((OMB) this.A03).A00();
                }
                return C60340gF.A00;
            default:
                Throwable th = (Throwable) obj;
                ((C2818659w) this.A01).A02(C11097S9y.A01(th));
                ((OMB) this.A02).A00();
                return th;
        }
    }
}
