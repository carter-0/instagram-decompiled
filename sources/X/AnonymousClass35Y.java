package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.35Y  reason: invalid class name */
public final class AnonymousClass35Y implements 1wn {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final 2bv A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C377209Ky(this, 26));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C377209Ky(this, 27));

    public AnonymousClass35Y(AnonymousClass4DH r3, UserSession userSession, 2bv r5) {
        this.A00 = r3;
        this.A01 = userSession;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        List A3o;
        int A032 = AnonymousClass0fD.A03(-741566676);
        C2370936h r14 = (C2370936h) obj;
        int A033 = AnonymousClass0fD.A03(613594210);
        0qQ.A0B(r14, 0);
        1Xj r4 = r14.A00.A1C;
        if (r4 == null || (A3o = r4.A3o(AnonymousClass3WT.PRODUCT)) == null || A3o.isEmpty()) {
            i = -259614604;
        } else {
            List A3o2 = r4.A3o(AnonymousClass3WT.MEDIA);
            List A3o3 = r4.A3o(AnonymousClass3WT.MENTION_RESHARE);
            if ((A3o2 == null || A3o2.isEmpty()) && (A3o3 == null || A3o3.isEmpty())) {
                AnonymousClass0eM r1 = this.A04;
                if (((2Fk) ((C63951LEt) r1.getValue()).A01.getValue()).A02() != null) {
                    String A30 = r4.A30();
                    if (A30 != null) {
                        C63951LEt lEt = (C63951LEt) r1.getValue();
                        Fragment fragment = this.A00;
                        Context requireContext = fragment.requireContext();
                        0gy A002 = AnonymousClass07i.A00(fragment);
                        C20613Wvu wvu = new C20613Wvu(26, this, r4);
                        C46025DJi dJi = C46025DJi.A00;
                        0qQ.A0B(A002, 2);
                        0qQ.A0B(dJi, 5);
                        lEt.A01(requireContext, A002, dJi, new C58811Ixw(requireContext, lEt, A002, dJi, wvu, fragment, A30, 1));
                    }
                } else {
                    String A2n = r4.A2n();
                    if (A2n != null) {
                        0xY AR4 = W3U.A02(this.A01, W3U.A00).AR4();
                        AR4.E5g(AnonymousClass000.A00(3492), A2n);
                        AR4.apply();
                        2bv r12 = this.A02;
                        Set singleton = Collections.singleton(Trigger.A21);
                        0qQ.A07(singleton);
                        r12.AVg(singleton);
                    }
                }
                i = -746433644;
            } else {
                i = 1719782301;
            }
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(471483441, A032);
    }
}
