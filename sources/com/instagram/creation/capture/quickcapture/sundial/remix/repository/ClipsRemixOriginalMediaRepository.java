package com.instagram.creation.capture.quickcapture.sundial.remix.repository;

import X.AnonymousClass2NS;
import X.AnonymousClass454;
import X.AnonymousClass4CZ;
import X.AnonymousClass7TG;
import X.C63172Ksf;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class ClipsRemixOriginalMediaRepository {
    public static final Companion A06 = new Object();
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass2NS A02;
    public final AnonymousClass454 A03;
    public final C63172Ksf A04;
    public final AnonymousClass4CZ A05;

    public final class Companion {
        /* JADX WARNING: type inference failed for: r7v1, types: [X.MDk, X.4D7] */
        /* JADX WARNING: type inference failed for: r7v4 */
        /* JADX WARNING: type inference failed for: r7v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x010e, code lost:
            if (r2 != r6) goto L_0x0036;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[LOOP:0: B:13:0x0044->B:15:0x004a, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x011f A[EDGE_INSN: B:43:0x011f->B:40:0x011f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A00(X.AnonymousClass2NS r17, X.AnonymousClass4D7 r18, int r19) {
            /*
                r16 = this;
                r5 = r17
                r12 = r19
                r8 = 0
                r3 = r18
                boolean r0 = X.C66132MDk.A01(r8, r3)
                if (r0 == 0) goto L_0x0111
                r7 = r3
                X.MDk r7 = (X.C66132MDk) r7
                int r2 = r7.A01
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x0111
                int r2 = r2 - r1
                r7.A01 = r2
            L_0x001b:
                java.lang.Object r2 = r7.A04
                X.1Hj r6 = X.1Hj.A02
                int r0 = r7.A01
                r3 = 4
                r11 = 3
                r10 = 2
                r9 = 1
                if (r0 == 0) goto L_0x005f
                if (r0 == r9) goto L_0x0082
                if (r0 == r10) goto L_0x00d0
                if (r0 == r11) goto L_0x0052
                if (r0 != r3) goto L_0x011a
                java.lang.Object r9 = r7.A02
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                X.0eS.A00(r2)
            L_0x0036:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.HashSet r0 = X.00k.A0V(r2)
                java.util.List r0 = X.00k.A0e(r9, r0)
                java.util.Iterator r1 = r0.iterator()
            L_0x0044:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x011f
                java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
                X.0mb.A08(r0)
                goto L_0x0044
            L_0x0052:
                java.lang.Object r9 = r7.A03
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.lang.Object r5 = r7.A02
                X.2NS r5 = (X.AnonymousClass2NS) r5
                X.0eS.A00(r2)
                goto L_0x00ef
            L_0x005f:
                X.0eS.A00(r2)
                r7.A02 = r5
                r7.A00 = r12
                r7.A01 = r9
                java.lang.String r0 = "SELECT * FROM clips_remix_original_media ORDER BY last_used_time_ms DESC"
                X.1WY r13 = X.JTO.A0M(r0, r8)
                android.os.CancellationSignal r4 = new android.os.CancellationSignal
                r4.<init>()
                X.3oI r2 = r5.A01
                r1 = 7
                X.MB7 r0 = new X.MB7
                r0.<init>(r1, r5, r13)
                java.lang.Object r2 = X.1wR.A00(r4, r2, r0, r7, r8)
                if (r2 != r6) goto L_0x008b
                return r6
            L_0x0082:
                int r12 = r7.A00
                java.lang.Object r5 = r7.A02
                X.2NS r5 = (X.AnonymousClass2NS) r5
                X.0eS.A00(r2)
            L_0x008b:
                java.util.List r2 = (java.util.List) r2
                r4 = 0
                r14 = 0
                java.util.Iterator r13 = r2.iterator()
            L_0x0094:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x011f
                java.lang.Object r0 = r13.next()
                X.Jtm r0 = (X.C60928Jtm) r0
                long r0 = r0.A00
                long r14 = r14 + r0
                int r0 = r12 * 1000
                int r0 = r0 * 1000
                long r0 = (long) r0
                int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x00cd
                r7.A02 = r5
                r7.A00 = r4
                r7.A01 = r10
                java.lang.String r0 = "SELECT file_path FROM clips_remix_original_media"
                X.1WY r12 = X.JTO.A0M(r0, r8)
                android.os.CancellationSignal r10 = new android.os.CancellationSignal
                r10.<init>()
                X.3oI r2 = r5.A01
                r1 = 8
                X.MB7 r0 = new X.MB7
                r0.<init>(r1, r5, r12)
                java.lang.Object r2 = X.1wR.A00(r10, r2, r0, r7, r8)
                if (r2 != r6) goto L_0x00d9
                return r6
            L_0x00cd:
                int r4 = r4 + 1
                goto L_0x0094
            L_0x00d0:
                int r4 = r7.A00
                java.lang.Object r5 = r7.A02
                X.2NS r5 = (X.AnonymousClass2NS) r5
                X.0eS.A00(r2)
            L_0x00d9:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                r7.A02 = r5
                r7.A03 = r2
                r7.A01 = r11
                X.3oI r1 = r5.A01
                X.MB5 r0 = new X.MB5
                r0.<init>((java.lang.Object) r5, (int) r4, (int) r9)
                java.lang.Object r0 = X.1wR.A01(r1, r0, r7)
                if (r0 == r6) goto L_0x0110
                r9 = r2
            L_0x00ef:
                r7.A02 = r9
                r0 = 0
                r7.A03 = r0
                r7.A01 = r3
                java.lang.String r0 = "SELECT file_path FROM clips_remix_original_media"
                X.1WY r4 = X.JTO.A0M(r0, r8)
                android.os.CancellationSignal r3 = new android.os.CancellationSignal
                r3.<init>()
                X.3oI r2 = r5.A01
                r1 = 8
                X.MB7 r0 = new X.MB7
                r0.<init>(r1, r5, r4)
                java.lang.Object r2 = X.1wR.A00(r3, r2, r0, r7, r8)
                if (r2 != r6) goto L_0x0036
            L_0x0110:
                return r6
            L_0x0111:
                X.MDk r7 = new X.MDk
                r0 = r16
                r7.<init>(r0, r3, r8)
                goto L_0x001b
            L_0x011a:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                throw r0
            L_0x011f:
                X.0gF r6 = X.C60340gF.A00
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository.Companion.A00(X.2NS, X.4D7, int):java.lang.Object");
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r12 = this;
            r9 = r13
            r8 = r14
            r3 = 28
            boolean r0 = X.MED.A04(r3, r15)
            if (r0 == 0) goto L_0x0098
            r6 = r15
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r6.A04
            X.1Hj r11 = X.1Hj.A02
            int r2 = r6.A00
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r1) goto L_0x003d
            if (r2 != r3) goto L_0x009f
            java.lang.Object r5 = r6.A01
            X.Jtm r5 = (X.C60928Jtm) r5
            X.0eS.A00(r0)
        L_0x002d:
            java.lang.String r0 = r5.A02
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)
            X.8Y4 r0 = new X.8Y4
            r0.<init>(r1)
            X.02z r11 = X.DbS.A10(r0)
        L_0x003c:
            return r11
        L_0x003d:
            java.lang.Object r8 = r6.A03
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository r7 = (com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository) r7
            X.0eS.A00(r0)
            goto L_0x0073
        L_0x004d:
            X.0eS.A00(r0)
            X.2NS r7 = r12.A02
            X.MED.A00(r12, r13, r14, r6, r1)
            java.lang.String r0 = "SELECT * FROM clips_remix_original_media WHERE media_id = ?"
            X.1WY r5 = X.JTO.A0M(r0, r1)
            r5.ADh(r1, r13)
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            X.3oI r2 = r7.A01
            r0 = 6
            X.MB7 r1 = new X.MB7
            r1.<init>(r0, r7, r5)
            r0 = 0
            java.lang.Object r0 = X.1wR.A00(r4, r2, r1, r6, r0)
            if (r0 == r11) goto L_0x003c
            r7 = r12
        L_0x0073:
            r5 = r0
            X.Jtm r5 = (X.C60928Jtm) r5
            if (r5 == 0) goto L_0x00af
            java.lang.String r1 = r5.A02
            boolean r0 = X.JTQ.A1Z(r1)
            r2 = 0
            if (r0 == 0) goto L_0x00a4
            X.2NS r4 = r7.A02
            long r1 = java.lang.System.currentTimeMillis()
            X.MED.A02(r5, r6, r3)
            X.3oI r3 = r4.A01
            X.MAu r0 = new X.MAu
            r0.<init>(r4, r9, r1)
            java.lang.Object r0 = X.1wR.A01(r3, r0, r6)
            if (r0 != r11) goto L_0x002d
            return r11
        L_0x0098:
            X.MED r6 = new X.MED
            r6.<init>(r12, r15, r3)
            goto L_0x0018
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a4:
            java.lang.String r0 = "File deleted. File path: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "ClipsRemixOriginalMediaRepository"
            X.0kD.A07(r0, r1, r2)
        L_0x00af:
            X.4CZ r0 = r7.A05
            X.19S r1 = X.19E.A02(r0)
            X.8fw r0 = X.C361268fw.A00
            X.02z r11 = X.106.A01(r0)
            r10 = 0
            X.MGS r6 = new X.MGS
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r6, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public ClipsRemixOriginalMediaRepository(Context context, UserSession userSession, C63172Ksf ksf, AnonymousClass2NS r4, AnonymousClass454 r5, AnonymousClass4CZ r6) {
        AnonymousClass7TG.A1P(context, r4);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r4;
        this.A04 = ksf;
        this.A05 = r6;
        this.A03 = r5;
    }
}
