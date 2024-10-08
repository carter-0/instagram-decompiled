package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class EG6 extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C49385Eun A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C47042Dpc dpc = new C47042Dpc(DbU.A09(layoutInflater, viewGroup, R.layout.layout_highlight_story_item, false));
        dpc.A04.A00 = 0.5625f;
        return dpc;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C47239DtQ dtQ = (C47239DtQ) r8;
        C47042Dpc dpc = (C47042Dpc) r9;
        AnonymousClass7TF.A1H(dtQ, dpc);
        1Xj r6 = dtQ.A02;
        IgImageView igImageView = dpc.A03;
        ExtendedImageUrl A1n = r6.A1n(AnonymousClass7TE.A0S(igImageView));
        if (A1n != null) {
            igImageView.setUrl(A1n, this.A00);
        }
        boolean CeS = r6.CeS();
        int i = 8;
        IgTextView igTextView = dpc.A02;
        if (CeS) {
            igTextView.setText(C347917xa.A01((int) r6.A1B()));
            igTextView.setVisibility(0);
        } else {
            igTextView.setVisibility(8);
        }
        ImageView imageView = dpc.A01;
        imageView.setVisibility(0);
        View view = dpc.A00;
        if (dtQ.A00 != -1) {
            i = 0;
        }
        view.setVisibility(i);
        dpc.A05.A00(dtQ.A00);
        FPH fph = new FPH(49, (Object) dpc, (Object) this, (Object) dtQ);
        AnonymousClass0fU.A00(fph, dpc.A04);
        AnonymousClass0fU.A00(fph, imageView);
    }

    public final Class modelClass() {
        return C47239DtQ.class;
    }

    public EG6(AnonymousClass0iw r1, C49385Eun eun) {
        this.A00 = r1;
        this.A01 = eun;
    }
}
