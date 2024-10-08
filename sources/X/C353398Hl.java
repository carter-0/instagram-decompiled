package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Hl  reason: invalid class name and case insensitive filesystem */
public final class C353398Hl implements C252243on {
    public C279284yO A00;
    public C41832B2n A01;
    public B2H A02;
    public B2H A03;
    public B2H A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final AnonymousClass4DH A08;
    public final UserSession A09;
    public final C357638Yz A0A;
    public final C352888Fl A0B;
    public final AnonymousClass8DD A0C;
    public final C3496881i A0D;
    public final AnonymousClass8Ho A0E;
    public final AnonymousClass8Ho A0F;
    public final AnonymousClass8Ho A0G;

    public C353398Hl(AnonymousClass4DH r8, UserSession userSession, C357638Yz r10, C352888Fl r11, C3508086k r12, AnonymousClass8DD r13, C3496881i r14) {
        0qQ.A0B(r8, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r10, 3);
        Context requireContext = r8.requireContext();
        this.A08 = r8;
        this.A09 = userSession;
        this.A0A = r10;
        C3496881i r6 = r14;
        this.A0D = r14;
        C352888Fl r3 = r11;
        this.A0B = r11;
        AnonymousClass8DD r5 = r13;
        this.A0C = r13;
        this.A07 = requireContext;
        C3508086k r4 = r12;
        this.A0E = new C353408Hm(requireContext, userSession2, r3, r4, r5, r6);
        this.A0F = new C353428Hp(requireContext, userSession2, r3, r4, r5, r6);
        this.A0G = new C353438Hq(requireContext, userSession2, r3, r4, r5, r6);
        r10.A0F(new C353448Hr(this));
        r10.A0E(new C353458Hs(this));
    }

