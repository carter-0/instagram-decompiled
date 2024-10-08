package X;

import java.util.HashMap;

public final class A7R {
    public final long A00;
    public final long A01;
    public final 0lg A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    public A7R(0lg r3, String str, String str2, HashMap hashMap, long j, long j2) {
        this.A02 = r3;
        this.A03 = str;
        this.A05 = hashMap;
        this.A00 = j;
        this.A01 = j2;
        if (str2 == null) {
            str2 = null;
            if (str == null || hashMap == null) {
                1Kn.A02("IgBloksActionDataEmitter", "appId and params should not be null when fetching an async action");
            } else {
                str2 = 002.A0R(C359728dO.A00(hashMap, str, (String) null), "loaded_screen_query");
            }
        }
        this.A04 = str2;
    }
}
