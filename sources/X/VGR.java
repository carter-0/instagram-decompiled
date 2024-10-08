package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public abstract class VGR {
    public static final void A00(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, VTR vtr, String str, int i) {
        String A0D = 002.A0D(str, '@');
        TextView textView = vtr.A00;
        textView.setText(A0D);
        AnonymousClass0fU.A00(onClickListener, textView);
        Resources resources = textView.getResources();
        String A0e = AnonymousClass7TF.A0e(resources, A0D, 2131954409);
        0qQ.A07(A0e);
        textView.setContentDescription(A0e);
        TextView textView2 = vtr.A01;
        String A0d = AnonymousClass7TF.A0d(textView2.getResources(), i);
        textView2.setText(i);
        AnonymousClass0fU.A00(onClickListener2, textView2);
        String A0e2 = AnonymousClass7TF.A0e(resources, A0d, 2131954409);
        0qQ.A07(A0e2);
        textView2.setContentDescription(A0e2);
    }
}
