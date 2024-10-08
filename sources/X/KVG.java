package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class KVG extends C60518Jmp {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    public final void A00(N4R n4r) {
        AnonymousClass59G r3;
        0qQ.A0B(n4r, 0);
        int A0M = AnonymousClass7TE.A0M(n4r.A02);
        String str = null;
        if (A0M == 0) {
            r3 = new AnonymousClass59G(2131971350, 2131967857, 2131955136);
        } else if (A0M == 1) {
            r3 = new AnonymousClass59G(2131967864, 2131967864, (Object) null);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int A0M2 = AnonymousClass7TE.A0M(r3.A00);
        int A0M3 = AnonymousClass7TE.A0M(r3.A01);
        Number number = (Number) r3.A02;
        TextView textView = this.A02;
        DbU.A1A(JTS.A07(this), textView, A0M2);
        DbT.A1A(JTS.A07(this), textView, A0M3);
        2eQ.A03(textView);
        TextView textView2 = this.A01;
        if (number != null) {
            str = JTS.A07(this).getString(number.intValue());
        }
        textView2.setText(str);
        AnonymousClass0fU.A00((View.OnClickListener) n4r.A00, textView2);
        2eS.A01(textView2);
    }

    public KVG(View view) {
        super(view);
        this.A00 = view;
        this.A02 = AnonymousClass7TG.A0R(view, R.id.header);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.action_text);
    }
}
