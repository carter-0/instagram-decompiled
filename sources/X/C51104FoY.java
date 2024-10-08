package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FoY  reason: case insensitive filesystem */
public final class C51104FoY implements C51889G6e {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public C51104FoY(Context context, Fragment fragment, UserSession userSession, User user) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = user;
    }

    public final void DwT(String str) {
        C49239Eri.A00(this.A01.getActivity(), this.A00, this.A02, this.A03.getUsername());
    }
}
