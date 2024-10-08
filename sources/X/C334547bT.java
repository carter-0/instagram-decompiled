package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.7bT  reason: invalid class name and case insensitive filesystem */
public final class C334547bT implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334547bT(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-401233057);
        C240303Kj r12 = (C240303Kj) obj;
        int A032 = AnonymousClass0fD.A03(1498883482);
        0qQ.A0B(r12, 0);
        1Xj r5 = r12.A02;
        String str = r12.A03;
        boolean z = r12.A04;
        C334537bS r6 = this.A00;
        UserSession userSession = r6.A0E;
        AnonymousClass4DU r4 = r6.A0G;
        I6Q.A04(userSession, r5, r4, str, z);
        Fragment fragment = r6.A01;
        I6Q.A00(fragment, userSession, r5);
        Bundle A01 = C46447Df9.A03().A01.A01(userSession, C46548Dgp.A02(userSession, str, AnonymousClass000.A00(3575), r4.getModuleName()).A04());
        AnonymousClass6W8 r52 = new AnonymousClass6W8(r6.A02, A01, userSession, ModalActivity.class, "profile");
        r52.A05 = AnonymousClass000.A00(4175);
        r52.A0C(fragment.requireContext());
        AnonymousClass0fD.A0A(1679359495, A032);
        AnonymousClass0fD.A0A(1444480840, A03);
    }
}
