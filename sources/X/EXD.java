package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum EXD {
    PHONE("phone"),
    A03("email"),
    SAC("account_linking"),
    A05(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EXD[] exdArr;
        A01 = 0oU.A00(exdArr);
    }

    /* access modifiers changed from: public */
    EXD(String str) {
        this.A00 = str;
    }

    /* access modifiers changed from: public */
    EXD() {
        this.A00 = "facebook";
    }
}
