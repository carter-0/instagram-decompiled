package X;

import android.content.Context;
import android.os.Build;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.scanner.MediaScannerJobService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2jD  reason: invalid class name and case insensitive filesystem */
public final class C227402jD implements C61110lV, 0lm {
    public int A00;
    public final Context A01;
    public final UserSession A02;
    public final C227412jE A03;
    public final C227422jG A04;
    public final C227382jA A05;
    public volatile boolean A06;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.2jE] */
    public /* synthetic */ C227402jD(Context context, UserSession userSession, C227382jA r5) {
        ? obj = new Object();
        C227422jG r0 = new C227422jG(userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = r5;
        this.A03 = obj;
        this.A04 = r0;
    }

    public static final void A00(C227402jD r7) {
        UserSession userSession = r7.A02;
        C227462jM A002 = C227462jM.A00(r7.A01, userSession);
        0qQ.A0B(userSession, 0);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36318002939107060L);
        C227502jR r2 = new C227502jR(MediaScannerJobService.class, R.id.media_scanner_job_scheduler_id);
        r2.A05 = true;
        r2.A00 = 1;
        r2.A02 = TimeUnit.MINUTES.toMillis(10);
        r2.A09 = A062;
        r2.A08 = false;
        A002.A04(new C227512jS(r2));
    }

    public final void A01() {
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(281480192, 3));
        C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 25);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
    }

    public final void A02(long j, boolean z, boolean z2) {
        String A0c;
        C282635Eb r3 = (C282635Eb) C282635Eb.A03.getValue();
        UserSession userSession = this.A02;
        if (AnonymousClass5Ea.A00(userSession) == AnonymousClass05K.A00) {
            A0c = "user permission for suggestions not granted.";
        } else {
            int i = this.A00;
            if (i >= 100) {
                A0c = 002.A0c("max scans per session reached: ", " - not scheduling another", i);
            } else if (Build.VERSION.SDK_INT > 29) {
                r3.A00("start scheduling.");
                A00(this);
                this.A00++;
                Context context = this.A01;
                C227462jM A002 = C227462jM.A00(context, userSession);
                C227502jR r2 = new C227502jR(MediaScannerJobService.class, R.id.media_scanner_job_scheduler_id);
                r2.A05 = true;
                r2.A00 = 1;
                r2.A02 = TimeUnit.MINUTES.toMillis(j);
                r2.A09 = z2;
                r2.A08 = z;
                A002.A03(context, userSession, new C227512jS(r2));
                return;
            } else {
                return;
            }
        }
        r3.A00(A0c);
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (this.A06) {
            this.A06 = false;
            A00(this);
            14i.A06(this);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-285417652);
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        A02(10, 182.A06(r2, userSession, 2342161012152145644L), 182.A06(r2, userSession, 36318002939107060L));
        AnonymousClass0fD.A0A(1064604974, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-988515033);
        A00(this);
        AnonymousClass0fD.A0A(-339703130, A032);
    }
}
