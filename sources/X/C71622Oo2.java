package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceLogger;
import java.util.List;
import java.util.Random;

/* renamed from: X.Oo2  reason: case insensitive filesystem */
public final class C71622Oo2 implements MailboxCallback {
    public final /* synthetic */ LoggingOption[] A00;

    public C71622Oo2(LoggingOption[] loggingOptionArr) {
        this.A00 = loggingOptionArr;
    }

    public final void onCompletion(Object obj) {
        LoggingOption loggingOption = this.A00[0];
        Random random = C3030067a.A02;
        if (loggingOption != null && loggingOption.getTraceInfo() != null) {
            TraceLogger.log((PrivacyContext) null, loggingOption.getTraceInfo().getTraceType().intValue(), (String) null, 2001, loggingOption.getTraceInfo().getTraceId(), (String) null, 0, (List) null);
        }
    }
}
