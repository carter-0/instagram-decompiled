package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.8w4  reason: invalid class name and case insensitive filesystem */
public final class C370248w4 {
    public final File A00;

    public C370248w4(Context context, UserSession userSession) {
        this.A00 = new File(context.getFilesDir(), 002.A0R(userSession.A06, "/storydrafts"));
    }
}
