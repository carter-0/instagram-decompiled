package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.7E1  reason: invalid class name */
public final class AnonymousClass7E1 extends C232232tF {
    public final AnonymousClass7D5 A00;
    public final C332807Wl A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_overflow_reactions_pill, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C68015Myh(inflate, this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        AnonymousClass7E6 r62 = (AnonymousClass7E6) r6;
        C68015Myh myh = (C68015Myh) r7;
        0qQ.A0B(r62, 0);
        0qQ.A0B(myh, 1);
        TextView textView = myh.A02;
        AnonymousClass7CZ.A00(textView, AnonymousClass05K.A00, r62.A02, false);
        C329967Kx r1 = r62.A00;
        0qQ.A0B(textView, 0);
        0qQ.A0B(r1, 1);
        textView.setTextColor(r1.A0C);
        AnonymousClass7CZ.A04(myh.A01, r1, false);
        AnonymousClass0fU.A00(new C71318OiP(r62, myh), myh.A00);
    }

    public final Class modelClass() {
        return AnonymousClass7E6.class;
    }

    public AnonymousClass7E1(AnonymousClass7D5 r1, C332807Wl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
