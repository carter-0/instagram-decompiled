package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class FVW implements C360008dq {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;

    public FVW(Fragment fragment, UserSession userSession, AnonymousClass4DU r3) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void DfA(C360018dr r6) {
        0qQ.A0B(r6, 0);
        Fragment fragment = this.A00;
        if (fragment.mDetached) {
            return;
        }
        if (r6 instanceof C385519j4) {
            Context context = fragment.getContext();
            if (context != null) {
                C59689JTv.A03(context, context.getString(2131968258), "network_error", 0);
            }
            Throwable cause = ((C385519j4) r6).A00.getCause();
            if (cause != null) {
                0wb.A07(this.A02.getModuleName(), cause);
            }
        } else if (r6 instanceof C361128fi) {
            11Z.A03(new C51361Fst(C229382nI.A02(fragment, this.A02, this.A01, (2el) null), C46620Di0.A00(((C361128fi) r6).A00)));
        }
    }
}
