package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NOi  reason: case insensitive filesystem */
public final class C68586NOi extends C232222tE {
    public final C70427O6e A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_like_sticker_tray_item, false);
        0qQ.A0B(A09, A1U ? 1 : 0);
        return new C249703kE(A09);
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        new AnonymousClass3NG(JTO.A0F(r3));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C68600NOw nOw = (C68600NOw) r6;
        boolean A1U = AnonymousClass7TF.A1U(0, nOw, r7);
        C70427O6e o6e = this.A00;
        C61064Jw2 jw2 = nOw.A00;
        0qQ.A0B(o6e, 0);
        0qQ.A0B(jw2, A1U ? 1 : 0);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(JTO.A0F(r7));
        A0m.A04 = new C54314H7j(A1U, jw2, o6e, r7);
        A0m.A00();
    }

    public final Class modelClass() {
        return C68600NOw.class;
    }

    public C68586NOi(C70427O6e o6e) {
        this.A00 = o6e;
    }
}
