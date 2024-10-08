package com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching;

import X.0qQ;
import X.ABX;
import X.AnonymousClass7TE;
import X.I5p;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class ClipsMediaStitchingHelper {
    public static final ClipsMediaStitchingHelper A00 = new Object();

    /* JADX WARNING: type inference failed for: r21v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.api.schemas.ACRType r16, com.instagram.common.session.UserSession r17, com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper r18, com.instagram.music.common.model.AudioOverlayTrack r19, java.lang.String r20, java.util.List r21, java.util.List r22, java.util.List r23, X.AnonymousClass4D7 r24) {
        /*
            r13 = r17
            r8 = r21
            r14 = r19
            r15 = r20
            r12 = r16
            r3 = r22
            r4 = r23
            r5 = 6
            r6 = r24
            boolean r0 = X.JUK.A02(r5, r6)
            r10 = r18
            if (r0 == 0) goto L_0x0103
            r7 = r6
            X.JUK r7 = (X.JUK) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0103
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0027:
            java.lang.Object r1 = r7.A09
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x00b2
            if (r0 != r5) goto L_0x0170
            java.lang.Object r4 = r7.A08
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r7.A07
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r12 = r7.A06
            com.instagram.api.schemas.ACRType r12 = (com.instagram.api.schemas.ACRType) r12
            java.lang.Object r15 = r7.A05
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r7.A04
            com.instagram.music.common.model.AudioOverlayTrack r14 = (com.instagram.music.common.model.AudioOverlayTrack) r14
            java.lang.Object r8 = r7.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r13 = r7.A02
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13
            X.0eS.A00(r1)
        L_0x0051:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0147
            java.lang.Object r5 = X.C51972G9s.A0m(r1)
            X.0qQ.A07(r5)
            X.GlK r5 = (X.C53272GlK) r5
            int r9 = r5.A00
            int r7 = r14.A02
            int r7 = r7 + r9
            r0 = 15000(0x3a98, float:2.102E-41)
            int r0 = r0 + r9
            if (r7 <= r0) goto L_0x006b
            r7 = r0
        L_0x006b:
            r14.A03 = r9
            java.util.List r2 = r5.A02
            if (r2 == 0) goto L_0x010a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x010a
            int r1 = r2.size()
            int r0 = r3.size()
            if (r1 != r0) goto L_0x010a
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x008d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r3.next()
            X.DSO r0 = (X.DSO) r0
            int r2 = r0.Bys()
            int r1 = r0.B1h()
            X.HsQ r0 = new X.HsQ
            r0.<init>(r2, r1)
            boolean r0 = r5.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.add(r0)
            goto L_0x008d
        L_0x00b2:
            X.0eS.A00(r1)
            java.lang.String r9 = r14.A0B
            if (r9 == 0) goto L_0x0175
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r0 = 47
            X.Wvq r1 = new X.Wvq
            r1.<init>(r13, r0)
            java.lang.Class<X.Hpb> r0 = X.C55914Hpb.class
            java.lang.Object r2 = r13.A01(r0, r1)
            X.Hpb r2 = (X.C55914Hpb) r2
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 15000(0x3a98, double:7.411E-320)
            long r0 = r11.toSeconds(r0)
            int r11 = (int) r0
            java.lang.String r0 = r14.A0E
            if (r0 == 0) goto L_0x0100
            com.instagram.api.schemas.MusicCanonicalType r18 = com.instagram.api.schemas.MusicCanonicalType.A05
        L_0x00db:
            com.instagram.api.schemas.ClipsTrimmingStrategy r17 = com.instagram.api.schemas.ClipsTrimmingStrategy.TEMPLATE
            r7.A01 = r10
            r7.A02 = r13
            r7.A03 = r8
            r7.A04 = r14
            r7.A05 = r15
            r7.A06 = r12
            r7.A07 = r3
            r7.A08 = r4
            r7.A00 = r5
            r20 = r3
            r21 = r7
            r22 = r11
            r19 = r9
            r16 = r2
            java.lang.Object r1 = r16.A00(r17, r18, r19, r20, r21, r22)
            if (r1 != r6) goto L_0x0051
            return r6
        L_0x0100:
            com.instagram.api.schemas.MusicCanonicalType r18 = com.instagram.api.schemas.MusicCanonicalType.A04
            goto L_0x00db
        L_0x0103:
            X.JUK r7 = new X.JUK
            r7.<init>(r10, r6, r5)
            goto L_0x0027
        L_0x010a:
            java.util.List r1 = r5.A03
            if (r1 == 0) goto L_0x0150
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0150
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x011c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r11.next()
            X.Gld r0 = (X.C53291Gld) r0
            int r6 = r0.A00
            boolean r5 = r0.A03
            boolean r3 = r0.A01
            boolean r2 = r0.A02
            boolean r1 = r0.A04
            com.instagram.music.common.model.MusicAssetBeatInfo r0 = new com.instagram.music.common.model.MusicAssetBeatInfo
            r20 = r2
            r21 = r1
            r17 = r5
            r18 = r6
            r19 = r3
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r10.add(r0)
            goto L_0x011c
        L_0x0147:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0150
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0150:
            int r18 = r8.size()
            r0 = 15000(0x3a98, float:2.102E-41)
            java.util.List r16 = X.C18185Vmz.A01(r4, r0)
            r14 = 0
            r17 = r8
            goto L_0x016b
        L_0x015e:
            int r7 = r7 - r9
            java.util.ArrayList r5 = X.C18185Vmz.A00(r4, r10, r9, r7)
        L_0x0163:
            int r18 = r8.size()
            r17 = r8
            r16 = r5
        L_0x016b:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r6 = A00(r12, r13, r14, r15, r16, r17, r18)
            return r6
        L_0x0170:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0175:
            int r6 = r8.size()
            r0 = 15000(0x3a98, float:2.102E-41)
            java.util.List r4 = X.C18185Vmz.A01(r4, r0)
            r2 = 0
            r0 = r12
            r1 = r13
            r3 = r15
            r5 = r8
            com.facebook.videolite.transcoder.base.composition.MediaComposition r6 = A00(r0, r1, r2, r3, r4, r5, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper.A01(com.instagram.api.schemas.ACRType, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper, com.instagram.music.common.model.AudioOverlayTrack, java.lang.String, java.util.List, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }

    public static final MediaComposition A00(ACRType aCRType, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, List list, List list2, int i) {
        if (i == list.size()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list2) {
                if (new File(((Medium) next).A0X).length() > 0) {
                    A1C.add(next);
                }
            }
            MediaComposition A002 = ABX.A00((ImmutableList) null, userSession, audioOverlayTrack, AnonymousClass7TE.A1D(ABX.A01(aCRType, str, AnonymousClass7TE.A1D(A1C), AnonymousClass7TE.A1D(list), I5p.A00(aCRType, str, 1), true)), 0.0f);
            0qQ.A07(A002);
            return A002;
        }
        throw new RuntimeException("Original Video list size differs from size of video durations");
    }
}
