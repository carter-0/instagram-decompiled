package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Q4m  reason: case insensitive filesystem */
public final class C7336Q4m implements C13863Tij {
    public int A00;
    public long A01;
    public long A02 = -1;
    public long A03 = -1;
    public C10864RzP A04;
    public boolean A05;
    public final UserSession A06;
    public final boolean A07;
    public final C11224SFy A08;
    public final S3O A09;
    public final C7969QeH A0A;
    public final C10684RwO A0B;
    public final C11387SRa A0C;
    public final AnonymousClass3Q2 A0D;
    public final C2373837k A0E;
    public final C63949LEr A0F;
    public final LP8 A0G;
    public final C14279TtC A0H;

    public C7336Q4m(C11224SFy sFy, S3O s3o, C7969QeH qeH, C10684RwO rwO, C11387SRa sRa, UserSession userSession, C2373837k r9, C63949LEr lEr, LP8 lp8, C14279TtC ttC) {
        0qQ.A0B(lEr, 3);
        this.A06 = userSession;
        this.A0G = lp8;
        this.A0F = lEr;
        this.A0E = r9;
        this.A0H = ttC;
        this.A09 = s3o;
        this.A0C = sRa;
        this.A08 = sFy;
        this.A0A = qeH;
        this.A0B = rwO;
        AnonymousClass3Q2 r0 = lp8.A0D;
        this.A0D = r0;
        this.A07 = r0.A0A() instanceof RBC;
    }

    public final void DFQ(Map map, String str) {
        Map map2;
        Object obj;
        0qQ.A0B(map, 0);
        Object obj2 = map.get("network");
        String str2 = null;
        if (!(!(obj2 instanceof Map) || (map2 = (Map) obj2) == null || (obj = map2.get("download_bandwidth")) == null)) {
            str2 = obj.toString();
        }
        AnonymousClass3QF r0 = this.A0D.A1T;
        if (str2 == null) {
            str2 = "";
        }
        r0.A07 = str2;
        this.A05 = true;
        C10684RwO rwO = this.A0B;
        rwO.A01.flowMarkPoint(rwO.A00, "upload_settings_fetch_success");
    }

    public final void Dii(C11286SJe sJe, C11284SJc sJc) {
        if (this.A07) {
            C63949LEr lEr = this.A0F;
            String str = this.A0G.A0D.A3t;
            long j = sJc.A03;
            int i = sJc.A04.A00;
            String A0t = JTP.A0t(sJc.A05);
            0qQ.A0B(str, 1);
            C2373837k r5 = lEr.A01;
            AnonymousClass3Q2 r6 = lEr.A00;
            C2373737j r52 = (C2373737j) r5;
            0xI A002 = C2373737j.A00((AnonymousClass0iw) null, r6, r52, "segment_upload_transfer");
            A002.A0C("upload_job_id", str);
            A002.A0C("stream_id", (String) null);
            A002.A0B("segment_start_offset", Long.valueOf(j));
            A002.A08(Integer.valueOf(i), "segment_type");
            A002.A08(0, "rendered_segments_count");
            A002.A08(0, "segment_index_to_upload");
            long j2 = -1;
            File A0t2 = AnonymousClass7TE.A0t(A0t);
            if (A0t2.isFile()) {
                j2 = A0t2.length();
            }
            A002.A0B("segment_size", Long.valueOf(j2));
            C2373737j.A06(A002, r6.A6J, r52);
        }
        sJc.A05.getPath();
    }

