package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

/* renamed from: X.SIe  reason: case insensitive filesystem */
public final class C11267SIe {
    public boolean A00;
    public int A01 = 0;
    public Notification.Builder A02;
    public String A03 = "";
    public Queue A04;
    public final Context A05;
    public final int A06;
    public final NotificationManager A07;
    public final String A08;
    public final String A09;

    private Notification.InboxStyle A00() {
        Notification.InboxStyle summaryText = new Notification.InboxStyle().setBigContentTitle(002.A0g("[", this.A08, "]")).setSummaryText(this.A09);
        for (CharSequence addLine : this.A04) {
            summaryText.addLine(addLine);
        }
        return summaryText;
    }

    public final void A01(String str) {
        int i;
        int i2;
        if (!this.A00) {
            try {
                this.A07.cancel("MqttDiagnosticNotification", this.A06);
            } catch (RuntimeException unused) {
            }
        } else {
            synchronized (this) {
                this.A01 = 0;
                this.A03 = str;
                if ("CONNECTED".equals(str)) {
                    i2 = 17301611;
                    i = -16711936;
                } else {
                    i2 = 17301608;
                    i = -65536;
                    if ("CONNECTING".equals(str)) {
                        i2 = 17301607;
                        i = -256;
                    }
                }
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean("vrshell_aui_persist", false);
                Context context = this.A05;
                Notification.Builder smallIcon = new Notification.Builder(context).setChannelId("debug_channel").setSmallIcon(i2);
                0Sy r1 = new 0Sy();
                r1.A0D = true;
                Notification.Builder extras = smallIcon.setContentIntent(r1.A01(context, 0, 0)).setContentTitle(002.A0g("[", this.A08, "]")).setContentText(str).setExtras(A0a);
                this.A02 = extras;
                extras.setColor(i);
                this.A02.setStyle(A00());
                this.A07.notify("MqttDiagnosticNotification", this.A06, this.A02.getNotification());
            }
        }
    }

    public final void A02(String str) {
        if (!this.A00) {
            try {
                this.A07.cancel("MqttDiagnosticNotification", this.A06);
            } catch (RuntimeException unused) {
            }
        } else if (this.A02 != null) {
            synchronized (this) {
                Notification.Builder builder = this.A02;
                int i = this.A01 + 1;
                this.A01 = i;
                builder.setSubText(String.valueOf(i));
                String A0g = 002.A0g(new SimpleDateFormat("h:mm:ss a").format(new Date()), " ", str);
                Queue queue = this.A04;
                queue.add(A0g);
                if (queue.size() > 8) {
                    queue.poll();
                }
                this.A02.setContentText(this.A03);
                this.A02.setStyle(A00());
                this.A07.notify("MqttDiagnosticNotification", this.A06, this.A02.getNotification());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r1 != false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A[EDGE_INSN: B:30:0x0052->B:17:0x0052 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11267SIe(android.content.Context r7, X.AnonymousClass3RV r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = ""
            r6.A03 = r0
            r2 = 0
            r6.A01 = r2
            r6.A08 = r9
            r6.A05 = r7
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.String r5 = "notification"
            java.lang.Object r1 = r7.getSystemService(r5)     // Catch:{ Exception -> 0x0020 }
            if (r1 == 0) goto L_0x0020
            boolean r0 = r0.isInstance(r1)     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            r6.A07 = r1
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x0052 }
            android.content.Context r1 = r6.A05     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x0052 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x0052 }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x0052 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0052 }
        L_0x003b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0052 }
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ all -> 0x0052 }
            int r0 = r1.pid     // Catch:{ all -> 0x0052 }
            if (r0 != r4) goto L_0x003b
            java.lang.String r0 = r1.processName     // Catch:{ all -> 0x0052 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r0 = 42
        L_0x0054:
            r6.A06 = r0
            java.lang.String r3 = "Started on "
            java.lang.String r0 = "M/d h:mm:ss a"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.lang.String r0 = X.002.A0R(r3, r0)
            r6.A09 = r0
            java.util.LinkedList r0 = X.Pxe.A1A()
            r6.A04 = r0
            java.lang.String r0 = "mqtt_debug"
            X.45J r1 = X.Pxf.A0N(r7, r8, r0)
            java.lang.String r0 = "is_on"
            X.45I r1 = (X.AnonymousClass45I) r1
            boolean r1 = r1.getBoolean(r0, r2)
            if (r10 != 0) goto L_0x0088
            r0 = 0
            if (r1 == 0) goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            r6.A00 = r0
            if (r0 == 0) goto L_0x00a4
            android.content.Context r4 = r6.A05
            r3 = 2
            java.lang.String r2 = "debug_channel"
            java.lang.String r0 = "Debugging Information"
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            r1.<init>(r2, r0, r3)
            java.lang.Object r0 = r4.getSystemService(r5)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            if (r0 == 0) goto L_0x00a4
            r0.createNotificationChannel(r1)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11267SIe.<init>(android.content.Context, X.3RV, java.lang.String, boolean):void");
    }
}
