package X;

import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.8c8  reason: invalid class name and case insensitive filesystem */
public final class C359178c8 implements C2365734g {
    public final /* synthetic */ C358338ak A00;

    public C359178c8(C358338ak r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        Spannable spannable;
        0qQ.A0A(view);
        C358338ak r3 = this.A00;
        AnonymousClass8BA r2 = r3.A03;
        if (r2.A0w.A08.A00 == AnonymousClass9QA.A00) {
            spannable = ((AnonymousClass8ME) r2.A1g.get()).A12();
        } else {
            spannable = null;
        }
        boolean A06 = 182.A06(0Tu.A05, r3.A02, 36320214845038702L);
        CharSequence charSequence = spannable;
        0qQ.A0B(view, 0);
        TextView textView = (TextView) view.requireViewById(R.id.alignment_footer_caption_text);
        if (!A06) {
            textView.setVisibility(8);
            return;
        }
        if (spannable == null || spannable.length() == 0) {
            charSequence = textView.getContext().getText(2131974292);
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }
}