    public final void DmL(C10864RzP rzP) {
        String str;
        this.A04 = rzP;
        C10684RwO rwO = this.A0B;
        1QP r5 = rwO.A01;
        long j = rwO.A00;
        AnonymousClass3Q2 r6 = rwO.A03;
        boolean z = false;
        r5.flowStart(j, r6.A3t, false);
        r5.flowMarkPoint(j, "flow_start");
        String str2 = r6.A3b;
        if (str2 == null) {
            str2 = "empty";
        }
        r5.flowAnnotate(j, Py0.A00(), str2);
        String str3 = r6.A3t;
        if (str3 == null) {
            str3 = "empty";
        }
        r5.flowAnnotate(j, "upload_id", str3);
        ShareType A0E2 = r6.A0E();
        if (A0E2 == null || (str = A0E2.toString()) == null) {
            str = "empty";
        }
        r5.flowAnnotate(j, "share_type", str);
        r5.flowAnnotate(j, "is_reels", r6.A0v());
        r5.flowAnnotate(j, "use_oc_transcode", r6.A60);
        if (r6.A1K != null) {
            z = true;
        }
        r5.flowAnnotate(j, "has_oc_filter_model", z);
        r5.flowAnnotate(j, "from_draft", r6.A5S);
        AnonymousClass159 A002 = AnonymousClass159.A00();
        Pair A0K = Pxe.A0K(A002.A01, A002.A00);
        r5.flowAnnotate(j, "chipset_vendor", (String) A0K.first);
        r5.flowAnnotate(j, "chipset_name", (String) A0K.second);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.4nB] */
    public final void DtR(MediaComposition mediaComposition, C10864RzP rzP, List list, boolean z) {
        0eP r1;
        int i;
        Float A002;
        C10864RzP rzP2 = rzP;
        List list2 = list;
        boolean A1U = AnonymousClass7TF.A1U(0, list2, rzP2);
        SRW srw = (SRW) list2.get(0);
        AnonymousClass3Q2 r5 = this.A0D;
        int i2 = (int) srw.A0H;
        int i3 = (int) srw.A0I;
        ? obj = new Object();
        obj.A01 = i2;
        obj.A00 = i3;
        r5.A1W = obj;
        int i4 = srw.A0D;
        int i5 = srw.A0B;
        r5.A0S = i4;
        r5.A0R = i5;
        S3O s3o = this.A09;
        synchronized (s3o) {
            s3o.A01 = A1U;
            s3o.A08.submit(new TGY(s3o, list2));
        }
        boolean z2 = this.A07;
        if (z2) {
            r5.A0j.A01 = A1U;
        }
        r5.A1j.A05 = srw.A01;
        UserSession userSession = this.A06;
        float f = -1.0f;
        if (182.A06(0Tu.A05, userSession, 36326232094422667L)) {
            try {
                String path = srw.A0N.getPath();
                if (!(path == null || (A002 = SGR.A00.A00(path)) == null)) {
                    f = A002.floatValue();
                }
            } catch (Throwable th) {
                AnonymousClass7TF.A19(0wj.A01.AEf("IGVideoUploadLifecycleListener", 817901174), DialogModule.KEY_MESSAGE, "fps_extractor_error", th);
                0KC.A0G("IGVideoUploadLifecycleListener", "Error extracting fps", th);
            }
        }
        r5.A03 = f;
        long A032 = 0mb.A03(r5.A3V);
        A00();
        C2373837k r13 = this.A0E;
        LP8 lp8 = this.A0G;
        C2373737j r2 = (C2373737j) r13;
        String A003 = C66579MXk.A00(1069);
        0xI A022 = C2373737j.A02(r2, lp8, A003, "", A032);
        A022.A08(0, "decoder_init_retry_count");
        C2373737j.A07(A022, r2);
        AnonymousClass3Q2 r8 = lp8.A0D;
        r2.Cjm(r8, A003, "");
        r13.EG3(r5);
        if (z2) {
            C63949LEr lEr = this.A0F;
            C2373837k r3 = lEr.A01;
            AnonymousClass3Q2 r22 = lEr.A00;
            C2373737j r32 = (C2373737j) r3;
            C2373737j.A06(C2373737j.A00((AnonymousClass0iw) null, r22, r32, "media_segmentation_success"), r22.A6J, r32);
        }
        this.A0H.Ddo();
        C10684RwO rwO = this.A0B;
        1QP r12 = rwO.A01;
        long j = rwO.A00;
        r12.flowMarkPoint(j, "transcode_success");
        r12.flowAnnotate(j, "result_list_size", list2.size());
        SRW srw2 = (SRW) 00k.A0J(list2);
        if (srw2 != null) {
            int i6 = srw2.A07;
            int i7 = srw2.A06;
            r12.flowAnnotate(j, "input_width", i6);
            r12.flowAnnotate(j, "input_height", i7);
            r12.flowAnnotate(j, "input_bitrate", srw2.A0H);
            AnonymousClass3Q2 r14 = rwO.A03;
            SRW.A01(r12, srw2, (int) r14.A1N.A01, j);
            r12.flowAnnotate(j, "output_frame_rate", (int) r14.A03);
            r12.flowAnnotate(j, "target_frame_rate", srw2.A0A);
            r12.flowAnnotate(j, "frame_drop_percent", srw2.A03);
            SGQ sgq = SGQ.A00;
            File file = srw2.A0N;
            try {
                0qQ.A0A(file);
                String A0t = JTP.A0t(file);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(A0t);
                mediaExtractor.selectTrack(0);
                ArrayList A1C = AnonymousClass7TE.A1C();
                do {
                    AnonymousClass7TE.A1Y(A1C, mediaExtractor.getSampleTime());
                } while (mediaExtractor.advance());
                mediaExtractor.release();
                int countBframe = sgq.countBframe(A1C);
                if (A1C.isEmpty()) {
                    i = 0;
                } else {
                    i = (countBframe * 100) / A1C.size();
                }
                r1 = AnonymousClass7TF.A0x(Integer.valueOf(countBframe), i);
            } catch (Throwable th2) {
                0KC.A0G("BframeScanner", "err in bframe counting", th2);
                0wb.A06("BframeScanner", "err in bframe counting", th2);
                Integer A0j = C51967G9n.A0j();
                r1 = new 0eP(A0j, A0j);
            }
            int A0M = AnonymousClass7TE.A0M(r1.A00);
            int A0M2 = AnonymousClass7TE.A0M(r1.A01);
            r12.flowAnnotate(j, "bframe_count", A0M);
            r12.flowAnnotate(j, "bframe_percentage", A0M2);
            MediaFormat mediaFormat = srw2.A0L.A0E;
            if (mediaFormat != null) {
                String string = mediaFormat.getString("mime");
                if (string == null) {
                    string = "unknown";
                }
                r12.flowAnnotate(j, "target_codec", string);
                int i8 = -1;
                try {
                    i8 = mediaFormat.getInteger("profile");
                } catch (NullPointerException unused) {
                }
                r12.flowAnnotate(j, "target_profile", i8);
                int i9 = -1;
                try {
                    i9 = mediaFormat.getInteger("level");
                } catch (NullPointerException unused2) {
                }
                r12.flowAnnotate(j, "target_level", i9);
            }
        }
        29K r33 = 27p.A01(userSession).A04;
        29E r9 = r33.A03;
        r33.A00 = r9.A02(838600141, r33.A00);
        r33.A02 = r9.A02(518917599, r33.A02);
        C11387SRa sRa = this.A0C;
        if (sRa.A07() && !sRa.A09(r5)) {
            A01(srw, rzP2);
        }
        if (r5.A5D && r5.A5E) {
            String str = r8.A3V;
            if (str != null) {
                Uri A092 = JTQ.A09(str);
                Uri A093 = JTQ.A09(AnonymousClass457.A09(lp8.A0B, ".mp4", System.nanoTime(), A1U));
                0qQ.A0A(A092);
                0qQ.A0A(A093);
                C71122OdG.A01(A092, A093, userSession, lp8, (AnonymousClass4D7) null);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    private final void A00() {
        AnonymousClass3QF r1;
        Integer num;
        C11387SRa sRa = this.A0C;
        if (sRa.A05() && this.A05) {
            r1 = this.A0D.A1T;
            num = AnonymousClass05K.A0Y;
        } else if (sRa.A05() && !this.A05) {
            r1 = this.A0D.A1T;
            num = AnonymousClass05K.A0j;
        } else if (sRa.A04()) {
            r1 = this.A0D.A1T;
            num = AnonymousClass05K.A0N;
        } else if (sRa.A08() && this.A05) {
            r1 = this.A0D.A1T;
            num = AnonymousClass05K.A01;
        } else if (!sRa.A08() || this.A05) {
            r1 = this.A0D.A1T;
            num = AnonymousClass05K.A00;
        } else {
            r1 = this.A0D.A1T;
            num = AnonymousClass05K.A0C;
        }
        r1.A06 = num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b7 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02dc A[Catch:{ Exception -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f1 A[Catch:{ Exception -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028a A[Catch:{ Exception -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a0 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0308 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.SRW r51, X.C10864RzP r52) {
        /*
            r50 = this;
            r1 = r52
            X.SOn r3 = r1.A0H     // Catch:{ Exception -> 0x0308 }
            r49 = r50
            r49.A00()     // Catch:{ Exception -> 0x0308 }
            r0 = r49
            com.instagram.common.session.UserSession r2 = r0.A06     // Catch:{ Exception -> 0x0308 }
            X.SEl r46 = new X.SEl     // Catch:{ Exception -> 0x0308 }
            r0 = r46
            r0.<init>(r2)     // Catch:{ Exception -> 0x0308 }
            X.RxS r1 = r1.A0M     // Catch:{ Exception -> 0x0308 }
            r0 = r49
            X.3Q2 r0 = r0.A0D     // Catch:{ Exception -> 0x0308 }
            r48 = r0
            X.Qdn r13 = new X.Qdn     // Catch:{ Exception -> 0x0308 }
            r7 = r51
            r4 = r13
            r5 = r46
            r6 = r3
            r8 = r1
            r9 = r2
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0308 }
            r0 = r49
            X.SRa r0 = r0.A0C     // Catch:{ Exception -> 0x0308 }
            r47 = r0
            boolean r0 = r47.A07()     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02ba
            r0 = r47
            com.instagram.common.session.UserSession r2 = r0.A01     // Catch:{ Exception -> 0x0308 }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ Exception -> 0x0308 }
            r0 = 36320558442553973(0x81095b00032275, double:3.032605637996491E-306)
            boolean r0 = X.182.A06(r3, r2, r0)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02ba
            X.SEl r4 = r13.A00     // Catch:{ Exception -> 0x0308 }
            if (r4 == 0) goto L_0x008c
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x005b
            X.1QP r6 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r1 = r4.A00     // Catch:{ Exception -> 0x0308 }
            java.lang.String r5 = "CALCULATE_MOS"
            r0 = 0
            r6.flowStart(r1, r5, r0)     // Catch:{ Exception -> 0x0308 }
        L_0x005b:
            X.3Q2 r7 = r13.A05     // Catch:{ Exception -> 0x0308 }
            X.3QF r0 = r7.A1T     // Catch:{ Exception -> 0x0308 }
            java.lang.Integer r5 = r0.A06     // Catch:{ Exception -> 0x0308 }
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x0077
            X.1QP r6 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r1 = r4.A00     // Catch:{ Exception -> 0x0308 }
            if (r5 == 0) goto L_0x00c6
            java.lang.String r5 = X.C273764n9.A00(r5)     // Catch:{ Exception -> 0x0308 }
        L_0x0071:
            java.lang.String r0 = "transcode_type"
            r6.flowAnnotate(r1, r0, r5)     // Catch:{ Exception -> 0x0308 }
        L_0x0077:
            com.instagram.common.session.UserSession r0 = r13.A04     // Catch:{ Exception -> 0x0308 }
            java.lang.String r6 = X.C59906JbV.A01(r0, r7)     // Catch:{ Exception -> 0x0308 }
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x008c
            X.1QP r5 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r1 = r4.A00     // Catch:{ Exception -> 0x0308 }
            java.lang.String r0 = "ingest_surface"
            r5.flowAnnotate(r1, r0, r6)     // Catch:{ Exception -> 0x0308 }
        L_0x008c:
            X.SOn r1 = r13.A01     // Catch:{ Exception -> 0x0308 }
            X.RxS r8 = r13.A03     // Catch:{ Exception -> 0x0308 }
            X.SRW r7 = r13.A02     // Catch:{ Exception -> 0x0308 }
            X.DbY.A1S(r1, r7)     // Catch:{ Exception -> 0x0308 }
            boolean r0 = r7.A02     // Catch:{ Exception -> 0x0308 }
            r45 = r0
            int r9 = r7.A07     // Catch:{ Exception -> 0x0308 }
            r2 = 1
            if (r9 > r2) goto L_0x00a0
            int r9 = r1.A08     // Catch:{ Exception -> 0x0308 }
        L_0x00a0:
            int r6 = r7.A06     // Catch:{ Exception -> 0x0308 }
            if (r6 > r2) goto L_0x00a6
            int r6 = r1.A06     // Catch:{ Exception -> 0x0308 }
        L_0x00a6:
            long r0 = r7.A0H     // Catch:{ Exception -> 0x0308 }
            int r5 = (int) r0     // Catch:{ Exception -> 0x0308 }
            r44 = r5
            if (r8 == 0) goto L_0x00c3
            int r0 = r8.A00     // Catch:{ Exception -> 0x0308 }
            r43 = r0
        L_0x00b1:
            int r10 = r7.A0D     // Catch:{ Exception -> 0x0308 }
            int r0 = r7.A0B     // Catch:{ Exception -> 0x0308 }
            r42 = r0
            long r0 = r7.A0I     // Catch:{ Exception -> 0x0308 }
            int r5 = (int) r0     // Catch:{ Exception -> 0x0308 }
            r41 = r5
            int r0 = r7.A0A     // Catch:{ Exception -> 0x0308 }
            r40 = r0
            if (r9 > r2) goto L_0x00ca
            goto L_0x00c8
        L_0x00c3:
            r43 = -1
            goto L_0x00b1
        L_0x00c6:
            r5 = 0
            goto L_0x0071
        L_0x00c8:
            r9 = 720(0x2d0, float:1.009E-42)
        L_0x00ca:
            if (r6 > r2) goto L_0x00ce
            r6 = 1280(0x500, float:1.794E-42)
        L_0x00ce:
            r0 = r44
            if (r0 > r2) goto L_0x00d5
            r44 = 1000000(0xf4240, float:1.401298E-39)
        L_0x00d5:
            r0 = r43
            if (r0 > r2) goto L_0x00db
            r43 = 30
        L_0x00db:
            if (r10 > r2) goto L_0x00df
            r10 = 720(0x2d0, float:1.009E-42)
        L_0x00df:
            r0 = r42
            if (r0 > r2) goto L_0x00e5
            r42 = 1280(0x500, float:1.794E-42)
        L_0x00e5:
            if (r5 > r2) goto L_0x00ea
            r41 = 1000000(0xf4240, float:1.401298E-39)
        L_0x00ea:
            r0 = r40
            if (r0 > r2) goto L_0x00f0
            r40 = 30
        L_0x00f0:
            if (r4 == 0) goto L_0x014a
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x014a
            X.1QP r14 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r0 = r4.A00     // Catch:{ Exception -> 0x0308 }
            java.lang.String r7 = "v2_feature_is_target_hdr"
            r5 = r45
            r14.flowAnnotate(r0, r7, r5)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r5 = "v2_feature_source_width"
            r14.flowAnnotate(r0, r5, r9)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r5 = "v2_feature_source_height"
            r14.flowAnnotate(r0, r5, r6)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r7 = "v2_feature_source_bitrate_bps"
            r5 = r44
            r14.flowAnnotate(r0, r7, r5)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r7 = "v2_feature_source_frame_rate"
            r5 = r43
            r14.flowAnnotate(r0, r7, r5)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r5 = "v2_feature_upload_width"
            r14.flowAnnotate(r0, r5, r10)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r7 = "v2_feature_upload_height"
            r5 = r42
            r14.flowAnnotate(r0, r7, r5)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r7 = "v2_feature_upload_bitrate_bps"
            r5 = r41
            r14.flowAnnotate(r0, r7, r5)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r7 = "v2_feature_upload_frame_rate"
            r5 = r40
            r14.flowAnnotate(r0, r7, r5)     // Catch:{ Exception -> 0x0308 }
            r18 = 4607002274814922588(0x3fef5c28f5c28f5c, double:0.98)
            java.lang.String r17 = "v2_feature_spatial_ssim"
            r15 = r0
            r14.flowAnnotate(r15, r17, r18)     // Catch:{ Exception -> 0x0308 }
        L_0x014a:
            com.instagram.common.session.UserSession r5 = r13.A04     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690394479(0x8409300017016f, double:3.566506570213443E-306)
            double r7 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798689935720(0x84093000100168, double:3.566506569923322E-306)
            double r38 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798689804646(0x840930000e0166, double:3.56650656984043E-306)
            double r36 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690066794(0x8409300012016a, double:3.566506570006214E-306)
            double r34 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690132331(0x8409300013016b, double:3.5665065700476596E-306)
            double r32 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798689870183(0x840930000f0167, double:3.566506569881876E-306)
            double r30 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798689739109(0x840930000d0165, double:3.5665065697989844E-306)
            double r28 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690197868(0x8409300014016c, double:3.5665065700891054E-306)
            double r26 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690001257(0x84093000110169, double:3.566506569964768E-306)
            double r24 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690328942(0x8409300016016e, double:3.566506570171997E-306)
            double r14 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 37164798690263405(0x8409300015016d, double:3.566506570130551E-306)
            double r22 = X.182.A00(r3, r5, r0)     // Catch:{ Exception -> 0x0308 }
            if (r6 <= r2) goto L_0x027f
            if (r9 <= r2) goto L_0x027f
            r0 = r44
            if (r0 <= r2) goto L_0x027f
            r0 = r43
            if (r0 <= r2) goto L_0x027f
            r0 = r41
            if (r0 <= r2) goto L_0x027f
            r0 = r42
            if (r0 <= r2) goto L_0x027f
            if (r10 <= r2) goto L_0x027f
            r0 = r40
            if (r0 <= r2) goto L_0x027f
            if (r6 < r9) goto L_0x01cc
            r6 = r9
        L_0x01cc:
            r0 = r42
            if (r0 < r10) goto L_0x01d2
            r42 = r10
        L_0x01d2:
            double r0 = (double) r6     // Catch:{ Exception -> 0x0308 }
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r20
            r2 = 4571453861756211473(0x3f71111111111111, double:0.004166666666666667)
            double r18 = X.C9595RdZ.A00(r0, r2)     // Catch:{ Exception -> 0x0308 }
            r0 = r42
            double r11 = (double) r0     // Catch:{ Exception -> 0x0308 }
            double r0 = r11 * r20
            double r16 = X.C9595RdZ.A00(r0, r2)     // Catch:{ Exception -> 0x0308 }
            r0 = r44
            double r5 = (double) r0     // Catch:{ Exception -> 0x0308 }
            double r5 = r5 * r20
            r0 = r41
            double r2 = (double) r0     // Catch:{ Exception -> 0x0308 }
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r2 * r9
            double r0 = java.lang.Math.min(r5, r0)     // Catch:{ Exception -> 0x0308 }
            double r0 = r0 * r20
            r9 = 4508321993853365645(0x3e90c6f7a0b5ed8d, double:2.5E-7)
            double r9 = X.C9595RdZ.A00(r0, r9)     // Catch:{ Exception -> 0x0308 }
            double r2 = r2 * r20
            r0 = 4506651814115716936(0x3e8ad7f29abcaf48, double:2.0E-7)
            double r2 = X.C9595RdZ.A00(r2, r0)     // Catch:{ Exception -> 0x0308 }
            double r0 = X.C9595RdZ.A00(r5, r0)     // Catch:{ Exception -> 0x0308 }
            double r2 = r2 / r0
            double r2 = r2 * r20
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = X.C9595RdZ.A00(r2, r0)     // Catch:{ Exception -> 0x0308 }
            r0 = 4607002274814922588(0x3fef5c28f5c28f5c, double:0.98)
            r3 = 1080(0x438, float:1.513E-42)
            r2 = r42
            if (r2 >= r3) goto L_0x023b
            double r2 = r20 - r0
            double r2 = r2 * r11
            r0 = 4652464705678344192(0x4090e00000000000, double:1080.0)
            double r2 = r2 / r0
            double r0 = r20 - r2
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 < 0) goto L_0x023b
            r0 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
        L_0x023b:
            double r2 = java.lang.Math.pow(r0, r14)     // Catch:{ Exception -> 0x0308 }
            double r2 = r2 - r20
            double r2 = r2 / r14
            double r2 = r2 * r22
            double r18 = r18 * r32
            double r7 = r7 + r18
            double r16 = r16 * r24
            double r7 = r7 + r16
            double r9 = r9 * r36
            double r7 = r7 + r9
            r0 = r43
            double r0 = (double) r0     // Catch:{ Exception -> 0x0308 }
            double r0 = r0 * r34
            double r7 = r7 + r0
            r0 = r40
            double r0 = (double) r0     // Catch:{ Exception -> 0x0308 }
            double r0 = r0 * r26
            double r7 = r7 + r0
            double r2 = r2 * r28
            double r7 = r7 + r2
            double r5 = r5 * r30
            double r7 = r7 + r5
            if (r45 != 0) goto L_0x0265
            r38 = 0
        L_0x0265:
            double r7 = r7 + r38
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x027a
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            r0 = 0
            X.RuK r3 = new X.RuK     // Catch:{ Exception -> 0x0308 }
            r3.<init>(r13, r0, r7)     // Catch:{ Exception -> 0x0308 }
            goto L_0x0288
        L_0x027a:
            java.lang.String r2 = "UPLOAD_MOS_CALC_FAILURE_MOS_OUT_OF_BOUNDS"
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0283
        L_0x027f:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r2 = "UPLOAD_MOS_CALC_FAILURE_INVALID_FEATURES"
        L_0x0283:
            X.RuK r3 = new X.RuK     // Catch:{ Exception -> 0x0308 }
            r3.<init>(r13, r2, r0)     // Catch:{ Exception -> 0x0308 }
        L_0x0288:
            if (r4 == 0) goto L_0x029c
            double r9 = r3.A00     // Catch:{ Exception -> 0x0308 }
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x029c
            X.1QP r5 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r6 = r4.A00     // Catch:{ Exception -> 0x0308 }
            java.lang.String r8 = "unified_upload_mos_score"
            r5.flowAnnotate(r6, r8, r9)     // Catch:{ Exception -> 0x0308 }
        L_0x029c:
            java.lang.String r6 = r3.A01     // Catch:{ Exception -> 0x0308 }
            if (r6 == 0) goto L_0x02b7
            if (r4 == 0) goto L_0x02cc
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02cc
            X.1QP r5 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r1 = r4.A00     // Catch:{ Exception -> 0x0308 }
            java.lang.String r0 = "failure_type"
            r5.flowAnnotate(r1, r0, r6)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r0 = ""
            r5.flowEndFail(r1, r6, r0)     // Catch:{ Exception -> 0x0308 }
            goto L_0x02cc
        L_0x02b7:
            if (r4 == 0) goto L_0x02cc
            goto L_0x02bf
        L_0x02ba:
            double r1 = r13.A00()     // Catch:{ Exception -> 0x0308 }
            goto L_0x02ce
        L_0x02bf:
            boolean r0 = X.C11185SEl.A00(r4)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02cc
            X.1QP r2 = r4.A01     // Catch:{ Exception -> 0x0308 }
            long r0 = r4.A00     // Catch:{ Exception -> 0x0308 }
            r2.flowEndSuccess(r0)     // Catch:{ Exception -> 0x0308 }
        L_0x02cc:
            double r1 = r3.A00     // Catch:{ Exception -> 0x0308 }
        L_0x02ce:
            r3 = r47
            r0 = r48
            boolean r6 = r3.A09(r0)     // Catch:{ Exception -> 0x0308 }
            boolean r0 = X.C11185SEl.A00(r46)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02e7
            r0 = r46
            X.1QP r5 = r0.A01     // Catch:{ Exception -> 0x0308 }
            long r3 = r0.A00     // Catch:{ Exception -> 0x0308 }
            java.lang.String r0 = "is_sent_to_header"
            r5.flowAnnotate(r3, r0, r6)     // Catch:{ Exception -> 0x0308 }
        L_0x02e7:
            r3 = r47
            r0 = r48
            boolean r0 = r3.A09(r0)     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x0301
            r0 = r49
            X.SFy r0 = r0.A08     // Catch:{ Exception -> 0x0308 }
            java.lang.String r4 = "uu_mos_cs"
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0308 }
            java.util.Map r0 = r0.A0B     // Catch:{ Exception -> 0x0308 }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0308 }
        L_0x0301:
            r0 = r48
            X.3QP r0 = r0.A1j     // Catch:{ Exception -> 0x0308 }
            r0.A00 = r1     // Catch:{ Exception -> 0x0308 }
            return
        L_0x0308:
            r1 = move-exception
            java.lang.String r0 = "Unified upload mos client side failed, message="
            java.lang.String r2 = X.AnonymousClass7TF.A0m(r0, r1)
            X.0kg r1 = X.0kg.A03
            java.lang.String r0 = "uu_mos_cs_calculation"
            X.0wb.A01(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7336Q4m.A01(X.SRW, X.RzP):void");
    }

    public final void D0O(Exception exc) {
        boolean z = exc instanceof AnonymousClass4ZS;
        C63949LEr lEr = this.A0F;
        if (z) {
            this.A0G.A04(AnonymousClass55S.A0R, "user cancel", exc);
        } else {
            lEr.A01("user cancel", exc);
        }
        0KC.A0O("IGVideoUploadLifecycleListener", "upload sequence canceled with %s, %s", new Object[]{SAS.A01(exc), this});
        C10684RwO rwO = this.A0B;
        1QP r4 = rwO.A01;
        long j = rwO.A00;
        r4.flowAnnotate(j, "flow_cancel_reason", Pxg.A0m(r4, "flow_cancel", exc, j));
        r4.flowEndCancel(j, Pxh.A0k(r4, exc, j));
        this.A09.A00();
    }

    public final void DFP(Exception exc) {
        C10684RwO rwO = this.A0B;
        1QP r4 = rwO.A01;
        long j = rwO.A00;
        r4.flowAnnotate(j, "upload_settings_fetch_fail_reason", Pxg.A0m(r4, "upload_settings_fetch_fail", exc, j));
        r4.flowAnnotate(j, "upload_settings_fetch_stacktrace", 2Og.A00(exc));
    }

    public final void Dic() {
        0KC.A0O("IGVideoUploadLifecycleListener", "transcode segment file cancelled: %s", new Object[]{this});
    }

    public final void Did(AnonymousClass4ZS r4) {
        0KC.A0O("IGVideoUploadLifecycleListener", "transcode segment file failed: %s, %s", new Object[]{SAS.A01(r4), this});
    }

    public final void Die(SRW srw) {
        C10864RzP rzP = this.A04;
        if (rzP != null) {
            C11387SRa sRa = this.A0C;
            if (sRa.A07() && sRa.A09(this.A0D)) {
                A01(srw, rzP);
            }
        }
        this.A01 += srw.A0G;
        this.A00++;
        C63949LEr lEr = this.A0F;
        AnonymousClass3Q2 r2 = this.A0D;
        lEr.A01.CjK(srw.A0L, r2);
        if (this.A07) {
            ((Set) r2.A0j.A00).add(JTP.A0t(srw.A0N));
        }
    }

    public final void Dif(Exception exc) {
        0KC.A0O("IGVideoUploadLifecycleListener", "transfer segment file failed: %s, %s", new Object[]{SAS.A01(exc), this});
    }

    public final void Dih(C11284SJc sJc) {
        sJc.A05.getPath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DoG(X.C10940S1w r10) {
        /*
            r9 = this;
            long r0 = r9.A01
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
            long r5 = r9.A02
            long r7 = r9.A03
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
            double r3 = (double) r0
            r0 = 4665518107723300864(0x40bf400000000000, double:8000.0)
            double r3 = r3 * r0
            long r5 = r5 - r7
            double r0 = (double) r5
            double r3 = r3 / r0
            long r1 = (long) r3
        L_0x001b:
            X.LEr r3 = r9.A0F
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x005e
            java.lang.String r8 = "segmented"
        L_0x0024:
            X.37k r7 = r3.A01
            X.3Q2 r6 = r3.A00
            X.37j r7 = (X.C2373737j) r7
            X.3QR r3 = r6.A1X
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            int r5 = r3.A00(r0)
            java.lang.String r3 = "upload_video_success"
            r0 = 0
            X.0xI r4 = X.C2373737j.A00(r0, r6, r7, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "operation_seq_number"
            r4.A08(r3, r0)
            java.lang.String r0 = "reason"
            r4.A0C(r0, r8)
            X.C2373737j.A07(r4, r7)
            X.0sm r0 = X.0Yt.A0E()
            r7.A0G(r6, r0, r1)
            X.REA r1 = r10.A00
            X.REA r0 = X.REA.RAW
            if (r1 != r0) goto L_0x0072
            X.S3O r1 = r9.A09
            monitor-enter(r1)
            goto L_0x0064
        L_0x005e:
            java.lang.String r8 = "fbuploader"
            goto L_0x0024
        L_0x0061:
            r1 = -1
            goto L_0x001b
        L_0x0064:
            boolean r0 = r1.A01     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0071
            java.util.concurrent.CountDownLatch r0 = r1.A07     // Catch:{ all -> 0x006e }
            r0.getCount()     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0071:
            monitor-exit(r1)
        L_0x0072:
            X.RwO r0 = r9.A0B
            X.1QP r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "flow_success"
            r3.flowMarkPoint(r1, r0)
            r3.flowEndSuccess(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7336Q4m.DoG(X.S1w):void");
    }

    public final void DtJ() {
        C63949LEr lEr = this.A0F;
        C2373837k r3 = lEr.A01;
        AnonymousClass3Q2 r2 = lEr.A00;
        C2373737j r32 = (C2373737j) r3;
        C2373737j.A06(C2373737j.A00((AnonymousClass0iw) null, r2, r32, "media_segmentation_cancel"), r2.A6J, r32);
        0KC.A0O("IGVideoUploadLifecycleListener", "transcode(s) canceled: %s", new Object[]{this});
        C10684RwO rwO = this.A0B;
        rwO.A01.flowMarkPoint(rwO.A00, "transcode_cancel");
    }

    public final void DtM(float f) {
        this.A0D.A0g(AnonymousClass05K.A00, (double) f);
    }

    public final void DtN() {
        C10684RwO rwO = this.A0B;
        rwO.A01.flowMarkPoint(rwO.A00, "transcode_skip");
    }

    public final void DtP(C7232Q0d q0d, C11354SOn sOn) {
        int i;
        int i2;
        if (q0d != null) {
            AnonymousClass3Q2 r3 = this.A0D;
            if (r3.A0v()) {
                C379909Vu.A00(r3);
                int i3 = q0d.A04;
                if (i3 == 90 || i3 == 270) {
                    i = q0d.A03;
                    i2 = q0d.A05;
                } else {
                    i = q0d.A05;
                    i2 = q0d.A03;
                }
                ClipInfo clipInfo = r3.A1N;
                clipInfo.A09 = i;
                clipInfo.A06 = i2;
                r3.A0f = q0d.A08;
                C379909Vu.A00(r3);
            }
            if (sOn != null) {
                int i4 = sOn.A0C;
                int i5 = sOn.A0A;
                r3.A0S = i4;
                r3.A0R = i5;
                String str = r3.A1N.A0F;
                if (str != null) {
                    Pair A002 = AnonymousClass457.A00(str);
                    0qQ.A07(A002);
                    Object obj = A002.second;
                    0qQ.A06(obj);
                    ((Map) obj).put("segmented", String.valueOf(this.A07));
                    String A0D2 = 002.A0D((String) A002.first, '|');
                    0qQ.A07(A0D2);
                    C2373837k r1 = this.A0E;
                    LP8 lp8 = this.A0G;
                    C2373737j r12 = (C2373737j) r1;
                    C2373737j.A07(C2373737j.A02(r12, lp8, "render_video_attempt", A0D2, -1), r12);
                    r12.Cjm(lp8.A0D, "render_video_attempt", A0D2);
                }
                if (this.A07) {
                    C63949LEr lEr = this.A0F;
                    C2373837k r32 = lEr.A01;
                    AnonymousClass3Q2 r2 = lEr.A00;
                    C2373737j r33 = (C2373737j) r32;
                    C2373737j.A06(C2373737j.A00((AnonymousClass0iw) null, r2, r33, "media_segmentation_attempt"), r2.A6J, r33);
                }
                C10684RwO rwO = this.A0B;
                1QP r22 = rwO.A01;
                long j = rwO.A00;
                r22.flowMarkPoint(j, "transcode_start");
                r22.flowAnnotate(j, "target_aspect_ratio", (double) sOn.A00);
                r22.flowAnnotate(j, "target_width", sOn.A0C);
                r22.flowAnnotate(j, "target_height", sOn.A0A);
                r22.flowAnnotate(j, AnonymousClass000.A00(375), sOn.A01());
                r22.flowAnnotate(j, "target_gop_size", sOn.A03);
                r22.flowAnnotate(j, "has_hw_av1_enc", AnonymousClass7TF.A1Z(SS7.A02));
                r22.flowAnnotate(j, "has_hw_hevc_enc", AnonymousClass7TF.A1Z(SS7.A05));
                r22.flowAnnotate(j, "has_hw_avc_enc", AnonymousClass7TF.A1Z(SS7.A04));
                r22.flowAnnotate(j, "has_hw_av1_hdr_enc", AnonymousClass7TF.A1Z(SS7.A03));
                r22.flowAnnotate(j, "has_hw_hevc_hdr_enc", AnonymousClass7TF.A1Z(SS7.A06));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DtZ(Exception exc, Map map, int i) {
        0KC.A0O("IGVideoUploadLifecycleListener", "transfer(s) failed: %s, %s", new Object[]{SAS.A01(exc), this});
        C10684RwO rwO = this.A0B;
        0wb.A08("videolite_transfer_fail", exc);
        1QP r4 = rwO.A01;
        long j = rwO.A00;
        r4.flowAnnotate(j, "transfer_fail_reason", Pxg.A0m(r4, "transfer_fail", exc, j));
        r4.flowAnnotate(j, "stacktrace", 2Og.A00(exc));
    }

    public final void Dtc(float f) {
        this.A0D.A0g(AnonymousClass05K.A01, (double) f);
    }

    public final void Dte() {
        C63949LEr lEr = this.A0F;
        C2373837k r4 = lEr.A01;
        AnonymousClass3Q2 r5 = lEr.A00;
        C2373737j r42 = (C2373737j) r4;
        r42.EG0(r5);
        int A002 = r5.A1X.A00(AnonymousClass05K.A01);
        0xI A003 = C2373737j.A00((AnonymousClass0iw) null, r5, r42, "upload_video_step_attempt");
        A003.A08(Integer.valueOf(A002), "operation_seq_number");
        C2373737j.A07(A003, r42);
        if (this.A07) {
            String str = this.A0G.A0D.A3t;
            0qQ.A0B(str, 0);
            0xI A004 = C2373737j.A00((AnonymousClass0iw) null, r5, r42, "segment_upload_start");
            A004.A0C("upload_job_id", str);
            A004.A0B("total_size", Long.valueOf(r5.A0d));
            A004.A0C("stream_id", (String) null);
            C2373737j.A06(A004, r5.A6J, r42);
        }
        this.A03 = System.currentTimeMillis();
        this.A02 = -1;
        C10684RwO rwO = this.A0B;
        rwO.A01.flowMarkPoint(rwO.A00, "transfer_start");
    }

    public final void Dth(Map map) {
        if (this.A07) {
            C63949LEr lEr = this.A0F;
            String str = this.A0G.A0D.A3t;
            0qQ.A0B(str, 0);
            C2373837k r4 = lEr.A01;
            AnonymousClass3Q2 r3 = lEr.A00;
            C2373737j r42 = (C2373737j) r4;
            0xI A002 = C2373737j.A00((AnonymousClass0iw) null, r3, r42, "segment_upload_end");
            A002.A0C("upload_job_id", str);
            A002.A0C("stream_id", (String) null);
            A002.A08(0, "segments_count");
            A002.A08(0, "previously_transfered");
            C2373737j.A06(A002, r3.A6J, r42);
        }
        this.A02 = System.currentTimeMillis();
        this.A0D.A1N.A00();
        C10684RwO rwO = this.A0B;
        rwO.A01.flowMarkPoint(rwO.A00, "transfer_success");
    }

    public final void Dvk(List list) {
        this.A0G.A09 = list;
    }

    public final void onFailure(Exception exc) {
        String str;
        AnonymousClass55S r0;
        if (this.A07) {
            str = "segmented";
        } else {
            str = "fbuploader";
        }
        String A062 = 0mp.A06("%s:%s", new Object[]{StringFormatUtil.formatStrLocaleSafe("%s upload error", str), SAS.A01(exc)});
        boolean z = exc instanceof AnonymousClass4ZS;
        C63949LEr lEr = this.A0F;
        if (z) {
            LP8 lp8 = this.A0G;
            String A002 = C9592RdW.A00(exc);
            0qQ.A0B(A002, 2);
            if (C63374Kvv.A00(lp8.A0C, lp8.A0D.A0E(), true)) {
                r0 = AnonymousClass55S.A0S;
            } else {
                r0 = AnonymousClass55S.A0R;
            }
            lp8.A03(r0, A062, A002, exc);
        } else {
            C2373837k r5 = lEr.A01;
            AnonymousClass3Q2 r4 = lEr.A00;
            C2373737j r52 = (C2373737j) r5;
            int A003 = r4.A1X.A00(AnonymousClass05K.A01);
            0xI A004 = C2373737j.A00((AnonymousClass0iw) null, r4, r52, "upload_video_failure");
            A004.A08(Integer.valueOf(A003), "operation_seq_number");
            A004.A0C("reason", A062);
            C59968Jcd.A01(A004, r4, exc);
            C2373737j.A07(A004, r52);
            r52.EFz((AnonymousClass55S) null, r4, A062, exc);
        }
        0KC.A0O("IGVideoUploadLifecycleListener", "upload sequence failed: %s", new Object[]{this});
        C10684RwO rwO = this.A0B;
        0wb.A07("videolite_flow_fail", exc);
        1QP r42 = rwO.A01;
        long j = rwO.A00;
        r42.flowAnnotate(j, "flow_fail_reason", Pxg.A0m(r42, "flow_fail", exc, j));
        r42.flowEndFail(j, DialogModule.KEY_MESSAGE, Pxh.A0k(r42, exc, j));
        this.A09.A00();
    }

    public final void DtL(AnonymousClass4ZS r10) {
        A00();
        if (this.A07) {
            C63949LEr lEr = this.A0F;
            int i = this.A00;
            String message = r10.getMessage();
            C2373837k r4 = lEr.A01;
            AnonymousClass3Q2 r3 = lEr.A00;
            C2373737j r42 = (C2373737j) r4;
            0xI A002 = C2373737j.A00((AnonymousClass0iw) null, r3, r42, "media_segmentation_error");
            A002.A08(Integer.valueOf(i), "rendered_segments_count");
            A002.A08(Integer.valueOf((int) this.A01), "segmentation_bytes_produced");
            A002.A0C("error_message", message);
            C2373737j.A06(A002, r3.A6J, r42);
        }
        String str = this.A0D.A3V;
        if (str != null) {
            JTR.A1O(AnonymousClass7TE.A0t(str));
        }
        0KC.A0O("IGVideoUploadLifecycleListener", "transcode(s) failed: %s, %s", new Object[]{SAS.A01(r10), this});
        C10684RwO rwO = this.A0B;
        1QP r43 = rwO.A01;
        long j = rwO.A00;
        r43.flowAnnotate(j, "transcode_fail_reason", Pxg.A0m(r43, "transcode_fail", r10, j));
        r43.flowAnnotate(j, "stacktrace", 2Og.A00(r10));
        if (182.A06(0Tu.A06, rwO.A02, 36315267042643055L)) {
            0wb.A08("bframe_transcode_fail", r10);
        }
        29K r2 = 27p.A01(this.A06).A04;
        String A012 = SAS.A01(r10);
        29E r32 = r2.A03;
        r2.A00 = r32.A07(A012, "", 838600141, r2.A00);
        r2.A02 = r32.A07(A012, "", 518917599, r2.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IGVideoUploadLifecycleListener{PendingMeida upload_id =");
        A1A.append(this.A0D.A3t);
        A1A.append(", mTotalBytesProduced=");
        A1A.append(this.A01);
        A1A.append(", mTotalSegmentsProduced=");
        A1A.append(this.A00);
        A1A.append(", mIsSegmented=");
        A1A.append(this.A07);
        A1A.append(", mTransferStartTimeMs=");
        A1A.append(this.A03);
        A1A.append(", mTransferFinishTimeMs=");
        return Pxg.A0y(A1A, this.A02);
    }
}
