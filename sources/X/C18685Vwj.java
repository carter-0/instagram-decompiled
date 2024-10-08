package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.Vwj  reason: case insensitive filesystem */
public abstract class C18685Vwj {
    public static View A00(Context context, C270374gd r4) {
        int i;
        Integer num = r4.A06;
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3) {
            View A08 = DbU.A08(LayoutInflater.from(context), R.layout.connect_megaphone);
            A08.setTag(new C17588Vag(A08));
            return A08;
        } else if (intValue == 5) {
            String str = ((C15966Uli) r4.A00).A0A;
            if ("v3".equalsIgnoreCase(str)) {
                i = R.layout.generic_v3_megaphone;
            } else {
                boolean equalsIgnoreCase = "v2".equalsIgnoreCase(str);
                i = R.layout.mainfeed_generic_megaphone;
                if (equalsIgnoreCase) {
                    i = R.layout.profile_generic_megaphone;
                }
            }
            View A082 = DbU.A08(LayoutInflater.from(context), i);
            C17725Vcu vcu = new C17725Vcu();
            vcu.A04 = (LinearLayout) A082.findViewById(R.id.megaphone_content);
            vcu.A0C = JTO.A0Y(A082, R.id.megaphone_icon);
            vcu.A09 = AnonymousClass7TE.A0d(A082, R.id.title);
            vcu.A08 = AnonymousClass7TE.A0d(A082, R.id.message);
            vcu.A0A = (ColorFilterAlphaImageView) A082.findViewById(R.id.dismiss_button);
            vcu.A01 = DbS.A0E(A082, R.id.button_group);
            vcu.A06 = AnonymousClass7TE.A0d(A082, R.id.button1);
            vcu.A07 = AnonymousClass7TE.A0d(A082, R.id.button2);
            vcu.A03 = DbS.A0E(A082, R.id.button_placeholder);
            vcu.A00 = DbS.A0E(A082, R.id.bottom_context);
            vcu.A0B = JTO.A0Y(A082, R.id.bottom_icon);
            vcu.A05 = AnonymousClass7TE.A0d(A082, R.id.bottom_message);
            A082.setTag(vcu);
            return A082;
        } else {
            throw new UnsupportedOperationException(002.A0R("no such megaphone type:", C17009VEj.A00(num)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v74, types: [java.lang.Object, X.V3D] */
    public static void A02(Context context, View view, AnonymousClass0iw r11, C230792qH r12, C270374gd r13) {
        View A0G;
        ImageView imageView;
        int i;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        Integer num = r13.A06;
        LinearLayout linearLayout = (LinearLayout) view;
        V3D v3d = (V3D) linearLayout.getTag();
        if (v3d == null || v3d.A00 == r13.A06) {
            A0G = C13988Tno.A0G(linearLayout);
        } else {
            A0G = A00(context, r13);
            Integer num2 = r13.A06;
            linearLayout.removeAllViews();
            linearLayout.setOrientation(1);
            ? obj = new Object();
            obj.A00 = num2;
            linearLayout.setTag(obj);
            linearLayout.addView(A0G);
        }
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3) {
            ELK elk = (ELK) r13.A00;
            Integer num3 = r13.A06;
            C17588Vag vag = (C17588Vag) DbT.A0o(A0G);
            int intValue2 = num3.intValue();
            if (intValue2 != 1) {
                if (intValue2 == 3) {
                    imageView = vag.A02;
                    i = R.drawable.people_contacts;
                }
                int color = context.getColor(R.color.blue_7);
                int A01 = DbU.A01(context);
                Drawable drawable = vag.A02.getDrawable();
                drawable.getClass();
                AnonymousClass7TE.A1R(drawable.mutate(), color);
                vag.A05.setText(elk.A02);
                vag.A04.setText(elk.A01);
                TextView textView = vag.A03;
                Drawable background = textView.getBackground();
                background.getClass();
                AnonymousClass7TE.A1R(background.mutate(), A01);
                textView.setTextColor(A01);
                textView.setText(elk.A00.toUpperCase(AnonymousClass1Q2.A02()));
                WBG.A01(vag.A01, 66, r13, r12);
                WBG.A01(vag.A00, 67, r13, r12);
            }
            imageView = vag.A02;
            i = R.drawable.instagram_facebook_circle_pano_filled_24;
            imageView.setImageResource(i);
            int color2 = context.getColor(R.color.blue_7);
            int A012 = DbU.A01(context);
            Drawable drawable2 = vag.A02.getDrawable();
            drawable2.getClass();
            AnonymousClass7TE.A1R(drawable2.mutate(), color2);
            vag.A05.setText(elk.A02);
            vag.A04.setText(elk.A01);
            TextView textView2 = vag.A03;
            Drawable background2 = textView2.getBackground();
            background2.getClass();
            AnonymousClass7TE.A1R(background2.mutate(), A012);
            textView2.setTextColor(A012);
            textView2.setText(elk.A00.toUpperCase(AnonymousClass1Q2.A02()));
            WBG.A01(vag.A01, 66, r13, r12);
            WBG.A01(vag.A00, 67, r13, r12);
        } else if (intValue == 5) {
            String str = ((C15966Uli) r13.A00).A0A;
            if ("v3".equalsIgnoreCase(str) || "v2".equalsIgnoreCase(str)) {
                C18684Vwi.A00(context, A0G, r11, r12, r13);
                return;
            }
            C18684Vwi.A00(context, A0G, r11, r12, r13);
            C17725Vcu vcu = (C17725Vcu) DbT.A0o(A0G);
            String str2 = ((C15966Uli) r13.A00).A08;
            if (TextUtils.isEmpty(str2)) {
                str2 = "bottom";
            }
            if (str2.equals("bottom")) {
                vcu.A04.setGravity(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) vcu.A09.getLayoutParams();
                layoutParams.addRule(0, 0);
                vcu.A09.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) vcu.A08.getLayoutParams();
                layoutParams2.addRule(0, 0);
                vcu.A08.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) vcu.A01.getLayoutParams();
                layoutParams3.addRule(3, R.id.message);
                layoutParams3.addRule(11, 0);
                layoutParams3.addRule(15, 0);
                layoutParams3.width = -1;
                vcu.A01.setLayoutParams(layoutParams3);
                int A07 = AnonymousClass7TG.A07(context);
                ViewGroup.MarginLayoutParams A0D = DbS.A0D(vcu.A0C);
                A0D.topMargin = A07;
                vcu.A0C.setLayoutParams(A0D);
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(vcu.A0A);
                A0D2.topMargin = A07;
                vcu.A0A.setLayoutParams(A0D2);
                0nA.A0c(vcu.A01, C51972G9s.A08(context));
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
                resources = context.getResources();
                i2 = R.dimen.abc_button_inset_vertical_material;
            } else if (str2.equals("right")) {
                vcu.A04.setGravity(16);
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) vcu.A09.getLayoutParams();
                layoutParams4.addRule(0, R.id.button_group);
                vcu.A09.setLayoutParams(layoutParams4);
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) vcu.A08.getLayoutParams();
                layoutParams5.addRule(0, R.id.button_group);
                vcu.A08.setLayoutParams(layoutParams5);
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) vcu.A01.getLayoutParams();
                layoutParams6.addRule(3, 0);
                layoutParams6.addRule(11);
                layoutParams6.addRule(15);
                layoutParams6.width = -2;
                vcu.A01.setLayoutParams(layoutParams6);
                ViewGroup.MarginLayoutParams A0D3 = DbS.A0D(vcu.A0C);
                A0D3.topMargin = 0;
                vcu.A0C.setLayoutParams(A0D3);
                ViewGroup.MarginLayoutParams A0D4 = DbS.A0D(vcu.A0A);
                A0D4.topMargin = 0;
                vcu.A0A.setLayoutParams(A0D4);
                0nA.A0c(vcu.A01, 0);
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
                resources = context.getResources();
                i2 = R.dimen.abc_button_padding_horizontal_material;
            } else {
                return;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
            if (dimensionPixelSize != -1) {
                float f = (float) dimensionPixelSize;
                vcu.A06.setTextSize(0, f);
                vcu.A07.setTextSize(0, f);
            }
            if (dimensionPixelSize2 != -1) {
                vcu.A06.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                vcu.A07.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            }
        } else {
            throw new UnsupportedOperationException(002.A0R("no such megaphone type:", C17009VEj.A00(num)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.V3D] */
    public static LinearLayout A01(Context context, C270374gd r5) {
        View A00 = A00(context, r5);
        LinearLayout linearLayout = new LinearLayout(context);
        Integer num = r5.A06;
        linearLayout.removeAllViews();
        linearLayout.setOrientation(1);
        ? obj = new Object();
        obj.A00 = num;
        linearLayout.setTag(obj);
        linearLayout.addView(A00);
        return linearLayout;
    }
}
