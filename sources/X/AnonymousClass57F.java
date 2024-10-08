package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.57F  reason: invalid class name */
public final class AnonymousClass57F implements AnonymousClass28l, 0lm {
    public static final SimpleDateFormat A02 = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss", Locale.US);
    public final EvictingQueue A00 = new EvictingQueue(50);
    public final C61410nE A01 = C61410nE.A00;

    public final String getContentInBackground(Context context) {
        StringWriter stringWriter = new StringWriter();
        Iterator it = this.A00.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            C21398Xa6 xa6 = (C21398Xa6) it.next();
            stringWriter.append(A02.format(new Date(xa6.A00))).append(" ").append(xa6.A01);
            stringWriter.append(10);
        }
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final String getFilenamePrefix() {
        return "interaction_logs";
    }

    public final String getFilenameSuffix() {
        return ".txt";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "FeedInteractionObserverLogCollector";
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.clear();
        }
    }
}
