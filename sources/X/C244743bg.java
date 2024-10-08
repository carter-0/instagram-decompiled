package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.Constants;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: X.3bg  reason: invalid class name and case insensitive filesystem */
public final class C244743bg implements C253183qL {
    public static final C244743bg A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.facebook.litho.BaseMountingView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.facebook.litho.ComponentHost} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: com.facebook.litho.BaseMountingView} */
    /* JADX WARNING: type inference failed for: r1v17, types: [X.2Vf, java.lang.Object, android.view.View$OnTouchListener] */
    /* JADX WARNING: type inference failed for: r1v23, types: [X.2W8, android.view.View$OnFocusChangeListener, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v29, types: [android.view.View$OnLongClickListener, X.2Ur, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0281, code lost:
        if (r9 == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r1 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r1 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r1 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object ADM(android.content.Context r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            android.view.View r14 = (android.view.View) r14
            X.3bf r15 = (X.C244733bf) r15
            r7 = 1
            X.0qQ.A0B(r14, r7)
            r6 = 2
            X.0qQ.A0B(r15, r6)
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x0053
            r0 = r14
            com.facebook.litho.BaseMountingView r0 = (com.facebook.litho.BaseMountingView) r0
            int r5 = r0.A0G
        L_0x0015:
            X.2Uu r4 = r15.A00
            X.2Th r3 = r15.A01
            boolean r8 = r15.A02
            boolean r2 = r14 instanceof com.facebook.litho.ComponentHost
            if (r2 == 0) goto L_0x0024
            r0 = r14
            com.facebook.litho.ComponentHost r0 = (com.facebook.litho.ComponentHost) r0
            r0.A0J = r7
        L_0x0024:
            X.Hs4 r0 = r4.A0P
            if (r0 == 0) goto L_0x005b
            int r9 = r0.A00
            r0 = 0
            if (r9 == r0) goto L_0x0058
            r0 = 4
            if (r9 == r0) goto L_0x0058
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Unknown visibility value: "
            r2.append(r0)
            r0 = 2536(0x9e8, float:3.554E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 41
            java.lang.String r0 = X.002.A0I(r1, r0, r9)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0053:
            int r5 = X.C245573d8.A00(r14)
            goto L_0x0015
        L_0x0058:
            r14.setVisibility(r0)
        L_0x005b:
            X.2Sg r1 = r4.A0K
            if (r1 == 0) goto L_0x006a
            X.2Uk r0 = new X.2Uk
            r0.<init>(r1)
            X.AnonymousClass0fU.A00(r0, r14)
            r14.setClickable(r7)
        L_0x006a:
            X.2Sg r10 = r4.A0N
            if (r10 == 0) goto L_0x0089
            r9 = r14
            if (r2 == 0) goto L_0x0247
            r0 = r9
            com.facebook.litho.ComponentHost r0 = (com.facebook.litho.ComponentHost) r0
            X.2Ur r1 = r0.A08
        L_0x0076:
            if (r1 != 0) goto L_0x0084
        L_0x0078:
            X.2Ur r1 = new X.2Ur
            r1.<init>()
            if (r2 == 0) goto L_0x023c
            com.facebook.litho.ComponentHost r9 = (com.facebook.litho.ComponentHost) r9
            r9.setComponentLongClickListener(r1)
        L_0x0084:
            r1.A00 = r10
            r14.setLongClickable(r7)
        L_0x0089:
            X.2Sg r10 = r4.A0L
            if (r10 == 0) goto L_0x00a5
            r9 = r14
            if (r2 == 0) goto L_0x022d
            r0 = r9
            com.facebook.litho.ComponentHost r0 = (com.facebook.litho.ComponentHost) r0
            X.2W8 r1 = r0.A07
        L_0x0095:
            if (r1 != 0) goto L_0x00a3
        L_0x0097:
            X.2W8 r1 = new X.2W8
            r1.<init>()
            if (r2 == 0) goto L_0x0222
            com.facebook.litho.ComponentHost r9 = (com.facebook.litho.ComponentHost) r9
            r9.setComponentFocusChangeListener(r1)
        L_0x00a3:
            r1.A00 = r10
        L_0x00a5:
            X.2Sg r10 = r4.A0O
            if (r10 == 0) goto L_0x00c1
            r9 = r14
            if (r2 == 0) goto L_0x0213
            r0 = r9
            com.facebook.litho.ComponentHost r0 = (com.facebook.litho.ComponentHost) r0
            X.2Vf r1 = r0.A09
        L_0x00b1:
            if (r1 != 0) goto L_0x00bf
        L_0x00b3:
            X.2Vf r1 = new X.2Vf
            r1.<init>()
            if (r2 == 0) goto L_0x0208
            com.facebook.litho.ComponentHost r9 = (com.facebook.litho.ComponentHost) r9
            r9.setComponentTouchListener(r1)
        L_0x00bf:
            r1.A00 = r10
        L_0x00c1:
            X.2Sg r9 = r4.A0M
            r1 = r14
            if (r9 == 0) goto L_0x00cd
            if (r2 == 0) goto L_0x00cd
            r0 = r1
            com.facebook.litho.ComponentHost r0 = (com.facebook.litho.ComponentHost) r0
            r0.A0A = r9
        L_0x00cd:
            boolean r0 = r3 instanceof X.2Tg
            if (r0 == 0) goto L_0x00df
            X.2Tg r3 = (X.2Tg) r3
            X.2TG r3 = r3.A05
            if (r3 == 0) goto L_0x00df
            if (r2 != 0) goto L_0x0200
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x0200
        L_0x00df:
            int r0 = r4.A0D
            r10 = -1
            if (r0 == r10) goto L_0x00e7
            r14.setId(r0)
        L_0x00e7:
            int r3 = r4.A07
            r0 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00f4
            java.lang.Object r0 = r4.A0R
            r14.setTag(r0)
        L_0x00f4:
            android.util.SparseArray r11 = r4.A0I
            if (r11 == 0) goto L_0x0104
            if (r2 == 0) goto L_0x01eb
            com.facebook.litho.ComponentHost r1 = (com.facebook.litho.ComponentHost) r1
            android.util.SparseArray r0 = r1.A02
            android.util.SparseArray r0 = X.C246273eJ.A00(r0, r11)
            r1.A02 = r0
        L_0x0104:
            float r1 = r4.A05
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            r14.setElevation(r1)
        L_0x010e:
            int r0 = r4.A06
            r3 = 0
            r14.setOutlineAmbientShadowColor(r0)
            int r0 = r4.A0B
            r14.setOutlineSpotShadowColor(r0)
            android.view.ViewOutlineProvider r0 = r4.A0J
            if (r0 == 0) goto L_0x0120
            r14.setOutlineProvider(r0)
        L_0x0120:
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0127
            r14.setClipToOutline(r0)
        L_0x0127:
            r1 = r14
            int r0 = r4.A07
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0139
            boolean r0 = r14 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0139
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r4.A0W
            r1.setClipChildren(r0)
        L_0x0139:
            java.lang.CharSequence r1 = r4.A0Q
            if (r1 == 0) goto L_0x0146
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0146
            r14.setContentDescription(r1)
        L_0x0146:
            int r0 = r4.A07
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r4.A0b
            r14.setFocusable(r0)
        L_0x0151:
            int r0 = r4.A07
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x015c
            boolean r0 = r4.A0Z
            r14.setClickable(r0)
        L_0x015c:
            int r0 = r4.A07
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0167
            boolean r0 = r4.A0a
            r14.setEnabled(r0)
        L_0x0167:
            int r0 = r4.A07
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0172
            boolean r0 = r4.A0e
            r14.setSelected(r0)
        L_0x0172:
            int r1 = r4.A07
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x017e
            boolean r0 = r4.A0d
            r14.setKeyboardNavigationCluster(r0)
        L_0x017e:
            java.lang.String r0 = r4.A0T
            r14.setTooltipText(r0)
            int r0 = r4.A07
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0191
            float r0 = r4.A04
            r14.setScaleX(r0)
            r14.setScaleY(r0)
        L_0x0191:
            int r0 = r4.A07
            r0 = r0 & 4
            if (r0 == 0) goto L_0x019c
            float r0 = r4.A00
            r14.setAlpha(r0)
        L_0x019c:
            int r0 = r4.A07
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01a7
            float r0 = r4.A01
            r14.setRotation(r0)
        L_0x01a7:
            int r0 = r4.A07
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01b2
            float r0 = r4.A02
            r14.setRotationX(r0)
        L_0x01b2:
            int r0 = r4.A07
            r0 = r0 & 32
            if (r0 == 0) goto L_0x01bd
            float r0 = r4.A03
            r14.setRotationY(r0)
        L_0x01bd:
            java.lang.String r0 = r4.A0U
            if (r0 == 0) goto L_0x01c4
            r14.setTransitionName(r0)
        L_0x01c4:
            int r0 = r4.A08
            if (r0 == 0) goto L_0x01cb
            r14.setImportantForAccessibility(r0)
        L_0x01cb:
            boolean r9 = r4.A0c
            int r1 = r4.A09
            if (r1 == r10) goto L_0x01d6
            android.graphics.Paint r0 = r4.A0F
            r14.setLayerType(r1, r0)
        L_0x01d6:
            android.animation.StateListAnimator r0 = r4.A0E
            int r1 = r4.A0C
            if (r0 != 0) goto L_0x01e6
            if (r1 == 0) goto L_0x025f
            android.content.Context r0 = r14.getContext()
            android.animation.StateListAnimator r0 = android.animation.AnimatorInflater.loadStateListAnimator(r0, r1)
        L_0x01e6:
            if (r8 == 0) goto L_0x025c
            if (r0 == 0) goto L_0x025b
            goto L_0x0256
        L_0x01eb:
            r9 = 0
            int r3 = r11.size()
        L_0x01f0:
            if (r9 >= r3) goto L_0x0104
            int r1 = r11.keyAt(r9)
            java.lang.Object r0 = r11.valueAt(r9)
            r14.setTag(r1, r0)
            int r9 = r9 + 1
            goto L_0x01f0
        L_0x0200:
            r0 = 2131430550(0x7f0b0c96, float:1.8482804E38)
            r14.setTag(r0, r3)
            goto L_0x00df
        L_0x0208:
            r14.setOnTouchListener(r1)
            r0 = 2131430551(0x7f0b0c97, float:1.8482806E38)
            r14.setTag(r0, r1)
            goto L_0x00bf
        L_0x0213:
            r0 = 2131430551(0x7f0b0c97, float:1.8482806E38)
            java.lang.Object r1 = r14.getTag(r0)
            boolean r0 = r1 instanceof X.AnonymousClass2Vf
            if (r0 == 0) goto L_0x00b3
            X.2Vf r1 = (X.AnonymousClass2Vf) r1
            goto L_0x00b1
        L_0x0222:
            r14.setOnFocusChangeListener(r1)
            r0 = 2131430548(0x7f0b0c94, float:1.84828E38)
            r14.setTag(r0, r1)
            goto L_0x00a3
        L_0x022d:
            r0 = 2131430548(0x7f0b0c94, float:1.84828E38)
            java.lang.Object r1 = r14.getTag(r0)
            boolean r0 = r1 instanceof X.2W8
            if (r0 == 0) goto L_0x0097
            X.2W8 r1 = (X.2W8) r1
            goto L_0x0095
        L_0x023c:
            r14.setOnLongClickListener(r1)
            r0 = 2131430549(0x7f0b0c95, float:1.8482802E38)
            r14.setTag(r0, r1)
            goto L_0x0084
        L_0x0247:
            r0 = 2131430549(0x7f0b0c95, float:1.8482802E38)
            java.lang.Object r1 = r14.getTag(r0)
            boolean r0 = r1 instanceof X.AnonymousClass2Ur
            if (r0 == 0) goto L_0x0078
            X.2Ur r1 = (X.AnonymousClass2Ur) r1
            goto L_0x0076
        L_0x0256:
            android.animation.StateListAnimator r0 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x025c }
            goto L_0x025c
        L_0x025b:
            r0 = 0
        L_0x025c:
            r14.setStateListAnimator(r0)
        L_0x025f:
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x0281
            android.graphics.drawable.Drawable r0 = r4.A0G
            if (r0 == 0) goto L_0x026a
            r14.setBackground(r0)
        L_0x026a:
            android.graphics.drawable.Drawable r0 = r4.A0H
            if (r0 == 0) goto L_0x0271
            r14.setForeground(r0)
        L_0x0271:
            if (r9 == 0) goto L_0x0283
            r14.setPadding(r3, r3, r3, r3)
        L_0x0276:
            if (r2 == 0) goto L_0x027c
            com.facebook.litho.ComponentHost r14 = (com.facebook.litho.ComponentHost) r14
            r14.A0J = r3
        L_0x027c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        L_0x0281:
            if (r9 != 0) goto L_0x0276
        L_0x0283:
            android.graphics.drawable.Drawable r0 = r4.A0G
            if (r0 == 0) goto L_0x028a
            r14.setBackground(r0)
        L_0x028a:
            android.graphics.drawable.Drawable r0 = r4.A0H
            if (r0 == 0) goto L_0x0291
            r14.setForeground(r0)
        L_0x0291:
            int r1 = r4.A0A
            r0 = 0
            if (r1 == r3) goto L_0x02ab
            r0 = 1
            if (r1 == r7) goto L_0x02ab
            r0 = 2
            if (r1 == r6) goto L_0x02ab
            r0 = 3
            if (r1 == r0) goto L_0x02ab
            java.lang.String r0 = "Unknown layout direction "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02ab:
            r14.setLayoutDirection(r0)
            goto L_0x0276
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244743bg.ADM(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (X.C245433ct.A07.A00(r2, r1, r7, r8) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean Ete(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.3bf r5 = (X.C244733bf) r5
            X.3bf r6 = (X.C244733bf) r6
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            X.0qQ.A0B(r6, r0)
            boolean r0 = r6.A03
            r3 = 1
            if (r0 != 0) goto L_0x002b
            X.2Th r2 = r5.A01
            X.2Th r1 = r6.A01
            if (r2 == r1) goto L_0x0036
            boolean r0 = r2 instanceof X.C245433ct
            if (r0 == 0) goto L_0x002b
            boolean r0 = r1 instanceof X.C245433ct
            if (r0 == 0) goto L_0x002b
            X.3cu r0 = X.C245433ct.A07
            X.3ct r2 = (X.C245433ct) r2
            X.3ct r1 = (X.C245433ct) r1
            boolean r0 = r0.A00(r2, r1, r7, r8)
            if (r0 != 0) goto L_0x0035
        L_0x002b:
            X.2Uu r1 = r5.A00
            X.2Uu r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            return r3
        L_0x0036:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244743bg.Ete(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ComponentHost componentHost = (View) obj;
        C244733bf r15 = (C244733bf) obj2;
        Number number = (Number) obj4;
        0qQ.A0B(componentHost, 1);
        0qQ.A0B(r15, 2);
        if (number != null) {
            C244723be r2 = 2Uu.A0f;
            2Uu r9 = r15.A00;
            int intValue = number.intValue();
            boolean z = r9.A0c;
            boolean z2 = componentHost instanceof ComponentHost;
            if (z2) {
                componentHost.A0J = true;
            }
            if (r9.A0P != null) {
                if ((intValue & 768) == 0) {
                    i = 0;
                } else {
                    i = 8;
                    if ((intValue & 256) == 256) {
                        i = 4;
                    }
                }
                componentHost.setVisibility(i);
            }
            if (r9.A0K != null) {
                componentHost.setOnClickListener((View.OnClickListener) null);
                componentHost.setClickable(false);
            }
            if (r9.A0N != null) {
                r2.A02(componentHost);
            }
            if (r9.A0L != null) {
                r2.A01(componentHost);
            }
            if (r9.A0O != null) {
                r2.A03(componentHost);
            }
            if (r9.A0M != null) {
                ComponentHost componentHost2 = componentHost;
                if (z2) {
                    componentHost2.A0A = null;
                }
            }
            if ((r9.A07 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
                componentHost.setId(-1);
            }
            if ((r9.A07 & Constants.LOAD_RESULT_PGO) != 0) {
                componentHost.setTag((Object) null);
            }
            SparseArray sparseArray = r9.A0I;
            ComponentHost componentHost3 = componentHost;
            if (z2) {
                componentHost3.A02 = null;
            } else if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    componentHost.setTag(sparseArray.keyAt(i2), (Object) null);
                }
            }
            if (!((r9.A0E == null && r9.A0C == 0) || componentHost.getStateListAnimator() == null)) {
                componentHost.getStateListAnimator().jumpToCurrentState();
                componentHost.setStateListAnimator((StateListAnimator) null);
            }
            if (r9.A05 != 0.0f) {
                componentHost.setElevation(0.0f);
            }
            if (r9.A06 != -16777216) {
                componentHost.setOutlineAmbientShadowColor(-16777216);
            }
            if (r9.A0B != -16777216) {
                componentHost.setOutlineSpotShadowColor(-16777216);
            }
            if (r9.A0J != null) {
                componentHost.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            if (r9.A0X) {
                componentHost.setClipToOutline(false);
            }
            View view = componentHost;
            if (!r9.A0W && (componentHost instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(true);
            }
            CharSequence charSequence = r9.A0Q;
            if (!(charSequence == null || charSequence.length() == 0)) {
                componentHost.setContentDescription((CharSequence) null);
            }
            String str = r9.A0T;
            if (!(str == null || str.length() == 0)) {
                componentHost.setTooltipText((CharSequence) null);
            }
            if ((r9.A07 & 2) != 0) {
                if (componentHost.getScaleX() != 1.0f) {
                    componentHost.setScaleX(1.0f);
                }
                if (componentHost.getScaleY() != 1.0f) {
                    componentHost.setScaleY(1.0f);
                }
            }
            if (!((r9.A07 & 4) == 0 || componentHost.getAlpha() == 1.0f)) {
                componentHost.setAlpha(1.0f);
            }
            if (!((r9.A07 & 8) == 0 || componentHost.getRotation() == 0.0f)) {
                componentHost.setRotation(0.0f);
            }
            if (!((r9.A07 & 16) == 0 || componentHost.getRotationX() == 0.0f)) {
                componentHost.setRotationX(0.0f);
            }
            if (!((r9.A07 & 32) == 0 || componentHost.getRotationY() == 0.0f)) {
                componentHost.setRotationY(0.0f);
            }
            boolean z3 = true;
            if ((intValue & 1) != 1) {
                z3 = false;
            }
            componentHost.setClickable(z3);
            boolean z4 = false;
            if ((intValue & 2) == 2) {
                z4 = true;
            }
            componentHost.setLongClickable(z4);
            boolean z5 = false;
            if ((intValue & 4) == 4) {
                z5 = true;
            }
            componentHost.setFocusable(z5);
            boolean z6 = false;
            if ((intValue & 8) == 8) {
                z6 = true;
            }
            componentHost.setEnabled(z6);
            boolean z7 = false;
            if ((intValue & 16) == 16) {
                z7 = true;
            }
            componentHost.setSelected(z7);
            boolean z8 = false;
            if ((intValue & 128) == 128) {
                z8 = true;
            }
            componentHost.setKeyboardNavigationCluster(z8);
            if (r9.A08 != 0) {
                componentHost.setImportantForAccessibility(0);
            }
            C244723be.A00(componentHost);
            if (r9.A0Y) {
                if (r9.A0G != null) {
                    componentHost.setBackground((Drawable) null);
                }
                if (r9.A0H != null) {
                    componentHost.setForeground((Drawable) null);
                }
            }
            if (!z) {
                if (r9.A0G != null) {
                    componentHost.setBackground((Drawable) null);
                }
                if (r9.A0H != null) {
                    componentHost.setForeground((Drawable) null);
                }
                componentHost.setLayoutDirection(2);
            }
            if ((intValue & 32) != 0) {
                int i3 = 1;
                if ((intValue & 64) == 64) {
                    i3 = 2;
                }
                componentHost.setLayerType(i3, (Paint) null);
            }
            if (z2) {
                componentHost.A0J = false;
            }
            List list = r9.A0V;
            if (list != null && !list.isEmpty()) {
                03v.A0H(componentHost, 0sn.A00);
                return;
            }
            return;
        }
        throw new IllegalStateException("Bind data should not be null");
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return AnonymousClass3XB.A00(getClass());
    }
}
