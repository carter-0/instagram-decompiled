package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.7ba  reason: invalid class name and case insensitive filesystem */
public final class C334617ba implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334617ba(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        AnonymousClass4DU r10;
        int A03 = AnonymousClass0fD.A03(369387372);
        C240223Kb r4 = (C240223Kb) obj;
        int A032 = AnonymousClass0fD.A03(1443655001);
        0qQ.A0B(r4, 0);
        1Xj r1 = r4.A01;
        String str = r4.A02;
        C334537bS r5 = this.A00;
        0lg r13 = r5.A0E;
        Fragment fragment = r5.A01;
        0qQ.A0A(r1);
        I6Q.A00(fragment, r13, r1);
        if (0qQ.A0K(str, r13.A06)) {
            1a0 A033 = C46447Df9.A03();
            0gy A002 = AnonymousClass07i.A00(fragment);
            1Xj A1e = r1.A1e(r13);
            r10 = r5.A0G;
            A033.A00(fragment, A002, r10, (1P0) null, (1P0) null, r13, A1e);
        } else {
            1a1 r7 = C46447Df9.A03().A01;
            r10 = r5.A0G;
            Bundle A01 = r7.A01(r13, C46548Dgp.A01(r13, str, AnonymousClass000.A00(1581), r10.getModuleName()).A04());
            AnonymousClass6W8 r14 = new AnonymousClass6W8(r5.A02, A01, r13, ModalActivity.class, "profile");
            r14.A05 = AnonymousClass000.A00(3581);
            r14.A0C(fragment.requireContext());
        }
        I6Q.A01(r13, r1, r10, str);
        AnonymousClass0fD.A0A(-34319552, A032);
        AnonymousClass0fD.A0A(789585059, A03);
    }
}
