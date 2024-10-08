package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GjD  reason: case insensitive filesystem */
public final class C53141GjD extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RecyclerView A03;
    public final AnonymousClass2t9 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53141GjD(View view, AnonymousClass0iw r7, UserSession userSession, XC8 xc8) {
        super(view);
        TextView A0G = DbU.A0G(view, R.id.feed_product_pivots_title);
        TextView A0G2 = DbU.A0G(view, R.id.feed_product_pivots_button);
        RecyclerView A0I = DbT.A0I(view, R.id.products_recyclerview);
        C51974G9v.A1N(A0G, A0G2, A0I);
        this.A00 = view;
        this.A02 = A0G;
        this.A01 = A0G2;
        this.A03 = A0I;
        Context context = view.getContext();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        0qQ.A07(context);
        AnonymousClass2t9 A0U = DbU.A0U(A002, new C15792Uib(context, r7, userSession, xc8));
        A0I.setAdapter(A0U);
        this.A04 = A0U;
        DbV.A1A(context, A0I);
        A0I.A11(new AnonymousClass3V7(AnonymousClass7TH.A01(context), C51972G9s.A08(context)));
    }
}
