package X;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;

public abstract class MYU extends C252423p5 {
    public boolean A00;
    public boolean A01;
    public final MessageQueue.IdleHandler A02 = new C66614MZa(this);
    public final MYT A03 = new MYT(this);

    public void A0O(Context context, 2cc r8, AnonymousClass0iw r9, AnonymousClass4DJ r10) {
        A0P(context, r8, r9, r10, false);
    }

    public void A0R(Context context, 2cc r8, AnonymousClass4DJ r9) {
        A0P(context, r8, (AnonymousClass0iw) null, r9, false);
    }

    public boolean A0S() {
        return true;
    }

    public final void A03() {
        if (this.A01) {
            super.A03();
        }
    }

    public void A0M() {
        if (this.A01 && !this.A01) {
            this.A01 = true;
            02m r3 = this.A05;
            int A0L = A0L();
            r3.markerPoint(A0L, this.A00, "initialize_end");
            if (!A0S()) {
                r3.markerDrop(A0L, this.A00);
            } else if (this.A08.isEmpty()) {
                A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 2);
            }
        }
    }

    public final void A0N() {
        if (this.A01) {
            Looper.myQueue().addIdleHandler(new C3253972f(this));
        }
    }

    public void A0P(Context context, 2cc r7, AnonymousClass0iw r8, AnonymousClass4DJ r9, boolean z) {
        this.A00 = z;
        boolean z2 = r9 instanceof AnonymousClass0iw;
        if (z2) {
            1Jk.A04((AnonymousClass0iw) r9);
        }
        r9.registerLifecycleListener(this.A03);
        A0Q(context, r7, r8, true);
        if (z2) {
            this.A05.markerAnnotate(A0L(), this.A00, "container_module", ((AnonymousClass0iw) r9).getModuleName());
        }
    }

    public void A0Q(Context context, 2cc r14, AnonymousClass0iw r15, boolean z) {
        String str;
        C3018560i r3 = r14.A01;
        if (r3 == null) {
            r3 = new C3018560i((AnonymousClass0iw) null, "unknown", AwakeTimeSinceBootClock.INSTANCE.now());
        }
        String str2 = r3.A03;
        int A0L = A0L();
        A0B(context);
        A09(r3.A01);
        02m r6 = this.A05;
        r6.markerPoint(A0L, this.A00, "initialize_start");
        int i = this.A00;
        if (r15 != null) {
            r6.markerAnnotate(A0L, i, "source_module", r15.getModuleName());
        } else {
            r6.markerAnnotate(A0L, i, "source_module", str2);
        }
        r6.markerAnnotate(A0L, this.A00, "background_state", 14i.A01());
        int i2 = this.A00;
        String str3 = r3.A02;
        if (str3 == null) {
            str3 = "button";
        }
        r6.markerAnnotate(A0L, i2, "click_point", str3);
        int i3 = this.A00;
        if (z) {
            str = "cold";
        } else {
            str = "warm";
        }
        r6.markerAnnotate(A0L, i3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        r6.markerAnnotate(A0L, this.A00, "APP_STARTUP_TYPE", C64031Cc.A09.toString());
        r6.markerAnnotate(A0L, this.A00, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
        int i4 = this.A00;
        long j = -1;
        if (C64031Cc.A00 != -1) {
            j = System.currentTimeMillis() - C64031Cc.A00;
        }
        r6.markerAnnotate(A0L, i4, "time_since_upgrade_ms", j);
        r6.markerAnnotate(A0L, this.A00, "foreground_cold_start_count_since_upgrade", C64031Cc.A05);
        r6.markerAnnotate(A0L, this.A00, "all_cold_start_count_since_upgrade", C64031Cc.A04);
        r6.markerAnnotate(A0L, this.A00, "foreground_timespent_since_upgrade_ms", C64031Cc.A06);
        C249813kP.A00.A03(A0L, "click_point", str3);
    }

    public MYU(0lg r2) {
        super(r2);
    }
}
