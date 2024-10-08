package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class K9S extends C231632rz {
    public final C334397bC A00;
    public final AnonymousClass0iw A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9S(C334397bC r1, AnonymousClass0iw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -103944077);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.comments.carousel.MentionThumnailViewBinder.Holder");
        C60530Jn1 jn1 = (C60530Jn1) tag;
        C381459bn r9 = (C381459bn) obj;
        AnonymousClass0iw r1 = this.A01;
        C334397bC r3 = this.A00;
        AnonymousClass7TG.A1N(jn1, r9);
        0qQ.A0B(r1, 2);
        IgImageView igImageView = jn1.A00;
        DbV.A1P(r1, igImageView, r9.A02);
        AnonymousClass0fU.A00(new AOW(3, r3, r9), igImageView);
        AnonymousClass0fD.A0A(1478753035, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1904479004);
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.mention_thumbnail, false);
        A09.setTag(new C60530Jn1(A09));
        AnonymousClass0fD.A0A(766437949, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
