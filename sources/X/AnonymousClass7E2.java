package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.7E2  reason: invalid class name */
public final class AnonymousClass7E2 extends C232232tF {
    public final AnonymousClass7D5 A00;
    public final C332807Wl A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_overflow_reactions_pill, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C68000MyS(inflate, this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        AnonymousClass7E7 r72 = (AnonymousClass7E7) r7;
        C68000MyS myS = (C68000MyS) r8;
        0qQ.A0B(r72, 0);
        0qQ.A0B(myS, 1);
        TextView textView = myS.A01;
        AnonymousClass7CZ.A00(textView, AnonymousClass05K.A00, r72.A02, false);
        C329967Kx r2 = r72.A00;
        0qQ.A0B(textView, 0);
        0qQ.A0B(r2, 1);
        textView.setTextColor(r2.A0C);
        LinearLayout linearLayout = myS.A00;
        AnonymousClass7CZ.A04(linearLayout, r2, false);
        AnonymousClass0fU.A00(new C71319OiQ(r72, myS), linearLayout);
    }

    public final Class modelClass() {
        return AnonymousClass7E7.class;
    }

    public AnonymousClass7E2(AnonymousClass7D5 r1, C332807Wl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
