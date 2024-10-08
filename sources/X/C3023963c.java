package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.63c  reason: invalid class name and case insensitive filesystem */
public abstract class C3023963c extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final GoogleApiAvailability A00;
    public final AtomicReference A01 = new AtomicReference((Object) null);
    public final Handler A02 = new C3024063e(Looper.getMainLooper());
    public volatile boolean A03;

    public void A06() {
        this.A03 = true;
    }

    public void A07() {
        this.A03 = false;
    }

    public void A09() {
        Handler handler = ((AnonymousClass63b) this).A01.A06;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public void A0A(ConnectionResult connectionResult, int i) {
        ((AnonymousClass63b) this).A01.A06(connectionResult, i);
    }

    public final void A0B(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        C10465Rsg rsg = new C10465Rsg(connectionResult, i);
        do {
            atomicReference = this.A01;
            if (1FH.A00((Object) null, rsg, atomicReference)) {
                this.A02.post(new TH7(rsg, this));
                return;
            }
        } while (atomicReference.get() == null);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null);
        AtomicReference atomicReference = this.A01;
        C10465Rsg rsg = (C10465Rsg) atomicReference.get();
        if (rsg == null) {
            i = -1;
        } else {
            i = rsg.A00;
        }
        atomicReference.set((Object) null);
        A0A(connectionResult, i);
    }

    public C3023963c(GoogleApiAvailability googleApiAvailability, C13806ThV thV) {
        super(thV);
        this.A00 = googleApiAvailability;
    }
}
