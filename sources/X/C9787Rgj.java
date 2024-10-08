package X;

/* renamed from: X.Rgj  reason: case insensitive filesystem */
public abstract class C9787Rgj {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C307896Rx r10, X.AnonymousClass6Tm r11) {
        /*
            r3 = 0
            java.lang.Object r9 = r11.A03(r3)
            X.6Rm r9 = (X.C307786Rm) r9
            r6 = 1
            java.lang.Object r4 = r11.A03(r6)
            r0 = 2
            java.util.List r1 = r11.A00
            X.4uI r2 = X.DbV.A0R(r1, r0)
            r0 = 3
            X.4uI r1 = X.DbV.A0R(r1, r0)
            androidx.fragment.app.Fragment r7 = X.DbU.A0H(r10)
            java.lang.String r0 = "front"
            boolean r8 = r0.equals(r4)
            X.S2W r5 = new X.S2W
            r5.<init>(r9, r10, r2, r1)
            android.content.Context r2 = r7.requireContext()
            android.content.pm.PackageManager r4 = r2.getPackageManager()
            if (r4 != 0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0033:
            r5.A00(r0)
        L_0x0036:
            r0 = 0
            return r0
        L_0x0038:
            java.lang.String r0 = "android.hardware.camera.front"
            boolean r1 = r4.hasSystemFeature(r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r4.hasSystemFeature(r0)
            if (r8 == 0) goto L_0x004b
            if (r1 != 0) goto L_0x0052
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0033
        L_0x004b:
            if (r0 != 0) goto L_0x0052
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A00(r0)
        L_0x0052:
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.1DL.A07(r2, r0)
            if (r0 != 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0033
        L_0x005d:
            java.io.File r4 = X.0mb.A04(r2)
            X.OOC r0 = new X.OOC     // Catch:{ IOException -> 0x0093 }
            r0.<init>()     // Catch:{ IOException -> 0x0093 }
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0093 }
            r0.A03 = r4     // Catch:{ IOException -> 0x0093 }
            X.Ni4 r1 = r0.A00()     // Catch:{ IOException -> 0x0093 }
            X.NEK r0 = new X.NEK     // Catch:{ IOException -> 0x0093 }
            r0.<init>()     // Catch:{ IOException -> 0x0093 }
            android.net.Uri r3 = r0.A01(r2, r1)     // Catch:{ IOException -> 0x0093 }
            X.0qQ.A07(r3)     // Catch:{ IOException -> 0x0093 }
            X.R9e r2 = new X.R9e
            r2.<init>(r6, r5, r4, r10)
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            android.content.Intent r1 = X.Pxe.A0G(r0)
            java.lang.String r0 = "output"
            r1.putExtra(r0, r3)
            X.C308206Td.A0K(r10, r2)
            X.0kR.A06(r7, r1, r6)     // Catch:{  }
            goto L_0x0036
        L_0x0093:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5.A00(r0)
            r4.delete()
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9787Rgj.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
