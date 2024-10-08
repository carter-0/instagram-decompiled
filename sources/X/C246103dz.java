package X;

import android.view.View;

/* renamed from: X.3dz  reason: invalid class name and case insensitive filesystem */
public final class C246103dz implements C246053du {
    public final float AWv(AnonymousClass2VT r7) {
        0qQ.A0B(r7, 0);
        2TG r5 = r7.A03;
        if (r5 == null || (r5.A0F & 524288) == 0) {
            return 1.0f;
        }
        return r5.A04;
    }

    public final float AWw(Object obj) {
        0qQ.A0B(obj, 0);
        View A02 = C246033ds.A02(this, obj);
        float scaleX = A02.getScaleX();
        if (scaleX == A02.getScaleY()) {
            return scaleX;
        }
        throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
    }

    public final void EHt(Object obj) {
        0qQ.A0B(obj, 0);
        View A02 = C246033ds.A02(this, obj);
        A02.setScaleX(1.0f);
        A02.setScaleY(1.0f);
    }

    public final void ENI(Object obj, float f) {
        0qQ.A0B(obj, 0);
        View A02 = C246033ds.A02(this, obj);
        A02.setScaleX(f);
        A02.setScaleY(f);
    }

    public final String getName() {
        return "scale";
    }
}
