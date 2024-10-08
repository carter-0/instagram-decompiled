package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.65S  reason: invalid class name */
public final class AnonymousClass65S {
    public 0sL A00 = AnonymousClass65W.A00;
    public final AnonymousClass65V A01;
    public final AnonymousClass65T A02;

    public final void A04(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, 0sP r20, 0sL r21, boolean z, boolean z2, boolean z3) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        PowerManager powerManager;
        String str11 = str3;
        0qQ.A0B(str11, 2);
        AnonymousClass65T r7 = this.A02;
        if (r7.A06) {
            r7.A00(r20);
            if (r7.A03) {
                int i = r7.A00;
                if (i > 0) {
                    str6 = 002.A0O("atid_", i);
                } else {
                    str6 = "atid";
                }
                UserFlowLogger userFlowLogger = r7.A05;
                long j = r7.A04;
                AnonymousClass9J6 r5 = AnonymousClass65T.A0L;
                String str12 = r5.A01;
                Context context = C60960kU.A00;
                0qQ.A07(context);
                Object systemService = context.getSystemService("power");
                if (!(systemService instanceof PowerManager) || (powerManager = (PowerManager) systemService) == null || !powerManager.isDeviceIdleMode()) {
                    str7 = null;
                } else {
                    str7 = "idle";
                }
                userFlowLogger.flowMarkPoint(j, str12, str7);
                userFlowLogger.flowAnnotate(j, str6, str);
                String str13 = str2;
                if (str2 != null) {
                    userFlowLogger.flowAnnotate(j, "debug_atid", str13);
                }
                userFlowLogger.flowAnnotateWithCrucialData(j, "n", String.valueOf(r7.A00 + 1));
                userFlowLogger.flowAnnotateWithCrucialData(j, "c", r5.A00);
                if (r7.A00 == 0) {
                    userFlowLogger.flowAnnotateWithCrucialData(j, "atid", str);
                    if (z3) {
                        userFlowLogger.flowAnnotateWithCrucialData(j, "ae", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    }
                    int i2 = 0;
                    String str14 = str4;
                    if (!(str4 == null || str14.length() == 0)) {
                        userFlowLogger.flowAnnotate(j, "feature_tags", str14);
                    }
                    userFlowLogger.flowAnnotate(j, AnonymousClass000.A00(3824), str11);
                    if (z) {
                        str8 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    } else {
                        str8 = "0";
                    }
                    userFlowLogger.flowAnnotate(j, "silent_push", str8);
                    if (!z2) {
                        str9 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    } else {
                        str9 = "0";
                    }
                    userFlowLogger.flowAnnotate(j, "is_bg_account", str9);
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            str10 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                        } else {
                            str10 = "0";
                        }
                        userFlowLogger.flowAnnotate(j, AnonymousClass000.A00(4909), str10);
                    }
                    if (num != null) {
                        userFlowLogger.flowAnnotate(j, "priority", num.intValue());
                    }
                    if (!(num2 == null || num == null)) {
                        i2 = num2.intValue() - num.intValue();
                    }
                    userFlowLogger.flowAnnotate(j, "priority_diff", String.valueOf(i2));
                    String str15 = str5;
                    if (str5 != null) {
                        userFlowLogger.flowAnnotate(j, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str15);
                    }
                }
            }
        }
        this.A00 = r21;
    }

    public final void A00() {
        AnonymousClass65T r1 = this.A02;
        if (r1.A06 && r1.A03) {
            UserFlowLogger userFlowLogger = r1.A05;
            long j = r1.A04;
            AnonymousClass9J6 r12 = AnonymousClass65T.A0B;
            userFlowLogger.flowMarkPoint(j, r12.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", r12.A00);
        }
    }

    public final void A01() {
        AnonymousClass65T r1 = this.A02;
        if (r1.A06 && r1.A03) {
            UserFlowLogger userFlowLogger = r1.A05;
            long j = r1.A04;
            AnonymousClass9J6 r12 = AnonymousClass65T.A0F;
            userFlowLogger.flowMarkPoint(j, r12.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", r12.A00);
        }
    }

    public final void A02(int i, 0sP r8) {
        AnonymousClass65T r1 = this.A02;
        if (r1.A06) {
            r1.A00(r8);
            if (r1.A03) {
                UserFlowLogger userFlowLogger = r1.A05;
                long j = r1.A04;
                AnonymousClass9J6 r4 = AnonymousClass65T.A0N;
                userFlowLogger.flowMarkPoint(j, r4.A01);
                userFlowLogger.flowAnnotate(j, "is_retry", true);
                userFlowLogger.flowAnnotate(j, "remaining_retries", i);
                userFlowLogger.flowAnnotateWithCrucialData(j, "c", r4.A00);
            }
        }
    }

    public final void A03(int i, boolean z) {
        AnonymousClass65T r1 = this.A02;
        if (r1.A06 && r1.A03) {
            UserFlowLogger userFlowLogger = r1.A05;
            long j = r1.A04;
            AnonymousClass9J6 r3 = AnonymousClass65T.A0I;
            userFlowLogger.flowMarkPoint(j, r3.A01);
            userFlowLogger.flowAnnotate(j, "mem_state_at_callback", i);
            userFlowLogger.flowAnnotate(j, "is_retry", z);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", r3.A00);
        }
    }

    public final void A05(String str) {
        AnonymousClass65T r1 = this.A02;
        if (r1.A06 && r1.A03) {
            UserFlowLogger userFlowLogger = r1.A05;
            long j = r1.A04;
            userFlowLogger.flowAnnotate(j, "skip_reason", str);
            AnonymousClass9J6 r12 = AnonymousClass65T.A0E;
            userFlowLogger.flowMarkPoint(j, r12.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", r12.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r0.equals(r12) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r8 = this;
            X.65T r1 = r8.A02
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0019
            if (r9 != 0) goto L_0x0016
            if (r14 == 0) goto L_0x0019
            if (r12 == 0) goto L_0x0019
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x0060
            r1.A01 = r12
        L_0x0016:
            r1.A01(r13, r11)
        L_0x0019:
            X.65V r6 = r8.A01
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x005f
            if (r10 == 0) goto L_0x005f
            X.0sL r4 = r8.A00
            java.lang.Long r0 = X.AnonymousClass65V.A00(r6, r10)
            if (r0 == 0) goto L_0x005f
            long r0 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r5 = r6.A00
            X.9J6 r7 = X.AnonymousClass65V.A06
            java.lang.String r2 = r7.A01
            r5.flowMarkPoint(r0, r2)
            if (r13 != 0) goto L_0x004a
            java.lang.String r3 = "suppress_in_app_layer"
            java.lang.String r2 = "1"
            r5.flowAnnotate(r0, r3, r2)
            if (r11 == 0) goto L_0x004a
            r2 = 171(0xab, float:2.4E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r5.flowAnnotate(r0, r2, r11)
        L_0x004a:
            java.lang.String r3 = r7.A00
            java.lang.String r2 = "c"
            r5.flowAnnotateWithCrucialData(r0, r2, r3)
            boolean r2 = r6.A02
            if (r2 != 0) goto L_0x0057
            if (r13 != 0) goto L_0x005a
        L_0x0057:
            r5.flowEndSuccess(r0, r10)
        L_0x005a:
            X.61K r0 = X.AnonymousClass61K.ARMADILLO_NOTIFICATION_E2E_LOGGING
            r4.invoke(r0, r10)
        L_0x005f:
            return
        L_0x0060:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0019
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65S.A06(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void A07(String str, String str2, String str3, boolean z) {
        AnonymousClass65V r2 = this.A01;
        if (r2.A01 && str != null) {
            0sL r5 = this.A00;
            Long A002 = AnonymousClass65V.A00(r2, str);
            if (A002 != null) {
                long longValue = A002.longValue();
                UserFlowLogger userFlowLogger = r2.A00;
                AnonymousClass9J6 r3 = AnonymousClass65V.A04;
                userFlowLogger.flowMarkPoint(longValue, r3.A01);
                userFlowLogger.flowAnnotateWithCrucialData(longValue, "c", r3.A00);
                userFlowLogger.flowAnnotate(longValue, "msg_drop_reason", str3);
                if (z) {
                    userFlowLogger.flowEndSuccess(longValue, str);
                    r5.invoke(AnonymousClass61K.ARMADILLO_NOTIFICATION_E2E_LOGGING, str);
                }
            }
        }
        AnonymousClass65T r1 = this.A02;
        if (r1.A06 && str2 != null && r1.A03) {
            String str4 = r1.A01;
            if (str4 == null) {
                r1.A01 = str2;
            } else if (!str4.equals(str2)) {
                return;
            }
            UserFlowLogger userFlowLogger2 = r1.A05;
            long j = r1.A04;
            AnonymousClass9J6 r32 = AnonymousClass65T.A09;
            userFlowLogger2.flowMarkPoint(j, r32.A01);
            userFlowLogger2.flowAnnotateWithCrucialData(j, "c", r32.A00);
            userFlowLogger2.flowAnnotate(j, "msg_drop_reason", str3);
        }
    }

    public final void A08(String str, 0sP r8, boolean z) {
        AnonymousClass65T r5 = this.A02;
        if (r5.A06) {
            r5.A00(r8);
            if (r5.A03) {
                r5.A05.flowAnnotate(r5.A04, "is_generic_after_retry", true);
                r5.A01(z, str);
            }
        }
    }

    public final void A09(boolean z) {
        AnonymousClass65T r1 = this.A02;
        if (r1.A06 && r1.A03) {
            UserFlowLogger userFlowLogger = r1.A05;
            long j = r1.A04;
            userFlowLogger.flowAnnotate(j, "is_mi_sync", z);
            AnonymousClass9J6 r12 = AnonymousClass65T.A0J;
            userFlowLogger.flowMarkPoint(j, r12.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", r12.A00);
        }
    }

    public AnonymousClass65S(UserSession userSession) {
        this.A02 = new AnonymousClass65T(userSession);
        this.A01 = new AnonymousClass65V(userSession);
    }
}
