package com.instagram.barcelona.feed.post.data;

import X.02z;
import X.05G;
import X.0Yt;
import X.106;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.C252733pa;
import X.C299735vl;
import X.C51975G9x;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.Map;
import org.webrtc.CameraCapturer;

public final class PostViewStateRepository extends C252733pa {
    public final UserSession A00;
    public final 05G A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final LruCache A05 = new LruCache(CameraCapturer.OPEN_CAMERA_DELAY_MS);
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.feed.post.data.PostViewStateRepository r7, java.util.List r8, X.AnonymousClass4D7 r9) {
        /*
            r4 = 8
            boolean r0 = X.C66128MDg.A01(r4, r9)
            if (r0 == 0) goto L_0x00a4
            r3 = r9
            X.MDg r3 = (X.C66128MDg) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a4
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r6 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 != r6) goto L_0x0126
            java.lang.Object r7 = r3.A01
            com.instagram.barcelona.feed.post.data.PostViewStateRepository r7 = (com.instagram.barcelona.feed.post.data.PostViewStateRepository) r7
            X.0eS.A00(r0)
        L_0x0028:
            r4 = r0
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d1
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.Gyq r0 = (X.C54067Gyq) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r3 = X.DbV.A15(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r2.next()
            X.Hku r0 = (X.C55635Hku) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            X.AnonymousClass7TF.A1I(r1, r0, r3)
            goto L_0x003f
        L_0x0053:
            X.0eS.A00(r0)
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = r8.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r1 = r2.next()
            android.util.LruCache r0 = r7.A05
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0074
            r5.put(r1, r0)
            goto L_0x005e
        L_0x0074:
            r3.A01 = r7
            r3.A00 = r6
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "text_feed/translate_comments/"
            r2.A0A(r0)
            r0 = 44
            X.3El r0 = X.C239023El.A00(r0)
            java.lang.String r1 = r0.A02(r8)
            java.lang.String r0 = "comment_ids"
            r2.A9m(r0, r1)
            java.lang.Class<X.Gyq> r1 = X.C54067Gyq.class
            java.lang.Class<X.HwM> r0 = X.C56309HwM.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 1476611206(0x58034c86, float:5.7745876E14)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x00a4:
            X.MDg r3 = new X.MDg
            r3.<init>(r7, r9, r4)
            goto L_0x0016
        L_0x00ab:
            java.util.Map r4 = X.0Yt.A08(r3)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r4)
        L_0x00b3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00da
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getKey()
            X.0qQ.A07(r2)
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.util.LruCache r0 = r7.A05
            r0.put(r2, r1)
            goto L_0x00b3
        L_0x00d1:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00de
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00da:
            X.3Ih r4 = X.C41845B3m.A0d(r4)
        L_0x00de:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0101
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0121
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r2 = r4.A00
            X.4dm r2 = (X.C268654dm) r2
            boolean r0 = r2 instanceof X.C268664dn
            if (r0 == 0) goto L_0x0102
            X.4dn r2 = (X.C268664dn) r2
            java.lang.Throwable r0 = r2.A00
            java.lang.String r1 = r0.getLocalizedMessage()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x00fd:
            X.5sO r4 = X.C41845B3m.A0c(r0)
        L_0x0101:
            return r4
        L_0x0102:
            boolean r0 = r2 instanceof X.C268674do
            if (r0 == 0) goto L_0x011c
            java.lang.String r1 = "error: "
            X.4do r2 = (X.C268674do) r2
            java.lang.Object r0 = r2.A00
            X.1XR r0 = (X.1XR) r0
            int r0 = r0.getStatusCode()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            goto L_0x00fd
        L_0x011c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0121:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0126:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x012b:
            X.3Ih r0 = X.C41845B3m.A0d(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.post.data.PostViewStateRepository.A00(com.instagram.barcelona.feed.post.data.PostViewStateRepository, java.util.List, X.4D7):java.lang.Object");
    }

    public static final void A01(PostViewStateRepository postViewStateRepository, C299735vl r3, String str) {
        Object value;
        05G r2 = postViewStateRepository.A03;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C51975G9x.A0p(str, r3, (Map) value)));
    }

    public PostViewStateRepository(UserSession userSession) {
        super("barcelona_post_translation", AnonymousClass43D.A00(1476611206));
        this.A00 = userSession;
        02z A012 = 106.A01(0Yt.A0E());
        this.A03 = A012;
        this.A04 = A012;
        02z A013 = 106.A01(0Yt.A0E());
        this.A01 = A013;
        this.A06 = A013;
        02z A014 = 106.A01(0Yt.A0E());
        this.A02 = A014;
        this.A07 = A014;
    }

    public final void close() {
        super.close();
        this.A05.evictAll();
    }
}
