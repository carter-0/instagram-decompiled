package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.LmQ  reason: case insensitive filesystem */
public final class C65046LmQ implements MTY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ LD4 A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ C381779cJ A05;
    public final /* synthetic */ A6R A06;
    public final /* synthetic */ AnonymousClass3Q2 A07;
    public final /* synthetic */ 1ua A08;
    public final /* synthetic */ C352218Cl A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public C65046LmQ(Context context, C53401GnY gnY, UserSession userSession, LD4 ld4, DirectShareTarget directShareTarget, C381779cJ r6, A6R a6r, AnonymousClass3Q2 r8, 1ua r9, C352218Cl r10, String str, String str2, boolean z) {
        this.A02 = userSession;
        this.A07 = r8;
        this.A0C = z;
        this.A0B = str;
        this.A03 = ld4;
        this.A05 = r6;
        this.A06 = a6r;
        this.A01 = gnY;
        this.A04 = directShareTarget;
        this.A00 = context;
        this.A09 = r10;
        this.A08 = r9;
        this.A0A = str2;
    }

    public final void Dvm() {
        C59797JYq.A07(this.A00, this.A02, this.A07, "photo_prepare_failed_for_send");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
        if (r1.A07 == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dvn(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r23
            X.L6I r0 = (X.L6I) r0
            r7 = r22
            com.instagram.common.session.UserSession r5 = r7.A02
            X.3Q2 r4 = r7.A07
            X.LEA r2 = r0.A02
            X.C59797JYq.A0D(r5, r2, r4)
            r8 = 0
            X.0qQ.A0B(r4, r8)
            r10 = 0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r9 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r1 = r0.A01
            int r0 = r0.A00
            r4.A0H = r1
            r4.A0G = r0
            X.C59797JYq.A0F(r5, r4, r1, r0)
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0090
            java.lang.String r6 = r7.A0B
            boolean r0 = X.C59797JYq.A0I(r5, r6)
            if (r0 == 0) goto L_0x0061
            X.1pL r11 = X.C66551pM.A00()
            X.LD4 r6 = r7.A03
            java.lang.String r3 = r2.A08
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r4.A13
            X.9cJ r1 = r7.A05
            X.A6R r0 = r7.A06
            X.GnY r12 = r7.A01
            r13 = r2
            r14 = r5
            r16 = r6
            r17 = r1
            r18 = r0
            r19 = r4
            r20 = r3
            r11.EMG(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0061:
            com.instagram.model.direct.DirectShareTarget r3 = r7.A04
            r3.getClass()
            X.7Z7 r11 = X.JTS.A0O(r5, r3)
            android.content.Context r12 = r7.A00
            X.8Cl r2 = r7.A09
            X.9cJ r1 = r7.A05
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.A07
            r20 = 1
            if (r0 != 0) goto L_0x008d
        L_0x0078:
            r20 = 0
            if (r1 != 0) goto L_0x008d
            r0 = 0
        L_0x007d:
            X.3tI r13 = X.C59797JYq.A00(r5, r1)
            r14 = r3
            r15 = r4
            r16 = r2
            r18 = r6
            r19 = r0
            r11.EMI(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x008d:
            java.lang.String r0 = r1.A00
            goto L_0x007d
        L_0x0090:
            boolean r0 = r4.A5w
            if (r0 != 0) goto L_0x00bd
            com.instagram.model.direct.DirectShareTarget r6 = r7.A04
            boolean r0 = X.C59797JYq.A0G(r5, r6)
            if (r0 == 0) goto L_0x00bd
            r6.getClass()
            X.1ua r3 = r7.A08
            r3.A0E(r4)
            X.LD4 r2 = r7.A03
            X.9cJ r1 = r7.A05
            java.lang.String r0 = r7.A0A
            X.GnY r11 = r7.A01
            r12 = r5
            r13 = r2
            r14 = r1
            r15 = r4
            r16 = r0
            X.C59797JYq.A0A(r11, r12, r13, r14, r15, r16, r17)
            com.instagram.model.direct.DirectThreadKey r0 = r6.A00()
            X.C64008LIv.A00(r5, r0, r4, r3)
            return
        L_0x00bd:
            X.1ua r0 = r7.A08
            r0.A0B(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65046LmQ.Dvn(java.lang.Object):void");
    }
}
