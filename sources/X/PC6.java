package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

public final class PC6 implements C74407PuN {
    public final UserSession A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final OLP A03;
    public final List A04 = 0sr.A1P(new Integer[]{Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS), 4001, 4002, 4003, 4004, 4005, 4006, 4007});
    public final Context A05;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        if (OZ6.A00(pwa, pwl, i) == 2FW.A1i) {
            if (!00k.A0u(this.A04, pwl.CH5(i))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00af, code lost:
        if (r12.A01.getInt("direct_thread_video_call_xma_start_call_confirmation_count", 0) >= 3) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
        if (r1 != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007f, code lost:
        if (r3 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0187, code lost:
        if (r7 != X.AnonymousClass05K.A00) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.OTT AWh(android.content.Context r47, X.C61084JwM r48, X.C74541Pwa r49, com.instagram.direct.model.messaginguser.MessagingUser r50, X.OMF r51, X.C74552Pwl r52, java.util.Map r53, java.util.Set r54, int r55, boolean r56) {
        /*
            r46 = this;
            r5 = r47
            r44 = r51
            r0 = r44
            X.AnonymousClass7TG.A1N(r5, r0)
            r3 = 2
            r45 = r50
            r0 = r52
            r4 = r53
            r43 = r54
            r2 = r45
            r1 = r43
            X.C51974G9v.A0d(r3, r0, r2, r1, r4)
            r13 = r46
            com.instagram.common.session.UserSession r7 = r13.A00
            X.9HC r1 = r13.A01
            r21 = r1
            X.7L2 r1 = r13.A02
            r20 = r1
            r2 = 0
            r3 = 1
            r14 = 3
            r9 = 4
            r4 = r55
            java.lang.Integer r1 = r0.CH5(r4)
            int r8 = X.DbX.A02(r1)
            r1 = 2130970331(0x7f0406db, float:1.754937E38)
            int r19 = X.AnonymousClass7TF.A03(r5, r1)
            int r1 = X.2Yu.A03(r5)
            int r18 = r5.getColor(r1)
            int r30 = X.C66581MXm.A02(r5)
            X.Mdq r6 = new X.Mdq
            r6.<init>(r5, r3, r3, r3)
            X.Mdr r17 = new X.Mdr
            r1 = r17
            r1.<init>(r5)
            X.1Av r12 = X.1Au.A00(r7)
            r1 = r44
            X.NAt r11 = r1.A00
            java.lang.Long r1 = X.C66582MXn.A0m(r11, r2, r3)
            java.lang.String r28 = java.lang.String.valueOf(r1)
            X.7Rj r23 = X.C331537Rj.DIRECT_THREAD_XMA
            int[] r1 = new int[r9]
            r1 = {4004, 4005, 4006, 4007} // fill-array
            boolean r42 = X.03t.A0P(r1, r8)
            r1 = r45
            boolean r15 = X.C74552Pwl.A02(r1, r0, r4)
            int[] r1 = new int[r9]
            r1 = {4002, 4003, 4006, 4007} // fill-array
            if (r15 != 0) goto L_0x0081
            boolean r3 = X.03t.A0P(r1, r8)
            r1 = 1
            if (r3 != 0) goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            if (r42 == 0) goto L_0x018b
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0086:
            com.facebook.msys.mci.CQLResultSet r10 = r11.mResultSet
            r3 = 9
            java.lang.Integer r10 = X.C66581MXm.A0o(r10, r2, r3)
            if (r10 == 0) goto L_0x009e
            com.facebook.msys.mci.CQLResultSet r10 = r11.mResultSet
            java.lang.Integer r3 = X.C66581MXm.A0o(r10, r2, r3)
            if (r3 == 0) goto L_0x0182
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0182
        L_0x009e:
            r16 = 1
        L_0x00a0:
            r3 = 0
            if (r16 == 0) goto L_0x00b1
            if (r1 != 0) goto L_0x00b1
            X.0xa r11 = r12.A01
            java.lang.String r10 = "direct_thread_video_call_xma_start_call_confirmation_count"
            int r10 = r11.getInt(r10, r2)
            r32 = 1
            if (r10 < r14) goto L_0x00b3
        L_0x00b1:
            r32 = 0
        L_0x00b3:
            int[] r9 = new int[r9]
            r9 = {4000, 4004, 4002, 4006} // fill-array
            boolean r10 = X.03t.A0P(r9, r8)
            java.lang.String r38 = r0.CHK(r4)
            if (r38 != 0) goto L_0x00c4
            java.lang.String r38 = ""
        L_0x00c4:
            r36 = r6
            r37 = r7
            r39 = r10
            r40 = r1
            r41 = r3
            java.lang.String r26 = r36.A02(r37, r38, r39, r40, r41, r42)
            long r8 = X.C74552Pwl.A00(r0, r4)
            java.lang.String r27 = r6.A01(r8, r3, r1)
            if (r42 != 0) goto L_0x00de
            if (r3 != 0) goto L_0x00e2
        L_0x00de:
            r33 = 0
            if (r1 == 0) goto L_0x017e
        L_0x00e2:
            r33 = 1
            if (r1 == 0) goto L_0x017e
            X.0eM r6 = r6.A04
        L_0x00e8:
            java.lang.String r29 = X.DbS.A0t(r6)
            r6 = r20
            X.Plm r6 = X.C73911Plm.A00(r6, r2)
            X.0t0 r39 = X.AnonymousClass0eN.A01(r6)
            r8 = 0
            r11 = r49
            r34 = r11
            r35 = r21
            r36 = r20
            r37 = r45
            r38 = r0
            r40 = r4
            X.7FE r22 = X.C71136Ode.A02(r34, r35, r36, r37, r38, r39, r40)
            if (r10 == 0) goto L_0x0163
            if (r3 == 0) goto L_0x0170
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
        L_0x010f:
            X.Nm9 r20 = X.C69465Nm9.ONGOING_CALL
            r30 = r19
        L_0x0113:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            boolean r7 = X.AnonymousClass7TF.A1W(r7, r6)
            r3 = r17
            android.graphics.drawable.Drawable r19 = r3.A01(r10, r15, r7, r1)
            java.lang.String r25 = r0.BSF(r4)
            X.2FW r38 = X.2FW.A1i
            r44.A00()
            X.Pju r39 = X.C73795Pju.A00
            r34 = r5
            r36 = r45
            r37 = r0
            r41 = r2
            X.7FT r21 = X.C71136Ode.A00(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.Mds r1 = new X.Mds
            r31 = r2
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.OLP r2 = r13.A03
            X.2FW r17 = X.2FW.A1j
            r10 = r2
            r12 = r8
            r13 = r8
            r14 = r45
            r15 = r44
            r16 = r0
            r18 = r43
            r19 = r4
            X.7Fl r3 = r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.Mdt r2 = new X.Mdt
            r2.<init>(r3, r1)
            java.lang.String r1 = X.C71095OcV.A02(r0, r4)
            X.OTT r0 = new X.OTT
            r0.<init>(r6, r1, r2, r8)
            return r0
        L_0x0163:
            if (r3 == 0) goto L_0x0168
            java.lang.Integer r24 = X.AnonymousClass05K.A0N
            goto L_0x010f
        L_0x0168:
            if (r16 == 0) goto L_0x016d
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            goto L_0x0174
        L_0x016d:
            r24 = 0
            goto L_0x0174
        L_0x0170:
            if (r16 == 0) goto L_0x016d
            java.lang.Integer r24 = X.AnonymousClass05K.A00
        L_0x0174:
            if (r1 == 0) goto L_0x017b
            X.Nm9 r20 = X.C69465Nm9.MISSED_CALL
            r30 = r18
            goto L_0x0113
        L_0x017b:
            X.Nm9 r20 = X.C69465Nm9.END_CALL
            goto L_0x0113
        L_0x017e:
            X.0eM r6 = r6.A09
            goto L_0x00e8
        L_0x0182:
            r16 = 0
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r3 = 1
            if (r7 == r10) goto L_0x00b1
            goto L_0x00a0
        L_0x018b:
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC6.AWh(android.content.Context, X.JwM, X.Pwa, com.instagram.direct.model.messaginguser.MessagingUser, X.OMF, X.Pwl, java.util.Map, java.util.Set, int, boolean):X.OTT");
    }

    public PC6(Context context, UserSession userSession, AnonymousClass9HC r12, AnonymousClass7L2 r13) {
        this.A05 = context;
        this.A02 = r13;
        this.A00 = userSession;
        this.A01 = r12;
        this.A03 = C70095NxB.A00(context, userSession, r12, r13);
    }
}
