package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class PMJ implements C74361Ptb {
    public AnonymousClass5Gv A00;
    public OK5 A01;
    public final Drawable A02;
    public final Drawable A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final ConstraintLayout A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final CircularImageView A0C;
    public final IgImageView A0D;
    public final C2806852z A0E;
    public final C70518O9r A0F;
    public final String A0G;
    public final String A0H;
    public final AnonymousClass0eM A0I = C73906Plh.A00(this, 12);

    /* JADX WARNING: type inference failed for: r1v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* renamed from: A00 */
    public final void ADN(C68295N9i n9i) {
        String str;
        int i;
        int i2;
        String str2;
        C68295N9i n9i2 = n9i;
        0qQ.A0B(n9i2, 0);
        boolean z = n9i2.A0S;
        ((C70776OKw) this.A0I.getValue()).A00(z);
        if (z) {
            View view = this.A04;
            0qQ.A06(view);
            view.setVisibility(DbW.A01(n9i2.A0U ? 1 : 0));
            TextView textView = this.A07;
            0qQ.A06(textView);
            textView.setVisibility(DbW.A01(n9i2.A0Y ? 1 : 0));
            IgImageView igImageView = this.A0D;
            0qQ.A06(igImageView);
            igImageView.setVisibility(DbW.A01(n9i2.A0P ? 1 : 0));
            if (n9i2.A0Q) {
                igImageView.setImageDrawable(this.A03);
                str = this.A0G;
            } else {
                igImageView.setImageDrawable(this.A02);
                str = this.A0H;
            }
            igImageView.setContentDescription(str);
            String str3 = n9i2.A0F;
            TextView textView2 = this.A06;
            if (str3 != null) {
                textView2.setText(str3);
                i = 0;
            } else {
                0qQ.A06(textView2);
                i = 8;
            }
            textView2.setVisibility(i);
            ImageUrl imageUrl = n9i2.A06;
            String str4 = n9i2.A0I;
            if (C253833rU.A02(imageUrl) || imageUrl == null) {
                ? r1 = this.A0C;
                0qQ.A06(r1);
                r1.setVisibility(8);
            } else {
                IgImageView igImageView2 = this.A0C;
                igImageView2.setUrl(imageUrl, this.A0A);
                igImageView2.setVisibility(0);
                igImageView2.setContentDescription(str4);
            }
            TextView textView3 = this.A08;
            if (str4 != null) {
                textView3.setText(str4);
                i2 = 0;
            } else {
                0qQ.A06(textView3);
                i2 = 8;
            }
            textView3.setVisibility(i2);
            String str5 = n9i2.A0B;
            if (str5 == null || (str2 = n9i2.A0C) == null) {
                AnonymousClass7TH.A0R(this.A0E.A03);
                return;
            }
            UserSession userSession = this.A0B;
            C2806852z r2 = this.A0E;
            C263314Kg.A04(userSession, (C2806752y) null, r2, new AnonymousClass4Ke((C376489Ie) null, (C67061rp) null, str5, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, false, false, true, true, true, false, false, false));
            TextView textView4 = r2.A03;
            if (textView4 != null) {
                textView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                textView4.setSelected(true);
                textView4.setHorizontallyScrolling(true);
                textView4.setHorizontalFadingEdgeEnabled(true);
                textView4.setMarqueeRepeatLimit(-1);
            }
            TextView textView5 = r2.A03;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
    }

    public PMJ(View view, AnonymousClass0iw r5, UserSession userSession, C70518O9r o9r) {
        this.A05 = view;
        this.A0A = r5;
        this.A0B = userSession;
        this.A0F = o9r;
        this.A09 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.player_controls_top);
        this.A07 = AnonymousClass7TE.A0d(view, R.id.cowatch_remove_button);
        this.A08 = AnonymousClass7TE.A0d(view, R.id.cowatch_attribution_username);
        this.A0C = (CircularImageView) view.findViewById(R.id.cowatch_attribution_avatar);
        this.A0E = new C2806852z(DbW.A0B(view, R.id.music_attribution_label), false);
        this.A06 = AnonymousClass7TE.A0d(view, R.id.cowatch_content_source);
        this.A04 = view.findViewById(R.id.cowatch_options_button);
        this.A0D = JTO.A0Y(view, R.id.cowatch_audio_button);
        Context context = view.getContext();
        this.A03 = context.getDrawable(R.drawable.instagram_volume_outline_44);
        this.A02 = context.getDrawable(R.drawable.instagram_volume_off_outline_44);
        this.A0G = AnonymousClass7TE.A16(context, 2131956811);
        this.A0H = AnonymousClass7TE.A16(context, 2131956812);
    }
}
