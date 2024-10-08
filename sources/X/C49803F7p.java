package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.F7p  reason: case insensitive filesystem */
public abstract class C49803F7p {
    public static void A01(C49862FAc fAc, FAT fat, C46889Dn5 dn5) {
        View view = dn5.itemView;
        AnonymousClass0fU.A00(fAc.A05, view);
        2eS.A01(view);
        view.setClickable(true);
        CharSequence charSequence = fAc.A06;
        if (charSequence != null) {
            view.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = fAc.A07;
        TextView textView = dn5.A00;
        if (charSequence2 != null) {
            textView.setText(charSequence2);
        } else {
            textView.setText(fAc.A02);
        }
        int i = fAc.A03;
        if (i != -1) {
            textView.setTextColor(i);
        }
        view.setBackgroundResource(C49161EqS.A00(view.getContext(), fat));
        int i2 = 8388627;
        if (fat.A04) {
            i2 = 17;
        }
        textView.setGravity(i2);
        textView.setAlpha(fAc.A00);
        dn5.A02.setVisibility(8);
        if (fAc.A04 != null) {
            ColorFilterAlphaImageView colorFilterAlphaImageView = dn5.A01;
            colorFilterAlphaImageView.setVisibility(0);
            colorFilterAlphaImageView.setImageDrawable(fAc.A04);
            int i3 = fAc.A01;
            if (i3 != -1) {
                colorFilterAlphaImageView.setNormalColor(i3);
                return;
            }
            return;
        }
        dn5.A01.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, java.lang.Object, X.Dn5] */
    public static C46889Dn5 A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_menu_link_item);
        ? r1 = new C249703kE(A0C);
        r1.A00 = DbU.A0G(A0C, R.id.row_simple_link_textview);
        r1.A02 = (ColorFilterAlphaImageView) A0C.requireViewById(R.id.row_simple_link_image_start);
        r1.A01 = (ColorFilterAlphaImageView) A0C.requireViewById(R.id.row_simple_link_image_end);
        A0C.setTag(r1);
        return r1;
    }
}
