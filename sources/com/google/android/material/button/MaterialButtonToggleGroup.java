package com.google.android.material.button;

import X.03v;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20381WqM;
import X.C297835sR;
import X.C297855sT;
import X.C297865sU;
import X.C297895sX;
import X.C297935sb;
import X.C66581MXm;
import X.DbS;
import X.JTP;
import X.U7M;
import X.WMT;
import X.WMU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public int A00;
    public boolean A01;
    public boolean A02;
    public Integer[] A03;
    public boolean A04;
    public final Comparator A05;
    public final LinkedHashSet A06;
    public final List A07;
    public final WMT A08;
    public final WMU A09;

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.A0C.add(this.A08);
        materialButton.A02 = this.A09;
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void A01(MaterialButtonToggleGroup materialButtonToggleGroup) {
        Iterator it = materialButtonToggleGroup.A06.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void setCheckedId(int i) {
        this.A00 = i;
        A01(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.VZ0, java.lang.Object] */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            A02(this, materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C297895sX shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        List list = this.A07;
        C297935sb r4 = shapeAppearanceModel.A02;
        C297935sb r3 = shapeAppearanceModel.A00;
        C297935sb r2 = shapeAppearanceModel.A03;
        C297935sb r1 = shapeAppearanceModel.A01;
        ? obj = new Object();
        obj.A02 = r4;
        obj.A03 = r2;
        obj.A01 = r1;
        obj.A00 = r3;
        list.add(obj);
        03v.A0B(materialButton, new U7M(this, 1));
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A05);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C66581MXm.A1S(getChildAt(i), treeMap, i);
        }
        this.A03 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.A01) {
            return this.A00;
        }
        return -1;
    }

    public List getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.isChecked()) {
                AnonymousClass7TF.A1M(arrayList, materialButton.getId());
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A03;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public void setSelectionRequired(boolean z) {
        this.A04 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            this.A02 = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                materialButton.setChecked(false);
                materialButton.getId();
                A01(this);
            }
            this.A02 = false;
            setCheckedId(-1);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 2132018531), attributeSet, i);
        this.A07 = new ArrayList();
        this.A08 = new WMT(this);
        this.A09 = new WMU(this);
        this.A06 = new LinkedHashSet();
        this.A05 = new C20381WqM((Object) this, 6);
        this.A02 = false;
        TypedArray A002 = C297855sT.A00(getContext(), attributeSet, C297865sU.A0K, new int[0], i, 2132018531);
        setSingleSelection(A002.getBoolean(2, false));
        this.A00 = A002.getResourceId(0, -1);
        this.A04 = A002.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        A002.recycle();
        setImportantForAccessibility(1);
    }

    private void A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0) {
                ViewGroup.MarginLayoutParams A0D = DbS.A0D(getChildAt(firstVisibleChildIndex));
                if (getOrientation() == 1) {
                    A0D.topMargin = 0;
                    A0D.bottomMargin = 0;
                    return;
                }
                A0D.setMarginEnd(0);
                A0D.setMarginStart(0);
                A0D.leftMargin = 0;
                A0D.rightMargin = 0;
            }
        }
    }

    public static boolean A02(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        List checkedButtonIds = materialButtonToggleGroup.getCheckedButtonIds();
        if (!materialButtonToggleGroup.A04 || !checkedButtonIds.isEmpty()) {
            if (z && materialButtonToggleGroup.A01) {
                checkedButtonIds.remove(Integer.valueOf(i));
                Iterator it = checkedButtonIds.iterator();
                while (it.hasNext()) {
                    View findViewById = materialButtonToggleGroup.findViewById(AnonymousClass7TG.A0F(it));
                    if (findViewById instanceof MaterialButton) {
                        materialButtonToggleGroup.A02 = true;
                        ((MaterialButton) findViewById).setChecked(false);
                        materialButtonToggleGroup.A02 = false;
                    }
                    A01(materialButtonToggleGroup);
                }
            }
            return true;
        }
        View findViewById2 = materialButtonToggleGroup.findViewById(i);
        if (findViewById2 instanceof MaterialButton) {
            materialButtonToggleGroup.A02 = true;
            ((MaterialButton) findViewById2).setChecked(true);
            materialButtonToggleGroup.A02 = false;
        }
        materialButtonToggleGroup.A00 = i;
        return false;
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != 8) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                return -1;
            }
        } while (getChildAt(childCount).getVisibility() == 8);
        return childCount;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            JTP.A13(materialButton);
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [X.VZ0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [X.VZ0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v8, types: [X.VZ0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v9, types: [X.VZ0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        r0 = X.AnonymousClass7TF.A1Q(getOrientation());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r4 != r6) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r0 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (getLayoutDirection() != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r9 = X.VZ0.A04;
        r0 = r8.A03;
        r1 = r8.A01;
        r8 = new java.lang.Object();
        r8.A02 = r9;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r8.A03 = r0;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r8.A01 = r1;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r8.A00 = r9;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r2.A02 = r8.A02;
        r2.A00 = r8.A00;
        r2.A03 = r8.A03;
        r2.A01 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r1 = r8.A02;
        r9 = X.VZ0.A04;
        r0 = r8.A03;
        r8 = new java.lang.Object();
        r8.A02 = r1;
        r8.A03 = r0;
        r8.A01 = r9;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r4 != r5) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (r0 == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (getLayoutDirection() != 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r0 = r8.A02;
        r9 = r8.A00;
        r1 = X.VZ0.A04;
        r8 = new java.lang.Object();
        r8.A02 = r0;
        r8.A03 = r1;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r0 = X.VZ0.A04;
        r9 = r8.A00;
        r1 = r8.A01;
        r8 = new java.lang.Object();
        r8.A02 = r0;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r8 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r2.A00(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r3.setShapeAppearanceModel(new X.C297895sX(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r10 = this;
            int r7 = r10.getChildCount()
            int r6 = r10.getFirstVisibleChildIndex()
            int r5 = r10.getLastVisibleChildIndex()
            r4 = 0
        L_0x000d:
            if (r4 >= r7) goto L_0x00b3
            android.view.View r3 = r10.getChildAt(r4)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x003e
            X.5sX r0 = r3.getShapeAppearanceModel()
            X.6yg r2 = new X.6yg
            r2.<init>(r0)
            java.util.List r0 = r10.A07
            java.lang.Object r8 = r0.get(r4)
            X.VZ0 r8 = (X.VZ0) r8
            if (r6 != r5) goto L_0x0041
            if (r8 != 0) goto L_0x0067
        L_0x0032:
            r0 = 0
            r2.A00(r0)
        L_0x0036:
            X.5sX r0 = new X.5sX
            r0.<init>(r2)
            r3.setShapeAppearanceModel(r0)
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0041:
            int r0 = r10.getOrientation()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r4 != r6) goto L_0x008a
            if (r0 == 0) goto L_0x0078
            int r1 = r10.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0095
        L_0x0054:
            X.5sb r9 = X.VZ0.A04
            X.5sb r0 = r8.A03
            X.5sb r1 = r8.A01
            X.VZ0 r8 = new X.VZ0
            r8.<init>()
            r8.A02 = r9
        L_0x0061:
            r8.A03 = r0
        L_0x0063:
            r8.A01 = r1
        L_0x0065:
            r8.A00 = r9
        L_0x0067:
            X.5sb r0 = r8.A02
            r2.A02 = r0
            X.5sb r0 = r8.A00
            r2.A00 = r0
            X.5sb r0 = r8.A03
            r2.A03 = r0
            X.5sb r0 = r8.A01
            r2.A01 = r0
            goto L_0x0036
        L_0x0078:
            X.5sb r1 = r8.A02
            X.5sb r9 = X.VZ0.A04
            X.5sb r0 = r8.A03
            X.VZ0 r8 = new X.VZ0
            r8.<init>()
            r8.A02 = r1
            r8.A03 = r0
            r8.A01 = r9
            goto L_0x0065
        L_0x008a:
            if (r4 != r5) goto L_0x0032
            if (r0 == 0) goto L_0x00a5
            int r1 = r10.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0054
        L_0x0095:
            X.5sb r0 = r8.A02
            X.5sb r9 = r8.A00
            X.5sb r1 = X.VZ0.A04
            X.VZ0 r8 = new X.VZ0
            r8.<init>()
            r8.A02 = r0
            r8.A03 = r1
            goto L_0x0063
        L_0x00a5:
            X.5sb r0 = X.VZ0.A04
            X.5sb r9 = r8.A00
            X.5sb r1 = r8.A01
            X.VZ0 r8 = new X.VZ0
            r8.<init>()
            r8.A02 = r0
            goto L_0x0061
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.A03():void");
    }

    public final void onFinishInflate() {
        MaterialButton materialButton;
        int A062 = AnonymousClass0fD.A06(1157104945);
        super.onFinishInflate();
        int i = this.A00;
        if (!(i == -1 || (materialButton = (MaterialButton) findViewById(i)) == null)) {
            materialButton.setChecked(true);
        }
        AnonymousClass0fD.A0D(-1724857838, A062);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        int i = 2;
        if (this.A01) {
            i = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    public final void onMeasure(int i, int i2) {
        A03();
        A00();
        super.onMeasure(i, i2);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.A0C.remove(this.A08);
            materialButton.A02 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A07.remove(indexOfChild);
        }
        A03();
        A00();
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }
}
