package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class STT {
    public RQK A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public C8890REh A05 = C8890REh.NOT_STARTED;
    public final int A06;
    public final C11224SFy A07;
    public final C66498MUb A08;
    public final C7232Q0d A09;
    public final C10864RzP A0A;
    public final C13820Thp A0B;
    public final C10747RxR A0C;
    public final String A0D;
    public final String A0E;
    public final Map A0F = AnonymousClass7TE.A1E();
    public final Map A0G = AnonymousClass7TE.A1E();
    public final Set A0H = AnonymousClass7TE.A1F();
    public final Set A0I = AnonymousClass7TE.A1F();
    public final Set A0J = AnonymousClass7TE.A1F();
    public final ExecutorService A0K;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.Thp, java.lang.Object, X.SsY] */
    public STT(C66498MUb mUb, C7232Q0d q0d, S31 s31, C10864RzP rzP, C13820Thp thp, C10747RxR rxR, ExecutorService executorService, int i) {
        0qQ.A0B(s31, 1);
        AnonymousClass7TG.A1S(mUb, executorService);
        this.A06 = i;
        this.A08 = mUb;
        this.A0K = executorService;
        this.A0A = rzP;
        this.A0C = rxR;
        this.A09 = q0d;
        Map map = s31.A05;
        this.A0D = 002.A0T(DbT.A11("waterfall_id", map), DbT.A11("asset_id", map), '_');
        this.A0E = s31.A04;
        this.A07 = rzP.A05;
        ? obj = new Object();
        obj.A00 = thp;
        this.A0B = obj;
    }

    public static final synchronized void A01(C11286SJe sJe, C11284SJc sJc, STT stt) {
        long j;
        synchronized (stt) {
            C11284SJc sJc2 = sJc;
            stt.A0G.remove(sJc);
            stt.A0J.remove(sJc);
            stt.A0I.add(sJc);
            stt.A0F.put(sJc, sJe);
            C10747RxR rxR = stt.A0C;
            C11187SEn sEn = rxR.A02;
            synchronized (sEn) {
                Long A0o = Pxe.A0o(sJc, sEn.A01);
                if (A0o != null) {
                    j = A0o.longValue();
                } else {
                    j = 0;
                }
                C11187SEn.A00(sJc2, sEn, (Exception) null, "media_upload_chunk_transfer_success", (JSONObject) null, C13886Tj9.A00(sEn.A00, j));
            }
            rxR.A01.EKC();
            rxR.A04.Dii(sJe, sJc);
            stt.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (X.STq.A06(r9) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A02(X.RQK r11, X.STT r12) {
        /*
            monitor-enter(r12)
            X.REh r0 = X.C8890REh.DONE     // Catch:{ all -> 0x007b }
            r12.A05 = r0     // Catch:{ all -> 0x007b }
            X.RxR r4 = r12.A0C     // Catch:{ all -> 0x007b }
            X.Thz r3 = r4.A01     // Catch:{ all -> 0x007b }
            r3.EKC()     // Catch:{ all -> 0x007b }
            X.RxQ r2 = r4.A03     // Catch:{ all -> 0x007b }
            long r0 = r2.A00     // Catch:{ all -> 0x007b }
            X.Tj9 r5 = r2.A03     // Catch:{ all -> 0x007b }
            long r9 = X.C13886Tj9.A00(r5, r0)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "media_post_success"
            r6 = 0
            java.util.Map r8 = r2.A04     // Catch:{ all -> 0x007b }
            X.C9596Rda.A00(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007b }
            X.RQK r6 = r12.A00     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x0076
            java.util.Map r5 = r12.A0F     // Catch:{ all -> 0x007b }
            X.RzP r9 = r12.A0A     // Catch:{ all -> 0x007b }
            X.Rp9 r0 = r9.A0J     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x004f
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r0.A00     // Catch:{ all -> 0x007b }
            boolean r0 = X.STq.A03(r10)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0064
            X.4aE r9 = X.C266714aE.VIDEO     // Catch:{ all -> 0x007b }
            X.4aI r0 = X.STq.A00(r9, r10)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x004d
            long r0 = r0.A02     // Catch:{ all -> 0x007b }
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x004d
            boolean r0 = X.STq.A03(r10)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0064
            X.STq.A00(r9, r10)     // Catch:{ all -> 0x007b }
            goto L_0x0064
        L_0x004d:
            r0 = 0
            goto L_0x0065
        L_0x004f:
            long r0 = r9.A04     // Catch:{ all -> 0x007b }
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0064
            long r1 = r9.A03     // Catch:{ all -> 0x007b }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            boolean r1 = X.STq.A06(r9)     // Catch:{ all -> 0x007b }
            r0 = 0
            if (r1 == 0) goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            X.RwT r2 = new X.RwT     // Catch:{ all -> 0x007b }
            r2.<init>(r6, r11, r5, r0)     // Catch:{ all -> 0x007b }
            X.Tij r1 = r4.A04     // Catch:{ all -> 0x007b }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.Dtc(r0)     // Catch:{ all -> 0x007b }
            r3.Dvj(r2)     // Catch:{ all -> 0x007b }
            monitor-exit(r12)
            return
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STT.A02(X.RQK, X.STT):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(10:3|4|(1:6)|7|8|(1:10)|11|12|(1:14)|15)|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A03(X.RQK r11, X.STT r12) {
        /*
            monitor-enter(r12)
            r12.A00 = r11     // Catch:{ all -> 0x0064 }
            X.RxR r1 = r12.A0C     // Catch:{ all -> 0x0064 }
            X.Thz r0 = r1.A01     // Catch:{ all -> 0x0064 }
            r0.EKC()     // Catch:{ all -> 0x0064 }
            X.RxQ r6 = r1.A03     // Catch:{ all -> 0x0064 }
            java.lang.String r8 = "video_id"
            java.lang.String r7 = "upload_session_id"
            java.lang.String r5 = "stream_id"
            java.lang.String r9 = ""
            r4 = 0
            java.lang.String r0 = r11.A00     // Catch:{ JSONException -> 0x0043 }
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x0043 }
            java.lang.String r3 = r1.optString(r5, r9)     // Catch:{ JSONException -> 0x0043 }
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0043 }
            if (r0 != 0) goto L_0x0029
            r3 = r4
        L_0x0029:
            java.lang.String r2 = r1.optString(r7, r9)     // Catch:{ JSONException -> 0x0041 }
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0041 }
            if (r0 != 0) goto L_0x0034
            r2 = r4
        L_0x0034:
            java.lang.String r1 = r1.optString(r8, r9)     // Catch:{ JSONException -> 0x0045 }
            int r0 = r1.length()     // Catch:{ JSONException -> 0x0045 }
            if (r0 != 0) goto L_0x003f
            r1 = r4
        L_0x003f:
            r4 = r1
            goto L_0x0045
        L_0x0041:
            r2 = r4
            goto L_0x0045
        L_0x0043:
            r3 = r4
            r2 = r4
        L_0x0045:
            java.util.Map r9 = r6.A04     // Catch:{ all -> 0x0064 }
            r9.put(r5, r3)     // Catch:{ all -> 0x0064 }
            r9.put(r7, r2)     // Catch:{ all -> 0x0064 }
            r9.put(r8, r4)     // Catch:{ all -> 0x0064 }
            long r0 = r6.A02     // Catch:{ all -> 0x0064 }
            X.Tj9 r6 = r6.A03     // Catch:{ all -> 0x0064 }
            long r10 = X.C13886Tj9.A00(r6, r0)     // Catch:{ all -> 0x0064 }
            r7 = 0
            java.lang.String r8 = "media_upload_init_success"
            X.C9596Rda.A00(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0064 }
            r12.A00()     // Catch:{ all -> 0x0064 }
            monitor-exit(r12)
            return
        L_0x0064:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STT.A03(X.RQK, X.STT):void");
    }

    public static final synchronized void A04(C11284SJc sJc, STT stt, Exception exc, Map map, int i) {
        C11284SJc sJc2;
        long j;
        synchronized (stt) {
            C11187SEn sEn = stt.A0C.A02;
            synchronized (sEn) {
                sJc2 = sJc;
                Long A0o = Pxe.A0o(sJc, sEn.A01);
                if (A0o != null) {
                    j = A0o.longValue();
                } else {
                    j = 0;
                }
                JSONObject jSONObject = null;
                Exception exc2 = exc;
                if (exc instanceof C8989RKf) {
                    try {
                        jSONObject = DbS.A11();
                        jSONObject.put("transfered_bytes", String.valueOf(((C8989RKf) exc2).A01));
                    } catch (JSONException unused) {
                    }
                }
                C11187SEn.A00(sJc2, sEn, exc2, "media_upload_chunk_transfer_failure", jSONObject, C13886Tj9.A00(sEn.A00, j));
            }
            stt.A0G.remove(sJc2);
            stt.A0J.remove(sJc2);
            A05(stt, exc, map, i);
        }
    }

    public static final synchronized void A05(STT stt, Exception exc, Map map, int i) {
        synchronized (stt) {
            stt.A05 = C8890REh.FAILED;
            C10747RxR rxR = stt.A0C;
            0qQ.A0B(map, 2);
            C10542Rtw rtw = rxR.A00;
            C13886Tj9 tj9 = rtw.A01;
            long now = tj9.now() - rtw.A00;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.putAll(rtw.A02);
            Pxh.A1Q(exc, A1E);
            if (now >= 0) {
                A1E.put("elapsed_time", String.valueOf(now));
            }
            tj9.logEvent("media_upload_transfer_failure", A1E);
            rxR.A01.Dta(exc);
            C13863Tij tij = rxR.A04;
            tij.Dif(exc);
            tij.DtZ(exc, new LinkedHashMap(map), i);
        }
    }

    public final synchronized void A06() {
        C8890REh rEh = this.A05;
        C8890REh rEh2 = C8890REh.CANCELED;
        if (rEh != rEh2) {
            C13820Thp thp = this.A0B;
            if (!(thp == null || this.A00 == null)) {
                C12381SsV ssV = new C12381SsV(new C12382SsW((C11286SJe) null, (C11284SJc) null, this, AnonymousClass05K.A0N), this.A0K);
                RQK rqk = this.A00;
                if (rqk != null) {
                    thp.ELR(rqk, ssV);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            Iterator A0v = AnonymousClass7TF.A0v(this.A0G);
            while (A0v.hasNext()) {
                this.A08.AGB((C66373MPe) A0v.next());
            }
            this.A05 = rEh2;
        }
    }

    public final synchronized void A07() {
        IllegalStateException illegalStateException;
        if (!this.A04) {
            illegalStateException = AnonymousClass7TE.A0z("UploadJob.start() not called.");
        } else if (C66580MXl.A1b(this.A0H)) {
            this.A01 = true;
            A00();
        } else {
            illegalStateException = AnonymousClass7TE.A0z("UploadJob.addSegments() not called.");
        }
        throw illegalStateException;
    }

    public final synchronized void A08() {
        this.A04 = true;
        C10747RxR rxR = this.A0C;
        C10542Rtw rtw = rxR.A00;
        C13886Tj9 tj9 = rtw.A01;
        rtw.A00 = tj9.now();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.putAll(rtw.A02);
        tj9.logEvent("media_upload_transfer_start", A1E);
        rxR.A04.Dte();
        A00();
    }

    public final synchronized void A09(C11284SJc sJc) {
        if (this.A04) {
            this.A0H.add(sJc);
            A00();
        } else {
            throw AnonymousClass7TE.A0z("UploadJob.start() not called.");
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.RQK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v23, types: [X.RQK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (((X.RC3) r4).A02 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0223, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0224, code lost:
        r1 = java.util.Collections.emptyMap();
        X.0qQ.A07(r1);
        A05(r0, r2, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x022f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0230, code lost:
        A05(r0, r3, r3.A04, r3.A00);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0108 A[Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155 A[Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015b A[SYNTHETIC, Splitter:B:56:0x015b] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0173 A[SYNTHETIC, Splitter:B:62:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019f A[Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a2 A[Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ac A[Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0223 A[ExcHandler: RJe | JSONException (r2v13 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:29:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r41 = this;
            r0 = r41
            X.REh r2 = r0.A05
            X.REh r1 = X.C8890REh.DONE
            if (r2 == r1) goto L_0x032c
            X.REh r1 = X.C8890REh.FAILED
            if (r2 == r1) goto L_0x032c
            X.REh r1 = X.C8890REh.CANCELED
            if (r2 == r1) goto L_0x032c
            X.REh r1 = X.C8890REh.NOT_STARTED
            if (r2 != r1) goto L_0x001c
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x001c
            X.REh r2 = X.C8890REh.SEND_START_STREAM
            r0.A05 = r2
        L_0x001c:
            X.REh r1 = X.C8890REh.SEND_START_STREAM
            if (r2 != r1) goto L_0x0028
            X.RQK r1 = r0.A00
            if (r1 == 0) goto L_0x023b
            X.REh r1 = X.C8890REh.TRANSFER
            r0.A05 = r1
        L_0x0028:
            X.REh r2 = r0.A05
            X.REh r18 = X.C8890REh.TRANSFER
            r1 = r18
            if (r2 != r1) goto L_0x029a
            X.TLq r1 = X.C13107TLq.A00
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>(r1)
            java.util.Set r1 = r0.A0H
            r2.addAll(r1)
            java.util.Set r1 = r0.A0I
            r2.removeAll(r1)
            java.util.Set r1 = r0.A0J
            r40 = r1
            r2.removeAll(r1)
            int r6 = r0.A06
            java.util.Map r1 = r0.A0G
            r39 = r1
            int r1 = r39.size()
            int r6 = r6 - r1
            int r1 = r2.size()
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x005a:
            java.util.Iterator r17 = r2.iterator()
            r7 = 0
        L_0x005f:
            if (r7 >= r6) goto L_0x0286
            java.lang.Object r5 = r17.next()
            X.SJc r5 = (X.C11284SJc) r5
            java.io.File r4 = r5.A05
            r3 = 0
            boolean r1 = r4 instanceof X.RC3
            if (r1 == 0) goto L_0x0077
            r1 = r4
            X.RC3 r1 = (X.RC3) r1
            boolean r1 = r1.A02
            r16 = 1
            if (r1 != 0) goto L_0x0079
        L_0x0077:
            r16 = 0
        L_0x0079:
            r9 = 0
            X.Thp r12 = r0.A0B     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r8 = 0
            if (r12 == 0) goto L_0x008d
            X.S3y r2 = r12.BnD()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            if (r2 == 0) goto L_0x008d
            X.RQK r1 = r0.A00     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            if (r1 == 0) goto L_0x021e
            java.util.Map r8 = r2.A00(r9, r1, r5)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
        L_0x008d:
            java.lang.String r13 = ""
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r1 = r0.A0D     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r11.append(r1)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r10 = "_"
            r11.append(r10)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.RF9 r1 = r5.A04     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r38 = r1
            java.lang.String r1 = r38.name()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r11.append(r1)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r11.append(r10)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            int r1 = r5.A00     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r11.append(r1)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.RQK r1 = r0.A00     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            if (r1 == 0) goto L_0x00e6
            java.lang.String r1 = r1.A00     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            org.json.JSONObject r2 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            java.lang.String r1 = "video_id"
            java.lang.String r9 = r2.optString(r1, r13)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            X.0qQ.A07(r9)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            java.lang.String r1 = "stream_id"
            java.lang.String r2 = r2.optString(r1, r13)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            X.0qQ.A07(r2)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            int r1 = r9.length()     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            if (r1 <= 0) goto L_0x00da
            r11.append(r10)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            r11.append(r9)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
        L_0x00da:
            int r1 = r2.length()     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            if (r1 <= 0) goto L_0x00e6
            r11.append(r10)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
            r11.append(r2)     // Catch:{ JSONException -> 0x00e6, RJe | JSONException -> 0x0223 }
        L_0x00e6:
            java.lang.String r9 = X.DbT.A10(r11)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.RzP r1 = r0.A0A     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r37 = r1
            r14 = 1
            java.util.HashMap r2 = X.Pxf.A0r(r9, r14)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r1 = "X_FB_VIDEO_WATERFALL_ID"
            r2.put(r1, r9)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SFy r15 = r0.A07     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.util.Map r9 = r15.A0B     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r13.putAll(r9)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r13.putAll(r2)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            if (r8 == 0) goto L_0x010b
            r13.putAll(r8)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
        L_0x010b:
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SEh r2 = new X.SEh     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r2.<init>()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.Rtx r1 = new X.Rtx     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r1.<init>(r2)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SEg r1 = new X.SEg     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r1.<init>(r3, r3)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.0qQ.A0B(r1, r14)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.KjI r1 = r15.A03     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r21 = r1
            r8.putAll(r9)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SEh r1 = r15.A04     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r22 = r1
            X.Rtx r11 = new X.Rtx     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r11.<init>(r1)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SEg r10 = r15.A02     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.S16 r9 = new X.S16     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r9.<init>(r10)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r1 = r15.A09     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r27 = r1
            java.lang.String r1 = r15.A0A     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r28 = r1
            boolean r8 = r15.A00     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            boolean r1 = r15.A0E     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r34 = r1
            X.Rtw r1 = r15.A06     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r24 = r1
            long r1 = r15.A01     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r32 = r1
            java.lang.String r1 = r15.A08     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r15 = r1
            r35 = 1
            if (r16 != 0) goto L_0x0157
            r35 = 0
        L_0x0157:
            X.RQK r1 = r0.A00     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            if (r1 == 0) goto L_0x0171
            java.lang.String r1 = r1.A00     // Catch:{ JSONException -> 0x0171, RJe | JSONException -> 0x0223 }
            org.json.JSONObject r2 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x0171, RJe | JSONException -> 0x0223 }
            java.lang.String r1 = "urlgen_upload_domain"
            java.lang.String r2 = r2.optString(r1)     // Catch:{ JSONException -> 0x0171, RJe | JSONException -> 0x0223 }
            int r1 = X.C66580MXl.A06(r2)     // Catch:{ JSONException -> 0x0171, RJe | JSONException -> 0x0223 }
            if (r1 <= 0) goto L_0x0171
            r27 = r2
            r8 = 1
        L_0x0171:
            if (r12 == 0) goto L_0x017b
            X.S3y r1 = r12.BnD()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.KjI r1 = r1.A00     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r21 = r1
        L_0x017b:
            X.SFy r12 = new X.SFy     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r19 = r12
            r20 = r10
            r23 = r9
            r25 = r11
            r26 = r15
            r29 = r13
            r30 = r32
            r32 = r14
            r33 = r34
            r34 = r8
            r36 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.Sma r9 = new X.Sma     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r9.<init>(r5, r0)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.MUb r11 = r0.A08     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            if (r16 == 0) goto L_0x01a2
            long r1 = r5.A01     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            goto L_0x01a6
        L_0x01a2:
            long r1 = r4.length()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
        L_0x01a6:
            r13 = 0
            int r8 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x0201
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r8 = 7
            boolean r13 = r4.exists()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r13)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            boolean r13 = r4.canRead()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r13)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r21 = r4.getPath()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            long r13 = r4.length()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Long r22 = java.lang.Long.valueOf(r13)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            long r13 = r5.A02     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Long r23 = java.lang.Long.valueOf(r13)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            long r13 = r5.A01     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Long r24 = java.lang.Long.valueOf(r13)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r25 = r38
            java.lang.Object[] r13 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25}     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r8)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r8 = "Error with the file size. exists=%s; canRead=%s; mSourceFile=%s; fileSize=%s;segmentSize=%s; estimateFileSize=%s; segmentType=%s"
            java.lang.String r8 = X.Pxe.A12(r10, r8, r13)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.Throwable r10 = new java.lang.Throwable     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r10.<init>(r8)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r8 = "file size is incorrect"
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r14.<init>(r8, r10)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r8 = r37
            X.TdF r13 = r8.A0D     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.lang.String r10 = "videolite-video-upload"
            java.lang.String r8 = "Incorrect file size"
            if (r13 == 0) goto L_0x0201
            r13.Chx(r14, r10, r8)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
        L_0x0201:
            java.lang.String r10 = r5.A06     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SSw r8 = new X.SSw     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r8.<init>((java.io.File) r4, (java.lang.String) r10, (long) r1)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            java.util.concurrent.ExecutorService r2 = r0.A0K     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.SmZ r1 = new X.SmZ     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r1.<init>(r9, r2)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            X.MPe r2 = r11.Ewf(r12, r8, r1)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r1 = r39
            r1.put(r5, r2)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            r1 = r40
            r1.add(r5)     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            goto L_0x0237
        L_0x021e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
            throw r1     // Catch:{ RKf -> 0x022f, RJe | JSONException -> 0x0223 }
        L_0x0223:
            r2 = move-exception
            java.util.Map r1 = java.util.Collections.emptyMap()
            X.0qQ.A07(r1)
            A05(r0, r2, r1, r3)
            goto L_0x0237
        L_0x022f:
            r3 = move-exception
            int r2 = r3.A00
            java.util.Map r1 = r3.A04
            A05(r0, r3, r1, r2)
        L_0x0237:
            int r7 = r7 + 1
            goto L_0x005f
        L_0x023b:
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0028
            X.RxR r1 = r0.A0C
            X.RxQ r3 = r1.A03
            X.Tj9 r4 = r3.A03
            long r1 = r4.now()
            r3.A02 = r1
            java.lang.String r6 = "media_upload_init_start"
            r5 = 0
            r8 = -1
            java.util.Map r7 = r3.A04
            X.C9596Rda.A00(r4, r5, r6, r7, r8)
            X.Thp r4 = r0.A0B
            if (r4 == 0) goto L_0x0272
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.SsW r3 = new X.SsW
            r3.<init>(r5, r5, r0, r1)
            java.util.concurrent.ExecutorService r1 = r0.A0K
            X.SsV r2 = new X.SsV
            r2.<init>(r3, r1)
            X.Q0d r1 = r0.A09
            r4.EMk(r1, r2)
        L_0x026d:
            r1 = 1
            r0.A03 = r1
            goto L_0x0028
        L_0x0272:
            java.lang.String r1 = ""
            X.RQK r2 = new X.RQK
            r2.<init>()
            r2.A00 = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            X.0qQ.A07(r1)
            A03(r2, r0)
            goto L_0x026d
        L_0x0286:
            X.REh r2 = r0.A05
            r1 = r18
            if (r2 != r1) goto L_0x029a
            boolean r1 = r40.isEmpty()
            if (r1 == 0) goto L_0x029a
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x029a
            X.REh r1 = X.C8890REh.SEND_END_STREAM
            r0.A05 = r1
        L_0x029a:
            X.REh r2 = r0.A05
            X.REh r1 = X.C8890REh.SEND_END_STREAM
            if (r2 != r1) goto L_0x032c
            X.RxR r7 = r0.A0C
            java.util.Map r6 = r0.A0F
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.Rtw r3 = r7.A00
            X.Tj9 r10 = r3.A01
            long r8 = r10.now()
            long r1 = r3.A00
            long r8 = r8 - r1
            java.lang.String r5 = "media_upload_transfer_success"
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.Map r1 = r3.A02
            r4.putAll(r1)
            r2 = 0
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x02ce
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "elapsed_time"
            r4.put(r1, r2)
        L_0x02ce:
            r10.logEvent(r5, r4)
            X.Tij r2 = r7.A04
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r6)
            r2.Dth(r1)
            boolean r1 = r0.A02
            if (r1 != 0) goto L_0x032c
            X.RxQ r3 = r7.A03
            X.Tj9 r4 = r3.A03
            long r1 = r4.now()
            r3.A00 = r1
            java.lang.String r6 = "media_post_start"
            r5 = 0
            r8 = -1
            java.util.Map r7 = r3.A04
            X.C9596Rda.A00(r4, r5, r6, r7, r8)
            X.Thp r4 = r0.A0B
            if (r4 == 0) goto L_0x0313
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.SsW r2 = new X.SsW
            r2.<init>(r5, r5, r0, r1)
            java.util.concurrent.ExecutorService r1 = r0.A0K
            X.SsV r3 = new X.SsV
            r3.<init>(r2, r1)
            X.RQK r2 = r0.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0327
            r4.ELd(r2, r3)
        L_0x030f:
            r1 = 1
            r0.A02 = r1
            return
        L_0x0313:
            java.lang.String r1 = ""
            X.RQK r2 = new X.RQK
            r2.<init>()
            r2.A00 = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            X.0qQ.A07(r1)
            A02(r2, r0)
            goto L_0x030f
        L_0x0327:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STT.A00():void");
    }
}
