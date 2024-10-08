package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Mzk  reason: case insensitive filesystem */
public final class C68079Mzk extends C249703kE implements C74361Ptb {
    public Bitmap A00;
    public OK5 A01;
    public C68295N9i A02;
    public Float A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final TextView A08;
    public final TextView A09;
    public final AnonymousClass0iw A0A;
    public final IgLinearLayout A0B;
    public final IgProgressImageView A0C;
    public final MediaFrameLayout A0D;
    public final AnonymousClass0eM A0E = C73906Plh.A00(this, 4);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;

    /* renamed from: A00 */
    public final void ADN(C68295N9i n9i) {
        int i;
        int i2;
        int i3;
        0qQ.A0B(n9i, 0);
        this.A02 = n9i;
        int i4 = 0;
        if (!n9i.A0O || n9i.A0J != null) {
            this.A0C.A04();
            this.A0D.setVisibility(8);
            AnonymousClass7TE.A0c(this.A0E).setClickable(false);
            return;
        }
        AnonymousClass7TE.A0c(this.A0E).setClickable(false);
        MediaFrameLayout mediaFrameLayout = this.A0D;
        mediaFrameLayout.setVisibility(0);
        float f = n9i.A00;
        mediaFrameLayout.A00 = f;
        IgProgressImageView igProgressImageView = this.A0C;
        igProgressImageView.setAspectRatio(f);
        boolean z = n9i.A0S;
        if (!z || !n9i.A0Y) {
            i = 0;
        } else {
            i = DbX.A07(this.A0G);
        }
        if (!z || !n9i.A0Z) {
            i2 = 0;
        } else {
            i2 = DbX.A07(this.A0G);
        }
        boolean A0I = 0qQ.A0I(this.A03, f);
        this.A03 = Float.valueOf(f);
        mediaFrameLayout.post(new C73374PbX(this, i, i2, A0I));
        boolean z2 = n9i.A0W;
        View view = this.A06;
        0qQ.A06(view);
        view.setVisibility(DbW.A01(z2 ? 1 : 0));
        String str = n9i.A0H;
        String str2 = n9i.A0G;
        TextView textView = this.A09;
        0qQ.A06(textView);
        textView.setVisibility(0);
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setText(2131956816);
        }
        TextView textView2 = this.A08;
        0qQ.A06(textView2);
        textView2.setVisibility(0);
        if (str2 != null) {
            textView2.setText(str2);
        } else {
            textView2.setText(2131956815);
        }
        boolean z3 = n9i.A0T;
        View view2 = this.A04;
        0qQ.A06(view2);
        view2.setVisibility(DbW.A01(z3 ? 1 : 0));
        Bitmap bitmap = n9i.A04;
        if (bitmap == null) {
            igProgressImageView.setVisibility(8);
        } else if (!bitmap.equals(this.A00)) {
            BlurUtil.blurInPlace(bitmap, 3);
            igProgressImageView.setImageBitmap(bitmap);
            igProgressImageView.setEnableProgressBar(false);
            igProgressImageView.setVisibility(0);
        }
        this.A00 = bitmap;
        igProgressImageView.setAlpha(n9i.A01);
        ImageUrl imageUrl = n9i.A07;
        if (imageUrl != null) {
            boolean z4 = n9i.A0L;
            igProgressImageView.setUrl(imageUrl, this.A0A);
            igProgressImageView.setEnableProgressBar(z4);
            igProgressImageView.setVisibility(0);
        } else {
            igProgressImageView.setVisibility(8);
        }
        View A0c = AnonymousClass7TE.A0c(this.A0F);
        if (!n9i.A0M) {
            i4 = 8;
        }
        A0c.setVisibility(i4);
        boolean z5 = n9i.A0X;
        float f2 = n9i.A02;
        IgLinearLayout igLinearLayout = this.A0B;
        if (z5) {
            ViewGroup.LayoutParams layoutParams = igLinearLayout.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C71492dQ r1 = (C71492dQ) layoutParams;
            r1.A09 = f2;
            igLinearLayout.setLayoutParams(r1);
            i3 = 0;
        } else {
            i3 = 8;
        }
        igLinearLayout.setVisibility(i3);
    }

    public C68079Mzk(View view, AnonymousClass0iw r3) {
        super(view);
        this.A07 = view;
        this.A0A = r3;
        this.A0D = (MediaFrameLayout) view.findViewById(R.id.cowatch_media_container);
        this.A06 = view.findViewById(R.id.cowatch_content_placeholder);
        this.A09 = AnonymousClass7TE.A0d(view, R.id.cowatch_content_placeholder_title);
        this.A08 = AnonymousClass7TE.A0d(view, R.id.cowatch_content_placeholder_subtitle);
        this.A05 = view.findViewById(R.id.cowatch_paused_indicator);
        this.A04 = view.findViewById(R.id.cowatch_loading_spinner);
        this.A0C = (IgProgressImageView) view.findViewById(R.id.cowatch_image_view);
        this.A0B = (IgLinearLayout) view.findViewById(R.id.cowatch_swipe_nux_container);
        this.A0H = C73906Plh.A00(this, 7);
        this.A0G = C73906Plh.A00(this, 6);
        this.A0F = C73906Plh.A00(this, 5);
    }
}
