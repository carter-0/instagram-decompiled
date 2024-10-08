package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.VoD  reason: case insensitive filesystem */
public abstract class C18246VoD {
    public static final void A01(UDD udd, C15081UNy uNy) {
        AnonymousClass7TF.A1H(udd, uNy);
        udd.A02.setText(uNy.A06);
        udd.A01.setVisibility(8);
        String str = uNy.A04;
        TextView textView = udd.A00;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            AnonymousClass0fU.A00(uNy.A00, textView);
            String str2 = uNy.A03;
            if (str2 != null) {
                textView.setContentDescription(str2);
            }
        }
        Integer num = uNy.A01;
        if (num != null) {
            udd.itemView.setBackgroundResource(num.intValue());
        }
        Integer num2 = uNy.A02;
        if (num2 != null) {
            int A05 = JTT.A05(udd.itemView, num2.intValue());
            View view = udd.itemView;
            0qQ.A06(view);
            0nA.A0i(view, A05, A05);
        }
    }

    public static final View A00(ViewGroup viewGroup) {
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.section_header_row, false);
        A09.setTag(new UDD(A09));
        return A09;
    }
}
