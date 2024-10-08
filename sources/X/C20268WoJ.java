package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.WoJ  reason: case insensitive filesystem */
public final class C20268WoJ implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C14577Tyh A01;
    public final /* synthetic */ boolean A02;

    public C20268WoJ(FrameLayout frameLayout, C14577Tyh tyh, boolean z) {
        this.A01 = tyh;
        this.A00 = frameLayout;
        this.A02 = z;
    }

    public final void run() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C14577Tyh tyh = this.A01;
        FrameLayout frameLayout3 = this.A00;
        X23 x23 = tyh.A03;
        boolean z = this.A02;
        FrameLayout frameLayout4 = tyh.A00;
        if (frameLayout4 == null) {
            tyh.A00 = new FrameLayout(tyh.A01);
        } else if (!(frameLayout4.getParent() == null || (frameLayout = tyh.A00) == null)) {
            C13989Tnp.A17(frameLayout);
            frameLayout.removeAllViews();
        }
        boolean CRA = tyh.A05.CRA();
        float A022 = 1Kq.A02(AnonymousClass05K.A0B);
        Context context = tyh.A01;
        Resources resources = context.getResources();
        ViewParent viewParent = null;
        AnonymousClass3NY r3 = new AnonymousClass3NY();
        r3.A00 = resources.getDrawable(R.drawable.ic_error_outline_96_rev, (Resources.Theme) null);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(r3);
        imageView.setPadding(0, 0, 0, (int) C14573Tyc.A00(context, 1Kq.A02(AnonymousClass05K.A0f)));
        imageView.setColorFilter(1Kq.A03(C21255XRa.A2A, CRA));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) C14573Tyc.A00(context, A022), 0, (int) C14573Tyc.A00(context, A022), 0);
        linearLayout.addView(imageView, layoutParams);
        Integer num = AnonymousClass05K.A0C;
        C55796Hnc A05 = 1Kq.A05(num);
        TextView textView = new TextView(context);
        textView.setText(R.string.f0nameremoved);
        int A03 = 1Kq.A03(C21255XRa.A1r, CRA);
        textView.setTextColor(A03);
        float f = A05.A00;
        textView.setTextSize(f);
        textView.setLineSpacing(0.0f, 1Kq.A00(A05.A02));
        C13990Tnq.A0m(context, textView, A05, f);
        textView.setTypeface(C64361Kj.A00().A05.A00(context, ((XSX) A05.A04).A00));
        textView.setMaxLines(3);
        textView.setPadding(0, 0, 0, (int) C14573Tyc.A00(context, 1Kq.A02(AnonymousClass05K.A0b)));
        Integer num2 = AnonymousClass05K.A00;
        C55796Hnc A052 = 1Kq.A05(num2);
        TextView textView2 = new TextView(context);
        textView2.setText(R.string.f0nameremoved);
        textView2.setTextColor(A03);
        float f2 = A052.A00;
        textView2.setTextSize(f2);
        textView2.setLineSpacing(0.0f, 1Kq.A00(A052.A02));
        textView.setTypeface(C64361Kj.A00().A05.A00(context, ((XSX) A052.A04).A00));
        C13990Tnq.A0m(context, textView2, A052, f2);
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        GNY A06 = 1Kq.A06(num2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C14573Tyc.A00(context, (float) 1Kq.A04(AnonymousClass05K.A0Y)));
        gradientDrawable.setColor(1Kq.A03(C21255XRa.A1c, CRA));
        gradientDrawable.setStroke((int) A06.A00, 1Kq.A03((C21255XRa) A06.A01, CRA));
        C55796Hnc A053 = 1Kq.A05(AnonymousClass05K.A15);
        Button button = new Button(context);
        button.setBackground(gradientDrawable);
        button.setText(R.string.f0nameremoved);
        float f3 = A053.A00;
        button.setTextSize(f3);
        C14573Tyc.A01(context, button, C21255XRa.A1h, num, CRA);
        button.setLineSpacing(0.0f, 1Kq.A00(A053.A02));
        button.setTypeface(C64361Kj.A00().A05.A00(context, ((XSX) A053.A04).name()));
        C13990Tnq.A0m(context, button, A053, f3);
        int A023 = (int) 1Kq.A02(AnonymousClass05K.A04);
        button.setPadding(A023, 0, A023, 0);
        WBH.A01(button, 2, x23, tyh);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) C14573Tyc.A00(context, 20.0f), 0, (int) C14573Tyc.A00(context, 20.0f), (int) C14573Tyc.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(button, layoutParams2);
        if (z && (frameLayout2 = tyh.A00) != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.company_layer_icons_close_outline_24);
            imageView2.setColorFilter(1Kq.A03(C21255XRa.A1o, CRA));
            C18887WAz.A00(imageView2, 4, tyh);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C14573Tyc.A00(context, 24.0f), (int) C14573Tyc.A00(context, 24.0f));
            layoutParams3.setMargins((int) C14573Tyc.A00(context, 20.0f), (int) C14573Tyc.A00(context, 30.0f), 0, 0);
            layoutParams3.gravity = 51;
            frameLayout2.addView(imageView2, layoutParams3);
        }
        FrameLayout frameLayout5 = tyh.A00;
        if (frameLayout5 != null) {
            frameLayout5.addView(linearLayout);
        }
        FrameLayout frameLayout6 = tyh.A00;
        if (frameLayout6 != null) {
            frameLayout6.addView(linearLayout2);
        }
        FrameLayout frameLayout7 = tyh.A00;
        if (!(frameLayout7 == null || frameLayout7.getParent() == null)) {
            FrameLayout frameLayout8 = tyh.A00;
            if (frameLayout8 != null) {
                viewParent = frameLayout8.getParent();
            }
            C66580MXl.A1R(viewParent);
            ((ViewGroup) viewParent).removeView(tyh.A00);
        }
        frameLayout3.addView(tyh.A00);
    }
}
