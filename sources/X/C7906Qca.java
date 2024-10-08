package X;

import android.content.Context;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.instagram.android.R;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.Qca  reason: case insensitive filesystem */
public final class C7906Qca extends C10969S3b {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.facebook.smartcapture.ui.IdCaptureUi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.facebook.smartcapture.resources.ResourcesProvider, java.lang.Object] */
    public C7906Qca(Context context, 0lg r6, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(context, r6);
        File A04 = 0mb.A04(context);
        File A042 = 0mb.A04(context);
        String canonicalPath = A04.getCanonicalPath();
        String canonicalPath2 = A042.getCanonicalPath();
        HashMap A1E = AnonymousClass7TE.A1E();
        if (str != null) {
            A1E.put("challenge_id", str);
        }
        if (str2 != null) {
            A1E.put("challenge_use_case", str2);
        }
        if (str3 != null) {
            A1E.put("av_session_id", str3);
        }
        if (str4 != null) {
            A1E.put("flow_id", str4);
        }
        if (!A1E.isEmpty()) {
            this.A0H = A1E;
        }
        this.A00 = R.style.IgSmartCaptureTheme;
        this.A02 = context;
        this.A05 = new Object();
        String token = r6.getToken();
        0qQ.A0B(token, 0);
        this.A0D = token;
        String token2 = r6.getToken();
        0qQ.A0B(token2, 0);
        this.A0G = token2;
        this.A06 = new IgSmartCaptureLoggerProvider(r6);
        this.A0E = str2 == null ? "Instagram" : str2;
        RE7 re7 = RE7.ONE_SIDE;
        0qQ.A0B(re7, 0);
        this.A03 = re7;
        this.A09 = new Object();
        0qQ.A0A(canonicalPath);
        0qQ.A0B(canonicalPath, 0);
        this.A0C = canonicalPath;
        0qQ.A0A(canonicalPath2);
        0qQ.A0B(canonicalPath2, 0);
        this.A0B = canonicalPath2;
        this.A07 = new Object();
    }
}
