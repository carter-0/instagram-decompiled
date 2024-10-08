package X;

/* renamed from: X.TGt  reason: case insensitive filesystem */
public final class C12986TGt implements Runnable {
    public final /* synthetic */ C11645Sdn A00;
    public final /* synthetic */ SUj A01;

    public C12986TGt(C11645Sdn sdn, SUj sUj) {
        this.A00 = sdn;
        this.A01 = sUj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.fbpay.ptt.impl.javacpp.PttImpl] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        r3.execute(new X.TKG(r8, r9, (java.lang.Object) null, (java.lang.String) null, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094 A[ExcHandler: IllegalAccessException | IllegalArgumentException (r12v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.Sdn r3 = r13.A00
            java.lang.Object r9 = r3.A01
            X.SHg r9 = (X.C11246SHg) r9
            java.lang.Object r1 = r3.A02
            X.SUj r0 = r13.A01
            java.lang.Object r2 = X.SUj.A0D(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r7 = r3.A07
            java.lang.Object r6 = r3.A06
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r8 = r3.A05
            X.Tdj r8 = (X.C13617Tdj) r8
            java.lang.Object r3 = r3.A03
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            X.34S r1 = X.SQ9.createPayloads(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            byte[] r5 = r2.getBytes(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.lang.Object r2 = r1.A00     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            byte[] r2 = (byte[]) r2     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.lang.Object r1 = r1.A01     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            byte[] r1 = (byte[]) r1     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r0 = 0
            X.0qQ.A0B(r5, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            com.fbpay.ptt.impl.javacpp.PttImpl r4 = new com.fbpay.ptt.impl.javacpp.PttImpl     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r4.<init>()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r4.mAtFingerprints = r6     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.lang.String[] r0 = X.Pxf.A1b(r6, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            com.facebook.jni.HybridData r0 = com.fbpay.ptt.impl.javacpp.PttImpl.initHybrid(r5, r2, r1, r0, r7)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r4.mHybridData = r0     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.lang.String r2 = r4.getEncryptionError()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            if (r0 != 0) goto L_0x0077
            r10 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0068, IllegalAccessException | IllegalArgumentException -> 0x0094 }
            if (r0 != 0) goto L_0x0068
            org.json.JSONObject r1 = X.C66580MXl.A17(r2)     // Catch:{ JSONException -> 0x0068, IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.lang.String r0 = "code"
            r1.getInt(r0)     // Catch:{ JSONException -> 0x0068, IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.lang.String r0 = "message"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x0068, IllegalAccessException | IllegalArgumentException -> 0x0094 }
        L_0x0068:
            X.TQE r12 = new X.TQE     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r12.<init>(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            X.TKG r7 = new X.TKG     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r3.execute(r7)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            return
        L_0x0077:
            boolean r0 = r6.isEmpty()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            if (r0 == 0) goto L_0x0085
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            X.C11246SHg.A00(r8, r9, r4, r0, r3)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            return
        L_0x0085:
            X.Tdl r2 = r9.A00     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            java.util.Map r1 = r4.getSigningPayloads()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            X.S2R r0 = new X.S2R     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r0.<init>(r8, r9, r4, r3)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            r2.EvZ(r0, r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0094 }
            return
        L_0x0094:
            r12 = move-exception
            r10 = 0
            X.TKG r7 = new X.TKG
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r3.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12986TGt.run():void");
    }
}
