package X;

import com.instagram.user.model.User;

/* renamed from: X.7TX  reason: invalid class name */
public final class AnonymousClass7TX implements 1wn {
    public final /* synthetic */ AnonymousClass7TI A00;

    public AnonymousClass7TX(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        C254703su r2;
        int A03 = AnonymousClass0fD.A03(2019355345);
        AY3 ay3 = (AY3) obj;
        int A032 = AnonymousClass0fD.A03(852413523);
        0qQ.A0B(ay3, 0);
        AnonymousClass7TI r5 = this.A00;
        C333517Zg r0 = r5.A08;
        if (r0 != null) {
            AnonymousClass7LQ BSO = r0.BSN().BSO(ay3.A00);
            if (BSO == null || (r2 = BSO.A0e) == null) {
                i = -1348995536;
            } else {
                C2606546n r3 = r2.A0N;
                if (r3 == null) {
                    i = -81444274;
                } else if (0qQ.A0K(r3.A02, C66579MXk.A00(888)) || 0qQ.A0K(r3.A02, C66579MXk.A00(887))) {
                    C333517Zg r02 = r5.A08;
                    if (r02 != null) {
                        C254793t3 CBU = r02.C6l().CBU();
                        if (CBU == null) {
                            i = 910616988;
                        } else {
                            C333517Zg r03 = r5.A08;
                            if (r03 != null) {
                                User BY7 = r03.C6l().BY7();
                                if (BY7 == null) {
                                    i = 1361999002;
                                } else {
                                    long C7c = r2.C7c() / 1000;
                                    new C39883ADf(r5.A0U.requireContext(), r5.A0d).A01(CBU, BY7, C7c);
                                    C333517Zg r04 = r5.A08;
                                    if (r04 != null) {
                                        String BY8 = r04.C6l().BY8();
                                        if (BY8 == null) {
                                            i = 584143176;
                                        } else {
                                            OZG ozg = r5.A05;
                                            if (ozg != null && ozg.A02() && C7c > ozg.A00) {
                                                ozg.A00 = C7c;
                                                OZG.A01(ozg, "DETECTED_ACTIVITY", BY8, new C73943PmN(BY8, ozg, 33));
                                            }
                                            i = -1098250774;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i = -990182842;
                }
            }
            AnonymousClass0fD.A0A(i, A032);
            AnonymousClass0fD.A0A(1771185153, A03);
            return;
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }
}
