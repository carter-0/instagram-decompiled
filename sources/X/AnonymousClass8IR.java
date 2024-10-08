package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* renamed from: X.8IR  reason: invalid class name */
public final class AnonymousClass8IR {
    public C386959lR A00;
    public final Context A01;
    public final 2Nn A02;
    public final Queue A03;
    public final ExecutorService A04 = new 0na(711, 3, false, true);

    public AnonymousClass8IR(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = 2Nm.A00(context, userSession);
        this.A03 = new LinkedList();
    }
}
