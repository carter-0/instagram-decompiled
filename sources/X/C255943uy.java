package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.3uy  reason: invalid class name and case insensitive filesystem */
public enum C255943uy {
    LOADING("loading"),
    FAILED("failed"),
    LOADED("loaded"),
    SUCCESS(RealtimeConstants.SEND_SUCCESS);
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C255943uy(String str) {
        this.A00 = str;
    }
}
