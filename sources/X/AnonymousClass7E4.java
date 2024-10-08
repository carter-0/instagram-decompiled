package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.7E4  reason: invalid class name */
public final class AnonymousClass7E4 extends C232232tF {
    public final C332807Wl A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_replies_pill, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C380529Yn(inflate, this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        AnonymousClass7E9 r62 = (AnonymousClass7E9) r6;
        C380529Yn r72 = (C380529Yn) r7;
        0qQ.A0B(r62, 0);
        0qQ.A0B(r72, 1);
        View view = r72.A00;
        AnonymousClass7CZ.A04(view, r62.A00, false);
        AnonymousClass7CZ.A00(r72.A01, AnonymousClass05K.A00, r62.A02, false);
        AnonymousClass0fU.A00(new C40001ANh(r62, r72), view);
    }

    public final Class modelClass() {
        return AnonymousClass7E9.class;
    }

    public AnonymousClass7E4(C332807Wl r1) {
        this.A00 = r1;
    }
}
