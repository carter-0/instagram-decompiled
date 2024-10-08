package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;

public final class P1G implements C74314Psq {
    public final /* synthetic */ C332567Vn A00;
    public final /* synthetic */ AnonymousClass7S7 A01;
    public final /* synthetic */ DirectThreadKey A02;

    public P1G(C332567Vn r1, AnonymousClass7S7 r2, DirectThreadKey directThreadKey) {
        this.A00 = r1;
        this.A02 = directThreadKey;
        this.A01 = r2;
    }

    public final void DUp() {
        int i;
        Bundle A0a = AnonymousClass7TE.A0a();
        C332567Vn r6 = this.A00;
        UserSession userSession = r6.A05;
        AnonymousClass0Dg.A00(A0a, userSession);
        A0a.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, this.A02);
        A0a.putSerializable("prompts_tab", C69365Nk5.CHALLENGES);
        AnonymousClass7S7 r2 = this.A01;
        AnonymousClass7SD C6Q = r2.C6Q();
        if (C6Q != null) {
            i = C6Q.A08;
        } else {
            i = 29;
        }
        A0a.putInt("direct_thread_sub_type", i);
        A0a.putInt("direct_thread_audience_type", r2.AdN());
        AnonymousClass4DH r22 = r6.A02;
        DbT.A1L(r22, DbV.A0Y(r22.requireActivity(), A0a, userSession, ModalActivity.class, C273654mx.A00(649)));
    }
}
