package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ema  reason: case insensitive filesystem */
public abstract class C48936Ema {
    public static final void A00(Context context, ViewGroup viewGroup, List list) {
        LayoutInflater from;
        int i;
        TextView textView;
        int A02 = DbW.A02(1, viewGroup, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C49480EwL ewL = (C49480EwL) it.next();
            int intValue = ewL.A00.intValue();
            if (intValue == 1) {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_text_view;
            } else if (intValue == A02) {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_emphasize_text_view;
            } else if (intValue == 3) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.gdpr_bullet_point_paragraph, viewGroup, false);
                0qQ.A0C(inflate, C273654mx.A00(1));
                DbU.A0G(inflate, R.id.text_view).setText(ewL.A01);
                textView = inflate;
                viewGroup.addView(textView);
            } else if (intValue == 0) {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_subheading_text_view;
            }
            View inflate2 = from.inflate(i, viewGroup, false);
            0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) inflate2;
            textView2.setText(ewL.A01);
            textView = textView2;
            viewGroup.addView(textView);
        }
    }
}
