package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;

public class QAL extends QAE {
    public FrameLayout A00;
    public V4O A01;
    public V4O A02;
    public BottomSheetBehavior A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public FrameLayout A07;
    public CoordinatorLayout A08;
    public boolean A09;

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) A01(view, layoutParams, 0));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QAL(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968780(0x7f0400cc, float:1.7546223E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L_0x0049
            int r6 = r3.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r2 = 1
            r4.A04 = r2
            r4.A05 = r2
            r1 = 3
            X.Qxi r0 = new X.Qxi
            r0.<init>(r4, r1)
            r4.A01 = r0
            X.2X1 r0 = r4.A04()
            r0.A0Q(r2)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r0 = 2130969356(0x7f04030c, float:1.7547392E38)
            r1 = 0
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0)
            boolean r0 = r0.getBoolean(r1, r1)
            r4.A09 = r0
            return
        L_0x0049:
            r6 = 2132018363(0x7f1404bb, float:1.967503E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAL.<init>(android.content.Context, int):void");
    }

    private void A02() {
        if (this.A07 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.A07 = frameLayout;
            this.A08 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.A07.findViewById(R.id.design_bottom_sheet);
            this.A00 = frameLayout2;
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(frameLayout2);
            this.A03 = A012;
            A012.A0a(this.A01);
            this.A03.A0b(this.A04);
        }
    }

    public final BottomSheetBehavior A06() {
        if (this.A03 == null) {
            A02();
        }
        return this.A03;
    }

    private FrameLayout A01(View view, ViewGroup.LayoutParams layoutParams, int i) {
        A02();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = DbT.A0C(getLayoutInflater(), viewGroup, i);
        }
        if (this.A09) {
            AnonymousClass03j.A00(this.A00, new C11611SdE(this, 3));
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        C11496SbJ.A01(viewGroup.findViewById(R.id.touch_outside), 68, this);
        03v.A0B(this.A00, new U7N(this, 1));
        C11507SbU.A00(this.A00, 8, this);
        return this.A07;
    }

    public void cancel() {
        A06();
        super.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (android.graphics.Color.alpha(r3.getNavigationBarColor()) >= 255) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L_0x0038
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x001a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            android.widget.FrameLayout r1 = r4.A07
            if (r1 == 0) goto L_0x0024
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x0024:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A08
            if (r1 == 0) goto L_0x002d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x002d:
            if (r2 == 0) goto L_0x0038
            r1 = 768(0x300, float:1.076E-42)
            android.view.View r0 = r3.getDecorView()
            r0.setSystemUiVisibility(r1)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAL.onAttachedToWindow():void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
            window.setLayout(-1, -1);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0G == 5) {
            bottomSheetBehavior.A0W(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A04 != z) {
            this.A04 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A03;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0b(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A04) {
            this.A04 = true;
        }
        this.A05 = z;
        this.A06 = true;
    }

    public QAL(Context context) {
        this(context, 0);
        this.A09 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public final void setContentView(View view) {
        super.setContentView((View) A01(view, (ViewGroup.LayoutParams) null, 0));
    }

    public final void setContentView(int i) {
        super.setContentView((View) A01((View) null, (ViewGroup.LayoutParams) null, i));
    }
}
