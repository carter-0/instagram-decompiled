package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Wli  reason: case insensitive filesystem */
public final class C20122Wli implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C14576Tyg A01;

    public C20122Wli(FrameLayout frameLayout, C14576Tyg tyg) {
        this.A01 = tyg;
        this.A00 = frameLayout;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Tyy, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.Tyy, android.widget.ImageView, android.view.View] */
    public final void run() {
        C14576Tyg tyg = this.A01;
        VQZ vqz = tyg.A03;
        FrameLayout frameLayout = this.A00;
        if (vqz != null) {
            FrameLayout frameLayout2 = tyg.A00;
            if (frameLayout2 == null) {
                frameLayout2 = new FrameLayout(tyg.A01);
                tyg.A00 = frameLayout2;
            }
            Context context = tyg.A01;
            if (frameLayout2 != null) {
                X5N x5n = tyg.A04;
                boolean A1Y = C51970G9q.A1Y(x5n);
                View inflate = LayoutInflater.from(context).inflate(R.layout.shops_lite_loading_view_ig, (ViewGroup) null, A1Y);
                ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
                C7571QKc qKc = vqz.A00;
                String str = vqz.A01;
                viewTreeObserver.addOnGlobalLayoutListener(new C11513Sba(inflate, qKc, str));
                frameLayout2.addView(inflate);
                Interpolator interpolator = C7293Q2s.A09;
                C7293Q2s q2s = new C7293Q2s(context, 4.0f, -16751392, (int) C14573Tyc.A00(context, 64.0f));
                ? imageView = new ImageView(context);
                imageView.A01(q2s);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                frameLayout2.addView(imageView, layoutParams);
                imageView.A00();
                View findViewById = frameLayout2.findViewById(R.id.shops_lite_cancel_button_ig);
                if (findViewById != null) {
                    AnonymousClass0fU.A00(new C11486Sb9(x5n, qKc, str, A1Y ? 1 : 0), findViewById);
                    findViewById.setBackgroundResource(R.drawable.instagram_x_pano_outline_24);
                    Drawable drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_24);
                    if (drawable != null) {
                        DbX.A11(context, drawable, R.color.igds_primary_text);
                    }
                }
                TextView A0d = AnonymousClass7TE.A0d(frameLayout2, R.id.loading_screen_text_ig);
                if (A0d != null) {
                    DbT.A17(context, A0d, R.color.igds_primary_text);
                }
                frameLayout.addView(tyg.A00);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        boolean CRA = tyg.A05.CRA();
        Interpolator interpolator2 = C7293Q2s.A09;
        Context context2 = tyg.A01;
        C7293Q2s q2s2 = new C7293Q2s(context2, 2.0f, 1Kq.A03(C21255XRa.A1w, CRA), (int) C14573Tyc.A00(context2, 1Kq.A01(AnonymousClass05K.A0R)));
        ? imageView2 = new ImageView(context2);
        imageView2.A01(q2s2);
        FrameLayout frameLayout3 = tyg.A00;
        if (frameLayout3 == null) {
            frameLayout3 = new FrameLayout(context2);
            tyg.A00 = frameLayout3;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (!tyg.A06) {
            Integer num = AnonymousClass05K.A0C;
            GNY A06 = 1Kq.A06(num);
            float f = A06.A00;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C14573Tyc.A00(context2, (float) 1Kq.A04(AnonymousClass05K.A0Y)));
            gradientDrawable.setStroke((int) f, 1Kq.A03((C21255XRa) A06.A01, CRA));
            gradientDrawable.setColor(1Kq.A03(C21255XRa.A1y, CRA));
            C55796Hnc A05 = 1Kq.A05(AnonymousClass05K.A15);
            Button button = new Button(context2);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(2131958471);
            float f2 = A05.A00;
            button.setTextSize(f2);
            C14573Tyc.A01(context2, button, C21255XRa.A25, num, CRA);
            button.setLineSpacing(0.0f, 1Kq.A00(A05.A02));
            button.setTypeface(C64361Kj.A00().A05.A00(context2, ((XSX) A05.A04).name()));
            C13990Tnq.A0m(context2, button, A05, f2);
            C18887WAz.A00(button, 5, tyg);
            button.setAlpha(0.0f);
            04K A03 = 03v.A03(button);
            A03.A05(3000);
            A03.A02(1.0f);
            A03.A04(200);
            A03.A06(new LinearInterpolator());
            A03.A01();
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins((int) C14573Tyc.A00(context2, 20.0f), 0, (int) C14573Tyc.A00(context2, 20.0f), (int) C14573Tyc.A00(context2, 20.0f));
            layoutParams3.weight = 1.0f;
            linearLayout.addView(button, layoutParams3);
            frameLayout3.addView(linearLayout);
        }
        frameLayout3.addView(imageView2, layoutParams2);
        frameLayout.addView(frameLayout3);
        imageView2.A00();
    }
}
