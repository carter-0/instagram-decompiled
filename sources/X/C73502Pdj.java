package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Pdj  reason: case insensitive filesystem */
public final /* synthetic */ class C73502Pdj implements C62320sa {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ C73502Pdj(C329067Hl r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        C329067Hl r4 = this.A00;
        UserSession userSession = r4.A1Z;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36324831935672724L)) {
            C329057Hk r7 = r4.A1j;
            C69287Nin nin = C69287Nin.THREAD_VIEW;
            String str = r4.A21;
            FragmentActivity fragmentActivity = (FragmentActivity) r7.A01.get();
            if (fragmentActivity != null) {
                boolean z = r7.A03;
                NJ8 nj8 = new NJ8();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable("arg_meta_ai_share_target", (DirectShareTarget) r7.A02.get());
                A0a.putBoolean("arg_is_bottom_sheet", z);
                A0a.putSerializable(AnonymousClass000.A00(1098), nin);
                A0a.putString("DirectFragment.ENTRY_POINT", str);
                nj8.setArguments(A0a);
                if (z) {
                    C331157Pu A002 = C48943Emh.A00(DbT.A0i(fragmentActivity));
                    if (A002 != null) {
                        A002.A0G(nj8, C69861NtP.A00(r7.A00), false, true);
                    }
                } else {
                    Dba.A12(nj8, DbS.A0M(fragmentActivity, r7.A00));
                }
            }
        }
        return C60340gF.A00;
    }
}
