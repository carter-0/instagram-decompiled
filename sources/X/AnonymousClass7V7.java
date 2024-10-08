package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7V7  reason: invalid class name */
public final class AnonymousClass7V7 implements AnonymousClass7SX {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final AnonymousClass7V6 A04;
    public final C332257Ug A05;
    public final AnonymousClass4DU A06;
    public final int A07;
    public final String A08;
    public final AnonymousClass0eK A09;
    public final boolean A0A;

    public final void D8D(C254743sy r10, Integer num, boolean z, boolean z2) {
        C67101MiL nbt;
        0qQ.A0B(num, 3);
        AnonymousClass7S7 C6l = A00(this).C6l();
        AnonymousClass4DH r1 = this.A00;
        Context requireContext = r1.requireContext();
        UserSession userSession = this.A03;
        if (C70104NxK.A00(r1.requireActivity(), requireContext, r1, userSession, C6l)) {
            return;
        }
        if (A00(this).C6l().CdE()) {
            if (A00(this).C6l().CdK() && 1YZ.A02 != null) {
                AnonymousClass73V.A07(this.A02, (C3263576k) null, (C69445Nlp) null, "delete_in_thread", A00(this).C6l().C6k(), A00(this).C6l().C6O());
            }
            if (r10 != null) {
                if (r10 instanceof DirectThreadKey) {
                    FragmentActivity requireActivity = r1.requireActivity();
                    AnonymousClass7TG.A1N(requireActivity, userSession);
                    nbt = new C67100MiK(requireActivity, userSession);
                } else {
                    nbt = new C68966Nbt(r1.requireActivity(), userSession);
                }
                nbt.A04(r10, num, z2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void DKM(C391629tO r1, 2Er r2) {
    }

    public final void De4(String str) {
        boolean CUO = A00(this).C6l().CUO();
        boolean CdE = A00(this).C6l().CdE();
        String str2 = str;
        if (CUO) {
            if (CdE) {
                if (A00(this).C6l().CdK() && 1YZ.A02 != null) {
                    AnonymousClass73V.A07(this.A02, (C3263576k) null, (C69445Nlp) null, "report_in_thread", A00(this).C6l().C6k(), A00(this).C6l().C6O());
                }
                UserSession userSession = this.A03;
                C71128OdR.A04(this.A00.requireActivity(), this.A01, userSession, C14068TpH.DIRECT_MESSAGES, C16677UzD.USER, new C69235Nhp(this), str2, str, A00(this).C6l().C6C(), A00(this).C6l().CVr(), false);
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } else if (CdE) {
            if (A00(this).C6l().CdK() && 1YZ.A02 != null) {
                AnonymousClass73V.A07(this.A02, (C3263576k) null, (C69445Nlp) null, "report_in_thread", A00(this).C6l().C6k(), A00(this).C6l().C6O());
            }
            UserSession userSession2 = this.A03;
            FragmentActivity requireActivity = this.A00.requireActivity();
            String C6C = A00(this).C6l().C6C();
            boolean CVr = A00(this).C6l().CVr();
            C71128OdR.A05(requireActivity, this.A01, userSession2, new C69234Nho(this), str, C6C, 0, CVr, A00(this).C6l().B8S() instanceof MsysThreadId, false);
        } else {
            throw new IllegalStateException("Check failed.");
        }
        this.A05.Cyt();
    }

    public static final C333517Zg A00(AnonymousClass7V7 r0) {
        Object obj = r0.A09.get();
        0qQ.A07(obj);
        return (C333517Zg) obj;
    }

    public static final void A01(AnonymousClass7V7 r11, String str) {
        UserSession userSession = r11.A03;
        AnonymousClass4DU r1 = r11.A06;
        String str2 = userSession.A06;
        List singletonList = Collections.singletonList(A00(r11).C6l().C6C());
        0qQ.A07(singletonList);
        String str3 = str;
        C3265677h.A0T(r1, userSession, str3, str2, r11.A08, "thread_view", (String) null, singletonList, C395069zA.A00(A00(r11)), r11.A07, 0);
    }

    public final void CyM(User user) {
        C69445Nlp nlp;
        AnonymousClass4DH r5 = this.A00;
        UserSession userSession = this.A03;
        C333517Zg A002 = A00(this);
        AnonymousClass4DU r10 = this.A06;
        0wc r11 = this.A02;
        String str = this.A08;
        int i = this.A07;
        boolean z = this.A0A;
        0qQ.A0B(r5, 0);
        0qQ.A0B(A002, 2);
        0qQ.A0B(r11, 4);
        AnonymousClass7S7 C6l = A002.C6l();
        if (C6l.CdE()) {
            if (C6l.CdK() && 1YZ.A02 != null) {
                boolean CUO = C6l.CUO();
                String A003 = AnonymousClass747.A00(A002);
                List C6O = C6l.C6O();
                C3263576k A004 = C3263476j.A00(z, CUO);
                if (!C6l.CVr() || !CUO) {
                    nlp = C69445Nlp.DEFAULT;
                } else {
                    nlp = C69445Nlp.GXAC;
                }
                AnonymousClass73V.A07(r11, A004, nlp, "block_in_thread", A003, C6O);
            }
            C72967PRa pRa = new C72967PRa(userSession, A002);
            User user2 = user;
            if (user != null) {
                String str2 = userSession.A06;
                List singletonList = Collections.singletonList(C6l.C6C());
                0qQ.A07(singletonList);
                UserSession userSession2 = userSession;
                C3265677h.A0T(r10, userSession2, C66579MXk.A00(788), str2, str, "thread_view", (String) null, singletonList, C395069zA.A00(A002), i, 0);
                String moduleName = r10.getModuleName();
                int BIW = user2.BIW();
                FollowStatus B6o = user2.B6o();
                C48887Eln.A00(r5.requireActivity(), r5, (FragmentActivity) null, userSession, new C49475EwG(C6l.COR(str2), C6l.C6Q().A08), (C331157Pu) null, (C331127Pr) null, user2, new C49936FFp((C3263576k) null, (C69445Nlp) null, Boolean.valueOf(C6l.CZ0()), Boolean.valueOf(C6l.CUO()), moduleName, "direct_thread", B6o.name(), C6l.C6C(), "DEFAULT", "DEFAULT", UUID.randomUUID().toString(), BIW), (C51922G7q) null, pRa);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public AnonymousClass7V7(AnonymousClass4DH r1, AnonymousClass0iw r2, 0wc r3, UserSession userSession, AnonymousClass7V6 r5, C332257Ug r6, AnonymousClass4DU r7, String str, AnonymousClass0eK r9, int i, boolean z) {
        this.A03 = userSession;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A02 = r3;
        this.A0A = z;
        this.A07 = i;
        this.A08 = str;
        this.A05 = r6;
        this.A09 = r9;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0171, code lost:
        if (X.2El.A0C(r5) == false) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Csz() {
        /*
            r11 = this;
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdE()
            r2 = 0
            if (r0 == 0) goto L_0x0084
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdK()
            if (r0 == 0) goto L_0x0084
            X.1YZ r0 = X.1YZ.A02
            if (r0 == 0) goto L_0x0084
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r1 = r0.CUO()
            X.0wc r3 = r11.A02
            X.7Zg r0 = A00(r11)
            java.lang.String r7 = X.AnonymousClass747.A00(r0)
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            java.util.List r8 = r0.C6O()
            boolean r0 = r11.A0A
            X.76k r4 = X.C3263476j.A00(r0, r1)
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CVr()
            if (r0 == 0) goto L_0x0081
            if (r1 == 0) goto L_0x0081
            X.Nlp r5 = X.C69445Nlp.GXAC
        L_0x005b:
            java.lang.String r6 = "unrestrict_in_thread"
            X.AnonymousClass73V.A07(r3, r4, r5, r6, r7, r8)
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            java.util.List r0 = r0.C6O()
            java.lang.Object r6 = r0.get(r2)
            X.0qQ.A07(r6)
            java.lang.String r6 = (java.lang.String) r6
            X.1YZ r1 = X.1YZ.A02
            if (r1 != 0) goto L_0x0190
            java.lang.String r1 = "Unable to restrict user"
            java.lang.String r0 = "Unable to restrict as Restrict Plugin instance is null"
        L_0x007d:
            X.0wb.A03(r1, r0)
        L_0x0080:
            return
        L_0x0081:
            X.Nlp r5 = X.C69445Nlp.DEFAULT
            goto L_0x005b
        L_0x0084:
            X.4DH r6 = r11.A00
            android.content.Context r0 = r6.requireContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x00dc
            com.instagram.common.session.UserSession r5 = r11.A03
            boolean r0 = X.2El.A0C(r5)
            if (r0 == 0) goto L_0x00dc
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdE()
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x00b7
            X.0Tu r3 = X.0Tu.A05
            r0 = 36313166804354869(0x8102a2000b0735, double:3.02793113623564E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00dc
        L_0x00b7:
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CZ0()
            if (r0 == 0) goto L_0x00dc
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdE()
            if (r0 != 0) goto L_0x01ab
            r0 = 441(0x1b9, float:6.18E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Thread is null for direct thread surface"
            goto L_0x007d
        L_0x00dc:
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdE()
            if (r0 == 0) goto L_0x0080
            com.instagram.common.session.UserSession r5 = r11.A03
            r0 = 23
            X.Plp r1 = new X.Plp
            r1.<init>(r5, r0)
            java.lang.Class<X.Ncf> r0 = X.C69003Ncf.class
            java.lang.Object r4 = r5.A01(r0, r1)
            X.Ncf r4 = (X.C69003Ncf) r4
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            X.2EN r0 = r0.C3d()
            if (r0 == 0) goto L_0x018d
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x018a
            r0 = 1
            if (r1 == r0) goto L_0x0187
            r0 = 2
            if (r1 == r0) goto L_0x0184
            r0 = 3
            if (r1 != r0) goto L_0x0237
            X.Mkq r9 = X.C67256Mkq.BC_PARTNERSHIP
        L_0x011a:
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r10 = r0.CUO()
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0150
            long r1 = r4.A00
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0150
            X.1QP r3 = r4.A01
            r2 = 70793944(0x4383ad8, float:2.1656116E-36)
            r1 = 1
            java.lang.String r0 = "ACCEPT_REQUEST"
            long r0 = r3.flowStartForMarker(r2, r0, r1)
            r4.A00 = r0
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "folder_type"
            r4.A03(r0, r1)
            if (r10 == 0) goto L_0x0181
            java.lang.String r1 = "group"
        L_0x014b:
            java.lang.String r0 = "thread_type"
            r4.A03(r0, r1)
        L_0x0150:
            X.7V6 r4 = r11.A04
            X.7Zg r0 = A00(r11)
            X.7S7 r3 = r0.C6l()
            X.7Zg r0 = A00(r11)
            X.7S7 r2 = r0.C6l()
            android.content.Context r0 = r6.requireContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x0173
            boolean r1 = X.2El.A0C(r5)
            r0 = 1
            if (r1 != 0) goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            int r1 = r2.C68(r0)
            X.N4G r0 = new X.N4G
            r0.<init>(r1)
            r4.A00(r0, r3)
            return
        L_0x0181:
            java.lang.String r1 = "one_to_one"
            goto L_0x014b
        L_0x0184:
            X.Mkq r9 = X.C67256Mkq.SPAM
            goto L_0x011a
        L_0x0187:
            X.Mkq r9 = X.C67256Mkq.PENDING
            goto L_0x011a
        L_0x018a:
            X.Mkq r9 = X.C67256Mkq.INBOX
            goto L_0x011a
        L_0x018d:
            X.Mkq r9 = X.C67256Mkq.OTHER
            goto L_0x011a
        L_0x0190:
            X.4DH r0 = r11.A00
            android.content.Context r2 = r0.requireContext()
            X.0gy r3 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r4 = r11.A03
            X.4DU r0 = r11.A06
            java.lang.String r7 = r0.getModuleName()
            X.AhJ r5 = new X.AhJ
            r5.<init>(r11)
            r1.A02(r2, r3, r4, r5, r6, r7)
            return
        L_0x01ab:
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            java.util.List r1 = r0.BRZ()
            int r8 = r1.size()
            r0 = 1
            if (r8 != r0) goto L_0x0232
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CUO()
            if (r0 == 0) goto L_0x0227
            X.7Zg r0 = A00(r11)
            X.7S7 r0 = r0.C6l()
            java.lang.String r7 = r0.C6H()
        L_0x01d8:
            X.AdD r4 = new X.AdD
            r4.<init>(r11)
            boolean r0 = X.2El.A08(r5)
            if (r0 == 0) goto L_0x01f6
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.43I r0 = X.AnonymousClass43I.A00
            X.C70886OQd.A01(r1, r5, r0, r4)
        L_0x01ec:
            r0 = 787(0x313, float:1.103E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            A01(r11, r0)
            return
        L_0x01f6:
            boolean r0 = X.2El.A0J(r5)
            if (r0 == 0) goto L_0x0205
            X.N4G r0 = new X.N4G
            r0.<init>(r2)
            r4.DVU(r0)
            goto L_0x01ec
        L_0x0205:
            android.content.Context r3 = r6.requireContext()
            android.content.Context r0 = r6.requireContext()
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820767(0x7f1100df, float:1.9274258E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            java.lang.String r1 = r2.getQuantityString(r1, r8, r0)
            X.0qQ.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.C70886OQd.A00(r3, r0, r5, r4, r1)
            goto L_0x01ec
        L_0x0227:
            java.lang.Object r0 = X.00k.A0I(r1)
            X.170 r0 = (X.AnonymousClass170) r0
            java.lang.String r7 = X.AnonymousClass50n.A05(r0)
            goto L_0x01d8
        L_0x0232:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            goto L_0x01d8
        L_0x0237:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7V7.Csz():void");
    }

    public final void DNG(C254743sy r8) {
        if (A00(this).C6l().CdE()) {
            if (A00(this).C6l().CdK() && 1YZ.A02 != null) {
                AnonymousClass73V.A07(this.A02, (C3263576k) null, (C69445Nlp) null, C66579MXk.A00(936), A00(this).C6l().C6k(), A00(this).C6l().C6O());
            }
            if (r8 instanceof DirectThreadKey) {
                C71097OcX.A01(this.A00.requireContext(), this.A03, C66647MaG.A03(r8));
            } else {
                0wb.A03(AnonymousClass000.A00(441), "Leave msys group thread not supported");
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void Ct0(2Er r1) {
        Csz();
    }
}
