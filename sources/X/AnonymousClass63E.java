package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.63E  reason: invalid class name */
public abstract class AnonymousClass63E {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final AnonymousClass63L A03;
    public final AnonymousClass63K A04;
    public final AnonymousClass63S A05;
    public final AnonymousClass63Q A06;
    public final AnonymousClass63T A07;
    public final String A08;
    public final AnonymousClass63P A09;

    public static final AnonymousClass9GD A00(AnonymousClass63E r5, SFC sfc, int i) {
        C365498nD r4 = new C365498nD();
        AnonymousClass63P r2 = r5.A09;
        AnonymousClass63T r3 = r5.A07;
        AnonymousClass63T.A05(r5, r3, r4, sfc.A00);
        C10599Rut rut = new C10599Rut(r5, new C8382Qpn(r2, sfc, r4, i), r3.A0C.get());
        Handler handler = r3.A06;
        handler.sendMessage(handler.obtainMessage(4, rut));
        return r4.A00;
    }

    public AnonymousClass63E(Activity activity, Context context, AnonymousClass63L r8, AnonymousClass63K r9, AnonymousClass63N r10) {
        String str;
        AnonymousClass3Qk.A03(context, "Null context is not permitted.");
        AnonymousClass3Qk.A03(r9, "Api must not be null.");
        AnonymousClass3Qk.A03(r10, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AnonymousClass3Qk.A03(applicationContext, "The provided context did not have an application context.");
        this.A01 = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.A08 = str;
        this.A04 = r9;
        this.A03 = r8;
        this.A02 = r10.A00;
        AnonymousClass63Q r3 = new AnonymousClass63Q(r8, r9, str);
        this.A06 = r3;
        this.A05 = new AnonymousClass63R(this);
        AnonymousClass63T A012 = AnonymousClass63T.A01(applicationContext);
        this.A07 = A012;
        this.A00 = A012.A0B.getAndIncrement();
        this.A09 = r10.A01;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C13806ThV A002 = LifecycleCallback.A00(activity);
            AnonymousClass63b r1 = (AnonymousClass63b) A002.Ajc(AnonymousClass63b.class, "ConnectionlessLifecycleHelper");
            r1 = r1 == null ? new AnonymousClass63b(GoogleApiAvailability.A00, A012, A002) : r1;
            r1.A00.add(r3);
            A012.A07(r1);
        }
        Handler handler = A012.A06;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public static final void A01(AnonymousClass63E r4, C8412Qts qts, int i) {
        qts.A05();
        AnonymousClass63T r3 = r4.A07;
        C10599Rut rut = new C10599Rut(r4, new C8385Qpq(qts, i), r3.A0C.get());
        Handler handler = r3.A06;
        handler.sendMessage(handler.obtainMessage(4, rut));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass63E(android.app.Activity r8, X.AnonymousClass63L r9, X.AnonymousClass63K r10, X.AnonymousClass63P r11) {
        /*
            r7 = this;
            r2 = r8
            android.os.Looper r1 = r8.getMainLooper()
            java.lang.String r0 = "Looper must not be null."
            X.AnonymousClass3Qk.A03(r1, r0)
            if (r1 != 0) goto L_0x0010
            android.os.Looper r1 = android.os.Looper.getMainLooper()
        L_0x0010:
            X.63N r6 = new X.63N
            r6.<init>(r1, r11)
            r1 = r7
            r4 = r9
            r5 = r10
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63E.<init>(android.app.Activity, X.63L, X.63K, X.63P):void");
    }

    public AnonymousClass63E(Context context, AnonymousClass63L r8, AnonymousClass63K r9, AnonymousClass63N r10) {
        this((Activity) null, context, r8, r9, r10);
    }
}
