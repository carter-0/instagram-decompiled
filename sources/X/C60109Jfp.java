package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* renamed from: X.Jfp  reason: case insensitive filesystem */
public final class C60109Jfp extends C361478gI {
    public Integer A00;
    public boolean A01;
    public final UserSession A02;
    public final ClipsTimelineEditorConfig A03;
    public final C354388Lv A04;
    public final ClipsCreationViewModel A05;
    public final C3511387s A06;
    public final AnonymousClass8RF A07;
    public final C61805KMt A08;
    public final C60108Jfo A09;
    public final AnonymousClass88B A0A;
    public final 0V2 A0B;
    public final 05G A0C;
    public final C61770pa A0D;
    public final AnonymousClass0Ud A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60109Jfp(Application application, UserSession userSession, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C354388Lv r7, ClipsCreationViewModel clipsCreationViewModel, C3511387s r9, AnonymousClass8RF r10, C61805KMt kMt, C60108Jfo jfo, AnonymousClass88B r13) {
        super(application);
        C51974G9v.A1M(userSession, clipsCreationViewModel, r13);
        this.A02 = userSession;
        this.A05 = clipsCreationViewModel;
        this.A0A = r13;
        this.A07 = r10;
        this.A09 = jfo;
        this.A08 = kMt;
        this.A06 = r9;
        this.A04 = r7;
        this.A03 = clipsTimelineEditorConfig;
        02z A1J = JTO.A1J();
        this.A0C = A1J;
        this.A0E = A1J;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 1, 0);
        this.A0B = A012;
        this.A0D = A012;
    }

    public static final AnonymousClass51M A00(AnonymousClass8RH r1, C60109Jfp jfp) {
        int i = ((C355868Rr) r1).A00;
        AnonymousClass831 A0K = JTQ.A0K(jfp.A05);
        if (A0K != null) {
            return JTO.A0f(A0K, i);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1.A0q() != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C60109Jfp r9, java.util.List r10, boolean r11) {
        /*
            com.instagram.common.session.UserSession r2 = r9.A02
            boolean r0 = X.AnonymousClass30D.A08(r2)
            if (r0 == 0) goto L_0x003b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r9.A05
            boolean r0 = r1.A0n()
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass8IK.A07(r2)
            if (r0 == 0) goto L_0x003b
        L_0x0016:
            X.KjH r2 = X.C62636KjH.A02
            r6 = r11 ^ 1
            boolean r0 = r1.A0p()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A0m()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A0q()
            r7 = 1
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r7 = 0
        L_0x002e:
            r3 = 0
            r8 = 0
            r5 = 1
            X.Jzw r1 = new X.Jzw
            r4 = r3
            r9 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.add(r1)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60109Jfp.A01(X.Jfp, java.util.List, boolean):void");
    }

    public static final void A02(C60109Jfp jfp, List list, boolean z) {
        if (182.A06(0Tu.A05, jfp.A02, 36323715243453867L)) {
            list.add(new C61263Jzw(C62636KjH.A0F, (Integer) null, (String) null, true, !z, true, false, false));
        }
    }

    public static final void A03(C60109Jfp jfp, List list, boolean z) {
        ClipsCreationViewModel clipsCreationViewModel = jfp.A05;
        if (!clipsCreationViewModel.A0p()) {
            UserSession userSession = jfp.A02;
            if (!AnonymousClass30D.A02(userSession) && 182.A06(DbS.A0J(userSession, 0), userSession, 36314472473692734L)) {
                list.add(new C61263Jzw(C62636KjH.A0O, (Integer) null, (String) null, true, !z, !clipsCreationViewModel.A0n(), false, false));
            }
        }
    }

    public static final void A04(C60109Jfp jfp, List list, boolean z) {
        AnonymousClass831 A0K = JTQ.A0K(jfp.A05);
        if (A0K != null && JTO.A08(A0K) > 1) {
            list.add(new C61263Jzw(C62636KjH.A0S, (Integer) null, (String) null, true, z, true, false, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A02, 36327202756966630L) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C60109Jfp r25, java.util.List r26, boolean r27, boolean r28) {
        /*
            X.KgV r5 = X.C62480KgV.CENTER
            r1 = r25
            if (r28 != 0) goto L_0x0016
            com.instagram.common.session.UserSession r4 = r1.A02
            X.0Tu r0 = X.0Tu.A05
            r2 = 36327202756966630(0x810f66000338e6, double:3.036807529185562E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            r7 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r7 = 0
        L_0x0017:
            X.0V2 r0 = r1.A0B
            r0.FIA(r5)
            X.KjH r9 = X.C62636KjH.A0N
            r4 = r27
            r13 = r27 ^ 1
            r10 = 0
            r15 = 0
            r12 = 1
            r25 = 1
            X.Jzw r8 = new X.Jzw
            r11 = r10
            r14 = r12
            r16 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r26
            r0.add(r8)
            if (r7 == 0) goto L_0x00e8
            X.KjH r9 = X.C62636KjH.A0B
            X.Jzw r8 = new X.Jzw
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
        L_0x0041:
            X.KjH r9 = X.C62636KjH.A06
            X.Jzw r8 = new X.Jzw
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
            X.KjH r9 = X.C62636KjH.A04
            X.Jzw r8 = new X.Jzw
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
            X.KjH r9 = X.C62636KjH.A05
            X.Jzw r8 = new X.Jzw
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
            if (r7 != 0) goto L_0x0064
            A02(r1, r0, r4)
        L_0x0064:
            com.instagram.common.session.UserSession r6 = r1.A02
            X.0Tu r5 = X.0Tu.A05
            r2 = 36323805437963800(0x810c4f00052e18, double:3.034659050968267E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x007d
            X.KjH r9 = X.C62636KjH.A0I
            X.Jzw r8 = new X.Jzw
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
        L_0x007d:
            if (r7 != 0) goto L_0x0089
            X.KjH r9 = X.C62636KjH.A0f
            X.Jzw r8 = new X.Jzw
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
        L_0x0089:
            if (r28 == 0) goto L_0x00a5
            X.KjH r17 = X.C62636KjH.A03
            X.Jzw r2 = new X.Jzw
            r18 = r10
            r19 = r10
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r15
            r24 = r15
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r2)
        L_0x00a5:
            if (r7 != 0) goto L_0x00b3
            X.KjH r9 = X.C62636KjH.A0h
            X.Jzw r8 = new X.Jzw
            r16 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
        L_0x00b3:
            A04(r1, r0, r13)
            X.KjH r21 = X.C62636KjH.A0G
            X.8Lv r2 = r1.A04
            r28 = 0
            if (r2 == 0) goto L_0x00ce
            X.05G r2 = r2.A07
            java.lang.Object r2 = r2.getValue()
            X.8Lw r2 = (X.C354398Lw) r2
            if (r2 == 0) goto L_0x00ce
            int r2 = r2.A01
            if (r2 == 0) goto L_0x00ce
            r28 = 1
        L_0x00ce:
            X.Jzw r2 = new X.Jzw
            r22 = r10
            r23 = r10
            r24 = r13
            r26 = r12
            r27 = r15
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r0.add(r2)
            if (r7 != 0) goto L_0x00e7
            A03(r1, r0, r4)
        L_0x00e7:
            return
        L_0x00e8:
            A01(r1, r0, r4)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60109Jfp.A05(X.Jfp, java.util.List, boolean, boolean):void");
    }
}
