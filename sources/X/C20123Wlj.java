package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.Wlj  reason: case insensitive filesystem */
public final class C20123Wlj implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C49575Eyk A01;

    public C20123Wlj(FrameLayout frameLayout, C49575Eyk eyk) {
        this.A01 = eyk;
        this.A00 = frameLayout;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Tyy, android.widget.ImageView, android.view.View] */
    public final void run() {
        C49575Eyk eyk = this.A01;
        FrameLayout frameLayout = this.A00;
        Context context = eyk.A01;
        boolean A002 = AnonymousClass3HA.A00(context);
        Interpolator interpolator = C7293Q2s.A09;
        C7293Q2s q2s = new C7293Q2s(context, 2.0f, 1Kq.A03(C21255XRa.A1w, A002), (int) C14573Tyc.A00(context, 1Kq.A01(AnonymousClass05K.A0R)));
        ? imageView = new ImageView(context);
        imageView.A01(q2s);
        FrameLayout frameLayout2 = eyk.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            eyk.A00 = frameLayout2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Integer num = AnonymousClass05K.A0C;
        GNY A06 = 1Kq.A06(num);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C14573Tyc.A00(context, (float) 1Kq.A04(AnonymousClass05K.A0Y)));
        gradientDrawable.setStroke((int) A06.A00, 1Kq.A03((C21255XRa) A06.A01, A002));
        gradientDrawable.setColor(1Kq.A03(C21255XRa.A1y, A002));
        C55796Hnc A05 = 1Kq.A05(AnonymousClass05K.A15);
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(2131958471);
        float f = A05.A00;
        button.setTextSize(f);
        C14573Tyc.A01(context, button, C21255XRa.A25, num, A002);
        button.setLineSpacing(0.0f, 1Kq.A00(A05.A02));
        C13990Tnq.A0m(context, button, A05, f);
        C18887WAz.A00(button, 6, eyk);
        button.setAlpha(0.0f);
        04K A03 = 03v.A03(button);
        A03.A05(3000);
        A03.A02(1.0f);
        A03.A04(200);
        A03.A06(new LinearInterpolator());
        A03.A01();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) C14573Tyc.A00(context, 20.0f), 0, (int) C14573Tyc.A00(context, 20.0f), (int) C14573Tyc.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout.addView(button, layoutParams2);
        frameLayout2.addView(imageView, layoutParams);
        frameLayout2.addView(linearLayout);
        ViewGroup viewGroup = (ViewGroup) frameLayout2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout2);
        }
        frameLayout.addView(frameLayout2);
        imageView.A00();
    }
}
