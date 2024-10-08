package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.FNo  reason: case insensitive filesystem */
public final class C50073FNo implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;

    public C50073FNo(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r3, int i) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-564819025);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A02;
        1Xj r6 = this.A03;
        int i = this.A00;
        if (!r6.A5G() || !182.A06(0Tu.A05, userSession, 36327391735331226L)) {
            LGR A012 = AnonymousClass36R.A01();
            String id = r6.getId();
            if (id != null) {
                Dbb.A11(A012.A02(id, i, 0, 0, false), fragmentActivity, userSession);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            DbU.A0w(fragmentActivity, C63502KyD.A00(userSession, r6, (String) null, (String) null, 0, false), userSession, ModalActivity.class, "clips_editor");
        }
        AnonymousClass0fD.A0C(1343453649, A05);
    }
}
