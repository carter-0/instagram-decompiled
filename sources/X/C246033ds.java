package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.3ds  reason: invalid class name and case insensitive filesystem */
public abstract class C246033ds {
    public static final C246053du A00 = new Object();
    public static final C246053du A01;
    public static final C246053du A02 = new Object();
    public static final C246053du A03;
    public static final C246053du A04;
    public static final C246053du A05;
    public static final C246053du[] A06;

    public static final float A00(View view, boolean z) {
        float y;
        float f = 0.0f;
        while (view != null && (view.getParent() instanceof View) && (!(view instanceof C70682Ty) || !(view instanceof 2UB))) {
            if (z) {
                y = view.getX();
            } else {
                y = view.getY();
            }
            f += y;
            view = (View) view.getParent();
        }
        return f;
    }

    public static final View A01(Drawable drawable) {
        Drawable.Callback callback;
        while (true) {
            if (drawable != null) {
                callback = drawable.getCallback();
            } else {
                callback = null;
            }
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.3du, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.3du, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.3du, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.3du, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.3du, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.3du, java.lang.Object] */
    static {
        ? obj = new Object();
        A04 = obj;
        ? obj2 = new Object();
        A05 = obj2;
        ? obj3 = new Object();
        A03 = obj3;
        ? obj4 = new Object();
        A01 = obj4;
        A06 = new C246053du[]{obj, obj2, obj3, obj4};
    }

    public static final View A02(C246053du r2, Object obj) {
        if (obj instanceof View) {
            return (View) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animating '");
        sb.append(r2.getName());
        sb.append("' is only supported on Views (got ");
        sb.append(obj);
        sb.append(')');
        throw new RuntimeException(sb.toString());
    }

    public static final ArrayList A03(C70682Ty r6) {
        int mountItemCount = r6.getMountItemCount();
        ArrayList arrayList = null;
        for (int i = 0; i < mountItemCount; i++) {
            C246113e2 A0H = r6.A0H(i);
            if ((A0H.A04 instanceof Drawable) && (A0H.A01.A06 instanceof 2Tg)) {
                2Tg r1 = A0H.A01.A06;
                0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.rendercore.transitions.TransitionRenderUnit");
                if ((r1.A00 & 4) != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj = A0H.A04;
                    0qQ.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
