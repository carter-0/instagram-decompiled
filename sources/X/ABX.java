package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class ABX {
    public static final MediaComposition A00(ImmutableList immutableList, UserSession userSession, AudioOverlayTrack audioOverlayTrack, ArrayList arrayList, float f) {
        DownloadedTrack downloadedTrack;
        ImmutableList immutableList2 = immutableList;
        0qQ.A0B(userSession, 0);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0r.add(AnonymousClass51Q.A03((AnonymousClass51N) it.next()));
        }
        builder.addAll(A0r);
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        if (!(audioOverlayTrack == null || (downloadedTrack = audioOverlayTrack2.A06) == null)) {
            builder2.add(new C39799A9u((MediaEffect) null, (Float) null, downloadedTrack.A02, (String) null, 1.0f, 1.0f, downloadedTrack.A00(audioOverlayTrack2.A03), -1, 0));
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        ImmutableList build2 = builder2.build();
        0qQ.A07(build2);
        if (immutableList2 == null) {
            immutableList2 = ImmutableList.of();
            0qQ.A07(immutableList2);
        }
        0sn r7 = 0sn.A00;
        0qQ.A0B(r7, 5);
        C66328MNl mNl = C66328MNl.A00;
        0qQ.A0B(mNl, 2);
        return new MediaComposition(AHK.A00((C365998o1) null, (C366518pA) null, build2, build, immutableList2, (C357608Yw) null, r7, r7, mNl, f, 0.5625f, 0, true, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if ((r9 + r3) > r11) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(com.instagram.api.schemas.ACRType r37, java.lang.String r38, java.util.ArrayList r39, java.util.ArrayList r40, int r41, boolean r42) {
        /*
            r28 = 0
            r1 = 10
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0p(r39)
            java.util.Iterator r14 = r39.iterator()
            r8 = 0
        L_0x000d:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x012a
            java.lang.Object r6 = r14.next()
            int r13 = r8 + 1
            if (r8 >= 0) goto L_0x0023
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            com.instagram.common.gallery.Medium r6 = (com.instagram.common.gallery.Medium) r6
            boolean r2 = r6.A05()
            r4 = 0
            r7 = r37
            r5 = r38
            r10 = r40
            if (r2 != 0) goto L_0x00c7
            int r11 = r6.A03
            if (r11 <= 0) goto L_0x00c7
            if (r42 == 0) goto L_0x0044
            int r3 = r6.A09
            if (r3 <= 0) goto L_0x0044
            if (r3 > r11) goto L_0x0044
            int r9 = r6.A0A
            int r2 = r9 + r3
            if (r2 <= r11) goto L_0x0046
        L_0x0044:
            r9 = 0
            r3 = r11
        L_0x0046:
            int r23 = r9 + r3
            java.lang.Object r2 = X.00k.A0O(r10, r8)
            X.HsQ r2 = (X.C56077HsQ) r2
            if (r2 == 0) goto L_0x00c5
            int r3 = r2.A01
        L_0x0052:
            java.lang.Object r2 = X.00k.A0O(r10, r8)
            X.HsQ r2 = (X.C56077HsQ) r2
            if (r2 == 0) goto L_0x00c3
            int r2 = r2.A01
        L_0x005c:
            int r12 = r6.A0B
            int r11 = r6.A04
            int r10 = r6.A07
            X.7zv r8 = new X.7zv
            r8.<init>(r6, r12, r11, r10)
            int r10 = r6.A03
            r17 = 0
            java.lang.String r19 = r8.A06()
            int r24 = r23 - r9
            r20 = r41
            r21 = r10
            r22 = r9
            r18 = r8
            X.51R r19 = X.C39821AAs.A01(r18, r19, r20, r21, r22, r23, r24)
            r25 = 0
            java.lang.String r8 = r6.A0Y
            if (r8 == 0) goto L_0x0087
            java.lang.Long r4 = X.00y.A0n(r1, r8)
        L_0x0087:
            int r10 = r6.A05
            long r8 = (long) r10
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            X.GnY r6 = new X.GnY
            r6.<init>((com.instagram.api.schemas.ACRType) r7, (java.lang.Long) r4, (java.lang.Long) r8, (java.lang.String) r5)
            java.lang.String r24 = java.lang.String.valueOf(r10)
            r32 = 805265382(0x2fff5fe6, float:4.645237E-10)
            X.51M r15 = new X.51M
            r18 = r17
            r20 = r17
            r21 = r17
            r22 = r17
            r23 = r17
            r26 = r3
            r27 = r2
            r29 = r28
            r30 = r28
            r31 = r28
            r33 = r28
            r34 = r28
            r35 = r28
            r36 = r28
            r16 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x00bd:
            r0.add(r15)
            r8 = r13
            goto L_0x000d
        L_0x00c3:
            r2 = 0
            goto L_0x005c
        L_0x00c5:
            r3 = 0
            goto L_0x0052
        L_0x00c7:
            java.lang.Object r2 = X.00k.A0O(r10, r8)
            X.HsQ r2 = (X.C56077HsQ) r2
            if (r2 == 0) goto L_0x0128
            int r3 = r2.A01
        L_0x00d1:
            java.lang.Object r2 = X.00k.A0O(r10, r8)
            X.HsQ r2 = (X.C56077HsQ) r2
            if (r2 == 0) goto L_0x0125
            int r9 = r2.A00
        L_0x00db:
            java.lang.String r2 = r6.A0X
            java.io.File r2 = X.AnonymousClass7TE.A0t(r2)
            java.lang.String r19 = r2.getAbsolutePath()
            X.0qQ.A07(r19)
            int r9 = r9 - r3
            int r11 = r6.A0B
            int r10 = r6.A04
            int r8 = r6.A07
            java.lang.String r2 = r6.A0Y
            if (r2 == 0) goto L_0x00f7
            java.lang.Long r4 = X.00y.A0n(r1, r2)
        L_0x00f7:
            int r6 = r6.A05
            long r2 = (long) r6
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            r16 = 0
            X.GnY r2 = new X.GnY
            r2.<init>((com.instagram.api.schemas.ACRType) r7, (java.lang.Long) r4, (java.lang.Long) r3, (java.lang.String) r5)
            java.lang.String r20 = java.lang.String.valueOf(r6)
            X.KN4 r15 = new X.KN4
            r18 = r16
            r21 = r16
            r22 = r9
            r23 = r11
            r24 = r10
            r25 = r8
            r26 = r28
            r27 = r28
            r29 = r28
            r30 = r28
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x00bd
        L_0x0125:
            int r9 = r6.A03
            goto L_0x00db
        L_0x0128:
            r3 = 0
            goto L_0x00d1
        L_0x012a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABX.A01(com.instagram.api.schemas.ACRType, java.lang.String, java.util.ArrayList, java.util.ArrayList, int, boolean):java.util.List");
    }
}
