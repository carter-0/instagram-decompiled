package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Vit  reason: case insensitive filesystem */
public final class C17960Vit {
    public final /* synthetic */ C15286UZq A00;

    public final void A00(C70826OMy oMy) {
        User user;
        User user2;
        C15286UZq uZq;
        1Xj A0T;
        C70826OMy oMy2 = oMy;
        String str = null;
        switch (oMy2.A01().intValue()) {
            case 0:
                C15286UZq uZq2 = this.A00;
                AnonymousClass0eM r8 = uZq2.A0m;
                AnonymousClass72K.A00(AnonymousClass7TE.A0l(r8), DbS.A0t(oMy2.A0A), (String) null, 0);
                C14437TwL A02 = uZq2.A06().A02();
                C68144N2k n2k = oMy2.A00().A00;
                if (n2k == null || (user = n2k.A04) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                A02.A09(user, C13988Tno.A0X(uZq2), C13988Tno.A0Y(uZq2), 0);
                C14017ToJ A002 = C14025ToR.A00(AnonymousClass7TE.A0l(r8));
                C68144N2k n2k2 = oMy2.A00().A00;
                if (n2k2 == null || (user2 = n2k2.A04) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                A002.A01(user2);
                C15286UZq.A00(oMy2, uZq2, (String) null);
                return;
            case 1:
                uZq = this.A00;
                AnonymousClass0eM r6 = uZq.A0m;
                AnonymousClass72K.A00(AnonymousClass7TE.A0l(r6), DbS.A0t(oMy2.A0A), (String) null, 7);
                C14437TwL A022 = uZq.A06().A02();
                C66569MWx A003 = oMy2.A00().A00();
                if (A003 != null) {
                    A022.A03(AnonymousClass8ZN.SEARCH_HIGH_CONFIDENCE_MODULES, A003);
                    C14472Twu A004 = C14433TwH.A00(AnonymousClass7TE.A0l(r6));
                    C66569MWx A005 = oMy2.A00().A00();
                    if (A005 != null) {
                        A004.A00(A005);
                        break;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 2:
            case 5:
            case 6:
            case 7:
                return;
            case 3:
                String A0j = AnonymousClass7TG.A0j();
                C15033UKm uKm = oMy2.A00().A02;
                if (uKm == null || !uKm.A07) {
                    uZq = this.A00;
                    uZq.A06().A02().A05(oMy2.A00().A02, A0j);
                } else {
                    uZq = this.A00;
                    boolean A05 = 1DL.A05(uZq.requireActivity(), uZq.A0l);
                    1Wr r15 = 1Wr.A00;
                    FragmentActivity requireActivity = uZq.requireActivity();
                    AnonymousClass0eM r9 = uZq.A0m;
                    if (!1Wr.isLocationPermitted(requireActivity, AnonymousClass7TE.A0l(r9), "SEARCH_NEARBY")) {
                        UserSession A0l = AnonymousClass7TE.A0l(r9);
                        VK6.A00.A05(A0l, new AnonymousClass4O6(uZq, A0l), "SEARCH_NEARBY", "BaseSerpGridFragment::onClickHCM");
                        WYt wYt = new WYt(oMy2, uZq, A0j);
                        C19427WYw wYw = new C19427WYw(oMy2, uZq, A0j, A05);
                        if (r15 != null) {
                            UserSession A0l2 = AnonymousClass7TE.A0l(r9);
                            FragmentActivity activity = uZq.getActivity();
                            0qQ.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
                            r15.requestLocationUpdates(A0l2, activity, wYt, wYw, uZq.getModuleName(), true, C16530Uwa.SEARCH_NEARBY);
                        }
                    }
                }
                C15033UKm uKm2 = oMy2.A00().A02;
                if (uKm2 != null) {
                    str = uKm2.A06;
                    break;
                }
                break;
            case 4:
                C15286UZq uZq3 = this.A00;
                SearchContext searchContext = new SearchContext(C13988Tno.A0a(uZq3), C13988Tno.A0Y(uZq3), C13988Tno.A0X(uZq3), (String) null, C13988Tno.A0Z(uZq3), (String) null, (String) null, (String) null);
                PlaylistContext playlistContext = new PlaylistContext(String.valueOf(oMy2.A00().A07));
                AnonymousClass0eM r0 = uZq3.A0m;
                UserSession A0l3 = AnonymousClass7TE.A0l(r0);
                FragmentActivity requireActivity2 = uZq3.requireActivity();
                C270634h3 r4 = new C270634h3(ClipsViewerSource.SERP_REELS_TRENDS_HCM, AnonymousClass7TE.A0l(r0));
                r4.A1c = false;
                r4.A1B = DbS.A0t(oMy2.A0A);
                List list = oMy2.A08;
                if (!(list == null || (A0T = DbZ.A0T(list, 0)) == null)) {
                    str = A0T.getId();
                }
                r4.A1C = str;
                r4.A03(searchContext);
                r4.A0J = playlistContext;
                r4.A0n = oMy2.A03;
                r4.A1l = false;
                C250563lf.A0X(requireActivity2, r4.A00(), A0l3);
                C15286UZq.A00(oMy2, uZq3, (String) null);
                return;
            default:
                throw new RuntimeException();
        }
        C15286UZq.A00(oMy2, uZq, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r1.equals(r5.A02) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.N3A r11, int r12, int r13) {
        /*
            r10 = this;
            r1 = 0
            X.0qQ.A0B(r11, r1)
            X.UZq r2 = r10.A00
            X.0eM r0 = r2.A0m
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0qQ.A0B(r4, r1)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328340923497720(0x81106f00063cf8, double:3.037527310282852E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x002c
            X.TpO r0 = r2.A06
            if (r0 != 0) goto L_0x0028
            X.C13988Tno.A0n()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0028:
            r0.A04(r12, r13)
            return
        L_0x002c:
            X.QP5 r5 = r11.A02
            X.UZa r0 = r2.A06()
            X.TwL r3 = r0.A02()
            java.lang.String r7 = r5.A03
            r8 = 0
            java.lang.String r1 = r2.A0J
            if (r1 == 0) goto L_0x004c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equals(r0)
            r9 = 0
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r9 = 1
        L_0x004d:
            X.Jw0 r4 = r11.A01
            java.lang.String r6 = "ig_search:serp_hcm"
            r3.A04(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r5.A02
            r2.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17960Vit.A01(X.N3A, int, int):void");
    }

    public C17960Vit(C15286UZq uZq) {
        this.A00 = uZq;
    }
}
