package X;

import android.view.View;

/* renamed from: X.Wdc  reason: case insensitive filesystem */
public final class C19674Wdc implements C315626kE {
    public final int A00;
    public final Object A01;

    public C19674Wdc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Df0() {
        View view;
        int i;
        switch (this.A00) {
            case 0:
                C15697Uh3 uh3 = (C15697Uh3) this.A01;
                int intValue = uh3.A09.intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        view = uh3.A00;
                        if (view != null) {
                            view.setTranslationY((float) uh3.A0E);
                            i = 8;
                        }
                        0qQ.A0F("canvasContainer");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    uh3.A0R.onFinish();
                    return;
                }
                view = uh3.A00;
                if (view != null) {
                    view.setTranslationY(0.0f);
                    i = 0;
                }
                0qQ.A0F("canvasContainer");
                throw AnonymousClass00P.createAndThrow();
                view.setVisibility(i);
                uh3.A0R.onFinish();
                return;
            case 1:
                DbS.A1U(this.A01);
                return;
            default:
                ((View) this.A01).setVisibility(0);
                return;
        }
    }
}
