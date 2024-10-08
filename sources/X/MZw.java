package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.google.firebase.messaging.RemoteMessage;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.Map;

public final class MZw {
    public final Context A00;
    public final C58840Ae A01;
    public final 1vo A02;
    public final MZx A03;
    public final QuickPerformanceLogger A04;
    public final 1vl A05;
    public final MZv A06;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r6 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61081JwJ A02(com.facebook.pushlite.model.PushInfraMetaData r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            r5 = 2
            java.lang.String r9 = r11.A02
            java.lang.String r8 = r11.A03
            java.lang.String r6 = r11.A04
            if (r9 == 0) goto L_0x000e
            if (r8 == 0) goto L_0x000e
            r3 = 1
            if (r6 != 0) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            java.lang.String r1 = r11.A01
            java.lang.String r0 = "zstd"
            boolean r2 = X.0qQ.A0K(r1, r0)
            r4 = 0
            if (r12 == 0) goto L_0x002d
            byte[] r1 = X.C66582MXn.A1a(r12)
        L_0x001e:
            if (r13 == 0) goto L_0x002b
            byte[] r0 = X.C66582MXn.A1a(r13)
        L_0x0024:
            if (r1 == 0) goto L_0x0034
            if (r3 != 0) goto L_0x002f
            if (r2 == 0) goto L_0x0034
            goto L_0x002f
        L_0x002b:
            r0 = r4
            goto L_0x0024
        L_0x002d:
            r1 = r4
            goto L_0x001e
        L_0x002f:
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0034 }
        L_0x0034:
            if (r0 == 0) goto L_0x003b
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ IllegalArgumentException -> 0x003b }
        L_0x003b:
            if (r9 == 0) goto L_0x00aa
            if (r8 == 0) goto L_0x00aa
            if (r6 == 0) goto L_0x00aa
            com.facebook.quicklog.MarkerEditor r3 = A00(r10)     // Catch:{ Exception -> 0x007e }
            if (r3 == 0) goto L_0x004c
            java.lang.String r2 = "decryption_start"
            r3.point(r2)     // Catch:{ Exception -> 0x007e }
        L_0x004c:
            android.content.Context r2 = r10.A00     // Catch:{ Exception -> 0x007e }
            X.A7c r7 = new X.A7c     // Catch:{ Exception -> 0x007e }
            r7.<init>(r2, r6, r9)     // Catch:{ Exception -> 0x007e }
            byte[] r2 = X.C66582MXn.A1a(r8)     // Catch:{ Exception -> 0x007e }
            r6 = 0
            byte[] r3 = android.util.Base64.decode(r2, r6)     // Catch:{ Exception -> 0x007e }
            byte[] r2 = new byte[r6]     // Catch:{ Exception -> 0x007e }
            X.OGa r3 = X.OX2.A00(r7, r3, r2)     // Catch:{ Exception -> 0x007e }
            if (r1 == 0) goto L_0x006a
            byte[] r2 = new byte[r6]     // Catch:{ Exception -> 0x007e }
            byte[] r1 = X.OX2.A01(r3, r7, r2, r1)     // Catch:{ Exception -> 0x007e }
        L_0x006a:
            if (r0 == 0) goto L_0x0072
            byte[] r2 = new byte[r6]     // Catch:{ Exception -> 0x007e }
            byte[] r0 = X.OX2.A01(r3, r7, r2, r0)     // Catch:{ Exception -> 0x007e }
        L_0x0072:
            com.facebook.quicklog.MarkerEditor r3 = A00(r10)     // Catch:{ Exception -> 0x007e }
            if (r3 == 0) goto L_0x009e
            java.lang.String r2 = "decryption_end"
            r3.point(r2)     // Catch:{ Exception -> 0x007e }
            goto L_0x009e
        L_0x007e:
            r8 = move-exception
            X.0Ae r2 = r10.A01
            if (r2 == 0) goto L_0x0097
            X.MZx r7 = new X.MZx
            r7.<init>(r2)
            java.lang.String r6 = "notif_hpke_decryption_failed"
            java.lang.String r3 = "exception"
            java.lang.String r2 = r8.toString()
            java.util.LinkedHashMap r2 = X.C66582MXn.A0y(r3, r2)
            X.MZx.A00(r7, r11, r6, r14, r2)
        L_0x0097:
            X.MZv r3 = r10.A06
            java.lang.String r2 = "decryption_error"
            r3.A01(r14, r2)
        L_0x009e:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.Object r1 = r0.A00
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r0.A01
            byte[] r0 = (byte[]) r0
        L_0x00aa:
            byte[] r2 = r10.A06(r11, r14, r1)
            byte[] r1 = r10.A06(r11, r14, r0)
            if (r2 == 0) goto L_0x00bb
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r0)
        L_0x00bb:
            X.JwJ r0 = new X.JwJ
            r0.<init>((java.lang.String) r4, (java.lang.Object) r1, (int) r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZw.A02(com.facebook.pushlite.model.PushInfraMetaData, java.lang.String, java.lang.String, java.lang.String):X.JwJ");
    }

    public static final MarkerEditor A00(MZw mZw) {
        QuickPerformanceLogger quickPerformanceLogger = mZw.A04;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger.withMarker(875309620);
        }
        return null;
    }

    public static final void A01(MZw mZw, PushInfraMetaData pushInfraMetaData) {
        String str = pushInfraMetaData.A07;
        QuickPerformanceLogger quickPerformanceLogger = mZw.A04;
        if (str != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "push_infra_notif_id", str);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "push_infra_notif_id_missing");
        }
        Long l = pushInfraMetaData.A00;
        if (l != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "push_infra_use_case_id", l.longValue());
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "push_infra_use_case_id_missing");
        }
        String str2 = pushInfraMetaData.A08;
        if (str2 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "token_fbid", str2);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "token_fbid_missing");
        }
        String str3 = pushInfraMetaData.A05;
        if (str3 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "log_notification_request_on_client", str3);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "log_notification_request_on_client_missing");
        }
        String str4 = pushInfraMetaData.A01;
        if (str4 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "compression_algorithm", str4);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "compressoin_algorithm_missing");
        }
        String str5 = pushInfraMetaData.A02;
        if (str5 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "hpke_ciphersuite", str5);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "hpke_ciphersuite_missing");
        }
        String str6 = pushInfraMetaData.A06;
        if (str6 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "pre_fan_out_notification_request_identifier", str6);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "pre_fan_out_notification_request_identifier_missing");
        }
        String str7 = pushInfraMetaData.A04;
        if (str7 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "keystore_id", str7);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "keystore_id_missing");
        }
    }

    public final PushInfraMetaData A03(RemoteMessage remoteMessage) {
        String str;
        N4x n4x;
        PushInfraMetaData A022 = PushInfraMetaData.Companion.A02(remoteMessage);
        A01(this, A022);
        QuickPerformanceLogger quickPerformanceLogger = this.A04;
        if (quickPerformanceLogger != null) {
            Boolean bool = true;
            quickPerformanceLogger.markerAnnotate(875309620, "is_background", bool.equals(BackgroundStartupDetector.A0G));
            quickPerformanceLogger.markerStart(875309620);
        }
        MarkerEditor A002 = A00(this);
        if (A002 != null) {
            A002.annotate("push_channel", "FCM");
            A002.point("received_start");
        }
        try {
            Bundle A0a = AnonymousClass7TE.A0a();
            Iterator A0u = AnonymousClass7TF.A0u(remoteMessage.A02());
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                A0a.putString((String) entry.getKey(), (String) entry.getValue());
            }
            String A11 = DbT.A11("data", remoteMessage.A02());
            if (A11 == null) {
                A11 = DbT.A11("notification", remoteMessage.A02());
            }
            String A112 = DbT.A11("bin", remoteMessage.A02());
            1vl r0 = this.A05;
            if (r0 != null) {
                if (182.A06(0Tu.A05, r0.A00, 36321335832487202L)) {
                    Context context = this.A00;
                    N4x n4x2 = null;
                    if (A11 != null) {
                        n4x = new N4x(A11);
                    } else {
                        n4x = null;
                    }
                    if (A112 != null) {
                        n4x2 = new N4x(A112);
                    }
                    A05(new N31(context, A022, n4x, n4x2, (Integer) null, "FCM", false, false));
                    return A022;
                }
            }
            MarkerEditor A003 = A00(this);
            if (A003 != null) {
                A003.point("received_logging_start");
            }
            int A004 = remoteMessage.A00() - remoteMessage.A01();
            MZx mZx = this.A03;
            if (mZx != null) {
                0qQ.A0B(A022, 0);
                if (A004 < 0) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                MZx.A00(mZx, A022, "notif_received_push", "FCM", 0Yt.A07(DbW.A1b("priority_lowered", str)));
            }
            MarkerEditor A005 = A00(this);
            if (A005 != null) {
                A005.point("received_logging_end");
            }
            A04(A022, A022.A08);
            this.A06.A00(new BBV("FCM", 3), A02(A022, A11, A112, "FCM"));
            MarkerEditor A006 = A00(this);
            if (A006 != null) {
                A006.point("received_end");
            }
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(875309620, 2);
                return A022;
            }
        } catch (C69523Nn5 e) {
            0KC.A0L("PushProcessor", "Error processing payload: source=%s", e, new Object[]{"FCM"});
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(875309620, 3);
            }
        }
        return A022;
    }

    public final void A04(PushInfraMetaData pushInfraMetaData, String str) {
        boolean z;
        1vl r2;
        Long l = pushInfraMetaData.A00;
        if (l == null || l.longValue() != 52) {
            z = false;
        } else {
            z = true;
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.markerEnd(875301323, 2);
            }
        }
        1vo r3 = this.A02;
        if (r3 != null && (r2 = this.A05) != null && str != null) {
            new MZy(this.A00, r3, r2).A00(str, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.N31} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.N31 r14) {
        /*
            r13 = this;
            java.lang.String r4 = "error_from_plugin"
            java.lang.String r3 = "received_end_via_plugins"
            X.0Ae r0 = r13.A01     // Catch:{ all -> 0x013e }
            r1 = 3
            r2 = 2
            if (r0 == 0) goto L_0x00eb
            X.Oq8 r7 = new X.Oq8     // Catch:{ all -> 0x013e }
            r7.<init>(r0)     // Catch:{ all -> 0x013e }
            android.content.Context r6 = r13.A00     // Catch:{ all -> 0x013e }
            X.1vo r5 = r13.A02     // Catch:{ all -> 0x013e }
            X.1vl r0 = r13.A05     // Catch:{ all -> 0x013e }
            X.Oq9 r8 = new X.Oq9     // Catch:{ all -> 0x013e }
            r8.<init>(r6, r5, r0)     // Catch:{ all -> 0x013e }
            X.OqC r9 = X.C71750OqC.A00     // Catch:{ all -> 0x013e }
            X.OqD r10 = X.C71751OqD.A00     // Catch:{ all -> 0x013e }
            X.OqB r11 = X.C71749OqB.A00     // Catch:{ all -> 0x013e }
            X.OqA r12 = X.C71748OqA.A00     // Catch:{ all -> 0x013e }
            X.Pur[] r0 = new X.C74436Pur[]{r7, r8, r9, r10, r11, r12}     // Catch:{ all -> 0x013e }
        L_0x0026:
            java.util.List r0 = X.0sr.A1P(r0)     // Catch:{ all -> 0x013e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x013e }
            r8 = r14
        L_0x002f:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0105
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x013e }
            X.Pur r7 = (X.C74436Pur) r7     // Catch:{ all -> 0x013e }
            boolean r0 = r7.Esm(r8)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00d6
            com.facebook.quicklog.MarkerEditor r6 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x0054
            java.lang.String r5 = r7.BdN()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r5, r0)     // Catch:{ all -> 0x013e }
            r6.point(r0)     // Catch:{ all -> 0x013e }
        L_0x0054:
            java.lang.Object r10 = r7.E4V(r8)     // Catch:{ all -> 0x013e }
            boolean r0 = r10 instanceof X.0eQ     // Catch:{ all -> 0x013e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0071
            com.facebook.quicklog.MarkerEditor r6 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x0071
            java.lang.String r5 = r7.BdN()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "_end"
            java.lang.String r0 = X.002.A0R(r5, r0)     // Catch:{ all -> 0x013e }
            r6.point(r0)     // Catch:{ all -> 0x013e }
        L_0x0071:
            java.lang.Throwable r0 = X.0eR.A00(r10)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x008e
            com.facebook.quicklog.MarkerEditor r9 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r9 == 0) goto L_0x008e
            java.lang.String r6 = r7.BdN()     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "_failure_"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = X.002.A0g(r6, r5, r0)     // Catch:{ all -> 0x013e }
            r9.point(r0)     // Catch:{ all -> 0x013e }
        L_0x008e:
            boolean r0 = r10 instanceof X.0eQ     // Catch:{ all -> 0x013e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0097
            r8 = r10
            X.N31 r8 = (X.N31) r8     // Catch:{ all -> 0x013e }
        L_0x0097:
            java.lang.Throwable r6 = X.0eR.A00(r10)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x002f
            java.lang.String r5 = "PushProcessor"
            java.lang.String r2 = "The plugin returned an error: %s"
            java.lang.String r0 = r7.BdN()     // Catch:{ all -> 0x013e }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x013e }
            X.0KC.A0L(r5, r2, r6, r0)     // Catch:{ all -> 0x013e }
            X.MZv r5 = r13.A06     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r8.A07     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "plugin_error"
            r5.A01(r2, r0)     // Catch:{ all -> 0x013e }
            com.facebook.quicklog.MarkerEditor r2 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r2 == 0) goto L_0x00c2
            java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x013e }
            r2.annotate(r4, r0)     // Catch:{ all -> 0x013e }
        L_0x00c2:
            com.facebook.quicklog.MarkerEditor r0 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00cb
            r0.point(r3)     // Catch:{ all -> 0x013e }
        L_0x00cb:
            com.facebook.quicklog.QuickPerformanceLogger r2 = r13.A04     // Catch:{ all -> 0x013e }
            if (r2 == 0) goto L_0x0170
            r0 = 875309620(0x342c2a34, float:1.6034102E-7)
            r2.markerEnd(r0, r1)     // Catch:{ all -> 0x013e }
            goto L_0x0104
        L_0x00d6:
            com.facebook.quicklog.MarkerEditor r6 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x002f
            java.lang.String r5 = r7.BdN()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "_skipped"
            java.lang.String r0 = X.002.A0R(r5, r0)     // Catch:{ all -> 0x013e }
            r6.point(r0)     // Catch:{ all -> 0x013e }
            goto L_0x002f
        L_0x00eb:
            X.OqC r8 = X.C71750OqC.A00     // Catch:{ all -> 0x013e }
            android.content.Context r6 = r13.A00     // Catch:{ all -> 0x013e }
            X.1vo r5 = r13.A02     // Catch:{ all -> 0x013e }
            X.1vl r0 = r13.A05     // Catch:{ all -> 0x013e }
            X.Oq9 r7 = new X.Oq9     // Catch:{ all -> 0x013e }
            r7.<init>(r6, r5, r0)     // Catch:{ all -> 0x013e }
            X.OqD r6 = X.C71751OqD.A00     // Catch:{ all -> 0x013e }
            X.OqB r5 = X.C71749OqB.A00     // Catch:{ all -> 0x013e }
            X.OqA r0 = X.C71748OqA.A00     // Catch:{ all -> 0x013e }
            X.Pur[] r0 = new X.C74436Pur[]{r8, r7, r6, r5, r0}     // Catch:{ all -> 0x013e }
            goto L_0x0026
        L_0x0104:
            return
        L_0x0105:
            java.lang.String r0 = r8.A07     // Catch:{ all -> 0x013e }
            X.BBV r7 = new X.BBV     // Catch:{ all -> 0x013e }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x013e }
            X.Ptr r0 = r8.A06     // Catch:{ all -> 0x013e }
            r6 = 0
            if (r0 == 0) goto L_0x013b
            java.lang.String r5 = r0.CDP()     // Catch:{ all -> 0x013e }
        L_0x0115:
            X.Ptr r0 = r8.A05     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x011d
            byte[] r6 = r0.CDO()     // Catch:{ all -> 0x013e }
        L_0x011d:
            X.JwJ r1 = new X.JwJ     // Catch:{ all -> 0x013e }
            r1.<init>((java.lang.String) r5, (java.lang.Object) r6, (int) r2)     // Catch:{ all -> 0x013e }
            X.MZv r0 = r13.A06     // Catch:{ all -> 0x013e }
            r0.A00(r7, r1)     // Catch:{ all -> 0x013e }
            com.facebook.quicklog.MarkerEditor r0 = A00(r13)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0130
            r0.point(r3)     // Catch:{ all -> 0x013e }
        L_0x0130:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r13.A04     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x0170
            r0 = 875309620(0x342c2a34, float:1.6034102E-7)
            r1.markerEnd(r0, r2)     // Catch:{ all -> 0x013e }
            goto L_0x013d
        L_0x013b:
            r5 = r6
            goto L_0x0115
        L_0x013d:
            return
        L_0x013e:
            r5 = move-exception
            java.lang.String r1 = "PushProcessor"
            java.lang.String r0 = "Unexpected error when processing plugin pipeline: %s"
            X.0KC.A0G(r1, r0, r5)
            X.MZv r2 = r13.A06
            java.lang.String r1 = r14.A07
            java.lang.String r0 = "plugin_pipeline_crash"
            r2.A01(r1, r0)
            com.facebook.quicklog.MarkerEditor r1 = A00(r13)
            if (r1 == 0) goto L_0x015c
            java.lang.String r0 = r5.getMessage()
            r1.annotate(r4, r0)
        L_0x015c:
            com.facebook.quicklog.MarkerEditor r0 = A00(r13)
            if (r0 == 0) goto L_0x0165
            r0.point(r3)
        L_0x0165:
            com.facebook.quicklog.QuickPerformanceLogger r2 = r13.A04
            if (r2 == 0) goto L_0x0170
            r1 = 875309620(0x342c2a34, float:1.6034102E-7)
            r0 = 3
            r2.markerEnd(r1, r0)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZw.A05(X.N31):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A06(com.facebook.pushlite.model.PushInfraMetaData r6, java.lang.String r7, byte[] r8) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x005e
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "zstd"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005e
            com.facebook.quicklog.MarkerEditor r1 = A00(r5)     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "decompression_start"
            r1.point(r0)     // Catch:{ Exception -> 0x003d }
        L_0x0017:
            com.facebook.zstd.ZstdInputStream r0 = com.facebook.zstd.ZstdInputStream.$redex_init_class     // Catch:{ Exception -> 0x003d }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x003d }
            r0.<init>(r8)     // Catch:{ Exception -> 0x003d }
            com.facebook.zstd.ZstdInputStream r2 = new com.facebook.zstd.ZstdInputStream     // Catch:{ Exception -> 0x003d }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003d }
            byte[] r8 = X.C11108SAj.A01(r2)     // Catch:{ all -> 0x0036 }
            r2.close()     // Catch:{ Exception -> 0x003d }
            com.facebook.quicklog.MarkerEditor r1 = A00(r5)     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "decompression_end"
            r1.point(r0)     // Catch:{ Exception -> 0x003d }
            return r8
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x003d }
            throw r0     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r4 = move-exception
            X.0Ae r0 = r5.A01
            if (r0 == 0) goto L_0x0056
            X.MZx r3 = new X.MZx
            r3.<init>(r0)
            java.lang.String r2 = "notif_decompression_failed"
            java.lang.String r1 = "exception"
            java.lang.String r0 = r4.toString()
            java.util.LinkedHashMap r0 = X.C66582MXn.A0y(r1, r0)
            X.MZx.A00(r3, r6, r2, r7, r0)
        L_0x0056:
            X.MZv r1 = r5.A06
            java.lang.String r0 = "decompression_error"
            r1.A01(r7, r0)
            r8 = 0
        L_0x005e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZw.A06(com.facebook.pushlite.model.PushInfraMetaData, java.lang.String, byte[]):byte[]");
    }

    public MZw(Context context, C58840Ae r3, 1vo r4, 1vl r5, MZv mZv) {
        MZx mZx;
        C51972G9s.A1B(mZv, context);
        this.A06 = mZv;
        this.A05 = r5;
        this.A01 = r3;
        this.A00 = context;
        this.A02 = r4;
        if (r3 != null) {
            mZx = new MZx(r3);
        } else {
            mZx = null;
        }
        this.A03 = mZx;
        this.A04 = QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
