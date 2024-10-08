package X;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7aF  reason: invalid class name and case insensitive filesystem */
public final class C333847aF extends C333827aD {
    public final C376579In A00;
    public final String A01;
    public final Set A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C333847aF) {
                C333847aF r5 = (C333847aF) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C333847aF(C376579In r2, String str, boolean z) {
        super(002.A0R("hidden_comment_head_loading_state_", str));
        this.A00 = r2;
        this.A01 = str;
        this.A03 = z;
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        0qQ.A07(newKeySet);
        this.A02 = newKeySet;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A00.hashCode() * 31;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return i + i2;
    }
}
