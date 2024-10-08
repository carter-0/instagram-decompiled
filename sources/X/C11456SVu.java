package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SVu  reason: case insensitive filesystem */
public final class C11456SVu implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final AnonymousClass649 A02;
    public final Object A03 = Pxe.A0p();
    public final ArrayList A04 = AnonymousClass7TE.A1C();
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final ArrayList A06 = AnonymousClass7TE.A1C();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass63z r2 = (AnonymousClass63z) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(r2)) {
                    r2.D5e((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", 002.A0O("Don't know how to handle message: ", i), new Exception());
        return false;
    }

    public C11456SVu(Looper looper, AnonymousClass649 r4) {
        this.A02 = r4;
        this.A01 = new C3024063e(looper, this);
    }

    public final void A00(AnonymousClass63y r6) {
        AnonymousClass3Qk.A02(r6);
        synchronized (this.A03) {
            ArrayList arrayList = this.A05;
            if (arrayList.contains(r6)) {
                Pxf.A1L("registerConnectionCallbacks(): listener ", String.valueOf(r6), " is already registered", "GmsClientEvents");
            } else {
                arrayList.add(r6);
            }
        }
        if (this.A02.isConnected()) {
            AnonymousClass7TE.A1S(this.A01, r6, 1);
        }
    }

    public final void A01(AnonymousClass640 r6) {
        AnonymousClass3Qk.A02(r6);
        synchronized (this.A03) {
            ArrayList arrayList = this.A06;
            if (arrayList.contains(r6)) {
                Pxf.A1L("registerConnectionFailedListener(): listener ", String.valueOf(r6), " is already registered", "GmsClientEvents");
            } else {
                arrayList.add(r6);
            }
        }
    }
}
