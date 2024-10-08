package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.mci.TraceLogger;
import java.util.List;
import java.util.Random;

/* renamed from: X.OoL  reason: case insensitive filesystem */
public final class C71640OoL implements MailboxCallback {
    public final /* synthetic */ PrivacyContext A00;
    public final /* synthetic */ TraceInfo A01;
    public final /* synthetic */ String A02;

    public C71640OoL(PrivacyContext privacyContext, TraceInfo traceInfo, String str) {
        this.A02 = str;
        this.A01 = traceInfo;
        this.A00 = privacyContext;
    }

    public final void onCompletion(Object obj) {
        String str = this.A02;
        TraceInfo traceInfo = this.A01;
        PrivacyContext privacyContext = this.A00;
        Random random = C3030067a.A02;
        TraceLogger.log(privacyContext, traceInfo.getTraceType().intValue(), str, 2001, traceInfo.getTraceId(), (String) null, 0, (List) null);
        TraceLogger.log(privacyContext, traceInfo.getTraceType().intValue(), str, 81, traceInfo.getTraceId(), (String) null, 0, (List) null);
    }
}
