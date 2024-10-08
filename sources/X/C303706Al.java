package X;

import android.content.Context;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NotificationCenter;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.HashSet;

/* renamed from: X.6Al  reason: invalid class name and case insensitive filesystem */
public final class C303706Al implements 1aV {
    public final /* synthetic */ AnonymousClass6AU A00;

    public C303706Al(AnonymousClass6AU r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        AnonymousClass6AU r11 = this.A00;
        0fh.A01("RxAdvancedCryptoTransportV2.maybeCreateACTAndLogin", -1675969581);
        try {
            AnonymousClass6AQ r10 = r11.A05;
            int i2 = 1;
            if (r10.A01 == 1 || r11.A02.A0X() != null) {
                i = 1456467361;
            } else {
                AnonymousClass634 r12 = (AnonymousClass634) r11.A01.A0X();
                if (r12 == null) {
                    i = 2120869171;
                } else {
                    2I1 r9 = r11.A06;
                    r9.A04("create_act_param_start");
                    if (!AnonymousClass45R.A00(r11.A04)) {
                        i2 = 2;
                    } else {
                        long j = AnonymousClass635.A00;
                        if (j == -1 || j == r11.A00) {
                            String str = r11.A08;
                            if (0qQ.A0K(str, "NOTIFICATION")) {
                                i2 = 4;
                            } else if (0qQ.A0K(str, "NOTIFICATION_RETRY")) {
                                i2 = 5;
                            } else {
                                i2 = 0;
                                if (0qQ.A0K(str, "periodic_sync")) {
                                    i2 = 3;
                                }
                            }
                        }
                        AnonymousClass635.A00 = r11.A00;
                    }
                    AnonymousClass692 r8 = r12.A02.A01.A00;
                    C300185wg r13 = r8.A01;
                    String str2 = (String) r13.A05.get();
                    boolean z = false;
                    if (str2 != null) {
                        0qQ.A0B("/", 1);
                        if (str2.endsWith("/")) {
                            str2 = str2.substring(0, str2.length() - 1);
                            0qQ.A07(str2);
                        }
                    }
                    AnonymousClass6AT r4 = r12.A03;
                    if (r4.A05 && 0JC.A00().A04()) {
                        z = true;
                    }
                    r8.A03.getFacebookUserID();
                    boolean z2 = r4.A02;
                    boolean z3 = r4.A07;
                    int i3 = i2;
                    String str3 = str2;
                    AnonymousClass636 r16 = new AnonymousClass636(str3, str2, i3, r4.A01, z2, r4.A08, z, z3);
                    Context context = r13.A01;
                    AnonymousClass637 r15 = new AnonymousClass637(C61120lW.A04(context));
                    AccountSession accountSession = r8.A02;
                    AnonymousClass632 r6 = r12.A00;
                    NotificationCenter notificationCenter = r12.A01;
                    AnonymousClass6AQ r2 = r12.A04;
                    AnonymousClass6AQ r20 = r2;
                    AccountSession accountSession2 = accountSession;
                    NotificationCenter notificationCenter2 = notificationCenter;
                    AnonymousClass632 r17 = r6;
                    AnonymousClass638 r132 = new AnonymousClass638(context, r15, r16, r17, accountSession2, notificationCenter2, r20, r12.A05, r12.A06);
                    HashSet hashSet = new HashSet();
                    if (r4.A03) {
                        hashSet.add(4);
                    }
                    r132.A01 = hashSet;
                    r9.A04("create_act_param_end");
                    2I1 r0 = r10.A0G;
                    if (r0 != null) {
                        r0.A02.markerPoint(r0.A01, r0.A00, "act_login_start");
                    }
                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = r10.A0H;
                    if (iGFOAMessagingReadyLogger != null) {
                        iGFOAMessagingReadyLogger.onLogActLoginStart();
                    }
                    r10.A01 = 1;
                    System.currentTimeMillis();
                    r10.A0D.accept(1);
                    C255183ti.A04(new C301065yP(r132, r11), r132.A02(), 1Lf.A01);
                    i = 1338834950;
                }
            }
            0fh.A00(i);
        } catch (Throwable th) {
            0fh.A00(-929923088);
            throw th;
        }
    }
}
