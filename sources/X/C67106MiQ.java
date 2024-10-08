package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.BitSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.MiQ  reason: case insensitive filesystem */
public final class C67106MiQ implements C74395PuB {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C67095MiF A02;
    public final 2Dm A03;
    public final C46483Dfm A04;
    public final AnonymousClass0eM A05 = C73910Pll.A00(this, 40);
    public final AnonymousClass0eM A06 = C73910Pll.A00(this, 41);
    public final 0wc A07;
    public final C67097MiH A08;
    public final C2356430q A09;
    public final String A0A = AnonymousClass7TG.A0j();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
        if (r0 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cqe(X.C67058MhZ r14, X.C254743sy r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.String r18, java.util.List r19) {
        /*
            r13 = this;
            r9 = 0
            X.0qQ.A0B(r15, r9)
            X.MiH r0 = r13.A08
            X.Ma2 r0 = r0.A00
            r0.A0y()
            com.instagram.common.session.UserSession r8 = r13.A01
            X.4DH r7 = r13.A00
            android.content.Context r0 = r7.requireContext()
            X.MbI r6 = X.C66685Mas.A00(r0, r8)
            r5 = 1
            X.Ply r1 = new X.Ply
            r1.<init>(r8, r5)
            java.lang.Class<X.MkW> r0 = X.C67236MkW.class
            java.lang.Object r4 = r8.A01(r0, r1)
            X.MkW r4 = (X.C67236MkW) r4
            boolean r0 = r15 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x00d1
            java.lang.String r3 = X.C66647MaG.A09(r15)
        L_0x002d:
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r1 = r18
            X.1pE r2 = X.1pE.A01(r0, r7, r8, r1)
            r2.A00 = r7
            r2.A09(r15)
            r10 = r19
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r10)
            r2.A0B(r0)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r11, r8, r0)
            r12 = 0
            if (r0 != 0) goto L_0x005f
            r0 = 36311569077109357(0x81012e0014026d, double:3.026920727092047E-306)
            boolean r0 = X.182.A06(r11, r8, r0)
            r8 = 0
            if (r0 == 0) goto L_0x0060
        L_0x005f:
            r8 = 1
        L_0x0060:
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.30q r0 = r13.A09
            r2.A14 = r8
            r2.A00 = r7
            r2.A02 = r1
            r2.A0A = r0
            r0 = r16
            r2.A0H = r0
            X.MiF r0 = r13.A02
            java.lang.String r0 = r0.A01
            r2.A0d = r0
            int r0 = r14.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            r2.A0v = r5
            java.lang.String r1 = r14.A02
            boolean r0 = r6.A04(r1)
            if (r0 != 0) goto L_0x009a
            if (r3 == 0) goto L_0x009b
            int r0 = r3.length()
            if (r0 == 0) goto L_0x009b
            java.util.Set r0 = r4.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x009b
        L_0x009a:
            r12 = 1
        L_0x009b:
            r2.A0z = r12
            int r0 = r10.size()
            if (r0 != r5) goto L_0x00cf
            java.lang.Object r0 = r10.get(r9)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            java.lang.String r3 = r0.getId()
            X.Ord r0 = new X.Ord
            r0.<init>(r3)
        L_0x00b2:
            r2.A03 = r0
            r2.A05 = r7
            X.P4E r0 = new X.P4E
            r0.<init>(r14, r13, r6)
            r2.A06 = r0
            r2.A0Y = r1
            java.lang.String r0 = r13.A0A
            r2.A0g = r0
            java.lang.String r0 = r14.A01
            r2.A0P = r0
            r0 = r17
            r2.A0F = r0
            r2.A06()
            return
        L_0x00cf:
            r0 = 0
            goto L_0x00b2
        L_0x00d1:
            r3 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67106MiQ.Cqe(X.MhZ, X.3sy, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List):void");
    }

    public static final void A00(C67058MhZ mhZ, C67106MiQ miQ, DirectThreadKey directThreadKey, Integer num, Integer num2) {
        Integer num3;
        List emptyList;
        C67106MiQ miQ2 = miQ;
        if (!miQ.A00.isResumed()) {
            0wb.A03("DirectInboxNavigationController", "click listener called when fragment is not resumed");
            return;
        }
        DirectThreadKey directThreadKey2 = directThreadKey;
        AnonymousClass3U9 B33 = miQ.A03.B33(directThreadKey);
        if (B33 != null) {
            emptyList = B33.BRZ();
        } else {
            List list = directThreadKey.A02;
            if (list != null) {
                num3 = C51968G9o.A0t(list);
            } else {
                num3 = null;
            }
            boolean A1a = DbW.A1a(directThreadKey.A00);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Could not find thread with threadKey thread. threadKeyIsNull:false, threadIdIsNull:");
            A1A.append(A1a);
            0wb.A04("DirectInboxController_missingThread_openThreadFragmentFromEntryPoint", AnonymousClass7TG.A0m(num3, ", numRecipients:", A1A), 1);
            emptyList = Collections.emptyList();
        }
        0qQ.A0A(emptyList);
        miQ2.Cqe(mhZ, directThreadKey2, num, num2, "inbox", AnonymousClass48M.A01(emptyList));
        AnonymousClass73V.A08(miQ.A07, miQ.A01, B33, emptyList);
    }

    public final void Cqi(C67058MhZ mhZ, C254743sy r30, Integer num, String str, int i) {
        boolean A002;
        C254743sy r15 = r30;
        0qQ.A0B(r15, 0);
        DirectThreadKey A032 = C66647MaG.A03(r15);
        Integer valueOf = Integer.valueOf(i);
        DirectThreadKey A033 = C66647MaG.A03(r15);
        UserSession userSession = this.A01;
        C70486O8l o8l = new C70486O8l(userSession);
        AnonymousClass3U9 B33 = this.A03.B33(A033);
        C67058MhZ mhZ2 = mhZ;
        Integer num2 = num;
        if (!(B33 == null || B33.BHS() == 6 || B33.BHS() == 8)) {
            int C6a = B33.C6a();
            N2U C43 = B33.C43();
            if (!AnonymousClass48O.A04(C6a) || C43 == null || C43.A00 != 1) {
                int C6a2 = B33.C6a();
                N2U C432 = B33.C43();
                if (AnonymousClass48O.A04(C6a2) && C432 != null && C432.A00 == 3) {
                    if (182.A06(0Tu.A05, o8l.A00, 36328658750684676L)) {
                        FragmentActivity requireActivity = this.A00.requireActivity();
                        FRI fri = new FRI(new UKI((UKS) null, requireActivity.getString(2131963764)), false, (Integer) null, 50, 1.0f, false, false, false, true);
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        if (new BitSet(0).nextClearBit(0) >= 0) {
                            C11844ShW shW = new C11844ShW("com.bloks.www.bloks.mwb.igd.channels.geoblocking.transperancy.bottom_sheet", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, 0, true);
                            C307506Qj A003 = C48721Ej6.A00(userSession, false);
                            0qQ.A0B(A003, 1);
                            shW.E0s(requireActivity, fri, A003);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Missing required params");
                    }
                }
                if (B33.CUG()) {
                    Context requireContext = this.A00.requireContext();
                    List BRZ = B33.BRZ();
                    A002 = ((C66743Mbo) this.A06.getValue()).A00(requireContext, new C72674PFe(mhZ2, this, A033, valueOf, num2), r15, B33.AsX(), BRZ, B33.BHS(), B33.C6a(), 0, B33.CVr(), r15 instanceof MsysThreadId);
                } else {
                    DirectThreadKey directThreadKey = A033;
                    Integer num3 = valueOf;
                    if (!((C66664MaX) this.A05.getValue()).A01(new P0e(mhZ2, this, directThreadKey, num3, num2), B33)) {
                        A002 = this.A04.A00(this.A00, new PFZ(2, num2, directThreadKey, num3, this, mhZ2), A033, "inbox");
                    } else {
                        return;
                    }
                }
                if (A002) {
                    return;
                }
            } else {
                AnonymousClass4DH r6 = this.A00;
                FragmentActivity requireActivity2 = r6.requireActivity();
                String C6C = B33.C6C();
                N2U C433 = B33.C43();
                if (C433 != null && C433.A00 == 1) {
                    C360678ey A052 = C359988do.A05(o8l.A00, "com.instagram.mwb.channels.takedown.show_bottomsheet.action", DbY.A0m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C));
                    A052.A00(new E85(4, requireActivity2, r6, o8l));
                    1ES.A06(A052, -5, true);
                    return;
                }
            }
        }
        A00(mhZ2, this, A032, valueOf, num2);
    }

    public C67106MiQ(AnonymousClass4DH r2, 0wc r3, UserSession userSession, C67097MiH miH, C67095MiF miF, 2Dm r7, C46483Dfm dfm, C2356430q r9) {
        this.A01 = userSession;
        this.A03 = r7;
        this.A00 = r2;
        this.A02 = miF;
        this.A07 = r3;
        this.A04 = dfm;
        this.A09 = r9;
        this.A08 = miH;
    }
}
