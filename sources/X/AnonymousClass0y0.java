package X;

import android.content.Context;

/* renamed from: X.0y0  reason: invalid class name */
public final class AnonymousClass0y0 implements AnonymousClass28l {
    public final String getFilenamePrefix() {
        return "profilo_internal_log";
    }

    public final String getFilenameSuffix() {
        return ".txt";
    }

    public final String getContentInBackground(Context context) {
        if (!AnonymousClass0Wc.A01) {
            return null;
        }
        return AnonymousClass0Wc.A00().A00();
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "IgProfiloB4bBugReportLogsProvider";
    }
}
