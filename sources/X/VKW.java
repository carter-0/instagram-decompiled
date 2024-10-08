package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;

public abstract class VKW {
    public static final Map A00;
    public static final Map A01 = 0Yt.A06(new 0eP[]{AnonymousClass7TF.A0x(NetInfoModule.CONNECTION_TYPE_NONE, 0), AnonymousClass7TF.A0x("others", 1), AnonymousClass7TF.A0x(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_4G, 2), AnonymousClass7TF.A0x("5g", 3), AnonymousClass7TF.A0x(NetInfoModule.CONNECTION_TYPE_WIFI, 4)});

    static {
        0eP r7 = new 0eP("WIFI", C16556Ux8.WIFI);
        0eP r8 = new 0eP("MOBILE.NRNSA", C16556Ux8.NETWORK_5G);
        C16556Ux8 ux8 = C16556Ux8.NETWORK_4G;
        0eP r9 = new 0eP("MOBILE.LTE", ux8);
        0eP r10 = new 0eP("MOBILE.HSPA", ux8);
        C16556Ux8 ux82 = C16556Ux8.OTHERS;
        A00 = 0Yt.A06(new 0eP[]{r7, r8, r9, r10, new 0eP(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_3G, ux82), new 0eP(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_2G, ux82), new 0eP("None", C16556Ux8.A05)});
    }
}
