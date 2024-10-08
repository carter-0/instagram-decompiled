package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class K0Q extends C16746V4d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public K0Q(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void A01() {
        if (1 - this.A00 == 0) {
            C363068j2 r2 = C363058j1.A02;
            C61363K4f k4f = (C61363K4f) this.A02;
            r2.A01(k4f.A0Z, "MediaStreamStateListener:onConnectedToolkit");
            ((C60192JhB) k4f.A0c.getValue()).A03.Epw(C62504Kgu.CONNECTED);
            C20705Wxc wxc = new C20705Wxc(k4f, 19);
            C62918KoW.A06 = wxc;
            String str = C62918KoW.A02;
            if (str != null) {
                wxc.invoke(str);
            }
            C20705Wxc wxc2 = new C20705Wxc(k4f, 20);
            C62918KoW.A08 = wxc2;
            String str2 = C62918KoW.A05;
            if (str2 != null) {
                wxc2.invoke(str2);
            }
            C20705Wxc wxc3 = new C20705Wxc(k4f, 21);
            C62918KoW.A07 = wxc3;
            String str3 = C62918KoW.A04;
            if (str3 != null) {
                wxc3.invoke(str3);
            }
            String str4 = k4f.A0O;
            if (!(str4 == null || str4.length() == 0)) {
                AnonymousClass0eM r22 = k4f.A0a;
                1Av A0h = DbX.A0h(r22);
                0s0 r0 = A0h.A89;
                AnonymousClass0YZ[] r4 = 1Av.A8a;
                if (!DbV.A13(A0h, r0, r4, 347).equals(k4f.A0O)) {
                    1Av A0h2 = DbX.A0h(r22);
                    String valueOf = String.valueOf(k4f.A0O);
                    0qQ.A0B(valueOf, 0);
                    DbS.A1a(A0h2, valueOf, A0h2.A89, r4, 347);
                }
            }
            String str5 = k4f.A0P;
            if (!(str5 == null || str5.length() == 0)) {
                AnonymousClass0eM r23 = k4f.A0a;
                1Av A0h3 = DbX.A0h(r23);
                0s0 r02 = A0h3.A8A;
                AnonymousClass0YZ[] r42 = 1Av.A8a;
                if (!DbV.A13(A0h3, r02, r42, 348).equals(k4f.A0P)) {
                    1Av A0h4 = DbX.A0h(r23);
                    String valueOf2 = String.valueOf(k4f.A0P);
                    0qQ.A0B(valueOf2, 0);
                    DbS.A1a(A0h4, valueOf2, A0h4.A8A, r42, 348);
                }
            }
            String str6 = k4f.A0Q;
            if (!(str6 == null || str6.length() == 0)) {
                AnonymousClass0eM r24 = k4f.A0a;
                1Av A0h5 = DbX.A0h(r24);
                0s0 r03 = A0h5.A88;
                AnonymousClass0YZ[] r43 = 1Av.A8a;
                if (!DbV.A13(A0h5, r03, r43, 349).equals(k4f.A0Q)) {
                    1Av A0h6 = DbX.A0h(r24);
                    String valueOf3 = String.valueOf(k4f.A0Q);
                    0qQ.A0B(valueOf3, 0);
                    DbS.A1a(A0h6, valueOf3, A0h6.A88, r43, 349);
                }
            }
            C61363K4f.A00(k4f);
            C61363K4f.A03(k4f, true);
            AnonymousClass0eM r3 = k4f.A0b;
            ((C63942LEg) r3.getValue()).A01(RealtimeConstants.MQTT_CONNECTED, (String) null);
            0Aj A0e = AnonymousClass7TE.A0e(((C63942LEg) r3.getValue()).A00, "smart_glasses_toolkit_connected");
            A0e.AAJ("event_type", "impression");
            A0e.AAJ("item", "connected_label");
            A0e.Cgf();
            k4f.A0T = false;
        }
    }

    public final void A02() {
        int intValue;
        if (1 - this.A00 == 0) {
            C363068j2 r4 = C363058j1.A02;
            C61363K4f k4f = (C61363K4f) this.A02;
            String str = k4f.A0Z;
            r4.A01(str, "MediaStreamStateListener:onConnectionStarted");
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("MediaStreamStateListener:onConnectionStarted w/ Status: ");
            r4.A01(str, AnonymousClass7TF.A0i(k4f.A0N, A1A));
            Integer num = k4f.A0N;
            if (num == null || !((intValue = num.intValue()) == 5 || intValue == 2)) {
                ((C60192JhB) k4f.A0c.getValue()).A03.Epw(C62504Kgu.CONNECTING);
            }
        }
    }

    public final void A03() {
        W0T A002;
        W0T A003;
        switch (this.A00) {
            case 0:
                C353398Hl r6 = (C353398Hl) this.A02;
                r6.A06 = true;
                C363068j2 r4 = C363058j1.A02;
                String A004 = AnonymousClass000.A00(5305);
                r4.A01(A004, "sup:SupDelegate|SupLiveDelegate_KEY callback onDiscovered -- Entered");
                ((C18078Vl7) this.A01).A07(AnonymousClass000.A00(194));
                if (0qQ.A0K(r6.A0A.A08.A00, AnonymousClass9QA.A00)) {
                    if (!182.A06(0Tu.A05, r6.A09, 36319781053406868L)) {
                        return;
                    }
                }
                String str = C62918KoW.A02;
                ADP adp = ADP.A00;
                Context context = r6.A07;
                String A005 = adp.A00(context);
                UserSession userSession = r6.A09;
                1Av A006 = 1Au.A00(userSession);
                0s0 r0 = A006.A6Y;
                AnonymousClass0YZ[] r7 = 1Av.A8a;
                String A13 = DbV.A13(A006, r0, r7, 344);
                if (A13 == null || A13.length() == 0) {
                    1Av A007 = 1Au.A00(userSession);
                    DbS.A1a(A007, 182.A04(0Tu.A05, userSession, 36884238540210734L), A007.A6Y, r7, 344);
                }
                1Av A008 = 1Au.A00(userSession);
                String A132 = DbV.A13(A008, A008.A87, r7, 345);
                if (A132 == null || A132.length() == 0) {
                    1Av A009 = 1Au.A00(userSession);
                    DbS.A1a(A009, 182.A04(0Tu.A05, userSession, 36884238540276271L), A009.A87, r7, 345);
                }
                0rm A11 = C51965G9l.A11();
                0rm A112 = C51965G9l.A11();
                1Av A0010 = 1Au.A00(userSession);
                if (!C51966G9m.A1a(A005, A0010.A6Y.CDM(A0010, r7[344]))) {
                    A005 = null;
                }
                A11.A00 = A005;
                if (!C51966G9m.A1a(str, A0010.A87.CDM(A0010, r7[345]))) {
                    str = null;
                }
                A112.A00 = str;
                Object obj = A11.A00;
                if (!(obj == null && str == null)) {
                    String str2 = (String) obj;
                    1NY A0a = AnonymousClass7TG.A0a(userSession);
                    A0a.A0A("metaverse_bridges/set_versions_for_sn_and_mwa/");
                    if (str2 != null) {
                        A0a.A9m("meta_wearables_app_version", str2);
                    }
                    if (str != null) {
                        A0a.A9m("supernova_firmware_version", str);
                    }
                    1OC A0G = JTU.A0G(A0a);
                    A0G.A00 = new C15625Ufr(21, A112, A11, userSession);
                    1ES.A05(A0G, 7978703, 3, false, false);
                }
                1Av A0011 = 1Au.A00(userSession);
                String A04 = C61120lW.A04(context);
                0qQ.A0B(A04, 0);
                DbS.A1a(A0011, A04, A0011.A5t, r7, 346);
                W0T A0012 = C353398Hl.A00(r6);
                if (A0012 != null) {
                    r4.A01(A004, "sup:SupDelegate|SupLiveDelegate_KEY callback onDiscovered -- Setting glasses icon as available");
                    A0012.A04();
                    W0T.A01(A0012, 28, true, !1Au.A00(userSession).A1y(), false, false, false);
                    r6.A0B.A0z.A00().A08.add(new C59736JVu(A0012, 2));
                    if (!A0012.A0J() && !A0012.A0H() && C353398Hl.A05(r6)) {
                        r4.A01(A004, "sup:SupDelegate|SupLiveDelegate_KEY callback onDiscovered -- Calling connectToDevice");
                        C18746Vzg.A00(false);
                        W0T A0013 = C353398Hl.A00(r6);
                        if (A0013 != null) {
                            A0013.A0C(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C363068j2 r3 = C363058j1.A02;
                Fragment fragment = (C61363K4f) this.A02;
                String str3 = fragment.A0Z;
                r3.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Entered");
                W0T A0014 = C357488Yc.A03.A00(fragment.requireContext(), AnonymousClass7TE.A0l(fragment.A0a)).A00();
                r3.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Setting Glasses as Available");
                if (!A0014.A0F()) {
                    r3.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Showing Dialog");
                    11Z.A02(new C20246Wnl(fragment, A0014));
                }
                A0014.A04();
                if (!A0014.A0J() && !A0014.A0H()) {
                    if (A0014.A0F()) {
                        fragment.A0T = true;
                        r3.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Calling connectToDevice");
                        fragment.A0R = C51966G9m.A1L(new JV6((Object) fragment, C51975G9x.A0t(fragment.A0R), 46, false), DbW.A0E(fragment));
                        return;
                    }
                    r3.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Permissions not allowed");
                    1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new C66160MFx(fragment, (AnonymousClass4D7) null, 20), DbW.A0E(fragment));
                    return;
                }
                return;
            case 2:
                ((C18078Vl7) this.A01).A07(AnonymousClass000.A00(194));
                LGO lgo = (LGO) this.A02;
                C357498Yd r2 = C357488Yc.A03;
                UserSession userSession2 = lgo.A06;
                C357488Yc A012 = r2.A01(userSession2);
                if (A012 == null || (A003 = A012.A00()) == null || A003.A0K()) {
                    C357488Yc A013 = r2.A01(userSession2);
                    if (!(A013 == null || (A002 = A013.A00()) == null)) {
                        A002.A04();
                    }
                    lgo.A02(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.07Z, X.K4f, java.lang.Object] */
    public final void A06() {
        W0T A002;
        switch (this.A00) {
            case 1:
                C363068j2 r3 = C363058j1.A02;
                ? r5 = (C61363K4f) this.A02;
                String str = r5.A0Z;
                r3.A01(str, "MediaStreamStateListener:onDisconnected");
                r5.A0T = false;
                AnonymousClass0eM r6 = r5.A0c;
                ((C60192JhB) r6.getValue()).A03.Epw(C62504Kgu.DISCONNECTED);
                ((C60192JhB) r6.getValue()).A04.Epw((Object) null);
                ((C63942LEg) r5.A0b.getValue()).A01(C66579MXk.A00(309), (String) null);
                C357488Yc A012 = C357488Yc.A03.A01(AnonymousClass7TE.A0l(r5.A0a));
                if (!(A012 == null || (A002 = A012.A00()) == null)) {
                    A002.A07(new UUl(false));
                }
                r3.A01(str, "MediaStreamStateListener:onDisconnected -- attempt delayedErrorToConnect job");
                AnonymousClass4D7 A0t = C51975G9x.A0t(r5.A0R);
                r5.A0R = C51966G9m.A1L(new JV6((Object) r5, A0t, 46, true), DbW.A0E(r5));
                return;
            case 3:
                M0X.A0A(C64139LPo.A00((K6W) this.A02), AnonymousClass05K.A0R);
                return;
            default:
                return;
        }
    }

    public final void A07() {
        if (3 - this.A00 == 0) {
            C340297l2.A05(C390989sA.A04, (C340297l2) this.A01);
            M0X.A0A(C64139LPo.A00((K6W) this.A02), AnonymousClass05K.A0Q);
        }
    }

    public final void A08(int i) {
        C60192JhB jhB;
        C62504Kgu kgu;
        if (1 - this.A00 == 0) {
            C363068j2 r5 = C363058j1.A02;
            C61363K4f k4f = (C61363K4f) this.A02;
            String str = k4f.A0Z;
            r5.A01(str, 002.A0O("MediaStreamStateListener:onHardwareStatusEvent ", i));
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                r5.A01(str, 002.A0O("MediaStreamStateListener:onHardwareStatusEvent UPDATE TO ", i));
                k4f.A0N = Integer.valueOf(i);
                if (i == 2) {
                    r5.A01(str, "MediaStreamStateListener:onHardwareStatusEvent Disconnected from App");
                    jhB = (C60192JhB) k4f.A0c.getValue();
                    kgu = C62504Kgu.CONNECTION_FAILURE;
                } else if (i == 4) {
                    r5.A01(str, "MediaStreamStateListener:onHardwareStatusEvent UI UPDATE CHANGE");
                    jhB = (C60192JhB) k4f.A0c.getValue();
                    kgu = C62504Kgu.CONNECTING;
                } else {
                    return;
                }
                jhB.A03.Epw(kgu);
            }
        }
    }

    public final void A09(int i) {
        if (1 - this.A00 == 0) {
            C363068j2 r3 = C363058j1.A02;
            C61363K4f k4f = (C61363K4f) this.A02;
            r3.A01(k4f.A0Z, 002.A0O("MediaStreamStateListener:onToolkitHealthEvent received update ", i));
            AnonymousClass0eM r2 = k4f.A0c;
            ((C60192JhB) r2.getValue()).A03.Epw(C62504Kgu.CONNECTED);
            ((C60192JhB) r2.getValue()).A04.Epw(DbS.A0j(i));
        }
    }

    public final void A0A(V4C v4c) {
        W0T A002;
        if (1 - this.A00 == 0) {
            C363068j2 r2 = C363058j1.A02;
            C61363K4f k4f = (C61363K4f) this.A02;
            r2.A01(k4f.A0Z, AnonymousClass000.A00(2371));
            AnonymousClass0eM r22 = k4f.A0c;
            ((C60192JhB) r22.getValue()).A03.Epw(C62504Kgu.DISCONNECTED);
            ((C60192JhB) r22.getValue()).A04.Epw((Object) null);
            C357488Yc A012 = C357488Yc.A03.A01(AnonymousClass7TE.A0l(k4f.A0a));
            if (!(A012 == null || (A002 = A012.A00()) == null)) {
                A002.A07(new UUl(false));
            }
            ((C63942LEg) k4f.A0b.getValue()).A01("failure", v4c.A00());
        }
    }

    public final void A0B(V2D v2d) {
        if (3 - this.A00 != 0) {
            return;
        }
        if (v2d.equals(C15178UUd.A00)) {
            C18078Vl7 vl7 = ((K6W) this.A02).A00;
            if (vl7 != null) {
                vl7.A0B.EwG(vl7.A06);
            }
        } else if (v2d.equals(C15177UUc.A00)) {
            C340297l2 r1 = (C340297l2) this.A01;
            C340297l2.A05(C390989sA.A03, r1);
            r1.A0E();
            C18078Vl7 vl72 = ((K6W) this.A02).A00;
            if (vl72 != null) {
                vl72.A02();
            }
        } else if (v2d.equals(K0P.A00)) {
            11Z.A02(new M57((K6W) this.A02));
        }
    }
}
