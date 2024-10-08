package X;

import android.content.Context;
import android.content.IntentFilter;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import com.instagram.rtc.rsys.models.IgCallModel;

public final class POT implements C74475PvV {
    public final /* synthetic */ C72192OyC A00;

    public final void DCG(N4R n4r) {
    }

    public POT(C72192OyC oyC) {
        this.A00 = oyC;
    }

    public final void Czw(RtcCallKey rtcCallKey) {
        String str;
        String str2;
        C72192OyC oyC = this.A00;
        OWA owa = oyC.A06;
        C70989OVd oVd = oyC.A09;
        IgCallModel A01 = oVd.A01();
        if (A01 != null) {
            str = A01.localCallId;
        } else {
            str = null;
        }
        RtcCallKey rtcCallKey2 = rtcCallKey;
        String str3 = rtcCallKey2.A00;
        0qQ.A0B(str3, 1);
        0i1 r0 = AnonymousClass0LO.A6b;
        if (str != null) {
            0LA.A05(r0, str);
        } else {
            0LA.A05(r0, str3);
        }
        0AJ.A00(owa.A0I);
        C71142Ods ods = owa.A03;
        if (ods != null) {
            RtcCallKey rtcCallKey3 = ods.A0K;
            if (rtcCallKey3 == null) {
                ods.A0K = rtcCallKey2;
            } else if (!rtcCallKey3.equals(rtcCallKey2)) {
                0wb.A03("RtcWaterfallImpl", "Attempt to update waterfall with different key");
            }
        } else {
            0wj r9 = 0wj.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Waterfall is null in setup(");
            A1A.append(rtcCallKey2);
            DbT.A1Q(r9, C51967G9n.A0r(A1A, ')'), 245701013);
        }
        C71869OsB osB = owa.A01;
        if (osB != null) {
            osB.A00 = rtcCallKey2;
        } else {
            0wj r92 = 0wj.A01;
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("Avatar logger is null in setup(");
            A1A2.append(rtcCallKey2);
            DbT.A1Q(r92, C51967G9n.A0r(A1A2, ')'), 245701013);
        }
        OEN oen = owa.A00;
        if (oen == null) {
            0wj r93 = 0wj.A01;
            StringBuilder A1A3 = AnonymousClass7TE.A1A();
            A1A3.append("AR effect impression logger is null in setup(");
            A1A3.append(rtcCallKey2);
            DbT.A1Q(r93, C51967G9n.A0r(A1A3, ')'), 245701013);
        } else if (!oen.A02) {
            UserSession userSession = oen.A01;
            27p.A00((Context) null, userSession, (String) null, (String) null, (String) null, (String) null);
            27p.A01(userSession).A17(28D.A5V, C59725JVj.VIDEO_CHAT, (C357638Yz) null, (C2801950r) null, AnonymousClass4x3.A00(oen.A00));
        }
        RtcCallSurveyLogger rtcCallSurveyLogger = owa.A02;
        if (rtcCallSurveyLogger != null) {
            rtcCallSurveyLogger.A00 = rtcCallKey2;
        } else {
            DbT.A1Q(0wj.A01, AnonymousClass7TG.A0m(rtcCallKey2, "Survey logger is null in setup ", AnonymousClass7TE.A1A()), 245701013);
        }
        C71078Oax oax = owa.A0C;
        oax.A00 = rtcCallKey2;
        String str4 = null;
        if (ods != null) {
            str2 = ods.A0Y.A05();
        } else {
            str2 = null;
        }
        oax.A01 = str2;
        if (!owa.A04) {
            C62670v5.A0B.A03(owa.A0A);
            owa.A04 = true;
        }
        14i.A05(owa.A0H);
        IgCallModel A012 = oVd.A01();
        if (A012 != null) {
            str4 = A012.localCallId;
        }
        C67635MrO mrO = new C67635MrO(str4);
        oVd.A00 = mrO;
        0DH.A00(mrO, oVd.A01, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        oyC.A07.A00 = rtcCallKey2;
    }

    public final void Czx() {
        C72192OyC oyC = this.A00;
        C70989OVd oVd = oyC.A09;
        C71143Odx odx = oVd.A0Z;
        C73848Pkl pkl = C73848Pkl.A00;
        C73849Pkm pkm = C73849Pkm.A00;
        C73850Pkn pkn = C73850Pkn.A00;
        C73851Pko pko = C73851Pko.A00;
        0qQ.A0B(pkl, 4);
        C51974G9v.A1N(pkm, pkn, pko);
        C71143Odx.A04(odx, new C41666AyI((CameraAREffect) null, odx, (Boolean) null, (String) null, pkl, pkm, pkn, pko, false, false));
        C67635MrO mrO = oVd.A00;
        if (mrO != null) {
            try {
                oVd.A01.unregisterReceiver(mrO);
            } finally {
                oVd.A00 = null;
            }
        }
        oyC.A03.removeKeepAliveCondition("RTC_CALL_CONDITION");
        OWA owa = oyC.A06;
        0LA.A04(AnonymousClass0LO.A6Y);
        0LA.A04(AnonymousClass0LO.A6b);
        0LA.A04(AnonymousClass0LO.A6Z);
        0LA.A04(AnonymousClass0LO.A6a);
        if (owa.A04) {
            C61940qJ.A00(owa.A0A);
            owa.A04 = false;
        }
        14i.A06(owa.A0H);
        0AJ.A01(owa.A0I);
        C70687OGi oGi = owa.A0B;
        oGi.A01 = AnonymousClass7TE.A1H();
        oGi.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [X.9jo, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Czy(X.C262224Cq r18) {
        /*
            r17 = this;
            r0 = r17
            X.OyC r0 = r0.A00
            X.OTz r6 = r0.A0C
            X.OVd r5 = r6.A02
            X.Nf7 r8 = r5.A0b
            X.0r6 r12 = r6.A0G
            X.0eM r7 = r6.A0F
            java.lang.Object r2 = r7.getValue()
            X.0r6 r2 = (X.AnonymousClass0r6) r2
            boolean r4 = X.AnonymousClass7TG.A1Z(r12, r2)
            com.instagram.common.session.UserSession r9 = r8.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36311285608022505(0x8100ec000101e9, double:3.026741460100083E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0084
            r8.A00 = r4
            X.0eM r0 = r8.A05
            java.lang.Object r0 = r0.getValue()
            X.OKz r0 = (X.C70779OKz) r0
            X.Nk8[] r10 = r0.A00
            r11 = 5
            r9 = 0
            r3 = 1
        L_0x0036:
            r0 = r10[r9]
            X.3Ja r1 = r0.A01
            java.lang.String r0 = r0.A02
            X.9DH r1 = X.C226442gp.A00(r1, r0)
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0100
            r0 = r3
            r3 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            int r9 = r9 + 1
            if (r9 < r11) goto L_0x0036
            if (r3 == 0) goto L_0x0084
            r8.A02 = r4
            X.4Cq r10 = r8.A01
            if (r10 == 0) goto L_0x010e
            r9 = 0
            r1 = 35
            X.MG3 r0 = new X.MG3
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r1)
            r1 = 3
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r0, r10)
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r12, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r11)
            X.1Eo.A05(r3, r0, r10)
            r0 = 37
            X.0pm r2 = X.C66193MHj.A01(r12, r2, r0)
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r1)
            X.1Eo.A05(r3, r0, r10)
            r1 = 4
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r1)
            X.1Eo.A05(r3, r0, r10)
        L_0x0084:
            X.NfI r2 = r5.A0Y
            java.lang.Object r13 = r7.getValue()
            X.0r6 r13 = (X.AnonymousClass0r6) r13
            X.NfJ r7 = r5.A0N
            X.05G r9 = r7.A0X
            X.05G r8 = r7.A0Y
            r3 = 0
            r1 = 3
            X.MlV r0 = new X.MlV
            r0.<init>(r1, r3)
            X.0pm r0 = X.AnonymousClass10H.A03(r0, r9, r8)
            X.0r6 r14 = X.AnonymousClass11E.A01(r0)
            X.NfH r0 = r5.A0a
            X.05G r0 = r0.A0G
            X.05F r15 = X.10b.A03(r0)
            X.NfE r9 = r5.A0R
            X.05G r8 = r9.A0F
            r1 = 10
            X.Pe8 r0 = new X.Pe8
            r0.<init>(r1, r9, r8)
            X.0r6 r8 = X.AnonymousClass11E.A01(r0)
            boolean r1 = X.C70978OTz.A00(r6)
            X.0qQ.A0B(r13, r4)
            r6 = 2
            X.AnonymousClass7TF.A1D(r14, r6, r8)
            X.N9H r0 = X.C69137NfI.A03(r2)
            X.C69137NfI.A04(r2, r0)
            X.4Cq r4 = r2.A01
            if (r4 == 0) goto L_0x00e1
            com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$setup$flow$1 r11 = new com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$setup$flow$1
            r11.<init>(r2, r3, r1)
            r16 = r8
            X.0pp r1 = X.AnonymousClass10H.A02(r11, r12, r13, r14, r15, r16)
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.AnonymousClass4D7) r3, (int) r6)
            X.AnonymousClass7TE.A1Z(r0, r4)
        L_0x00e1:
            X.Ney r0 = r5.A0L
            X.05G r0 = r0.A03
            X.05F r4 = X.10b.A03(r0)
            X.05G r0 = r2.A0G
            X.05F r2 = X.10b.A03(r0)
            X.4Cq r1 = r7.A01
            if (r1 == 0) goto L_0x00ff
            com.instagram.rtc.interactor.areffects.RtcArEffectsInteractor$setup$flow$1 r0 = new com.instagram.rtc.interactor.areffects.RtcArEffectsInteractor$setup$flow$1
            r0.<init>(r7, r3)
            X.0pt r0 = X.AnonymousClass10H.A00(r0, r12, r4, r2)
            X.AnonymousClass11O.A03(r1, r0)
        L_0x00ff:
            return
        L_0x0100:
            r0 = 4
            X.9jo r3 = new X.9jo
            r3.<init>(r1, r0)
            r1 = 91
            r0 = 2
            X.1ES.A05(r3, r1, r0, r4, r4)
            goto L_0x004a
        L_0x010e:
            java.lang.String r0 = "This should not be called outside of call lifecycle!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.POT.Czy(X.4Cq):void");
    }
}
