package X;

public abstract class S0U {
    public final /* synthetic */ C7254Q1b A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.RQJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.RQJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.RQJ} */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:20|21|22|23|24|25|(2:27|28)|29|30|(1:32)(1:39)|33|(1:35)|36|(2:38|40)(1:41)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:50|51|52|53|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00bf */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC, Splitter:B:27:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c A[Catch:{ all -> 0x0095, all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ all -> 0x0095, all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081 A[Catch:{ all -> 0x0095, all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088 A[Catch:{ all -> 0x0095, all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094 A[Catch:{ all -> 0x0095, all -> 0x00cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r8 = this;
            r1 = r8
            boolean r0 = r8 instanceof X.C7948Qdp     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00b4
            X.Qdp r1 = (X.C7948Qdp) r1     // Catch:{ all -> 0x00cc }
            int r0 = r1.A00     // Catch:{ all -> 0x00cc }
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x0023;
                case 2: goto L_0x0019;
                default: goto L_0x000c;
            }     // Catch:{ all -> 0x00cc }
        L_0x000c:
            java.lang.Object r1 = r1.A02     // Catch:{ all -> 0x00cc }
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00d2
            r0 = -1813984660(0xffffffff93e0ca6c, float:-5.6745153E-27)
            X.0fX.A03(r1, r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x0019:
            java.lang.Object r0 = r1.A02     // Catch:{ all -> 0x00cc }
            X.Tig r0 = (X.C13860Tig) r0     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00d2
            r0.release()     // Catch:{ all -> 0x00cc }
            return
        L_0x0023:
            java.lang.Object r0 = r1.A02     // Catch:{ all -> 0x00cc }
            X.Tia r0 = (X.C13855Tia) r0     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00d2
            r0.release()     // Catch:{ all -> 0x00cc }
            return
        L_0x002d:
            java.lang.Object r5 = r1.A02     // Catch:{ all -> 0x00cc }
            X.Q17 r5 = (X.Q17) r5     // Catch:{ all -> 0x00cc }
            if (r5 == 0) goto L_0x00d2
            java.lang.StringBuilder r4 = r5.A08     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "stopB,"
            r4.append(r0)     // Catch:{ all -> 0x0095 }
            X.Q1b r6 = new X.Q1b     // Catch:{ all -> 0x0095 }
            r6.<init>()     // Catch:{ all -> 0x0095 }
            android.media.MediaCodec r7 = r5.A05     // Catch:{ all -> 0x0095 }
            r0 = -2100426665(0xffffffff82ce0857, float:-3.0273766E-37)
            X.0fX.A06(r7, r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0058
        L_0x0049:
            boolean r0 = r5.A0B     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0058
            long r0 = r5.A04     // Catch:{ Exception -> 0x0058 }
            java.lang.Thread.sleep(r0)     // Catch:{ Exception -> 0x0058 }
            r0 = -1425558754(0xffffffffab07b31e, float:-4.821021E-13)
            X.0fX.A06(r7, r0)     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            boolean r0 = r5.A0B     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0088
            long r2 = r5.A04     // Catch:{ all -> 0x0095 }
            X.Qdo r1 = new X.Qdo     // Catch:{ all -> 0x0095 }
            r1.<init>(r7, r6, r2)     // Catch:{ all -> 0x0095 }
            X.RQJ r0 = new X.RQJ     // Catch:{ all -> 0x0095 }
            r0.<init>()     // Catch:{ all -> 0x0095 }
        L_0x0068:
            r0.A00 = r1     // Catch:{ all -> 0x0095 }
            X.S0U r0 = r0.A00     // Catch:{ all -> 0x0095 }
            r0.A00()     // Catch:{ all -> 0x0095 }
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x0095 }
            r5.A03 = r0     // Catch:{ all -> 0x0095 }
            r5.A00 = r0     // Catch:{ all -> 0x0095 }
            android.view.Surface r0 = r5.A06     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x007d
            r0.release()     // Catch:{ all -> 0x0095 }
        L_0x007d:
            java.lang.Throwable r0 = r6.A00     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "stopE,"
            r4.append(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0093
        L_0x0088:
            X.Qdp r1 = new X.Qdp     // Catch:{ all -> 0x0095 }
            r1.<init>((android.media.MediaCodec) r7, (X.C7254Q1b) r6)     // Catch:{ all -> 0x0095 }
            X.RQJ r0 = new X.RQJ     // Catch:{ all -> 0x0095 }
            r0.<init>()     // Catch:{ all -> 0x0095 }
            goto L_0x0068
        L_0x0093:
            return
        L_0x0094:
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r4 = move-exception
            boolean r0 = r4 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00b0
            r0 = r4
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = X.C266784aL.A02(r0)     // Catch:{ all -> 0x00cc }
        L_0x00a1:
            java.lang.String r2 = "codec info:  "
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = " mediaCodecException: "
            java.lang.String r0 = X.002.A0u(r2, r1, r0, r3)     // Catch:{ all -> 0x00cc }
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r4)     // Catch:{ all -> 0x00cc }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00b0:
            java.lang.String r3 = "null"
            goto L_0x00a1
        L_0x00b4:
            X.Qdo r1 = (X.C7947Qdo) r1     // Catch:{ all -> 0x00cc }
            android.media.MediaCodec r2 = r1.A01     // Catch:{ all -> 0x00cc }
            r0 = -562929442(0xffffffffde7260de, float:-4.36630086E18)
            X.0fX.A03(r2, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00cb
        L_0x00bf:
            long r0 = r1.A00     // Catch:{ all -> 0x00cc }
            java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x00cc }
            r0 = 116870011(0x6f74b7b, float:9.302198E-35)
            X.0fX.A03(r2, r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x00cb:
            return
        L_0x00cc:
            r1 = move-exception
            X.Q1b r0 = r8.A00
            X.C7254Q1b.A00(r0, r1)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S0U.A00():void");
    }

    public S0U(C7254Q1b q1b) {
        this.A00 = q1b;
    }
}
