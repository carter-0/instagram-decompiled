package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.direct.model.DirectThreadThemeInfo;

public final class NRK extends 0ng {
    public final /* synthetic */ NJ3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRK(NJ3 nj3) {
        super(693, 3, false, false);
        this.A00 = nj3;
    }

    public final void run() {
        String str;
        1NK A002 = 1NK.A00();
        0qQ.A07(A002);
        int i = 0;
        do {
            NJ3 nj3 = this.A00;
            Integer num = nj3.A0K;
            Integer num2 = AnonymousClass05K.A00;
            DirectThreadThemeInfo directThreadThemeInfo = nj3.A0F;
            if (num == num2) {
                if (directThreadThemeInfo != null) {
                    str = directThreadThemeInfo.A0g;
                } else {
                    0qQ.A0F("themeInfo");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else if (directThreadThemeInfo == null) {
                0qQ.A0F("themeInfo");
                throw AnonymousClass00P.createAndThrow();
            } else if (nj3.A0M) {
                str = directThreadThemeInfo.A0h;
            } else {
                str = directThreadThemeInfo.A0m;
            }
            if (str != null) {
                Bitmap A0H = A002.A0H(DbS.A0V(str), "directThreadThemes");
                if (A0H == null || A0H.getByteCount() <= 0) {
                    i++;
                } else {
                    ConstraintLayout constraintLayout = nj3.A03;
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                    C308486Ul.A00(A0H, shapeDrawable, shapeDrawable.getShape());
                    FragmentActivity activity = nj3.getActivity();
                    if (activity != null) {
                        activity.runOnUiThread(new C73199PYd(shapeDrawable, constraintLayout));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } while (i < 3);
    }
}
