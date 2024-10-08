package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum HN2 {
    A0B("TOP_COMMENTS", 0, 2131975491),
    A0C("TOP_REPLIES", 1, 2131975494),
    A05("FOR_YOU", 2, 2131962638),
    A08("NEWEST_FIRST", 3, 2131968317),
    A07("MOST_RECENT", 4, 2131966743),
    A06("META_VERIFIED", 5, 2131966460),
    A0A("SUBSCRIBERS_ONLY", 6, 2131974621),
    A09(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 7, -1);
    
    public final int A00;
    public final C333797aA A01;
    public final Integer A02;

    /* access modifiers changed from: public */
    static {
        HN2[] hn2Arr;
        A03 = 0oU.A00(hn2Arr);
    }

    /* access modifiers changed from: public */
    HN2(String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = r1;
        this.A02 = r2;
    }
}
