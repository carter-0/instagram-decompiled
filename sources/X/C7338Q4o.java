package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Q4o  reason: case insensitive filesystem */
public final class C7338Q4o implements C13821Thq {
    public final SIY A00;
    public final /* synthetic */ STN A01;

    public C7338Q4o(SIY siy, STN stn) {
        this.A01 = stn;
        this.A00 = siy;
    }

    public final /* bridge */ /* synthetic */ void D0h(Object obj) {
        Exception exc = (Exception) obj;
        0qQ.A0B(exc, 0);
        SIY siy = this.A00;
        SIY.A00(siy, (Exception) null, "media_upload_cancel", (Map) null, siy.A02.now() - siy.A00);
        Long l = siy.A01;
        if (l != null) {
            long longValue = l.longValue();
            C10425Rs1 rs1 = siy.A03;
            if (rs1 != null) {
                rs1.A01.flowEndCancel(longValue, AnonymousClass000.A00(4169));
            }
        }
        STN stn = this.A01;
        synchronized (stn) {
            stn.A0M.D0h(exc);
            stn.A0L.D0O(exc);
            stn.A0J.A00.set((Object) null);
            STN.A01(stn);
        }
        C10955S2n s2n = stn.A0H.A0K;
        if (s2n != null) {
            s2n.A00("Cancelled upload");
        }
    }

