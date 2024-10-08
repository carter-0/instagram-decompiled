package X;

import android.os.BaseBundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CancellationException;

public final class AW0 implements C3736296h {
    public final /* synthetic */ AnonymousClass96T A00;

    public AW0(AnonymousClass96T r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object Ezj(AnonymousClass9GD r5) {
        Throwable th;
        Object obj;
        Class<IOException> cls = IOException.class;
        synchronized (r5.A04) {
            AnonymousClass3Qk.A09(r5.A02, "Task is not yet complete");
            if (r5.A05) {
                th = new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(r5.A00)) {
                Exception exc = r5.A00;
                if (exc == null) {
                    obj = r5.A01;
                } else {
                    th = new RuntimeException(exc);
                }
            } else {
                th = cls.cast(r5.A00);
            }
            throw th;
        }
        BaseBundle baseBundle = (BaseBundle) obj;
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string != null || (string = baseBundle.getString(C66579MXk.A00(176))) != null) {
                return string;
            }
            String string2 = baseBundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(baseBundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                Log.w("FirebaseInstanceId", AnonymousClass7TF.A0l(valueOf, sb), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
