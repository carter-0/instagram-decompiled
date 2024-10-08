package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.8Zt  reason: invalid class name and case insensitive filesystem */
public final class C357808Zt implements AnonymousClass2Np {
    public final File A00;

    public final File C4W() {
        return this.A00;
    }

    public C357808Zt(Context context, UserSession userSession) {
        File file = new File(new File(context.getFilesDir(), 002.A0R(userSession.A06, "/audioburnin")), "temp");
        this.A00 = file;
        C357818Zu.A00(file);
    }
}
