package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum RIk implements AnonymousClass0Ac {
    NETWORK("network"),
    CACHE("cache"),
    ERROR("error"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public final String A00;

    /* access modifiers changed from: public */
    RIk(String str) {
        this.A00 = str;
    }
}
