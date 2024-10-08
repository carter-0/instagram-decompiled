package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MjW  reason: case insensitive filesystem */
public final class C67174MjW extends C232232tF {
    public final UserSession A00;
    public final C67158MjG A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.suggestions_footer_row, viewGroup, false);
        IgTextView A0Z = DbX.A0Z(inflate, R.id.title);
        C71406Ok5.A00(A0Z, 0, this);
        return new C67935MxL(inflate, A0Z);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C67113MiX miX = (C67113MiX) r6;
        C67935MxL mxL = (C67935MxL) r7;
        AnonymousClass7TF.A1H(miX, mxL);
        if (DbS.A04(0Tu.A05, this.A00, 36600882370121764L) == 2) {
            mxL.itemView.setVisibility(0);
            mxL.A00.setText(miX.A00);
            return;
        }
        mxL.itemView.setVisibility(8);
    }

    public final Class modelClass() {
        return C67113MiX.class;
    }

    public C67174MjW(UserSession userSession, C67158MjG mjG) {
        this.A00 = userSession;
        this.A01 = mjG;
    }
}
