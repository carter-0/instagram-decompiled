package com.fasterxml.jackson.databind.ser.std;

import X.002;
import X.17Z;
import X.C10798RyK;
import X.C269504fE;
import X.Pxe;
import X.SPK;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddressSerializer extends StdScalarSerializer {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        C10798RyK A01 = SPK.A01(r2, spk, InetSocketAddress.class, inetSocketAddress);
        A03(r2, inetSocketAddress);
        spk.A04(r2, A01);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        A03(r1, (InetSocketAddress) obj);
    }

    public static final void A03(17Z r4, InetSocketAddress inetSocketAddress) {
        String trim;
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            trim = inetSocketAddress.getHostName();
        } else {
            trim = address.toString().trim();
        }
        int indexOf = trim.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf != 0) {
                trim = Pxe.A0x(trim, indexOf);
            } else if (address instanceof Inet6Address) {
                trim = 002.A0g("[", trim.substring(1), "]");
            } else {
                trim = trim.substring(1);
            }
        }
        r4.A0t(002.A0b(trim, ":", inetSocketAddress.getPort()));
    }
}
