package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.8x3  reason: invalid class name and case insensitive filesystem */
public final class C370778x3 implements AnonymousClass28l, AnonymousClass0lh {
    public final EvictingQueue A00 = new EvictingQueue(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
    public final UserSession A01;
    public final SimpleDateFormat A02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    public C370778x3(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A01(String str, int i) {
        0qQ.A0B(str, 0);
        StringBuilder sb = new StringBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {002.A0e("message_fetch_", " : [", currentTimeMillis), 002.A0g("timestamp : ", this.A02.format(new Date(currentTimeMillis)), ", "), 002.A0g("message_otid : ", str, ", "), 002.A0c("error_code : ", ", ", i)};
        int i2 = 0;
        do {
            sb.append(strArr[i2]);
            i2++;
        } while (i2 < 4);
        sb.append("]");
        this.A00.add(sb.toString());
    }

    public final void A00(C370538wd r15, String str, boolean z) {
        String str2;
        0sP r1;
        if (182.A06(0Tu.A05, this.A01, 36322766056270227L)) {
            List list = r15.A07;
            0qQ.A07(list);
            List A0X = 00k.A0X(list);
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                str2 = "start";
            } else {
                str2 = "end";
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("thread_fetch_");
            sb2.append(str2);
            sb2.append('_');
            sb2.append(r15.A00().longValue());
            sb2.append('_');
            sb2.append(currentTimeMillis);
            sb2.append(" : [");
            String[] strArr = {sb2.toString(), 002.A0g("timestamp : ", this.A02.format(new Date(currentTimeMillis)), " , "), 002.A0g("thread_id : ", r15.A1D, ", "), 002.A0e(C66579MXk.A00(1169), ", ", r15.A00().longValue()), 002.A0g("fetch_reason : ", str, ", "), 002.A1B("server_has_older : ", ", ", r15.CKJ())};
            int i = 0;
            do {
                sb.append(strArr[i]);
                i++;
            } while (i < 6);
            if (z) {
                r1 = C41727AzI.A00;
            } else {
                r1 = C41728AzJ.A00;
            }
            sb.append(002.A0g("messages : ", 00k.A0P(", ", "", "", A0X, r1), ", "));
            sb.append("]");
            this.A00.add(sb.toString());
        }
    }

    public final void A02(String str, boolean z, String str2) {
        StringBuilder sb = new StringBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {002.A0e("missing_messages_info_", " : [", currentTimeMillis), 002.A0g("timestamp : ", this.A02.format(new Date(currentTimeMillis)), ", "), 002.A0g("thread_id : ", str2, ", "), 002.A1B("is_from_eb : ", ", ", z), 002.A0g("missing_messages : ", str, ", ")};
        int i = 0;
        do {
            sb.append(strArr[i]);
            i++;
        } while (i < 5);
        sb.append("]");
        this.A00.add(sb.toString());
    }

    public final String getContentInBackground(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(002.A0g("[Message History State] encrypted backup deviceId = ", AnonymousClass65B.A03.A02(this.A01), " \n"));
        sb.append("\n");
        EvictingQueue<String> evictingQueue = this.A00;
        0qQ.A06(evictingQueue);
        for (String A0C : evictingQueue) {
            sb.append(002.A0C(A0C, 10));
        }
        return sb.toString();
    }

    public final String getFilenamePrefix() {
        return "direct_instamadillo_reverb_intercept_log";
    }

    public final String getFilenameSuffix() {
        return ".txt";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "ArmadilloExpressReverbStatusReportLogCollector";
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
