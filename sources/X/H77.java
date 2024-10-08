package X;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class H77 extends C232222tE {
    public final JSq A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C53127Giz(DbU.A09(layoutInflater, viewGroup, R.layout.layout_no_gallery_permission, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        String A16;
        CharSequence A162;
        String A163;
        int i;
        HAQ haq = (HAQ) r7;
        C53127Giz giz = (C53127Giz) r8;
        if (haq == null || haq.A00) {
            if (giz != null) {
                A16 = AnonymousClass7TE.A16(DbS.A07(giz), 2131962905);
                A162 = AnonymousClass7TE.A16(DbS.A07(giz), 2131962904);
                A163 = AnonymousClass7TE.A16(DbS.A07(giz), 2131962913);
                i = 40;
            } else {
                return;
            }
        } else if (giz != null) {
            A16 = AnonymousClass7TE.A16(DbS.A07(giz), 2131962906);
            A162 = Html.fromHtml(DbU.A05(giz.itemView).getString(2131962903));
            0qQ.A07(A162);
            A163 = AnonymousClass7TE.A16(DbS.A07(giz), 2131956706);
            i = 39;
        } else {
            return;
        }
        C73933PmD pmD = new C73933PmD(this, i);
        giz.A01.setText(A16);
        giz.A00.setText(A162);
        IgdsButton igdsButton = giz.A02;
        igdsButton.setText(A163);
        C56800ICx.A00(igdsButton, 62, pmD);
    }

    public final Class modelClass() {
        return HAQ.class;
    }

    public H77(JSq jSq) {
        this.A00 = jSq;
    }
}
