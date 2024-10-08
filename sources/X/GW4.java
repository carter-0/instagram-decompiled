package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class GW4 implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GW4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.A00) {
            case 0:
                AnonymousClass54O r2 = (AnonymousClass54O) this.A02;
                AnonymousClass07Z A002 = C71362ch.A00(r2);
                if (A002 != null) {
                    ((0rm) this.A01).A00 = C52449GTb.A00(r2, A002.getLifecycle());
                    r2.removeOnAttachStateChangeListener(this);
                    return;
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("View tree for ");
                A1A.append(r2);
                I2E.A02(AnonymousClass7TF.A0l(" has no ViewTreeLifecycleOwner", A1A));
                throw AnonymousClass00P.createAndThrow();
            case 3:
                C11380SQs.A00((Activity) this.A01, (C11380SQs) this.A02);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 1:
            case 2:
                ((RecyclerView) this.A01).setAdapter((2Rw) this.A02);
                return;
            case 4:
                View view2 = ((C55973Hqe) this.A02).A01;
                view2.getViewTreeObserver().removeOnDrawListener((XF9) this.A01);
                view2.removeOnAttachStateChangeListener(this);
                return;
            default:
                return;
        }
    }
}
