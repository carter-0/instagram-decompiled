package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C10798RyK;
import X.C269504fE;
import X.C269714fZ;
import X.Pxe;
import X.SPK;
import java.net.InetAddress;

public class InetAddressSerializer extends StdScalarSerializer implements C269714fZ {
    public final boolean A00;

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this.A00 = z;
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        C10798RyK A01 = SPK.A01(r2, spk, InetAddress.class, inetAddress);
        A0E(r2, inetAddress);
        spk.A04(r2, A01);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        A0E(r1, (InetAddress) obj);
    }

    public final void A0E(17Z r3, InetAddress inetAddress) {
        String trim;
        if (this.A00) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    trim = trim.substring(1);
                } else {
                    trim = Pxe.A0x(trim, indexOf);
                }
            }
        }
        r3.A0t(trim);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r3, X.C269504fE r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.A00
            X.4ev r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r3, r4, r0)
            if (r0 == 0) goto L_0x001f
            X.4ew r1 = r0.A00
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0014
            X.4ew r0 = X.C269324ew.ARRAY
            if (r1 != r0) goto L_0x001f
        L_0x0014:
            r1 = 1
        L_0x0015:
            boolean r0 = r2.A00
            if (r1 == r0) goto L_0x0021
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r0 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r0.<init>(r1)
            return r0
        L_0x001f:
            r1 = 0
            goto L_0x0015
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public InetAddressSerializer() {
        this(false);
    }
}
