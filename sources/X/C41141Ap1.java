package X;

import android.os.SystemClock;
import com.facebook.quicklog.reliability.CancelReason;
import java.io.File;

/* renamed from: X.Ap1  reason: case insensitive filesystem */
public final class C41141Ap1 implements Runnable {
    public final /* synthetic */ C61072JwA A00;
    public final /* synthetic */ C21986Xoh A01;
    public final /* synthetic */ C353148Gl A02;

    public C41141Ap1(C61072JwA jwA, C21986Xoh xoh, C353148Gl r3) {
        this.A02 = r3;
        this.A01 = xoh;
        this.A00 = jwA;
    }

    public final void run() {
        AnonymousClass87G A0D;
        C353148Gl r2 = this.A02;
        C21986Xoh xoh = this.A01;
        C61072JwA jwA = this.A00;
        xoh.A01(C21986Xoh.A0V);
        xoh.A01(C21986Xoh.A0W);
        SystemClock.elapsedRealtime();
        C353118Gi r22 = r2.A00;
        r22.A0V.setButtonActionsEnabled(true);
        r22.A0K.A07();
        AnonymousClass85X r0 = r22.A0N;
        r0.A0K = false;
        AnonymousClass85X.A06(r0);
        AnonymousClass8DD r02 = r22.A0Q;
        if (!(r02 == null || (A0D = r02.A0D()) == null || A0D.A04 == AnonymousClass87I.EMPTY || (r22.A0I.A08.A00 instanceof AnonymousClass80O))) {
            r22.A0P.A0C(true);
        }
        C352888Fl r6 = r22.A0J.A00;
        if (r6.A0I) {
            r22.A0O.A02.A08(AnonymousClass05K.A00);
            File file = r22.A07;
            file.getClass();
            C21986Xoh xoh2 = r22.A00;
            xoh2.getClass();
            C349307zv A04 = C39908AIz.A04(xoh2, file);
            int i = jwA.A01;
            A04.A07 = i;
            A04.A0H = 0;
            A04.A06 = i;
            A04.A0U = (0v6) jwA.A02;
            C21986Xoh xoh3 = (C21986Xoh) r22.A00.A01(C21986Xoh.A0R);
            if (xoh3 != null) {
                File file2 = r22.A06;
                file2.getClass();
                A04.A0X = C39908AIz.A04(xoh3, file2);
            }
            if (r22.A0Z) {
                r22.A07(A04);
            }
            AnonymousClass8A2 A012 = AnonymousClass8A1.A01(r22.A0H);
            A012.A05 = A012.A0K.A02(17636574, A012.A05);
            r22.A04.A06(A04);
            return;
        }
        C340297l2 r03 = r22.A01;
        r03.getClass();
        r03.A0D();
        AnonymousClass8A2 A013 = AnonymousClass8A1.A01(r22.A0H);
        String A0R = 002.A0R("Video Recording Stopped Successfully, but Camera Not Resumed - ", r6.A0H);
        0qQ.A0B(A0R, 1);
        A013.A05 = A013.A0K.A06(CancelReason.SYSTEM_CANCELLED, A0R, 17636574, A013.A05);
        AnonymousClass8W6 r1 = r22.A04;
        if (r1.A05.A08.A00 instanceof AnonymousClass80O) {
            r1.A0M.DxF();
            C3510387i.A01(r1.A06);
        }
    }
}
