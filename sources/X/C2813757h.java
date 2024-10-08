package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.zero.cms.ZeroCmsTextView;

/* renamed from: X.57h  reason: invalid class name and case insensitive filesystem */
public final class C2813757h extends AnonymousClass1GX {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public 1wn A05;
    public ZeroCmsTextView A06;
    public boolean A07 = true;

    public C2813757h(LinearLayout linearLayout) {
        this.A03 = linearLayout;
        this.A06 = (ZeroCmsTextView) linearLayout.findViewById(R.id.free_photo_text);
        this.A04 = (TextView) this.A03.findViewById(R.id.video_setting_status_text);
        this.A02 = (ImageView) this.A03.findViewById(R.id.video_setting_icon);
        Drawable drawable = this.A03.getContext().getDrawable(R.drawable.video_setting_banner_background_blue);
        Drawable drawable2 = this.A03.getContext().getDrawable(R.drawable.video_setting_banner_background_white);
        this.A01 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A05 = new C71925Ot9(this);
    }

    public final void onScroll(C238133Ar r7, int i, int i2, int i3, int i4, int i5) {
        TransitionDrawable transitionDrawable;
        int A032 = AnonymousClass0fD.A03(1833043501);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        if (z != this.A07) {
            this.A07 = z;
            if (z) {
                transitionDrawable = this.A01;
            } else {
                transitionDrawable = this.A00;
            }
            LinearLayout linearLayout = this.A03;
            linearLayout.setBackgroundDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
            ZeroCmsTextView zeroCmsTextView = this.A06;
            if (zeroCmsTextView != null) {
                Context context = linearLayout.getContext();
                int i6 = R.color.zero_rating_video_settings_drawer_cancel_button_color;
                if (z) {
                    i6 = R.color.design_dark_default_color_on_background;
                }
                zeroCmsTextView.setTextColor(context.getColor(i6));
            }
            TextView textView = this.A04;
            if (textView != null) {
                Context context2 = linearLayout.getContext();
                int i7 = R.color.zero_rating_video_settings_drawer_subtitle_color;
                if (z) {
                    i7 = R.color.fds_white_alpha60;
                }
                textView.setTextColor(context2.getColor(i7));
            }
            ImageView imageView = this.A02;
            if (imageView != null) {
                Context context3 = linearLayout.getContext();
                int i8 = R.color.baseline_neutral_80;
                if (z) {
                    i8 = R.color.design_dark_default_color_on_background;
                }
                imageView.setColorFilter(AnonymousClass37O.A00(context3.getColor(i8)));
            }
        }
        AnonymousClass0fD.A0A(209932255, A032);
    }
}
