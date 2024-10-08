package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NNc  reason: case insensitive filesystem */
public final class C68555NNc extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67884MwS(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_education, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        KGG kgg = (KGG) r7;
        C67884MwS mwS = (C67884MwS) r8;
        boolean A1Z = AnonymousClass7TG.A1Z(kgg, mwS);
        IgdsHeadline igdsHeadline = mwS.A00;
        igdsHeadline.setHeadline(2131953057);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_gifts_refresh);
        FGX A02 = FGX.A02(JTQ.A06(mwS), A1Z);
        for (C53380GnA gnA : kgg.A00) {
            A02.A05(gnA.A02, gnA.A01, gnA.A00);
        }
        igdsHeadline.setBulletList(A02.A04());
    }

    public final Class modelClass() {
        return KGG.class;
    }
}
