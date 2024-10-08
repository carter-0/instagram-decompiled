package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.tooltippopup.MaskingFrameLayout;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: X.4rx  reason: invalid class name and case insensitive filesystem */
public final class C275794rx extends PopupWindow {
    public static volatile boolean A0M;
    public int A00;
    public int A01;
    public int A02;
    public C311686d5 A03;
    public WeakReference A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final Rect A09;
    public final Rect A0A;
    public final GestureDetector A0B;
    public final FrameLayout A0C;
    public final 2cs A0D;
    public final 0lT A0E;
    public final UserSession A0F;
    public final C60064Jem A0G;
    public final C57080INu A0H;
    public final C55887Hp8 A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final boolean A0L;

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.LinearLayout, X.Jem, android.view.View, android.view.ViewGroup] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C275794rx(C55887Hp8 hp8) {
        super(-2, -2);
        C55887Hp8 hp82 = hp8;
        UserSession userSession = hp82.A09;
        View view = hp82.A08;
        Context context = view.getContext();
        int intValue = ((Number) hp82.A02.A00(new C57424IaU(hp82), (Object) null)).intValue();
        ? linearLayout = new LinearLayout(context);
        View.inflate(context, R.layout.bubble_view_layout, linearLayout);
        linearLayout.setOrientation(1);
        int i = 0;
        linearLayout.setWillNotDraw(false);
        linearLayout.A02 = (MaskingFrameLayout) linearLayout.requireViewById(R.id.box);
        linearLayout.A03 = (MaskingFrameLayout) linearLayout.requireViewById(R.id.lower_nub);
        linearLayout.A04 = (MaskingFrameLayout) linearLayout.requireViewById(R.id.upper_nub);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C71382cm.A08);
        ViewStub viewStub = (ViewStub) linearLayout.requireViewById(R.id.content_stub);
        if (intValue == -1) {
            if (obtainStyledAttributes != null) {
                intValue = obtainStyledAttributes.getResourceId(1, -1);
            } else {
                throw new UnsupportedOperationException("Content not found");
            }
        }
        viewStub.setLayoutResource(intValue);
        viewStub.inflate();
        Context context2 = linearLayout.getContext();
        ColorFilter A002 = AnonymousClass37O.A00(context2.getColor(R.color.gradient_dark));
        Drawable background = linearLayout.A02.getBackground();
        background.getClass();
        background.mutate().setColorFilter(A002);
        Drawable drawable = context2.getDrawable(R.drawable.tooltip_shadow);
        linearLayout.A01 = drawable;
        drawable.mutate().setColorFilter(A002);
        linearLayout.A01.mutate().setAlpha(90);
        Rect rect = new Rect();
        linearLayout.A00 = rect;
        linearLayout.A01.getPadding(rect);
        Drawable background2 = linearLayout.A04.getBackground();
        background2.getClass();
        Drawable background3 = linearLayout.A03.getBackground();
        background3.getClass();
        Rect rect2 = linearLayout.A00;
        int i2 = rect2.left;
        int max = Math.max(0, rect2.top - background2.getIntrinsicHeight());
        Rect rect3 = linearLayout.A00;
        linearLayout.setPadding(i2, max, rect3.right, Math.max(0, rect3.bottom - background3.getIntrinsicHeight()));
        if (obtainStyledAttributes != null) {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            linearLayout.A03.setVisibility(z ? 4 : 0);
            linearLayout.A04.setVisibility(!z ? 4 : i);
            background3.mutate().setColorFilter(A002);
            background2.mutate().setColorFilter(A002);
            obtainStyledAttributes.recycle();
        }
        Integer num = hp82.A0A;
        Integer num2 = hp82.A0B;
        this.A03 = null;
        this.A0H = new C57080INu(this);
        this.A01 = -1;
        this.A00 = 0;
        this.A0E = new H5P(this);
        this.A0F = userSession;
        this.A0I = hp82;
        this.A0L = hp82.A06;
        FrameLayout frameLayout = new FrameLayout(context);
        this.A0C = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.A0G = linearLayout;
        Integer num3 = hp82.A03;
        if (num3 != null) {
            ColorFilter A003 = AnonymousClass37O.A00(context2.getColor(num3.intValue()));
            Drawable background4 = linearLayout.A02.getBackground();
            background4.getClass();
            background4.mutate().setColorFilter(A003);
            Drawable background5 = linearLayout.A03.getBackground();
            background5.getClass();
            background5.mutate().setColorFilter(A003);
            Drawable background6 = linearLayout.A04.getBackground();
            background6.getClass();
            background6.mutate().setColorFilter(A003);
        }
        Integer num4 = hp82.A04;
        if (num4 != null) {
            int intValue2 = num4.intValue();
            Drawable drawable2 = linearLayout.A01;
            if (drawable2 != null) {
                drawable2.mutate().setColorFilter(AnonymousClass37O.A00(context2.getColor(intValue2)));
            }
        }
        frameLayout.addView(linearLayout, layoutParams);
        setContentView(frameLayout);
        this.A0J = num;
        this.A0K = num2;
        this.A0A = new Rect();
        this.A05 = new WeakReference(view);
        Rect rect4 = this.A0A;
        view.getGlobalVisibleRect(rect4);
        update(rect4.left, rect4.top, rect4.width(), rect4.height());
        this.A08 = new Rect();
        setBackgroundDrawable(new ColorDrawable(0));
        this.A0B = new GestureDetector(context, new C52838GdU(this));
        this.A09 = new Rect();
        if (!hp82.A07) {
            linearLayout.A01 = null;
        }
        2cs A022 = C61340me.A00().A02();
        A022.A05(1.0d);
        A022.A0A(new K0A(this));
        this.A0D = A022;
    }

    public final void A01(Bitmap bitmap, float f) {
        C60064Jem jem = this.A0G;
        MaskingFrameLayout maskingFrameLayout = jem.A02;
        maskingFrameLayout.A01 = bitmap;
        maskingFrameLayout.A00 = f;
        maskingFrameLayout.invalidate();
        MaskingFrameLayout maskingFrameLayout2 = jem.A03;
        maskingFrameLayout2.A01 = bitmap;
        maskingFrameLayout2.A00 = f;
        maskingFrameLayout2.invalidate();
        MaskingFrameLayout maskingFrameLayout3 = jem.A04;
        maskingFrameLayout3.A01 = bitmap;
        maskingFrameLayout3.A00 = f;
        maskingFrameLayout3.invalidate();
    }

    public final void A03(boolean z) {
        float height;
        C60064Jem jem = this.A0G;
        if (jem.getVisibility() == 0) {
            0lU.A08(this.A0E);
            AnonymousClass1Nd.A00(this.A0I.A09).A02(this.A0H, C52451GTd.class);
            if (!z) {
                dismiss();
            } else if (!this.A06) {
                this.A06 = true;
                C71392co r0 = C315596kB.A02;
                C294975nL A012 = C294975nL.A01(jem, 0);
                A012.A0G();
                A012.A0U(jem.getScaleX(), 0.0f, (float) this.A02);
                float scaleY = jem.getScaleY();
                if (this.A07) {
                    height = 0.0f;
                } else {
                    height = (float) jem.getHeight();
                }
                A012.A0V(scaleY, 0.0f, height);
                A012.A0M(jem.getAlpha(), 0.0f);
                A012.A06 = new C65725Lyf(this);
                A012.A05 = new IZQ(this);
                A012.A0H();
            }
        }
    }

    public final void dismiss() {
        this.A00++;
        C311686d5 r0 = this.A03;
        if (r0 != null) {
            r0.DYA();
        }
        C60064Jem jem = this.A0G;
        boolean z = false;
        if (jem.getVisibility() != 0) {
            z = true;
        }
        boolean z2 = this.A06;
        C71392co r02 = C315596kB.A02;
        C294975nL.A01(jem, 0).A0G();
        this.A06 = false;
        jem.setVisibility(4);
        if (this.A0C.isAttachedToWindow()) {
            super.dismiss();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Message: ");
        sb.append("");
        sb.append(" , Animation running: ");
        sb.append(z2);
        sb.append(" , Dismiss: ");
        sb.append(this.A00);
        sb.append(" , Lifecycle: ");
        sb.append(this.A01);
        sb.append(" , Hidden: ");
        sb.append(z);
        0wb.A03("tooltip_detached_window", sb.toString());
    }

    public final void A02(View view, int i, int i2, boolean z) {
        WeakReference weakReference;
        View view2;
        if ((!isShowing() || this.A0G.getVisibility() != 0) && (weakReference = this.A05) != null && (view2 = (View) weakReference.get()) != null) {
            C55887Hp8 hp8 = this.A0I;
            hp8.A02.A00(new C57423IaT(this), (Object) null);
            this.A04 = new WeakReference(view);
            Rect rect = this.A08;
            view.getGlobalVisibleRect(rect);
            this.A07 = z;
            this.A0G.getViewTreeObserver().addOnPreDrawListener(new LZ4(this, rect.centerX() + i, rect.centerY() + i2, z));
            Rect rect2 = this.A0A;
            showAtLocation(view2, 0, rect2.left, rect2.top);
            0lU.A07(this.A0E);
            AnonymousClass1Nd.A00(hp8.A09).A01(this.A0H, C52451GTd.class);
            setOutsideTouchable(true);
            setTouchable(true);
            setFocusable(false);
            setTouchInterceptor(new IDM(this));
            if (hp8.A05) {
                view2.postDelayed(new C57756Ifx(this), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
            System.currentTimeMillis();
        }
    }
}
