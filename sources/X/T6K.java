package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;

public final class T6K implements 1Qd {
    public 2ZD A00;
    public ByteArrayOutputStream A01 = Pxe.A0b();
    public boolean A02;
    public final RVG A03;
    public final WeakReference A04;
    public final C9141RQs A05;

    public final void onFailed(IOException iOException) {
        0qQ.A0B(iOException, 0);
        0KC.A0F("IgHttpRequestCallback", "onFailed()", iOException);
        S1R s1r = (S1R) this.A04.get();
        if (s1r != null) {
            RVG rvg = this.A03;
            0qQ.A0B(rvg, 0);
            s1r.A01.remove(rvg);
        }
        this.A05.A00(iOException, 0Yt.A0E(), 0, true);
    }

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        if (!this.A02) {
            try {
                JTU.A1I(this.A01, byteBuffer);
            } catch (Exception e) {
                this.A02 = true;
                0KC.A05(S1R.class, "Exception while writing response stream", e);
            }
        }
    }

    public final void onResponseStarted(2ZD r3) {
        0qQ.A0B(r3, 0);
        this.A00 = r3;
        Collections.unmodifiableList(r3.A03);
        this.A01 = Pxe.A0b();
        this.A02 = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.RxC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: X.RxC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.RxC} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:90|91|92) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (r12 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f8, code lost:
        throw new java.lang.Exception(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01f3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4 A[Catch:{ IOException -> 0x011b, RKB -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ IOException -> 0x011b, RKB -> 0x0121 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r28 = this;
            r7 = r28
            java.io.ByteArrayOutputStream r0 = r7.A01
            java.lang.String r0 = X.DbT.A10(r0)
            X.2ZD r1 = r7.A00
            r4 = 0
            r10 = 1
            if (r1 == 0) goto L_0x0058
            int r5 = r1.A01
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 < r1) goto L_0x0018
            r1 = 300(0x12c, float:4.2E-43)
            if (r5 < r1) goto L_0x0058
        L_0x0018:
            r2 = 0
            r1 = 400(0x190, float:5.6E-43)
            if (r1 > r5) goto L_0x0022
            r1 = 500(0x1f4, float:7.0E-43)
            if (r5 >= r1) goto L_0x0022
            r2 = 1
        L_0x0022:
            r3 = r2 ^ 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "status code: %s\n%s"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            X.RQs r2 = r7.A05
            org.apache.http.client.HttpResponseException r1 = new org.apache.http.client.HttpResponseException
            r1.<init>(r5, r0)
            java.lang.Exception r1 = (java.lang.Exception) r1
            X.0sm r0 = X.0Yt.A0E()
            r2.A00(r1, r0, r5, r3)
        L_0x0043:
            java.lang.ref.WeakReference r0 = r7.A04
            java.lang.Object r0 = r0.get()
            X.S1R r0 = (X.S1R) r0
            if (r0 == 0) goto L_0x0057
            X.RVG r1 = r7.A03
            X.0qQ.A0B(r1, r4)
            java.util.Map r0 = r0.A01
            r0.remove(r1)
        L_0x0057:
            return
        L_0x0058:
            boolean r1 = r7.A02
            if (r1 != 0) goto L_0x02bb
            X.RQs r3 = r7.A05
            X.0sm r6 = X.0Yt.A0E()
            boolean r1 = r3 instanceof X.QN9
            if (r1 == 0) goto L_0x012e
            X.QN9 r3 = (X.QN9) r3
            int r12 = X.DbW.A02(r4, r0, r6)
            java.util.concurrent.atomic.AtomicReference r8 = r3.A02
            java.lang.Object r5 = r8.get()
            X.STJ r5 = (X.STJ) r5
            if (r5 == 0) goto L_0x020d
            boolean r13 = r3.A03
            X.TlS r9 = r5.A02     // Catch:{ RKB -> 0x0121 }
            r9.DFl(r0, r6, r13)     // Catch:{ RKB -> 0x0121 }
            int r1 = r0.length()     // Catch:{ IOException -> 0x011b }
            if (r1 <= 0) goto L_0x0093
            X.16F r1 = X.16P.A00(r0)     // Catch:{ IOException -> 0x011b }
            X.RxC r11 = X.RVJ.parseFromJson(r1)     // Catch:{ IOException -> 0x011b }
            if (r11 != 0) goto L_0x0098
            X.RKB r1 = new X.RKB     // Catch:{ IOException -> 0x011b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x011b }
        L_0x0092:
            throw r1     // Catch:{ IOException -> 0x011b }
        L_0x0093:
            X.RxC r11 = new X.RxC     // Catch:{ IOException -> 0x011b }
            r11.<init>()     // Catch:{ IOException -> 0x011b }
        L_0x0098:
            X.SFy r2 = r5.A04     // Catch:{ IOException -> 0x011b }
            X.KjI r1 = r2.A03     // Catch:{ IOException -> 0x011b }
            java.lang.Integer r1 = r1.A00     // Catch:{ IOException -> 0x011b }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x011b }
            if (r1 == r10) goto L_0x00a9
            if (r1 != r12) goto L_0x00ad
            java.lang.String r12 = r11.A00     // Catch:{ IOException -> 0x011b }
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r12 = r11.A01     // Catch:{ IOException -> 0x011b }
        L_0x00ab:
            if (r12 != 0) goto L_0x00af
        L_0x00ad:
            java.lang.String r12 = ""
        L_0x00af:
            X.SEg r1 = r2.A02     // Catch:{ IOException -> 0x011b }
            boolean r1 = r1.A01     // Catch:{ IOException -> 0x011b }
            if (r1 != 0) goto L_0x00e8
            java.lang.Integer r16 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x011b }
        L_0x00b7:
            long r1 = r5.A01     // Catch:{ IOException -> 0x011b }
            java.lang.String r3 = r11.A03     // Catch:{ IOException -> 0x011b }
            r17 = r3
            java.lang.String r15 = r11.A02     // Catch:{ IOException -> 0x011b }
            java.util.HashMap r14 = r11.A04     // Catch:{ IOException -> 0x011b }
            X.RrU r3 = r5.A06     // Catch:{ IOException -> 0x011b }
            java.util.ArrayList r11 = r3.A01     // Catch:{ IOException -> 0x011b }
            java.net.URI r3 = r5.A03     // Catch:{ IOException -> 0x011b }
            if (r3 == 0) goto L_0x00f0
            java.lang.String r21 = r3.getHost()     // Catch:{ IOException -> 0x011b }
            if (r21 == 0) goto L_0x00f0
            X.SJe r3 = new X.SJe     // Catch:{ IOException -> 0x011b }
            r25 = r4
            r26 = r1
            r22 = r11
            r23 = r14
            r24 = r6
            r18 = r0
            r19 = r17
            r20 = r15
            r15 = r3
            r17 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x011b }
            goto L_0x00f5
        L_0x00e8:
            if (r13 == 0) goto L_0x00ed
            java.lang.Integer r16 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x011b }
            goto L_0x00b7
        L_0x00ed:
            java.lang.Integer r16 = X.AnonymousClass05K.A0C     // Catch:{ IOException -> 0x011b }
            goto L_0x00b7
        L_0x00f0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ IOException -> 0x011b }
            goto L_0x0092
        L_0x00f5:
            if (r13 == 0) goto L_0x010a
            long r1 = r5.A00     // Catch:{ RKB -> 0x0121 }
            r5.A00 = r1     // Catch:{ RKB -> 0x0121 }
            r9.Czl(r1)     // Catch:{ RKB -> 0x0121 }
            long r1 = r5.A00     // Catch:{ RKB -> 0x0121 }
            float r12 = (float) r1     // Catch:{ RKB -> 0x0121 }
            X.SSw r1 = r5.A05     // Catch:{ RKB -> 0x0121 }
            long r1 = r1.A00     // Catch:{ RKB -> 0x0121 }
            float r11 = (float) r1     // Catch:{ RKB -> 0x0121 }
            float r12 = r12 / r11
            r9.DaE(r12)     // Catch:{ RKB -> 0x0121 }
        L_0x010a:
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.DaE(r1)     // Catch:{ RKB -> 0x0121 }
            r9.D5G(r3)     // Catch:{ RKB -> 0x0121 }
            r1 = 0
            r5.A09 = r1     // Catch:{ RKB -> 0x0121 }
            r5.A0A = r1     // Catch:{ RKB -> 0x0121 }
            r5.A0B = r1     // Catch:{ RKB -> 0x0121 }
            goto L_0x020d
        L_0x011b:
            X.RKB r1 = new X.RKB     // Catch:{ RKB -> 0x0121 }
            r1.<init>()     // Catch:{ RKB -> 0x0121 }
            throw r1     // Catch:{ RKB -> 0x0121 }
        L_0x0121:
            r12 = move-exception
            r17 = -1
            java.lang.String r1 = "Failed to parse offset from POST response:"
            java.lang.String r14 = X.002.A0R(r1, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x0204
        L_0x012e:
            boolean r1 = r3 instanceof X.QNC
            if (r1 == 0) goto L_0x01b5
            X.QNC r3 = (X.QNC) r3
            X.0qQ.A0B(r0, r4)
            X.RuM r2 = r3.A00
            java.util.Map r11 = r2.A02
            java.lang.String r1 = "server_response"
            r11.put(r1, r0)
            X.Tj9 r8 = r2.A01
            long r1 = r2.A00
            long r12 = X.C13886Tj9.A00(r8, r1)
            java.lang.String r10 = "media_upload_fetch_upload_settings_success"
            r9 = 0
            X.C9596Rda.A00(r8, r9, r10, r11, r12)
            org.json.JSONObject r2 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x0195 }
            java.lang.String r1 = "transcode_dimension"
            int r12 = r2.optInt(r1)     // Catch:{ JSONException -> 0x0195 }
            java.lang.String r1 = "transcode_bit_rate_bps"
            int r13 = r2.optInt(r1)     // Catch:{ JSONException -> 0x0195 }
            java.lang.String r1 = "should_expand_to_transcode_dimension"
            boolean r15 = r2.optBoolean(r1)     // Catch:{ JSONException -> 0x0195 }
            java.lang.String r1 = "gop_size_seconds"
            int r14 = r2.optInt(r1)     // Catch:{ JSONException -> 0x0195 }
            X.Rzh r8 = X.SJC.A06     // Catch:{ JSONException -> 0x0195 }
            X.Q0d r9 = r3.A01     // Catch:{ JSONException -> 0x0195 }
            X.RzP r5 = r3.A03     // Catch:{ JSONException -> 0x0195 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r3.A02     // Catch:{ JSONException -> 0x0195 }
            boolean r1 = r3.A07     // Catch:{ JSONException -> 0x0195 }
            r16 = r1
            r10 = r2
            r11 = r5
            java.util.ArrayList r2 = r8.A00(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x0195 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.facebook.videolite.uploader.StrategyConfig>"
            X.0qQ.A0C(r2, r1)     // Catch:{ JSONException -> 0x0195 }
            java.util.List r6 = X.0u4.A01(r2)     // Catch:{ JSONException -> 0x0195 }
            if (r6 == 0) goto L_0x019b
            X.Tij r2 = r3.A05
            java.util.Map r1 = r3.A06
            r2.DFQ(r1, r0)
            goto L_0x019f
        L_0x0195:
            r1 = move-exception
            X.Tij r0 = r3.A05
            r0.DFP(r1)
        L_0x019b:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
        L_0x019f:
            X.RzP r5 = r3.A03
            X.TdR r2 = r5.A00
            X.Q0d r1 = r3.A01
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r3.A02
            java.util.List r0 = r2.Avn(r1, r0, r5)
            r6.addAll(r0)
            X.Tfy r0 = r3.A04
            r0.D56(r6)
            goto L_0x0043
        L_0x01b5:
            boolean r1 = r3 instanceof X.QN6
            if (r1 == 0) goto L_0x0213
            X.QN6 r3 = (X.QN6) r3
            X.DbY.A1S(r0, r6)
            java.util.concurrent.atomic.AtomicReference r8 = r3.A01
            java.lang.Object r5 = r8.get()
            X.STJ r5 = (X.STJ) r5
            if (r5 == 0) goto L_0x020d
            X.TlS r1 = r5.A02     // Catch:{ RKB -> 0x01f9 }
            r1.DFh(r0, r6)     // Catch:{ RKB -> 0x01f9 }
            X.16F r1 = X.16P.A00(r0)     // Catch:{ IOException -> 0x01f3 }
            X.RrV r9 = X.RVI.parseFromJson(r1)     // Catch:{ IOException -> 0x01f3 }
            if (r9 == 0) goto L_0x01ed
            long r1 = r9.A00     // Catch:{ IOException -> 0x01f3 }
            r11 = 0
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x01ed
            boolean r3 = r9.A01     // Catch:{ RKB -> 0x01f9 }
            if (r3 == 0) goto L_0x01e9
            X.SSw r1 = r5.A05     // Catch:{ RKB -> 0x01f9 }
            long r1 = r1.A00     // Catch:{ RKB -> 0x01f9 }
            r9.A00 = r1     // Catch:{ RKB -> 0x01f9 }
        L_0x01e9:
            X.STJ.A02(r5, r1, r3)     // Catch:{ RKB -> 0x01f9 }
            goto L_0x020d
        L_0x01ed:
            X.RKB r1 = new X.RKB     // Catch:{ IOException -> 0x01f3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01f3 }
            throw r1     // Catch:{ IOException -> 0x01f3 }
        L_0x01f3:
            X.RKB r1 = new X.RKB     // Catch:{ RKB -> 0x01f9 }
            r1.<init>(r0)     // Catch:{ RKB -> 0x01f9 }
            throw r1     // Catch:{ RKB -> 0x01f9 }
        L_0x01f9:
            r12 = move-exception
            r17 = -1
            java.lang.String r1 = "Failed to parse offset from GET response:"
            java.lang.String r14 = X.002.A0R(r1, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A00
        L_0x0204:
            r11 = r5
            r15 = r6
            r16 = r4
            r19 = r10
            X.STJ.A03(r11, r12, r13, r14, r15, r16, r17, r19)
        L_0x020d:
            r0 = 0
            r8.set(r0)
            goto L_0x0043
        L_0x0213:
            boolean r1 = r3 instanceof X.QN5
            if (r1 == 0) goto L_0x0223
            X.QN5 r3 = (X.QN5) r3
            X.DbY.A1S(r0, r6)
            X.Tfx r1 = r3.A00
            r1.D5I(r0, r4, r6)
            goto L_0x0043
        L_0x0223:
            boolean r1 = r3 instanceof X.QN8
            if (r1 == 0) goto L_0x0234
            X.QN8 r3 = (X.QN8) r3
            X.Tbj r2 = r3.A01
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r3.A03
        L_0x022f:
            r2.Dge(r1, r0)
            goto L_0x0043
        L_0x0234:
            boolean r1 = r3 instanceof X.QN7
            if (r1 == 0) goto L_0x0241
            X.QN7 r3 = (X.QN7) r3
            X.Tbj r2 = r3.A01
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r3.A03
            goto L_0x022f
        L_0x0241:
            boolean r1 = r3 instanceof X.QNB
            if (r1 == 0) goto L_0x0280
            X.QNB r3 = (X.QNB) r3
            X.0qQ.A0B(r0, r4)
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ Exception -> 0x026c }
            java.lang.String r0 = "output_url"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x026c }
            java.net.URI r2 = new java.net.URI     // Catch:{ Exception -> 0x026c }
            r2.<init>(r0)     // Catch:{ Exception -> 0x026c }
            java.lang.String r0 = "edit_id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x026c }
            X.ThC r0 = r3.A01     // Catch:{ Exception -> 0x026c }
            if (r0 == 0) goto L_0x0043
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x026c }
            r0.DBL(r1, r2)     // Catch:{ Exception -> 0x026c }
            goto L_0x0043
        L_0x026c:
            r5 = move-exception
            X.ThC r2 = r3.A01
            if (r2 == 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Oil uri parsing failed: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            r2.DBM(r0)
            goto L_0x0043
        L_0x0280:
            X.QNA r3 = (X.QNA) r3
            X.0qQ.A0B(r0, r4)
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = "output_url"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x02a7 }
            java.net.URI r2 = new java.net.URI     // Catch:{ Exception -> 0x02a7 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = "edit_id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x02a7 }
            X.ThC r0 = r3.A01     // Catch:{ Exception -> 0x02a7 }
            if (r0 == 0) goto L_0x0043
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x02a7 }
            r0.DBL(r1, r2)     // Catch:{ Exception -> 0x02a7 }
            goto L_0x0043
        L_0x02a7:
            r5 = move-exception
            X.ThC r2 = r3.A01
            if (r2 == 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Oil uri parsing failed: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            r2.DBM(r0)
            goto L_0x0043
        L_0x02bb:
            X.RQs r2 = r7.A05
            java.lang.String r0 = "Response stream not initialized correctly"
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)
            X.0sm r0 = X.0Yt.A0E()
            r2.A00(r1, r0, r4, r10)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T6K.onComplete():void");
    }

    public T6K(RVG rvg, C9141RQs rQs, WeakReference weakReference) {
        this.A05 = rQs;
        this.A03 = rvg;
        this.A04 = weakReference;
    }
}
