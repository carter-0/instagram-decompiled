package X;

import android.view.View;

public abstract class V4M {
    public float A00(Object obj) {
        if (this instanceof C14003To5) {
            return ((C14003To5) this).A01.A00;
        }
        if (this instanceof C14009ToB) {
            View view = (View) obj;
            switch (((C14009ToB) this).A00) {
                case 0:
                    return view.getY();
                case 1:
                    return view.getAlpha();
                case 2:
                    return view.getTranslationY();
                case 3:
                    return view.getScaleX();
                case 4:
                    return view.getScaleY();
                case 5:
                    return view.getRotation();
                case 6:
                    return view.getRotationX();
                case 7:
                    return view.getRotationY();
                default:
                    return view.getX();
            }
        } else {
            U12 u12 = (U12) obj;
            0qQ.A0B(u12, 0);
            return u12.A00;
        }
    }

    public void A01(Object obj, float f) {
        if (this instanceof C14009ToB) {
            View view = (View) obj;
            switch (((C14009ToB) this).A00) {
                case 0:
                    view.setY(f);
                    return;
                case 1:
                    view.setAlpha(f);
                    return;
                case 2:
                    view.setTranslationY(f);
                    return;
                case 3:
                    view.setScaleX(f);
                    return;
                case 4:
                    view.setScaleY(f);
                    return;
                case 5:
                    view.setRotation(f);
                    return;
                case 6:
                    view.setRotationX(f);
                    return;
                case 7:
                    view.setRotationY(f);
                    return;
                default:
                    view.setX(f);
                    return;
            }
        } else if (this instanceof C14003To5) {
            ((C14003To5) this).A01.A00 = f;
        } else {
            U12 u12 = (U12) obj;
            0qQ.A0B(u12, 0);
            if (u12.A00 != f) {
                u12.A00 = f;
                u12.invalidateSelf();
            }
        }
    }
}
