package X;

import java.util.Iterator;

public abstract class VG9 {
    public static void A00(17Z r5, C17261VOo vOo) {
        r5.A0c();
        VTL vtl = vOo.A00;
        r5.A0q("multi_relay_discovery");
        r5.A0c();
        Iterator A0s = C41845B3m.A0s(r5, "turns", vtl.A01);
        while (A0s.hasNext()) {
            C17531VZk vZk = (C17531VZk) A0s.next();
            if (vZk != null) {
                r5.A0c();
                String str = vZk.A00;
                if (str != null) {
                    r5.A0R("ip", str);
                }
                String str2 = vZk.A01;
                if (str2 != null) {
                    r5.A0R("ip_6", str2);
                }
                String str3 = vZk.A02;
                if (str3 != null) {
                    r5.A0R("ssl_tcp_port", str3);
                }
                String str4 = vZk.A03;
                if (str4 != null) {
                    r5.A0R("tcp_port", str4);
                }
                String str5 = vZk.A04;
                if (str5 != null) {
                    r5.A0R("udp_port", str5);
                }
                r5.A0Z();
            }
        }
        r5.A0Y();
        Iterator A0s2 = C41845B3m.A0s(r5, "edgerays", vtl.A00);
        while (A0s2.hasNext()) {
            VYL vyl = (VYL) A0s2.next();
            if (vyl != null) {
                r5.A0c();
                String str6 = vyl.A00;
                if (str6 != null) {
                    r5.A0R("ip", str6);
                }
                String str7 = vyl.A01;
                if (str7 != null) {
                    r5.A0R("ip_6", str7);
                }
                String str8 = vyl.A02;
                if (str8 != null) {
                    r5.A0R("secret", str8);
                }
                String str9 = vyl.A03;
                if (str9 != null) {
                    r5.A0R("token", str9);
                }
                r5.A0Z();
            }
        }
        r5.A0Y();
        r5.A0Z();
        r5.A0Z();
    }
}
