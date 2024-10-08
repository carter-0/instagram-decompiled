package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.ar.core.dependencies.f;
import java.util.ArrayDeque;
import java.util.Queue;

public final class SFR {
    public Context A00;
    public f A01;
    public final ServiceConnection A02;
    public final Queue A03;
    public volatile int A04;

    public SFR() {
    }

    public SFR(byte[] bArr) {
        this.A03 = new ArrayDeque();
        this.A04 = 1;
        this.A02 = new SVP(this);
    }
}
