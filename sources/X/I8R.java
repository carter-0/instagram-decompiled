package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class I8R implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public I8R(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.A00 = i;
        this.A06 = z;
        this.A01 = obj;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj2;
        this.A02 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0iw A012;
        if (this.A00 != 0) {
            if (this.A06) {
                FragmentActivity A0E = DbZ.A0E(this.A01);
                UserSession userSession = (UserSession) this.A05;
                String A2n = ((1Xj) this.A03).A2n();
                0qQ.A0B(userSession, 1);
                if (!(A2n == null || (A012 = AnonymousClass6WL.A01(A0E)) == null)) {
                    C52086GEg.A08(AnonymousClass5OC.DELETE_AND_MOVE_TO_DRAFTS_DIALOG, C52236GKd.A0e, A012, userSession, A2n);
                }
            }
            UserSession userSession2 = (UserSession) this.A05;
            String A1E = C51966G9m.A1E(this.A03);
            if (A1E != null) {
                1OC A032 = LSW.A03(userSession2, A1E);
                Fragment fragment = (Fragment) this.A01;
                1P0 r0 = (1P0) this.A04;
                if (r0 != null) {
                    A032.A00 = r0;
                }
                Context context = fragment.getContext();
                if (context != null) {
                    1ES.A00(context, AnonymousClass07i.A00(fragment), A032);
                }
                C62320sa r02 = (C62320sa) this.A02;
                if (r02 != null) {
                    r02.invoke();
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        C47655EBp eBp = new C47655EBp(2, this.A03, this.A06);
        User user = (User) this.A04;
        FCW.A01((Context) this.A01, eBp, (UserSession) this.A05, user, C51966G9m.A1F(this.A02), true);
        user.getId();
    }
}
