package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TyN  reason: case insensitive filesystem */
public final class C14558TyN extends FrameLayout {
    public static final Interpolator A07 = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public X0I A00;
    public boolean A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final ObjectAnimator A05;
    public final Animator.AnimatorListener A06;

    private void A00(long j, long j2) {
        ObjectAnimator objectAnimator = this.A04;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
        }
        ObjectAnimator objectAnimator2 = this.A05;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j2);
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(j);
        }
        ObjectAnimator objectAnimator4 = this.A03;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(j2);
        }
    }

    public static void A01(View view, C14558TyN tyN) {
        X0I x0i = tyN.A00;
        if (x0i != null) {
            C14556TyL tyL = (C14556TyL) x0i;
            for (C14559TyO tyO : tyL.A0G) {
                if (tyO.A00 == view) {
                    tyO.A03.AOx();
                    tyO.A00 = null;
                }
            }
            Iterator it = tyL.A0H.iterator();
            while (it.hasNext()) {
                C14559TyO tyO2 = (C14559TyO) it.next();
                if (tyO2.A00 == view) {
                    it.remove();
                    C21043XAw xAw = tyO2.A03;
                    xAw.AOx();
                    tyO2.A00 = null;
                    xAw.destroy();
                }
            }
        }
        tyN.removeView(view);
    }

    public static void A02(View view, C14558TyN tyN, Integer num, boolean z) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float[] fArr;
        boolean z2;
        if (num == null) {
            num = AnonymousClass05K.A00;
        }
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                tyN.A00(280, 200);
                Context context = tyN.getContext();
                if ((context.getApplicationInfo().flags & 4194304) != 0) {
                    z2 = C13988Tno.A1W(1, Pxf.A0G(context).getLayoutDirection());
                } else {
                    z2 = false;
                }
                ObjectAnimator objectAnimator3 = tyN.A04;
                if (objectAnimator3 != null) {
                    objectAnimator3.setProperty(View.TRANSLATION_X);
                    float[] fArr2 = new float[2];
                    int width = tyN.getWidth();
                    if (z2) {
                        width = -width;
                    }
                    fArr2[0] = (float) width;
                    fArr2[1] = 0.0f;
                    objectAnimator3.setFloatValues(fArr2);
                }
                ObjectAnimator objectAnimator4 = tyN.A05;
                if (objectAnimator4 != null) {
                    objectAnimator4.setProperty(View.TRANSLATION_X);
                    float[] fArr3 = new float[2];
                    fArr3[0] = 0.0f;
                    int width2 = tyN.getWidth();
                    if (!z2) {
                        width2 = -width2;
                    }
                    fArr3[1] = (float) width2;
                    objectAnimator4.setFloatValues(fArr3);
                }
                ObjectAnimator objectAnimator5 = tyN.A02;
                if (objectAnimator5 != null) {
                    objectAnimator5.setProperty(View.TRANSLATION_X);
                    float[] fArr4 = new float[2];
                    int width3 = tyN.getWidth();
                    if (!z2) {
                        width3 = -width3;
                    }
                    fArr4[0] = (float) width3;
                    fArr4[1] = 0.0f;
                    objectAnimator5.setFloatValues(fArr4);
                }
                objectAnimator2 = tyN.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.setProperty(View.TRANSLATION_X);
                    fArr = new float[2];
                    fArr[0] = 0.0f;
                    int width4 = tyN.getWidth();
                    if (z2) {
                        width4 = -width4;
                    }
                    fArr[1] = (float) width4;
                }
            } else {
                tyN.A00(250, 250);
                ObjectAnimator objectAnimator6 = tyN.A04;
                if (objectAnimator6 != null) {
                    objectAnimator6.setProperty(View.ALPHA);
                    objectAnimator6.setFloatValues(new float[]{0.0f, 1.0f});
                }
                ObjectAnimator objectAnimator7 = tyN.A05;
                if (objectAnimator7 != null) {
                    objectAnimator7.setProperty(View.ALPHA);
                    objectAnimator7.setFloatValues(new float[]{1.0f, 0.0f});
                }
                ObjectAnimator objectAnimator8 = tyN.A02;
                if (objectAnimator8 != null) {
                    objectAnimator8.setProperty(View.ALPHA);
                    objectAnimator8.setFloatValues(new float[]{0.0f, 1.0f});
                }
                objectAnimator2 = tyN.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.setProperty(View.ALPHA);
                    fArr = new float[]{1.0f, 0.0f};
                }
            }
            objectAnimator2.setFloatValues(fArr);
        } else {
            tyN.A00(0, 0);
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            if (parent == tyN) {
                tyN.removeView(view);
            } else {
                throw new IllegalStateException("Trying to show a view that is attached to a different parent");
            }
        }
        int i = -1;
        if (tyN.A01) {
            i = -2;
        }
        tyN.addView(view, new ViewGroup.LayoutParams(-1, i));
        int childCount = tyN.getChildCount();
        ObjectAnimator objectAnimator9 = null;
        if (num == AnonymousClass05K.A0C) {
            objectAnimator = null;
        } else if (z) {
            objectAnimator = tyN.A04;
            objectAnimator9 = tyN.A05;
        } else {
            objectAnimator = tyN.A02;
            objectAnimator9 = tyN.A03;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = tyN.getChildAt(i2);
            if (childAt == view) {
                childAt.setVisibility(0);
                if (childCount > 1 && objectAnimator != null) {
                    if (objectAnimator.isStarted()) {
                        objectAnimator.cancel();
                    }
                    objectAnimator.setTarget(childAt);
                    objectAnimator.start();
                }
            } else if (childAt.getVisibility() == 0) {
                if (objectAnimator9 != null) {
                    if (objectAnimator9.isStarted()) {
                        objectAnimator9.cancel();
                    }
                    objectAnimator9.setTarget(childAt);
                    objectAnimator9.start();
                } else {
                    arrayList.add(childAt);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A01((View) it.next(), tyN);
        }
    }

    public void setOnViewRemovedListener(X0I x0i) {
        this.A00 = x0i;
    }

    public C14558TyN(Context context) {
        super(context);
        U0N u0n = new U0N(this, 2);
        this.A06 = u0n;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A07;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(u0n);
        this.A04 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A05 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(u0n);
        this.A02 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A03 = objectAnimator4;
    }

    public View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }
}
