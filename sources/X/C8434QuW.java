package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.concurrent.locks.Lock;

/* renamed from: X.QuW  reason: case insensitive filesystem */
public final class C8434QuW extends C3024063e {
    public final /* synthetic */ C12554Sxf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8434QuW(Looper looper, C12554Sxf sxf) {
        super(looper);
        this.A00 = sxf;
    }

    public final void handleMessage(Message message) {
        ConnectionResult connectionResult;
        C12550Sxb sxb;
        IAccountAccessor iAccountAccessor;
        int i = message.what;
        if (i == 1) {
            C10264RpO rpO = (C10264RpO) message.obj;
            C12554Sxf sxf = this.A00;
            Lock lock = sxf.A0D;
            lock.lock();
            try {
                if (sxf.A0E == rpO.A00) {
                    if (rpO instanceof C8377Qpi) {
                        C8377Qpi qpi = (C8377Qpi) rpO;
                        sxb = qpi.A00;
                        zak zak = qpi.A01;
                        if (C12550Sxb.A07(sxb, 0)) {
                            connectionResult = zak.A01;
                            if (connectionResult.A01 == 0) {
                                zav zav = zak.A02;
                                AnonymousClass3Qk.A02(zav);
                                connectionResult = zav.A02;
                                if (connectionResult.A01 == 0) {
                                    sxb.A04 = true;
                                    IBinder iBinder = zav.A01;
                                    if (iBinder == null) {
                                        iAccountAccessor = null;
                                    } else {
                                        iAccountAccessor = AccountAccessor.A00(iBinder);
                                    }
                                    AnonymousClass3Qk.A02(iAccountAccessor);
                                    sxb.A00 = iAccountAccessor;
                                    sxb.A05 = zav.A03;
                                    sxb.A06 = zav.A04;
                                } else {
                                    String valueOf = String.valueOf(String.valueOf(connectionResult));
                                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                                }
                            } else if (sxb.A02 && connectionResult.A02 == null) {
                                C12550Sxb.A03(sxb);
                            }
                            C12550Sxb.A04(sxb);
                        }
                    } else if (rpO instanceof C8375Qpg) {
                        ((C8375Qpg) rpO).A00.De8(new ConnectionResult(16, (PendingIntent) null));
                    } else if (rpO instanceof C8376Qph) {
                        C8376Qph qph = (C8376Qph) rpO;
                        sxb = qph.A01.A01;
                        connectionResult = qph.A00;
                    } else {
                        ((C8374Qpf) rpO).A00.FOZ(1);
                    }
                    C12550Sxb.A02(connectionResult, sxb);
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GACStateManager", 002.A0O("Unknown message id: ", i));
        } else {
            throw ((Throwable) message.obj);
        }
    }
}
