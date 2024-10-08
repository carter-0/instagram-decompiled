package X;

import android.content.Context;
import android.telephony.cdma.CdmaCellLocation;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

public abstract class S8Q {
    public static CdmaCellLocation A00(Context context, C10198RoE roE) {
        1DF A00 = AnonymousClass1DA.A00(context, (AnonymousClass0eK) null);
        String A002 = AnonymousClass000.A00(21);
        Context context2 = roE.A00.A00;
        if ((!1DL.A07(context2, A002) && !1DL.A07(context2, AnonymousClass000.A00(27))) || A00 == null || A00.A00.getPhoneType() != 2 || A00.A04("DeviceFeatureHelper") == null) {
            return null;
        }
        Class<CdmaCellLocation> cls = CdmaCellLocation.class;
        if (Pxh.A1W(cls, A00.A04("DeviceFeatureHelper"))) {
            return cls.cast(A00.A04("DeviceFeatureHelper"));
        }
        return null;
    }

    public static ArrayList A01(boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!(nextElement instanceof Inet6Address) || z) {
                            A1C.add(hostAddress);
                        }
                    }
                }
            }
            return A1C;
        } catch (SocketException unused) {
            return null;
        }
    }
}
