package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uic  reason: case insensitive filesystem */
public final class C15793Uic extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final XC8 A03;
    public final Integer A04;

    public C15793Uic(Context context, AnonymousClass0iw r3, UserSession userSession, XC8 xc8, Integer num) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = xc8;
        this.A04 = num;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        C19278WSl wSl = (C19278WSl) r12;
        C14856UCk uCk = (C14856UCk) r13;
        AnonymousClass7TF.A1H(wSl, uCk);
        C18247VoE.A01(this.A00, this.A01, this.A02, uCk, this.A03, (C15683Ugo) null, wSl, this.A04, (String) null, wSl.A00, false);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(layoutInflater, 1);
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        Object tag = C18247VoE.A00(context).getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productfeed.ProductFeedGridRowViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final Class modelClass() {
        return C19278WSl.class;
    }
}
