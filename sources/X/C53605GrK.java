package X;

import com.facebook.litho.BaseMountingView;

/* renamed from: X.GrK  reason: case insensitive filesystem */
public final class C53605GrK extends BaseMountingView implements AnonymousClass0hF {
    public 2T4 A00;
    public AnonymousClass3XI A01;
    public C62320sa A02;
    public boolean A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.litho.BaseMountingView, X.GrK, android.view.View] */
    public final void Dms(07T r3, AnonymousClass07Z r4) {
        0qQ.A0B(r3, 1);
        if (r3 == 07T.ON_DESTROY) {
            A0W();
            C62320sa r0 = this.A02;
            if (r0 != null) {
                r0.invoke();
            }
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
            this.A03 = true;
            requestLayout();
        }
    }

    private final 2T4 getRequireLayoutState() {
        2T4 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0w("LayoutState not available.");
    }

    private final AnonymousClass3XI getRequireTreeState() {
        AnonymousClass3XI r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0w("TreeState not available.");
    }

    public final void A0c(AnonymousClass07Z r2, AnonymousClass07Z r3) {
        AnonymousClass07V lifecycle;
        AnonymousClass07V lifecycle2;
        if (!(r2 == null || (lifecycle2 = r2.getLifecycle()) == null)) {
            lifecycle2.A0A(this);
        }
        if (r3 != null && (lifecycle = r3.getLifecycle()) != null) {
            lifecycle.A09(this);
        }
    }

    public final boolean A0g() {
        2T4 r0 = this.A00;
        if (r0 != null) {
            return r0.A0H.A02.A02.A01.A0M;
        }
        return false;
    }

    public final boolean A0h() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final boolean A0i() {
        2T4 r0 = this.A00;
        if (r0 != null) {
            return r0.A0H.A02.A02.A01.A0X;
        }
        return false;
    }

    public 2Sa getConfiguration() {
        AnonymousClass3X5 r0;
        2T4 r02 = this.A00;
        if (r02 == null || (r0 = r02.A0H.A02.A02) == null) {
            return null;
        }
        return r0.A01;
    }

    public 2T4 getCurrentLayoutState() {
        return this.A00;
    }

    public final C62320sa getOnClean() {
        return this.A02;
    }

    public AnonymousClass3XI getTreeState() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.litho.BaseMountingView, X.GrK, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r9.A0A != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        setMeasuredDimension(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r8 = getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r9.A00 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (android.view.View.MeasureSpec.getMode(r10) != 1073741824) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r1 = android.view.View.MeasureSpec.getSize(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (android.view.View.MeasureSpec.getMode(r11) != 1073741824) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r6 = android.view.View.MeasureSpec.getSize(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        setMeasuredDimension(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        r1 = getRequireTreeState().A06.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r9.A03 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if (r1 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        r4 = getRequireLayoutState().A0C;
        r3 = getRequireLayoutState().A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r2 == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        A0U();
        r2 = r9.A03;
        r0 = getCurrentLayoutState();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r0 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        r0 = com.facebook.litho.BaseMountingView.A03(r9, r1, X.C246033ds.A03, r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r0 == -1) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        r2 = r9.A03;
        r0 = getCurrentLayoutState();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r9.A00 != -1) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (r0 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r0 = com.facebook.litho.BaseMountingView.A03(r9, r1, X.C246033ds.A01, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
        if (r0 == -1) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008f, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0090, code lost:
        setMeasuredDimension(r4, r3);
        r9.A03 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0096, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0098, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r8 != -1) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r7 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r7 != -1) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r7 = getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r9.A01 = -1;
        r9.A00 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r8 = r9.A01
            r2 = 1
            r6 = 0
            r5 = -1
            if (r8 != r5) goto L_0x000c
            int r1 = r9.A00
            r0 = 0
            if (r1 == r5) goto L_0x0025
        L_0x000c:
            r0 = 1
            if (r8 == r5) goto L_0x0025
        L_0x000f:
            int r7 = r9.A00
            if (r7 != r5) goto L_0x0017
            int r7 = r9.getHeight()
        L_0x0017:
            r9.A01 = r5
            r9.A00 = r5
            if (r0 == 0) goto L_0x002a
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x002a
            r9.setMeasuredDimension(r8, r7)
            return
        L_0x0025:
            int r8 = r9.getWidth()
            goto L_0x000f
        L_0x002a:
            X.2T4 r0 = r9.A00
            if (r0 != 0) goto L_0x004a
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0048
            int r1 = android.view.View.MeasureSpec.getSize(r10)
        L_0x003a:
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            if (r0 != r2) goto L_0x0044
            int r6 = android.view.View.MeasureSpec.getSize(r11)
        L_0x0044:
            r9.setMeasuredDimension(r1, r6)
            return
        L_0x0048:
            r1 = 0
            goto L_0x003a
        L_0x004a:
            X.3XI r0 = r9.getRequireTreeState()
            X.3XK r0 = r0.A06
            boolean r1 = r0.A00
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0059
            if (r1 == 0) goto L_0x0059
            r2 = 0
        L_0x0059:
            X.2T4 r0 = r9.getRequireLayoutState()
            int r4 = r0.A0C
            X.2T4 r0 = r9.getRequireLayoutState()
            int r3 = r0.A09
            if (r2 == 0) goto L_0x0090
            r9.A0U()
            boolean r2 = r9.A03
            X.2T4 r0 = r9.getCurrentLayoutState()
            if (r0 == 0) goto L_0x0098
            X.3dr r1 = r0.A01
        L_0x0074:
            X.3du r0 = X.C246033ds.A03
            int r0 = com.facebook.litho.BaseMountingView.A03(r9, r1, r0, r8, r2)
            if (r0 == r5) goto L_0x007d
            r4 = r0
        L_0x007d:
            boolean r2 = r9.A03
            X.2T4 r0 = r9.getCurrentLayoutState()
            if (r0 == 0) goto L_0x0096
            X.3dr r1 = r0.A00
        L_0x0087:
            X.3du r0 = X.C246033ds.A01
            int r0 = com.facebook.litho.BaseMountingView.A03(r9, r1, r0, r7, r2)
            if (r0 == r5) goto L_0x0090
            r3 = r0
        L_0x0090:
            r9.setMeasuredDimension(r4, r3)
            r9.A03 = r6
            return
        L_0x0096:
            r1 = 0
            goto L_0x0087
        L_0x0098:
            r1 = 0
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53605GrK.onMeasure(int, int):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.litho.BaseMountingView, X.GrK, android.view.View] */
    public final void setLayoutState(2T4 r5, AnonymousClass3XI r6) {
        boolean A1Z = AnonymousClass7TG.A1Z(r5, r6);
        AnonymousClass2VL.A00();
        2T4 r0 = this.A00;
        boolean z = false;
        if (r0 != r5) {
            if (r0 == null || getRequireLayoutState().A08 != r5.A08) {
                z = true;
            }
            this.A03 = z;
            this.A0A = A1Z;
            this.A0H.setEmpty();
            if (this.A00 != null && this.A03) {
                A0V();
            }
            this.A00 = r5;
            this.A01 = r6;
            A0X();
            requestLayout();
        } else if (this.A01 != r6) {
            throw C51967G9n.A0i();
        } else if (this.A09) {
            this.A0J.A0A();
        }
    }

    public final void setOnClean(C62320sa r1) {
        this.A02 = r1;
    }
}
