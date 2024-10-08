package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2mZ  reason: invalid class name and case insensitive filesystem */
public final class C228932mZ implements 07h {
    public final int A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass11X A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final Context A04;
    public final Integer A05;

    public final 07p D6j(Bundle bundle, int i) {
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R(this.A02.getName(), " LoaderScheduler::onCreateLoader()"), -744555307);
        }
        try {
            AnonymousClass11X r4 = this.A02;
            r4.onStart();
            return new C228942ma(this.A04, r4, this.A05, this.A03);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1739609889);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DOK(07p r5, Object obj) {
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R(this.A02.getName(), " onFinish"), -1589647225);
        }
        try {
            this.A02.onFinish();
            this.A03.set(true);
            this.A01.A03(this.A00);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-494679964);
            }
        }
    }

    public C228932mZ(Context context, AnonymousClass07i r4, AnonymousClass11X r5, Integer num, int i) {
        this.A01 = r4;
        this.A00 = i;
        this.A02 = r5;
        this.A05 = num;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A04 = applicationContext;
    }
}
