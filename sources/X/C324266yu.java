package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.6yu  reason: invalid class name and case insensitive filesystem */
public final class C324266yu extends C252233om {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final List A03 = new ArrayList();

    public C324266yu(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 3);
        this.A01 = r3;
        this.A02 = userSession;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A00 = applicationContext;
    }
}
