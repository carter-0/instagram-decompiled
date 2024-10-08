package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.F7o  reason: case insensitive filesystem */
public abstract class C49802F7o {
    public static void A01(FAZ faz, C46887Dn3 dn3) {
        TextView textView = dn3.A00;
        CharSequence charSequence = faz.A07;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(faz.A06);
        }
        int i = faz.A03;
        if (i != 0) {
            textView.setTextAppearance(textView.getContext(), i);
        }
        textView.setGravity(faz.A01);
        F0T f0t = faz.A05;
        if (f0t != null) {
            textView.setPadding(f0t.A02, f0t.A05, f0t.A03, f0t.A00);
            0nA.A0Z(textView, faz.A05.A04);
            0nA.A0b(textView, faz.A05.A01);
        }
        textView.setLineSpacing(0.0f, faz.A00);
        textView.setBackground(faz.A04);
        textView.setTextAlignment(faz.A02);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, java.lang.Object, X.Dn3] */
    public static C46887Dn3 A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_custom_text);
        ? r1 = new C249703kE(A0C);
        TextView A0G = DbU.A0G(A0C, R.id.row_custom_text_textview);
        r1.A00 = A0G;
        DbT.A1H(A0G);
        03v.A07(r1.A00);
        A0C.setTag(r1);
        return r1;
    }
}
