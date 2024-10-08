package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.W2f  reason: case insensitive filesystem */
public final class C18797W2f {
    public static final Matrix A00 = new Matrix();
    public static final float[] A01 = new float[2];
    public static final float[] A02 = new float[2];
    public static final PointF A03 = new PointF();

    public static View A01(View view, EnumSet enumSet, List list, float[] fArr) {
        X60 x60;
        int i;
        float[] fArr2 = fArr;
        if (enumSet.contains(C16486Uvh.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!A03(view, fArr[0], fArr[1])) {
                if (view instanceof XBf) {
                    if (view.getId() % 2 == 0) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        Rect overflowInset = ((XBf) view).getOverflowInset();
                        if (f < ((float) overflowInset.left) || f >= ((float) (view.getWidth() - overflowInset.right)) || f2 < ((float) overflowInset.top) || f2 >= ((float) (view.getHeight() - overflowInset.bottom))) {
                            return null;
                        }
                    }
                    String overflow = ((C20874X2a) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            if (viewGroup instanceof X60) {
                x60 = (X60) viewGroup;
            } else {
                x60 = null;
            }
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                if (x60 != null) {
                    i = x60.CHb(i2);
                } else {
                    i = i2;
                }
                View childAt = viewGroup.getChildAt(i);
                PointF pointF = A03;
                float f3 = fArr[0];
                float f4 = fArr[1];
                float scrollX = (f3 + ((float) viewGroup.getScrollX())) - ((float) childAt.getLeft());
                float scrollY = (f4 + ((float) viewGroup.getScrollY())) - ((float) childAt.getTop());
                Matrix matrix = childAt.getMatrix();
                if (!matrix.isIdentity()) {
                    float[] fArr3 = A02;
                    fArr3[0] = scrollX;
                    fArr3[1] = scrollY;
                    Matrix matrix2 = A00;
                    matrix.invert(matrix2);
                    matrix2.mapPoints(fArr3);
                    scrollX = fArr3[0];
                    scrollY = fArr3[1];
                }
                pointF.set(scrollX, scrollY);
                float f5 = fArr[0];
                float f6 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View A022 = A02(childAt, list, fArr2);
                if (A022 != null) {
                    return A022;
                }
                fArr[0] = f5;
                fArr[1] = f6;
            }
        }
        if (!enumSet.contains(C16486Uvh.SELF) || !A03(view, fArr[0], fArr[1])) {
            return null;
        }
        return view;
    }

    public static View A02(View view, List list, float[] fArr) {
        C16510UwB uwB;
        EnumSet of;
        if (view instanceof C20830X0f) {
            uwB = ((U3r) ((C20830X0f) view)).A04;
        } else {
            uwB = C16510UwB.AUTO;
        }
        if (!view.isEnabled()) {
            if (uwB == C16510UwB.AUTO) {
                uwB = C16510UwB.BOX_NONE;
            } else if (uwB == C16510UwB.BOX_ONLY) {
                uwB = C16510UwB.A05;
            }
        }
        View view2 = null;
        if (uwB != C16510UwB.A05) {
            if (uwB == C16510UwB.BOX_ONLY) {
                of = EnumSet.of(C16486Uvh.SELF);
            } else if (uwB == C16510UwB.BOX_NONE) {
                View A012 = A01(view, EnumSet.of(C16486Uvh.CHILD), list, fArr);
                if (A012 != null) {
                    if (list != null) {
                        list.add(new C17964Viy(view, view.getId()));
                    }
                    return A012;
                } else if ((view instanceof X2Z) && A03(view, fArr[0], fArr[1]) && ((X2Z) view).E66(fArr[0], fArr[1]) != view.getId()) {
                    if (list != null) {
                        list.add(new C17964Viy(view, view.getId()));
                    }
                    return view;
                }
            } else {
                if (uwB != C16510UwB.AUTO) {
                    C13989Tnp.A1T("Unknown pointer event type: ", uwB.toString());
                }
                of = EnumSet.of(C16486Uvh.SELF, C16486Uvh.CHILD);
            }
            view2 = A01(view, of, list, fArr);
            if (!(view2 == null || list == null)) {
                list.add(new C17964Viy(view, view.getId()));
            }
        }
        return view2;
    }

    public static boolean A03(View view, float f, float f2) {
        int height;
        Rect rect;
        if (!(view instanceof C20828X0d) || (rect = ((U3r) ((C20828X0d) view)).A02) == null) {
            if (f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f) {
                height = view.getHeight();
            }
            return false;
        }
        if (f >= ((float) (-rect.left)) && f < ((float) (view.getWidth() + rect.right)) && f2 >= ((float) (-rect.top))) {
            height = view.getHeight() + rect.bottom;
        }
        return false;
        if (f2 < ((float) height)) {
            return true;
        }
        return false;
    }

    public static int A00(ViewGroup viewGroup, float[] fArr, float f, float f2) {
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View A022 = A02(viewGroup, (List) null, fArr);
        while (A022 != null) {
            if (A022.getId() <= 0) {
                A022 = (View) A022.getParent();
            } else {
                float f3 = fArr[0];
                float f4 = fArr[1];
                if (A022 instanceof X2Z) {
                    return ((X2Z) A022).E66(f3, f4);
                }
                return A022.getId();
            }
        }
        return id;
    }
}
