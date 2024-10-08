package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8hj  reason: invalid class name and case insensitive filesystem */
public final class C362338hj extends C232232tF {
    public final C362248ha A00;

    public C362338hj(C362248ha r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redesigned_create_mode_destination_item, viewGroup, false);
        0qQ.A07(inflate);
        C394439y7.A00(inflate);
        return new AnonymousClass9YX(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        AnonymousClass9YX r52 = (AnonymousClass9YX) r5;
        0qQ.A0B(r52, 1);
        AnonymousClass3NG r1 = new AnonymousClass3NG(r52.A00);
        r1.A04 = new C386099k3(this);
        r1.A07 = true;
        r1.A05 = AnonymousClass05K.A01;
        r1.A00();
    }

    public final Class modelClass() {
        return C362268hc.class;
    }
}
