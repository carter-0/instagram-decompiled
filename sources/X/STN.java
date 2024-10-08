package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class STN {
    public int A00;
    public C66498MUb A01;
    public C7232Q0d A02;
    public MediaComposition A03;
    public MediaComposition A04;
    public C13828Thz A05;
    public SNK A06;
    public RR8 A07;
    public File A08;
    public Integer A09;
    public boolean A0A;
    public C12305Sr8 A0B;
    public final Context A0C;
    public final C13886Tj9 A0D;
    public final C10425Rs1 A0E;
    public final C10427Rs3 A0F;
    public final S31 A0G;
    public final C10864RzP A0H;
    public final C10250RpA A0I;
    public final TLG A0J;
    public final C10882Rzi A0K;
    public final C13863Tij A0L;
    public final C13821Thq A0M;
    public final String A0N;
    public final List A0O;
    public final ExecutorService A0P;
    public final C10430Rs6 A0Q;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A03(X.STN r4) {
        /*
            monitor-enter(r4)
            X.SNK r3 = r4.A06     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x004a
            org.json.JSONObject r2 = X.DbS.A11()     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            int r1 = r4.A00     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            java.lang.String r0 = "mCurrentStrategyIndex"
            r2.put(r0, r1)     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            java.lang.String r1 = r4.A00()     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            java.lang.String r0 = "libraryConfigHashCode"
            r2.put(r0, r1)     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            org.json.JSONObject r1 = r3.A00     // Catch:{ JSONException -> 0x0025 }
            java.lang.String r0 = "video_uploader"
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x0025 }
            X.SNK.A01(r3)     // Catch:{ JSONException -> 0x0025 }
            goto L_0x004a
        L_0x0025:
            r2 = move-exception
            java.lang.String r1 = "Failed to update MediaUploader data"
            X.RJd r0 = new X.RJd     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            r0.<init>(r1, r2)     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
            throw r0     // Catch:{ RJd -> 0x003b, JSONException -> 0x002e }
        L_0x002e:
            r3 = move-exception
            X.RzP r0 = r4.A0H     // Catch:{ all -> 0x004c }
            X.TdF r2 = r0.A0D     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot save state in MediaUploader"
            if (r2 == 0) goto L_0x004a
            goto L_0x0047
        L_0x003b:
            r3 = move-exception
            X.RzP r0 = r4.A0H     // Catch:{ all -> 0x004c }
            X.TdF r2 = r0.A0D     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot save state in MediaUploader"
            if (r2 == 0) goto L_0x004a
        L_0x0047:
            r2.Chx(r3, r1, r0)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r4)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STN.A03(X.STN):void");
    }

    public static final synchronized void A05(STN stn, Exception exc) {
        synchronized (stn) {
            if (!stn.A0A) {
                SIY siy = new SIY(stn.A0D, stn.A0E, stn.A0G.A00());
                siy.A01();
                siy.A02(exc);
            }
            stn.A0M.DEb(exc);
            stn.A0L.onFailure(exc);
            stn.A0J.A00.set((Object) null);
            A01(stn);
        }
    }

    public final synchronized C12305Sr8 A06() {
        IllegalStateException illegalStateException;
        C12305Sr8 sr8;
        if (this.A0B == null) {
            this.A0B = new C12305Sr8(this);
            ExecutorService executorService = this.A0P;
            if (executorService != null) {
                executorService.execute(new TD0(this));
                sr8 = this.A0B;
                if (sr8 == null) {
                    illegalStateException = AnonymousClass7TE.A0y();
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0y();
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("upload can be called only one time!");
        }
        throw illegalStateException;
        return sr8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ad, code lost:
        if (r1 == r3) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f1, code lost:
        if (r2 > 0) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0090, code lost:
        if (r1 != false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public STN(android.content.Context r16, X.C13886Tj9 r17, X.C10864RzP r18, X.C13821Thq r19, java.lang.String r20) {
        /*
            r15 = this;
            r4 = r19
            r9 = r20
            X.AnonymousClass7TG.A1P(r9, r4)
            r15.<init>()
            r15.A0N = r9
            r0 = r16
            r15.A0C = r0
            r10 = r18
            r15.A0H = r10
            X.Rs1 r0 = r10.A0E
            r15.A0E = r0
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r15.A09 = r3
            X.Rzi r8 = r10.A01
            r15.A0K = r8
            X.Rs6 r0 = new X.Rs6
            r0.<init>(r15, r4)
            r15.A0Q = r0
            X.TLG r5 = new X.TLG
            r5.<init>(r15)
            r15.A0J = r5
            X.MUb r1 = r10.A07
            if (r1 != 0) goto L_0x0039
            X.S1R r0 = r10.A0N
            X.SmU r1 = new X.SmU
            r1.<init>(r0)
        L_0x0039:
            r15.A01 = r1
            X.Rp9 r0 = r10.A0J
            r1 = 0
            if (r0 == 0) goto L_0x0109
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A00
        L_0x0042:
            r15.A04 = r0
            X.RzP r0 = r15.A0H
            X.Q1d r0 = r0.A09
            java.util.concurrent.ThreadPoolExecutor r2 = r0.A03(r3, r1)
            X.TdF r1 = r10.A0D
            X.Rs3 r0 = new X.Rs3
            r0.<init>(r1, r2)
            r15.A0F = r0
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.RzP r0 = r15.A0H
            X.Q1d r0 = r0.A09
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A03(r1, r5)
            r15.A0P = r0
            r15.A0M = r4
            X.SmS r0 = new X.SmS
            r1 = r17
            r0.<init>(r1)
            r15.A0D = r0
            java.lang.String r7 = r10.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r15.A04
            java.util.Map r0 = r10.A0S
            X.S31 r6 = new X.S31
            r6.<init>(r1, r9, r7, r0)
            r4 = 1
            r6.A03 = r4
            java.util.Map r5 = r6.A05
            java.lang.String r1 = "video"
            java.lang.String r0 = "media_type"
            r5.put(r0, r1)
            X.SOn r2 = r10.A0H
            java.util.List r0 = r2.A0J
            if (r0 == 0) goto L_0x0092
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_video_with_effects"
            r5.put(r0, r1)
            android.graphics.RectF r0 = r2.A0E
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "video_crop_rectangle"
            r5.put(r0, r1)
            java.lang.Integer r1 = r2.A0H
            if (r1 == 0) goto L_0x00af
            r0 = 1
            if (r1 != r3) goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_mirror_mode_specified"
            r5.put(r0, r1)
            int r0 = r2.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "video_output_rotation_angle"
            r5.put(r0, r1)
            java.lang.String r1 = "VIDEO"
            java.lang.String r0 = "asset_type"
            r5.put(r0, r1)
            long r2 = r10.A04
            long r0 = r10.A03
            r6.A02 = r2
            r6.A00 = r0
            java.lang.String r12 = java.lang.String.valueOf(r2)
            java.lang.String r11 = "video_trim_start_time_ms"
            r5.put(r11, r12)
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r11 = "video_trim_end_time_ms"
            r5.put(r11, r12)
            r12 = 0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x00f3
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r0 = 0
            if (r2 <= 0) goto L_0x00f4
        L_0x00f3:
            r0 = 1
        L_0x00f4:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_video_trim"
            r5.put(r0, r1)
            boolean r0 = r10.A0U
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_video_muted"
            r5.put(r0, r1)
            goto L_0x010c
        L_0x0109:
            r0 = r1
            goto L_0x0042
        L_0x010c:
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r1 = r0.getPath()     // Catch:{ Exception -> 0x0123 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x0123 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0123 }
            long r2 = r0.getBlockSizeLong()     // Catch:{ Exception -> 0x0123 }
            long r0 = r0.getAvailableBlocksLong()     // Catch:{ Exception -> 0x0123 }
            long r0 = r0 * r2
            goto L_0x0125
        L_0x0123:
            r0 = -1
        L_0x0125:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "usable_space_in_device"
            r5.put(r0, r1)
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x0146 }
            java.lang.String r1 = r0.getPath()     // Catch:{ Exception -> 0x0146 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x0146 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0146 }
            long r2 = r0.getBlockSizeLong()     // Catch:{ Exception -> 0x0146 }
            long r0 = r0.getBlockCountLong()     // Catch:{ Exception -> 0x0146 }
            long r0 = r0 * r2
            goto L_0x0148
        L_0x0146:
            r0 = -1
        L_0x0148:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "total_space_in_device"
            r5.put(r0, r1)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r11 = r15.A04
            if (r11 == 0) goto L_0x01df
            org.json.JSONObject r3 = X.DbS.A11()
            X.4aE r0 = X.C266714aE.VIDEO
            java.util.HashMap r0 = r11.A07(r0)
            if (r0 == 0) goto L_0x01a0
            java.util.Iterator r14 = X.AnonymousClass7TF.A0t(r0)
            r12 = 0
            r2 = 0
        L_0x0168:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r14.next()
            X.4aM r0 = (X.C266794aM) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r13 = X.Pxg.A16(r0)
        L_0x017a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0168
            java.lang.Object r1 = r13.next()
            X.4aI r1 = (X.C266754aI) r1
            r0 = 0
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x018f
            int r12 = r12 + 1
        L_0x018f:
            int r2 = r2 + 1
            goto L_0x017a
        L_0x0192:
            if (r12 <= 0) goto L_0x019a
            java.lang.String r0 = "photo_to_video_count"
            r3.put(r0, r12)     // Catch:{ JSONException -> 0x019a }
        L_0x019a:
            java.lang.String r0 = "video_clip_count"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01a0 }
        L_0x01a0:
            X.4aE r0 = X.C266714aE.AUDIO
            java.util.HashMap r0 = r11.A07(r0)
            if (r0 == 0) goto L_0x01d0
            r2 = 0
            java.util.Iterator r11 = X.AnonymousClass7TF.A0t(r0)
        L_0x01ad:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r11.next()
            X.4aM r0 = (X.C266794aM) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r1 = X.Pxg.A16(r0)
        L_0x01bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ad
            r1.next()
            int r2 = r2 + 1
            goto L_0x01bf
        L_0x01cb:
            java.lang.String r0 = "audio_clip_count"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01d0 }
        L_0x01d0:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x01df
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "creation_feature_params"
            r5.put(r0, r1)
        L_0x01df:
            r15.A0G = r6
            X.Tij r0 = r10.A02
            r15.A0L = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r15.A0O = r0
            boolean r0 = r8 instanceof X.C7969QeH
            if (r0 == 0) goto L_0x020a
            X.Rp5 r1 = r10.A0B
            if (r1 == 0) goto L_0x020a
            X.SNK r0 = new X.SNK     // Catch:{ NoSuchAlgorithmException -> 0x01fb }
            r0.<init>(r1, r9, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01fb }
            r15.A06 = r0     // Catch:{ NoSuchAlgorithmException -> 0x01fb }
            goto L_0x020a
        L_0x01fb:
            r3 = move-exception
            X.RzP r0 = r15.A0H
            X.TdF r2 = r0.A0D
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot create persistent store"
            if (r2 == 0) goto L_0x020a
            r2.Chx(r3, r1, r0)
        L_0x020a:
            android.content.Context r1 = r15.A0C
            X.RpA r0 = new X.RpA
            r0.<init>(r1)
            r15.A0I = r0
            X.Q1R r0 = X.Q1R.A03
            r0.A01 = r4
            java.util.concurrent.LinkedBlockingQueue r0 = r0.A00
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STN.<init>(android.content.Context, X.Tj9, X.RzP, X.Thq, java.lang.String):void");
    }

    private final String A00() {
        Object[] objArr;
        if (this.A0K instanceof C7969QeH) {
            objArr = new Object[]{this.A0O};
        } else {
            C10864RzP rzP = this.A0H;
            Long valueOf = Long.valueOf(rzP.A04);
            Long valueOf2 = Long.valueOf(rzP.A03);
            Boolean valueOf3 = Boolean.valueOf(rzP.A0U);
            C11354SOn sOn = rzP.A0H;
            Object obj = "null";
            Object obj2 = rzP.A0R;
            if (obj2 != null) {
                obj = obj2;
            }
            objArr = new Object[]{valueOf, valueOf2, valueOf3, sOn, obj};
        }
        String arrays = Arrays.toString(objArr);
        0qQ.A07(arrays);
        return arrays;
    }

    public static final void A01(STN stn) {
        C12305Sr8 sr8 = stn.A0B;
        if (sr8 != null) {
            Object obj = sr8.A01;
            synchronized (obj) {
                obj.notifyAll();
                sr8.A00 = true;
                sr8.A02 = null;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(STN stn) {
        SNK snk = stn.A06;
        if (snk != null) {
            try {
                SNK.A00(snk);
                JSONObject optJSONObject = snk.A00.optJSONObject("video_uploader");
                if (optJSONObject != null) {
                    if (!0qQ.A0K(optJSONObject.getString("libraryConfigHashCode"), stn.A00())) {
                        snk.A00 = DbS.A11();
                        SNK.A01(snk);
                        stn.A09 = AnonymousClass05K.A01;
                        return;
                    }
                    stn.A00 = Pxg.A08("mCurrentStrategyIndex", optJSONObject);
                    stn.A09 = AnonymousClass05K.A0C;
                }
            } catch (RJd | JSONException e) {
                stn.A09 = AnonymousClass05K.A01;
                C13587TdF tdF = stn.A0H.A0D;
                if (tdF != null) {
                    tdF.Chx(e, "videolite-crash-recovery", "Cannot restore state in MediaUploader");
                }
            }
        }
    }

    public static final void A04(STN stn, File file) {
        throw new RuntimeException("media uploader validation error", new Exception(Pxe.A12(Locale.ROOT, "Error accessing inputFile exists=%s; canRead=%s; mSourceFile=%s; inputPath=%s, fileLength=%s", Arrays.copyOf(new Object[]{Boolean.valueOf(file.exists()), Boolean.valueOf(file.canRead()), file.getPath(), stn.A0H.A0P, Long.valueOf(file.length())}, 5))));
    }
}
