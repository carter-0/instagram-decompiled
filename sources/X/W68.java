package X;

import android.os.Handler;

public final class W68 implements Handler.Callback {
    public final /* synthetic */ WG9 A00;

    public W68(WG9 wg9) {
        this.A00 = wg9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04ed, code lost:
        if (r2 == null) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04ef, code lost:
        r2.onSuccess();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04f2, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01c1 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01c8 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01d3 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ae A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02b7 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c0 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c9 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d2 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02fa A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0323 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x034c A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x035e A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x037d A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03c9 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03d3 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03f0 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0403 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x042e A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0438 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0448 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c A[SYNTHETIC, Splitter:B:37:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ce A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102 A[Catch:{ Exception -> 0x04f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010f A[SYNTHETIC, Splitter:B:70:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011c A[SYNTHETIC, Splitter:B:80:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0125 A[Catch:{ Exception -> 0x04f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r7 = r18
            int r1 = r7.what
            int r4 = r7.arg1
            r0 = 1
            r2 = 0
            r3 = r17
            if (r4 != r0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            java.lang.Object r14 = r7.obj     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0023
        L_0x0010:
            java.lang.Object r6 = r7.obj     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r6 instanceof android.util.Pair     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x000d
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r5 = r6.second     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r5 instanceof X.C341737nR     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x000d
            java.lang.Object r14 = r6.first     // Catch:{ Exception -> 0x04f3 }
            X.7nR r5 = (X.C341737nR) r5     // Catch:{ Exception -> 0x04f3 }
            r2 = r5
        L_0x0023:
            X.WG9 r5 = r3.A00     // Catch:{ Exception -> 0x04f3 }
            r4 = r14
            r6 = 0
            switch(r1) {
                case 3: goto L_0x011c;
                case 4: goto L_0x0125;
                case 5: goto L_0x01c1;
                case 6: goto L_0x01c8;
                case 7: goto L_0x01d3;
                case 8: goto L_0x02ae;
                case 9: goto L_0x02b7;
                case 10: goto L_0x0036;
                case 11: goto L_0x009c;
                case 12: goto L_0x02c0;
                case 13: goto L_0x002a;
                case 14: goto L_0x00ad;
                case 15: goto L_0x02c9;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x002a;
                case 19: goto L_0x02d2;
                case 20: goto L_0x002a;
                case 21: goto L_0x00ce;
                case 22: goto L_0x02fa;
                case 23: goto L_0x0323;
                case 24: goto L_0x034c;
                case 25: goto L_0x035e;
                case 26: goto L_0x037d;
                case 27: goto L_0x03c9;
                case 28: goto L_0x03d3;
                case 29: goto L_0x03f0;
                case 30: goto L_0x0403;
                case 31: goto L_0x042e;
                case 32: goto L_0x0438;
                case 33: goto L_0x0448;
                case 34: goto L_0x0102;
                case 35: goto L_0x010f;
                case 36: goto L_0x04ed;
                default: goto L_0x002a;
            }     // Catch:{ Exception -> 0x04f3 }
        L_0x002a:
            java.lang.String r4 = "unknown msg "
            java.lang.String r4 = X.002.A0O(r4, r1)     // Catch:{ Exception -> 0x04f3 }
            X.WuT r6 = new X.WuT     // Catch:{ Exception -> 0x04f3 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x04f3 }
        L_0x0035:
            throw r6     // Catch:{ Exception -> 0x04f3 }
        L_0x0036:
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ Exception -> 0x04f3 }
            X.W3v r8 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            r7 = r14[r6]     // Catch:{ Exception -> 0x04f3 }
            X.8KU r7 = (X.AnonymousClass8KU) r7     // Catch:{ Exception -> 0x04f3 }
            r5 = r14[r0]     // Catch:{ Exception -> 0x04f3 }
            android.view.Surface r5 = (android.view.Surface) r5     // Catch:{ Exception -> 0x04f3 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x04f3 }
            X.Vik r4 = r8.A06     // Catch:{ all -> 0x0099 }
            boolean r4 = r4.A01()     // Catch:{ all -> 0x0099 }
            if (r4 != 0) goto L_0x0095
            java.util.Set r4 = r8.A0i     // Catch:{ all -> 0x0099 }
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x0099 }
            if (r4 != 0) goto L_0x0095
            boolean r4 = r5.isValid()     // Catch:{ 7sx -> 0x005d }
            if (r4 == 0) goto L_0x0095
            X.C18812W3v.A03(r5, r8, r7)     // Catch:{ 7sx -> 0x005d }
            goto L_0x0095
        L_0x005d:
            r9 = move-exception
            java.lang.String r5 = r9.getMessage()     // Catch:{ all -> 0x0099 }
            r4 = 30000(0x7530, float:4.2039E-41)
            X.UOx r11 = new X.UOx     // Catch:{ all -> 0x0099 }
            r11.<init>(r5, r9, r4)     // Catch:{ all -> 0x0099 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0099 }
            r10.<init>(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "output"
            java.lang.String r4 = r7.BO5()     // Catch:{ all -> 0x0099 }
            r10.put(r5, r4)     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "RenderThreadManager::outputSurfaceCreated"
            X.C18812W3v.A09(r8, r11, r4, r10)     // Catch:{ all -> 0x0099 }
            int r5 = r9.A00     // Catch:{ all -> 0x0099 }
            r4 = 12291(0x3003, float:1.7223E-41)
            if (r5 != r4) goto L_0x0098
            boolean r4 = r8.A0B     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0098
            X.7rD r5 = r8.A0a     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "MediaPipeline::outputSurfaceCreated"
            r5.Ew8(r4, r9, r0)     // Catch:{ all -> 0x0099 }
            r8.A0B = r6     // Catch:{ all -> 0x0099 }
            X.C18812W3v.A04(r8)     // Catch:{ all -> 0x0099 }
            X.C18812W3v.A05(r8)     // Catch:{ all -> 0x0099 }
        L_0x0095:
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            goto L_0x04ed
        L_0x0098:
            throw r9     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            goto L_0x0035
        L_0x009c:
            X.W3v r5 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.8KU r14 = (X.AnonymousClass8KU) r14     // Catch:{ Exception -> 0x04f3 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x04f3 }
            if (r14 == 0) goto L_0x046b
            java.util.Set r4 = r5.A0i     // Catch:{ all -> 0x00aa }
            r4.remove(r14)     // Catch:{ all -> 0x00aa }
            goto L_0x046b
        L_0x00aa:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0035
        L_0x00ad:
            X.W3v r7 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            r9 = 1065353216(0x3f800000, float:1.0)
            float r4 = r7.A00     // Catch:{ Exception -> 0x04f3 }
            float r8 = X.AnonymousClass7TE.A00(r4, r9)     // Catch:{ Exception -> 0x04f3 }
            r4 = 8388608(0x800000, float:1.17549435E-38)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x00c1
            r7.A00 = r9     // Catch:{ Exception -> 0x04f3 }
            r7.A0E = r0     // Catch:{ Exception -> 0x04f3 }
        L_0x00c1:
            X.Vik r8 = r7.A06     // Catch:{ Exception -> 0x04f3 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x04f3 }
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x00ca }
            r8.A00 = r4     // Catch:{ all -> 0x00ca }
            goto L_0x046e
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0035
        L_0x00ce:
            X.W3v r6 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.VgR r14 = (X.C17814VgR) r14     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r14.A02     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A0B(r6, r4)     // Catch:{ Exception -> 0x04f3 }
            X.VwD r5 = r6.A0M     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r14.A01     // Catch:{ Exception -> 0x04f3 }
            r5.A04(r4)     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r6.A0e     // Catch:{ Exception -> 0x04f3 }
            r4.add(r14)     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r12 = r14.A00     // Catch:{ Exception -> 0x04f3 }
            if (r12 == 0) goto L_0x04ed
            X.7rW r7 = r6.A0K     // Catch:{ Exception -> 0x04f3 }
            X.Vhv r8 = r6.A0N     // Catch:{ Exception -> 0x04f3 }
            X.VLG r10 = r6.A0T     // Catch:{ Exception -> 0x04f3 }
            X.Vh2 r11 = r6.A0U     // Catch:{ Exception -> 0x04f3 }
            X.V5Z r9 = r6.A0O     // Catch:{ Exception -> 0x04f3 }
            X.W1n r6 = new X.W1n     // Catch:{ Exception -> 0x04f3 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x04f3 }
            r4 = 0
            r6.A04 = r4     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r4 = "setVideoInputHolder"
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x04f3 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0035
        L_0x0102:
            X.8KU r14 = (X.AnonymousClass8KU) r14     // Catch:{ Exception -> 0x04f3 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x04f3 }
            r14.setEnabled(r0)     // Catch:{ all -> 0x010b }
            monitor-exit(r4)     // Catch:{ all -> 0x010b }
            goto L_0x04ed
        L_0x010b:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010b }
            goto L_0x0035
        L_0x010f:
            X.8KU r14 = (X.AnonymousClass8KU) r14     // Catch:{ Exception -> 0x04f3 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x04f3 }
            r14.setEnabled(r6)     // Catch:{ all -> 0x0118 }
            monitor-exit(r4)     // Catch:{ all -> 0x0118 }
            goto L_0x04ed
        L_0x0118:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0118 }
            goto L_0x0035
        L_0x011c:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.X93 r14 = (X.X93) r14     // Catch:{ Exception -> 0x04f3 }
            r4.A0I(r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x0125:
            X.W3v r5 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r14 = (X.C365408n3) r14     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r4 = r5.A0h     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r8 = r4.get(r14)     // Catch:{ Exception -> 0x04f3 }
            X.W1n r8 = (X.W1n) r8     // Catch:{ Exception -> 0x04f3 }
            if (r8 == 0) goto L_0x04ed
            X.Vik r4 = r5.A06     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r4.A00()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.W1n r7 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            if (r7 == 0) goto L_0x04ed
            X.8n3 r4 = r7.A06     // Catch:{ Exception -> 0x04f3 }
            if (r4 != 0) goto L_0x0145
            r4 = 0
            goto L_0x0149
        L_0x0145:
            boolean r4 = r4.EFH()     // Catch:{ Exception -> 0x04f3 }
        L_0x0149:
            r10 = r4 ^ 1
            X.8n3 r4 = r8.A06     // Catch:{ Exception -> 0x04f3 }
            int r9 = r4.BHc()     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r4 = r8.A06     // Catch:{ Exception -> 0x04f3 }
            int r6 = r4.BHR()     // Catch:{ Exception -> 0x04f3 }
            X.7rW r4 = r8.A0B     // Catch:{ Exception -> 0x04f3 }
            X.7r6 r5 = r4.A00     // Catch:{ Exception -> 0x04f3 }
            r4 = 80
            boolean r5 = r5.CTO(r4)     // Catch:{ Exception -> 0x04f3 }
            int r4 = r8.A02     // Catch:{ Exception -> 0x04f3 }
            if (r9 != r4) goto L_0x016d
            int r4 = r8.A00     // Catch:{ Exception -> 0x04f3 }
            if (r6 != r4) goto L_0x016d
            boolean r4 = r8.A09     // Catch:{ Exception -> 0x04f3 }
            if (r5 == r4) goto L_0x018d
        L_0x016d:
            r8.A02 = r9     // Catch:{ Exception -> 0x04f3 }
            r8.A00 = r6     // Catch:{ Exception -> 0x04f3 }
            r8.A09 = r5     // Catch:{ Exception -> 0x04f3 }
            if (r6 == 0) goto L_0x018d
            if (r9 == 0) goto L_0x018d
            X.W1n.A01(r8)     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r8.A09     // Catch:{ Exception -> 0x04f3 }
            if (r4 != 0) goto L_0x018d
            X.8n3 r4 = r8.A06     // Catch:{ Exception -> 0x04f3 }
            int r5 = r4.BHc()     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r4 = r8.A06     // Catch:{ Exception -> 0x04f3 }
            int r4 = r4.BHR()     // Catch:{ Exception -> 0x04f3 }
            X.W1n.A02(r8, r5, r4)     // Catch:{ Exception -> 0x04f3 }
        L_0x018d:
            int r4 = r8.A02     // Catch:{ Exception -> 0x04f3 }
            if (r4 <= 0) goto L_0x04ed
            int r4 = r8.A00     // Catch:{ Exception -> 0x04f3 }
            if (r4 <= 0) goto L_0x04ed
            X.8so r4 = r8.A07     // Catch:{ Exception -> 0x04f3 }
            if (r4 != 0) goto L_0x01a0
            X.8so r4 = new X.8so     // Catch:{ Exception -> 0x04f3 }
            r4.<init>()     // Catch:{ Exception -> 0x04f3 }
            r8.A07 = r4     // Catch:{ Exception -> 0x04f3 }
        L_0x01a0:
            X.8n3 r4 = r8.A06     // Catch:{ Exception -> 0x04f3 }
            X.8n4 r6 = r4.B81()     // Catch:{ Exception -> 0x04f3 }
            X.7v0 r4 = r6.A01     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.8so r5 = r8.A07     // Catch:{ Exception -> 0x04f3 }
            r5.A04(r6)     // Catch:{ Exception -> 0x04f3 }
            float[] r4 = r8.A0F     // Catch:{ Exception -> 0x04f3 }
            r5.A05 = r4     // Catch:{ Exception -> 0x04f3 }
            if (r10 == 0) goto L_0x01b8
            r8.A06(r7)     // Catch:{ Exception -> 0x04f3 }
        L_0x01b8:
            X.X93 r4 = r8.A04     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            r4.DGm()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x01c1:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A04(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x01c8:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            r4.A0B = r0     // Catch:{ Exception -> 0x04f3 }
            r4.A0D = r6     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A05(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x01d3:
            r4 = 3
            android.os.Handler r6 = r5.A00     // Catch:{ Exception -> 0x04f3 }
            r6.removeMessages(r4)     // Catch:{ Exception -> 0x04f3 }
            r4 = 4
            r6.removeMessages(r4)     // Catch:{ Exception -> 0x04f3 }
            X.W3v r5 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r14 = (X.C365408n3) r14     // Catch:{ Exception -> 0x04f3 }
            X.W1n r6 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            r4 = 0
            if (r6 == 0) goto L_0x01f4
            java.util.Map r7 = r5.A0h     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r6 = r6.A06     // Catch:{ Exception -> 0x04f3 }
            r7.remove(r6)     // Catch:{ Exception -> 0x04f3 }
            X.W1n r6 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            r6.A03()     // Catch:{ Exception -> 0x04f3 }
            r5.A07 = r4     // Catch:{ Exception -> 0x04f3 }
        L_0x01f4:
            if (r14 == 0) goto L_0x025c
            X.7rW r9 = r5.A0K     // Catch:{ Exception -> 0x04f3 }
            X.Vhv r10 = r5.A0N     // Catch:{ Exception -> 0x04f3 }
            X.VLG r12 = r5.A0T     // Catch:{ Exception -> 0x04f3 }
            X.Vh2 r13 = r5.A0U     // Catch:{ Exception -> 0x04f3 }
            X.V5Z r11 = r5.A0O     // Catch:{ Exception -> 0x04f3 }
            X.W1n r8 = new X.W1n     // Catch:{ Exception -> 0x04f3 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x04f3 }
            r5.A07 = r8     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r6 = r5.A0h     // Catch:{ Exception -> 0x04f3 }
            r6.put(r14, r8)     // Catch:{ Exception -> 0x04f3 }
            X.W1n r8 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            X.X93 r6 = r5.A05     // Catch:{ Exception -> 0x04f3 }
            r8.A04 = r6     // Catch:{ Exception -> 0x04f3 }
            r6.EqE(r8)     // Catch:{ Exception -> 0x04f3 }
            X.VgR r6 = r5.A0S     // Catch:{ Exception -> 0x04f3 }
            r6.A00 = r14     // Catch:{ Exception -> 0x04f3 }
            android.graphics.RectF r7 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            if (r7 == 0) goto L_0x0229
            android.graphics.RectF r6 = new android.graphics.RectF     // Catch:{ Exception -> 0x04f3 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x04f3 }
            r8.A03 = r6     // Catch:{ Exception -> 0x04f3 }
            X.W1n.A01(r8)     // Catch:{ Exception -> 0x04f3 }
            r5.A03 = r4     // Catch:{ Exception -> 0x04f3 }
        L_0x0229:
            X.Vik r6 = r5.A06     // Catch:{ Exception -> 0x04f3 }
            boolean r6 = r6.A00()     // Catch:{ Exception -> 0x04f3 }
            if (r6 == 0) goto L_0x025c
            X.W1n r8 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            X.WG9 r7 = r5.A0Q     // Catch:{ Exception -> 0x04f3 }
            X.8n7 r6 = r5.A0X     // Catch:{ Exception -> 0x04f3 }
            r8.A05(r7, r6)     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A06(r5)     // Catch:{ Exception -> 0x04f3 }
            X.7r6 r7 = r9.A00     // Catch:{ Exception -> 0x04f3 }
            r6 = 80
            boolean r6 = r7.CTO(r6)     // Catch:{ Exception -> 0x04f3 }
            if (r6 == 0) goto L_0x026e
            X.W1n r6 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            if (r6 == 0) goto L_0x025c
            X.8n3 r6 = r6.A06     // Catch:{ Exception -> 0x04f3 }
            int r7 = r6.BHc()     // Catch:{ Exception -> 0x04f3 }
            X.W1n r6 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r6 = r6.A06     // Catch:{ Exception -> 0x04f3 }
            int r6 = r6.BHR()     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A07(r5, r7, r6)     // Catch:{ Exception -> 0x04f3 }
        L_0x025c:
            X.7rD r9 = r5.A0a     // Catch:{ Exception -> 0x04f3 }
            X.7rK r8 = r9.Ajt()     // Catch:{ Exception -> 0x04f3 }
            if (r14 == 0) goto L_0x026c
            java.lang.String r6 = r14.BO5()     // Catch:{ Exception -> 0x04f3 }
        L_0x0268:
            r8.ETW(r6)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0287
        L_0x026c:
            r6 = r4
            goto L_0x0268
        L_0x026e:
            X.W1n r6 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            X.X7Q r6 = r6.A0C     // Catch:{ Exception -> 0x04f3 }
            int r8 = r6.Asw()     // Catch:{ Exception -> 0x04f3 }
            int r7 = r6.Asq()     // Catch:{ Exception -> 0x04f3 }
            X.VwD r6 = r5.A0M     // Catch:{ Exception -> 0x04f3 }
            r6.A03(r8, r7)     // Catch:{ Exception -> 0x04f3 }
            X.8tb r6 = r5.A08     // Catch:{ Exception -> 0x04f3 }
            if (r6 == 0) goto L_0x025c
            r6.DpU(r8, r7)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x025c
        L_0x0287:
            if (r14 == 0) goto L_0x0297
            int r7 = r14.BHc()     // Catch:{ Exception -> 0x04f3 }
            int r6 = r14.BHR()     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r4 = "x"
            java.lang.String r4 = X.002.A0P(r4, r7, r6)     // Catch:{ Exception -> 0x04f3 }
        L_0x0297:
            r8.ETX(r4)     // Catch:{ Exception -> 0x04f3 }
            if (r14 == 0) goto L_0x029f
            java.lang.String r12 = "media_pipeline_add_input"
            goto L_0x02a1
        L_0x029f:
            java.lang.String r12 = "media_pipeline_remove_input"
        L_0x02a1:
            int r4 = r5.hashCode()     // Catch:{ Exception -> 0x04f3 }
            long r10 = (long) r4     // Catch:{ Exception -> 0x04f3 }
            r14 = 0
            java.lang.String r13 = "RenderThreadManager"
            r9.CjJ(r10, r12, r13, r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x02ae:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ Exception -> 0x04f3 }
            r4.A0K(r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x02b7:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ Exception -> 0x04f3 }
            r4.A0L(r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x02c0:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.VUX r14 = (X.VUX) r14     // Catch:{ Exception -> 0x04f3 }
            r4.A0J(r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x02c9:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ Exception -> 0x04f3 }
            r4.A0M(r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x02d2:
            X.W3v r6 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.X93 r14 = (X.X93) r14     // Catch:{ Exception -> 0x04f3 }
            X.X93 r4 = r6.A05     // Catch:{ Exception -> 0x04f3 }
            r4.stop()     // Catch:{ Exception -> 0x04f3 }
            r6.A05 = r14     // Catch:{ Exception -> 0x04f3 }
            X.W1n r4 = r6.A07     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x02e9
            r4.A04 = r14     // Catch:{ Exception -> 0x04f3 }
            r14.EqE(r4)     // Catch:{ Exception -> 0x04f3 }
            r14.EqE(r4)     // Catch:{ Exception -> 0x04f3 }
        L_0x02e9:
            X.Vik r4 = r6.A06     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r4.A00()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.X93 r5 = r6.A05     // Catch:{ Exception -> 0x04f3 }
            X.WG9 r4 = r6.A0Q     // Catch:{ Exception -> 0x04f3 }
            r5.EwI(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x02fa:
            X.W3v r6 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.VgR r14 = (X.C17814VgR) r14     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r6.A0e     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r4.remove(r14)     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            java.util.ArrayList r4 = r14.A02     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A0A(r6, r4)     // Catch:{ Exception -> 0x04f3 }
            X.VwD r5 = r6.A0M     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r14.A01     // Catch:{ Exception -> 0x04f3 }
            r5.A05(r4)     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r5 = r6.A0h     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r4 = r14.A00     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r4 = r5.remove(r4)     // Catch:{ Exception -> 0x04f3 }
            X.W1n r4 = (X.W1n) r4     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            r4.A03()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x0323:
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ Exception -> 0x04f3 }
            X.W3v r8 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            r7 = r14[r6]     // Catch:{ Exception -> 0x04f3 }
            X.8n0 r7 = (X.C365378n0) r7     // Catch:{ Exception -> 0x04f3 }
            r6 = r14[r0]     // Catch:{ Exception -> 0x04f3 }
            X.8n3 r6 = (X.C365408n3) r6     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r5 = r8.A0h     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r5.containsKey(r6)     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            java.lang.Object r4 = r5.get(r6)     // Catch:{ Exception -> 0x04f3 }
            X.W1n r4 = (X.W1n) r4     // Catch:{ Exception -> 0x04f3 }
            r4.A05 = r7     // Catch:{ Exception -> 0x04f3 }
            X.Vik r4 = r8.A06     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r4.A00()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.C18812W3v.A06(r8)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x034c:
            X.W3v r6 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x04f3 }
            int r5 = r14.intValue()     // Catch:{ Exception -> 0x04f3 }
            int r4 = r6.A01     // Catch:{ Exception -> 0x04f3 }
            if (r4 == r5) goto L_0x04ed
            r6.A02 = r5     // Catch:{ Exception -> 0x04f3 }
            r6.A0G = r0     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x035e:
            X.W3v r5 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            int r4 = r5.A02     // Catch:{ Exception -> 0x04f3 }
            r5.A01 = r4     // Catch:{ Exception -> 0x04f3 }
            r5.A0G = r6     // Catch:{ Exception -> 0x04f3 }
            X.W1n r4 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.W1n.A01(r4)     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r5.A0f     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x0373:
            boolean r4 = r5.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            r5.next()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0373
        L_0x037d:
            X.W3v r9 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ Exception -> 0x04f3 }
            X.Vik r4 = r9.A06     // Catch:{ Exception -> 0x04f3 }
            boolean r6 = r4.A00()     // Catch:{ Exception -> 0x04f3 }
            if (r6 == 0) goto L_0x038e
            X.Vhv r4 = r9.A0N     // Catch:{ Exception -> 0x04f3 }
            r4.A00()     // Catch:{ Exception -> 0x04f3 }
        L_0x038e:
            X.Vhv r4 = r9.A0N     // Catch:{ Exception -> 0x04f3 }
            java.util.List r8 = r4.A02     // Catch:{ Exception -> 0x04f3 }
            r8.clear()     // Catch:{ Exception -> 0x04f3 }
            if (r14 == 0) goto L_0x03ab
            java.util.Iterator r5 = r14.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x039b:
            boolean r4 = r5.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x03ab
            java.lang.Object r4 = r5.next()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x039b
            r8.add(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x039b
        L_0x03ab:
            if (r6 == 0) goto L_0x04ed
            X.VwD r4 = r9.A0M     // Catch:{ Exception -> 0x04f3 }
            X.7ti r7 = r4.A0B     // Catch:{ Exception -> 0x04f3 }
            X.Vh1 r4 = r9.A0P     // Catch:{ Exception -> 0x04f3 }
            X.7s3 r6 = r4.A00     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x03b9:
            boolean r4 = r5.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            java.lang.Object r4 = r5.next()     // Catch:{ Exception -> 0x04f3 }
            X.X9O r4 = (X.X9O) r4     // Catch:{ Exception -> 0x04f3 }
            r4.CMh(r6, r7)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x03b9
        L_0x03c9:
            X.W3v r5 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = X.AnonymousClass7TE.A1a(r14)     // Catch:{ Exception -> 0x04f3 }
            r5.A0F = r4     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x03d3:
            X.W3v r6 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            android.graphics.RectF r14 = (android.graphics.RectF) r14     // Catch:{ Exception -> 0x04f3 }
            X.W1n r5 = r6.A07     // Catch:{ Exception -> 0x04f3 }
            if (r5 == 0) goto L_0x03ec
            android.graphics.RectF r4 = new android.graphics.RectF     // Catch:{ Exception -> 0x04f3 }
            r4.<init>(r14)     // Catch:{ Exception -> 0x04f3 }
            r5.A03 = r4     // Catch:{ Exception -> 0x04f3 }
            X.W1n.A01(r5)     // Catch:{ Exception -> 0x04f3 }
            X.W1n r4 = r6.A07     // Catch:{ Exception -> 0x04f3 }
            X.C18812W3v.A08(r6, r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x03ec:
            r6.A03 = r14     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x03f0:
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x04f3 }
            int r5 = r14.intValue()     // Catch:{ Exception -> 0x04f3 }
            X.W1n r4 = r4.A07     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            r4.A01 = r5     // Catch:{ Exception -> 0x04f3 }
            X.W1n.A01(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x0403:
            X.W3v r6 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.VLo r14 = (X.C17184VLo) r14     // Catch:{ Exception -> 0x04f3 }
            X.8tb r4 = r6.A08     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x040e
            r4.Dpb()     // Catch:{ Exception -> 0x04f3 }
        L_0x040e:
            X.9g7 r4 = r14.A00     // Catch:{ Exception -> 0x04f3 }
            if (r4 != 0) goto L_0x0419
            X.9g7 r4 = new X.9g7     // Catch:{ Exception -> 0x04f3 }
            r4.<init>()     // Catch:{ Exception -> 0x04f3 }
            r14.A00 = r4     // Catch:{ Exception -> 0x04f3 }
        L_0x0419:
            r6.A08 = r4     // Catch:{ Exception -> 0x04f3 }
            X.Vik r4 = r6.A06     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r4.A00()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.8tb r5 = r6.A08     // Catch:{ Exception -> 0x04f3 }
            X.VwD r4 = r6.A0M     // Catch:{ Exception -> 0x04f3 }
            X.7ti r4 = r4.A0B     // Catch:{ Exception -> 0x04f3 }
            r5.DpY(r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x042e:
            X.W3v r5 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            X.8KU r14 = (X.AnonymousClass8KU) r14     // Catch:{ Exception -> 0x04f3 }
            r4 = 0
            X.C18812W3v.A03(r4, r5, r14)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x0438:
            boolean r7 = X.AnonymousClass7TE.A1a(r14)     // Catch:{ Exception -> 0x04f3 }
            X.W3v r4 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            if (r7 == 0) goto L_0x0444
            r4.A0C = r0     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x0444:
            r4.A0C = r6     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x0448:
            boolean r4 = r14 instanceof java.lang.Float     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            X.W3v r7 = r5.A03     // Catch:{ Exception -> 0x04f3 }
            java.lang.Float r14 = (java.lang.Float) r14     // Catch:{ Exception -> 0x04f3 }
            float r6 = r14.floatValue()     // Catch:{ Exception -> 0x04f3 }
            float r4 = r7.A00     // Catch:{ Exception -> 0x04f3 }
            float r5 = X.AnonymousClass7TE.A00(r4, r6)     // Catch:{ Exception -> 0x04f3 }
            r4 = 8388608(0x800000, float:1.17549435E-38)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x04ed
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ed
            r7.A00 = r6     // Catch:{ Exception -> 0x04f3 }
            r7.A0E = r0     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x046b:
            monitor-exit(r5)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04ed
        L_0x046e:
            monitor-exit(r8)     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x04f3 }
            r4.<init>()     // Catch:{ Exception -> 0x04f3 }
            r7.A0M(r4)     // Catch:{ Exception -> 0x04f3 }
            X.7rD r8 = r7.A0a     // Catch:{ Exception -> 0x04f3 }
            int r4 = r7.hashCode()     // Catch:{ Exception -> 0x04f3 }
            long r9 = (long) r4     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r11 = "media_pipeline_stop"
            java.lang.String r12 = "RenderThreadManager"
            r13 = 0
            r8.CjJ(r9, r11, r12, r13)     // Catch:{ Exception -> 0x04f3 }
            X.Va6 r4 = r7.A0L     // Catch:{ Exception -> 0x04f3 }
            r4.A05 = r6     // Catch:{ Exception -> 0x04f3 }
            X.Vsd r4 = r4.A01     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x0491
            X.C18483Vsd.A00(r4)     // Catch:{ Exception -> 0x04f3 }
        L_0x0491:
            X.W1n r4 = r7.A07     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x0498
            r4.A03()     // Catch:{ Exception -> 0x04f3 }
        L_0x0498:
            X.8tZ r4 = r7.A0c     // Catch:{ Exception -> 0x04f3 }
            r4.Dpb()     // Catch:{ Exception -> 0x04f3 }
            X.VwD r4 = r7.A0M     // Catch:{ Exception -> 0x04f3 }
            r4.A02()     // Catch:{ Exception -> 0x04f3 }
            X.8tb r4 = r7.A08     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04a9
            r4.Dpb()     // Catch:{ Exception -> 0x04f3 }
        L_0x04a9:
            X.Vhv r4 = r7.A0N     // Catch:{ Exception -> 0x04f3 }
            r4.A00()     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r7.A0f     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r8 = r4.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x04b4:
            boolean r4 = r8.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04d6
            java.lang.Object r6 = r8.next()     // Catch:{ Exception -> 0x04f3 }
            X.8KU r6 = (X.AnonymousClass8KU) r6     // Catch:{ Exception -> 0x04f3 }
            r6.destroy()     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r6 instanceof X.C365198mh     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04d2
            X.8mh r6 = (X.C365198mh) r6     // Catch:{ Exception -> 0x04f3 }
            X.7sc r6 = r6.Bls()     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r4 = r7.A0g     // Catch:{ Exception -> 0x04f3 }
            r4.add(r6)     // Catch:{ Exception -> 0x04f3 }
        L_0x04d2:
            r8.remove()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04b4
        L_0x04d6:
            X.UHc r4 = r7.A04     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04df
            r4.release()     // Catch:{ Exception -> 0x04f3 }
            r7.A04 = r13     // Catch:{ Exception -> 0x04f3 }
        L_0x04df:
            X.Vh1 r4 = r7.A0P     // Catch:{ Exception -> 0x04f3 }
            r4.A00()     // Catch:{ Exception -> 0x04f3 }
            boolean r4 = r5.A07     // Catch:{ Exception -> 0x04f3 }
            if (r4 == 0) goto L_0x04ed
            android.os.HandlerThread r4 = r5.A01     // Catch:{ Exception -> 0x04f3 }
            r4.quit()     // Catch:{ Exception -> 0x04f3 }
        L_0x04ed:
            if (r2 == 0) goto L_0x055e
            r2.onSuccess()     // Catch:{ Exception -> 0x04f3 }
            return r0
        L_0x04f3:
            r4 = move-exception
            X.WG9 r6 = r3.A00
            X.Va6 r7 = r6.A02
            boolean r5 = r7.A04
            if (r5 == 0) goto L_0x0507
            boolean r5 = r7.A05
            if (r5 == 0) goto L_0x0507
            X.Vs3 r5 = r7.A00
            if (r5 == 0) goto L_0x0507
            X.C18455Vs3.A00(r5)
        L_0x0507:
            X.W3v r5 = r6.A03
            boolean r7 = r5.A0D
            if (r7 != 0) goto L_0x0543
            java.lang.String r8 = r4.getMessage()
            r7 = 30000(0x7530, float:4.2039E-41)
            X.UOx r9 = new X.UOx
            r9.<init>(r8, r4, r7)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>(r0)
            switch(r1) {
                case 3: goto L_0x055f;
                case 4: goto L_0x0562;
                case 5: goto L_0x0565;
                case 6: goto L_0x0568;
                case 7: goto L_0x056b;
                case 8: goto L_0x056e;
                case 9: goto L_0x0571;
                case 10: goto L_0x0574;
                case 11: goto L_0x0577;
                case 12: goto L_0x057a;
                case 13: goto L_0x0520;
                case 14: goto L_0x057d;
                case 15: goto L_0x0580;
                case 16: goto L_0x0520;
                case 17: goto L_0x0520;
                case 18: goto L_0x0520;
                case 19: goto L_0x0583;
                case 20: goto L_0x0520;
                case 21: goto L_0x0586;
                case 22: goto L_0x0589;
                case 23: goto L_0x058c;
                case 24: goto L_0x058f;
                case 25: goto L_0x0592;
                case 26: goto L_0x0595;
                case 27: goto L_0x0598;
                case 28: goto L_0x059b;
                case 29: goto L_0x059e;
                case 30: goto L_0x05a1;
                case 31: goto L_0x05a4;
                case 32: goto L_0x05a7;
                case 33: goto L_0x05ab;
                case 34: goto L_0x05af;
                case 35: goto L_0x05b3;
                case 36: goto L_0x05b7;
                default: goto L_0x0520;
            }
        L_0x0520:
            java.lang.String r7 = ""
            java.lang.String r7 = X.002.A0O(r7, r1)
        L_0x0526:
            java.lang.String r1 = "handler_msg"
            r14.put(r1, r7)
            X.7rD r8 = r6.A04
            int r1 = r3.hashCode()
            long r15 = (long) r1
            r1 = 3577(0xdf9, float:5.012E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r1)
            java.lang.String r11 = "RenderManagerHandlerCallback"
            java.lang.String r12 = "high"
            java.lang.String r13 = "RenderManagerHandlerCallback::handleMessage"
            r8.CjI(r9, r10, r11, r12, r13, r14, r15)
            r5.A0D = r0
        L_0x0543:
            if (r2 == 0) goto L_0x0548
            r2.onError(r4)
        L_0x0548:
            java.lang.ref.WeakReference r1 = r6.A06
            java.lang.Object r3 = r1.get()
            X.VLC r3 = (X.VLC) r3
            if (r3 == 0) goto L_0x055e
            X.VwH r1 = r3.A00
            android.os.Handler r2 = r1.A0G
            X.TFf r1 = new X.TFf
            r1.<init>(r3, r4)
            r2.post(r1)
        L_0x055e:
            return r0
        L_0x055f:
            java.lang.String r7 = "MSG_RENDER_FRAME"
            goto L_0x0526
        L_0x0562:
            java.lang.String r7 = "MSG_FRAME_AVAILABLE"
            goto L_0x0526
        L_0x0565:
            java.lang.String r7 = "MSG_PAUSE"
            goto L_0x0526
        L_0x0568:
            java.lang.String r7 = "MSG_RESUME"
            goto L_0x0526
        L_0x056b:
            java.lang.String r7 = "MSG_SET_INPUT"
            goto L_0x0526
        L_0x056e:
            java.lang.String r7 = "MSG_ADD_OUTPUTS"
            goto L_0x0526
        L_0x0571:
            java.lang.String r7 = "MSG_REMOVE_OUTPUTS"
            goto L_0x0526
        L_0x0574:
            java.lang.String r7 = "MSG_OUTPUT_SURFACE_CREATED"
            goto L_0x0526
        L_0x0577:
            java.lang.String r7 = "MSG_OUTPUT_SURFACE_DESTROYED"
            goto L_0x0526
        L_0x057a:
            java.lang.String r7 = "MSG_RENDERER_EVENT"
            goto L_0x0526
        L_0x057d:
            java.lang.String r7 = "MSG_DESTROY"
            goto L_0x0526
        L_0x0580:
            java.lang.String r7 = "MSG_SET_EFFECTS"
            goto L_0x0526
        L_0x0583:
            java.lang.String r7 = "MSG_SET_RENDER_CONTROLLER"
            goto L_0x0526
        L_0x0586:
            java.lang.String r7 = "MSG_ADD_ADDITIONAL_RENDER_PASS"
            goto L_0x0526
        L_0x0589:
            java.lang.String r7 = "MSG_REMOVE_ADDITIONAL_RENDER_PASS"
            goto L_0x0526
        L_0x058c:
            java.lang.String r7 = "MSG_SET_FRAMEPROCESSOR_MODE"
            goto L_0x0526
        L_0x058f:
            java.lang.String r7 = "MSG_ROTATION_START"
            goto L_0x0526
        L_0x0592:
            java.lang.String r7 = "MSG_ROTATION_END"
            goto L_0x0526
        L_0x0595:
            java.lang.String r7 = "MSG_SET_FRAMEPROCESSORS"
            goto L_0x0526
        L_0x0598:
            java.lang.String r7 = "MSG_SET_RENDERING_ENABLED"
            goto L_0x0526
        L_0x059b:
            java.lang.String r7 = "MSG_SET_INPUT_CROP"
            goto L_0x0526
        L_0x059e:
            java.lang.String r7 = "MSG_INPUT_ROTATION"
            goto L_0x0526
        L_0x05a1:
            java.lang.String r7 = "MSG_SET_CUSTOM_COPY_RENDERER"
            goto L_0x0526
        L_0x05a4:
            java.lang.String r7 = "MSG_FRAMEBUFFER_READY"
            goto L_0x0526
        L_0x05a7:
            java.lang.String r7 = "MSG_ENABLEDISABLE_CUSTOM_COPY_RENDERER"
            goto L_0x0526
        L_0x05ab:
            java.lang.String r7 = "MSG_SET_FRAME_BUFFER_MULTIPLIER"
            goto L_0x0526
        L_0x05af:
            java.lang.String r7 = "MSG_ENABLE_OUTPUT"
            goto L_0x0526
        L_0x05b3:
            java.lang.String r7 = "MSG_DISABLE_OUTPUT"
            goto L_0x0526
        L_0x05b7:
            java.lang.String r7 = "MSG_SET_METADATA_PROCESSOR"
            goto L_0x0526
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W68.handleMessage(android.os.Message):boolean");
    }
}
