package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.3oT  reason: invalid class name and case insensitive filesystem */
public abstract class C252043oT extends View {
    public int A00;
    public Context A01;
    public AnonymousClass3MG A02;
    public String A03;
    public HashMap A04 = new HashMap();
    public int[] A05 = new int[32];
    public String A06;

    public static int A00(C252043oT r7, ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (!(str == null || (resources = r7.A01.getResources()) == null)) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void A09(ConstraintLayout constraintLayout) {
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.A03 = null;
        this.A00 = 0;
        for (int A012 : iArr) {
            A01(A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r2 != 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r2 == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r4 != null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0095
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0095
            android.content.Context r6 = r7.A01
            if (r6 == 0) goto L_0x0095
            java.lang.String r3 = r8.trim()
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x001b
            r7.getParent()
        L_0x001b:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r5 = 0
            if (r0 == 0) goto L_0x005d
            android.view.ViewParent r4 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
        L_0x002a:
            boolean r0 = r7.isInEditMode()
            r2 = 0
            if (r0 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x0058
            java.util.HashMap r0 = r4.A0F
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0058
            java.util.HashMap r0 = r4.A0F
            java.lang.Object r1 = r0.get(r3)
        L_0x0045:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0051
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            if (r2 != 0) goto L_0x0089
        L_0x0051:
            int r2 = A00(r7, r4, r3)
            if (r2 != 0) goto L_0x0089
            goto L_0x005f
        L_0x0058:
            r1 = 0
            goto L_0x0045
        L_0x005a:
            if (r4 == 0) goto L_0x005f
            goto L_0x0051
        L_0x005d:
            r4 = r5
            goto L_0x002a
        L_0x005f:
            java.lang.Class<X.3MD> r0 = X.AnonymousClass3MD.class
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch:{ Exception -> 0x0069 }
            int r2 = r0.getInt(r5)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            if (r2 != 0) goto L_0x0089
            android.content.res.Resources r2 = r6.getResources()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "id"
            int r2 = r2.getIdentifier(r3, r0, r1)
            if (r2 != 0) goto L_0x0089
            java.lang.String r1 = "Could not find id of \""
            java.lang.String r0 = "\""
            java.lang.String r1 = X.002.A0g(r1, r3, r0)
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r1)
            return
        L_0x0089:
            java.util.HashMap r1 = r7.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r3)
            r7.A01(r2)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252043oT.A02(java.lang.String):void");
    }

    private void A03(String str) {
        if (str != null && str.length() != 0 && this.A01 != null) {
            String trim = str.trim();
            ViewGroup viewGroup = null;
            if (getParent() instanceof ConstraintLayout) {
                viewGroup = (ViewGroup) getParent();
            }
            if (viewGroup == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof C71492dQ) && trim.equals(((C71492dQ) layoutParams).A0y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", 002.A0g("to use ConstraintTag view ", childAt.getClass().getSimpleName(), " must have an ID"));
                    } else {
                        A01(childAt.getId());
                    }
                }
            }
        }
    }

    public final void A04() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C71492dQ) {
                ((C71492dQ) layoutParams).A0x = this.A02;
            }
        }
    }

    public void A06(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71482dO.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A03 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.A06 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 == 6) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2 == 6) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.2d3 r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L_0x001a
            r0 = r3
            androidx.constraintlayout.widget.Barrier r0 = (androidx.constraintlayout.widget.Barrier) r0
            int r2 = r0.A00
            r1 = 6
            r0 = 5
            if (r5 == 0) goto L_0x001b
            if (r2 == r0) goto L_0x001f
            if (r2 != r1) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            boolean r0 = r4 instanceof X.AnonymousClass3ME
            if (r0 == 0) goto L_0x001a
            X.3ME r4 = (X.AnonymousClass3ME) r4
            r4.A00 = r2
        L_0x001a:
            return
        L_0x001b:
            if (r2 == r0) goto L_0x0011
            if (r2 != r1) goto L_0x0012
        L_0x001f:
            r2 = 1
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252043oT.A07(X.2d3, boolean):void");
    }

    public void A08(ConstraintLayout constraintLayout) {
        if (this instanceof AnonymousClass3MS) {
            A0A(constraintLayout);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A05, this.A00);
    }

    public void setIds(String str) {
        this.A03 = str;
        if (str != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    A02(str.substring(i));
                    return;
                } else {
                    A02(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.A06 = str;
        if (str != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    A03(str.substring(i));
                    return;
                } else {
                    A03(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public C252043oT(Context context) {
        super(context);
        this.A01 = context;
        A06((AttributeSet) null);
    }

    private void A01(int i) {
        if (i != getId()) {
            int i2 = this.A00 + 1;
            int[] iArr = this.A05;
            int length = iArr.length;
            if (i2 > length) {
                iArr = Arrays.copyOf(iArr, length * 2);
                this.A05 = iArr;
            }
            int i3 = this.A00;
            iArr[i3] = i;
            this.A00 = i3 + 1;
        }
    }

    public final void A05() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A0A((ConstraintLayout) parent);
        }
    }

    public final void A0A(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.A00; i++) {
            View view = (View) constraintLayout.A08.get(this.A05[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1786512111);
        super.onAttachedToWindow();
        String str = this.A03;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            setReferenceTags(str2);
        }
        AnonymousClass0fD.A0D(-239184327, A062);
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.A03 == null) {
            A01(i);
        }
    }

    public C252043oT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = context;
        A06(attributeSet);
    }

    public C252043oT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = context;
        A06(attributeSet);
    }
}
