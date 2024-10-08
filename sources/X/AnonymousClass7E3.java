package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.7E3  reason: invalid class name */
public final class AnonymousClass7E3 extends C232232tF {
    public final AnonymousClass7D5 A00;
    public final C332807Wl A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_add_custom_reaction_pill, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C68014Myg(inflate, this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        AnonymousClass7E8 r62 = (AnonymousClass7E8) r6;
        C68014Myg myg = (C68014Myg) r7;
        0qQ.A0B(r62, 0);
        0qQ.A0B(myg, 1);
        LinearLayout linearLayout = myg.A02;
        C329967Kx r0 = r62.A01;
        AnonymousClass7CZ.A04(linearLayout, r0, false);
        ImageView imageView = myg.A01;
        0qQ.A0B(imageView, 0);
        0qQ.A0B(r0, 1);
        imageView.setColorFilter(AnonymousClass37O.A00(r0.A0C));
        0qQ.A0B(linearLayout, 0);
        2eS.A04(linearLayout, AnonymousClass05K.A01);
        AnonymousClass0fU.A00(new C71317OiO(r62, myg), myg.A00);
    }

    public final Class modelClass() {
        return AnonymousClass7E8.class;
    }

    public AnonymousClass7E3(AnonymousClass7D5 r1, C332807Wl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
