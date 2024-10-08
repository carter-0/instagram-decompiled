package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7VD  reason: invalid class name */
public final class AnonymousClass7VD {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final AnonymousClass0eK A05;
    public final boolean A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass7VF(this));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass7VE(this));

    public static void A00(AnonymousClass7VD r1) {
        AnonymousClass4DH r12 = r1.A01;
        if (r12.isResumed()) {
            FragmentActivity requireActivity = r12.requireActivity();
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(requireActivity);
            if (A012 == null || !((AnonymousClass37F) A012).A0g) {
                requireActivity.onBackPressed();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r2.A00 == 3) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r12 == 8) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r17 = this;
            r3 = r17
            X.4DH r5 = r3.A01
            boolean r0 = r5.isResumed()
            if (r0 == 0) goto L_0x01cb
            X.0eK r4 = r3.A05
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdE()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.2Ep r7 = r0.Cms()
            com.instagram.common.session.UserSession r9 = r3.A02
            r8 = 1
            X.0qQ.A0B(r9, r8)
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            r0.getClass()
            int r12 = r0.BHS()
            r0 = 6
            r1 = 0
            if (r12 == r0) goto L_0x004a
            r0 = 8
            r6 = 0
            if (r12 != r0) goto L_0x004b
        L_0x004a:
            r6 = 1
        L_0x004b:
            if (r7 == 0) goto L_0x00f3
            int r0 = r7.C6a()
            X.N2U r2 = r7.C43()
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 == 0) goto L_0x00dc
            if (r2 == 0) goto L_0x00dc
            int r0 = r2.A00
            if (r0 != r8) goto L_0x00dc
        L_0x0061:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00f3
            androidx.fragment.app.FragmentActivity r10 = r5.requireActivity()
            java.lang.String r6 = r7.C6k()
            X.N2U r0 = r7.C43()
            r4 = 1
            if (r6 == 0) goto L_0x00da
            if (r0 == 0) goto L_0x00da
            int r2 = r0.A00
            if (r2 == r8) goto L_0x007d
            r0 = 3
            if (r2 != r0) goto L_0x00da
        L_0x007d:
            X.A65 r13 = new X.A65
            r13.<init>()
            java.util.Map r11 = r13.A02
            java.lang.String r0 = "thread_id"
            r11.put(r0, r6)
            java.util.BitSet r12 = r13.A00
            r12.set(r1)
            long r6 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = "takedown_state"
            r11.put(r0, r2)
            r0 = 14
            X.Plp r2 = new X.Plp
            r2.<init>(r10, r0)
            X.AuU r0 = new X.AuU
            r0.<init>(r13, r2)
            X.Q3B r2 = new X.Q3B
            r2.<init>(r0)
            java.util.Map r6 = r13.A01
            java.lang.String r0 = "on_complete"
            r6.put(r0, r2)
            r12.set(r8)
            r0 = 0
            X.2nI r5 = X.C229382nI.A01(r0, r10, r5, r9)
            X.AXn r2 = new X.AXn
            r2.<init>()
            int r1 = r12.nextClearBit(r1)
            r0 = 2
            if (r1 < r0) goto L_0x01bf
            java.lang.String r0 = "com.bloks.www.mwb.community_messaging.thread_takedown_dialog"
            X.FBO r1 = X.HX9.A00(r0)
            java.util.HashMap r0 = X.C359608dC.A01(r11)
            r1.A04 = r0
            r1.A03 = r6
            r1.A02 = r2
            r1.A01(r10, r5)
        L_0x00d7:
            r3.A00 = r4
        L_0x00d9:
            return
        L_0x00da:
            r4 = 0
            goto L_0x00d7
        L_0x00dc:
            int r0 = r7.C6a()
            X.N2U r2 = r7.C43()
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 == 0) goto L_0x00f3
            if (r2 == 0) goto L_0x00f3
            int r2 = r2.A00
            r0 = 3
            if (r2 != r0) goto L_0x00f3
            goto L_0x0061
        L_0x00f3:
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CUO()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3sy r0 = r0.AfV()
            if (r0 == 0) goto L_0x0189
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0189
            if (r6 != 0) goto L_0x0189
            java.lang.String r2 = r3.A04
            java.lang.String r0 = "inbox_search"
            boolean r0 = r0.equals(r2)
            r14 = 1
            if (r0 == 0) goto L_0x0126
            r14 = 2
            r1 = 1
        L_0x0126:
            X.0eM r0 = r3.A08
            java.lang.Object r6 = r0.getValue()
            X.Mbo r6 = (X.C66743Mbo) r6
            android.content.Context r7 = r5.requireContext()
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3sy r9 = r0.AfV()
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            java.util.List r11 = r0.BRZ()
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            java.lang.String r10 = r0.BiB()
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            int r13 = r0.A08
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            boolean r15 = r0.CVr()
            boolean r0 = r3.A06
            X.77R r8 = new X.77R
            r8.<init>(r3, r1)
            r16 = r0
            boolean r4 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00d7
        L_0x0189:
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.9Gx r1 = X.C376179Gx.PSEUDO_WARN_ABOUT_REPORTED_USER
            boolean r0 = r0.AH1(r1)
            if (r0 == 0) goto L_0x01c7
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00d9
            X.0eM r0 = r3.A07
            java.lang.Object r2 = r0.getValue()
            X.MaX r2 = (X.C66664MaX) r2
            java.lang.Object r0 = r4.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.2Ep r1 = r0.Cms()
            r1.getClass()
            X.9Nq r0 = new X.9Nq
            r0.<init>(r3)
            boolean r4 = r2.A01(r0, r1)
            goto L_0x00d7
        L_0x01bf:
            java.lang.String r1 = "Missing Required Props"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01c7:
            X.C69865NtT.A00(r1)
            return
        L_0x01cb:
            java.lang.String r1 = "DirectThreadFragment#maybeWarnAboutUsers"
            java.lang.String r0 = "not resumed"
            X.0wb.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VD.A01():void");
    }

    public final boolean A02() {
        if (!((C333517Zg) this.A05.get()).C6l().CUO()) {
            return false;
        }
        A01();
        return true;
    }

    public AnonymousClass7VD(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, String str, AnonymousClass0eK r6, boolean z) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = z;
        this.A04 = str;
        this.A05 = r6;
    }
}
