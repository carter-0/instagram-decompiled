package androidx.constraintlayout.widget;

import X.2d1;
import X.2d3;
import X.2d5;
import X.2dM;
import X.AnonymousClass3MQ;
import X.AnonymousClass972;
import X.C21283XSo;
import X.C252043oT;
import X.C270354gb;
import X.C270364gc;
import X.C320056rh;
import X.C71482dO;
import X.C71492dQ;
import X.VQQ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public static VQQ A0I;
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = Integer.MAX_VALUE;
    public int A04 = Integer.MAX_VALUE;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 257;
    public SparseArray A08 = new SparseArray();
    public SparseArray A09 = new SparseArray();
    public 2d1 A0A = new 2d1();
    public 2dM A0B = new 2dM(this, this);
    public C270364gc A0C = null;
    public C270354gb A0D = null;
    public ArrayList A0E = new ArrayList(4);
    public HashMap A0F = new HashMap();
    public boolean A0G = true;
    public C21283XSo A0H;

    public final void forceLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.forceLayout();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C71492dQ(-2, -2);
    }

    public final void requestLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.requestLayout();
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A00(AttributeSet attributeSet, int i, int i2) {
        2d1 r7 = this.A0A;
        r7.A0m = this;
        2dM r1 = this.A0B;
        r7.A08 = r1;
        r7.A0A.A02 = r1;
        this.A08.put(getId(), this);
        this.A0D = null;
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71482dO.A01, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.A06 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A06);
                } else if (index == 17) {
                    this.A05 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A05);
                } else if (index == 14) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 15) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 113) {
                    this.A07 = obtainStyledAttributes.getInt(index, this.A07);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0C = new C270364gc(context, this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A0C = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C270354gb r11 = new C270354gb();
                        this.A0D = r11;
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    C320056rh A012 = C270354gb.A01(context, Xml.asAttributeSet(xml), false);
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A012.A03.A14 = true;
                                    }
                                    r11.A00.put(Integer.valueOf(A012.A00), A012);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0D = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        r7.A0d(this.A07);
    }

    public static VQQ getSharedValues() {
        VQQ vqq = A0I;
        if (vqq != null) {
            return vqq;
        }
        VQQ vqq2 = new VQQ();
        A0I = vqq2;
        return vqq2;
    }

    private void setWidgetBaseline(2d3 r6, C71492dQ r7, SparseArray sparseArray, int i, 2d5 r10) {
        View view = (View) this.A08.get(i);
        2d3 r2 = (2d3) sparseArray.get(i);
        if (r2 != null && view != null && (view.getLayoutParams() instanceof C71492dQ)) {
            r7.A17 = true;
            2d5 r1 = 2d5.A01;
            if (r10 == r1) {
                C71492dQ r0 = (C71492dQ) view.getLayoutParams();
                r0.A17 = true;
                r0.A0x.A0q = true;
            }
            r6.A0A(r1).A06(r2.A0A(r10), r7.A0B, r7.A0O, true);
            r6.A0q = true;
            r6.A0A(2d5.A08).A03();
            r6.A0A(2d5.A02).A03();
        }
    }

    public final 2d3 A0C(View view) {
        if (view == this) {
            return this.A0A;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof C71492dQ)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof C71492dQ)) {
                return null;
            }
        }
        return ((C71492dQ) view.getLayoutParams()).A0x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
            r23 = this;
            r11 = r23
            java.util.ArrayList r2 = r11.A0E
            r16 = 0
            if (r2 == 0) goto L_0x0017
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0017
            r0 = 0
        L_0x000f:
            r2.get(r0)
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            r10 = r24
            super.dispatchDraw(r10)
            boolean r0 = r11.isInEditMode()
            if (r0 == 0) goto L_0x00d2
            int r0 = r11.getWidth()
            float r9 = (float) r0
            int r0 = r11.getHeight()
            float r8 = (float) r0
            r15 = 1149698048(0x44870000, float:1080.0)
            r14 = 1156579328(0x44f00000, float:1920.0)
            int r7 = r11.getChildCount()
            r6 = 0
        L_0x0035:
            if (r6 >= r7) goto L_0x00d2
            android.view.View r2 = r11.getChildAt(r6)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00ce
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)
            int r2 = r1.length
            r0 = 4
            if (r2 != r0) goto L_0x00ce
            r0 = r1[r16]
            int r4 = java.lang.Integer.parseInt(r0)
            r0 = 1
            r0 = r1[r0]
            int r3 = java.lang.Integer.parseInt(r0)
            r0 = 2
            r0 = r1[r0]
            int r2 = java.lang.Integer.parseInt(r0)
            r0 = 3
            r0 = r1[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            float r0 = (float) r4
            float r0 = r0 / r15
            float r0 = r0 * r9
            int r13 = (int) r0
            float r0 = (float) r3
            float r0 = r0 / r14
            float r0 = r0 * r8
            int r12 = (int) r0
            float r0 = (float) r2
            float r0 = r0 / r15
            float r0 = r0 * r9
            int r2 = (int) r0
            float r0 = (float) r1
            float r0 = r0 / r14
            float r0 = r0 * r8
            int r1 = (int) r0
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r5.setColor(r0)
            float r4 = (float) r13
            float r3 = (float) r12
            int r13 = r13 + r2
            float r2 = (float) r13
            r21 = r3
            r22 = r5
            r19 = r3
            r20 = r2
            r18 = r4
            r17 = r10
            r17.drawLine(r18, r19, r20, r21, r22)
            int r12 = r12 + r1
            float r1 = (float) r12
            r18 = r2
            r21 = r1
            r17.drawLine(r18, r19, r20, r21, r22)
            r19 = r1
            r20 = r4
            r17.drawLine(r18, r19, r20, r21, r22)
            r18 = r4
            r21 = r3
            r17.drawLine(r18, r19, r20, r21, r22)
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r5.setColor(r0)
            r21 = r1
            r19 = r3
            r20 = r2
            r17.drawLine(r18, r19, r20, r21, r22)
            r19 = r1
            r21 = r3
            r17.drawLine(r18, r19, r20, r21, r22)
        L_0x00ce:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int getMaxHeight() {
        return this.A03;
    }

    public int getMaxWidth() {
        return this.A04;
    }

    public int getMinHeight() {
        return this.A05;
    }

    public int getMinWidth() {
        return this.A06;
    }

    public int getOptimizationLevel() {
        return this.A0A.A01;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        2d1 r5 = this.A0A;
        String str = r5.A0o;
        if (str == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            r5.A0o = str;
        }
        if (r5.A0n == null) {
            r5.A0n = str;
        }
        Iterator it = r5.A00.iterator();
        while (it.hasNext()) {
            2d3 r2 = (2d3) it.next();
            View view = (View) r2.A0m;
            if (view != null) {
                if (r2.A0o == null && (id = view.getId()) != -1) {
                    r2.A0o = getContext().getResources().getResourceEntryName(id);
                }
                if (r2.A0n == null) {
                    r2.A0n = r2.A0o;
                }
            }
        }
        r5.A0T(sb);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0609, code lost:
        if (r16 == 0) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0611, code lost:
        if (r16 == 0) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0613, code lost:
        r9 = java.lang.Math.max(0, r2.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x061d, code lost:
        if (r16 == 0) goto L_0x0627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0625, code lost:
        if (r16 == 0) goto L_0x0627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0627, code lost:
        r0 = java.lang.Math.max(0, r2.A06);
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0455 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r27, int r28) {
        /*
            r26 = this;
            r2 = r26
            boolean r0 = r2.A0G
            r4 = 0
            if (r0 != 0) goto L_0x001b
            int r3 = r2.getChildCount()
            r1 = 0
        L_0x000c:
            if (r1 >= r3) goto L_0x001b
            android.view.View r0 = r2.getChildAt(r1)
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x006d
            r0 = 1
            r2.A0G = r0
        L_0x001b:
            X.2d1 r5 = r2.A0A
            r1 = 0
            android.content.Context r18 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r18.getApplicationInfo()
            int r0 = r0.flags
            r17 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r17
            r6 = 1
            if (r0 == 0) goto L_0x0036
            int r0 = r2.getLayoutDirection()
            if (r6 != r0) goto L_0x0036
            r1 = 1
        L_0x0036:
            r5.A0H = r1
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x04ed
            r2.A0G = r4
            int r3 = r2.getChildCount()
            r1 = 0
        L_0x0043:
            if (r1 >= r3) goto L_0x04ed
            android.view.View r0 = r2.getChildAt(r1)
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x006a
            boolean r19 = r2.isInEditMode()
            int r8 = r2.getChildCount()
            r1 = 0
        L_0x0058:
            if (r1 >= r8) goto L_0x0070
            android.view.View r0 = r2.getChildAt(r1)
            X.2d3 r0 = r2.A0C(r0)
            if (r0 == 0) goto L_0x0067
            r0.A0B()
        L_0x0067:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x006a:
            int r1 = r1 + 1
            goto L_0x0043
        L_0x006d:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0070:
            r3 = -1
            if (r19 == 0) goto L_0x00f3
            r10 = 0
        L_0x0074:
            if (r10 >= r8) goto L_0x00f3
            android.view.View r11 = r2.getChildAt(r10)
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ NotFoundException -> 0x00f0 }
            int r0 = r11.getId()     // Catch:{ NotFoundException -> 0x00f0 }
            java.lang.String r9 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x00f0 }
            int r0 = r11.getId()     // Catch:{ NotFoundException -> 0x00f0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r9 == 0) goto L_0x00af
            java.util.HashMap r0 = r2.A0F     // Catch:{ NotFoundException -> 0x00f0 }
            if (r0 != 0) goto L_0x009b
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00f0 }
            r0.<init>()     // Catch:{ NotFoundException -> 0x00f0 }
            r2.A0F = r0     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x009b:
            r1 = r9
            java.lang.String r0 = "/"
            int r0 = r9.indexOf(r0)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r0 == r3) goto L_0x00aa
            int r0 = r0 + 1
            java.lang.String r1 = r9.substring(r0)     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00aa:
            java.util.HashMap r0 = r2.A0F     // Catch:{ NotFoundException -> 0x00f0 }
            r0.put(r1, r7)     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00af:
            r0 = 47
            int r0 = r9.indexOf(r0)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r0 == r3) goto L_0x00bd
            int r0 = r0 + 1
            java.lang.String r9 = r9.substring(r0)     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00bd:
            int r7 = r11.getId()     // Catch:{ NotFoundException -> 0x00f0 }
            if (r7 == 0) goto L_0x00e4
            android.util.SparseArray r0 = r2.A08     // Catch:{ NotFoundException -> 0x00f0 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ NotFoundException -> 0x00f0 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ NotFoundException -> 0x00f0 }
            if (r1 != 0) goto L_0x00e1
            android.view.View r1 = r2.findViewById(r7)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r1 == 0) goto L_0x00df
            if (r1 == r2) goto L_0x00e1
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ NotFoundException -> 0x00f0 }
            if (r0 != r2) goto L_0x00e1
            r2.onViewAdded(r1)     // Catch:{ NotFoundException -> 0x00f0 }
            goto L_0x00e1
        L_0x00df:
            r0 = 0
            goto L_0x00ee
        L_0x00e1:
            if (r1 == r2) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r0 = r5
            goto L_0x00ee
        L_0x00e6:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()     // Catch:{ NotFoundException -> 0x00f0 }
            X.2dQ r0 = (X.C71492dQ) r0     // Catch:{ NotFoundException -> 0x00f0 }
            X.2d3 r0 = r0.A0x     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00ee:
            r0.A0n = r9     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00f0:
            int r10 = r10 + 1
            goto L_0x0074
        L_0x00f3:
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0104
            r1 = 0
        L_0x00f8:
            if (r1 >= r8) goto L_0x0104
            android.view.View r0 = r2.getChildAt(r1)
            r0.getId()
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x0104:
            X.4gb r0 = r2.A0D
            if (r0 == 0) goto L_0x010b
            r0.A0H(r2)
        L_0x010b:
            java.util.ArrayList r0 = r5.A00
            r0.clear()
            java.util.ArrayList r11 = r2.A0E
            int r10 = r11.size()
            r9 = 0
            if (r10 > 0) goto L_0x0122
        L_0x0119:
            r0 = 0
        L_0x011a:
            if (r0 >= r8) goto L_0x01c1
            r2.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x011a
        L_0x0122:
            java.lang.Object r13 = r11.get(r9)
            X.3oT r13 = (X.C252043oT) r13
            boolean r0 = r13.isInEditMode()
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r13.A03
            r13.setIds(r0)
        L_0x0133:
            X.3MG r0 = r13.A02
            if (r0 == 0) goto L_0x01bb
            X.3MF r0 = (X.AnonymousClass3MF) r0
            r0.A00 = r4
            X.2d3[] r1 = r0.A01
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            r12 = 0
        L_0x0142:
            int r0 = r13.A00
            if (r12 >= r0) goto L_0x01a3
            int[] r0 = r13.A05
            r1 = r0[r12]
            android.util.SparseArray r15 = r2.A08
            java.lang.Object r0 = r15.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0179
            java.util.HashMap r14 = r13.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r14.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            int r1 = X.C252043oT.A00(r13, r2, r7)
            if (r1 == 0) goto L_0x01a0
            int[] r0 = r13.A05
            r0[r12] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r14.put(r0, r7)
            java.lang.Object r0 = r15.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x01a0
        L_0x0179:
            X.3MG r7 = r13.A02
            X.2d3 r14 = r2.A0C(r0)
            X.3MF r7 = (X.AnonymousClass3MF) r7
            if (r14 == r7) goto L_0x01a0
            if (r14 == 0) goto L_0x01a0
            int r0 = r7.A00
            int r15 = r0 + 1
            X.2d3[] r1 = r7.A01
            int r0 = r1.length
            if (r15 <= r0) goto L_0x0198
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.2d3[] r1 = (X.2d3[]) r1
            r7.A01 = r1
        L_0x0198:
            int r0 = r7.A00
            r1[r0] = r14
            int r0 = r0 + 1
            r7.A00 = r0
        L_0x01a0:
            int r12 = r12 + 1
            goto L_0x0142
        L_0x01a3:
            X.3MG r7 = r13.A02
            X.3MF r7 = (X.AnonymousClass3MF) r7
            boolean r0 = r7 instanceof X.AnonymousClass3MR
            if (r0 == 0) goto L_0x01bb
            r1 = 0
        L_0x01ac:
            int r0 = r7.A00
            if (r1 >= r0) goto L_0x01bb
            X.2d3[] r0 = r7.A01
            r0 = r0[r1]
            if (r0 == 0) goto L_0x01b8
            r0.A0s = r6
        L_0x01b8:
            int r1 = r1 + 1
            goto L_0x01ac
        L_0x01bb:
            int r9 = r9 + 1
            if (r9 >= r10) goto L_0x0119
            goto L_0x0122
        L_0x01c1:
            android.util.SparseArray r7 = r2.A09
            r7.clear()
            r7.put(r4, r5)
            int r0 = r2.getId()
            r7.put(r0, r5)
            r9 = 0
        L_0x01d1:
            if (r9 >= r8) goto L_0x01e5
            android.view.View r0 = r2.getChildAt(r9)
            X.2d3 r1 = r2.A0C(r0)
            int r0 = r0.getId()
            r7.put(r0, r1)
            int r9 = r9 + 1
            goto L_0x01d1
        L_0x01e5:
            r16 = 0
        L_0x01e7:
            r0 = r16
            if (r0 >= r8) goto L_0x04e8
            android.view.View r10 = r2.getChildAt(r0)
            X.2d3 r1 = r2.A0C(r10)
            if (r1 == 0) goto L_0x0242
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.2dQ r0 = (X.C71492dQ) r0
            java.util.ArrayList r9 = r5.A00
            r9.add(r1)
            X.2d3 r9 = r1.A0h
            if (r9 == 0) goto L_0x020e
            X.2d2 r9 = (X.AnonymousClass2d2) r9
            java.util.ArrayList r9 = r9.A00
            r9.remove(r1)
            r1.A0B()
        L_0x020e:
            r1.A0h = r5
            r0.A00()
            int r9 = r10.getVisibility()
            r1.A0R = r9
            r1.A0m = r10
            boolean r9 = r10 instanceof X.C252043oT
            if (r9 == 0) goto L_0x0226
            X.3oT r10 = (X.C252043oT) r10
            boolean r9 = r5.A0H
            r10.A07(r1, r9)
        L_0x0226:
            boolean r9 = r0.A15
            if (r9 == 0) goto L_0x0259
            X.3MQ r1 = (X.AnonymousClass3MQ) r1
            int r12 = r0.A0j
            int r11 = r0.A0k
            float r10 = r0.A07
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0245
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0242
            r1.A00 = r10
            r1.A02 = r3
        L_0x0240:
            r1.A03 = r3
        L_0x0242:
            int r16 = r16 + 1
            goto L_0x01e7
        L_0x0245:
            if (r12 == r3) goto L_0x024e
            if (r12 <= r3) goto L_0x0242
            r1.A00 = r9
            r1.A02 = r12
            goto L_0x0240
        L_0x024e:
            if (r11 == r3) goto L_0x0242
            if (r11 <= r3) goto L_0x0242
            r1.A00 = r9
            r1.A02 = r3
            r1.A03 = r11
            goto L_0x0242
        L_0x0259:
            int r13 = r0.A0l
            int r12 = r0.A0m
            int r11 = r0.A0n
            int r10 = r0.A0o
            int r9 = r0.A0h
            r25 = r9
            int r9 = r0.A0i
            r15 = r9
            float r9 = r0.A08
            int r14 = r0.A0H
            if (r14 == r3) goto L_0x0382
            java.lang.Object r11 = r7.get(r14)
            X.2d3 r11 = (X.2d3) r11
            if (r11 == 0) goto L_0x028b
            float r10 = r0.A00
            int r9 = r0.A0I
            X.2d5 r21 = X.2d5.A03
            r20 = r1
            r22 = r21
            r23 = r11
            r24 = r9
            r25 = r4
            r20.A0R(r21, r22, r23, r24, r25)
            r1.A00 = r10
        L_0x028b:
            if (r19 == 0) goto L_0x029b
            int r10 = r0.A0K
            if (r10 != r3) goto L_0x0295
            int r9 = r0.A0L
            if (r9 == r3) goto L_0x029b
        L_0x0295:
            int r9 = r0.A0L
            r1.A0V = r10
            r1.A0W = r9
        L_0x029b:
            boolean r9 = r0.A14
            r11 = -2
            if (r9 != 0) goto L_0x036d
            int r9 = r0.width
            if (r9 != r3) goto L_0x0362
            boolean r9 = r0.A11
            if (r9 == 0) goto L_0x035e
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x02aa:
            java.lang.Integer[] r9 = r1.A14
            r9[r4] = r10
            X.2d5 r9 = X.2d5.A06
            X.2d6 r10 = r1.A0A(r9)
            int r9 = r0.leftMargin
            r10.A02 = r9
            X.2d5 r9 = X.2d5.A07
            X.2d6 r10 = r1.A0A(r9)
            int r9 = r0.rightMargin
            r10.A02 = r9
        L_0x02c2:
            boolean r9 = r0.A18
            if (r9 != 0) goto L_0x034a
            int r9 = r0.height
            if (r9 != r3) goto L_0x0340
            boolean r9 = r0.A10
            if (r9 == 0) goto L_0x033d
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x02d0:
            java.lang.Integer[] r9 = r1.A14
            r9[r6] = r10
            X.2d5 r9 = X.2d5.A08
            X.2d6 r10 = r1.A0A(r9)
            int r9 = r0.topMargin
            r10.A02 = r9
            X.2d5 r9 = X.2d5.A02
            X.2d6 r10 = r1.A0A(r9)
            int r9 = r0.bottomMargin
            r10.A02 = r9
        L_0x02e8:
            java.lang.String r15 = r0.A0z
            r14 = 0
            if (r15 == 0) goto L_0x04aa
            int r13 = r15.length()
            if (r13 == 0) goto L_0x04aa
            r12 = -1
            r9 = 44
            int r11 = r15.indexOf(r9)
            r10 = 0
            if (r11 <= 0) goto L_0x0310
            int r9 = r13 + -1
            if (r11 >= r9) goto L_0x0310
            java.lang.String r10 = r15.substring(r4, r11)
            java.lang.String r9 = "W"
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0333
            r12 = 0
        L_0x030e:
            int r10 = r11 + 1
        L_0x0310:
            r9 = 58
            int r9 = r15.indexOf(r9)
            if (r9 < 0) goto L_0x049b
            int r13 = r13 - r6
            if (r9 >= r13) goto L_0x049b
            java.lang.String r11 = r15.substring(r10, r9)
            int r9 = r9 + 1
            java.lang.String r10 = r15.substring(r9)
            int r9 = r11.length()
            if (r9 <= 0) goto L_0x04b5
            int r9 = r10.length()
            if (r9 <= 0) goto L_0x04b5
            goto L_0x047d
        L_0x0333:
            java.lang.String r9 = "H"
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x030e
            r12 = 1
            goto L_0x030e
        L_0x033d:
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            goto L_0x02d0
        L_0x0340:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            java.lang.Integer[] r9 = r1.A14
            r9[r6] = r10
            r1.A0H(r4)
            goto L_0x02e8
        L_0x034a:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.Integer[] r9 = r1.A14
            r9[r6] = r10
            int r9 = r0.height
            r1.A0H(r9)
            if (r9 != r11) goto L_0x02e8
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.Integer[] r9 = r1.A14
            r9[r6] = r10
            goto L_0x02e8
        L_0x035e:
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            goto L_0x02aa
        L_0x0362:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            java.lang.Integer[] r9 = r1.A14
            r9[r4] = r10
            r1.A0I(r4)
            goto L_0x02c2
        L_0x036d:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.Integer[] r9 = r1.A14
            r9[r4] = r10
            int r9 = r0.width
            r1.A0I(r9)
            if (r9 != r11) goto L_0x02c2
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.Integer[] r9 = r1.A14
            r9[r4] = r10
            goto L_0x02c2
        L_0x0382:
            if (r13 == r3) goto L_0x0469
            java.lang.Object r13 = r7.get(r13)
            X.2d3 r13 = (X.2d3) r13
            if (r13 == 0) goto L_0x039b
            X.2d5 r21 = X.2d5.A06
            int r12 = r0.leftMargin
            r20 = r1
            r22 = r21
        L_0x0394:
            r23 = r13
            r24 = r12
            r20.A0R(r21, r22, r23, r24, r25)
        L_0x039b:
            if (r11 == r3) goto L_0x0455
            java.lang.Object r11 = r7.get(r11)
            X.2d3 r11 = (X.2d3) r11
            if (r11 == 0) goto L_0x03b6
            X.2d5 r21 = X.2d5.A07
            X.2d5 r22 = X.2d5.A06
            int r10 = r0.rightMargin
            r20 = r1
        L_0x03ad:
            r23 = r11
            r24 = r10
            r25 = r15
            r20.A0R(r21, r22, r23, r24, r25)
        L_0x03b6:
            int r10 = r0.A0u
            if (r10 == r3) goto L_0x043d
            java.lang.Object r12 = r7.get(r10)
            X.2d3 r12 = (X.2d3) r12
            if (r12 == 0) goto L_0x03d5
            X.2d5 r21 = X.2d5.A08
            int r11 = r0.topMargin
            int r10 = r0.A0U
            r20 = r1
            r22 = r21
        L_0x03cc:
            r23 = r12
            r24 = r11
            r25 = r10
            r20.A0R(r21, r22, r23, r24, r25)
        L_0x03d5:
            int r10 = r0.A0G
            if (r10 == r3) goto L_0x0426
            java.lang.Object r12 = r7.get(r10)
            X.2d3 r12 = (X.2d3) r12
            if (r12 == 0) goto L_0x03f4
            X.2d5 r21 = X.2d5.A02
            X.2d5 r22 = X.2d5.A08
            int r11 = r0.bottomMargin
            int r10 = r0.A0P
            r20 = r1
        L_0x03eb:
            r23 = r12
            r24 = r11
            r25 = r10
            r20.A0R(r21, r22, r23, r24, r25)
        L_0x03f4:
            int r10 = r0.A0C
            if (r10 == r3) goto L_0x0418
            X.2d5 r25 = X.2d5.A01
        L_0x03fa:
            r20 = r2
            r21 = r1
            r22 = r0
            r23 = r7
            r24 = r10
            r20.setWidgetBaseline(r21, r22, r23, r24, r25)
        L_0x0407:
            r11 = 0
            int r10 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x040e
            r1.A02 = r9
        L_0x040e:
            float r10 = r0.A09
            int r9 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x028b
            r1.A06 = r10
            goto L_0x028b
        L_0x0418:
            int r10 = r0.A0E
            if (r10 == r3) goto L_0x041f
            X.2d5 r25 = X.2d5.A08
            goto L_0x03fa
        L_0x041f:
            int r10 = r0.A0D
            if (r10 == r3) goto L_0x0407
            X.2d5 r25 = X.2d5.A02
            goto L_0x03fa
        L_0x0426:
            int r10 = r0.A0F
            if (r10 == r3) goto L_0x03f4
            java.lang.Object r12 = r7.get(r10)
            X.2d3 r12 = (X.2d3) r12
            if (r12 == 0) goto L_0x03f4
            X.2d5 r21 = X.2d5.A02
            int r11 = r0.bottomMargin
            int r10 = r0.A0P
            r20 = r1
            r22 = r21
            goto L_0x03eb
        L_0x043d:
            int r10 = r0.A0t
            if (r10 == r3) goto L_0x03d5
            java.lang.Object r12 = r7.get(r10)
            X.2d3 r12 = (X.2d3) r12
            if (r12 == 0) goto L_0x03d5
            X.2d5 r21 = X.2d5.A08
            X.2d5 r22 = X.2d5.A02
            int r11 = r0.topMargin
            int r10 = r0.A0U
            r20 = r1
            goto L_0x03cc
        L_0x0455:
            if (r10 == r3) goto L_0x03b6
            java.lang.Object r11 = r7.get(r10)
            X.2d3 r11 = (X.2d3) r11
            if (r11 == 0) goto L_0x03b6
            X.2d5 r21 = X.2d5.A07
            int r10 = r0.rightMargin
            r20 = r1
            r22 = r21
            goto L_0x03ad
        L_0x0469:
            if (r12 == r3) goto L_0x039b
            java.lang.Object r13 = r7.get(r12)
            X.2d3 r13 = (X.2d3) r13
            if (r13 == 0) goto L_0x039b
            X.2d5 r21 = X.2d5.A06
            X.2d5 r22 = X.2d5.A07
            int r12 = r0.leftMargin
            r20 = r1
            goto L_0x0394
        L_0x047d:
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x04b5 }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x04b5 }
            int r9 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x04b5
            int r9 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x04b5
            if (r12 != r6) goto L_0x0495
            float r10 = r10 / r11
            float r10 = java.lang.Math.abs(r10)     // Catch:{ NumberFormatException -> 0x04b5 }
            goto L_0x04ad
        L_0x0495:
            float r11 = r11 / r10
            float r10 = java.lang.Math.abs(r11)     // Catch:{ NumberFormatException -> 0x04b5 }
            goto L_0x04ad
        L_0x049b:
            java.lang.String r10 = r15.substring(r10)
            int r9 = r10.length()
            if (r9 <= 0) goto L_0x04b5
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x04b5 }
            goto L_0x04ad
        L_0x04aa:
            r1.A01 = r14
            goto L_0x04b5
        L_0x04ad:
            int r9 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x04b5
            r1.A01 = r10
            r1.A09 = r12
        L_0x04b5:
            float r9 = r0.A04
            float[] r10 = r1.A0y
            r10[r4] = r9
            float r9 = r0.A0A
            r10[r6] = r9
            int r9 = r0.A0X
            r1.A0C = r9
            int r9 = r0.A0v
            r1.A0P = r9
            int r10 = r0.A0w
            if (r10 < 0) goto L_0x04d0
            r9 = 3
            if (r10 > r9) goto L_0x04d0
            r1.A0U = r10
        L_0x04d0:
            int r12 = r0.A0b
            int r11 = r0.A0f
            int r10 = r0.A0d
            float r9 = r0.A06
            r1.A0E(r9, r12, r11, r10)
            int r11 = r0.A0a
            int r10 = r0.A0e
            int r9 = r0.A0c
            float r0 = r0.A05
            r1.A0F(r0, r11, r10, r9)
            goto L_0x0242
        L_0x04e8:
            X.2d7 r0 = r5.A09
            r0.A01(r5)
        L_0x04ed:
            int r0 = r2.A07
            r19 = r0
            r25 = r27
            int r14 = android.view.View.MeasureSpec.getMode(r25)
            int r13 = android.view.View.MeasureSpec.getSize(r25)
            r24 = r28
            int r12 = android.view.View.MeasureSpec.getMode(r24)
            int r11 = android.view.View.MeasureSpec.getSize(r24)
            int r0 = r2.getPaddingTop()
            int r15 = java.lang.Math.max(r4, r0)
            int r0 = r2.getPaddingBottom()
            int r0 = java.lang.Math.max(r4, r0)
            int r3 = r15 + r0
            int r1 = r2.getPaddingWidth()
            X.2dM r10 = r2.A0B
            r10.A04 = r15
            r10.A02 = r0
            r10.A05 = r1
            r10.A03 = r3
            r0 = r25
            r10.A01 = r0
            r0 = r24
            r10.A00 = r0
            int r0 = r2.getPaddingStart()
            int r22 = java.lang.Math.max(r4, r0)
            int r0 = r2.getPaddingEnd()
            int r7 = java.lang.Math.max(r4, r0)
            if (r22 > 0) goto L_0x062f
            if (r7 > 0) goto L_0x062f
            int r0 = r2.getPaddingLeft()
            int r22 = java.lang.Math.max(r4, r0)
        L_0x0549:
            int r13 = r13 - r1
            int r11 = r11 - r3
            r0 = r13
            r9 = r11
            int r8 = r10.A03
            int r7 = r10.A05
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            r17 = r18
            int r16 = r2.getChildCount()
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 == r1) goto L_0x0623
            if (r14 == 0) goto L_0x061b
            if (r14 != r3) goto L_0x0620
            int r0 = r2.A04
            int r0 = r0 - r7
            int r0 = java.lang.Math.min(r0, r13)
        L_0x056a:
            if (r12 == r1) goto L_0x060f
            if (r12 == 0) goto L_0x0607
            if (r12 != r3) goto L_0x060c
            int r1 = r2.A03
            int r1 = r1 - r8
            int r9 = java.lang.Math.min(r1, r11)
        L_0x0577:
            int r1 = r5.A07()
            if (r0 != r1) goto L_0x0583
            int r1 = r5.A06()
            if (r9 == r1) goto L_0x0587
        L_0x0583:
            X.2d9 r1 = r5.A0A
            r1.A06 = r6
        L_0x0587:
            r5.A0V = r4
            r5.A0W = r4
            int r1 = r2.A04
            int r1 = r1 - r7
            int[] r3 = r5.A0z
            r3[r4] = r1
            int r1 = r2.A03
            int r1 = r1 - r8
            r3[r6] = r1
            r5.A0N = r4
            r5.A0M = r4
            java.lang.Integer[] r1 = r5.A14
            r1[r4] = r18
            r5.A0I(r0)
            r1[r6] = r17
            r5.A0H(r9)
            int r0 = r2.A06
            int r0 = r0 - r7
            if (r0 >= 0) goto L_0x05ad
            r0 = 0
        L_0x05ad:
            r5.A0N = r0
            int r0 = r2.A05
            int r0 = r0 - r8
            if (r0 >= 0) goto L_0x05b5
            r0 = 0
        L_0x05b5:
            r5.A0M = r0
            r16 = r5
            r17 = r19
            r18 = r14
            r19 = r13
            r20 = r12
            r21 = r11
            r23 = r15
            r16.A0e(r17, r18, r19, r20, r21, r22, r23)
            int r3 = r5.A07()
            int r7 = r5.A06()
            boolean r6 = r5.A0I
            boolean r5 = r5.A0G
            int r1 = r10.A03
            int r0 = r10.A05
            int r3 = r3 + r0
            int r7 = r7 + r1
            r0 = r25
            int r3 = android.view.View.resolveSizeAndState(r3, r0, r4)
            r0 = r24
            int r1 = android.view.View.resolveSizeAndState(r7, r0, r4)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            r1 = r1 & r0
            int r0 = r2.A04
            int r3 = java.lang.Math.min(r0, r3)
            int r0 = r2.A03
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r6 == 0) goto L_0x05fc
            r3 = r3 | r0
        L_0x05fc:
            if (r5 == 0) goto L_0x05ff
            r1 = r1 | r0
        L_0x05ff:
            r2.setMeasuredDimension(r3, r1)
            r2.A02 = r3
            r2.A01 = r1
            return
        L_0x0607:
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            if (r16 != 0) goto L_0x060c
            goto L_0x0613
        L_0x060c:
            r9 = 0
            goto L_0x0577
        L_0x060f:
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            if (r16 != 0) goto L_0x0577
        L_0x0613:
            int r1 = r2.A05
            int r9 = java.lang.Math.max(r4, r1)
            goto L_0x0577
        L_0x061b:
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            if (r16 != 0) goto L_0x0620
            goto L_0x0627
        L_0x0620:
            r0 = 0
            goto L_0x056a
        L_0x0623:
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            if (r16 != 0) goto L_0x056a
        L_0x0627:
            int r0 = r2.A06
            int r0 = java.lang.Math.max(r4, r0)
            goto L_0x056a
        L_0x062f:
            android.content.pm.ApplicationInfo r0 = r18.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & r17
            if (r0 == 0) goto L_0x0549
            int r0 = r2.getLayoutDirection()
            if (r6 != r0) goto L_0x0549
            r22 = r7
            goto L_0x0549
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void setId(int i) {
        SparseArray sparseArray = this.A08;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.A03) {
            this.A03 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.A05) {
            this.A05 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.A06) {
            this.A06 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C21283XSo xSo) {
        this.A0H = xSo;
        C270364gc r0 = this.A0C;
        if (r0 != null) {
            r0.A02 = xSo;
        }
    }

    public void setOptimizationLevel(int i) {
        this.A07 = i;
        this.A0A.A0d(i);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2dQ, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0197, code lost:
        android.util.Log.e("ConstraintLayout", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r14) {
        /*
            r13 = this;
            android.content.Context r9 = r13.getContext()
            X.2dQ r8 = new X.2dQ
            r8.<init>(r9, r14)
            r7 = -1
            r8.A0V = r7
            r8.A0W = r7
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A02 = r0
            r6 = 1
            r8.A12 = r6
            r8.A0Y = r7
            r8.A0Z = r7
            r8.A0p = r7
            r8.A0q = r7
            r8.A0u = r7
            r8.A0t = r7
            r8.A0G = r7
            r8.A0F = r7
            r8.A0C = r7
            r8.A0E = r7
            r8.A0D = r7
            r8.A0H = r7
            r5 = 0
            r8.A0I = r5
            r4 = 0
            r8.A00 = r4
            r8.A0r = r7
            r8.A0s = r7
            r8.A0N = r7
            r8.A0M = r7
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.A0R = r3
            r8.A0U = r3
            r8.A0S = r3
            r8.A0P = r3
            r8.A0T = r3
            r8.A0Q = r3
            r8.A0O = r3
            r8.A0B = r5
            r8.A19 = r6
            r8.A13 = r6
            r2 = 1056964608(0x3f000000, float:0.5)
            r8.A03 = r2
            r8.A09 = r2
            r1 = 0
            r8.A0z = r1
            r8.A01 = r4
            r8.A0J = r6
            r8.A04 = r0
            r8.A0A = r0
            r8.A0X = r5
            r8.A0v = r5
            r8.A0b = r5
            r8.A0a = r5
            r8.A0f = r5
            r8.A0e = r5
            r8.A0d = r5
            r8.A0c = r5
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.A06 = r0
            r8.A05 = r0
            r8.A0K = r7
            r8.A0L = r7
            r8.A0g = r7
            r8.A11 = r5
            r8.A10 = r5
            r8.A0y = r1
            r8.A0w = r5
            r8.A14 = r6
            r8.A18 = r6
            r8.A17 = r5
            r8.A15 = r5
            r8.A16 = r5
            r8.A0l = r7
            r8.A0m = r7
            r8.A0n = r7
            r8.A0o = r7
            r8.A0h = r3
            r8.A0i = r3
            r8.A08 = r2
            X.2d3 r0 = new X.2d3
            r0.<init>()
            r8.A0x = r0
            int[] r0 = X.C71482dO.A01
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r14, r0)
            int r3 = r9.getIndexCount()
            r2 = 0
        L_0x00b0:
            if (r2 >= r3) goto L_0x039c
            int r10 = r9.getIndex(r2)
            android.util.SparseIntArray r0 = X.AnonymousClass2dR.A00
            int r0 = r0.get(r10)
            java.lang.String r12 = "ConstraintLayout"
            r11 = 2
            r1 = -2
            switch(r0) {
                case 1: goto L_0x033a;
                case 2: goto L_0x0328;
                case 3: goto L_0x031e;
                case 4: goto L_0x0308;
                case 5: goto L_0x02fe;
                case 6: goto L_0x02f4;
                case 7: goto L_0x02ea;
                case 8: goto L_0x02d8;
                case 9: goto L_0x02c6;
                case 10: goto L_0x02b4;
                case 11: goto L_0x02a2;
                case 12: goto L_0x0290;
                case 13: goto L_0x027e;
                case 14: goto L_0x026c;
                case 15: goto L_0x025a;
                case 16: goto L_0x0248;
                case 17: goto L_0x0236;
                case 18: goto L_0x0224;
                case 19: goto L_0x0212;
                case 20: goto L_0x0200;
                case 21: goto L_0x01f6;
                case 22: goto L_0x01ec;
                case 23: goto L_0x01e2;
                case 24: goto L_0x01d8;
                case 25: goto L_0x01ce;
                case 26: goto L_0x01c4;
                case 27: goto L_0x01ba;
                case 28: goto L_0x01b0;
                case 29: goto L_0x01a6;
                case 30: goto L_0x019c;
                case 31: goto L_0x018d;
                case 32: goto L_0x0182;
                case 33: goto L_0x0386;
                case 34: goto L_0x0370;
                case 35: goto L_0x0172;
                case 36: goto L_0x035a;
                case 37: goto L_0x0344;
                case 38: goto L_0x0162;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            switch(r0) {
                case 44: goto L_0x0159;
                case 45: goto L_0x014f;
                case 46: goto L_0x0145;
                case 47: goto L_0x013e;
                case 48: goto L_0x0137;
                case 49: goto L_0x012e;
                case 50: goto L_0x0125;
                case 51: goto L_0x011e;
                case 52: goto L_0x010d;
                case 53: goto L_0x00fc;
                case 54: goto L_0x00f3;
                case 55: goto L_0x00ea;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            switch(r0) {
                case 64: goto L_0x00e4;
                case 65: goto L_0x00de;
                case 66: goto L_0x00d5;
                case 67: goto L_0x00cc;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b0
        L_0x00cc:
            boolean r0 = r8.A12
            boolean r0 = r9.getBoolean(r10, r0)
            r8.A12 = r0
            goto L_0x00c9
        L_0x00d5:
            int r0 = r8.A0w
            int r0 = r9.getInt(r10, r0)
            r8.A0w = r0
            goto L_0x00c9
        L_0x00de:
            X.C270354gb.A04(r9, r8, r10, r6)
            r8.A13 = r6
            goto L_0x00c9
        L_0x00e4:
            X.C270354gb.A04(r9, r8, r10, r5)
            r8.A19 = r6
            goto L_0x00c9
        L_0x00ea:
            int r0 = r8.A0O
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0O = r0
            goto L_0x00c9
        L_0x00f3:
            int r0 = r8.A0B
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0B = r0
            goto L_0x00c9
        L_0x00fc:
            int r0 = r8.A0D
            int r0 = r9.getResourceId(r10, r0)
            r8.A0D = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0D = r0
            goto L_0x00c9
        L_0x010d:
            int r0 = r8.A0E
            int r0 = r9.getResourceId(r10, r0)
            r8.A0E = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0E = r0
            goto L_0x00c9
        L_0x011e:
            java.lang.String r0 = r9.getString(r10)
            r8.A0y = r0
            goto L_0x00c9
        L_0x0125:
            int r0 = r8.A0L
            int r0 = r9.getDimensionPixelOffset(r10, r0)
            r8.A0L = r0
            goto L_0x00c9
        L_0x012e:
            int r0 = r8.A0K
            int r0 = r9.getDimensionPixelOffset(r10, r0)
            r8.A0K = r0
            goto L_0x00c9
        L_0x0137:
            int r0 = r9.getInt(r10, r5)
            r8.A0v = r0
            goto L_0x00c9
        L_0x013e:
            int r0 = r9.getInt(r10, r5)
            r8.A0X = r0
            goto L_0x00c9
        L_0x0145:
            float r0 = r8.A0A
            float r0 = r9.getFloat(r10, r0)
            r8.A0A = r0
            goto L_0x00c9
        L_0x014f:
            float r0 = r8.A04
            float r0 = r9.getFloat(r10, r0)
            r8.A04 = r0
            goto L_0x00c9
        L_0x0159:
            java.lang.String r0 = r9.getString(r10)
            X.C270354gb.A05(r8, r0)
            goto L_0x00c9
        L_0x0162:
            float r0 = r8.A05
            float r0 = r9.getFloat(r10, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r8.A05 = r0
            r8.A0a = r11
            goto L_0x00c9
        L_0x0172:
            float r0 = r8.A06
            float r0 = r9.getFloat(r10, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r8.A06 = r0
            r8.A0b = r11
            goto L_0x00c9
        L_0x0182:
            int r0 = r9.getInt(r10, r5)
            r8.A0a = r0
            if (r0 != r6) goto L_0x00c9
            java.lang.String r0 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            goto L_0x0197
        L_0x018d:
            int r0 = r9.getInt(r10, r5)
            r8.A0b = r0
            if (r0 != r6) goto L_0x00c9
            java.lang.String r0 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
        L_0x0197:
            android.util.Log.e(r12, r0)
            goto L_0x00c9
        L_0x019c:
            float r0 = r8.A09
            float r0 = r9.getFloat(r10, r0)
            r8.A09 = r0
            goto L_0x00c9
        L_0x01a6:
            float r0 = r8.A03
            float r0 = r9.getFloat(r10, r0)
            r8.A03 = r0
            goto L_0x00c9
        L_0x01b0:
            boolean r0 = r8.A10
            boolean r0 = r9.getBoolean(r10, r0)
            r8.A10 = r0
            goto L_0x00c9
        L_0x01ba:
            boolean r0 = r8.A11
            boolean r0 = r9.getBoolean(r10, r0)
            r8.A11 = r0
            goto L_0x00c9
        L_0x01c4:
            int r0 = r8.A0Q
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0Q = r0
            goto L_0x00c9
        L_0x01ce:
            int r0 = r8.A0T
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0T = r0
            goto L_0x00c9
        L_0x01d8:
            int r0 = r8.A0P
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0P = r0
            goto L_0x00c9
        L_0x01e2:
            int r0 = r8.A0S
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0S = r0
            goto L_0x00c9
        L_0x01ec:
            int r0 = r8.A0U
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0U = r0
            goto L_0x00c9
        L_0x01f6:
            int r0 = r8.A0R
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0R = r0
            goto L_0x00c9
        L_0x0200:
            int r0 = r8.A0M
            int r0 = r9.getResourceId(r10, r0)
            r8.A0M = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0M = r0
            goto L_0x00c9
        L_0x0212:
            int r0 = r8.A0N
            int r0 = r9.getResourceId(r10, r0)
            r8.A0N = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0N = r0
            goto L_0x00c9
        L_0x0224:
            int r0 = r8.A0s
            int r0 = r9.getResourceId(r10, r0)
            r8.A0s = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0s = r0
            goto L_0x00c9
        L_0x0236:
            int r0 = r8.A0r
            int r0 = r9.getResourceId(r10, r0)
            r8.A0r = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0r = r0
            goto L_0x00c9
        L_0x0248:
            int r0 = r8.A0C
            int r0 = r9.getResourceId(r10, r0)
            r8.A0C = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0C = r0
            goto L_0x00c9
        L_0x025a:
            int r0 = r8.A0F
            int r0 = r9.getResourceId(r10, r0)
            r8.A0F = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0F = r0
            goto L_0x00c9
        L_0x026c:
            int r0 = r8.A0G
            int r0 = r9.getResourceId(r10, r0)
            r8.A0G = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0G = r0
            goto L_0x00c9
        L_0x027e:
            int r0 = r8.A0t
            int r0 = r9.getResourceId(r10, r0)
            r8.A0t = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0t = r0
            goto L_0x00c9
        L_0x0290:
            int r0 = r8.A0u
            int r0 = r9.getResourceId(r10, r0)
            r8.A0u = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0u = r0
            goto L_0x00c9
        L_0x02a2:
            int r0 = r8.A0q
            int r0 = r9.getResourceId(r10, r0)
            r8.A0q = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0q = r0
            goto L_0x00c9
        L_0x02b4:
            int r0 = r8.A0p
            int r0 = r9.getResourceId(r10, r0)
            r8.A0p = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0p = r0
            goto L_0x00c9
        L_0x02c6:
            int r0 = r8.A0Z
            int r0 = r9.getResourceId(r10, r0)
            r8.A0Z = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0Z = r0
            goto L_0x00c9
        L_0x02d8:
            int r0 = r8.A0Y
            int r0 = r9.getResourceId(r10, r0)
            r8.A0Y = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0Y = r0
            goto L_0x00c9
        L_0x02ea:
            float r0 = r8.A02
            float r0 = r9.getFloat(r10, r0)
            r8.A02 = r0
            goto L_0x00c9
        L_0x02f4:
            int r0 = r8.A0W
            int r0 = r9.getDimensionPixelOffset(r10, r0)
            r8.A0W = r0
            goto L_0x00c9
        L_0x02fe:
            int r0 = r8.A0V
            int r0 = r9.getDimensionPixelOffset(r10, r0)
            r8.A0V = r0
            goto L_0x00c9
        L_0x0308:
            float r0 = r8.A00
            float r10 = r9.getFloat(r10, r0)
            r1 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r1
            r8.A00 = r10
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c9
            float r0 = r1 - r10
            float r0 = r0 % r1
            r8.A00 = r0
            goto L_0x00c9
        L_0x031e:
            int r0 = r8.A0I
            int r0 = r9.getDimensionPixelSize(r10, r0)
            r8.A0I = r0
            goto L_0x00c9
        L_0x0328:
            int r0 = r8.A0H
            int r0 = r9.getResourceId(r10, r0)
            r8.A0H = r0
            if (r0 != r7) goto L_0x00c9
            int r0 = r9.getInt(r10, r7)
            r8.A0H = r0
            goto L_0x00c9
        L_0x033a:
            int r0 = r8.A0g
            int r0 = r9.getInt(r10, r0)
            r8.A0g = r0
            goto L_0x00c9
        L_0x0344:
            int r0 = r8.A0c     // Catch:{ Exception -> 0x034e }
            int r0 = r9.getDimensionPixelSize(r10, r0)     // Catch:{ Exception -> 0x034e }
            r8.A0c = r0     // Catch:{ Exception -> 0x034e }
            goto L_0x00c9
        L_0x034e:
            int r0 = r8.A0c
            int r0 = r9.getInt(r10, r0)
            if (r0 != r1) goto L_0x00c9
            r8.A0c = r1
            goto L_0x00c9
        L_0x035a:
            int r0 = r8.A0e     // Catch:{ Exception -> 0x0364 }
            int r0 = r9.getDimensionPixelSize(r10, r0)     // Catch:{ Exception -> 0x0364 }
            r8.A0e = r0     // Catch:{ Exception -> 0x0364 }
            goto L_0x00c9
        L_0x0364:
            int r0 = r8.A0e
            int r0 = r9.getInt(r10, r0)
            if (r0 != r1) goto L_0x00c9
            r8.A0e = r1
            goto L_0x00c9
        L_0x0370:
            int r0 = r8.A0d     // Catch:{ Exception -> 0x037a }
            int r0 = r9.getDimensionPixelSize(r10, r0)     // Catch:{ Exception -> 0x037a }
            r8.A0d = r0     // Catch:{ Exception -> 0x037a }
            goto L_0x00c9
        L_0x037a:
            int r0 = r8.A0d
            int r0 = r9.getInt(r10, r0)
            if (r0 != r1) goto L_0x00c9
            r8.A0d = r1
            goto L_0x00c9
        L_0x0386:
            int r0 = r8.A0f     // Catch:{ Exception -> 0x0390 }
            int r0 = r9.getDimensionPixelSize(r10, r0)     // Catch:{ Exception -> 0x0390 }
            r8.A0f = r0     // Catch:{ Exception -> 0x0390 }
            goto L_0x00c9
        L_0x0390:
            int r0 = r8.A0f
            int r0 = r9.getInt(r10, r0)
            if (r0 != r1) goto L_0x00c9
            r8.A0f = r1
            goto L_0x00c9
        L_0x039c:
            r9.recycle()
            r8.A00()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.generateLayoutParams(android.util.AttributeSet):android.view.ViewGroup$LayoutParams");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C71492dQ r2 = (C71492dQ) childAt.getLayoutParams();
            2d3 r4 = r2.A0x;
            if (childAt.getVisibility() != 8 || r2.A15 || r2.A16 || isInEditMode) {
                int A082 = r4.A08();
                int A092 = r4.A09();
                childAt.layout(A082, A092, r4.A07() + A082, r4.A06() + A092);
            }
        }
        ArrayList arrayList = this.A0E;
        int size = arrayList.size();
        if (size > 0) {
            do {
                ((C252043oT) arrayList.get(i5)).A09(this);
                i5++;
            } while (i5 < size);
        }
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        2d3 A0C2 = A0C(view);
        if ((view instanceof Guideline) && !(A0C2 instanceof AnonymousClass3MQ)) {
            C71492dQ r0 = (C71492dQ) view.getLayoutParams();
            AnonymousClass3MQ r1 = new AnonymousClass3MQ();
            r0.A0x = r1;
            r0.A15 = true;
            r1.A0c(r0.A0g);
        }
        if (view instanceof C252043oT) {
            C252043oT r2 = (C252043oT) view;
            r2.A04();
            ((C71492dQ) view.getLayoutParams()).A16 = true;
            ArrayList arrayList = this.A0E;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
        }
        this.A08.put(view.getId(), view);
        this.A0G = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A08.remove(view.getId());
        2d3 A0C2 = A0C(view);
        this.A0A.A00.remove(A0C2);
        A0C2.A0B();
        this.A0E.remove(view);
        this.A0G = true;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C71492dQ;
    }

    public void setConstraintSet(C270354gb r1) {
        this.A0D = r1;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i, 0);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2dQ, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.A0V = -1;
        marginLayoutParams.A0W = -1;
        marginLayoutParams.A02 = -1.0f;
        marginLayoutParams.A12 = true;
        marginLayoutParams.A0Y = -1;
        marginLayoutParams.A0Z = -1;
        marginLayoutParams.A0p = -1;
        marginLayoutParams.A0q = -1;
        marginLayoutParams.A0u = -1;
        marginLayoutParams.A0t = -1;
        marginLayoutParams.A0G = -1;
        marginLayoutParams.A0F = -1;
        marginLayoutParams.A0C = -1;
        marginLayoutParams.A0E = -1;
        marginLayoutParams.A0D = -1;
        marginLayoutParams.A0H = -1;
        marginLayoutParams.A0I = 0;
        marginLayoutParams.A00 = 0.0f;
        marginLayoutParams.A0r = -1;
        marginLayoutParams.A0s = -1;
        marginLayoutParams.A0N = -1;
        marginLayoutParams.A0M = -1;
        marginLayoutParams.A0R = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0U = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0S = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0P = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0T = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0Q = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0O = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0B = 0;
        marginLayoutParams.A19 = true;
        marginLayoutParams.A13 = true;
        marginLayoutParams.A03 = 0.5f;
        marginLayoutParams.A09 = 0.5f;
        marginLayoutParams.A0z = null;
        marginLayoutParams.A01 = 0.0f;
        marginLayoutParams.A0J = 1;
        marginLayoutParams.A04 = -1.0f;
        marginLayoutParams.A0A = -1.0f;
        marginLayoutParams.A0X = 0;
        marginLayoutParams.A0v = 0;
        marginLayoutParams.A0b = 0;
        marginLayoutParams.A0a = 0;
        marginLayoutParams.A0f = 0;
        marginLayoutParams.A0e = 0;
        marginLayoutParams.A0d = 0;
        marginLayoutParams.A0c = 0;
        marginLayoutParams.A06 = 1.0f;
        marginLayoutParams.A05 = 1.0f;
        marginLayoutParams.A0K = -1;
        marginLayoutParams.A0L = -1;
        marginLayoutParams.A0g = -1;
        marginLayoutParams.A11 = false;
        marginLayoutParams.A10 = false;
        marginLayoutParams.A0y = null;
        marginLayoutParams.A0w = 0;
        marginLayoutParams.A14 = true;
        marginLayoutParams.A18 = true;
        marginLayoutParams.A17 = false;
        marginLayoutParams.A15 = false;
        marginLayoutParams.A16 = false;
        marginLayoutParams.A0l = -1;
        marginLayoutParams.A0m = -1;
        marginLayoutParams.A0n = -1;
        marginLayoutParams.A0o = -1;
        marginLayoutParams.A0h = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A0i = AnonymousClass972.MUTABLE_FLAG_MASK;
        marginLayoutParams.A08 = 0.5f;
        marginLayoutParams.A0x = new 2d3();
        return marginLayoutParams;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context) {
        super(context);
        A00((AttributeSet) null, 0, 0);
    }
}
