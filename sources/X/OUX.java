package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

public final class OUX {
    public static final OUX A00 = new Object();

    public final Object A00(AnonymousClass6Tm r12) {
        C276544tV r1;
        Integer num;
        Integer num2;
        String str = (String) r12.A01();
        if (!(str == null || (r1 = (C276544tV) r12.A02()) == null)) {
            Object A002 = r12.A00();
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
            0lg A0A = C308206Td.A0A((C307786Rm) A002);
            0qQ.A0C(A0A, AnonymousClass000.A00(2));
            String A0K = r1.A0K(56);
            String A0K2 = r1.A0K(55);
            if (0qQ.A0K(A0K, "IMAGE")) {
                num = AnonymousClass05K.A00;
            } else if (0qQ.A0K(A0K, "VIDEO")) {
                num = AnonymousClass05K.A01;
            } else if (0qQ.A0K(A0K, "SHOWREELS")) {
                num = AnonymousClass05K.A0u;
            } else if (0qQ.A0K(A0K2, "IGTV")) {
                num = AnonymousClass05K.A0j;
            } else {
                num = AnonymousClass05K.A15;
            }
            String A0K3 = r1.A0K(50);
            String A0K4 = r1.A0K(44);
            if (A0K4 != null) {
                int hashCode = A0K4.hashCode();
                if (hashCode != 3260) {
                    if (hashCode == 3358 && A0K4.equals("ig")) {
                        num2 = AnonymousClass05K.A00;
                    }
                } else if (A0K4.equals("fb")) {
                    num2 = AnonymousClass05K.A01;
                }
                AnonymousClass1Nd.A00(A0A).A00(new C69045Ndh(new RtcStartCoWatchPlaybackArguments(num2, num, AnonymousClass05K.A1F, (Integer) null, str, (String) null), A0K3));
            }
        }
        return null;
    }
}
