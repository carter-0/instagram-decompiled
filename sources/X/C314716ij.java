package X;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.6ij  reason: invalid class name and case insensitive filesystem */
public final class C314716ij implements AnonymousClass6Z1, C314016hW {
    public 1wn A00;
    public 1wn A01;
    public UserSession A02;
    public AnonymousClass4D6 A03;
    public C273384mU A04;
    public C313056fm A05;
    public C311676d4 A06;
    public C310066aN A07;
    public C313216g4 A08;
    public C310096aQ A09;
    public boolean A0A;

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final void DaV(C255773uh r1, C250973mM r2, C309426Yf r3, float f) {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public static void A00(UserSession userSession, AnonymousClass4D6 r8, C255773uh r9, C309426Yf r10, C67602Mqa mqa) {
        C270074g9 r3 = r9.A09;
        r3.getClass();
        int size = r3.A01().size();
        List A002 = r3.A00();
        1NY r4 = new 1NY(userSession);
        r4.A08(AnonymousClass05K.A01);
        r4.A0A("discover/ayml/");
        r4.A0R(CFQ.class, C45676D1b.class);
        r4.A9m("module", "stories");
        r4.A9m("phone_id", 0jh.A04.A01(userSession).A02(19f.A2G));
        r4.A9m("forced_user_ids", C239023El.A00(',').A02(A002));
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36317517607671012L)) {
            r4.A0C("max_number_to_display", Long.valueOf(182.A01(r5, userSession, 36598992584314187L)).intValue());
        }
        1OC A0M = r4.A0M();
        A0M.A00 = new EBK(r3, r10, mqa, size);
        r8.schedule(A0M);
    }

    public static void A01(C314716ij r3, Integer num) {
        View Atm = r3.A04.Atm();
        if (Atm != null && (Atm.getTag() instanceof C67602Mqa)) {
            C67602Mqa mqa = (C67602Mqa) Atm.getTag();
            C255773uh r0 = mqa.A06;
            if (r0 == null || r0.A1U()) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    AnonymousClass6NJ r02 = mqa.A0V.A07;
                    if (r02 != null) {
                        ValueAnimator valueAnimator = r02.A03;
                        if (!valueAnimator.isRunning()) {
                            valueAnimator.start();
                        }
                    }
                } else if (intValue != 3) {
                    AnonymousClass6NJ r03 = mqa.A0V.A07;
                    if (intValue != 1) {
                        if (r03 != null) {
                            ValueAnimator valueAnimator2 = r03.A03;
                            if (valueAnimator2.isPaused()) {
                                valueAnimator2.resume();
                            }
                        }
                    } else if (r03 != null) {
                        ValueAnimator valueAnimator3 = r03.A03;
                        if (!valueAnimator3.isPaused()) {
                            valueAnimator3.pause();
                        }
                    }
                } else {
                    AnonymousClass6NJ r04 = mqa.A0V.A07;
                    if (r04 != null) {
                        ValueAnimator valueAnimator4 = r04.A03;
                        if (valueAnimator4.isRunning()) {
                            valueAnimator4.end();
                        }
                    }
                }
            }
        }
    }

    public final void A02() {
        C270074g9 r0;
        C317106mj r02;
        AnonymousClass6N0 r03;
        C270074g9 r04;
        C273384mU r2 = this.A04;
        View Atm = r2.Atm();
        if (Atm != null) {
            if (Atm.getTag() instanceof C67602Mqa) {
                C67602Mqa mqa = (C67602Mqa) Atm.getTag();
                C255773uh r1 = mqa.A06;
                if (r1 != null && r1.A1U() && (r04 = r1.A09) != null && r04.A00.A0E) {
                    r03 = mqa.A0V;
                } else {
                    return;
                }
            } else if (Atm.getTag() instanceof C316006kx) {
                Object tag = Atm.getTag();
                tag.getClass();
                C316006kx r3 = (C316006kx) tag;
                C255773uh Au5 = r2.Au5();
                if (Au5 == null || !Au5.A1B() || Au5.A0e != C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS || (r0 = Au5.A09) == null || !r0.A00.A0E || (r02 = r3.A0F) == null || (r03 = r02.A03) == null) {
                    return;
                }
            } else {
                return;
            }
            r03.A00();
        }
    }

    public final void A03() {
        C273384mU r1 = this.A04;
        C255773uh Au5 = r1.Au5();
        17k.A07(Au5, "Current reel item shouldn't be empty when suggested users Netego unit is restarting play!");
        ((ReelViewerFragment) r1).A1E.Bz3(Au5).A02(0.0f);
        C313216g4 r2 = this.A08;
        r2.A02();
        C270074g9 r12 = Au5.A09;
        17k.A07(r12, "SU unit is missing suggested users model");
        int i = r12.A00.A00;
        int i2 = i * IgNetworkConsentStorage.MAX_ENTRIES;
        if (i == 0) {
            i2 = 15000;
        }
        r2.A04(Au5, (long) i2);
    }

    public final void A04(String str) {
        C317106mj r0;
        AnonymousClass6N0 r4;
        C273384mU r3 = this.A04;
        View Atm = r3.Atm();
        if (Atm != null) {
            if (Atm.getTag() instanceof C67602Mqa) {
                C67602Mqa mqa = (C67602Mqa) Atm.getTag();
                C255773uh r02 = mqa.A06;
                if (r02 != null && r02.A1U()) {
                    r4 = mqa.A0V;
                } else {
                    return;
                }
            } else if (Atm.getTag() instanceof C316006kx) {
                Object tag = Atm.getTag();
                tag.getClass();
                C316006kx r2 = (C316006kx) tag;
                C255773uh Au5 = r3.Au5();
                if (Au5 == null || !Au5.A1B() || Au5.A0e != C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS || (r0 = r2.A0F) == null || (r4 = r0.A03) == null) {
                    return;
                }
            } else {
                return;
            }
            if (r4.A05 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r4.A06 != null) {
                C255773uh r03 = r4.A08;
                if (r03 != null) {
                    C270074g9 r1 = r03.A09;
                    C309426Yf r04 = r4.A09;
                    if (r04 != null) {
                        int i = r04.A0M;
                        if (r1 != null) {
                            List A012 = r1.A01();
                            int size = A012.size();
                            int length = r4.A04().length;
                            for (int i2 = 0; i2 < length; i2++) {
                                User user = ((C306876Nw) ((C306886Nx) A012.get((i + i2) % size))).A02;
                                if (0qQ.A0K(user.getId(), str)) {
                                    C306866Nv r12 = r4.A04()[i2];
                                    C309426Yf r05 = r4.A09;
                                    if (r05 != null) {
                                        C306846Nt.A02(r05, r12, user);
                                        r12.A0E.A0J.A03(r4.A05, r4.A06, user);
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void D7Q(C255773uh r6, C250973mM r7, C316026kz r8, C309426Yf r9) {
        A01(this, AnonymousClass05K.A00);
        if (r6.A1U()) {
            if (Boolean.valueOf(182.A06(0Tu.A05, this.A02, 36325218481877735L)).booleanValue()) {
                boolean z = r9.A11;
                C270074g9 r4 = r6.A09;
                if (!z || r4 == null) {
                    C306896Ny.A02 = System.currentTimeMillis();
                    return;
                }
                int i = C306896Ny.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    C306896Ny.A04(((C306876Nw) ((C306886Nx) r4.A01().get((C306896Ny.A01 + i2) % r4.A01().size()))).A02.getId());
                }
            }
        }
    }

    public final void DWT(String str) {
        A01(this, AnonymousClass05K.A01);
    }

    public final void Dfe() {
        A01(this, AnonymousClass05K.A0C);
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        r4 = (X.C67602Mqa) r1.getTag();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r5 = this;
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            A01(r5, r0)
            com.instagram.common.session.UserSession r0 = r5.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.3KA> r1 = X.AnonymousClass3KA.class
            X.1wn r0 = r5.A01
            r2.A02(r0, r1)
            java.lang.Class<X.27U> r1 = X.27U.class
            X.1wn r0 = r5.A00
            r2.A02(r0, r1)
            r5.A02()
            X.4mU r0 = r5.A04
            android.view.View r1 = r0.Atm()
            if (r1 == 0) goto L_0x0056
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof X.C67602Mqa
            if (r0 == 0) goto L_0x0056
            java.lang.Object r4 = r1.getTag()
            X.Mqa r4 = (X.C67602Mqa) r4
            X.3uh r0 = r4.A06
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.A1U()
            if (r0 == 0) goto L_0x0056
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325218481877735(0x810d98000032e7, double:3.0355526656293104E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0056
            r4.A00()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314716ij.onDestroyView():void");
    }

    public final boolean Cn1(C255773uh r10, C250973mM r11, C309426Yf r12, float f) {
        if (r10.A1U() && !this.A0A && !r12.A0s && f >= 0.33f) {
            this.A0A = true;
            UserSession userSession = this.A02;
            1Av A002 = 1Au.A00(userSession);
            0s0 r3 = A002.A5Z;
            AnonymousClass0YZ[] r2 = 1Av.A8a;
            if (!((Boolean) r3.CDM(A002, r2[256])).booleanValue()) {
                r3.Epx(A002, true, r2[256]);
                C273384mU r1 = this.A04;
                View Atm = r1.Atm();
                if (!(Atm == null || Atm.getTag() == null)) {
                    C67602Mqa mqa = (C67602Mqa) r1.Atm().getTag();
                    C316246lL r4 = mqa.A0Q.A07;
                    if (r4.A04 != null) {
                        C313046fl r0 = (C313046fl) this.A05;
                        AnonymousClass5Gt r13 = new AnonymousClass5Gt(r0.A01, r0.A02, new C315476jx(2131973880));
                        r13.A03(r4.A04);
                        r13.A02();
                        r13.A0G = true;
                        r13.A04 = new C72741PHy(this, mqa);
                        r13.A00().A07(userSession);
                    }
                }
            }
        }
        return false;
    }
}
