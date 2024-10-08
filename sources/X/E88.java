package X;

import com.instagram.android.R;
import java.util.Set;

public final class E88 extends C360678ey {
    public int A00;
    public AnonymousClass1EO A01;
    public C307896Rx A02;
    public final C360658ew A03;
    public final 1Ef A04;
    public final 1vn A05;

    public E88(1Ef r2, C360658ew r3, C307896Rx r4, 1vn r5) {
        0qQ.A0B(r5, 2);
        this.A04 = r2;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r4;
    }

    public final int getRunnableId() {
        return -6;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public final String getName() {
        String callName = this.A04.getCallName();
        0qQ.A07(callName);
        return callName;
    }

    public final void run() {
        C307786Rm r5;
        C307896Rx r0 = this.A02;
        if (r0 != null && (r5 = r0.A03) != null) {
            1vn r4 = this.A05;
            1Ef r3 = this.A04;
            this.A01 = r4.ATL(new C40115ASf(this, 1), new FSC(this, 0), r3);
            FVJ fvj = new FVJ(this);
            Set set = (Set) r5.A00(R.id.bk_context_key_cleanup_callbacks);
            if (set.contains(fvj)) {
                1Kn.A02("IBloksContextCleanupCallback", "Attempting to add a cleanup callback that already exists.");
            } else {
                set.add(fvj);
            }
        }
    }
}
