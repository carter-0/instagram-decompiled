package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QgF  reason: case insensitive filesystem */
public final class C8063QgF extends ONB {
    public final Integer A00 = AnonymousClass05K.A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final View A01(Context context, LayoutInflater layoutInflater, View view, ViewGroup viewGroup, int i) {
        AnonymousClass7TF.A1H(context, layoutInflater);
        if (view == null) {
            view = layoutInflater.inflate(R.layout.fbpay_auto_complete_item, viewGroup, false);
            0qQ.A0A(view);
            C11409SSh.A02(view, 4, 11, 11, 4);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.auto_complete_title);
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.auto_complete_subtitle);
            View A0G = AnonymousClass7TF.A0G(view, R.id.auto_complete_divider);
            SRn.A02(A0R, RH2.A05);
            SRn.A02(A0R2, RH2.A06);
            AnonymousClass2E0.A0A();
            Pxf.A1B(A0G, context.getColor(R.color.igds_separator));
        }
        C11496SbJ.A01(view, 8, this);
        TextView A0R3 = AnonymousClass7TG.A0R(view, R.id.auto_complete_title);
        TextView A0R4 = AnonymousClass7TG.A0R(view, R.id.auto_complete_subtitle);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.auto_complete_divider);
        List list = this.A04;
        String str = this.A02;
        CharSequence charSequence = str;
        if (list != null) {
            charSequence = A00(str, list);
        }
        A0R3.setText(charSequence);
        String str2 = this.A01;
        int i2 = 0;
        if (str2 != null) {
            A0R4.setVisibility(0);
            List list2 = this.A03;
            CharSequence charSequence2 = str2;
            if (list2 != null) {
                charSequence2 = A00(str2, list2);
            }
            A0R4.setText(charSequence2);
        } else {
            A0R4.setVisibility(8);
        }
        if (i <= 0) {
            i2 = 8;
        }
        A0G2.setVisibility(i2);
        return view;
    }

    public static final SpannableString A00(String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            2HZ r1 = (2HZ) it.next();
            spannableString.setSpan(new StyleSpan(1), r1.A00, r1.A01 + 1, 33);
        }
        return spannableString;
    }

    public final Integer A02() {
        return this.A00;
    }

    public final boolean A03() {
        return true;
    }

    public C8063QgF(String str, String str2, List list, List list2) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = list;
        this.A03 = list2;
    }
}
