package X;

import android.content.Context;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.instagram.common.session.UserSession;

/* renamed from: X.Du6  reason: case insensitive filesystem */
public final class C47278Du6 extends EnvironmentVariablesProxy {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String copyValue(int r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0069
            r1 = 1
            if (r5 == r1) goto L_0x005e
            r1 = 7
            if (r5 == r1) goto L_0x0087
            switch(r5) {
                case 12: goto L_0x0074;
                case 13: goto L_0x0044;
                case 14: goto L_0x0039;
                case 15: goto L_0x002e;
                case 16: goto L_0x004f;
                case 17: goto L_0x0023;
                case 18: goto L_0x0018;
                case 19: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r0
        L_0x000d:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A2Z
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 245(0xf5, float:3.43E-43)
            goto L_0x0082
        L_0x0018:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A1H
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 243(0xf3, float:3.4E-43)
            goto L_0x0082
        L_0x0023:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A0G
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 241(0xf1, float:3.38E-43)
            goto L_0x0082
        L_0x002e:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A2a
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 246(0xf6, float:3.45E-43)
            goto L_0x0082
        L_0x0039:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A1I
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 244(0xf4, float:3.42E-43)
            goto L_0x0082
        L_0x0044:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A0H
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 242(0xf2, float:3.39E-43)
            goto L_0x0082
        L_0x004f:
            boolean r1 = X.AnonymousClass931.A01
            if (r1 == 0) goto L_0x000c
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A2W
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 248(0xf8, float:3.48E-43)
            goto L_0x0082
        L_0x005e:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A2C
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 213(0xd5, float:2.98E-43)
            goto L_0x0082
        L_0x0069:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A2B
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 214(0xd6, float:3.0E-43)
            goto L_0x0082
        L_0x0074:
            boolean r1 = X.AnonymousClass931.A01
            if (r1 == 0) goto L_0x000c
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A2V
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 247(0xf7, float:3.46E-43)
        L_0x0082:
            java.lang.String r0 = X.DbV.A13(r3, r2, r1, r0)
            return r0
        L_0x0087:
            android.content.Context r0 = r4.A00
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r2 = r0.getAbsolutePath()
            r1 = 2
            java.lang.String r0 = "RsysLogs"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "%s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47278Du6.copyValue(int):java.lang.String");
    }

    public C47278Du6(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
