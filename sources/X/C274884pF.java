package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4pF  reason: invalid class name and case insensitive filesystem */
public abstract class C274884pF {
    public final List A00 = new ArrayList();

    public long A03() {
        return 0;
    }

    public boolean A05() {
        return false;
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        throw AnonymousClass00P.createAndThrow();
    }

    public boolean A0C() {
        return false;
    }

    public long A00() {
        if (!(this instanceof C274874pE)) {
            return LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        }
        return 182.A01(0Tu.A05, ((C274874pE) this).A00, 36594585946425104L);
    }

    public long A01() {
        if (!(this instanceof C274874pE)) {
            return StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        return 182.A01(0Tu.A05, ((C274874pE) this).A00, 36594585946031885L);
    }

    public long A02() {
        if (this instanceof C274874pE) {
            return 182.A01(0Tu.A05, ((C274874pE) this).A00, 36594585946097422L);
        } else if (this instanceof C275114pc) {
            return 64;
        } else {
            return 16;
        }
    }

    public final List A04() {
        if (this instanceof C274874pE) {
            C274874pE r4 = (C274874pE) this;
            if (182.A06(0Tu.A05, r4.A00, 36313110973253400L)) {
                r4.A00.add(new Object());
            }
            return r4.A00;
        } else if (!(this instanceof C275114pc)) {
            return this.A00;
        } else {
            C275114pc r1 = (C275114pc) this;
            List list = r1.A00;
            if (!list.isEmpty()) {
                return list;
            }
            list.addAll(r1.A00.A00.A02().A04());
            return list;
        }
    }

    public boolean A06() {
        if (!(this instanceof C274874pE)) {
            return true;
        }
        return 182.A06(0Tu.A05, ((C274874pE) this).A00, 36313110969648879L);
    }

    public boolean A07() {
        if (!(this instanceof C274874pE)) {
            return true;
        }
        return 182.A06(0Tu.A05, ((C274874pE) this).A00, 36313110972401422L);
    }

    public boolean A08() {
        if (this instanceof C274874pE) {
            return 182.A06(0Tu.A05, ((C274874pE) this).A00, 36313110971156224L);
        } else if (this instanceof C275114pc) {
            return true;
        } else {
            return false;
        }
    }

    public boolean A09() {
        if (this instanceof C274874pE) {
            return 182.A06(0Tu.A05, ((C274874pE) this).A00, 36313110971680517L);
        } else if (this instanceof C275114pc) {
            return true;
        } else {
            return false;
        }
    }
}
