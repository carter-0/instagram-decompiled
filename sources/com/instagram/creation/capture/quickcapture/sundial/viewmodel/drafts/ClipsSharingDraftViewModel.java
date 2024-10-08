package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.2YL;
import X.AnonymousClass2Fj;
import X.AnonymousClass2gB;
import X.AnonymousClass7TE;
import X.AnonymousClass8Y4;
import X.C293505kq;
import X.C319836rJ;
import X.C357458Xy;
import X.C361278fx;
import X.C59765JXe;
import X.C63818L7z;
import X.C66312MMv;
import X.JTO;
import X.K66;
import X.LC1;
import X.LO6;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

public final class ClipsSharingDraftViewModel extends 2YL {
    public final AnonymousClass2gB A00;
    public final AnonymousClass2Fj A01 = JTO.A0K();
    public final AnonymousClass2Fj A02 = JTO.A0K();
    public final AnonymousClass2Fj A03 = JTO.A0K();
    public final UserSession A04;
    public final LC1 A05;
    public final C63818L7z A06;
    public final ClipsDraftRepository A07;
    public final LO6 A08;
    public final String A09;
    public final boolean A0A;
    public final C319836rJ A0B;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r7, boolean r8) {
        /*
            r6 = this;
            r3 = 5
            boolean r0 = X.C66140MDs.A01(r3, r7)
            if (r0 == 0) goto L_0x0059
            r5 = r7
            X.MDs r5 = (X.C66140MDs) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0059
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r2) goto L_0x005f
            boolean r8 = r5.A05
            java.lang.Object r1 = r5.A02
            X.5kq r1 = (X.C293505kq) r1
            java.lang.Object r0 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r0
            X.0eS.A00(r4)
        L_0x002d:
            if (r8 != 0) goto L_0x0037
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r0.A07
            X.50r r1 = r1.A0H
            r0 = 0
            r2.A0P(r1, r0)
        L_0x0037:
            X.0gF r3 = X.C60340gF.A00
        L_0x0039:
            return r3
        L_0x003a:
            X.0eS.A00(r4)
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x0037
            X.5kq r1 = r6.A03()
            X.LC1 r0 = r6.A05
            r5.A01 = r6
            r5.A02 = r1
            r5.A05 = r8
            r5.A00 = r2
            java.lang.Object r0 = r0.A00(r1, r5)
            if (r0 == r3) goto L_0x0039
            r0 = r6
            goto L_0x002d
        L_0x0059:
            X.MDs r5 = new X.MDs
            r5.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A05(X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        if (r0.A0i != null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClipsSharingDraftViewModel(X.C319836rJ r12, com.instagram.common.session.UserSession r13, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r14, X.LO6 r15, java.lang.String r16, boolean r17) {
        /*
            r11 = this;
            r0 = r16
            X.C51974G9v.A1M(r14, r0, r13)
            r11.<init>()
            r11.A0B = r12
            r11.A07 = r14
            r11.A09 = r0
            r11.A04 = r13
            r11.A08 = r15
            r0 = r17
            r11.A0A = r0
            X.2Fj r0 = X.JTO.A0K()
            r11.A01 = r0
            X.2Fj r0 = X.JTO.A0K()
            r11.A03 = r0
            X.2Fj r0 = X.JTO.A0K()
            r11.A02 = r0
            X.2gB r1 = new X.2gB
            r1.<init>()
            r11.A00 = r1
            X.LC1 r0 = new X.LC1
            r0.<init>(r11)
            r11.A05 = r0
            java.lang.String r3 = "draft_session_handle_key"
            java.lang.Object r2 = r12.A00(r3)
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            if (r2 == 0) goto L_0x0057
            java.lang.String r0 = "key_serialized_draft"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x0057
            X.16F r0 = X.16P.A00(r0)
            X.5kq r2 = X.C63179Ksm.parseFromJson(r0)
            if (r2 == 0) goto L_0x0057
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r11.A07
            r0.A0O(r2)
        L_0x0057:
            X.LaG r2 = new X.LaG
            r2.<init>(r11)
            java.util.Map r0 = r12.A04
            r0.put(r3, r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r5 = r11.A07
            X.2Fj r3 = r5.A02
            java.lang.Object r4 = r3.A02()
            X.8fx r4 = (X.C361278fx) r4
            if (r4 == 0) goto L_0x00ca
            int r2 = r4.A00
            r0 = 3
            if (r2 != r0) goto L_0x00ca
            java.lang.Object r0 = r4.A00()
            X.5kq r0 = (X.C293505kq) r0
            if (r0 == 0) goto L_0x00c8
            java.lang.String r2 = r0.A0T
        L_0x007c:
            java.lang.String r0 = r11.A09
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r4.A00()
            X.5kq r0 = (X.C293505kq) r0
            if (r0 == 0) goto L_0x00ca
            java.util.List r0 = r0.A0v
            if (r0 == 0) goto L_0x00ca
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r4.A00()
            X.5kq r0 = (X.C293505kq) r0
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = r0.A0i
            if (r0 == 0) goto L_0x00ca
        L_0x00a2:
            X.2Fj r4 = r14.A02
            r0 = 46
            X.MId r3 = X.JTO.A1C(r11, r0)
            r2 = 4
            X.LZt r0 = new X.LZt
            r0.<init>(r2, r3)
            r1.A0E(r4, r0)
            r0 = 44
            X.MP5 r2 = X.MP5.A00(r11, r0)
            r0 = 43
            X.MMR r1 = new X.MMR
            r1.<init>(r11, r0)
            X.L7z r0 = new X.L7z
            r0.<init>(r13, r14, r1, r2)
            r11.A06 = r0
            return
        L_0x00c8:
            r2 = 0
            goto L_0x007c
        L_0x00ca:
            java.lang.String r7 = r11.A09
            X.2Fj r0 = r11.A03
            X.JTS.A12(r0)
            X.6oS r2 = X.C318116oQ.A00(r11)
            X.LO6 r6 = r11.A08
            r0 = 44
            X.MMR r9 = new X.MMR
            r9.<init>(r11, r0)
            r0 = 46
            X.MP5 r10 = X.MP5.A00(r11, r0)
            r0 = 2
            X.0qQ.A0B(r6, r0)
            X.8g4 r0 = X.C361338g4.A00
            r3.A0B(r0)
            r8 = 0
            r5.A01 = r8
            X.12T r0 = X.AnonymousClass12T.A00
            X.0nV r0 = X.DbX.A0c(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1 r4 = new com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.1Eo.A05(r0, r4, r2)
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.<init>(X.6rJ, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.LO6, java.lang.String, boolean):void");
    }

    public static final void A01(ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        if (clipsSharingDraftViewModel.A04.A00(C357458Xy.class) == null) {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final C293505kq A03() {
        C293505kq r0;
        C361278fx r02 = (C361278fx) this.A07.A02.A02();
        if (r02 != null && (r0 = (C293505kq) r02.A01) != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.B1S, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r10) {
        /*
            r9 = this;
            r3 = 43
            boolean r0 = X.C66146MDy.A02(r3, r10)
            if (r0 == 0) goto L_0x007c
            r5 = r10
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.1Hj r8 = X.1Hj.A02
            int r1 = r5.A00
            r6 = 3
            r7 = 2
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r0) goto L_0x0048
            if (r1 == r7) goto L_0x005e
            if (r1 != r6) goto L_0x0082
            X.0eS.A00(r2)
        L_0x002b:
            X.0gF r8 = X.C60340gF.A00
        L_0x002d:
            return r8
        L_0x002e:
            X.0eS.A00(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r9.A07
            A01(r9)
            X.LnX r1 = new X.LnX
            r1.<init>()
            r5.A01 = r9
            r5.A00 = r0
            r0 = 0
            java.lang.Object r0 = r2.A0G(r1, r5, r0)
            if (r0 == r8) goto L_0x002d
            r1 = r9
            goto L_0x004f
        L_0x0048:
            java.lang.Object r1 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.0eS.A00(r2)
        L_0x004f:
            X.5kq r3 = r1.A03()
            X.C66146MDy.A00(r1, r3, r5, r7)
            r0 = 0
            java.lang.Object r0 = r1.A05(r5, r0)
            if (r0 != r8) goto L_0x0069
            return r8
        L_0x005e:
            java.lang.Object r3 = r5.A02
            X.5kq r3 = (X.C293505kq) r3
            java.lang.Object r1 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.0eS.A00(r2)
        L_0x0069:
            X.2gB r2 = r1.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = r1.A07
            X.2Fj r0 = r1.A02
            r2.A0D(r0)
            r5.A01 = r4
            r5.A02 = r4
            r5.A00 = r6
            r1.A0J(r3, r5)
            goto L_0x002b
        L_0x007c:
            X.MDy r5 = new X.MDy
            r5.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A04(X.4D7):java.lang.Object");
    }

    public final void A06(C59765JXe jXe) {
        Object obj;
        C66312MMv mMv = new C66312MMv(47, jXe, this);
        C361278fx r0 = (C361278fx) this.A07.A02.A02();
        if (r0 != null && (obj = r0.A01) != null) {
            mMv.invoke(obj);
        }
    }

    public final boolean A07() {
        C361278fx r1 = (C361278fx) this.A07.A02.A02();
        if (!(r1 instanceof AnonymousClass8Y4)) {
            return false;
        }
        r1.A00();
        return true;
    }

    public static C293505kq A00(K66 k66) {
        return K66.A01(k66).A03();
    }

    public static boolean A02(K66 k66) {
        return K66.A01(k66).A07();
    }
}
