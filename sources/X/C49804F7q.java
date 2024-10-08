package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.F7q  reason: case insensitive filesystem */
public abstract class C49804F7q {
    public static void A01(C50989Fmc fmc, FAT fat, C46894DnA dnA) {
        String str;
        Drawable A00;
        Drawable A002;
        int i;
        View view = dnA.itemView;
        Context context = view.getContext();
        View.OnClickListener onClickListener = fmc.A05;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, view);
        }
        View.OnLongClickListener onLongClickListener = fmc.A06;
        if (onLongClickListener != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
        if (fmc.A05 == null && fmc.A06 == null) {
            view.setClickable(false);
        } else {
            try {
                str = context.getString(fmc.A04);
            } catch (Resources.NotFoundException unused) {
                str = "";
            }
            view.setContentDescription(str);
            2eS.A01(view);
        }
        CharSequence charSequence = fmc.A08;
        TextView textView = dnA.A03;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(fmc.A04);
        }
        17k.A0F(AnonymousClass7TF.A1S(textView.getPaddingLeft(), textView.getPaddingRight()));
        textView.setCompoundDrawablePadding(DbS.A02(context, 8));
        boolean z = fmc.A0B;
        int i2 = fmc.A03;
        if (z) {
            int i3 = fmc.A0D;
            A00 = AnonymousClass4Ed.A01(context, i2, i3);
            A002 = AnonymousClass4Ed.A01(context, fmc.A01, i3);
        } else {
            A00 = AnonymousClass4Ed.A00(context, i2);
            A002 = AnonymousClass4Ed.A00(context, fmc.A01);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A00, (Drawable) null, A002, (Drawable) null);
        int i4 = fmc.A02;
        if (i4 != 0) {
            dnA.A04.setImageDrawable(AnonymousClass4Ed.A00(context, i4));
        }
        view.setBackgroundResource(C49161EqS.A00(context, fat));
        if (fat.A01) {
            if (fat.A02) {
                dnA.A00.setBackgroundColor(AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_separator));
            }
            dnA.A00.setVisibility(0);
        } else {
            dnA.A00.setVisibility(8);
        }
        if (fat.A04) {
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -1;
            textView.setLayoutParams(layoutParams);
        } else {
            textView.setGravity(19);
        }
        CheckBox checkBox = dnA.A01;
        checkBox.setVisibility(8);
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        boolean z2 = fmc.A0A;
        textView.setTypeface((Typeface) null);
        if (!z2) {
            i = fmc.A00;
        } else {
            i = fmc.A0D;
        }
        DbT.A17(context, textView, i);
        float f = 1.0f;
        if (fmc.A09) {
            f = 0.3f;
        }
        textView.setAlpha(f);
        if (fmc instanceof ESV) {
            ESV esv = (ESV) fmc;
            C49395Eux eux = esv.A01;
            QPTooltipAnchor qPTooltipAnchor = esv.A00;
            FRY fry = eux.A00;
            String str2 = FRY.A09;
            ESS ess = fry.A05;
            C230882qT r1 = ess.A01;
            if (r1 != null) {
                r1.A00(textView, qPTooltipAnchor, ess.A00);
            }
        }
        if (fmc.A07 != null) {
            TextView textView2 = dnA.A02;
            textView2.setVisibility(0);
            textView2.setText(fmc.A07);
            dnA.itemView.setLayoutParams(new LinearLayout.LayoutParams(dnA.itemView.getLayoutParams().width, -2));
            dnA.itemView.setPadding(0, 30, 0, 30);
        }
        dnA.itemView.setEnabled(fmc.A0A);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, java.lang.Object, X.DnA] */
    public static C46894DnA A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_menu_item);
        ? r1 = new C249703kE(A0C);
        r1.A03 = DbU.A0G(A0C, R.id.row_simple_text_textview);
        r1.A02 = DbU.A0G(A0C, R.id.row_simple_text_detail);
        r1.A00 = A0C.requireViewById(R.id.row_divider);
        r1.A01 = (CheckBox) A0C.requireViewById(R.id.checkbox);
        r1.A04 = (IgSimpleImageView) A0C.requireViewById(R.id.row_simple_text_end);
        A0C.setTag(r1);
        return r1;
    }
}
