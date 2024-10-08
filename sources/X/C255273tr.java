package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.3tr  reason: invalid class name and case insensitive filesystem */
public enum C255273tr implements C255283ts {
    A09("UNKNOWN", "unknown"),
    A06(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE),
    A08("SAVED_REPLY", "saved_reply"),
    A04("CATALOG", "catalog"),
    A07("PREVIOUS_REPLIES", "previous_messages"),
    A05("GENERAL", "general");
    
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        C255273tr[] r0;
        A02 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    C255273tr(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
