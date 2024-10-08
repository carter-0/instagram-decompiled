package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class ORK {
    public static void A01(C67865Mw9 mw9, FGF fgf) {
        TextView textView = mw9.A00;
        fgf.A02(textView);
        View.OnClickListener onClickListener = fgf.A04;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, textView);
        } else {
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
        int i = 8388627;
        if (fgf.A06) {
            i = 17;
        }
        textView.setGravity(i);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Mw9, X.3kE, java.lang.Object] */
    public static C67865Mw9 A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_text);
        ? r1 = new C249703kE(A0C);
        TextView A0G = DbU.A0G(A0C, R.id.row_text_textview);
        r1.A00 = A0G;
        DbT.A1H(A0G);
        03v.A07(r1.A00);
        A0C.setTag(r1);
        return r1;
    }
}