    public final /* bridge */ /* synthetic */ void DEb(Object obj) {
        Exception exc = (Exception) obj;
        0qQ.A0B(exc, 0);
        this.A00.A02(exc);
        STN stn = this.A01;
        synchronized (stn) {
            List list = stn.A0O;
            int indexOf = list.indexOf(stn.A05) + 1;
            if (indexOf < list.size()) {
                stn.A05 = (C13828Thz) list.get(indexOf);
                stn.A00 = indexOf;
                STN.A03(stn);
                C13828Thz thz = stn.A05;
                if (thz != null) {
                    thz.FMV();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                STN.A05(stn, exc);
            }
        }
        C10955S2n s2n = stn.A0H.A0K;
        if (s2n != null) {
            s2n.A00("Failed upload");
        }
    }

    public final void DaE(float f) {
        STN stn = this.A01;
        synchronized (stn) {
            stn.A0M.DaE(f);
        }
    }

    public final void onStart() {
        this.A00.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017f, code lost:
        if ("".equals(r10) != false) goto L_0x0181;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r20
            X.S1w r2 = (X.C10940S1w) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r13 = 0
            r4 = r19
            X.RwT r7 = r2.A01     // Catch:{ JSONException -> 0x00be }
            X.RQK r0 = r7.A01     // Catch:{ JSONException -> 0x00be }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x00be }
            if (r1 == 0) goto L_0x0031
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00be }
            if (r0 <= 0) goto L_0x0031
            org.json.JSONObject r0 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r6 = "video_id"
            java.lang.String r5 = r0.optString(r6)     // Catch:{ JSONException -> 0x00be }
            X.SIY r0 = r4.A00     // Catch:{ JSONException -> 0x00be }
            java.util.Map r3 = r0.A04     // Catch:{ JSONException -> 0x00be }
            java.lang.String r1 = X.DbT.A11(r6, r3)     // Catch:{ JSONException -> 0x00be }
            if (r5 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003b
            goto L_0x0033
        L_0x0031:
            r5 = r13
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00be }
            if (r0 == 0) goto L_0x003e
        L_0x003b:
            r3.put(r6, r5)     // Catch:{ JSONException -> 0x00be }
        L_0x003e:
            java.util.Map r1 = r7.A02     // Catch:{ JSONException -> 0x00be }
            if (r5 != 0) goto L_0x00be
            boolean r0 = r1.isEmpty()     // Catch:{ JSONException -> 0x00be }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00be
            java.util.Iterator r0 = X.AnonymousClass7TF.A0v(r1)     // Catch:{ JSONException -> 0x00be }
            java.lang.Object r0 = r0.next()     // Catch:{ JSONException -> 0x00be }
            X.SJe r0 = (X.C11286SJe) r0     // Catch:{ JSONException -> 0x00be }
            if (r0 == 0) goto L_0x00be
            java.lang.String r1 = r0.A03     // Catch:{ JSONException -> 0x00be }
            if (r1 == 0) goto L_0x00be
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00be }
            if (r0 <= 0) goto L_0x00be
            org.json.JSONObject r1 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "media_id"
            java.lang.String r6 = r1.optString(r0)     // Catch:{ JSONException -> 0x00be }
            X.SIY r0 = r4.A00     // Catch:{ JSONException -> 0x00be }
            java.util.Map r5 = r0.A04     // Catch:{ JSONException -> 0x00be }
            java.lang.String r3 = "media_item_fbid"
            java.lang.String r1 = X.DbT.A11(r3, r5)     // Catch:{ JSONException -> 0x00be }
            if (r6 == 0) goto L_0x00be
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00be }
            if (r0 == 0) goto L_0x00be
        L_0x0082:
            java.lang.String r7 = "source_type"
            boolean r0 = r5.containsKey(r7)     // Catch:{ JSONException -> 0x00be }
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = X.DbT.A11(r7, r5)     // Catch:{ JSONException -> 0x00be }
            if (r0 == 0) goto L_0x00be
            int r0 = r0.length()     // Catch:{ JSONException -> 0x00be }
            if (r0 <= 0) goto L_0x00be
            java.lang.Object r1 = r5.get(r7)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "direct"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ JSONException -> 0x00be }
            if (r0 != 0) goto L_0x00be
            java.lang.Object r1 = r5.get(r7)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "direct_permanent"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ JSONException -> 0x00be }
            if (r0 != 0) goto L_0x00be
            java.lang.Object r1 = r5.get(r7)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "direct_ephemeral"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ JSONException -> 0x00be }
            if (r0 != 0) goto L_0x00be
            r5.put(r3, r6)     // Catch:{ JSONException -> 0x00be }
        L_0x00be:
            java.util.List r0 = r2.A02
            java.util.Iterator r6 = r0.iterator()
        L_0x00c4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r5 = r6.next()
            X.SRW r5 = (X.SRW) r5
            X.4aE r1 = r5.A0M
            X.4aE r0 = X.C266714aE.VIDEO
            if (r1 == r0) goto L_0x00da
            X.4aE r0 = X.C266714aE.MIXED
            if (r1 != r0) goto L_0x00c4
        L_0x00da:
            X.STN r0 = r4.A01
            X.S31 r1 = r0.A0G
            int r0 = r5.A08
            java.util.Map r3 = r1.A05
            java.lang.String r1 = X.S91.A00(r0)
            java.lang.String r0 = "target_color_space"
            r3.put(r0, r1)
            int r0 = r5.A09
            java.lang.String r1 = X.S91.A01(r0)
            java.lang.String r0 = "target_color_transfer"
            r3.put(r0, r1)
            goto L_0x00c4
        L_0x00f9:
            X.SIY r12 = r4.A00
            X.STN r3 = r4.A01
            X.S31 r0 = r3.A0G
            java.util.HashMap r15 = r0.A00()
            java.lang.String r14 = "media_upload_success"
            X.Tj9 r0 = r12.A02
            long r16 = r0.now()
            long r0 = r12.A00
            long r16 = r16 - r0
            X.SIY.A00(r12, r13, r14, r15, r16)
            X.Rs1 r1 = r12.A03
            if (r1 == 0) goto L_0x0124
            java.lang.Long r0 = r12.A01
            if (r0 == 0) goto L_0x0124
            long r4 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r0 = r1.A01
            r0.flowEndSuccess(r4)
        L_0x0124:
            monitor-enter(r3)
            X.Thq r0 = r3.A0M     // Catch:{ all -> 0x019d }
            r0.onSuccess(r2)     // Catch:{ all -> 0x019d }
            X.Tij r0 = r3.A0L     // Catch:{ all -> 0x019d }
            r0.DoG(r2)     // Catch:{ all -> 0x019d }
            X.TLG r0 = r3.A0J     // Catch:{ all -> 0x019d }
            java.util.concurrent.atomic.AtomicReference r0 = r0.A00     // Catch:{ all -> 0x019d }
            r0.set(r13)     // Catch:{ all -> 0x019d }
            X.STN.A01(r3)     // Catch:{ all -> 0x019d }
            monitor-exit(r3)
            X.RzP r0 = r3.A0H
            X.S2n r1 = r0.A0K
            if (r1 == 0) goto L_0x019c
            java.lang.String r9 = r3.A0N     // Catch:{ all -> 0x018f }
            X.SFy r4 = r0.A05     // Catch:{ all -> 0x018f }
            X.S1R r0 = r0.A0N     // Catch:{ all -> 0x018f }
            X.SmU r5 = new X.SmU     // Catch:{ all -> 0x018f }
            r5.<init>(r0)     // Catch:{ all -> 0x018f }
            java.lang.Integer r8 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x018f }
            X.RuQ r7 = r1.A01     // Catch:{ all -> 0x018f }
            X.S5Y r6 = r1.A00     // Catch:{ all -> 0x018f }
            X.Rdp r0 = r1.A02     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0181
            X.RwT r0 = r2.A01     // Catch:{ all -> 0x018f }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x018f }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x018f }
        L_0x015d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0181
            java.lang.Object r0 = X.C51971G9r.A0p(r3)     // Catch:{ all -> 0x018f }
            X.SJe r0 = (X.C11286SJe) r0     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x018f }
            org.json.JSONObject r2 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r0 = "media_id"
            java.lang.String r10 = r2.optString(r0)     // Catch:{ JSONException -> 0x015d }
            X.0qQ.A07(r10)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r10)     // Catch:{ JSONException -> 0x015d }
            if (r0 == 0) goto L_0x0182
        L_0x0181:
            r10 = r13
        L_0x0182:
            java.util.Collection r12 = r1.A04     // Catch:{ all -> 0x018f }
            java.lang.String r11 = r1.A03     // Catch:{ all -> 0x018f }
            X.SOM r3 = new X.SOM     // Catch:{ all -> 0x018f }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x018f }
            r3.A02()     // Catch:{ all -> 0x018f }
            return
        L_0x018f:
            r17 = move-exception
            X.S5Y r12 = r1.A00
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r15 = r13
            r16 = r13
            r18 = r13
            r12.A00(r13, r14, r15, r16, r17, r18)
        L_0x019c:
            return
        L_0x019d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7338Q4o.onSuccess(java.lang.Object):void");
    }
}
