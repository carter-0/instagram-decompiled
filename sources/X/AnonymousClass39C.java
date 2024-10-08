package X;

import android.content.BroadcastReceiver;

/* renamed from: X.39C  reason: invalid class name */
public final class AnonymousClass39C extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass399 A00;

    public AnonymousClass39C(AnonymousClass399 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r4.equals(r0) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r4.equals(r0) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            r0 = -1028952253(0xffffffffc2ab6f43, float:-85.71731)
            int r2 = X.AnonymousClass0fD.A01(r0)
            X.AnonymousClass0fQ.A01(r6, r7, r8)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            X.399 r3 = r6.A00
            boolean r0 = r3 instanceof X.AnonymousClass39J
            if (r0 == 0) goto L_0x0053
            r5 = 0
            java.lang.String r0 = r8.getAction()
            if (r0 == 0) goto L_0x0049
            X.AnonymousClass389.A00()
            r8.getAction()
            java.lang.String r4 = r8.getAction()
            if (r4 == 0) goto L_0x0049
            int r1 = r4.hashCode()
            r0 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r1 == r0) goto L_0x0050
            r0 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r1 != r0) goto L_0x0049
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
        L_0x003b:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            r5 = 1
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L_0x0046:
            r3.A03(r0)
        L_0x0049:
            r0 = -670843309(0xffffffffd803be53, float:-5.7941384E14)
            X.AnonymousClass0fD.A0E(r0, r2, r8)
            return
        L_0x0050:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            goto L_0x007a
        L_0x0053:
            boolean r0 = r3 instanceof X.AnonymousClass39F
            if (r0 == 0) goto L_0x0081
            r5 = 0
            java.lang.String r0 = r8.getAction()
            if (r0 == 0) goto L_0x0049
            X.AnonymousClass389.A00()
            r8.getAction()
            java.lang.String r4 = r8.getAction()
            if (r4 == 0) goto L_0x0049
            int r1 = r4.hashCode()
            r0 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
            if (r1 == r0) goto L_0x009a
            r0 = 490310653(0x1d398bfd, float:2.4556918E-21)
            if (r1 != r0) goto L_0x0049
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
        L_0x007a:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0049
        L_0x0081:
            r1 = 0
            java.lang.String r4 = r8.getAction()
            if (r4 == 0) goto L_0x0049
            X.AnonymousClass389.A00()
            int r0 = r4.hashCode()
            r5 = 1
            switch(r0) {
                case -1886648615: goto L_0x009d;
                case -54942926: goto L_0x00a0;
                case 948344062: goto L_0x0094;
                case 1019184907: goto L_0x0097;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x0049
        L_0x0094:
            java.lang.String r0 = "android.os.action.CHARGING"
            goto L_0x007a
        L_0x0097:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            goto L_0x007a
        L_0x009a:
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            goto L_0x003b
        L_0x009d:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r0 = "android.os.action.DISCHARGING"
        L_0x00a2:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39C.onReceive(android.content.Context, android.content.Intent):void");
    }
}