    public final void A09(boolean z) {
        this.A00 = null;
        A03((C279284yO) null, this);
        C346587vQ r2 = C346587vQ.A0C;
        if (r2.A0B() && z) {
            synchronized (r2) {
                C346587vQ.A05 = Long.valueOf(System.currentTimeMillis());
                C346587vQ.A03 = false;
            }
        }
        UserSession userSession = this.A09;
        Context context = this.A07;
        if (C362988ir.A01(context.getApplicationContext(), userSession)) {
            1pd.A00(C362988ir.A00()).A00(context, userSession, C40623Afl.A00, "sup:SupDelegate_VIEW_WITHOUT_SUP_CALLBACK");
        }
        A07();
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final W0T A00(C353398Hl r2) {
        C357488Yc A012 = C357488Yc.A03.A01(r2.A09);
        if (A012 != null) {
            return A012.A00();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C279284yO r5, X.C353398Hl r6) {
        /*
            X.8j2 r2 = X.C363058j1.A02
            java.lang.String r1 = "onCameraDestinationChanged: Switch to "
            java.lang.String r0 = r5.A02
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "sup:SupDelegate"
            r2.A01(r0, r1)
            boolean r0 = r5 instanceof X.AnonymousClass80L
            if (r0 == 0) goto L_0x006b
            X.B2n r0 = r6.A01
            if (r0 == 0) goto L_0x0020
            X.8Ho r0 = r0.BN9()
            if (r0 == 0) goto L_0x0020
            r0.ARR()
        L_0x0020:
            X.4yO r0 = r6.A00
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x002d
            r6.A01()
        L_0x002d:
            X.B2n r1 = r6.A01
            if (r1 == 0) goto L_0x0036
            X.8Ho r0 = r6.A0E
            r1.EcK(r0)
        L_0x0036:
            A03(r5, r6)
            X.B2n r0 = r6.A01
            if (r0 == 0) goto L_0x0046
            X.8Ho r0 = r0.BN9()
            if (r0 == 0) goto L_0x0046
            r0.Dru()
        L_0x0046:
            com.instagram.common.session.UserSession r4 = r6.A09
            android.content.Context r3 = r6.A07
            android.content.Context r0 = r3.getApplicationContext()
            X.C362988ir.A01(r0, r4)
            android.content.Context r0 = r3.getApplicationContext()
            boolean r0 = X.C362988ir.A01(r0, r4)
            if (r0 == 0) goto L_0x006a
            X.1pd r0 = X.C362988ir.A00()
            X.VgJ r2 = X.1pd.A00(r0)
            X.Afk r1 = X.C40622Afk.A00
            java.lang.String r0 = "sup:SupDelegate_SET_IS_FIRST_CONNECTION_CALLBACK"
            r2.A00(r3, r4, r1, r0)
        L_0x006a:
            return
        L_0x006b:
            boolean r0 = r5 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x00b2
            com.instagram.common.session.UserSession r3 = r6.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319781053341331(0x8108a600011e93, double:3.032114013928121E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b2
            X.B2n r0 = r6.A01
            if (r0 == 0) goto L_0x008b
            X.8Ho r0 = r0.BN9()
            if (r0 == 0) goto L_0x008b
            r0.ARR()
        L_0x008b:
            X.4yO r0 = r6.A00
            if (r0 == 0) goto L_0x0098
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0098
            r6.A01()
        L_0x0098:
            X.B2n r1 = r6.A01
            if (r1 == 0) goto L_0x00a1
            X.8Ho r0 = r6.A0F
        L_0x009e:
            r1.EcK(r0)
        L_0x00a1:
            A03(r5, r6)
            X.B2n r0 = r6.A01
            if (r0 == 0) goto L_0x006a
            X.8Ho r0 = r0.BN9()
            if (r0 == 0) goto L_0x006a
            r0.Dru()
            return
        L_0x00b2:
            boolean r0 = r5 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0103
            X.8Yz r0 = r6.A0A
            X.80m r0 = r0.A09
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = X.C358218aY.A00(r5, r0)
            if (r0 != 0) goto L_0x0103
            com.instagram.common.session.UserSession r4 = r6.A09
            android.content.Context r0 = r6.A07
            boolean r0 = X.C362998is.A00(r0, r4)
            r3 = 0
            if (r0 == 0) goto L_0x0103
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x00e0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319781053406868(0x8108a600021e94, double:3.032114013969567E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0103
        L_0x00e0:
            X.B2n r0 = r6.A01
            if (r0 == 0) goto L_0x00ed
            X.8Ho r0 = r0.BN9()
            if (r0 == 0) goto L_0x00ed
            r0.ARR()
        L_0x00ed:
            r6.A05 = r3
            X.4yO r0 = r6.A00
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fc
            r6.A01()
        L_0x00fc:
            X.B2n r1 = r6.A01
            if (r1 == 0) goto L_0x00a1
            X.8Ho r0 = r6.A0G
            goto L_0x009e
        L_0x0103:
            r6.A01()
            X.W0T r0 = A00(r6)
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x006a
            X.0Ud r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.9ID r0 = (X.AnonymousClass9ID) r0
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.A03
            if (r0 != r2) goto L_0x006a
            r6.A09(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353398Hl.A02(X.4yO, X.8Hl):void");
    }

    public static final void A03(C279284yO r12, C353398Hl r13) {
        AnonymousClass8Ho BN9;
        W0T A002;
        AnonymousClass9ID r0;
        if (r12 != null) {
            C279284yO r02 = r13.A00;
            r13.A00 = r12;
            if (r02 == null) {
                W0T A003 = A00(r13);
                if (A003 != null) {
                    W0T.A01(A003, 29, false, !1Au.A00(r13.A09).A1y(), false, false, false);
                }
                if (A00(r13) == null || (A002 = A00(r13)) == null || (r0 = (AnonymousClass9ID) A002.A03.getValue()) == null || !r0.A03) {
                    AnonymousClass4DH r1 = r13.A08;
                    if (!r1.mDetached && r1.mView != null) {
                        C41832B2n b2n = r13.A01;
                        if (b2n != null) {
                            b2n.bind();
                        }
                        B2H b2h = r13.A03;
                        if (b2h != null) {
                            b2h.bind();
                        }
                        B2H b2h2 = r13.A02;
                        if (b2h2 != null) {
                            b2h2.bind();
                        }
                        B2H b2h3 = r13.A04;
                        if (b2h3 != null) {
                            b2h3.bind();
                        }
                    }
                    UserSession userSession = r13.A09;
                    Context context = r13.A07;
                    if (C362988ir.A01(context.getApplicationContext(), userSession)) {
                        1pd.A00(C362988ir.A00()).A00(context, userSession, new C65697LyC(r13), "sup:SupDelegate|SupLiveDelegate_ADD_CB");
                    }
                    if (!C346587vQ.A0C.A0B()) {
                        A04(r13);
                    }
                }
                W0T A004 = A00(r13);
                if (!(A004 == null || r13.A01 == null || A004.A0K())) {
                    C41832B2n b2n2 = r13.A01;
                    if (!(b2n2 == null || (BN9 = b2n2.BN9()) == null)) {
                        BN9.Dru();
                    }
                    if (!A004.A0J() && !A004.A0H() && A05(r13)) {
                        C18746Vzg.A00(false);
                        W0T A005 = A00(r13);
                        if (A005 != null) {
                            A005.A0C(true);
                        }
                    }
                }
            }
        }
        W0T A006 = A00(r13);
        if (A006 != null) {
            A006.A0D(false);
        }
        UserSession userSession2 = r13.A09;
        Context context2 = r13.A07;
        if (C362988ir.A01(context2.getApplicationContext(), userSession2)) {
            1pd.A00(C362988ir.A00()).A00(context2, userSession2, new C40612Afa(r13), "sup:SupDelegate_DESTINATION_WITH_SUP_CALLBACK");
        }
    }

    public static final void A04(C353398Hl r2) {
        C20984X7z x7z;
        if (C362988ir.A01(r2.A07.getApplicationContext(), r2.A09) && (x7z = C362988ir.A00().A01) != null) {
            C346587vQ.A0C.A09();
            x7z.Bp0().EBb(false);
        }
    }

    public final void A06() {
        UserSession userSession = this.A09;
        Context context = this.A07;
        if (C362988ir.A01(context.getApplicationContext(), userSession)) {
            1pd.A00(C362988ir.A00()).A00(context, userSession, new C40613Afb(this), "sup:SupDelegate_SEND_STREAM_STARTING_LIFECYCLE_EVENT_ON_LIVE_BUTTON_TAP_CALLBACK");
        }
    }

    public final void A07() {
        AnonymousClass4DH r1 = this.A08;
        if (!r1.mDetached && r1.mView != null) {
            C41832B2n b2n = this.A01;
            if (b2n != null) {
                b2n.unbind();
            }
            B2H b2h = this.A03;
            if (b2h != null) {
                b2h.unbind();
            }
            B2H b2h2 = this.A02;
            if (b2h2 != null) {
                b2h2.unbind();
            }
            B2H b2h3 = this.A04;
            if (b2h3 != null) {
                b2h3.unbind();
            }
        }
    }

    public final void A08(boolean z) {
        AnonymousClass8Ho r0;
        C353438Hq r5;
        C41832B2n b2n = this.A01;
        AnonymousClass8Ho r52 = null;
        if (b2n != null) {
            r0 = b2n.BN9();
        } else {
            r0 = null;
        }
        if (r0 instanceof C353438Hq) {
            if (b2n != null) {
                r52 = b2n.BN9();
            }
            if ((r52 instanceof C353438Hq) && (r5 = (C353438Hq) r52) != null) {
                UserSession userSession = r5.A08;
                Context context = r5.A07;
                if (C362988ir.A01(context.getApplicationContext(), userSession)) {
                    1pd.A00(C362988ir.A00()).A00(context, userSession, new C40621Afj(r5, z), "GlassesStoryViewListener_SEND_STREAM_ENDING_LIFECYCLE_EVENT_ON_VIDEO_END_CALLBACK");
                }
            }
        }
    }

    private final void A01() {
        AnonymousClass8Ho BN9;
        W0T A002 = A00(this);
        if (A002 != null && A002.A0I()) {
            W0T A003 = A00(this);
            if (A003 != null) {
                A003.A06();
            }
            C41832B2n b2n = this.A01;
            if (b2n != null && (BN9 = b2n.BN9()) != null) {
                BN9.DWr();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != true) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.C353398Hl r5) {
        /*
            X.W0T r0 = A00(r5)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.A0M()
            r0 = 1
            if (r1 == r4) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.String r2 = "sup:SupDelegate"
            if (r0 == 0) goto L_0x001c
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "Don't autoconnect user - seeing NUX tooltip"
        L_0x0018:
            r1.A01(r2, r0)
        L_0x001b:
            return r3
        L_0x001c:
            X.W0T r0 = A00(r5)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x002d
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "Don't autoconnect user - permissions aren't granted"
            goto L_0x0018
        L_0x002d:
            com.instagram.common.session.UserSession r0 = r5.A09
            X.1Av r0 = X.1Au.A00(r0)
            boolean r0 = r0.A1q()
            if (r0 != 0) goto L_0x003e
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "Don't autoconnect user - has not seen privacy bottom sheet"
            goto L_0x0018
        L_0x003e:
            X.4yO r0 = r5.A00
            if (r0 == 0) goto L_0x001b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353398Hl.A05(X.8Hl):boolean");
    }

    public final void onPause() {
        AnonymousClass8Ho BN9;
        W0T A002 = A00(this);
        if (A002 != null && A002.A0I()) {
            C363058j1.A02.A01("sup:SupDelegate", "onPause: Switch to phone camera");
            A002.A06();
            C41832B2n b2n = this.A01;
            if (b2n != null && (BN9 = b2n.BN9()) != null) {
                BN9.DWr();
            }
        }
    }
}
