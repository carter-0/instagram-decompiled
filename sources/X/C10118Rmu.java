package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Rmu  reason: case insensitive filesystem */
public abstract class C10118Rmu {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02 = AnonymousClass7TE.A1E();

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A00 = A1E;
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A01 = A1E2;
        Integer A0j = C51967G9n.A0j();
        A1E.put(A0j, "Too many sessions are running for current app, existing sessions must be resolved first.");
        A1E.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        A1E.put(-3, "Request is otherwise invalid.");
        A1E.put(-4, "Requested session is not found.");
        A1E.put(-5, "Split Install API is not available.");
        A1E.put(-6, "Network error: unable to obtain split details.");
        A1E.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        A1E.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        A1E.put(-9, "Service handling split install has died.");
        A1E.put(-10, "Install failed due to insufficient storage.");
        A1E.put(-11, "Signature verification error when invoking SplitCompat.");
        A1E.put(-12, "Error in SplitCompat emulation.");
        A1E.put(-13, "Error in copying files for SplitCompat.");
        A1E.put(-14, "The Play Store app is either not installed or not the official version.");
        A1E.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        A1E.put(-16, "The download is too large to start over the current connection.");
        A1E.put(-100, "Unknown error processing split install.");
        A1E2.put(A0j, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        A1E2.put(-2, "MODULE_UNAVAILABLE");
        A1E2.put(-3, "INVALID_REQUEST");
        A1E2.put(-4, "DOWNLOAD_NOT_FOUND");
        A1E2.put(-5, "API_NOT_AVAILABLE");
        A1E2.put(-6, "NETWORK_ERROR");
        A1E2.put(-7, "ACCESS_DENIED");
        A1E2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        A1E2.put(-9, "SERVICE_DIED");
        A1E2.put(-10, "INSUFFICIENT_STORAGE");
        A1E2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        A1E2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        A1E2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        A1E2.put(-14, "PLAY_STORE_NOT_FOUND");
        A1E2.put(-15, "APP_NOT_OWNED");
        A1E2.put(-16, "DOWNLOAD_TOO_LARGE");
        A1E2.put(-100, "INTERNAL_ERROR");
        Iterator A0s = AnonymousClass7TF.A0s(A1E2);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            A02.put(A1J.getValue(), A1J.getKey());
        }
    }
}
