package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.security.MessageDigest;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SRI {
    public List A00;
    public List A01;
    public ExecutorService A02;
    public Integer A03;
    public final Context A04;
    public final C7255Q1d A05;
    public final C13725Tfv A06;
    public final C13834Ti9 A07 = new C12329Srb(this, 0);
    public final C13590TdI A08;
    public final C13780Tgv A09;
    public final C13804ThT A0A;
    public final C10862RzN A0B;
    public final C13598TdQ A0C;
    public final File A0D;
    public final HashMap A0E;
    public final AtomicBoolean A0F;

    private C10862RzN A00(C7232Q0d q0d, C13834Ti9 ti9, MediaComposition mediaComposition) {
        int i;
        int i2;
        C10862RzN rzN = this.A0B;
        C11354SOn sOn = rzN.A06;
        if (sOn != null) {
            i = Math.max(sOn.A0C, sOn.A0A);
            i2 = sOn.A01;
        } else {
            C11326SNc sNc = C11326SNc.A05;
            i = sNc.A01;
            i2 = sNc.A00;
        }
        C11354SOn A032 = SSg.A03(q0d, new C11326SNc(i, i2), (List) null);
        A032.A0F = new C10246Rp6();
        SQv sQv = new SQv(rzN);
        sQv.A06 = A032;
        sQv.A07 = ti9;
        sQv.A08 = mediaComposition;
        sQv.A0J = false;
        return new C10862RzN(sQv);
    }

    private void A02(C266714aE r25, C266824aP r26, MediaComposition mediaComposition) {
        C266824aP r23;
        AbstractMap A1E;
        C266714aE r11 = r25;
        MediaComposition mediaComposition2 = mediaComposition;
        HashMap A072 = mediaComposition2.A07(r11);
        if (A072 != null) {
            int size = A072.size();
            int i = 0;
            while (true) {
                r23 = r26;
                if (i >= size) {
                    break;
                }
                C266794aM r10 = (C266794aM) C51968G9o.A0z(A072, i);
                if (r10 != null) {
                    C266764aJ r9 = new C266764aJ(r10.A01, r10.A02, r10.A00);
                    Iterator A16 = Pxg.A16(r10.A04);
                    while (true) {
                        if (!A16.hasNext()) {
                            break;
                        }
                        C266754aI r8 = (C266754aI) A16.next();
                        File file = r8.A04;
                        C266724aF r2 = r8.A03;
                        HashMap hashMap = this.A0E;
                        if (hashMap.containsKey(r10)) {
                            file = (File) hashMap.get(r10);
                            if (this.A0B.A0N) {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                long max = Math.max(0, r2.A03(timeUnit));
                                long A022 = r2.A02(timeUnit);
                                long j = r8.A01;
                                if (A022 < 0) {
                                    A022 = j;
                                }
                                long j2 = j - A022;
                                long j3 = j - max;
                                if (j2 == 0) {
                                    j2 = -1;
                                }
                                if (j3 == j) {
                                    j3 = -1;
                                }
                                r2 = Pxe.A0V(timeUnit, j2, j3);
                            } else {
                                r2 = new C266724aF(TimeUnit.SECONDS, -1, -1);
                            }
                        }
                        C266744aH r3 = new C266744aH(file);
                        r3.A03 = r2;
                        r3.A02 = r8.A02;
                        r3.A00 = r8.A00;
                        r3.A01 = r8.A01;
                        r3.A05 = r8.A05;
                        r9.A02(r3.A00());
                    }
                    Iterator A162 = Pxg.A16(r10.A07);
                    while (A162.hasNext()) {
                        C266774aK r1 = (C266774aK) A162.next();
                        float f = r1.A00;
                        if (f >= 0.0f || this.A0B.A0N) {
                            r9.A01(r1.A01, Math.abs(f));
                        }
                    }
                    Iterator A163 = Pxg.A16(r10.A06);
                    while (A163.hasNext()) {
                        A163.next();
                        r9.A06.add((Object) null);
                    }
                    r9.A03.putAll(r10.A03);
                    for (Object add : r10.A05) {
                        try {
                            r9.A05.add(add);
                        } catch (IllegalArgumentException e) {
                            throw C41845B3m.A0j(e);
                        }
                    }
                    Pxf.A1F(r23, r9);
                }
                i++;
            }
            HashMap hashMap2 = mediaComposition2.A01;
            if (hashMap2.containsKey(r11)) {
                HashMap hashMap3 = r23.A01;
                if (hashMap3.containsKey(r11)) {
                    A1E = (AbstractMap) hashMap3.get(r11);
                } else {
                    A1E = AnonymousClass7TE.A1E();
                }
                A1E.getClass();
                HashMap hashMap4 = (HashMap) hashMap2.get(r11);
                hashMap4.getClass();
                A1E.putAll(hashMap4);
                hashMap3.put(r11, A1E);
            }
            List<SIO> A1B = Pxe.A1B(r11, mediaComposition2.A00);
            if (A1B != null) {
                for (SIO sio : A1B) {
                    r23.A01(sio.A00, r11, sio.A01);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r35v0, types: [java.lang.Object, X.TdG] */
    /* JADX WARNING: type inference failed for: r1v22, types: [X.Tgw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r35v1, types: [java.lang.Object, X.TdG] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d5, code lost:
        if (r8.size() != r15.size()) goto L_0x02d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x038d A[Catch:{ IOException | NullPointerException -> 0x039a, all -> 0x040b }, LOOP:3: B:60:0x0153->B:123:0x038d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e5 A[EDGE_INSN: B:157:0x03e5->B:147:0x03e5 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.videolite.transcoder.base.composition.MediaComposition A03(boolean r50) {
        /*
            r49 = this;
            r7 = r49
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x040b }
            r48 = r0
            boolean r0 = r48.isEmpty()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r7.A01     // Catch:{ all -> 0x040b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x001a
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0F     // Catch:{ all -> 0x040b }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x040b }
        L_0x001a:
            X.Q1d r0 = r7.A05     // Catch:{ all -> 0x040b }
            r47 = r0
            java.lang.Integer r1 = r7.A03     // Catch:{ all -> 0x040b }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x040b }
            if (r1 != r0) goto L_0x0052
            java.lang.Integer r2 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x040b }
        L_0x0026:
            r30 = 0
            r1 = r47
            r0 = r30
            java.util.concurrent.ThreadPoolExecutor r0 = r1.A03(r2, r0)     // Catch:{ all -> 0x040b }
            r7.A02 = r0     // Catch:{ all -> 0x040b }
            X.RzN r0 = r7.A0B     // Catch:{ all -> 0x040b }
            r46 = r0
            boolean r0 = r0.A0I     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x03e5
            r0 = r46
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A08     // Catch:{ all -> 0x040b }
            X.C266784aL.A05(r1)     // Catch:{ all -> 0x040b }
            X.4aE r29 = X.C266714aE.VIDEO     // Catch:{ all -> 0x040b }
            r0 = r29
            java.util.HashMap r3 = r1.A07(r0)     // Catch:{ all -> 0x040b }
            if (r3 == 0) goto L_0x03e5
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x03e5
            goto L_0x0055
        L_0x0052:
            java.lang.Integer r2 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x040b }
            goto L_0x0026
        L_0x0055:
            java.io.File r0 = r7.A0D     // Catch:{ IOException -> 0x03d0 }
            r28 = r0
            if (r0 == 0) goto L_0x0075
            boolean r0 = r28.exists()     // Catch:{ IOException -> 0x03d0 }
            if (r0 != 0) goto L_0x007c
            boolean r0 = r28.mkdirs()     // Catch:{ IOException -> 0x03d0 }
            if (r0 != 0) goto L_0x007c
            java.lang.String r1 = "unable to create folder="
            r0 = r28
            java.lang.String r0 = X.Pxf.A0l(r1, r0)     // Catch:{ IOException -> 0x03d0 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x03d0 }
        L_0x0074:
            throw r0     // Catch:{ IOException -> 0x03d0 }
        L_0x0075:
            java.lang.String r0 = "mTranscodeCacheFolder cannot be null"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x03d0 }
            goto L_0x0074
        L_0x007c:
            java.util.concurrent.ExecutorService r2 = r7.A02     // Catch:{ all -> 0x040b }
            r2.getClass()     // Catch:{ all -> 0x040b }
            X.Rs3 r27 = new X.Rs3     // Catch:{ all -> 0x040b }
            r1 = r27
            r0 = r30
            r1.<init>(r0, r2)     // Catch:{ all -> 0x040b }
            java.util.Iterator r26 = X.AnonymousClass7TF.A0s(r3)     // Catch:{ all -> 0x040b }
        L_0x008e:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x03bc
            java.lang.Object r6 = X.C51971G9r.A0p(r26)     // Catch:{ all -> 0x040b }
            X.4aM r6 = (X.C266794aM) r6     // Catch:{ all -> 0x040b }
            java.util.List r1 = r6.A07     // Catch:{ all -> 0x040b }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x040b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040b }
            r25 = 0
            if (r0 != 0) goto L_0x008e
            java.lang.Object r0 = X.Pxg.A0j(r1)     // Catch:{ all -> 0x040b }
            X.4aK r0 = (X.C266774aK) r0     // Catch:{ all -> 0x040b }
            float r0 = r0.A00     // Catch:{ all -> 0x040b }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x008e
            r24 = r6
            r0 = r46
            boolean r0 = r0.A0N     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x0128
            java.util.Iterator r1 = X.Pxg.A16(r1)     // Catch:{ all -> 0x040b }
        L_0x00c1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x0128
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x040b }
            X.4aK r0 = (X.C266774aK) r0     // Catch:{ all -> 0x040b }
            float r0 = r0.A00     // Catch:{ all -> 0x040b }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            X.4aE r3 = r6.A01     // Catch:{ all -> 0x040b }
            java.lang.String r0 = "normalized_media_track_composition"
            r1 = 0
            X.4aJ r8 = new X.4aJ     // Catch:{ all -> 0x040b }
            r8.<init>(r3, r0, r1)     // Catch:{ all -> 0x040b }
            java.util.List r0 = r6.A04     // Catch:{ all -> 0x040b }
            java.util.Iterator r11 = X.Pxg.A16(r0)     // Catch:{ all -> 0x040b }
        L_0x00e5:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x040b }
            X.4aI r9 = (X.C266754aI) r9     // Catch:{ all -> 0x040b }
            X.4aF r10 = r9.A03     // Catch:{ all -> 0x040b }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x040b }
            long r3 = r10.A03(r5)     // Catch:{ all -> 0x040b }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            long r3 = r10.A02(r5)     // Catch:{ all -> 0x040b }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0118
        L_0x0105:
            java.io.File r0 = r9.A04     // Catch:{ all -> 0x040b }
            X.4aH r5 = new X.4aH     // Catch:{ all -> 0x040b }
            r5.<init>(r0)     // Catch:{ all -> 0x040b }
            long r3 = r9.A01     // Catch:{ all -> 0x040b }
            r5.A01 = r3     // Catch:{ all -> 0x040b }
            java.net.URL r0 = r9.A05     // Catch:{ all -> 0x040b }
            r5.A05 = r0     // Catch:{ all -> 0x040b }
            X.4aI r9 = r5.A00()     // Catch:{ all -> 0x040b }
        L_0x0118:
            r8.A02(r9)     // Catch:{ all -> 0x040b }
            goto L_0x00e5
        L_0x011c:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A00(r0)     // Catch:{ all -> 0x040b }
            X.4aM r24 = new X.4aM     // Catch:{ all -> 0x040b }
            r0 = r24
            r0.<init>(r8)     // Catch:{ all -> 0x040b }
        L_0x0128:
            r1 = r24
            r0 = r28
            java.io.File r23 = A01(r1, r0)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03b3 }
            boolean r0 = r23.exists()     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03b3 }
            if (r0 == 0) goto L_0x013f
            java.util.HashMap r1 = r7.A0E     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03b3 }
            r0 = r23
            r1.put(r6, r0)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03b3 }
            goto L_0x008e
        L_0x013f:
            java.util.List r0 = r1.A07     // Catch:{ all -> 0x040b }
            java.lang.Object r0 = X.Pxg.A0j(r0)     // Catch:{ all -> 0x040b }
            X.4aK r0 = (X.C266774aK) r0     // Catch:{ all -> 0x040b }
            float r0 = r0.A00     // Catch:{ all -> 0x040b }
            r45 = r0
            java.util.List r0 = r1.A04     // Catch:{ all -> 0x040b }
            java.util.Iterator r22 = X.Pxg.A16(r0)     // Catch:{ all -> 0x040b }
            r21 = r30
        L_0x0153:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r4 = r22.next()     // Catch:{ all -> 0x040b }
            X.4aI r4 = (X.C266754aI) r4     // Catch:{ all -> 0x040b }
            X.Tfv r0 = r7.A06     // Catch:{ IOException | NullPointerException -> 0x039a }
            r38 = r0
            java.io.File r0 = r4.A04     // Catch:{ IOException | NullPointerException -> 0x039a }
            r34 = r0
            r34.getClass()     // Catch:{ IOException | NullPointerException -> 0x039a }
            android.net.Uri r1 = android.net.Uri.fromFile(r34)     // Catch:{ IOException | NullPointerException -> 0x039a }
            r0 = r38
            X.Q0d r20 = r0.AU7(r1)     // Catch:{ IOException | NullPointerException -> 0x039a }
            r20.getClass()     // Catch:{ IOException | NullPointerException -> 0x039a }
            r0 = r46
            X.Q4k r1 = r0.A0B     // Catch:{ all -> 0x040b }
            if (r1 == 0) goto L_0x031f
            boolean r0 = r1 instanceof X.C7964QeC     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x031f
            X.QeC r1 = (X.C7964QeC) r1     // Catch:{ all -> 0x040b }
            int r0 = r1.A00     // Catch:{ all -> 0x040b }
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x031f
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x040b }
            X.SJN r0 = (X.SJN) r0     // Catch:{ all -> 0x040b }
            boolean r0 = r0.A18     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x031f
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x040b }
            r0 = 2500(0x9c4, double:1.235E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x040b }
            long r2 = r13.convert(r0, r5)     // Catch:{ all -> 0x040b }
            long r0 = r4.A01     // Catch:{ all -> 0x040b }
            r32 = r0
            long r18 = r13.convert(r0, r5)     // Catch:{ all -> 0x040b }
            X.4aF r4 = r4.A03     // Catch:{ all -> 0x040b }
            long r0 = r4.A03(r13)     // Catch:{ all -> 0x040b }
            r11 = 0
            long r16 = java.lang.Math.max(r11, r0)     // Catch:{ all -> 0x040b }
            long r4 = r4.A02(r13)     // Catch:{ all -> 0x040b }
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01b9
            r18 = r4
        L_0x01b9:
            long r0 = r18 - r16
            long r4 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x040b }
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x040b }
            double r2 = (double) r0     // Catch:{ all -> 0x040b }
            double r0 = (double) r4     // Catch:{ all -> 0x040b }
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)     // Catch:{ all -> 0x040b }
            int r2 = (int) r0     // Catch:{ all -> 0x040b }
            r31 = r2
            r10 = 0
        L_0x01ce:
            r0 = r31
            if (r10 >= r0) goto L_0x01f9
            long r0 = (long) r10     // Catch:{ all -> 0x040b }
            long r0 = r0 * r4
            long r2 = r16 + r0
            long r8 = r2 + r4
            r0 = r18
            long r8 = java.lang.Math.min(r0, r8)     // Catch:{ all -> 0x040b }
            X.4aH r14 = new X.4aH     // Catch:{ all -> 0x040b }
            r0 = r34
            r14.<init>(r0)     // Catch:{ all -> 0x040b }
            r0 = r32
            r14.A01 = r0     // Catch:{ all -> 0x040b }
            X.4aF r0 = X.Pxe.A0V(r13, r2, r8)     // Catch:{ all -> 0x040b }
            r14.A03 = r0     // Catch:{ all -> 0x040b }
            X.4aI r1 = r14.A00()     // Catch:{ all -> 0x040b }
            r15.add(r1)     // Catch:{ all -> 0x040b }
            int r10 = r10 + 1
            goto L_0x01ce
        L_0x01f9:
            java.util.Collections.reverse(r15)     // Catch:{ all -> 0x040b }
            r0 = r24
            java.lang.String r9 = r0.A02     // Catch:{ all -> 0x040b }
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x040b }
            r5 = 0
        L_0x0205:
            int r0 = r15.size()     // Catch:{ all -> 0x040b }
            if (r5 >= r0) goto L_0x02c2
            java.lang.Object r3 = r15.get(r5)     // Catch:{ all -> 0x040b }
            X.4aI r3 = (X.C266754aI) r3     // Catch:{ all -> 0x040b }
            java.lang.String r0 = "_split_"
            java.lang.String r2 = X.002.A0b(r9, r0, r5)     // Catch:{ all -> 0x040b }
            X.4aJ r1 = new X.4aJ     // Catch:{ all -> 0x040b }
            r0 = r29
            r1.<init>(r0, r2, r11)     // Catch:{ all -> 0x040b }
            r1.A02(r3)     // Catch:{ all -> 0x040b }
            float r0 = java.lang.Math.abs(r45)     // Catch:{ all -> 0x040b }
            r1.A00(r0)     // Catch:{ all -> 0x040b }
            X.4aM r2 = new X.4aM     // Catch:{ all -> 0x040b }
            r2.<init>(r1)     // Catch:{ all -> 0x040b }
            X.4aP r0 = new X.4aP     // Catch:{ all -> 0x040b }
            r0.<init>()     // Catch:{ all -> 0x040b }
            r0.A04(r2)     // Catch:{ all -> 0x040b }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r3 = new com.facebook.videolite.transcoder.base.composition.MediaComposition     // Catch:{ all -> 0x040b }
            r3.<init>(r0)     // Catch:{ all -> 0x040b }
            X.Ti9 r0 = r7.A07     // Catch:{ all -> 0x040b }
            X.Qdz r1 = new X.Qdz     // Catch:{ all -> 0x040b }
            r1.<init>(r0, r2, r7)     // Catch:{ all -> 0x040b }
            r0 = r20
            X.RzN r43 = r7.A00(r0, r1, r3)     // Catch:{ all -> 0x040b }
            r0 = r28
            java.io.File r4 = A01(r2, r0)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03d9 }
            boolean r0 = r4.exists()     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03d9 }
            if (r0 == 0) goto L_0x025c
            java.util.HashMap r0 = r7.A0E     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03d9 }
            r0.put(r2, r4)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03d9 }
            r8.add(r4)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x03d9 }
            goto L_0x02bc
        L_0x025c:
            android.content.Context r14 = r7.A04     // Catch:{ all -> 0x040b }
            X.ThT r13 = r7.A0A     // Catch:{ all -> 0x040b }
            r13.getClass()     // Catch:{ all -> 0x040b }
            X.TdI r10 = r7.A08     // Catch:{ all -> 0x040b }
            X.Tgv r3 = r7.A09     // Catch:{ all -> 0x040b }
            X.TdQ r2 = r7.A0C     // Catch:{ all -> 0x040b }
            X.SrO r35 = new X.SrO     // Catch:{ all -> 0x040b }
            r35.<init>()     // Catch:{ all -> 0x040b }
            X.SrU r1 = new X.SrU     // Catch:{ all -> 0x040b }
            r1.<init>(r4)     // Catch:{ all -> 0x040b }
            X.Tfu r33 = X.C9935Rjo.A00     // Catch:{ all -> 0x040b }
            X.Q4l r0 = new X.Q4l     // Catch:{ all -> 0x040b }
            r31 = r0
            r32 = r14
            r34 = r47
            r36 = r30
            r37 = r20
            r39 = r1
            r40 = r10
            r41 = r3
            r42 = r13
            r44 = r2
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x040b }
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0F     // Catch:{ all -> 0x040b }
            boolean r1 = r1.get()     // Catch:{ all -> 0x040b }
            if (r1 == 0) goto L_0x0297
            goto L_0x02c0
        L_0x0297:
            r1 = r27
            X.Sr7 r0 = X.TL9.A00(r1, r0)     // Catch:{ all -> 0x040b }
            java.util.List r2 = r7.A01     // Catch:{ all -> 0x040b }
            r2.add(r0)     // Catch:{ all -> 0x040b }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x040b }
        L_0x02a6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x040b }
            X.Tgt r0 = (X.C13778Tgt) r0     // Catch:{ all -> 0x040b }
            r0.FNH()     // Catch:{ InterruptedException | ExecutionException -> 0x02a6 }
            goto L_0x02a6
        L_0x02b6:
            r2.clear()     // Catch:{ all -> 0x040b }
            r8.add(r4)     // Catch:{ all -> 0x040b }
        L_0x02bc:
            int r5 = r5 + 1
            goto L_0x0205
        L_0x02c0:
            r8 = r30
        L_0x02c2:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0F     // Catch:{ all -> 0x040b }
            boolean r0 = r0.get()     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x03e5
            if (r8 == 0) goto L_0x02d7
            int r2 = r8.size()     // Catch:{ all -> 0x040b }
            int r1 = r15.size()     // Catch:{ all -> 0x040b }
            r0 = 1
            if (r2 == r1) goto L_0x02d8
        L_0x02d7:
            r0 = 0
        L_0x02d8:
            X.0JA.A06(r0)     // Catch:{ all -> 0x040b }
            r0 = r25
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x040b }
            X.4aJ r3 = new X.4aJ     // Catch:{ all -> 0x040b }
            r0 = r29
            r3.<init>(r0)     // Catch:{ all -> 0x040b }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x040b }
        L_0x02eb:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x0304
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x040b }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x040b }
            X.4aH r0 = new X.4aH     // Catch:{ all -> 0x040b }
            r0.<init>(r1)     // Catch:{ all -> 0x040b }
            X.4aI r0 = r0.A00()     // Catch:{ all -> 0x040b }
            r3.A02(r0)     // Catch:{ all -> 0x040b }
            goto L_0x02eb
        L_0x0304:
            X.4aM r4 = new X.4aM     // Catch:{ all -> 0x040b }
            r4.<init>(r3)     // Catch:{ all -> 0x040b }
            if (r21 != 0) goto L_0x031c
            X.Q1f r2 = new X.Q1f     // Catch:{ all -> 0x040b }
            r2.<init>()     // Catch:{ all -> 0x040b }
            X.Srz r1 = new X.Srz     // Catch:{ all -> 0x040b }
            r1.<init>()     // Catch:{ all -> 0x040b }
            X.SsN r21 = new X.SsN     // Catch:{ all -> 0x040b }
            r0 = r21
            r0.<init>(r2, r1)     // Catch:{ all -> 0x040b }
        L_0x031c:
            r9 = r21
            goto L_0x0337
        L_0x031f:
            X.4aJ r1 = new X.4aJ     // Catch:{ all -> 0x040b }
            r0 = r29
            r1.<init>(r0)     // Catch:{ all -> 0x040b }
            r1.A02(r4)     // Catch:{ all -> 0x040b }
            float r0 = java.lang.Math.abs(r45)     // Catch:{ all -> 0x040b }
            r1.A00(r0)     // Catch:{ all -> 0x040b }
            X.4aM r4 = new X.4aM     // Catch:{ all -> 0x040b }
            r4.<init>(r1)     // Catch:{ all -> 0x040b }
            X.TdQ r9 = r7.A0C     // Catch:{ all -> 0x040b }
        L_0x0337:
            X.4aP r0 = new X.4aP     // Catch:{ all -> 0x040b }
            r0.<init>()     // Catch:{ all -> 0x040b }
            r0.A04(r4)     // Catch:{ all -> 0x040b }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = new com.facebook.videolite.transcoder.base.composition.MediaComposition     // Catch:{ all -> 0x040b }
            r2.<init>(r0)     // Catch:{ all -> 0x040b }
            r0 = r46
            X.Ti9 r0 = r0.A07     // Catch:{ all -> 0x040b }
            X.Qdz r1 = new X.Qdz     // Catch:{ all -> 0x040b }
            r1.<init>(r0, r6, r7)     // Catch:{ all -> 0x040b }
            r0 = r20
            X.RzN r43 = r7.A00(r0, r1, r2)     // Catch:{ all -> 0x040b }
            android.content.Context r8 = r7.A04     // Catch:{ all -> 0x040b }
            X.ThT r5 = r7.A0A     // Catch:{ all -> 0x040b }
            r5.getClass()     // Catch:{ all -> 0x040b }
            X.TdI r4 = r7.A08     // Catch:{ all -> 0x040b }
            X.Tgv r3 = r7.A09     // Catch:{ all -> 0x040b }
            X.SrO r35 = new X.SrO     // Catch:{ all -> 0x040b }
            r35.<init>()     // Catch:{ all -> 0x040b }
            X.SrU r2 = new X.SrU     // Catch:{ all -> 0x040b }
            r0 = r23
            r2.<init>(r0)     // Catch:{ all -> 0x040b }
            X.Tfu r33 = X.C9935Rjo.A00     // Catch:{ all -> 0x040b }
            X.Q4l r1 = new X.Q4l     // Catch:{ all -> 0x040b }
            r31 = r1
            r32 = r8
            r34 = r47
            r36 = r30
            r37 = r20
            r39 = r2
            r40 = r4
            r41 = r3
            r42 = r5
            r44 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x040b }
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0F     // Catch:{ all -> 0x040b }
            boolean r0 = r0.get()     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x03e5
            r0 = r27
            X.Sr7 r1 = X.TL9.A00(r0, r1)     // Catch:{ all -> 0x040b }
            r0 = r48
            r0.add(r1)     // Catch:{ all -> 0x040b }
            goto L_0x0153
        L_0x039a:
            r3 = move-exception
            java.io.File r0 = r4.A04     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x03af
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x040b }
        L_0x03a3:
            java.lang.String r0 = "Error extracting meta data from "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x040b }
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x040b }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x040b }
            goto L_0x03e1
        L_0x03af:
            java.lang.String r1 = "unknown file"
            goto L_0x03a3
        L_0x03b3:
            r1 = move-exception
            java.lang.String r0 = "Error creating hash of mediaTrackComposition"
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x040b }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x040b }
            goto L_0x03e1
        L_0x03bc:
            java.util.Iterator r1 = r48.iterator()     // Catch:{ all -> 0x040b }
        L_0x03c0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x040b }
            if (r0 == 0) goto L_0x03e2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x040b }
            X.Tgt r0 = (X.C13778Tgt) r0     // Catch:{ all -> 0x040b }
            r0.FNH()     // Catch:{ InterruptedException | ExecutionException -> 0x03c0 }
            goto L_0x03c0
        L_0x03d0:
            r1 = move-exception
            java.lang.String r0 = "Unable to create transcode cache folder"
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x040b }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x040b }
            goto L_0x03e1
        L_0x03d9:
            r1 = move-exception
            java.lang.String r0 = "Error creating hash of mediaTrackComposition"
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x040b }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x040b }
        L_0x03e1:
            throw r2     // Catch:{ all -> 0x040b }
        L_0x03e2:
            r48.clear()     // Catch:{ all -> 0x040b }
        L_0x03e5:
            r0 = r46
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A08     // Catch:{ all -> 0x040b }
            X.C266784aL.A05(r1)     // Catch:{ all -> 0x040b }
            X.4aP r2 = new X.4aP     // Catch:{ all -> 0x040b }
            r2.<init>()     // Catch:{ all -> 0x040b }
            X.4aE r0 = X.C266714aE.VIDEO     // Catch:{ all -> 0x040b }
            r7.A02(r0, r2, r1)     // Catch:{ all -> 0x040b }
            if (r50 != 0) goto L_0x03fd
            X.4aE r0 = X.C266714aE.AUDIO     // Catch:{ all -> 0x040b }
            r7.A02(r0, r2, r1)     // Catch:{ all -> 0x040b }
        L_0x03fd:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = new com.facebook.videolite.transcoder.base.composition.MediaComposition     // Catch:{ all -> 0x040b }
            r1.<init>(r2)     // Catch:{ all -> 0x040b }
            java.util.concurrent.ExecutorService r0 = r7.A02
            r0.getClass()
            r0.shutdown()
            return r1
        L_0x040b:
            r1 = move-exception
            java.util.concurrent.ExecutorService r0 = r7.A02
            r0.getClass()
            r0.shutdown()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRI.A03(boolean):com.facebook.videolite.transcoder.base.composition.MediaComposition");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5.A01.isEmpty() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            java.util.List r4 = r5.A00
            boolean r0 = r4.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r5.A01
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0F
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x0050
            if (r2 != 0) goto L_0x0050
            r1.set(r3)
            java.util.Iterator r1 = r4.iterator()
        L_0x0024:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.Tgt r0 = (X.C13778Tgt) r0
            r0.cancel()
            goto L_0x0024
        L_0x0034:
            java.util.List r2 = r5.A01
            java.util.Iterator r1 = r2.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.Tgt r0 = (X.C13778Tgt) r0
            r0.cancel()
            goto L_0x003a
        L_0x004a:
            r4.clear()
            r2.clear()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRI.A04():void");
    }

    public SRI(Context context, C7255Q1d q1d, C13725Tfv tfv, C13590TdI tdI, C13780Tgv tgv, C13804ThT thT, C12373SsM ssM, C10862RzN rzN, File file, Integer num) {
        this.A04 = context;
        this.A06 = tfv;
        this.A0B = rzN;
        this.A0A = thT;
        this.A08 = tdI;
        this.A09 = tgv;
        this.A05 = q1d;
        this.A0C = ssM;
        this.A0E = AnonymousClass7TE.A1E();
        this.A0F = new AtomicBoolean();
        this.A00 = AnonymousClass7TE.A1C();
        this.A01 = AnonymousClass7TE.A1C();
        this.A0D = file;
        this.A03 = num;
    }

    public static File A01(C266794aM r2, File file) {
        String obj = r2.A01().toString();
        0qQ.A0B(obj, 0);
        byte[] digest = MessageDigest.getInstance("MD5").digest(C66582MXn.A1a(obj));
        0qQ.A0A(digest);
        return Pxf.A0U(C266784aL.A04(digest), ".mp4", file);
    }
}
