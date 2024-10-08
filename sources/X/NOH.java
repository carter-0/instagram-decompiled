package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.security.InvalidParameterException;

public final class NOH extends C232222tE {
    public final C74350PtQ A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new Mx3(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_subtitle_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C71960Otl otl = (C71960Otl) r6;
        Mx3 mx3 = (Mx3) r7;
        AnonymousClass7TG.A1N(otl, mx3);
        2EM r1 = otl.A00;
        if (0qQ.A0K(r1, C67225MkL.A00)) {
            TextView textView = mx3.A00;
            Context A0S = AnonymousClass7TE.A0S(textView);
            String A16 = AnonymousClass7TE.A16(A0S, 2131959965);
            SpannableStringBuilder A0D = DbY.A0D(A0S, A16, 2131959964);
            AnonymousClass7AV.A04(A0D, new C69199Ngx(this, DbV.A02(A0S)), A16);
            textView.setText(A0D);
        } else if (0qQ.A0K(r1, C67226MkM.A00) || 0qQ.A0K(r1, AnonymousClass43H.A00)) {
            mx3.A00.setText(2131959963);
        } else {
            throw new InvalidParameterException();
        }
    }

    public final Class modelClass() {
        return C71960Otl.class;
    }

    public NOH(C74350PtQ ptQ) {
        this.A00 = ptQ;
    }
}
