package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum XQa {
    FLEX(0),
    A02(1);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        FLEX = new XQa("FLEX", 0, 0);
        A02 = new XQa(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, 1);
    }

    /* access modifiers changed from: public */
    XQa(int i) {
        this.A00 = i;
    }
}
