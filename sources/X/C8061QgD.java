package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.QgD  reason: case insensitive filesystem */
public final class C8061QgD extends ONB {
    public final Integer A00 = AnonymousClass05K.A01;

    public final Integer A02() {
        return this.A00;
    }

    public final View A01(Context context, LayoutInflater layoutInflater, View view, ViewGroup viewGroup, int i) {
        AnonymousClass7TG.A1N(context, layoutInflater);
        TextView textView = view;
        if (view == null) {
            View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fbpay_auto_complete_prompt);
            0qQ.A0C(A0C, AnonymousClass000.A00(716));
            TextView textView2 = (TextView) A0C;
            SRn.A02(textView2, RH2.A06);
            boolean A03 = A03();
            textView2.setClickable(A03);
            textView2.setFocusable(A03);
            textView2.setEnabled(A03);
            textView = textView2;
        }
        0qQ.A0C(textView, AnonymousClass000.A00(716));
        TextView textView3 = (TextView) textView;
        DbT.A18(context, textView3, 2131961188);
        return textView3;
    }
}
