package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.K1m  reason: case insensitive filesystem */
public final class C61299K1m extends C272124k8 {
    public final C62828Kn4 A00;

    public C61299K1m(UserSession userSession, C62828Kn4 kn4) {
        super(userSession);
        this.A00 = kn4;
    }

    public final void A02(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-987728657);
        C62828Kn4 kn4 = this.A00;
        if (kn4 != null && (kn4 instanceof C61958KTh)) {
            C61958KTh kTh = (C61958KTh) kn4;
            if (2 - kTh.A00 == 0) {
                C61941KSq.A04((C61941KSq) kTh.A01, true);
            }
        }
        AnonymousClass0fD.A0A(-846486793, A03);
    }

    public final void A05(C268654dm r7, UserSession userSession) {
        FragmentActivity fragmentActivity;
        String str;
        int i;
        int A03 = AnonymousClass0fD.A03(1658994244);
        C62828Kn4 kn4 = this.A00;
        if (kn4 != null) {
            if (kn4 instanceof C61958KTh) {
                C61958KTh kTh = (C61958KTh) kn4;
                switch (kTh.A00) {
                    case 0:
                        fragmentActivity = DbZ.A0E(kTh.A01);
                        str = "igtv_add_to_series_error";
                        i = 2131963998;
                        break;
                    case 1:
                        C61941KSq kSq = (C61941KSq) kTh.A01;
                        C252063oV r0 = kSq.A0B;
                        if (r0 != null) {
                            r0.getView().setVisibility(0);
                            C59689JTv.A01(kSq.requireActivity(), "igtv_remove_captions_error", 2131964057, 0);
                            break;
                        } else {
                            0qQ.A0F("captionsStubHolder");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    default:
                        0qQ.A0B(r7, 0);
                        C61941KSq kSq2 = (C61941KSq) kTh.A01;
                        if (kSq2.A0S) {
                            String A01 = C347037wA.A01(r7);
                            FragmentActivity activity = kSq2.getActivity();
                            if (A01 == null) {
                                A01 = DbU.A0m(kSq2, 2131961521);
                            }
                            C59689JTv.A03(activity, A01, "save_edits_failed", 0);
                        }
                        C61941KSq.A04(kSq2, false);
                        break;
                }
            } else {
                fragmentActivity = ((C61959KTi) kn4).A00;
                str = "igtv_remove_from_series_error";
                i = 2131964063;
            }
            C59689JTv.A0F(fragmentActivity, str, i);
        }
        AnonymousClass0fD.A0A(-1189761404, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        X.C59689JTv.A07(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        X.0qQ.A0F(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.instagram.common.session.UserSession r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 709254061(0x2a465bad, float:1.7617739E-13)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.Kn4 r7 = r9.A00
            if (r7 == 0) goto L_0x0104
            boolean r0 = r7 instanceof X.C61958KTh
            if (r0 == 0) goto L_0x00cb
            X.KTh r7 = (X.C61958KTh) r7
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x00f8;
                default: goto L_0x0016;
            }
        L_0x0016:
            X.K1b r11 = (X.C61290K1b) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r7 = r7.A01
            X.KSq r7 = (X.C61941KSq) r7
            X.C61941KSq.A04(r7, r0)
            X.0eM r5 = r7.A0Y
            X.1E8 r1 = X.DbX.A0d(r5)
            X.1Xj r0 = r11.A00()
            r1.A03(r0)
            android.os.Handler r1 = r7.A01
            if (r1 != 0) goto L_0x004f
            java.lang.String r0 = "handler"
        L_0x0036:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003e:
            X.K1O r11 = (X.K1O) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r4 = r7.A01
            X.KSq r4 = (X.C61941KSq) r4
            X.1Ng r3 = r4.A08
            if (r3 != 0) goto L_0x00b3
            java.lang.String r0 = "eventBus"
            goto L_0x0036
        L_0x004f:
            X.M4R r0 = new X.M4R
            r0.<init>(r7)
            r1.post(r0)
            X.1Xj r8 = r11.A00()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.8Oa r1 = X.AnonymousClass8OY.A00(r0)
            java.lang.String r0 = r8.getId()
            if (r0 == 0) goto L_0x00ae
            java.util.List r4 = r1.A00(r0)
            java.util.List r3 = r8.A3Y()
            X.1as r2 = X.1as.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r0 = "FEED"
            r2.A0G(r1, r0, r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x0080:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0104
            com.instagram.user.model.User r1 = X.DbT.A0k(r3)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.AnonymousClass8OY.A01(r0)
            if (r0 != 0) goto L_0x009c
            if (r4 == 0) goto L_0x0080
            boolean r0 = X.JTQ.A1T(r1, r4)
            if (r0 == 0) goto L_0x0080
        L_0x009c:
            com.instagram.model.direct.DirectShareTarget r2 = new com.instagram.model.direct.DirectShareTarget
            r2.<init>((com.instagram.user.model.User) r1)
            X.1as r1 = X.1as.A04
            r7.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            r1.A0B(r0, r8, r2)
            goto L_0x0080
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00b3:
            java.lang.String r2 = r11.A00
            if (r2 != 0) goto L_0x00b9
            java.lang.String r2 = ""
        L_0x00b9:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.Lfy r0 = new X.Lfy
            r0.<init>(r2, r1)
            r3.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0 = 2131963999(0x7f13305f, float:1.9564767E38)
            goto L_0x0101
        L_0x00cb:
            X.KTi r7 = (X.C61959KTi) r7
            X.1Xj r2 = r7.A02
            r5 = 0
            X.1Xy r0 = r2.A0C
            r0.EZb(r5)
            com.instagram.common.session.UserSession r1 = r7.A01
            X.1E8 r0 = X.1E7.A00(r1)
            r4 = 0
            r0.A03(r2)
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.String r2 = r7.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.Lfy r0 = new X.Lfy
            r0.<init>(r2, r1)
            r3.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r7.A00
            r0 = 2131964064(0x7f1330a0, float:1.95649E38)
            X.C59689JTv.A01(r1, r5, r0, r4)
            goto L_0x0104
        L_0x00f8:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            r0 = 2131964059(0x7f13309b, float:1.9564889E38)
        L_0x0101:
            X.C59689JTv.A07(r1, r0)
        L_0x0104:
            r0 = -611555707(0xffffffffdb8c6685, float:-7.9038436E16)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61299K1m.A06(com.instagram.common.session.UserSession, java.lang.Object):void");
    }
}
