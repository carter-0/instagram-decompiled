package X;

import android.util.Log;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.HashSet;
import java.util.Set;
import kotlin.Deprecated;

@Deprecated(message = "Do not use this. This is a clone of LiveData. Use LiveData for Java use cases, and Flow for Kotlin use cases.")
/* renamed from: X.80m  reason: invalid class name and case insensitive filesystem */
public final class C3494680m {
    public Object A00;
    public final Set A01 = new HashSet();

    public final void A01(C3495480u r3) {
        0qQ.A0B(r3, 0);
        Set set = this.A01;
        synchronized (set) {
            set.add(r3);
        }
    }

    public final void A02(C3495480u r3) {
        0qQ.A0B(r3, 0);
        Set set = this.A01;
        synchronized (set) {
            set.remove(r3);
        }
    }

    public final void A03(Object obj) {
        synchronized (this.A01) {
            this.A00 = obj;
            11Z.A03(new AnonymousClass8YM(this, obj));
        }
    }

    public final void A04(Object obj) {
        Set set = this.A01;
        synchronized (set) {
            this.A00 = obj;
            11Z.A02(new AnonymousClass81J(obj, new HashSet(set)));
        }
    }

    public C3494680m(Object obj) {
        this.A00 = obj;
    }

    public static void A00(C365928nu r3, AnonymousClass8XA r4, String str, Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        0qQ.A07(stackTraceString);
        r3.A03(002.A0R(str, 00R.A03(stackTraceString, IgNetworkConsentStorage.MAX_ENTRIES)), 002.A0R("camera_destination ", ((C279284yO) r4.A0G.A08.A00).A02));
    }
}
