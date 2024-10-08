package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mv2  reason: case insensitive filesystem */
public final class C67798Mv2 extends 2Rw {
    public List A00;
    public final 0bY A01 = DbW.A0G();
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public C67798Mv2(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 3);
        this.A02 = r2;
        this.A04 = userSession;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C328667Fr r3;
        0qQ.A0B(r5, 0);
        r5.itemView.setOnClickListener((View.OnClickListener) null);
        List list = this.A00;
        if (list != null && (r3 = (C328667Fr) list.get(i)) != null) {
            C70019Nvx.A00(JTO.A0F(r5), this.A03, r3, true);
            C71399Ojy.A00(r5.itemView, r3, this, r5, 2);
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        0qQ.A07(A0F);
        View A0D = DbT.A0D(A0F, viewGroup, R.layout.generic_xma_vstack_subitem, false);
        int A032 = DbS.A03(viewGroup.getResources(), R.dimen.account_discovery_bottom_gap);
        A0D.setPadding(A032, A032, A032, A032);
        DbT.A1F(A0D, R.id.avatar_view, 0);
        DbU.A0G(A0D, R.id.subtitle).setMaxLines(2);
        DbX.A1B(A0D, R.id.right_icon);
        return new C249703kE(A0D);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(697423078);
        int A0H = C51971G9r.A0H(this.A00);
        AnonymousClass0fD.A0A(953511515, A032);
        return A0H;
    }
}
