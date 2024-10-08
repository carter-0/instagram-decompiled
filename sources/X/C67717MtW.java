package X;

import android.content.Intent;
import android.os.IBinder;
import com.fbpay.w3c.ipc.AutofillKeyFetchServiceImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaDirectMessagingService;
import com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl;
import java.util.Locale;

/* renamed from: X.MtW  reason: case insensitive filesystem */
public abstract class C67717MtW extends AnonymousClass0h3 {
    public 0aw A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 0bY A05 = new Object();

    public final void A00(String str, Object... objArr) {
        0bY r3 = this.A05;
        String format = String.format(Locale.US, str, C66581MXm.A1b(objArr, 1));
        0qQ.A07(format);
        r3.EFT("SecureBaseLifecycleServiceWithSwitchOff", format, new Throwable());
    }

    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        0qQ.A0B(intent, 0);
        super.onBind(intent);
        if (!C59910bu.A02().A00(this, intent, this)) {
            0b1 r3 = C59850bV.A00;
            0qQ.A08(r3);
            String str = this.A01;
            if (str == null) {
                0qQ.A0F("endpointName");
                throw AnonymousClass00P.createAndThrow();
            }
            r3.A00(intent, str, "onBind", "deny");
            return null;
        }
        if (this instanceof TrustedDeviceFoundationServiceImpl) {
            iBinder = ((TrustedDeviceFoundationServiceImpl) this).A00;
        } else if (this instanceof StellaDirectMessagingService) {
            iBinder = ((StellaDirectMessagingService) this).A03;
        } else {
            iBinder = ((AutofillKeyFetchServiceImpl) this).A00;
        }
        if (iBinder != null) {
            return new C7362Q6u(this, iBinder, new C73912Pln(this, 24));
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0bY] */
    public C67717MtW() {
        0aw r0 = 0aw.A01;
        0qQ.A08(r0);
        this.A00 = r0;
    }

    public final void onCreate() {
        int i;
        int A042 = AnonymousClass0fD.A04(-1650889166);
        if (this.A02) {
            A00("Class javaClass called onCreate twice.", new Object[0]);
            super.onCreate();
            i = 1356842321;
        } else {
            try {
                this.A02 = true;
                this.A01 = 002.A0R(getPackageName(), "/javaClass");
                if (this instanceof StellaDirectMessagingService) {
                    1xC.A01.A02(((StellaDirectMessagingService) this).A02, AnonymousClass08Z.class);
                } else {
                    super.onCreate();
                }
                this.A02 = false;
                i = 1712109789;
            } catch (Throwable th) {
                this.A02 = false;
                AnonymousClass0fD.A0B(354876315, A042);
                throw th;
            }
        }
        AnonymousClass0fD.A0B(i, A042);
    }

    public final void onDestroy() {
        int i;
        int A042 = AnonymousClass0fD.A04(1239881210);
        if (this.A03) {
            A00("Class javaClass called onDestroy twice.", new Object[0]);
            super.onDestroy();
            i = 1251363520;
        } else {
            try {
                this.A03 = true;
                if (this instanceof StellaDirectMessagingService) {
                    StellaDirectMessagingService stellaDirectMessagingService = (StellaDirectMessagingService) this;
                    1xC.A01.A03(stellaDirectMessagingService.A02, AnonymousClass08Z.class);
                    08y r1 = 09i.A0A;
                    if (r1.A05(stellaDirectMessagingService) instanceof UserSession) {
                        C282285Cm.A00(O06.A00(r1.A08(stellaDirectMessagingService)).A00).A00();
                    }
                } else {
                    super.onDestroy();
                }
                this.A03 = false;
                i = 1115409019;
            } catch (Throwable th) {
                this.A03 = false;
                AnonymousClass0fD.A0B(-411468035, A042);
                throw th;
            }
        }
        AnonymousClass0fD.A0B(i, A042);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand;
        int i3;
        int A042 = AnonymousClass0fD.A04(399160793);
        if (this.A04) {
            A00("Class javaClass called onStartCommand twice.", new Object[0]);
            0b1 r2 = C59850bV.A00;
            0qQ.A08(r2);
            String str = this.A01;
            if (str != null) {
                r2.A00(intent, str, "onStartCommand", "deny");
                onStartCommand = super.onStartCommand(intent, i, i2);
                i3 = 1249133935;
            }
            0qQ.A0F("endpointName");
            throw AnonymousClass00P.createAndThrow();
        } else if (!C59910bu.A02().A00(this, intent, this)) {
            0b1 r22 = C59850bV.A00;
            0qQ.A08(r22);
            String str2 = this.A01;
            if (str2 != null) {
                r22.A00(intent, str2, "onStartCommand", "deny");
                onStartCommand = super.onStartCommand(intent, i, i2);
                i3 = -850287889;
            }
            0qQ.A0F("endpointName");
            throw AnonymousClass00P.createAndThrow();
        } else if (!this.A00.A00(this, intent, this.A05, this)) {
            0b1 r23 = C59850bV.A00;
            0qQ.A08(r23);
            String str3 = this.A01;
            if (str3 != null) {
                r23.A00(intent, str3, "onStartCommand", "deny");
                onStartCommand = super.onStartCommand(intent, i, i2);
                i3 = -157459124;
            }
            0qQ.A0F("endpointName");
            throw AnonymousClass00P.createAndThrow();
        } else {
            try {
                this.A04 = true;
                0b1 r3 = C59850bV.A00;
                0qQ.A08(r3);
                String str4 = this.A01;
                if (str4 == null) {
                    0qQ.A0F("endpointName");
                    throw AnonymousClass00P.createAndThrow();
                }
                r3.A00(intent, str4, "onStartCommand", "allow");
                onStartCommand = onStartCommand(intent, i, i2);
                this.A04 = false;
                i3 = 1255304309;
            } catch (Throwable th) {
                this.A04 = false;
                AnonymousClass0fD.A0B(1332405780, A042);
                throw th;
            }
        }
        AnonymousClass0fD.A0B(i3, A042);
        return onStartCommand;
    }
}
