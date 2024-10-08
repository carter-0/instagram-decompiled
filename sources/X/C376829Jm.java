package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Jm  reason: invalid class name and case insensitive filesystem */
public final class C376829Jm extends AnonymousClass1Ek implements 0sL {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376829Jm(int i, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Jm, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        int i;
        switch (this.A00) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new C376829Jm(i, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 r4 = (AnonymousClass4D7) obj2;
        if (this.A00 == 0) {
            return ((C376829Jm) create(obj, r4)).invokeSuspend(C60340gF.A00);
        }
        if (r4 != null) {
            r4.getContext();
        }
        C60340gF r0 = C60340gF.A00;
        0eS.A00(r0);
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        boolean bindService;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            UserSession userSession = AnonymousClass94L.A02;
            if (userSession != null) {
                0Tu r5 = 0Tu.A05;
                if (Boolean.valueOf(182.A06(r5, userSession, 36321404552226144L)).booleanValue()) {
                    Context context = AnonymousClass94L.A00;
                    if (context != null) {
                        02m r6 = 02m.A0p;
                        0qQ.A07(r6);
                        UserSession userSession2 = AnonymousClass94L.A02;
                        if (userSession2 != null) {
                            0Tu r4 = 0Tu.A06;
                            boolean booleanValue = Boolean.valueOf(182.A06(r4, userSession2, 2342164413765133655L)).booleanValue();
                            UserSession userSession3 = AnonymousClass94L.A02;
                            if (userSession3 != null) {
                                if (C392389uj.A00(context, r6, booleanValue, Boolean.valueOf(182.A06(r4, userSession3, 36321404551898460L)).booleanValue())) {
                                    A7N a7n = AnonymousClass94L.A01;
                                    if (a7n == null) {
                                        Context context2 = AnonymousClass94L.A00;
                                        if (context2 != null) {
                                            02m r3 = 02m.A0p;
                                            0qQ.A07(r3);
                                            UserSession userSession4 = AnonymousClass94L.A02;
                                            if (userSession4 != null) {
                                                a7n = new A7N(context2, AnonymousClass1K7.A00(), r3, Boolean.valueOf(182.A06(r5, userSession4, 2342164413766051170L)).booleanValue());
                                                AnonymousClass94L.A01 = a7n;
                                            }
                                        }
                                    }
                                    CountDownLatch countDownLatch = new CountDownLatch(1);
                                    synchronized (a7n.A02) {
                                        a7n.A01.markerStart(47654742);
                                        AL5 al5 = new AL5(a7n, countDownLatch);
                                        Intent intent = new Intent();
                                        Context context3 = a7n.A00;
                                        intent.setComponent(new ComponentName(context3, "com.facebook.browser.helium.preload.AppZygoteWarmerService"));
                                        bindService = context3.bindService(intent, al5, 561);
                                        if (!bindService) {
                                            0KC.A0C("AppZygoteWarmer", "Failed to bind service");
                                        }
                                    }
                                    if (bindService) {
                                        try {
                                            if (!countDownLatch.await(10000, TimeUnit.MILLISECONDS)) {
                                                0KC.A0D("AppZygoteWarmer", "Timed out waiting for zygote warmer service");
                                            }
                                        } catch (InterruptedException e) {
                                            0KC.A0F("AppZygoteWarmer", "Interrupted waiting for zygote warmer service", e);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("appContext");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        return C60340gF.A00;
    }
}
