package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Jmo  reason: case insensitive filesystem */
public abstract class C60517Jmo extends C249703kE {
    public final void A00(AnonymousClass8IM r11, 0sP r12) {
        JY5 jy5;
        if (this instanceof C61777KLq) {
            C61777KLq kLq = (C61777KLq) this;
            0qQ.A0B(r11, 0);
            C61184Jyd jyd = (C61184Jyd) r11;
            IgImageView igImageView = kLq.A01;
            boolean z = jyd.A03;
            int i = 8;
            igImageView.setVisibility(DbW.A00(z ? 1 : 0));
            if (igImageView.getVisibility() == 0) {
                String str = jyd.A01;
                if (str != null) {
                    Spannable spannable = C306386Ly.A0d;
                    C306386Ly r0 = new C306386Ly(AnonymousClass7TE.A0S(igImageView), igImageView.getWidth());
                    r0.A0M(str);
                    igImageView.setImageDrawable(r0);
                }
                String str2 = jyd.A02;
                if (0qQ.A0K(str2, "None")) {
                    Context context = igImageView.getContext();
                    DbU.A13(context, igImageView, R.drawable.instagram_circle_x_pano_outline_24);
                    DbU.A14(context, igImageView, 2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_06));
                }
                Resources A05 = DbU.A05(igImageView);
                boolean A0K = 0qQ.A0K(str2, "None");
                int i2 = R.dimen.ad4ad_button_bottom_margin;
                if (A0K) {
                    i2 = R.dimen.abc_select_dialog_padding_start_material;
                }
                int dimensionPixelSize = A05.getDimensionPixelSize(i2);
                igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                igImageView.setSelected(jyd.A04);
            }
            LoadingSpinnerView loadingSpinnerView = kLq.A02;
            if (z) {
                i = 0;
            }
            loadingSpinnerView.setVisibility(i);
            if (loadingSpinnerView.getVisibility() == 0) {
                jy5 = JY5.LOADING;
            } else {
                jy5 = JY5.SUCCESS;
            }
            loadingSpinnerView.setLoadingStatus(jy5);
            IgTextView igTextView = kLq.A00;
            igTextView.setText(jyd.A02);
            Context context2 = igTextView.getContext();
            boolean z2 = jyd.A04;
            int i3 = R.attr.igds_color_creation_tools_grey_06;
            if (z2) {
                i3 = R.attr.igds_color_primary_text_on_media;
            }
            JTS.A0u(context2, igTextView, i3);
            LYG.A02(kLq.itemView, 21, r12, r11);
            return;
        }
        C61778KLr kLr = (C61778KLr) this;
        0qQ.A0B(r11, 0);
        AnonymousClass8IL r2 = (AnonymousClass8IL) r11;
        RoundedCornerFrameLayout roundedCornerFrameLayout = kLr.A02;
        roundedCornerFrameLayout.setSelected(r2.A04);
        LYG.A02(roundedCornerFrameLayout, 1, r12, r11);
        AnonymousClass8IJ r02 = r2.A01;
        if (r02 != null) {
            kLr.A01.setBackgroundResource(r02.A02);
        }
        kLr.A00.setText(r2.A03);
        Integer num = r2.A02;
        Integer num2 = AnonymousClass05K.A01;
        SpinnerImageView spinnerImageView = kLr.A03;
        if (num == num2) {
            DbS.A1T(spinnerImageView);
            kLr.A01.setVisibility(8);
        } else {
            spinnerImageView.setLoadingStatus(C255943uy.LOADED);
            kLr.A01.setVisibility(0);
        }
        LYG.A02(kLr.itemView, 2, r12, r11);
    }
}
