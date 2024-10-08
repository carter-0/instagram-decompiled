package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;

public final class OH2 {
    public final long A00;
    public final TransportPayload A01;
    public final C74551Pwk A02;
    public final 1OS A03;
    public final DirectThreadKey A04;
    public final String A05;

    public OH2(TransportPayload transportPayload, C74551Pwk pwk, 1OS r3, DirectThreadKey directThreadKey, String str, long j) {
        this.A02 = pwk;
        this.A04 = directThreadKey;
        this.A01 = transportPayload;
        this.A00 = j;
        this.A05 = str;
        this.A03 = r3;
    }
}
