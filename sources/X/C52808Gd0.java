package X;

import android.os.CountDownTimer;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.Gd0  reason: case insensitive filesystem */
public final class C52808Gd0 extends CountDownTimer {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ AnonymousClass5F2 A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ C55945Hq9 A03;
    public final /* synthetic */ UpcomingEvent A04;
    public final /* synthetic */ Date A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52808Gd0(IgTextView igTextView, AnonymousClass5F2 r4, AnonymousClass3W1 r5, C55945Hq9 hq9, UpcomingEvent upcomingEvent, Date date, long j) {
        super(j, 1000);
        this.A00 = igTextView;
        this.A03 = hq9;
        this.A05 = date;
        this.A04 = upcomingEvent;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final void onFinish() {
        this.A01.A00(this.A02);
    }

    public final void onTick(long j) {
        this.A00.setText(this.A03.A00(C18810W3l.A03(this.A04), this.A05));
    }
}
