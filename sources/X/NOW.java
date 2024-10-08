package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class NOW extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C332767Wh A02;
    public final C72564PAv A03;

    public NOW(AnonymousClass0iw r2, UserSession userSession, C332767Wh r4, C72564PAv pAv) {
        0qQ.A0B(r4, 4);
        this.A03 = pAv;
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        C68063MzU mzU = new C68063MzU(DbU.A09(layoutInflater, viewGroup, R.layout.direct_standard_dxma_message, false));
        mzU.A02.EeU(new C72248OzG(A1U ? 1 : 0, this, mzU));
        return mzU;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        String str;
        N5R n5r = (N5R) r12;
        C68063MzU mzU = (C68063MzU) r13;
        boolean A1U = AnonymousClass7TF.A1U(0, n5r, mzU);
        C328667Fr r3 = n5r.A00.A01;
        C3259574v r0 = r3.A0A;
        TextView textView = mzU.A01;
        if (r0 != null) {
            textView.setText(r0.A02);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        DirectMessageIdentifier directMessageIdentifier = r3.A0L;
        String str2 = directMessageIdentifier.A02;
        boolean A022 = ((AnonymousClass7ZD) userSession.A01(AnonymousClass7ZH.class, AnonymousClass7ZG.A00)).A02(str2);
        C252063oV r02 = mzU.A02;
        if (!A022) {
            r02.setVisibility(8);
            return;
        }
        r02.setVisibility(0);
        C72564PAv pAv = this.A03;
        C68065MzW mzW = mzU.A00;
        if (mzW != null) {
            pAv.ADp(r3, mzW);
            if (str2 != null && (str = r3.A0Y) != null) {
                this.A02.AFb(str2, str, r3.Aqm().A00, directMessageIdentifier.A00, A1U);
                return;
            }
            return;
        }
        0qQ.A0F("standardDxmaViewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Class modelClass() {
        return N5R.class;
    }
}
