package X;

/* renamed from: X.Rdq  reason: case insensitive filesystem */
public abstract class C9612Rdq {
    /* JADX WARNING: type inference failed for: r12v0, types: [X.RwV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.RwV, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:51|52|53|54|55|56|(6:57|58|(5:59|(2:61|65)(3:62|(1:64)|70)|66|(1:72)|70)|97|72|(6:74|77|78|79|80|81))|75|77|78|79|80|81) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:7|8|9|10|11|12|13|14|(4:15|(3:17|21|(1:93))(2:18|(1:20))|23|(1:94)(1:25))|92|27|(1:29)|(1:31)|32|(1:34)|35|(1:39)|40|41|44) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:45|46|47|49|50) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:82|83|84|86|87) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015d, code lost:
        return r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0153 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x015c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:79:0x0153=Splitter:B:79:0x0153, B:86:0x015c=Splitter:B:86:0x015c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10691RwV A00(android.content.Context r19, X.C10864RzP r20) {
        /*
            r2 = r20
            java.lang.String r1 = r2.A0P
            r20 = 0
            X.Rzi r0 = r2.A01     // Catch:{ Exception -> 0x015e }
            boolean r0 = r0 instanceof X.C7969QeH     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = X.C9609Rdn.A00(r2)     // Catch:{ Exception -> 0x015e }
        L_0x0010:
            android.net.Uri r2 = X.JTQ.A09(r1)     // Catch:{ Exception -> 0x015e }
            X.0qQ.A07(r2)     // Catch:{ Exception -> 0x015e }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x015e }
            r0 = 28
            r3 = r19
            if (r1 <= r0) goto L_0x00e2
            r1 = 0
            r19 = 1
            X.RwV r12 = new X.RwV     // Catch:{ Exception -> 0x015e }
            r12.<init>()     // Catch:{ Exception -> 0x015e }
            android.media.MediaExtractor r15 = new android.media.MediaExtractor     // Catch:{ all -> 0x00e0 }
            r15.<init>()     // Catch:{ all -> 0x00e0 }
            r0 = r20
            r15.setDataSource(r3, r2, r0)     // Catch:{ all -> 0x00db }
            java.util.ArrayList r0 = X.C9600Rde.A00(r15)     // Catch:{ Exception -> 0x00d5 }
            r11 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00d5 }
            X.Rs4 r0 = (X.C10428Rs4) r0     // Catch:{ Exception -> 0x00d5 }
            int r0 = r0.A00     // Catch:{ Exception -> 0x00d5 }
            r15.selectTrack(r0)     // Catch:{ Exception -> 0x00d5 }
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = -9223372036854775808
            r10 = 0
            r4 = 0
            r2 = 0
            r13 = 0
        L_0x004f:
            int r18 = r15.getSampleFlags()     // Catch:{ Exception -> 0x00d5 }
            long r0 = r15.getSampleTime()     // Catch:{ Exception -> 0x00d5 }
            long r16 = r15.getSampleSize()     // Catch:{ Exception -> 0x00d5 }
            long r8 = java.lang.Math.min(r0, r8)     // Catch:{ Exception -> 0x00d5 }
            long r6 = java.lang.Math.max(r0, r6)     // Catch:{ Exception -> 0x00d5 }
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0068
            goto L_0x0071
        L_0x0068:
            r0 = r18 & 4
            if (r0 != 0) goto L_0x007b
            int r10 = r10 + 1
            long r2 = r2 + r16
            goto L_0x007b
        L_0x0071:
            int r11 = r11 + 1
            int r10 = r10 + 1
            long r4 = r4 + r16
            r13 = r6
            r0 = 2
            if (r11 >= r0) goto L_0x0085
        L_0x007b:
            r0 = 120(0x78, float:1.68E-43)
            if (r10 >= r0) goto L_0x0085
            boolean r0 = r15.advance()     // Catch:{ Exception -> 0x00d5 }
            if (r0 != 0) goto L_0x004f
        L_0x0085:
            long r6 = r6 - r8
            r16 = 0
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            double r0 = (double) r10     // Catch:{ Exception -> 0x00d5 }
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 * r8
            double r8 = (double) r6     // Catch:{ Exception -> 0x00d5 }
            double r0 = r0 / r8
            long r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x00d5 }
            float r6 = (float) r0     // Catch:{ Exception -> 0x00d5 }
            int r0 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x00d5 }
            r12.A00 = r0     // Catch:{ Exception -> 0x00d5 }
        L_0x00a0:
            if (r11 <= 0) goto L_0x00ab
            long r0 = (long) r11     // Catch:{ Exception -> 0x00d5 }
            long r4 = r4 / r0
            float r0 = (float) r4     // Catch:{ Exception -> 0x00d5 }
            int r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x00d5 }
            r12.A02 = r0     // Catch:{ Exception -> 0x00d5 }
        L_0x00ab:
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x00b7
            long r0 = (long) r10     // Catch:{ Exception -> 0x00d5 }
            long r2 = r2 / r0
            float r0 = (float) r2     // Catch:{ Exception -> 0x00d5 }
            int r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x00d5 }
            r12.A03 = r0     // Catch:{ Exception -> 0x00d5 }
        L_0x00b7:
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            r0 = r19
            if (r11 <= r0) goto L_0x00d5
            double r2 = (double) r13     // Catch:{ Exception -> 0x00d5 }
            int r11 = r11 - r19
            double r4 = (double) r11     // Catch:{ Exception -> 0x00d5 }
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 * r0
            double r2 = r2 / r4
            long r1 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x00d5 }
            float r0 = (float) r1     // Catch:{ Exception -> 0x00d5 }
            int r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x00d5 }
            r12.A01 = r0     // Catch:{ Exception -> 0x00d5 }
        L_0x00d5:
            r15.release()     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00da
        L_0x00d9:
            return r12
        L_0x00da:
            return r12
        L_0x00db:
            r0 = move-exception
            r15.release()     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e1
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            throw r0     // Catch:{ Exception -> 0x015e }
        L_0x00e2:
            X.RwV r12 = new X.RwV     // Catch:{ Exception -> 0x015e }
            r12.<init>()     // Catch:{ Exception -> 0x015e }
            r1 = 0
            android.media.MediaExtractor r6 = new android.media.MediaExtractor     // Catch:{ all -> 0x015b }
            r6.<init>()     // Catch:{ all -> 0x015b }
            r0 = r20
            r6.setDataSource(r3, r2, r0)     // Catch:{ all -> 0x0156 }
            java.util.ArrayList r0 = X.C9600Rde.A00(r6)     // Catch:{ Exception -> 0x014f }
            r10 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x014f }
            X.Rs4 r0 = (X.C10428Rs4) r0     // Catch:{ Exception -> 0x014f }
            int r0 = r0.A00     // Catch:{ Exception -> 0x014f }
            r6.selectTrack(r0)     // Catch:{ Exception -> 0x014f }
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = -9223372036854775808
            r3 = 0
        L_0x010a:
            int r9 = r6.getSampleFlags()     // Catch:{ Exception -> 0x014f }
            long r7 = r6.getSampleTime()     // Catch:{ Exception -> 0x014f }
            long r1 = java.lang.Math.min(r7, r1)     // Catch:{ Exception -> 0x014f }
            long r4 = java.lang.Math.max(r7, r4)     // Catch:{ Exception -> 0x014f }
            r0 = r9 & 1
            if (r0 == 0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            r0 = r9 & 4
            if (r0 != 0) goto L_0x012f
            goto L_0x0126
        L_0x0124:
            int r10 = r10 + 1
        L_0x0126:
            int r3 = r3 + 1
            r0 = 2
            if (r10 >= r0) goto L_0x0135
            r0 = 120(0x78, float:1.68E-43)
            if (r3 >= r0) goto L_0x0135
        L_0x012f:
            boolean r0 = r6.advance()     // Catch:{ Exception -> 0x014f }
            if (r0 != 0) goto L_0x010a
        L_0x0135:
            long r4 = r4 - r1
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
            double r2 = (double) r3     // Catch:{ Exception -> 0x014f }
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 * r0
            double r0 = (double) r4     // Catch:{ Exception -> 0x014f }
            double r2 = r2 / r0
            long r1 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x014f }
            float r0 = (float) r1     // Catch:{ Exception -> 0x014f }
            int r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x014f }
            goto L_0x0150
        L_0x014f:
            r0 = -1
        L_0x0150:
            r6.release()     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            r12.A00 = r0     // Catch:{ Exception -> 0x015d }
            return r12
        L_0x0156:
            r0 = move-exception
            r6.release()     // Catch:{ Exception -> 0x015c }
            goto L_0x015c
        L_0x015b:
            r0 = move-exception
        L_0x015c:
            throw r0     // Catch:{ Exception -> 0x015d }
        L_0x015d:
            return r12
        L_0x015e:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9612Rdq.A00(android.content.Context, X.RzP):X.RwV");
    }
}
