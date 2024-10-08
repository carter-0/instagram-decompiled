package com.instagram.creation.capture.quickcapture.sundial.sfx;

import X.0qQ;
import X.1Ey;
import X.1Fe;
import X.1IW;
import X.1Pq;
import X.1QS;
import X.1QU;
import X.AnonymousClass1CO;
import X.AnonymousClass1QT;
import X.AnonymousClass1T9;
import X.AnonymousClass4D7;
import X.C64608Les;
import X.JTQ;
import X.JTS;
import X.MP5;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class SfxNetworkSource {
    public final 1QU A00;

    public final Object A00(UserSession userSession, File file, String str, String str2, String str3, String str4, AnonymousClass4D7 r17, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r8 = new 1IW(1, 1Ey.A02(r17));
        r8.A0I();
        1Pq A0I = JTS.A0I(userSession);
        A0I.A02(str4);
        A0I.A05 = true;
        1QS A002 = A0I.A00();
        AnonymousClass1T9 A02 = AnonymousClass1CO.A00().A02(new C64608Les(file, str2, str3, str, r8, i), A002, this.A00);
        0qQ.A07(A02);
        r8.CO0(MP5.A00(A02, 34));
        return r8.A0E();
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a2, code lost:
        if (r0 == r2) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r18, java.lang.String r19, java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r17 = this;
            r4 = 25
            r5 = r21
            boolean r0 = X.ME8.A03(r4, r5)
            if (r0 == 0) goto L_0x00a5
            r3 = r5
            X.ME8 r3 = (X.ME8) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r4 = 1
            if (r1 == 0) goto L_0x0061
            if (r1 != r4) goto L_0x00b5
            X.0eS.A00(r0)
        L_0x0026:
            r2 = r0
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0058
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.CGO r0 = (X.CGO) r0
            java.util.List r1 = r0.A05
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.music.common.model.MusicSearchItem>"
            X.0qQ.A0C(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r1.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.JZC r0 = (X.JZC) r0
            X.MWx r0 = r0.A00()
            if (r0 == 0) goto L_0x0042
            r2.add(r0)
            goto L_0x0042
        L_0x0058:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0061:
            X.0eS.A00(r0)
            X.LSH r6 = X.LSH.A02
            r13 = 0
            java.lang.String r1 = "playlists"
            java.lang.String r0 = "Sound Effects"
            r5 = r19
            com.instagram.music.common.model.MusicBrowseCategory r10 = X.C64181LSn.A03(r1, r5, r0)
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.Long r12 = X.JTO.A0y(r0)
            java.lang.Class<X.D1y> r1 = X.C45699D1y.class
            X.0bH r0 = new X.0bH
            r8 = r18
            r0.<init>(r8)
            X.1NS r9 = new X.1NS
            r9.<init>(r0, r1)
            java.lang.String r15 = "sound_effects"
            r14 = r20
            r16 = r13
            X.1OC r1 = r6.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.music.api.MusicSearchResponse, com.instagram.music.api.MusicSearchResponse>"
            X.0qQ.A0C(r1, r0)
            r3.A00 = r4
            r0 = 1975100848(0x75b9a5b0, float:4.706716E32)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L_0x0026
        L_0x00a4:
            return r2
        L_0x00a5:
            r0 = 42
            X.ME8 r3 = new X.ME8
            r1 = r17
            r3.<init>(r1, r5, r4, r0)
            goto L_0x0018
        L_0x00b0:
            X.3Ih r2 = X.C41845B3m.A0d(r2)
            return r2
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public SfxNetworkSource() {
        AnonymousClass1QT A0E = JTQ.A0E();
        A0E.A03 = 1Fe.A03;
        this.A00 = A0E.A00();
    }
}
