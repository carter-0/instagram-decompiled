package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

public final class WCI implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WCI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onPreDraw() {
        int i = this.A00;
        View view = (View) this.A01;
        switch (i) {
            case 0:
                C13988Tno.A12(view, this);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                C18521VtL vtL = (C18521VtL) this.A02;
                RectF rectF = vtL.A0A;
                int i2 = iArr[0];
                rectF.set((float) i2, (float) iArr[1], (float) (i2 + view.getWidth()), (float) (iArr[1] + view.getHeight()));
                float A002 = JTP.A00((float) view.getWidth(), view);
                ViewGroup viewGroup = vtL.A0B;
                float width = ((float) viewGroup.getWidth()) / A002;
                float height = (((float) viewGroup.getHeight()) - width) * 0.5f;
                vtL.A09.set(0.0f, height, (float) viewGroup.getWidth(), width + height);
                return true;
            case 1:
                C13988Tno.A12(view, this);
                ((Runnable) this.A02).run();
                return true;
            case 2:
                C13988Tno.A12(view, this);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                C15696Uh2 uh2 = (C15696Uh2) this.A02;
                int[] iArr3 = uh2.A0K;
                int i3 = iArr3[0] - iArr2[0];
                int i4 = iArr3[1] - iArr2[1];
                int[] iArr4 = uh2.A0L;
                if (iArr4 != null) {
                    float width2 = ((float) iArr4[0]) / ((float) view.getWidth());
                    float A003 = JTP.A00((float) iArr4[1], view);
                    view.setPivotX(0.0f);
                    view.setPivotY(0.0f);
                    view.setScaleX(width2);
                    view.setScaleY(A003);
                }
                view.setTranslationX((float) i3);
                view.setTranslationY((float) i4);
                2cs r2 = uh2.A0E;
                r2.A08(0.0d, true);
                r2.A0A(uh2);
                r2.A03();
                return true;
            default:
                C13988Tno.A12(view, this);
                BottomSheetFragment.A08((BottomSheetFragment) this.A02);
                return false;
        }
    }
}
