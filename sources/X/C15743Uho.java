package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uho  reason: case insensitive filesystem */
public final class C15743Uho extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        C14861UCp uCp = new C14861UCp(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.product_picker_spinner_and_message_row, false));
        uCp.A01.setVisibility(0);
        return uCp;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C15804Uin uin = (C15804Uin) r2;
        C14861UCp uCp = (C14861UCp) r3;
        AnonymousClass7TG.A1N(uin, uCp);
        VGY.A00(uCp, uin.A00);
    }

    public final Class modelClass() {
        return C15804Uin.class;
    }
}
