package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: X.3Tp  reason: invalid class name and case insensitive filesystem */
public abstract class C242323Tp {
    public TransformationMethod A00(TransformationMethod transformationMethod) {
        C242313To r1 = (C242313To) this;
        if (C13993Tnu.A09 != null) {
            return r1.A00.A00(transformationMethod);
        }
        return transformationMethod;
    }

    public abstract void A02(boolean z);

    public final boolean A03() {
        return ((C242313To) this).A00.A00;
    }

    public abstract InputFilter[] A04(InputFilter[] inputFilterArr);

    public final void A01(boolean z) {
        if (this instanceof C242313To) {
            C242313To r1 = (C242313To) this;
            if (C13993Tnu.A09 != null) {
                r1.A00.A01(z);
                return;
            }
            return;
        }
        C242333Tq r2 = (C242333Tq) this;
        if (z) {
            TextView textView = r2.A01;
            textView.setTransformationMethod(r2.A00(textView.getTransformationMethod()));
        }
    }
}
