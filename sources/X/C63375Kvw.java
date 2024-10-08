package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Kvw  reason: case insensitive filesystem */
public abstract class C63375Kvw {
    public static final ImmutableMap A00(Throwable th) {
        Throwable th2;
        if (th == null) {
            return null;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, th.getClass().getName());
        Object obj = SS5.A00;
        builder.put("trace", JTS.A0l(th));
        String message = th.getMessage();
        if (message != null) {
            builder.put(DialogModule.KEY_MESSAGE, message);
        }
        try {
            th2 = SS5.A00(th);
        } catch (IllegalArgumentException unused) {
            th2 = th.getCause();
        }
        if (!(th2 == null || th2 == th)) {
            builder.put("cause_type", th2.getClass().getName());
            String message2 = th2.getMessage();
            if (message2 != null) {
                builder.put("cause_message", message2);
            }
        }
        return builder.build();
    }
}
