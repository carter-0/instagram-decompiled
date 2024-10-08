package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FFm  reason: case insensitive filesystem */
public abstract class C49933FFm {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);

    public static final void A00(FragmentActivity fragmentActivity, C307896Rx r9, UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        0qQ.A0B(str, 3);
        String A0j = AnonymousClass7TG.A0j();
        C229352nF A002 = C229342nE.A00(userSession);
        0qQ.A07(A002);
        1OC A04 = C3724090s.A04(userSession, str);
        AnonymousClass4D6 A0C = C308206Td.A0C(r9);
        A04.A00 = new ECG(fragmentActivity, A002, r9, userSession, A0j, str, 1, z);
        A0C.schedule(A04);
    }

    public static final void A01(C307896Rx r10, C277014uI r11, C270394gf r12, String str, boolean z) {
        String str2 = str;
        0qQ.A0B(str, 1);
        C307896Rx r4 = r10;
        UserSession A002 = 0Gl.A00(C308206Td.A0B(r10));
        String A0j = AnonymousClass7TG.A0j();
        C229352nF A003 = C229342nE.A00(A002);
        0qQ.A07(A003);
        if (!A00.getAndSet(true)) {
            1OC A03 = C3724090s.A03(A002, str);
            AnonymousClass4D6 A0C = C308206Td.A0C(r10);
            A03.A00 = new ECI(A003, r4, r11, A002, r12, A0j, str2, z);
            A0C.schedule(A03);
        }
    }

    public static final void A02(C307896Rx r9, C277014uI r10, String str, boolean z) {
        String str2 = str;
        0qQ.A0B(str, 1);
        C307896Rx r5 = r9;
        UserSession A0Y = DbT.A0Y(r9);
        String A0j = AnonymousClass7TG.A0j();
        C229352nF A002 = C229342nE.A00(A0Y);
        0qQ.A07(A002);
        if (!A00.getAndSet(true)) {
            1OC A03 = C3724090s.A03(A0Y, str);
            AnonymousClass4D6 A0C = C308206Td.A0C(r9);
            A03.A00 = new ECG(r10, A002, r5, A0Y, A0j, str2, 0, z);
            A0C.schedule(A03);
        }
    }
}
