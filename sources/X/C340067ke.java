package X;

import com.facebook.analytics.dsp.point.IgPointContextProvider;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.7ke  reason: invalid class name and case insensitive filesystem */
public final class C340067ke {
    public final C240463Kz A00;
    public final C340077kf A01;
    public final IgPointContextProvider A02;
    public final C340097kh A03;
    public final AnonymousClass0JR A04;
    public final AnonymousClass0eK A05 = new AnonymousClass9OU();
    public final AnonymousClass0eK A06;

    public C340067ke(0lg r11) {
        AnonymousClass3L2 r7;
        0qQ.A0B(r11, 1);
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A04 = awakeTimeSinceBootClock;
        AnonymousClass3GM r1 = AnonymousClass3GM.A01;
        this.A01 = new C340077kf(r1);
        this.A02 = new IgPointContextProvider(r1);
        AnonymousClass9OV r8 = new AnonymousClass9OV();
        this.A06 = r8;
        C240463Kz A002 = C240443Kx.A00(r11);
        this.A00 = A002;
        C340087kg r5 = new C340087kg(r11);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, r11, 36317208367928151L)) {
            r7 = AnonymousClass3LU.A00(r11);
        } else {
            r7 = null;
        }
        this.A03 = new C340097kh(!182.A06(r3, r11, 36315602050616742L) ? null : A002, r5, awakeTimeSinceBootClock, r7, r8, 182.A06(r3, r11, 36311646390125247L));
    }
}
