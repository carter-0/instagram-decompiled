package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MiI  reason: case insensitive filesystem */
public final class C67098MiI implements C74515PwA {
    public 0sP A00 = C67209Mk5.A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C67100MiK A03;
    public final Activity A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final 0wc A07;
    public final C66965Mfy A08;

    public C67098MiI(Activity activity, Context context, AnonymousClass4DH r6, UserSession userSession) {
        0qQ.A0B(userSession, 3);
        this.A05 = context;
        this.A04 = activity;
        this.A02 = userSession;
        this.A01 = r6;
        this.A06 = r6;
        this.A03 = new C67100MiK(context, userSession);
        this.A07 = AnonymousClass0kN.A01(r6, userSession);
        this.A08 = new C66965Mfy(userSession, new C67099MiJ(this), (C231002qi) null);
    }

    public final void A03(N4G n4g, C74396PuC puC, AnonymousClass2Ep r14) {
        List list;
        Context context = this.A05;
        UserSession userSession = this.A02;
        String C6C = r14.C6C();
        if (C6C != null) {
            List A1I = AnonymousClass7TE.A1I(C6C);
            AnonymousClass0iw r4 = this.A06;
            C69001Ncd ncd = new C69001Ncd(this, puC, r14);
            List AxI = r14.AxI();
            if (AxI == null || AxI.isEmpty()) {
                list = 0sn.A00;
            } else {
                list = AnonymousClass7TE.A1I(AxI);
            }
            C71131OdU.A00(context, n4g, r4, userSession, ncd, A1I, list, false, r14.CUG());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (X.0qQ.A0K(r4, r2) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADw(X.AnonymousClass2Ep r28) {
        /*
            r27 = this;
            r7 = 0
            r8 = r28
            java.util.List r0 = r8.BRZ()
            java.lang.Object r15 = r0.get(r7)
            com.instagram.user.model.User r15 = (com.instagram.user.model.User) r15
            r0 = r27
            com.instagram.common.session.UserSession r12 = r0.A02
            X.4DH r9 = r0.A01
            androidx.fragment.app.FragmentActivity r10 = r9.requireActivity()
            X.0iw r11 = r0.A06
            boolean r1 = r8.isPending()
            int r0 = r8.BSK()
            r3 = 1
            if (r1 != 0) goto L_0x0093
            if (r0 != r3) goto L_0x0093
        L_0x0026:
            r0 = 1
        L_0x0027:
            r26 = r0 ^ 1
            r6 = 2
            r0 = 3
            X.0qQ.A0B(r15, r0)
            r0 = r8
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Tg r0 = r0.A0u
            com.instagram.model.direct.DirectThreadKey r14 = r8.BJy()
            boolean r20 = r8.CUG()
            boolean r21 = r8.isPending()
            r8.BJy()
            boolean r23 = r8.CVr()
            java.lang.String r4 = r12.A06
            boolean r24 = r8.Ce4(r4)
            int r5 = r8.C6a()
            java.lang.String r2 = r8.AsX()
            r1 = 29
            if (r5 != r1) goto L_0x0062
            boolean r1 = X.0qQ.A0K(r4, r2)
            r25 = 1
            if (r1 == 0) goto L_0x0064
        L_0x0062:
            r25 = 0
        L_0x0064:
            android.os.Parcelable$Creator r1 = com.instagram.direct.capabilities.Capabilities.CREATOR
            if (r0 == 0) goto L_0x008c
            long[] r2 = new long[r6]
            long r4 = r0.A00
            r2[r7] = r4
            long r0 = r0.A01
            r2[r3] = r0
            com.instagram.direct.capabilities.Capabilities r13 = X.C376189Gz.A01(r2)
        L_0x0076:
            int r18 = r8.C6a()
            java.lang.String r16 = r8.C6C()
            java.lang.String r17 = r8.C6k()
            int r19 = r8.Btc()
            r22 = r7
            X.OZ1.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x008c:
            X.0sn r0 = X.0sn.A00
            com.instagram.direct.capabilities.Capabilities r13 = X.C376189Gz.A00(r0)
            goto L_0x0076
        L_0x0093:
            boolean r0 = X.2El.A03(r12)
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r8.isPending()
            if (r0 == 0) goto L_0x00a0
            goto L_0x0026
        L_0x00a0:
            r0 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67098MiI.ADw(X.2Ep):void");
    }

    public final void ANa(DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 0);
        C66671Mae.A0D(this.A02, directThreadKey);
    }

    public final void AOc(C254743sy r3) {
        0qQ.A0B(r3, 0);
        this.A03.A03(r3, AnonymousClass05K.A0Y);
    }

    public final void APa(AnonymousClass2Ep r10) {
        String C6C = r10.C6C();
        if (C6C != null) {
            C66671Mae.A0K(this.A02, C6C, false);
        }
        UserSession userSession = this.A02;
        0xa r2 = AnonymousClass4k9.A00(userSession).A00;
        AnonymousClass7TG.A1L(r2.AR4(), r2, "direct_dimiss_nudge_count", 0);
        AnonymousClass1pc.A00();
        Context context = this.A05;
        if (r2.getInt("direct_dimiss_nudge_count", 0) % 3 == 0) {
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0U = new C19679Wdh(4);
            C331157Pu A002 = A0W.A00();
            String A0b = AnonymousClass7TF.A0b();
            C54660HMr hMr = C54660HMr.DISMISS_INBOX_NUDGE;
            UYm uYm = new UYm();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(C66643MaC.A00(), A0b);
            A0a.putSerializable("entrypoint", hMr);
            uYm.setArguments(A0a);
            A002.A03(context, uYm);
        }
        2Dr r22 = (2Dm) this.A00.invoke(userSession);
        2Dr r1 = r22;
        2Dr.A00(r10, r1).A0K(false);
        r1.EK3();
        r22.FLo(r10.BJy());
    }

    public final void AVn(C254743sy r9, boolean z) {
        0qQ.A0B(r9, 0);
        DirectThreadKey A032 = C66647MaG.A03(r9);
        UserSession userSession = this.A02;
        if (C69973NvD.A00(userSession, z)) {
            C71118OdC.A02(this.A05, this.A06, userSession, "flag", "inbox", A032.A00);
            return;
        }
        C70170NyO.A00(userSession, A032, true);
        C3265677h.A0n(userSession, A032.A00, z);
    }

    public final void CLI(C254743sy r11, boolean z) {
        C71118OdC odC = C71118OdC.A00;
        Context context = this.A05;
        UserSession userSession = this.A02;
        DirectThreadKey A032 = C66647MaG.A03(r11);
        odC.A04(context, new N4G(0), userSession, (2Dm) this.A00.invoke(userSession), A032, new C73916Plr(4, r11, this), z);
    }

    public final void Cm4(C254743sy r11, Integer num, boolean z) {
        0qQ.A0B(r11, 0);
        DirectThreadKey A032 = C66647MaG.A03(r11);
        UserSession userSession = this.A02;
        if (!z || !DbY.A1Z(0Tu.A06, userSession, 2342153624806949057L)) {
            C66671Mae.A0E(userSession, A032, true);
            String str = A032.A00;
            0Aj A0H = C66583MXo.A0H(userSession);
            DbS.A1J(A0H, "thread_mark_unread");
            A0H.A7p("is_interop", JTP.A0g(A0H, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str, z));
            if (num != null) {
                A0H.A9F("position", C51969G9p.A0r(num));
            }
            A0H.Cgf();
            return;
        }
        C71118OdC.A02(this.A05, this.A06, userSession, "mark_as_unread", "inbox", A032.A00);
    }

    public final void Cn3(N4G n4g, C254743sy r18, Integer num, boolean z) {
        C254743sy r14 = r18;
        0qQ.A0B(r14, 0);
        UserSession userSession = this.A02;
        BizUserInboxState A0L = C66582MXn.A0L(userSession);
        N4G n4g2 = n4g;
        if (n4g2.A00 == 1 && A0L == BizUserInboxState.GENERAL_FOLDER_THROTTLED && C66582MXn.A1Q(userSession)) {
            C71118OdC.A00(this.A04, this.A05, userSession);
            return;
        }
        C71118OdC.A00.A04(this.A05, n4g2, userSession, (2Dm) this.A00.invoke(userSession), C66647MaG.A03(r14), new GVB(2, this, n4g2, num, r14, z), false);
    }

    public final void Cov(C254743sy r2) {
        0qQ.A0B(r2, 0);
        A02(r2, true);
    }

    public final void Cox(C254743sy r5) {
        0qQ.A0B(r5, 0);
        DirectThreadKey A032 = C66647MaG.A03(r5);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A04(this.A06, userSession, str, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Coy(C254743sy r4, int i) {
        0qQ.A0B(r4, 0);
        DirectThreadKey A032 = C66647MaG.A03(r4);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A02(this.A06, userSession, str, i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Cp6(C254743sy r4, int i) {
        0qQ.A0B(r4, 0);
        DirectThreadKey A032 = C66647MaG.A03(r4);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A03(this.A06, userSession, str, i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void E1K(AnonymousClass2Ep r7) {
        DirectThreadKey BJy = r7.BJy();
        0qQ.A0C(BJy, AnonymousClass000.A00(87));
        OWP owp = new OWP(BJy);
        UserSession userSession = this.A02;
        owp.A02(this.A04, this.A06, userSession, r7, AnonymousClass05K.A00);
    }

    public final void E1N(C254743sy r6, boolean z) {
        0qQ.A0B(r6, 0);
        Activity activity = this.A04;
        String A09 = C66647MaG.A09(r6);
        C358248ab A0X = DbS.A0X(activity);
        A0X.A0d((DialogInterface.OnClickListener) null, "Ok");
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Is Instamadillo cutover thread: ");
        A1A.append(z);
        A1A.append("\nIs legacy Armadillo thread: ");
        A1A.append(false);
        A1A.append("\nThreadId: ");
        A0X.A0q(AnonymousClass7TF.A0l(A09, A1A));
        DbT.A1V(A0X);
    }

    public final void EGL(AnonymousClass2Ep r20) {
        String str;
        AnonymousClass2Ep r2 = r20;
        User user = (User) r2.BRZ().get(0);
        UserSession userSession = this.A02;
        boolean A0P = C308556Us.A0P(userSession, r2);
        FragmentActivity requireActivity = this.A01.requireActivity();
        AnonymousClass0iw r5 = this.A06;
        0qQ.A0B(user, 3);
        int C6a = r2.C6a();
        boolean CVr = r2.CVr();
        r2.BJy();
        String C6C = r2.C6C();
        String C6k = r2.C6k();
        String A032 = C330397Mp.A03(r2.BJy());
        if (A032 != null) {
            int Btc = r2.Btc();
            List BRZ = r2.BRZ();
            C242243Te A0b = C66580MXl.A0b(r2);
            if (A0b != null) {
                str = A0b.A07;
            } else {
                str = null;
            }
            C71117OdB.A00(requireActivity, r5, userSession, (C231002qi) null, user, C6C, C6k, A032, str, BRZ, C6a, Btc, CVr, false, A0P);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void EIw(AnonymousClass2Ep r15) {
        User user = (User) r15.BRZ().get(0);
        Context context = this.A05;
        UserSession userSession = this.A02;
        Fragment fragment = this.A01;
        FragmentActivity requireActivity = fragment.requireActivity();
        0wc r5 = this.A07;
        0gy A002 = AnonymousClass07i.A00(fragment);
        AnonymousClass0iw r4 = this.A06;
        C66965Mfy mfy = this.A08;
        DbW.A1N(user, 3, r5);
        0qQ.A0B(mfy, 8);
        DirectThreadKey BJy = r15.BJy();
        boolean CUG = r15.CUG();
        r15.BJy();
        OZ2.A00(context, requireActivity, A002, r4, r5, userSession, mfy, BJy, user, mfy, CUG, false, r15.CVr());
    }

    public final void FIW(C254743sy r9, boolean z) {
        0qQ.A0B(r9, 0);
        DirectThreadKey A032 = C66647MaG.A03(r9);
        UserSession userSession = this.A02;
        if (C69973NvD.A00(userSession, z)) {
            C71118OdC.A02(this.A05, this.A06, userSession, "flag", "inbox", A032.A00);
            return;
        }
        C70170NyO.A00(userSession, A032, false);
        String str = A032.A00;
        0Aj A0H = C66583MXo.A0H(userSession);
        DbS.A1J(A0H, "thread_unflag");
        A0H.A7p("is_interop", JTP.A0g(A0H, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str, z));
        A0H.Cgf();
    }

    public final void FIh(C254743sy r2) {
        0qQ.A0B(r2, 0);
        A02(r2, false);
    }

    public final void FIj(C254743sy r5) {
        0qQ.A0B(r5, 0);
        DirectThreadKey A032 = C66647MaG.A03(r5);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A04(this.A06, userSession, str, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void FIl(C254743sy r5) {
        DirectThreadKey A032 = C66647MaG.A03(r5);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A05(this.A06, userSession, str, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void FIo(C254743sy r5) {
        0qQ.A0B(r5, 0);
        DirectThreadKey A032 = C66647MaG.A03(r5);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A06(this.A06, userSession, str, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r3.A06.equals(r2.AsX()) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C67098MiI r8, X.C254743sy r9, boolean r10) {
        /*
            X.0sP r0 = r8.A00
            com.instagram.common.session.UserSession r3 = r8.A02
            java.lang.Object r0 = r0.invoke(r3)
            X.2Dm r0 = (X.2Dm) r0
            X.3U9 r2 = X.C66647MaG.A02(r0, r9)
            if (r2 == 0) goto L_0x0041
            int r0 = r2.C6a()
            r1 = 29
            if (r0 != r1) goto L_0x0041
            X.6gx r4 = X.C313746gw.A00(r3)
            int r8 = r2.AdN()
            java.lang.String r6 = r2.C6C()
            java.lang.String r7 = r2.C6k()
            int r0 = r2.C6a()
            if (r0 != r1) goto L_0x003b
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r2.AsX()
            boolean r0 = r1.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r4.A0N(r5, r6, r7, r8, r9, r10)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67098MiI.A00(X.MiI, X.3sy, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r3.A06.equals(r2.AsX()) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.C254743sy r11) {
        /*
            r10 = this;
            X.0sP r0 = r10.A00
            com.instagram.common.session.UserSession r3 = r10.A02
            java.lang.Object r0 = r0.invoke(r3)
            X.2Dm r0 = (X.2Dm) r0
            X.3U9 r2 = X.C66647MaG.A02(r0, r11)
            if (r2 == 0) goto L_0x0041
            int r0 = r2.C6a()
            r1 = 29
            if (r0 != r1) goto L_0x0041
            X.6gx r4 = X.C313746gw.A00(r3)
            int r8 = r2.AdN()
            java.lang.String r6 = r2.C6C()
            java.lang.String r7 = r2.C6k()
            int r0 = r2.C6a()
            if (r0 != r1) goto L_0x003b
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r2.AsX()
            boolean r0 = r1.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r4.A0L(r5, r6, r7, r8, r9)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67098MiI.A01(X.3sy):void");
    }

    public final void A74(C74396PuC puC, AnonymousClass2Ep r8, C254743sy r9, boolean z) {
        UserSession userSession = this.A02;
        boolean A0E = 2El.A0E(userSession);
        if (A0E || 2El.A03(userSession)) {
            C66684Mar mar = new C66684Mar(userSession, r8.BKw(), r8, C66653MaM.A00(this.A05, userSession));
            if (A0E) {
                C71097OcX.A02(this.A01.requireContext(), new PFB(1, this, r8, puC), Boolean.valueOf(mar.A01.CUG()), DbT.A0y(mar.C6Y()), 1);
                return;
            }
            C71097OcX.A03(this.A01, userSession, mar, new PFB(2, this, r8, puC), 1);
            return;
        }
        A03(new N4G(r8.B6d()), puC, r8);
    }

    public final void EEU(AnonymousClass2Ep r6) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A06;
        OVO ovo = new OVO(this.A04, this.A05, r3, userSession);
        DirectThreadKey BJy = r6.BJy();
        OC1 oc1 = ovo.A05;
        1NY A0a = AnonymousClass7TG.A0a(oc1.A00);
        A0a.A0A("direct_v2/remove_thread_reminder/");
        DbX.A1M(A0a, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, BJy.A00);
        1OC A0M = A0a.A0M();
        NMH.A00(A0M, BJy, oc1, 12);
        1ES.A03(A0M);
    }

    public final void Ev7(AnonymousClass2Ep r6) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A06;
        new OVO(this.A04, this.A05, r3, userSession).A01(r6.BJy(), AnonymousClass05K.A00);
    }

    public final void FHL(AnonymousClass2Ep r10, boolean z) {
        UserSession userSession = this.A02;
        Number number = (Number) DcK.A00(userSession).A04.getValue();
        long A012 = 182.A01(0Tu.A06, userSession, 36602377016709755L);
        Long valueOf = Long.valueOf(A012);
        if (!z || number == null || ((long) number.intValue()) < A012) {
            C254793t3 A082 = C66647MaG.A08(r10.BJy());
            if (A082 != null) {
                C66671Mae.A0A(userSession, C300965yF.A01(A082), "inbox", z);
                return;
            }
            return;
        }
        C358248ab A0V = DbW.A0V(this.A01);
        A0V.A09(2131963808);
        DbY.A0w(this.A05, A0V, valueOf, 2131963796);
        Dba.A1L(A0V);
        String C6C = r10.C6C();
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            C66584MXp.A0x(A0B, "show_locked_chat_full", "inbox", C6C);
        }
    }

    private final void A02(C254743sy r5, boolean z) {
        DirectThreadKey A032 = C66647MaG.A03(r5);
        String str = A032.A00;
        if (str != null) {
            0sP r0 = this.A00;
            UserSession userSession = this.A02;
            AnonymousClass3U9 A033 = 2Dr.A03((2Dm) r0.invoke(userSession), A032);
            boolean z2 = true;
            if (A033 == null || !A033.Ca9()) {
                z2 = false;
            }
            C66671Mae.A07(this.A06, userSession, str, z, z2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void AOb(C74396PuC puC, C254743sy r6, boolean z) {
        A01(r6);
        C70266Nzw.A00(this.A05, this.A02, new C72652PEf(this, puC, r6, z), r6, AnonymousClass05K.A0j);
    }

    public final void Cp1(C254743sy r5) {
        DirectThreadKey A032 = C66647MaG.A03(r5);
        UserSession userSession = this.A02;
        String str = A032.A00;
        if (str != null) {
            C66671Mae.A05(this.A06, userSession, str, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void E2j(AnonymousClass2Ep r10) {
        String C6C = r10.C6C();
        if (C6C != null) {
            0sP r0 = this.A00;
            UserSession userSession = this.A02;
            2Dr r6 = (2Dm) r0.invoke(userSession);
            boolean CZA = 2Dr.A00(r10, r6).CZA();
            if (!CZA) {
                int B6d = r10.B6d();
                C242243Te A0b = C66580MXl.A0b(r10);
                boolean z = false;
                if (A0b != null && !A0b.A0L) {
                    z = true;
                }
                if (3 <= ((long) r6.BcZ(B6d, z))) {
                    Context context = this.A05;
                    int i = 2131959720;
                    if (2Ek.A00(DbT.A0j(userSession))) {
                        i = 2131958699;
                    }
                    C358248ab A0Y = DbS.A0Y(context);
                    DbT.A19(context, A0Y, 2131959721);
                    DbY.A0w(context, A0Y, 3L, i);
                    A0Y.A0d(C71220Ofl.A00, AnonymousClass7TE.A16(context, 2131968772));
                    DbT.A1V(A0Y);
                    return;
                }
            }
            C66671Mae.A0I(userSession, C6C, r10.C6a(), CZA);
            r6.Efk(r10, !CZA);
            r6.FLo(r10.BJy());
        }
    }

    public final void EEk(AnonymousClass2Ep r8, Integer num) {
        C358248ab A0Y;
        int i;
        int intValue;
        DirectThreadKey BJy = r8.BJy();
        A01(BJy);
        Context context = this.A05;
        UserSession userSession = this.A02;
        C72649PEc pEc = new C72649PEc(2, this, BJy);
        if (!(r8.BHS() == 8 || num == null || ((intValue = num.intValue()) != 0 && intValue != -1))) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36317934218188449L) && 182.A06(r2, userSession, 36317934218319523L)) {
                int i2 = 2131971994;
                int i3 = 2131971992;
                if (2Ek.A03(DbT.A0j(userSession))) {
                    i2 = 2131971995;
                    i3 = 2131971993;
                }
                A0Y = DbS.A0Y(context);
                A0Y.A09(2131971996);
                A0Y.A08(i2);
                A0Y.A0K(C71249OgE.A00(pEc, 60), 2131964901);
                A0Y.A0G(C71249OgE.A00(pEc, 61), i3);
                i = 62;
                A0Y.A0C(C71249OgE.A00(pEc, i));
                AnonymousClass7TH.A0a(A0Y, true);
            }
        }
        String A16 = AnonymousClass7TE.A16(context, 2131971997);
        A0Y = DbS.A0Y(context);
        A0Y.A09(2131960472);
        A0Y.A0q(A16);
        A0Y.A0F(C71249OgE.A00(pEc, 63));
        i = 64;
        A0Y.A0C(C71249OgE.A00(pEc, i));
        AnonymousClass7TH.A0a(A0Y, true);
    }
}
