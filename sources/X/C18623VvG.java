package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.VvG  reason: case insensitive filesystem */
public final class C18623VvG {
    public String A00;
    public boolean A01;
    public long A02;
    public String A03;
    public boolean A04;
    public final FrameLayout A05;
    public final int A06;
    public final C338507i4 A07;
    public final AnonymousClass357 A08;
    public final Runnable A09 = new C20046Wk6(this);
    public final String A0A;

    public static void A00(C18623VvG vvG) {
        C338507i4 r0;
        AnonymousClass357 r2 = vvG.A08;
        if (r2.A02 != null) {
            if (vvG.A01) {
                String str = vvG.A00;
                if (str == null) {
                    str = vvG.A03;
                }
                TextView textView = r2.A07;
                if (textView != null) {
                    textView.setText(str);
                }
                r0 = null;
            } else {
                String str2 = vvG.A0A;
                TextView textView2 = r2.A07;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
                r0 = vvG.A07;
            }
            r2.A03(r0);
        }
    }

    public final void A01() {
        if (this.A04) {
            long currentTimeMillis = System.currentTimeMillis() - this.A02;
            FrameLayout frameLayout = this.A05;
            Runnable runnable = this.A09;
            frameLayout.removeCallbacks(runnable);
            if (currentTimeMillis <= 1000) {
                frameLayout.postDelayed(runnable, 1000 - currentTimeMillis);
                return;
            }
            AnonymousClass357 r1 = this.A08;
            r1.A04(r1.A04);
            C338507i4 r12 = this.A07;
            if (r12.isRunning()) {
                r12.stop();
            }
            this.A04 = false;
        }
    }

    public final void A02() {
        AnonymousClass357 r4 = this.A08;
        if (!AnonymousClass7TF.A1V(r4.A02)) {
            FrameLayout frameLayout = this.A05;
            r4.A06(frameLayout);
            r4.A01(this.A06 | 1);
            r4.A03(this.A07);
            ImageView imageView = r4.A05;
            17k.A07(imageView, "accessoryView is null");
            int round = Math.round(0nA.A00(frameLayout.getContext(), 24.5f));
            0nA.A0g(imageView, round, round);
            A00(this);
        }
        r4.A05(r4.A03);
        this.A04 = true;
        this.A02 = System.currentTimeMillis();
        C338507i4 r1 = this.A07;
        if (!r1.isRunning()) {
            r1.start();
        }
    }

    public C18623VvG(View.OnClickListener onClickListener, FrameLayout frameLayout, int i) {
        this.A05 = frameLayout;
        this.A06 = i;
        Context context = frameLayout.getContext();
        Resources resources = context.getResources();
        this.A00 = this.A05.getResources().getString(2131972865);
        this.A03 = frameLayout.getResources().getString(2131972865);
        String string = resources.getString(2131965494);
        this.A0A = string;
        if (onClickListener != null) {
            AnonymousClass357 r2 = new AnonymousClass357(context, new WBG(65, onClickListener, this), string, R.style.map_search_pill_style, false);
            this.A08 = r2;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.fbpay_ui_text_button_width);
            if (dimensionPixelSize != r2.A00) {
                r2.A00 = dimensionPixelSize;
                AnonymousClass357.A00(r2.A02, r2);
            }
        } else {
            this.A08 = new AnonymousClass357(context, (View.OnClickListener) null, string, R.style.map_search_pill_style, true);
        }
        C338507i4 r1 = new C338507i4(context);
        this.A07 = r1;
        r1.A00(0nA.A00(context, 2.5f));
        r1.A02(Paint.Cap.ROUND);
        DbX.A11(context, r1, 2Yu.A0B(context));
    }
}
