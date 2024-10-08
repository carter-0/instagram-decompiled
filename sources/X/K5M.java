package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

public final class K5M extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "PanavisionCCPNuxBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public PrimerBottomSheetConfig A02;
    public CharSequence A03;
    public final CallerContext A04 = CallerContext.A01(__redex_internal_original_name);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        return isVisible();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(768359051);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.primer_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-155579344, A022);
        return inflate;
    }

    public final void onResume() {
        int i;
        int i2;
        int A022 = AnonymousClass0fD.A02(1383165557);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            C367288qV r11 = C367288qV.A01;
            AnonymousClass0eM r10 = this.A05;
            boolean A06 = C367288qV.A06(AnonymousClass7TE.A0l(r10));
            boolean A0C = 2D5.A00(AnonymousClass7TE.A0l(r10)).A0C();
            InfoItem infoItem = null;
            if (A06) {
                UserSession A0l = AnonymousClass7TE.A0l(r10);
                CallerContext callerContext = this.A04;
                0qQ.A06(callerContext);
                C60951Ju9 A012 = C367288qV.A01(callerContext, A0l);
                if (A012 != null) {
                    int ordinal = A012.A01.ordinal();
                    if (ordinal == 1) {
                        i2 = 2131955576;
                    } else if (ordinal == 2) {
                        i2 = 2131955574;
                    } else if (ordinal == 3) {
                        i2 = 2131955573;
                    } else if (ordinal == 5) {
                        i2 = 2131955575;
                    }
                    infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), DbU.A0m(this, i2), (String) null);
                }
            } else {
                if (A0C) {
                    i = 2131955571;
                } else if (r11.A0F(AnonymousClass7TE.A0l(r10))) {
                    UserSession A0l2 = AnonymousClass7TE.A0l(r10);
                    0qQ.A0B(A0l2, 0);
                    if (C363558jv.A00(A0l2) && !2D5.A00(A0l2).A0C()) {
                        i = 2131955577;
                    }
                }
                infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), DbU.A0m(this, i), (String) null);
            }
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, 2Yu.A0H(getContext(), R.attr.igds_color_gradient_red), 2Yu.A0H(getContext(), R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            String A0m = DbU.A0m(this, 2131955558);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
            InfoItem[] infoItemArr = {new InfoItem(simpleIconConfig, valueOf, A0m, (String) null), JTR.A0t(valueOf, DbU.A0m(this, 2131955559), R.drawable.instagram_user_circle_pano_outline_24), JTR.A0t(valueOf, DbU.A0m(this, 2131955572), R.drawable.instagram_remix_pano_outline_24), infoItem};
            0qQ.A0B(infoItemArr, 0);
            PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(titleIcon, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, __redex_internal_original_name, DbU.A0m(this, 2131968772), DbU.A0m(this, 2131963115), (String) null, 03t.A0I(infoItemArr), 2131955580, false, false, false);
            this.A02 = primerBottomSheetConfig;
            IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.headline);
            TitleIcon titleIcon2 = primerBottomSheetConfig.A01;
            if (titleIcon2 != null) {
                Context requireContext = requireContext();
                Drawable drawable = requireContext.getDrawable(titleIcon2.A00);
                Drawable drawable2 = drawable;
                if (drawable == null) {
                    drawable2 = null;
                } else {
                    ColorTint colorTint = titleIcon2.A01;
                    if (colorTint != null) {
                        if (colorTint.A02 == 0) {
                            drawable2 = AnonymousClass3JT.A03(requireContext, drawable, requireContext.getColor(colorTint.A01), requireContext.getColor(colorTint.A00));
                        } else {
                            drawable2 = drawable;
                        }
                    }
                }
                igdsHeadline.setImageDrawable(drawable2);
            }
            igdsHeadline.setHeadline(2131955580);
            DbT.A0I(view, R.id.info_list).setAdapter(new C60412Jl5((Integer) null, (Integer) null, primerBottomSheetConfig.A0D));
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(view, R.id.primer_bottom_button);
            igdsBottomButtonLayout.setPrimaryActionText(primerBottomSheetConfig.A0B);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(this.A00);
            igdsBottomButtonLayout.setSecondaryActionText(primerBottomSheetConfig.A0C);
            igdsBottomButtonLayout.setSecondaryActionOnClickListener(this.A01);
            igdsBottomButtonLayout.setFooterAboveActionText(this.A03);
        }
        AnonymousClass0fD.A09(1795259151, A022);
    }
}
