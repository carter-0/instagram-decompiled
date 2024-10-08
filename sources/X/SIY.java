package X;

import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class SIY {
    public long A00;
    public Long A01;
    public final C13886Tj9 A02;
    public final C10425Rs1 A03;
    public final Map A04 = AnonymousClass7TE.A1E();

    public SIY(C13886Tj9 tj9, C10425Rs1 rs1, Map map) {
        0qQ.A0B(tj9, 2);
        this.A03 = rs1;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            if (value != null) {
                this.A04.put(key, value);
            }
        }
        this.A02 = tj9;
    }

    public final void A01() {
        this.A00 = this.A02.now();
        A00(this, (Exception) null, "media_upload_start", (Map) null, -1);
        C10425Rs1 rs1 = this.A03;
        if (rs1 != null) {
            UserFlowLogger userFlowLogger = rs1.A01;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(rs1.A00);
            this.A01 = Long.valueOf(generateNewFlowId);
            Map map = this.A04;
            String A11 = DbT.A11("source_type", map);
            String str = "";
            if (A11 == null) {
                A11 = str;
            }
            String A112 = DbT.A11("waterfall_id", map);
            if (A112 == null) {
                A112 = str;
            }
            String A113 = DbT.A11("asset_id", map);
            if (A113 != null) {
                str = A113;
            }
            userFlowLogger.flowStart(generateNewFlowId, A11, false);
            userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId, "waterfall_id", A112);
            userFlowLogger.flowAnnotate(generateNewFlowId, "asset_id", str);
        }
    }

    public final void A02(Exception exc) {
        A00(this, exc, "media_upload_failure", (Map) null, this.A02.now() - this.A00);
        Long l = this.A01;
        if (l != null) {
            long longValue = l.longValue();
            C10425Rs1 rs1 = this.A03;
            if (rs1 != null) {
                String stackTraceString = Log.getStackTraceString(exc);
                0qQ.A0A(stackTraceString);
                0qQ.A0B(stackTraceString, 2);
                UserFlowLogger userFlowLogger = rs1.A01;
                userFlowLogger.flowAnnotate(longValue, TraceFieldType.Error, stackTraceString);
                String valueOf = String.valueOf(exc);
                0qQ.A0B(valueOf, 1);
                userFlowLogger.flowEndFail(longValue, valueOf, (String) null);
            }
        }
    }

    public static final void A00(SIY siy, Exception exc, String str, Map map, long j) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.putAll(siy.A04);
        if (exc != null) {
            Pxh.A1Q(exc, A1E);
        }
        if (j >= 0) {
            String valueOf = String.valueOf(j);
            A1E.put("elapsed_time", valueOf);
            A1E.put("dt", valueOf);
        }
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Object key = A1J.getKey();
                Object value = A1J.getValue();
                if (value != null) {
                    A1E.put(key, value);
                }
            }
        }
        Object obj = A1E.get("orig_video_codec");
        if (obj != null) {
            A1E.put("source_video_codec", obj);
        }
        siy.A02.logEvent(str, A1E);
    }
}
