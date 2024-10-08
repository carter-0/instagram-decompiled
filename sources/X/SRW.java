package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.io.File;
import java.util.Arrays;
import org.json.JSONObject;

public final class SRW {
    public C11354SOn A00;
    public String A01;
    public boolean A02;
    public final double A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final S6U A0K;
    public final SJL A0L;
    public final C266714aE A0M;
    public final File A0N;
    public final boolean A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SRW srw = (SRW) obj;
            if (this.A0F != srw.A0F || this.A0G != srw.A0G || this.A07 != srw.A07 || this.A06 != srw.A06 || this.A0H != srw.A0H || this.A05 != srw.A05 || this.A0D != srw.A0D || this.A0B != srw.A0B || this.A0I != srw.A0I || this.A0A != srw.A0A || this.A0C != srw.A0C || this.A0J != srw.A0J || Double.compare(srw.A03, this.A03) != 0 || this.A0O != srw.A0O || this.A0M.A00 != srw.A0M.A00 || !this.A0N.equals(srw.A0N) || !this.A0L.equals(srw.A0L)) {
                return false;
            }
            S6U s6u = this.A0K;
            S6U s6u2 = srw.A0K;
            if (s6u == null) {
                if (s6u2 != null) {
                    return false;
                }
            } else if (s6u2 == null || !s6u.equals(s6u2)) {
                return false;
            }
            if (this.A0E != srw.A0E) {
                return false;
            }
            String str = this.A01;
            String str2 = srw.A01;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            if (!(this.A02 == srw.A02 && this.A09 == srw.A09 && this.A08 == srw.A08)) {
                return false;
            }
        }
        return true;
    }

    public static void A01(UserFlowLoggerImpl userFlowLoggerImpl, SRW srw, int i, long j) {
        UserFlowLoggerImpl userFlowLoggerImpl2 = userFlowLoggerImpl;
        long j2 = j;
        userFlowLoggerImpl.flowAnnotate(j2, "input_frame_rate", i);
        userFlowLoggerImpl2.flowAnnotate(j2, "input_file_size", srw.A0F);
        float f = ((float) srw.A0J) / 1000000.0f;
        long j3 = srw.A0G;
        userFlowLoggerImpl2.flowAnnotate(j2, "duration_sec", (double) f);
        userFlowLoggerImpl2.flowAnnotate(j2, "output_bitrate", (int) (((float) (j3 * 8)) / f));
        userFlowLoggerImpl2.flowAnnotate(j2, "output_file_size", j3);
    }

    public final int hashCode() {
        File file = this.A0N;
        Long valueOf = Long.valueOf(this.A0F);
        Long valueOf2 = Long.valueOf(this.A0G);
        Integer valueOf3 = Integer.valueOf(this.A07);
        Integer valueOf4 = Integer.valueOf(this.A06);
        Long valueOf5 = Long.valueOf(this.A0H);
        Integer valueOf6 = Integer.valueOf(this.A05);
        Integer valueOf7 = Integer.valueOf(this.A0D);
        Integer valueOf8 = Integer.valueOf(this.A0B);
        Long valueOf9 = Long.valueOf(this.A0I);
        Integer valueOf10 = Integer.valueOf(this.A0A);
        Integer valueOf11 = Integer.valueOf(this.A0C);
        Long valueOf12 = Long.valueOf(this.A0J);
        Double valueOf13 = Double.valueOf(this.A03);
        Boolean valueOf14 = Boolean.valueOf(this.A0O);
        Integer valueOf15 = Integer.valueOf(this.A0M.A00);
        SJL sjl = this.A0L;
        S6U s6u = this.A0K;
        return Arrays.hashCode(new Object[]{file, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, sjl, s6u, Long.valueOf(this.A0E), this.A01, Boolean.valueOf(this.A02), Integer.valueOf(this.A08), Integer.valueOf(this.A09)});
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.S6U, java.lang.Object] */
    public SRW(JSONObject jSONObject) {
        C266714aE r0;
        S6U s6u;
        String str;
        this.A0N = AnonymousClass7TE.A0t(jSONObject.getString("outputFilePath"));
        this.A0F = Pxi.A09("originalFileSize", jSONObject);
        this.A0G = Pxi.A09("outputFileSize", jSONObject);
        this.A07 = A00("sourceWidth", jSONObject);
        this.A06 = A00("sourceHeight", jSONObject);
        this.A0H = Pxi.A09("sourceBitRate", jSONObject);
        this.A05 = A00("sourceFrameRate", jSONObject);
        this.A0D = A00("targetWidth", jSONObject);
        this.A0B = A00("targetHeight", jSONObject);
        this.A0I = Pxi.A09("targetBitRate", jSONObject);
        this.A0A = A00("targetFrameRate", jSONObject);
        this.A0C = A00("targetRotationDegreesClockwise", jSONObject);
        this.A0J = Pxi.A09("videoTime", jSONObject);
        this.A03 = Double.parseDouble(jSONObject.getString("frameDropPercent"));
        this.A0O = Boolean.parseBoolean(jSONObject.getString("mIsLastSegment"));
        int A002 = A00("mTrackType", jSONObject);
        if (A002 == 1) {
            r0 = C266714aE.AUDIO;
        } else if (A002 != 2) {
            r0 = C266714aE.MIXED;
        } else {
            r0 = C266714aE.VIDEO;
        }
        this.A0M = r0;
        this.A0L = new SJL();
        if (jSONObject.has("mediaDemuxerStats")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mediaDemuxerStats");
            ? obj = new Object();
            obj.A03 = -1;
            obj.A00 = -1;
            obj.A02 = -1;
            obj.A01 = -1;
            obj.A05 = "";
            obj.A04 = "";
            obj.A03 = Pxi.A09("start_read_time_us", jSONObject2);
            obj.A00 = Pxi.A09("end_read_time_us", jSONObject2);
            obj.A02 = Pxi.A09("frame_before_start_read_time_us", jSONObject2);
            obj.A01 = Pxi.A09("frame_after_end_read_time_us", jSONObject2);
            obj.A05 = jSONObject2.getString("track_info_map");
            obj.A04 = jSONObject2.getString("exceptions");
            s6u = obj;
        } else {
            s6u = null;
        }
        this.A0K = s6u;
        this.A04 = A00("outputIndex", jSONObject);
        this.A0E = Pxi.A09("framePts", jSONObject);
        this.A08 = A00("targetColorSpace", jSONObject);
        this.A09 = A00("targetColorTransfer", jSONObject);
        if (jSONObject.has("targetCodec")) {
            str = jSONObject.getString("targetCodec");
        } else {
            str = "";
        }
        this.A01 = str;
        this.A02 = Boolean.parseBoolean(jSONObject.getString("useHLGHdrTranscode"));
    }

    public static int A00(String str, JSONObject jSONObject) {
        return Integer.parseInt(jSONObject.getString(str));
    }

    public final JSONObject A02() {
        JSONObject A11 = DbS.A11();
        A11.put("outputFilePath", this.A0N.getPath());
        A11.put("originalFileSize", this.A0F);
        A11.put("outputFileSize", this.A0G);
        A11.put("sourceWidth", this.A07);
        A11.put("sourceHeight", this.A06);
        A11.put("sourceBitRate", this.A0H);
        A11.put("sourceFrameRate", this.A05);
        A11.put("targetWidth", this.A0D);
        A11.put("targetHeight", this.A0B);
        A11.put("targetBitRate", this.A0I);
        A11.put("targetFrameRate", this.A0A);
        A11.put("targetRotationDegreesClockwise", this.A0C);
        A11.put("videoTime", this.A0J);
        A11.put("frameDropPercent", this.A03);
        A11.put("mIsLastSegment", this.A0O);
        A11.put("mTrackType", this.A0M.A00);
        S6U s6u = this.A0K;
        if (s6u != null) {
            JSONObject A112 = DbS.A11();
            A112.put("start_read_time_us", s6u.A03);
            A112.put("end_read_time_us", s6u.A00);
            A112.put("frame_before_start_read_time_us", s6u.A02);
            A112.put("frame_after_end_read_time_us", s6u.A01);
            A112.put("track_info_map", s6u.A05);
            A112.put("exceptions", s6u.A04);
            A11.put("mediaDemuxerStats", A112);
        }
        A11.put("outputIndex", this.A04);
        A11.put("framePts", this.A0E);
        A11.put("targetColorSpace", this.A08);
        A11.put("targetColorTransfer", this.A09);
        A11.put("targetCodec", this.A01);
        A11.put("useHLGHdrTranscode", this.A02);
        return A11;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoResizeResult{outputFile=");
        A1A.append(this.A0N);
        A1A.append(", originalFileSize=");
        A1A.append(this.A0F);
        A1A.append(", outputFileSize=");
        A1A.append(this.A0G);
        A1A.append(", sourceWidth=");
        A1A.append(this.A07);
        A1A.append(", sourceHeight=");
        A1A.append(this.A06);
        A1A.append(", sourceBitRate=");
        A1A.append(this.A0H);
        A1A.append(", sourceFrameRate=");
        A1A.append(this.A05);
        A1A.append(", targetWidth=");
        A1A.append(this.A0D);
        A1A.append(", targetHeight=");
        A1A.append(this.A0B);
        A1A.append(", targetRotationDegreesClockwise=");
        A1A.append(this.A0C);
        A1A.append(", targetBitRate=");
        A1A.append(this.A0I);
        A1A.append(", targetFrameRate=");
        A1A.append(this.A0A);
        A1A.append(", videoTime=");
        A1A.append(this.A0J);
        A1A.append(", frameDropPercent=");
        A1A.append(this.A03);
        A1A.append(", mediaResizeStatus=");
        A1A.append(this.A0L);
        A1A.append(", mIsLastSegment=");
        A1A.append(this.A0O);
        A1A.append(", mTrackType=");
        A1A.append(this.A0M);
        A1A.append(", mediaDemuxerStats=");
        A1A.append(this.A0K);
        A1A.append(", mOutputIndex=");
        A1A.append(this.A04);
        A1A.append(", framePts=");
        A1A.append(this.A0E);
        A1A.append(", targetCodec=");
        A1A.append(this.A01);
        A1A.append(", useHLGHdrTranscode=");
        A1A.append(this.A02);
        A1A.append(", targetColorTransfer=");
        A1A.append(this.A09);
        A1A.append(", targetColorSpace=");
        A1A.append(this.A08);
        return Pxg.A0x(A1A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SRW(android.media.MediaFormat r13, X.S6U r14, X.SJL r15, X.C11354SOn r16, X.C266714aE r17, java.io.File r18, int r19, int r20, long r21, long r23, long r25, long r27, boolean r29) {
        /*
            r12 = this;
            r7 = -1
            r2 = 0
            r6 = 0
            r0 = -1
            r12.<init>()
            r4 = r18
            r12.A0N = r4
            r4 = r21
            r12.A0F = r4
            r4 = r23
            r12.A0G = r4
            r11 = r19
            r12.A07 = r11
            r10 = r20
            r12.A06 = r10
            r4 = r25
            r12.A0H = r4
            r12.A05 = r7
            r8 = r27
            r12.A0J = r8
            r12.A03 = r2
            r2 = r29
            r12.A0O = r2
            r2 = r17
            r12.A0M = r2
            r12.A04 = r6
            r12.A0E = r0
            boolean r3 = r15.A0Y
            r2 = r16
            if (r3 == 0) goto L_0x0068
            r12.A0D = r11
            r12.A0B = r10
            r12.A0I = r4
        L_0x0041:
            r12.A0A = r7
            r12.A0C = r7
        L_0x0045:
            r12.A0L = r15
            r12.A0K = r14
            if (r13 == 0) goto L_0x0064
            java.lang.String r1 = "color-standard"
            boolean r0 = r13.containsKey(r1)
            if (r0 == 0) goto L_0x0064
            int r0 = r13.getInteger(r1)
            r12.A08 = r0
            java.lang.String r0 = "color-transfer"
            int r0 = r13.getInteger(r0)
        L_0x005f:
            r12.A09 = r0
            r12.A00 = r2
            return
        L_0x0064:
            r0 = 0
            r12.A08 = r6
            goto L_0x005f
        L_0x0068:
            if (r16 != 0) goto L_0x0071
            r12.A0D = r7
            r12.A0B = r7
            r12.A0I = r0
            goto L_0x0041
        L_0x0071:
            int r0 = r2.A0C
            r12.A0D = r0
            int r0 = r2.A0A
            r12.A0B = r0
            int r0 = r2.A01()
            long r0 = (long) r0
            r12.A0I = r0
            int r0 = r2.A02
            r12.A0A = r0
            int r0 = r2.A0B
            r12.A0C = r0
            X.SJA r1 = r2.A0G
            if (r1 == 0) goto L_0x0045
            X.RFa r0 = r1.A04
            java.lang.String r0 = r0.name()
            r12.A01 = r0
            boolean r0 = r1.A01
            r12.A02 = r0
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRW.<init>(android.media.MediaFormat, X.S6U, X.SJL, X.SOn, X.4aE, java.io.File, int, int, long, long, long, long, boolean):void");
    }
}
