package X;

import android.media.MediaFormat;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class SJL {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = -1;
    public long A0A = 0;
    public long A0B = -1;
    public long A0C = -1;
    public long A0D = 0;
    public MediaFormat A0E = null;
    public C12298Sqz A0F;
    public String A0G = null;
    public String A0H = null;
    public String A0I = null;
    public String A0J = null;
    public String A0K = null;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X = false;
    public boolean A0Y;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SJL sjl = (SJL) obj;
            if (!(this.A0S == sjl.A0S && this.A0U == sjl.A0U && this.A0O == sjl.A0O && this.A0P == sjl.A0P && this.A0Q == sjl.A0Q && this.A0R == sjl.A0R && this.A0V == sjl.A0V && this.A0W == sjl.A0W && this.A03 == sjl.A03 && this.A06 == sjl.A06 && this.A0C == sjl.A0C && this.A09 == sjl.A09 && this.A08 == sjl.A08 && this.A07 == sjl.A07 && this.A0B == sjl.A0B && this.A0T == sjl.A0T && this.A02 == sjl.A02 && this.A00 == sjl.A00 && this.A0X == sjl.A0X && this.A0D == sjl.A0D && this.A0Y == sjl.A0Y && A00(this.A0J, sjl.A0J) && A00(this.A0I, sjl.A0I) && A00(this.A0H, sjl.A0H) && A00(this.A0G, sjl.A0G) && A00(this.A0K, sjl.A0K) && A00(this.A0L, sjl.A0L) && A00(this.A0N, sjl.A0N) && A00(this.A0M, sjl.A0M) && this.A04 == sjl.A04 && this.A0A == sjl.A0A && A00(this.A0E, sjl.A0E) && this.A01 == sjl.A01)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[40];
        boolean A1X = AnonymousClass7TF.A1X(new Object[]{Boolean.valueOf(this.A0S), Boolean.valueOf(this.A0U), Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0Q), Boolean.valueOf(this.A0R), AnonymousClass7TE.A0u(), Boolean.valueOf(this.A0V), Boolean.valueOf(this.A0W), -1L, -1, -1, -1, -1, -1, Long.valueOf(this.A03), Long.valueOf(this.A06), Long.valueOf(this.A0C), Long.valueOf(this.A09), Long.valueOf(this.A08), Long.valueOf(this.A07), Long.valueOf(this.A0B), Boolean.valueOf(this.A0T), Long.valueOf(this.A02), this.A0J, this.A0I, this.A0H}, objArr);
        String str = this.A0G;
        String str2 = this.A0K;
        Integer valueOf = Integer.valueOf(this.A00);
        Boolean valueOf2 = Boolean.valueOf(this.A0X);
        Long valueOf3 = Long.valueOf(this.A0D);
        String str3 = this.A0L;
        String str4 = this.A0N;
        String str5 = this.A0M;
        Boolean valueOf4 = Boolean.valueOf(this.A0Y);
        Long valueOf5 = Long.valueOf(this.A04);
        Long valueOf6 = Long.valueOf(this.A0A);
        Object obj = this.A0E;
        if (obj == null) {
            obj = "noOutputFormat";
        }
        System.arraycopy(new Object[]{str, str2, valueOf, valueOf2, valueOf3, str3, str4, str5, valueOf4, valueOf5, valueOf6, obj, Long.valueOf(this.A01)}, A1X ? 1 : 0, objArr, 27, 13);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("isAudioTrackPresent", this.A0S);
            A11.put("isInitComplete", this.A0U);
            A11.put("codecMuxerAudioTrackIndexIsSet", this.A0O);
            A11.put("codecMuxerVideoTrackIndexIsSet", this.A0P);
            A11.put("gotAudioDataBuffer", this.A0Q);
            A11.put("gotVideoDataBuffer", this.A0R);
            A11.put("isAudioVideoTrackReset", false);
            A11.put("startTimeUs", -1);
            A11.put("endTimeUs", -1);
            A11.put("adjustedEndTimeUs", -1);
            A11.put("syncStartTimeUs", -1);
            A11.put("firstVideoSampleTimeUs", -1);
            A11.put("lastVideoSampleTimeUs", -1);
            A11.put("firstAudioSampleTimeUs", this.A03);
            A11.put("lastAudioSampleTimeUs", this.A06);
            A11.put("numVideoSamplesMuxed", this.A0C);
            A11.put("numAudioSamplesMuxed", this.A09);
            A11.put("numAudioSamplesErrored", this.A08);
            A11.put("lastVideoSampleMuxedUs", this.A07);
            A11.put("lastAudioSampleMuxedUs", this.A05);
            A11.put("numVideoSamplesErrored", this.A0B);
            A11.put("isEncoderCompleted", this.A0T);
            A11.put("bytesInTranscodeFile", this.A02);
            A11.putOpt("muxerName", this.A0J);
            A11.putOpt("encoderName", this.A0I);
            A11.putOpt("decoderName", this.A0H);
            A11.putOpt("profileName", this.A0K);
            A11.put("targetBitRate", this.A00);
            A11.put("isNonIncrementalTimestamp", this.A0X);
            A11.put("timestampDifference", this.A0D);
            A11.putOpt("videoTranscodeInnerException", this.A0L);
            A11.putOpt("videoTranscodeInnerExceptionCause", this.A0N);
            A11.putOpt("videoTranscodeInnerExceptionCallStack", this.A0M);
            A11.put("isPassThroughTranscoderUsed", this.A0Y);
            A11.put("isMediaCompositionInput", this.A0V);
            A11.put("framePtsUs", this.A04);
            A11.put("numOfRetriesToSucceedEncoder", this.A0A);
            A11.put("audioTranscodeDurationNs", this.A01);
        } catch (JSONException unused) {
        }
        return A11.toString();
    }
}
