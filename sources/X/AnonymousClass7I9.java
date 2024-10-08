package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.List;

/* renamed from: X.7I9  reason: invalid class name */
public final class AnonymousClass7I9 implements AnonymousClass7IA {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C329067Hl A01;

    public AnonymousClass7I9(UserSession userSession, C329067Hl r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1.CVE() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CbZ(int r7) {
        /*
            r6 = this;
            X.7Hl r5 = r6.A01
            X.0eK r0 = r5.A22
            java.lang.Object r1 = r0.get()
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            r3 = 1
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.CVE()
            r2 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.instagram.common.session.UserSession r4 = r5.A1Z
            if (r1 == 0) goto L_0x0070
            int r0 = r1.C6a()
        L_0x001d:
            boolean r0 = X.AnonymousClass7LY.A01(r4, r0)
            if (r0 == 0) goto L_0x0072
            X.3t2 r1 = r5.A1z
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1 instanceof X.AnonymousClass9HR
            if (r0 != 0) goto L_0x0072
            X.2Er r0 = r5.A0W
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.CVr()
            if (r0 != 0) goto L_0x0072
        L_0x0037:
            if (r2 != 0) goto L_0x0072
            X.0eK r2 = r5.A23
            java.lang.Object r1 = r2.get()
            X.7Kc r1 = (X.C329757Kc) r1
            com.instagram.model.direct.DirectThreadKey r0 = X.C329067Hl.A09(r5)
            boolean r0 = r1.CcQ(r4, r0, r7)
            if (r0 == 0) goto L_0x0072
            boolean r0 = X.C329067Hl.A0u(r5)
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r2.get()
            X.7Kc r1 = (X.C329757Kc) r1
            com.instagram.model.direct.DirectThreadKey r0 = X.C329067Hl.A09(r5)
            boolean r0 = r1.CX4(r4, r0)
            if (r0 == 0) goto L_0x0072
            if (r7 <= r3) goto L_0x0072
            com.instagram.model.direct.DirectThreadKey r1 = X.C329067Hl.A09(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            boolean r0 = X.AnonymousClass796.A07(r4, r1, r0)
            if (r0 == 0) goto L_0x0072
        L_0x006f:
            return r3
        L_0x0070:
            r0 = 0
            goto L_0x001d
        L_0x0072:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7I9.CbZ(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DX3(X.C53401GnY r37, X.C381779cJ r38, X.AnonymousClass3Q2 r39, X.C352218Cl r40, java.lang.Long r41, int r42, boolean r43) {
        /*
            r36 = this;
            r0 = r36
            X.7Hl r2 = r0.A01
            X.7Kg r1 = r2.A0c
            r7 = 0
            if (r1 == 0) goto L_0x00e0
            X.OHv r0 = r1.A09
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x00e0
            X.OHv r1 = r1.A09
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x00e0
            X.OBo r0 = r1.A02
            X.3tI r6 = r0.A01
        L_0x001d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = r42
            java.lang.String r1 = X.C329067Hl.A0B(r6, r2, r0, r1)
            r8 = r37
            r0 = r41
            java.lang.String r4 = X.C329067Hl.A0A(r8, r2, r0, r1)
            if (r4 == 0) goto L_0x0037
            com.instagram.common.session.UserSession r3 = r2.A1Z
            X.HNL r0 = X.HNL.THREADVIEW_USER_INPUT_PROMPT
            java.lang.String r7 = X.C70892OQk.A01(r0, r3, r7, r4)
        L_0x0037:
            r15 = r38
            r20 = r40
            if (r38 == 0) goto L_0x00a2
            java.lang.String r3 = r15.A06
            java.lang.String r0 = "permanent"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00a2
            X.7II r4 = r2.A1p
            X.7Sa r0 = r2.A1i
            com.instagram.model.direct.DirectShareTarget r3 = r0.A00()
            r3.getClass()
            r33 = 0
            X.0eM r0 = r4.A02
            java.lang.Object r5 = r0.getValue()
            X.8KO r5 = (X.AnonymousClass8KO) r5
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            r6 = 0
            X.LD4 r13 = new X.LD4
            r13.<init>(r3, r6, r0)
            X.0eM r0 = r4.A03
            java.lang.Object r10 = r0.getValue()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r10 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r10
            X.28D r0 = X.28D.A2T
            java.lang.String r27 = r0.toString()
            java.lang.String r23 = "post_capture"
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r21 = r6
            r22 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r28 = r6
            r29 = r1
            r30 = r6
            r31 = r6
            r32 = r6
            r34 = r33
            r35 = r33
            r5.A04(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x009d:
            r0 = 1
            X.C329067Hl.A0j(r2, r0)
            return
        L_0x00a2:
            X.7Sa r0 = r2.A1i
            X.9H7 r4 = r0.A00
            com.instagram.common.session.UserSession r5 = r4.A10
            r13 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
            X.3t2 r3 = r4.A1S
            X.4DU r0 = r4.A1Q
            r14 = r43
            r9 = r0
            r10 = r5
            r11 = r3
            X.C3265677h.A0N(r9, r10, r11, r12, r13, r14)
            X.7TI r0 = X.AnonymousClass9H7.A01(r4)
            X.7L9 r4 = r0.A0K()
            if (r43 == 0) goto L_0x00dd
            java.lang.String r17 = "direct_drag_and_drop"
        L_0x00c5:
            X.Pmw r3 = new X.Pmw
            r14 = r39
            r15 = r20
            r9 = r3
            r10 = r8
            r11 = r5
            r12 = r4
            r13 = r6
            r16 = r1
            r18 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = "sendPhoto"
            X.AnonymousClass7L9.A00(r4, r0, r3)
            goto L_0x009d
        L_0x00dd:
            r17 = 0
            goto L_0x00c5
        L_0x00e0:
            r6 = r7
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7I9.DX3(X.GnY, X.9cJ, X.3Q2, X.8Cl, java.lang.Long, int, boolean):void");
    }

    public final void Dj8(MessageIdentifier messageIdentifier, List list) {
        AnonymousClass9H7 r1 = this.A01.A1i.A00;
        AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r1).A0K();
        Context context = r1.A02;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7L9.A00(A0K, "sendMediaForSharedAlbum", new C58769IxG(38, messageIdentifier, A0K, list, context));
        new OMC(this.A00).A01("direct_thread");
    }

    public final void DjA(C53401GnY gnY, Long l, List list) {
        C329067Hl r3 = this.A01;
        List list2 = list;
        String str = null;
        String A0B = C329067Hl.A0B((C254933tI) null, r3, AnonymousClass05K.A15, list.size());
        C53401GnY gnY2 = gnY;
        String A0A = C329067Hl.A0A(gnY, r3, l, A0B);
        if (A0A != null) {
            str = C70892OQk.A01(HNL.THREADVIEW_USER_INPUT_PROMPT, r3.A1Z, (String) null, A0A);
        }
        AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r3.A1i.A00).A0K();
        AnonymousClass7L9.A00(A0K, "sendMultiMedia", new C73964Pmi(A0K, list2, gnY2, A0B, str, 2));
    }

    public final void Dxz(C53401GnY gnY, C381779cJ r36, ClipInfo clipInfo, Long l, String str, int i, boolean z) {
        C254933tI r5;
        String str2;
        int i2;
        C329067Hl r0 = this.A01;
        C329797Kg r2 = r0.A0c;
        String str3 = null;
        if (r2 == null || r2.A09 == null || !r2.A02()) {
            r5 = null;
        } else {
            r5 = r2.A09.A02.A01;
        }
        String A0B = C329067Hl.A0B(r5, r0, AnonymousClass05K.A0N, i);
        C53401GnY gnY2 = gnY;
        String A0A = C329067Hl.A0A(gnY2, r0, l, A0B);
        if (A0A != null) {
            str3 = C70892OQk.A01(HNL.THREADVIEW_USER_INPUT_PROMPT, r0.A1Z, (String) null, A0A);
        }
        C381779cJ r15 = r36;
        ClipInfo clipInfo2 = clipInfo;
        if (r36 == null || "permanent".equals(r15.A06)) {
            C331697Sa r3 = r0.A1i;
            0qQ.A0B(clipInfo2, 0);
            AnonymousClass9H7 r8 = r3.A00;
            C3265677h.A0N(r8.A1Q, r8.A10, r8.A1S, (Boolean) null, false, z);
            if (AnonymousClass9H7.A01(r8).A0X(A0B, "DirectThreadFragment.sendVideoMessage")) {
                AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r8).A0K();
                if (z) {
                    str2 = "direct_drag_and_drop";
                } else {
                    str2 = null;
                }
                AnonymousClass7L9.A00(A0K, "sendVideo", new C73974Pms(gnY2, A0K, r5, clipInfo2, A0B, str, str2, str3));
            }
        } else {
            AnonymousClass7II r7 = r0.A1p;
            DirectShareTarget A002 = r0.A1i.A00();
            A002.getClass();
            0qQ.A0B(clipInfo2, 0);
            int i3 = clipInfo2.A09;
            int i4 = clipInfo2.A06;
            Integer num = clipInfo2.A0C;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            String str4 = clipInfo2.A0F;
            if (str4 != null) {
                ((AnonymousClass8L3) r7.A04.getValue()).A02((C53401GnY) null, (1GK) null, (1GK) null, (C366688pV) null, new LD4(A002, (UserStoryTarget) null, ShareType.DIRECT_STORY_SHARE), (C381539bv) null, r15, (A6R) null, (L8M) null, (AnonymousClass8VT) null, new C349307zv(new File(str4), (Integer) null, (String) null, i3, i4, i2, 0, 0, false, true, false), (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A0B, (String) null, (List) null, (List) null, false, false);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C329067Hl.A0j(r0, true);
    }
}
