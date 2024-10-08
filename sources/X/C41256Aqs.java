package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.Aqs  reason: case insensitive filesystem */
public final class C41256Aqs implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C69465Nm9 A01;
    public final /* synthetic */ AnonymousClass7VX A02;
    public final /* synthetic */ RtcCallFunnelSessionId A03;
    public final /* synthetic */ C331537Rj A04;
    public final /* synthetic */ RtcStartCoWatchPlaybackArguments A05;
    public final /* synthetic */ boolean A06;

    public C41256Aqs(Context context, C69465Nm9 nm9, AnonymousClass7VX r3, RtcCallFunnelSessionId rtcCallFunnelSessionId, C331537Rj r5, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, boolean z) {
        this.A02 = r3;
        this.A00 = context;
        this.A06 = z;
        this.A04 = r5;
        this.A05 = rtcStartCoWatchPlaybackArguments;
        this.A03 = rtcCallFunnelSessionId;
        this.A01 = nm9;
    }

    public final void run() {
        ScheduledFuture scheduledFuture;
        AnonymousClass7VX r2 = this.A02;
        Activity rootActivity = r2.A01.getRootActivity();
        0qQ.A0A(rootActivity);
        Context context = this.A00;
        UserSession userSession = r2.A03;
        Object value = r2.A08.getValue();
        boolean z = this.A06;
        AnonymousClass0iw r10 = r2.A02;
        C331537Rj r11 = this.A04;
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = this.A05;
        RtcCallFunnelSessionId rtcCallFunnelSessionId = this.A03;
        C69465Nm9 nm9 = this.A01;
        0qQ.A0B(rootActivity, 0);
        0qQ.A0B(value, 3);
        C58234Ioc ioc = new C58234Ioc(context, userSession, value, r10, r11, rtcStartCoWatchPlaybackArguments, rtcCallFunnelSessionId, nm9, 1, z);
        String[] strArr = (String[]) AnonymousClass7TE.A1C().toArray(new String[0]);
        int length = strArr.length;
        if (1DL.A08(rootActivity, (String[]) Arrays.copyOf(strArr, length))) {
            ioc.invoke();
        } else {
            1DL.A04(rootActivity, new C19254WRn(1, rootActivity, ioc, strArr), (String[]) Arrays.copyOf(strArr, length));
        }
        C72208OyY A002 = C72208OyY.A00(userSession);
        if (A002.A06 != null && A002.A03 != null && (scheduledFuture = A002.A07) != null) {
            scheduledFuture.cancel(false);
        }
    }
}
