package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Ux8  reason: case insensitive filesystem */
public enum C16556Ux8 {
    WIFI(NetInfoModule.CONNECTION_TYPE_WIFI),
    NETWORK_5G("5g"),
    NETWORK_4G(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_4G),
    OTHERS("others"),
    A05(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C16556Ux8[] ux8Arr;
        A01 = 0oU.A00(ux8Arr);
    }

    /* access modifiers changed from: public */
    C16556Ux8(String str) {
        this.A00 = str;
    }
}
