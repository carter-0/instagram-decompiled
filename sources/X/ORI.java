package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class ORI {
    public static void A01(FAT fat, PR7 pr7, C67871MwF mwF) {
        Integer num;
        View view = mwF.itemView;
        View.OnClickListener onClickListener = pr7.A04;
        int i = 0;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, view);
            num = AnonymousClass05K.A01;
        } else {
            view.setClickable(false);
            num = AnonymousClass05K.A00;
        }
        2eS.A04(view, num);
        TextView textView = mwF.A02;
        textView.setText(pr7.A07);
        Typeface typeface = pr7.A01;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = mwF.A01;
        textView2.setText(pr7.A05);
        17k.A0F(AnonymousClass7TF.A1S(textView.getPaddingStart(), textView.getPaddingEnd()));
        Context context = view.getContext();
        textView.setCompoundDrawablePadding(DbS.A02(context, 8));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(pr7.A02, (Drawable) null, (Drawable) null, (Drawable) null);
        if (pr7.A06) {
            i = 8;
        }
        textView2.setVisibility(i);
        int i2 = pr7.A00;
        if (i2 != -1) {
            textView2.setTextColor(i2);
        }
        AnonymousClass0fU.A00(pr7.A03, textView2);
        view.setBackgroundResource(C49161EqS.A00(context, fat));
        mwF.A00.setVisibility(8);
        int i3 = 19;
        if (fat.A04) {
            i3 = 17;
        }
        textView.setGravity(i3);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.MwF, X.3kE] */
    public static C67871MwF A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_menu_item_with_action_text);
        ? r1 = new C249703kE(A0C);
        r1.A02 = DbU.A0G(A0C, R.id.row_simple_text_textview);
        r1.A01 = DbU.A0G(A0C, R.id.row_action_button_text);
        r1.A00 = A0C.requireViewById(R.id.row_divider);
        return r1;
    }
}
