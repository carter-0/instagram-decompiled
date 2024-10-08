package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VHv  reason: case insensitive filesystem */
public abstract class C17099VHv {
    public static final void A00(UEM uem, C19276WSj wSj) {
        int i;
        int i2;
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout;
        ExtendedImageUrl A05;
        float f;
        WeakReference weakReference;
        UEM uem2 = uem;
        View view = uem2.A00;
        Context A0S = AnonymousClass7TE.A0S(view);
        C19276WSj wSj2 = wSj;
        UL1 ul1 = wSj2.A00;
        boolean z = uem2.A09;
        Resources resources = A0S.getResources();
        int A0B = AnonymousClass7TE.A0B(resources);
        if (z) {
            i = resources.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
        } else {
            i = A0B;
        }
        int A09 = (0nA.A09(A0S) - ((A0B * 2) + i)) / 2;
        view.setVisibility(0);
        C18010Vjm vjm = uem2.A03;
        vjm.A00 = new C20614Wvv(9, uem2, wSj2);
        C17702VcX vcX = wSj2.A01;
        vjm.A01 = vcX.A0A;
        C17542VZv vZv = uem2.A01;
        0qQ.A0B(vZv, 0);
        boolean z2 = ul1.A0I;
        if (z2) {
            vZv.A02.setVisibility(0);
            vZv.A04.setVisibility(8);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = vZv.A03;
            igBouncyUfiButtonImageView.setVisibility(0);
            int paddingStart = igBouncyUfiButtonImageView.getPaddingStart();
            int paddingTop = igBouncyUfiButtonImageView.getPaddingTop();
            Context context = vZv.A01;
            igBouncyUfiButtonImageView.setPaddingRelative(paddingStart, paddingTop, DbY.A01(context), igBouncyUfiButtonImageView.getPaddingBottom());
            DbU.A12(context, igBouncyUfiButtonImageView, 2131972502);
            igBouncyUfiButtonImageView.setSelected(ul1.A0H);
            igBouncyUfiButtonImageView.A05();
            WBE.A00(igBouncyUfiButtonImageView, 17, vZv, wSj2);
            C17969Vj5 vj5 = vZv.A00;
            C17969Vj5 vj52 = vcX.A02;
            if (vj5 != vj52) {
                if (!(vj5 == null || (weakReference = vj5.A00) == null || weakReference.get() != igBouncyUfiButtonImageView)) {
                    vj5.A01((C2355730j) null);
                }
                vZv.A00 = vj52;
                vj52.A01(igBouncyUfiButtonImageView);
            }
        } else if (ul1.A0L) {
            vZv.A02.setVisibility(0);
            vZv.A03.setVisibility(8);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = vZv.A04;
            igBouncyUfiButtonImageView2.setVisibility(0);
            WB0.A00(igBouncyUfiButtonImageView2, 10, vcX.A07);
        } else {
            vZv.A03.setVisibility(8);
            vZv.A04.setVisibility(8);
            vZv.A02.setVisibility(8);
        }
        VX4 vx4 = uem2.A04;
        0qQ.A0B(vx4, 0);
        List<C18049VkX> list = ul1.A09;
        if (list.isEmpty()) {
            vx4.A02.setVisibility(8);
            vx4.A01.setVisibility(8);
        } else {
            ClickableTextContainer clickableTextContainer = vx4.A02;
            clickableTextContainer.setVisibility(0);
            TextView textView = vx4.A01;
            textView.setVisibility(0);
            Integer num = ul1.A06;
            if (num != null) {
                0nA.A0V(clickableTextContainer, num.intValue() * vx4.A00);
            }
            Resources resources2 = clickableTextContainer.getResources();
            boolean z3 = ul1.A0D;
            int i3 = R.dimen.abc_button_inset_vertical_material;
            if (z3) {
                i3 = R.dimen.abc_action_bar_elevation_material;
            }
            0nA.A0e(clickableTextContainer, resources2.getDimensionPixelSize(i3));
            Resources resources3 = textView.getResources();
            int i4 = R.dimen.abc_button_padding_horizontal_material;
            if (z3) {
                i4 = R.dimen.abc_action_bar_elevation_material;
            }
            0nA.A0d(textView, resources3.getDimensionPixelSize(i4));
            if (z2) {
                i2 = JTR.A06(textView.getContext());
            } else {
                i2 = 0;
            }
            int i5 = A09 - i2;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C18049VkX A00 : list) {
                A0r.add(A00.A00(AnonymousClass7TE.A0S(textView), new 0rN(Layout.Alignment.ALIGN_NORMAL, textView.getPaint(), (String) null, textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), i5 - AnonymousClass7TE.A0D(resources3), textView.getIncludeFontPadding())));
            }
            C266444Yx r11 = ul1.A02;
            0qQ.A0B(r11, 1);
            textView.setContentDescription(r11.A00(resources3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            00k.A0q(spannableStringBuilder, "\n", "", "", A0r, (0sP) null);
            textView.setText(spannableStringBuilder);
            if (ul1.A0J) {
                textView.setMinLines(2);
                textView.setMaxLines(2);
            }
            textView.setOnLongClickListener(vcX.A00);
        }
        C17646Vbc vbc = uem2.A05;
        0qQ.A0B(vbc, 0);
        View view2 = vbc.A02;
        if (view2 instanceof RoundedCornerMediaFrameLayout) {
            roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) view2;
            if (roundedCornerMediaFrameLayout != null) {
                if (ul1.A0K) {
                    f = (float) vbc.A00.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
                } else {
                    f = 0.0f;
                }
                roundedCornerMediaFrameLayout.setStrokeWidth(f);
            }
        } else {
            roundedCornerMediaFrameLayout = null;
        }
        Integer num2 = ul1.A07;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (roundedCornerMediaFrameLayout != null) {
                roundedCornerMediaFrameLayout.setRadius(intValue);
            }
        }
        ImageInfo imageInfo = ul1.A04;
        if (!(imageInfo == null || (A05 = 1iI.A05(imageInfo, AnonymousClass05K.A0C, Math.min(A09, 1080))) == null)) {
            IgImageView igImageView = vbc.A04;
            igImageView.setUrl(A05, vcX.A01);
            igImageView.A0E = new WTN(3, wSj2, A05);
        }
        boolean z4 = ul1.A0B;
        IgImageView igImageView2 = vbc.A04;
        if (z4) {
            igImageView2.setImageAlpha(128);
            igImageView2.setImageRendererAndReset(C70390O4r.A00);
            igImageView2.setColorFilter(vbc.A00.getColor(R.color.black_25_transparent), PorterDuff.Mode.SRC_OVER);
        } else {
            igImageView2.setImageAlpha(255);
            igImageView2.A0I = null;
            igImageView2.clearColorFilter();
        }
        2eS.A01(igImageView2);
        igImageView2.setContentDescription(C56259HvT.A00(AnonymousClass7TF.A0A(vbc.A00), ul1.A01));
        float f2 = 1.0f;
        if (ul1.A0A) {
            f2 = 0.3f;
        }
        igImageView2.setAlpha(f2);
        C13989Tnp.A1B(igImageView2, ul1.A05, Uw7.PLAYING, true);
        igImageView2.setTransitionName((String) null);
        MediaFrameLayout mediaFrameLayout = vbc.A06;
        mediaFrameLayout.A00 = 1.0f;
        mediaFrameLayout.setOnLongClickListener(vcX.A00);
        View view3 = vbc.A01;
        AnonymousClass7TG.A1N(igImageView2, view3);
        igImageView2.A0E = new C57108IOw(view3, 0);
        vbc.A05.setVisibility(DbW.A01(ul1.A0C ? 1 : 0));
        VPX vpx = uem2.A08;
        int i6 = 0;
        0qQ.A0B(vpx, 0);
        C252063oV r10 = vpx.A00;
        ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration = ul1.A00;
        if (productTileBannerMetadataDecoration != null) {
            ((TextView) r10.getView()).setText(productTileBannerMetadataDecoration.AfG());
        } else {
            i6 = 8;
        }
        r10.setVisibility(i6);
        C17543VZw vZw = uem2.A06;
        0qQ.A0B(vZw, 0);
        boolean z5 = ul1.A0E;
        boolean z6 = ul1.A0F;
        boolean z7 = ul1.A0G;
        boolean z8 = ul1.A0D;
        C18272Vom.A01(vcX.A01, ul1.A03, vZw, ul1.A08, z5, z6, z7, z8);
        VPW vpw = uem2.A07;
        0qQ.A0B(vpw, 0);
        C252063oV r6 = vpw.A00;
        if (z7) {
            r6.setVisibility(0);
            WB0.A00(r6.getView(), 11, wSj2);
        } else {
            r6.setVisibility(8);
        }
        VX3 vx3 = uem2.A02;
        0qQ.A0B(vx3, 0);
        boolean z9 = ul1.A0J;
        ConstraintLayout constraintLayout = vx3.A00;
        if (z9) {
            constraintLayout.setVisibility(0);
            IgdsButton igdsButton = vx3.A01;
            igdsButton.setAlpha(1.0f);
            IgdsButton igdsButton2 = vx3.A02;
            igdsButton2.setAlpha(1.0f);
            WBE.A00(igdsButton, 18, vx3, wSj2);
            WBE.A00(igdsButton2, 19, vx3, wSj2);
            return;
        }
        constraintLayout.setVisibility(8);
        vx3.A01.setOnClickListener((View.OnClickListener) null);
        vx3.A02.setOnClickListener((View.OnClickListener) null);
    }
}
