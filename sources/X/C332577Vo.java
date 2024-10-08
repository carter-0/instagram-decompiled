package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Vo  reason: invalid class name and case insensitive filesystem */
public final class C332577Vo implements 1wn {
    public final /* synthetic */ C332567Vn A00;

    public C332577Vo(C332567Vn r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Long l;
        int A03 = AnonymousClass0fD.A03(-1110312050);
        int A032 = AnonymousClass0fD.A03(-1207539000);
        C332567Vn r4 = this.A00;
        UserSession userSession = r4.A05;
        Object obj2 = r4.A0A.get();
        0qQ.A07(obj2);
        C47167Dri A033 = new C71123OdH((C376519Ih) null, userSession, (C333517Zg) obj2).A03();
        C254793t3 r0 = A033.A06;
        if (r0 != null) {
            AnonymousClass4DH r7 = r4.A02;
            FFK.A01(r7.requireContext(), r7.requireActivity(), r7, userSession, A033, (Integer) null);
            C313756gx A002 = C313746gw.A00(userSession);
            int i = A033.A00;
            String A07 = C300965yF.A07(r0);
            String str = A033.A0C;
            1Ln A0E = 1Ln.A0E(A002.A03);
            if (A0E.A00.isSampled()) {
                A0E.A0h(Long.valueOf(A002.A02));
                A0E.A0l(C66579MXk.A00(259));
                A0E.A0k("tap");
                A0E.A0p("add_collaborator_promo_banner");
                A0E.A0q("thread_view");
                A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
                A0E.A0s(A07);
                if (str != null) {
                    l = 00y.A0n(10, str);
                } else {
                    l = null;
                }
                A0E.A0i(l);
                A0E.Cgf();
            }
        }
        AnonymousClass0fD.A0A(-1610039448, A032);
        AnonymousClass0fD.A0A(1827164535, A03);
    }
}
