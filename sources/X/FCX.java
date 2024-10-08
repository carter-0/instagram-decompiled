package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class FCX {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.Dn4] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.Dn6, X.3kE] */
    public static final View A00(Context context, int i, ViewGroup viewGroup) {
        View A09;
        Object obj;
        0qQ.A0B(context, 0);
        if (i == 0) {
            A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.row_userlist_view_all, false);
            0qQ.A0B(A09, 1);
            ? r1 = new C249703kE(A09);
            r1.A00 = AnonymousClass7TG.A0R(A09, R.id.see_all_button);
            obj = r1;
        } else if (i == 1) {
            A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.see_more_with_chevron_row, false);
            0qQ.A0B(A09, 1);
            ? r12 = new C249703kE(A09);
            r12.A02 = AnonymousClass7TG.A0R(A09, R.id.see_more_button);
            r12.A01 = DbX.A0J(A09, R.id.see_more_chevron);
            r12.A00 = DbX.A0J(A09, R.id.loading_spinner);
            obj = r12;
        } else {
            throw AnonymousClass7TE.A1B("Unknown viewType");
        }
        A09.setTag(obj);
        return A09;
    }

    public static final void A01(Context context, C249703kE r8, C46467DfV dfV, AnonymousClass32I r10, int i) {
        int i2;
        FPH fph;
        View view;
        0qQ.A0B(context, 0);
        int A03 = DbW.A03(2, dfV, r10);
        Integer num = dfV.A03;
        if (i == 0) {
            TextView textView = ((C46888Dn4) r8).A00;
            int intValue = num.intValue();
            if (intValue == 0) {
                i2 = 2131972976;
                DbT.A18(context, textView, i2);
            } else if (intValue == 1) {
                i2 = 2131972971;
                DbT.A18(context, textView, i2);
            } else if (intValue == 2) {
                DbT.A18(context, textView, 2131972979);
                if (dfV.A02) {
                    0nA.A0T(textView, context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
                }
            } else if (intValue == A03) {
                A02(textView, context);
            } else if (intValue == 6) {
                A02(textView, context);
                int A032 = AnonymousClass7TG.A03(context);
                0nA.A0j(textView, A032, A032, AnonymousClass7TE.A0C(context.getResources()), A032);
            }
            fph = new FPH(69, (Object) r10, (Object) dfV, (Object) num);
            view = textView;
        } else if (i == 1) {
            View view2 = r8.itemView;
            0qQ.A06(view2);
            if (num == AnonymousClass05K.A0Y && (view2.getLayoutParams() instanceof AnonymousClass3MX)) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                0qQ.A0C(layoutParams, C273654mx.A00(9));
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(DbS.A03(context.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0, (int) DbU.A00(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), (int) DbU.A00(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            } else if (num == AnonymousClass05K.A0j) {
                int A00 = (int) DbX.A00(context);
                view2.setPadding(A00, A00, A00, A00);
                0nA.A0V(view2, -2);
            }
            C46890Dn6 dn6 = (C46890Dn6) r8;
            dn6.A02.setVisibility(0);
            dn6.A01.setVisibility(0);
            dn6.A00.setVisibility(8);
            fph = new FPH(70, (Object) r10, (Object) r8, (Object) dfV);
            view = view2;
        } else {
            return;
        }
        AnonymousClass0fU.A00(fph, view);
    }

    public static final void A02(TextView textView, Context context) {
        DbT.A18(context, textView, 2131972971);
        DbT.A17(context, textView, 1QE.A01(context));
        Drawable drawable = context.getDrawable(R.drawable.instagram_chevron_right_outline_rtl_16);
        if (drawable != null) {
            AnonymousClass4Ed.A02(context, drawable, R.attr.glyphColorSecondary);
            RectF rectF = 0nA.A01;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        0nA.A0V(textView, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
    }
}
