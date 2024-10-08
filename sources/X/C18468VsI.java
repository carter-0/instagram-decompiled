package X;

import android.content.Context;
import android.text.format.DateFormat;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;

/* renamed from: X.VsI  reason: case insensitive filesystem */
public final class C18468VsI {
    public static final SimpleDateFormat A03 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(AnonymousClass1Q2.A02(), "MMM dd"), AnonymousClass1Q2.A02());
    public final Context A00;
    public final UserSession A01;
    public final X50 A02;

    public C18468VsI(Context context, UserSession userSession, X50 x50) {
        0qQ.A0B(x50, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = x50;
    }
}
