package X;

import android.content.Context;
import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.Gcz  reason: case insensitive filesystem */
public final class C52807Gcz extends CountDownTimer {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C307236Pi A03;
    public final /* synthetic */ UpcomingEvent A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52807Gcz(Context context, UserSession userSession, C307236Pi r5, UpcomingEvent upcomingEvent, float f, long j) {
        super(j, 1000);
        this.A03 = r5;
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = upcomingEvent;
        this.A00 = f;
    }

    public final void onTick(long j) {
        C307246Pj r7 = this.A03.A02;
        Context context = this.A01;
        UpcomingEvent upcomingEvent = this.A04;
        r7.A00(context, new C55945Hq9(context, C61410nE.A00).A00(C18810W3l.A03(upcomingEvent), new Date(C18810W3l.A01(upcomingEvent))), this.A00);
    }

    public final void onFinish() {
        cancel();
    }
}
