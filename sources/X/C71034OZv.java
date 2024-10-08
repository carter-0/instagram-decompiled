package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OZv  reason: case insensitive filesystem */
public abstract class C71034OZv {
    public short A00 = 2;
    public final int A01;
    public final long A02 = 2SP.A01.A09(-3600000, 3600000);
    public final QuickPerformanceLogger A03;

    public static final QuickPerformanceLogger A01(C71034OZv oZv) {
        if (1AW.A06(0Tu.A05, 18313452787350266L)) {
            return oZv.A03;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Npg, java.lang.Object] */
    public static C68378NEe A02(Integer num, String str, boolean z) {
        ? obj = new Object();
        obj.A03 = z;
        obj.A00 = num;
        obj.A01 = str;
        obj.A02 = "mwa";
        return new C68378NEe(obj);
    }

    public final void A05(String str, String str2) {
        QuickPerformanceLogger A012;
        if (str2 != null && (A012 = A01(this)) != null) {
            A012.markerAnnotate(884869075, this.A01, str, str2);
        }
    }

    public C71034OZv(QuickPerformanceLogger quickPerformanceLogger, int i) {
        this.A01 = i;
        this.A03 = quickPerformanceLogger;
    }

    public final void A03() {
        QuickPerformanceLogger A012 = A01(this);
        if (A012 != null) {
            A012.markerStartWithCancelPolicy(884869075, false, this.A01, A012.currentMonotonicTimestamp() + this.A02, TimeUnit.MILLISECONDS);
        }
        C68378NEe nEe = (C68378NEe) this;
        nEe.A05("log_id", AnonymousClass7TF.A0c());
        nEe.A05("host_app", "instagram");
        C69658Npg npg = nEe.A00;
        boolean z = npg.A03;
        QuickPerformanceLogger A013 = A01(nEe);
        if (A013 != null) {
            A013.markerAnnotate(884869075, nEe.A01, "is_outgoing", z);
        }
        nEe.A05("destination_app", npg.A02);
        nEe.A05("action_string", npg.A01);
        C68378NEe.A00(nEe, npg.A00);
    }

    public final void A04(String str) {
        QuickPerformanceLogger A012 = A01(this);
        if (A012 != null) {
            A012.markerPoint(884869075, this.A01, str, A012.currentMonotonicTimestamp() + this.A02, TimeUnit.MILLISECONDS);
        }
    }

    public final void A06(short s) {
        QuickPerformanceLogger A012 = A01(this);
        if (A012 != null) {
            A012.markerEnd(884869075, this.A01, s, A012.currentMonotonicTimestamp() + this.A02, TimeUnit.MILLISECONDS);
        }
    }
}
