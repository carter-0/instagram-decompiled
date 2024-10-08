package X;

import com.facebook.models.ModelAssetMetadata;
import com.facebook.models.ModelMetadata;
import com.facebook.models.interfaces.ModelLoaderBase;

/* renamed from: X.950  reason: invalid class name */
public final class AnonymousClass950 {
    public final C258993zy A00;
    public final C3733494z A01;
    public final C2604745u A02;
    public final C3733394y A03;

    public final AnonymousClass40G A00(C258743zZ r11, String str) {
        ModelMetadata modelMetadata;
        0qQ.A0B(r11, 0);
        0qQ.A0B(str, 1);
        C3733394y r0 = this.A03;
        String BTg = r11.BTg();
        long BTh = r11.BTh();
        0qQ.A0B(BTg, 1);
        ModelLoaderBase modelLoaderBase = r0.A00;
        if (modelLoaderBase == null) {
            return new AnonymousClass40G("", "model loader is null", false);
        }
        if (BTh == -1) {
            try {
                modelMetadata = (ModelMetadata) modelLoaderBase.load(BTg).get();
            } catch (Exception e) {
                return new AnonymousClass40G("", e.getMessage(), false);
            }
        } else {
            modelMetadata = (ModelMetadata) modelLoaderBase.load(BTg, BTh).get();
        }
        ModelAssetMetadata assetMetadata = modelMetadata.getAssetMetadata(str);
        if (assetMetadata == null) {
            return new AnonymousClass40G("", "no asset", false);
        }
        return new AnonymousClass40G(assetMetadata.path, (String) null, true);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r1 = r12.A01;
        r0 = X.1RH.A00();
        r5 = X.1US.A1D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r0.A06(r5) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (X.1RH.A00().A05(r5) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (X.1RH.A00().A07(r5) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8 = new java.lang.Object();
        r7 = new X.PyC(r5);
        r7.A03 = X.AnonymousClass05K.A01;
        r7.A02 = new X.C40564AeB(r8);
        X.1RH.A00().A03(r1.A00, new X.PyB(r7));
        r0 = (java.lang.Boolean) r8.get();
        X.0qQ.A0A(r0);
        r5 = r0.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r5 == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r0 = "pytorch voltron module not loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r1 = new X.AnonymousClass40G("", r0, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass40G A01(java.util.List r13) {
        /*
            r12 = this;
            r4 = 0
            X.3zy r3 = r12.A00
            r3.A00()
            r2 = 0
            boolean r0 = r13 instanceof java.util.Collection     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0019
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0019
        L_0x0011:
            r0 = 1
            X.40G r1 = new X.40G     // Catch:{ all -> 0x0127 }
            r1.<init>(r2, r2, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0131
        L_0x0019:
            java.util.Iterator r5 = r13.iterator()     // Catch:{ all -> 0x0127 }
        L_0x001d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0127 }
            X.3zZ r1 = (X.C258743zZ) r1     // Catch:{ all -> 0x0127 }
            boolean r0 = r1.CZg()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x001d
            boolean r0 = r1.CaD()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x001d
            X.94z r1 = r12.A01     // Catch:{ all -> 0x0127 }
            X.1RH r0 = X.1RH.A00()     // Catch:{ all -> 0x0127 }
            X.1US r5 = X.1US.A1D     // Catch:{ all -> 0x0127 }
            boolean r0 = r0.A06(r5)     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x00b0
            X.1RH r0 = X.1RH.A00()     // Catch:{ all -> 0x0127 }
            boolean r0 = r0.A05(r5)     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0057
            X.1RH r0 = X.1RH.A00()     // Catch:{ all -> 0x0127 }
            boolean r0 = r0.A07(r5)     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x00b0
        L_0x0057:
            java.lang.String r6 = ""
            com.google.common.util.concurrent.SettableFuture r8 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ Exception -> 0x0099 }
            r8.<init>()     // Catch:{ Exception -> 0x0099 }
            X.1US[] r0 = new X.1US[]{r5}     // Catch:{ Exception -> 0x0099 }
            X.PyC r7 = new X.PyC     // Catch:{ Exception -> 0x0099 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0099 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0099 }
            r7.A03 = r0     // Catch:{ Exception -> 0x0099 }
            X.AeB r0 = new X.AeB     // Catch:{ Exception -> 0x0099 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0099 }
            r7.A02 = r0     // Catch:{ Exception -> 0x0099 }
            X.1RH r5 = X.1RH.A00()     // Catch:{ Exception -> 0x0099 }
            com.instagram.common.session.UserSession r1 = r1.A00     // Catch:{ Exception -> 0x0099 }
            X.PyB r0 = new X.PyB     // Catch:{ Exception -> 0x0099 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0099 }
            r5.A03(r1, r0)     // Catch:{ Exception -> 0x0099 }
            java.lang.Object r0 = r8.get()     // Catch:{ Exception -> 0x0099 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0099 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x0099 }
            boolean r5 = r0.booleanValue()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x0091
            r0 = r6
            goto L_0x0093
        L_0x0091:
            java.lang.String r0 = "pytorch voltron module not loaded"
        L_0x0093:
            X.40G r1 = new X.40G     // Catch:{ Exception -> 0x0099 }
            r1.<init>(r6, r0, r5)     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0127 }
            X.40G r1 = new X.40G     // Catch:{ all -> 0x0127 }
            r1.<init>(r6, r0, r4)     // Catch:{ all -> 0x0127 }
        L_0x00a3:
            boolean r0 = r1.A02     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0127 }
            X.40G r1 = new X.40G     // Catch:{ all -> 0x0127 }
            r1.<init>(r2, r0, r4)     // Catch:{ all -> 0x0127 }
            goto L_0x0131
        L_0x00b0:
            java.lang.String r0 = "voltron_module_loaded"
            r3.A01(r0)     // Catch:{ all -> 0x0127 }
            java.util.Iterator r11 = r13.iterator()     // Catch:{ all -> 0x0127 }
            r7 = 0
        L_0x00ba:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x011b
            int r10 = r7 + 1
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x0127 }
            X.3zZ r8 = (X.C258743zZ) r8     // Catch:{ all -> 0x0127 }
            boolean r0 = r8.CZg()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = r8.BTd()     // Catch:{ all -> 0x0127 }
            X.40G r9 = r12.A00(r8, r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "model_downloaded_"
            java.lang.String r6 = X.002.A0O(r0, r7)     // Catch:{ all -> 0x0127 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r5.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r8.CCQ()     // Catch:{ all -> 0x0127 }
            r5.append(r0)     // Catch:{ all -> 0x0127 }
            r0 = 32
            r5.append(r0)     // Catch:{ all -> 0x0127 }
            boolean r1 = r9.A02     // Catch:{ all -> 0x0127 }
            r5.append(r1)     // Catch:{ all -> 0x0127 }
            r5.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0127 }
            r5.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0127 }
            r3.A03(r6, r0)     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0119
            java.lang.Object r5 = r9.A00     // Catch:{ all -> 0x0127 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0127 }
            X.45u r1 = r12.A02     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r8.CCQ()     // Catch:{ all -> 0x0127 }
            r1.A06(r0, r5)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "model_saved_"
            java.lang.String r0 = X.002.A0O(r0, r7)     // Catch:{ all -> 0x0127 }
            r3.A01(r0)     // Catch:{ all -> 0x0127 }
        L_0x0119:
            r7 = r10
            goto L_0x00ba
        L_0x011b:
            java.lang.String r0 = "models_downloaded"
            r3.A01(r0)     // Catch:{ all -> 0x0127 }
            r0 = 1
            X.40G r1 = new X.40G     // Catch:{ all -> 0x0127 }
            r1.<init>(r2, r2, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0131
        L_0x0127:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.40G r1 = new X.40G
            r1.<init>(r2, r0, r4)
        L_0x0131:
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x013f
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x013b
            java.lang.String r0 = "pytorch manager failure"
        L_0x013b:
            r3.A04(r4, r0)
            return r1
        L_0x013f:
            r0 = 1
            r3.A04(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass950.A01(java.util.List):X.40G");
    }

    public AnonymousClass950(C258993zy r1, C3733394y r2, C3733494z r3, C2604745u r4) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r1;
    }
}
