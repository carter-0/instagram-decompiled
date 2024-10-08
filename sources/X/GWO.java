package X;

import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;

public final class GWO extends ViewGroup {
    public static final AnonymousClass5RD A0C = IGQ.A00;
    public WeakReference A00;
    public C62320sa A01 = C56914IHj.A00.CNc(this);
    public boolean A02;
    public boolean A03;
    public IBinder A04;
    public View A05;
    public C285035Pk A06;
    public AnonymousClass5PL A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C284945Oz A0B = C51970G9q.A0S((Object) null);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GWO(android.content.Context r3) {
        /*
            r2 = this;
            r1 = 0
            boolean r0 = X.DbW.A1X(r3)
            r2.<init>(r3, r1, r0)
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            X.IHj r0 = X.C56914IHj.A00
            X.Iw5 r0 = r0.CNc(r2)
            r2.A01 = r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C51970G9q.A0S(r1)
            r2.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWO.<init>(android.content.Context):void");
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public static /* synthetic */ void getShouldUseCompositionWithReuse$annotations() {
    }

    public final void A07(AnonymousClass5PL r4) {
        0qQ.A0B(r4, 0);
        0fg.A01("MetaComposeView:prepareAndroidComposeView", -898549668);
        try {
            ViewGroup.LayoutParams layoutParams = C55301HfU.A00;
            this.A05 = new AndroidComposeView(AnonymousClass7TE.A0S(this), r4.A08());
        } finally {
            0fg.A00(-1046470899);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setContent(0sL r4) {
        0qQ.A0B(r4, 0);
        0fg.A01("MetaComposeView:setContent", -749518798);
        try {
            this.A02 = true;
            this.A03 = false;
            this.A0B.Epw(r4);
            if (isAttachedToWindow()) {
                A04();
            }
        } finally {
            0fg.A00(1603806659);
        }
    }

    public final void setContentAllowingDetached(Window window, AnonymousClass07Z r9, AnonymousClass0g9 r10, boolean z, 0sL r12) {
        0qQ.A0B(window, 0);
        C51974G9v.A1L(r9, r10, r12);
        View decorView = window.getDecorView();
        0qQ.A0C(decorView, AnonymousClass000.A00(5));
        ViewGroup viewGroup = (ViewGroup) decorView;
        if (!isAttachedToWindow()) {
            AnonymousClass07Z A002 = C71362ch.A00(viewGroup);
            AnonymousClass0g9 A003 = C71372cj.A00(viewGroup);
            C71362ch.A01(viewGroup, r9);
            C71372cj.A01(viewGroup, r10);
            if (z) {
                setContentWithReuse(r12);
            } else {
                setContent(r12);
            }
            viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -2));
            this.A02 = false;
            viewGroup.removeView(this);
            C71362ch.A01(viewGroup, A002);
            C71372cj.A01(viewGroup, A003);
        } else if (z) {
            setContentWithReuse(r12);
        } else {
            setContent(r12);
        }
    }

    public final void setContentWithReuse(0sL r3) {
        0qQ.A0B(r3, 0);
        0fg.A01("MetaComposeView:setContentWithReuse", -1949983622);
        try {
            A03(this, r3, true);
        } finally {
            0fg.A00(10720925);
        }
    }

    public final void setViewCompositionStrategy(C59649JRr jRr) {
        0qQ.A0B(jRr, 0);
        C62320sa r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
        }
        this.A01 = jRr.CNc(this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static final AnonymousClass5PL A00(GWO gwo) {
        0fg.A01("MetaComposeView:resolveParentCompositionContext", -975649119);
        try {
            AnonymousClass5PL r2 = gwo.A07;
            if (r2 == null) {
                r2 = AnonymousClass5PK.A00(gwo);
                if (r2 == null) {
                    WeakReference weakReference = gwo.A00;
                    if (!(weakReference == null || (r2 = (AnonymousClass5PL) weakReference.get()) == null)) {
                        if (r2 instanceof Recomposer) {
                            if (((AnonymousClass4e5) ((Recomposer) r2).A0K.getValue()).compareTo(AnonymousClass4e5.ShuttingDown) > 0) {
                            }
                        }
                    }
                    r2 = AnonymousClass5PK.A02(gwo);
                }
                if ((!(r2 instanceof Recomposer) || ((AnonymousClass4e5) ((Recomposer) r2).A0K.getValue()).compareTo(AnonymousClass4e5.ShuttingDown) > 0) && r2 != null) {
                    gwo.A00 = C51965G9l.A0v(r2);
                }
            }
            return r2;
        } finally {
            0fg.A00(378733707);
        }
    }

    private final void A01() {
        if (!this.A08) {
            throw AnonymousClass7TE.A1B(002.A0g(C273654mx.A00(1211), C51968G9o.A16(this), C273654mx.A00(1174)));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r5 != null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r8 = this;
            java.lang.String r1 = "MetaComposeView:ensureCompositionCreated"
            r0 = -1470938007(0xffffffffa8534469, float:-1.1727687E-14)
            X.0fg.A01(r1, r0)
            X.5Pk r0 = r8.A06     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x00f5
            r2 = 0
            r5 = 1
            r8.A08 = r5     // Catch:{ all -> 0x00f1 }
            android.view.View r4 = r8.A05     // Catch:{ all -> 0x00f1 }
            X.5PL r6 = A00(r8)     // Catch:{ all -> 0x00f1 }
            r3 = 841828183(0x322d4757, float:1.0086146E-8)
            r1 = 21
            X.JFw r0 = new X.JFw     // Catch:{ all -> 0x00f1 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00f1 }
            X.5PJ r7 = X.AnonymousClass5PI.A04(r0, r3, r5)     // Catch:{ all -> 0x00f1 }
            android.view.ViewGroup$LayoutParams r0 = X.C55301HfU.A00     // Catch:{ all -> 0x00f1 }
            r0 = 2
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "MetaComposeViewWrapper:setContent"
            r0 = 1710140170(0x65eeab0a, float:1.4088479E23)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x00f1 }
            X.C285155Pz.A00()     // Catch:{ all -> 0x00e9 }
            int r0 = r8.getChildCount()     // Catch:{ all -> 0x00e9 }
            if (r0 <= 0) goto L_0x0050
            android.view.View r5 = r8.getChildAt(r2)     // Catch:{ all -> 0x00e9 }
            boolean r0 = r5 instanceof androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x0047
            androidx.compose.ui.platform.AndroidComposeView r5 = (androidx.compose.ui.platform.AndroidComposeView) r5     // Catch:{ all -> 0x00e9 }
            if (r5 != 0) goto L_0x007c
        L_0x0047:
            boolean r0 = r4 instanceof androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x0056
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4     // Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0050:
            r8.removeAllViews()     // Catch:{ all -> 0x00e9 }
            goto L_0x0047
        L_0x0054:
            r5 = r4
            goto L_0x0077
        L_0x0056:
            java.lang.String r1 = "AndroidComposeView.init"
            r0 = 284819732(0x10fa0114, float:9.8609274E-29)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x00e9 }
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r8)     // Catch:{ all -> 0x006f }
            X.4Cc r0 = r6.A08()     // Catch:{ all -> 0x006f }
            androidx.compose.ui.platform.AndroidComposeView r5 = new androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x006f }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x006f }
            r0 = -1161705290(0xffffffffbac1c8b6, float:-0.0014784548)
            goto L_0x0074
        L_0x006f:
            r1 = move-exception
            r0 = 1899625521(0x7139fc31, float:9.209537E29)
            goto L_0x00e5
        L_0x0074:
            X.0fg.A00(r0)     // Catch:{ all -> 0x00e9 }
        L_0x0077:
            android.view.ViewGroup$LayoutParams r0 = X.C55301HfU.A00     // Catch:{ all -> 0x00e9 }
            r8.addView(r5, r0)     // Catch:{ all -> 0x00e9 }
        L_0x007c:
            java.lang.String r1 = "doSetContent"
            r0 = 440876351(0x1a473d3f, float:4.120171E-23)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x00e9 }
            r4 = 2131444055(0x7f0b4157, float:1.8510196E38)
            java.lang.Object r3 = r5.getTag(r4)     // Catch:{ all -> 0x00e1 }
            boolean r0 = r3 instanceof X.C7275Q1z     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0093
            X.Q1z r3 = (X.C7275Q1z) r3     // Catch:{ all -> 0x00e1 }
            if (r3 != 0) goto L_0x00be
        L_0x0093:
            java.lang.String r1 = "WrappedComposition.init"
            r0 = 785656821(0x2ed42bf5, float:9.648452E-11)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x00e1 }
            X.5R6 r0 = r5.A0Y     // Catch:{ all -> 0x00b0 }
            X.5Wk r1 = new X.5Wk     // Catch:{ all -> 0x00b0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b0 }
            X.5Wn r0 = new X.5Wn     // Catch:{ all -> 0x00b0 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x00b0 }
            X.Q1z r3 = new X.Q1z     // Catch:{ all -> 0x00b0 }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x00b0 }
            r0 = -587220495(0xffffffffdcffb9f1, float:-5.7584451E17)
            goto L_0x00b8
        L_0x00b0:
            r1 = move-exception
            r0 = 239862904(0xe4c0478, float:2.5147093E-30)
            X.0fg.A00(r0)     // Catch:{ all -> 0x00e1 }
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00b8:
            X.0fg.A00(r0)     // Catch:{ all -> 0x00e1 }
            r5.setTag(r4, r3)     // Catch:{ all -> 0x00e1 }
        L_0x00be:
            r3.ESi(r7)     // Catch:{ all -> 0x00e1 }
            X.4Cc r0 = r5.A05     // Catch:{ all -> 0x00e1 }
            X.4Cc r1 = r6.A08()     // Catch:{ all -> 0x00e1 }
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x00d0
            r5.setCoroutineContext(r1)     // Catch:{ all -> 0x00e1 }
        L_0x00d0:
            r0 = 834395893(0x31bbdef5, float:5.4677636E-9)
            X.0fg.A00(r0)     // Catch:{ all -> 0x00e9 }
            r0 = -169244030(0xfffffffff5e98a82, float:-5.920969E32)
            X.0fg.A00(r0)     // Catch:{ all -> 0x00f1 }
            r8.A06 = r3     // Catch:{ all -> 0x00f1 }
            r8.A08 = r2     // Catch:{ all -> 0x00fc }
            goto L_0x00f5
        L_0x00e1:
            r1 = move-exception
            r0 = -1277120863(0xffffffffb3e0aea1, float:-1.0462578E-7)
        L_0x00e5:
            X.0fg.A00(r0)     // Catch:{ all -> 0x00e9 }
            throw r1     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r1 = move-exception
            r0 = -1189160203(0xffffffffb91edaf5, float:-1.5149622E-4)
            X.0fg.A00(r0)     // Catch:{ all -> 0x00f1 }
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            r8.A08 = r2     // Catch:{ all -> 0x00fc }
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00f5:
            r0 = 1499610300(0x59623cbc, float:3.98000768E15)
            X.0fg.A00(r0)
            return
        L_0x00fc:
            r1 = move-exception
            r0 = -144725468(0xfffffffff75faa24, float:-4.5364573E33)
            X.0fg.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWO.A02():void");
    }

    public static final void A03(GWO gwo, 0sL r5, boolean z) {
        0fg.A01("MetaComposeView:setReusableContent", -1628211372);
        try {
            gwo.A02 = true;
            gwo.A03 = true;
            gwo.A0B.Epw(AnonymousClass5PI.A04(new J73(0, r5, z), 27009695, true));
            if (gwo.isAttachedToWindow()) {
                gwo.A04();
            }
        } finally {
            0fg.A00(1620420451);
        }
    }

    private final void setParentContext(AnonymousClass5PL r3) {
        0fg.A01("MetaComposeView:parentContext:set", -672410696);
        try {
            if (this.A07 != r3) {
                this.A07 = r3;
                if (r3 != null) {
                    this.A00 = null;
                }
                C285035Pk r0 = this.A06;
                if (r0 != null) {
                    r0.dispose();
                    this.A06 = null;
                    if (isAttachedToWindow()) {
                        A02();
                    }
                }
            }
        } finally {
            0fg.A00(1301400345);
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A04 != iBinder) {
            this.A04 = iBinder;
            this.A00 = null;
        }
    }

    public final void A04() {
        0fg.A01("MetaComposeView:createComposition", 1192802027);
        try {
            if (this.A07 != null || isAttachedToWindow()) {
                A02();
                return;
            }
            throw AnonymousClass7TE.A0z("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        } finally {
            0fg.A00(229650450);
        }
    }

    public final void A05() {
        0fg.A01("MetaComposeView:disposeComposition", -1368254204);
        try {
            C285035Pk r0 = this.A06;
            if (r0 != null) {
                r0.dispose();
            }
            this.A06 = null;
            requestLayout();
        } finally {
            0fg.A00(-2002120086);
        }
    }

    public final boolean getHasComposition() {
        return AnonymousClass7TF.A1V(this.A06);
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A02;
    }

    public boolean getShouldUseCompositionWithReuse() {
        return this.A03;
    }

    public final boolean getShowLayoutBounds() {
        return this.A0A;
    }

    public final boolean isTransitionGroup() {
        if (!this.A09 || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        0fg.A01("MetaComposeView:internalOnLayout", 1776251124);
        try {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
            }
        } finally {
            0fg.A00(-665712014);
        }
    }

    public final void onMeasure(int i, int i2) {
        0fg.A01("MetaComposeView:onMeasure", -1112114465);
        try {
            A02();
            0fg.A01("MetaComposeView:internalOnMeasure", -1506562380);
            View childAt = getChildAt(0);
            if (childAt == null) {
                super.onMeasure(i, i2);
                int i3 = 919167057;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
                setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
            }
            0fg.A00(719488236);
        } catch (Throwable th) {
            throw th;
        } finally {
            0fg.A00(-188305882);
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A0A = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((AndroidComposeView) ((C268124co) childAt)).A0A = z;
        }
    }

    public final void A06(C286575Wy r3, int i) {
        if (C51967G9n.A1T(r3, -1768631695)) {
            0fL.A01(977627999, "com.facebook.compose.view.MetaComposeView.Content (MetaComposeView.kt:466)");
        }
        0sL r1 = (0sL) this.A0B.getValue();
        if (r1 != null) {
            C51967G9n.A1P(r3, r1, 0);
        }
        if (0fL.A02()) {
            0fL.A00(-1734818833);
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, this, i, 9);
        }
    }

    public final void addView(View view, int i) {
        A01();
        super.addView(view, i);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A01();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public CharSequence getAccessibilityClassName() {
        String name = getClass().getName();
        0qQ.A07(name);
        return name;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-110673324);
        0fg.A01("MetaComposeView:onAttachedToWindow", -1481876576);
        try {
            super.onAttachedToWindow();
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.A02) {
                A02();
            }
        } finally {
            0fg.A00(-2055884953);
            AnonymousClass0fD.A0D(-1898373036, A062);
        }
    }

    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A09 = true;
    }

    public final void setParentCompositionContext(AnonymousClass5PL r1) {
        setParentContext(r1);
    }

    public final void addView(View view, int i, int i2) {
        A01();
        super.addView(view, i, i2);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A01();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A01();
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view) {
        A01();
        super.addView(view);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A01();
        super.addView(view, layoutParams);
    }
}
