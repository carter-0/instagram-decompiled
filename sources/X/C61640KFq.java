package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KFq  reason: case insensitive filesystem */
public final class C61640KFq extends C232222tE {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02 = K89.__redex_internal_original_name;
    public final C62320sa A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60630Jod(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_insights_header, false));
    }

    public C61640KFq(FragmentActivity fragmentActivity, UserSession userSession, C62320sa r5) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        C61156Jy8 jy8 = (C61156Jy8) r12;
        C60630Jod jod = (C60630Jod) r13;
        AnonymousClass7TG.A1N(jy8, jod);
        jod.A01.setText(jy8.A01);
        jod.A02.setText(jy8.A00);
        Context context = jod.A00.getContext();
        String A16 = AnonymousClass7TE.A16(context, 2131953072);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String str = this.A02;
        F6T.A00(jod.A03, fragmentActivity, userSession, 2EG.A1K, str, DbY.A0c(context, A16, 2131953003), A16, "https://help.instagram.com/3219033311670546", MMK.A00(this, 37));
    }

    public final Class modelClass() {
        return C61156Jy8.class;
    }
}
