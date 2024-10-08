package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.Nf9  reason: case insensitive filesystem */
public final class C69128Nf9 extends OTZ {
    public 1Ng A00;
    public N91 A01;
    public Integer A02;
    public List A03;
    public ScheduledFuture A04;
    public 0V2 A05 = 10D.A01(AnonymousClass05K.A01, 1, 0);
    public final UserSession A06;
    public final C70502O9b A07;
    public final HashMap A08;
    public final ScheduledExecutorService A09;

    public C69128Nf9(UserSession userSession, O9R o9r, C70502O9b o9b) {
        super(o9r);
        this.A06 = userSession;
        this.A07 = o9b;
        Integer num = AnonymousClass05K.A00;
        this.A01 = new N91(num, (String) null, 0);
        this.A02 = num;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        this.A09 = scheduledThreadPoolExecutor;
        this.A03 = 0sn.A00;
        this.A00 = AnonymousClass1Nd.A00(userSession);
        this.A08 = AnonymousClass7TE.A1E();
    }
}
