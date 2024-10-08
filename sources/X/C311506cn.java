package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.6cn  reason: invalid class name and case insensitive filesystem */
public final class C311506cn {
    public final UserSession A00;
    public final C310016aI A01;
    public final C273384mU A02;
    public final C270414gh A03;

    public C311506cn(UserSession userSession, C310016aI r3, C273384mU r4, C270414gh r5) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r3, 3);
        this.A00 = userSession;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        if (r6.A00() != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C255773uh r22, X.C250973mM r23, X.LOD r24, java.lang.String r25, boolean r26) {
        /*
            r21 = this;
            r14 = 1
            r6 = r24
            java.lang.String r13 = r6.A04
            int r0 = r13.length()
            r7 = r21
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r6.A01
            if (r0 != 0) goto L_0x0017
        L_0x0011:
            X.4mU r0 = r7.A02
            r0.CLU()
            return
        L_0x0017:
            r8 = r22
            com.instagram.user.model.User r4 = r8.A0i
            r3 = r4
            r10 = r23
            if (r4 != 0) goto L_0x0026
            com.instagram.model.reels.Reel r0 = r10.A0H
            com.instagram.user.model.User r3 = r0.A0D()
        L_0x0026:
            if (r3 != 0) goto L_0x0032
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "ReelMessageHelper"
            java.lang.String r0 = "Message failed to send.  Potential cause: no valid recipient found in ReelItem or ReelViewModel object."
            r2.Ew0(r1, r0)
            goto L_0x0011
        L_0x0032:
            X.6aI r15 = r7.A01
            X.4gh r1 = r7.A03
            com.instagram.common.session.UserSession r2 = r7.A00
            X.3uh r0 = r10.A08(r2)
            X.6Yf r0 = r1.Bz3(r0)
            float r5 = r0.A0B
            X.3uh r0 = r10.A08(r2)
            X.6Yf r0 = r1.Bz3(r0)
            float r1 = r0.A0A
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x00bb
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0060
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00bb
        L_0x0060:
            r19 = 1
        L_0x0062:
            boolean r20 = r6.A00()
            r16 = r10
            r17 = r5
            r18 = r1
            r15.A0D(r16, r17, r18, r19, r20)
            r1 = 766842320(0x2db515d0, float:2.0587004E-11)
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x007a
            java.lang.String r0 = r4.getId()
        L_0x007a:
            X.AnonymousClass59S.A01(r2, r0, r1)
            r0 = r26
            com.instagram.model.direct.DirectShareTarget r5 = X.AnonymousClass6UD.A00(r3, r0)
            X.3t2 r0 = r5.A09
            r0.getClass()
            boolean r0 = r0 instanceof X.C254773t1
            if (r0 == 0) goto L_0x00c4
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x00c4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r3)
            java.util.List r9 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r9)
            java.lang.String r11 = r0.A0C
            X.7VU r1 = X.AnonymousClass7VT.A00(r2)
            X.5gg r0 = new X.5gg
            r0.<init>(r9)
            X.Pmz r5 = new X.Pmz
            r12 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A02(r0, r9, r5, r14)
            return
        L_0x00bb:
            boolean r0 = r6.A00()
            r19 = 0
            if (r0 == 0) goto L_0x0062
            goto L_0x0060
        L_0x00c4:
            r0 = r5
            r1 = r8
            r2 = r10
            r3 = r6
            r4 = r7
            r5 = r13
            A00(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311506cn.A01(X.3uh, X.3mM, X.LOD, java.lang.String, boolean):void");
    }

    public static final void A00(DirectShareTarget directShareTarget, C255773uh r15, C250973mM r16, LOD lod, C311506cn r18, String str) {
        1Xj r7;
        ExtendedImageUrl extendedImageUrl;
        String str2;
        User user = r15.A0i;
        C250973mM r2 = r16;
        if (user == null) {
            user = r2.A0H.A0D();
        }
        1as r4 = 1as.A04;
        0qQ.A07(r4);
        C311506cn r3 = r18;
        if (user == null || (r7 = r15.A0b) == null) {
            0wb.A01.Ew0("ReelMessageHelper", "Message failed to send.  Potential cause: no valid recipient found in ReelItem or ReelViewModel object.");
        } else {
            String id = user.getId();
            String str3 = r15.A0k;
            0qQ.A07(str3);
            C68165N3f n3f = new C68165N3f(r7, directShareTarget, id, str3, str, "reel", r2.A0B);
            LOD lod2 = lod;
            String str4 = lod2.A05;
            if (str4 != null && str4.length() != 0 && ((str2 = lod2.A01) == null || str2.length() == 0)) {
                n3f.A0D = str4;
            } else if (lod2.A00()) {
                ExtendedImageUrl extendedImageUrl2 = lod2.A00;
                if (extendedImageUrl2 == null) {
                    extendedImageUrl = null;
                } else {
                    extendedImageUrl = new ExtendedImageUrl(extendedImageUrl2);
                }
                n3f.A05 = lod2.A01;
                n3f.A07 = lod2.A03;
                n3f.A06 = lod2.A02;
                n3f.A01 = extendedImageUrl;
            }
            if (user.BST() != null) {
                n3f.A04 = user.BST();
            }
            n3f.A02 = Boolean.valueOf(r15.A0Q);
            r4.A0D(r3.A00, n3f.A00(), "reel", "");
        }
        r3.A02.CLU();
    }
}
