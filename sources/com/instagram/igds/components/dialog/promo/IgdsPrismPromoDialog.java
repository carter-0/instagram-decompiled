package com.instagram.igds.components.dialog.promo;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C48948Emm;
import X.C51907G7b;
import X.C71492dQ;
import X.DbT;
import X.FPA;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

public final class IgdsPrismPromoDialog {
    public final Dialog A00;
    public final DialogInterface.OnClickListener A01;
    public final DialogInterface.OnClickListener A02;
    public final C51907G7b A03;
    public final IgdsHeadline A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final Context A0D;
    public final DialogInterface.OnDismissListener A0E;

    public static void A00(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setPadding(i2, findViewById.getPaddingTop(), i2, findViewById.getPaddingBottom());
        }
    }

    public IgdsPrismPromoDialog(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, C51907G7b g7b, CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        this.A0D = context;
        this.A08 = str;
        this.A0C = z;
        this.A06 = charSequence;
        this.A0B = list;
        this.A05 = charSequence2;
        this.A09 = str2;
        this.A01 = onClickListener;
        this.A0A = str3;
        this.A02 = onClickListener2;
        this.A03 = g7b;
        this.A07 = num;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        this.A0E = onDismissListener2;
        Resources resources = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.igds_promo_dialog_layout, (ViewGroup) null, false);
        Dialog dialog = new Dialog(context, R.style.IgdsPrismPromoDialog);
        this.A00 = dialog;
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(z2);
        dialog.setCancelable(z3);
        dialog.setOnDismissListener(onDismissListener2);
        int min = Math.min(resources.getDimensionPixelSize(R.dimen.emoji_reaction_creation_tray_max_width), resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2));
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.igds_prism_dialog_bg);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(min, -2);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            WindowManager.LayoutParams attributes = window3.getAttributes();
            if (attributes != null) {
                attributes.gravity = 80;
            }
            WindowManager.LayoutParams attributes2 = window3.getAttributes();
            if (attributes2 != null) {
                attributes2.y = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            }
        }
        0qQ.A0A(inflate);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.igds_promo_dialog_headline);
        igdsHeadline.setHeadline((CharSequence) this.A08);
        igdsHeadline.setBody(this.A06);
        igdsHeadline.setBulletList(this.A0B);
        igdsHeadline.setDetailText(this.A05);
        Integer num2 = this.A07;
        TextView A0d = AnonymousClass7TE.A0d(igdsHeadline, R.id.igds_headline_headline);
        String A002 = C273654mx.A00(3);
        if (A0d != null) {
            A0d.setTextAppearance(R.style.igds_headline_1_bold);
            ViewGroup.LayoutParams layoutParams = A0d.getLayoutParams();
            0qQ.A0C(layoutParams, A002);
            ((C71492dQ) layoutParams).A03 = 0.0f;
            A0d.setGravity(8388611);
            if (this.A0C) {
                A0d.setGravity(1);
            }
        }
        TextView A0d2 = AnonymousClass7TE.A0d(igdsHeadline, R.id.igds_headline_body);
        if (A0d2 != null) {
            A0d2.setTextAppearance(R.style.igds_body_1);
            C48948Emm.A00(A0d2);
            ViewGroup.LayoutParams layoutParams2 = A0d2.getLayoutParams();
            0qQ.A0C(layoutParams2, A002);
            ((C71492dQ) layoutParams2).A03 = 0.0f;
            A0d2.setGravity(8388611);
        }
        TextView A0d3 = AnonymousClass7TE.A0d(igdsHeadline, R.id.igds_headline_detail_text);
        0qQ.A0A(A0d3);
        0qQ.A0B(A0d3, 0);
        A0d3.setTextAppearance(R.style.PrivacyTextStyle);
        Context context2 = A0d3.getContext();
        DbT.A17(context2, A0d3, 2Yu.A0H(context2, R.attr.igdsSecondaryText));
        ViewGroup.LayoutParams layoutParams3 = A0d3.getLayoutParams();
        0qQ.A0C(layoutParams3, A002);
        ((C71492dQ) layoutParams3).A03 = 0.0f;
        A0d3.setGravity(8388611);
        Context context3 = igdsHeadline.getContext();
        int dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        int dimensionPixelSize2 = context3.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        if (num2 == AnonymousClass05K.A00) {
            igdsHeadline.setPadding(0, 0, 0, dimensionPixelSize);
            A00(igdsHeadline, R.id.igds_headline_body, dimensionPixelSize);
            A00(igdsHeadline, igdsHeadline.getHeadlineId(), dimensionPixelSize);
            A00(igdsHeadline, R.id.igds_headline_bullet_list_container, dimensionPixelSize);
            A00(igdsHeadline, R.id.igds_headline_detail_text, dimensionPixelSize);
        } else {
            igdsHeadline.setPadding(igdsHeadline.getPaddingLeft(), dimensionPixelSize2, igdsHeadline.getPaddingRight(), dimensionPixelSize2);
        }
        igdsHeadline.A0E(0, 0, 0, dimensionPixelSize);
        this.A04 = igdsHeadline;
        int intValue = this.A07.intValue();
        if (intValue == 0) {
            this.A03.E46(igdsHeadline, min);
        } else if (intValue != 1) {
            this.A03.E3y(igdsHeadline);
        } else {
            this.A03.E3z(igdsHeadline);
        }
        IgdsButton igdsButton = (IgdsButton) AnonymousClass7TF.A0F(inflate, R.id.igds_promo_dialog_action_button);
        igdsButton.setVisibility(0);
        igdsButton.setText(this.A09);
        FPA.A00(igdsButton, this.A01, this, -1, 5);
        if (str3 != null) {
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.igds_promo_dialog_secondary_button);
            A0R.setVisibility(0);
            A0R.setText(this.A0A);
            A0R.setTextAppearance(R.style.igds_emphasized_body_1);
            C48948Emm.A00(A0R);
            FPA.A00(A0R, this.A02, this, -3, 5);
        }
    }
}
