package X;

import android.content.Context;
import android.net.Uri;

public abstract class F5E {
    public static final FZ1 A00(0lg r3) {
        0qQ.A0B(r3, 0);
        return (FZ1) r3.A01(FZ1.class, new C20609Wvq(r3, 27));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.F0A] */
    public static final void A01(Context context, Uri uri, 0lg r5) {
        AnonymousClass7TG.A1N(context, r5);
        if (!DbV.A1X(uri, "native_flow")) {
            0wb.A03("Checkpoint Uri", 002.A0R("Expect param native_flow = true in Uri but got Uri = ", uri.toString()));
        }
        String queryParameter = uri.getQueryParameter("api_path");
        String queryParameter2 = uri.getQueryParameter("challenge_context");
        ? obj = new Object();
        obj.A00 = queryParameter;
        obj.A01 = queryParameter2;
        A00(r5).A02(context, obj);
    }
}
