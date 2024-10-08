package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Q4k  reason: case insensitive filesystem */
public class C7334Q4k {
    public double A0I() {
        return -1.0d;
    }

    public final boolean A02() {
        UserSession userSession;
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            switch (qeC.A00) {
                case 0:
                    userSession = (UserSession) qeC.A01;
                    break;
                case 1:
                    return ((SJN) qeC.A01).A0G;
                default:
                    userSession = ((AnonymousClass833) qeC.A01).A00;
                    break;
            }
        } else if (!(this instanceof C7967QeF)) {
            return false;
        } else {
            userSession = ((C7967QeF) this).A00;
        }
        return 1KU.A0E(userSession);
    }

    public final boolean A03() {
        0lg r3;
        0Tu r2;
        long j;
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            switch (qeC.A00) {
                case 0:
                    r3 = (0lg) qeC.A01;
                    r2 = 0Tu.A05;
                    j = 36324179101757301L;
                    break;
                case 2:
                    r3 = ((AnonymousClass833) qeC.A01).A00;
                    r2 = 0Tu.A05;
                    j = 36324179101822838L;
                    break;
                default:
                    return false;
            }
            return 182.A06(r2, r3, j);
        } else if (this instanceof C7965QeD) {
            return ((C7965QeD) this).A01;
        } else {
            if (this instanceof C7966QeE) {
                return ((C7966QeE) this).A02;
            }
            if (!(this instanceof C7967QeF)) {
                return false;
            }
            return 182.A06(0Tu.A05, ((C7967QeF) this).A00, 36316190465003594L);
        }
    }

    public final boolean A04() {
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0O;
        }
        return false;
    }

    public final boolean A05() {
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0S;
        }
        return false;
    }

    public final boolean A06() {
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            if (1 - qeC.A00 == 0) {
                return ((SJN) qeC.A01).A0a;
            }
            return false;
        } else if (!(this instanceof C7967QeF)) {
            return false;
        } else {
            return 182.A06(0Tu.A05, ((C7967QeF) this).A00, 36316190462775344L);
        }
    }

    public final boolean A07() {
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            switch (qeC.A00) {
                case 1:
                    return ((SJN) qeC.A01).A0c;
                case 2:
                    return true;
                default:
                    return false;
            }
        } else if (this instanceof C7966QeE) {
            return ((C7966QeE) this).A07;
        } else {
            if (this instanceof C7967QeF) {
                return true;
            }
            return false;
        }
    }

    public final boolean A08() {
        if (this instanceof C7967QeF) {
            C7967QeF qeF = (C7967QeF) this;
            if (qeF.A01.A0E() == ShareType.CLIPS) {
                if (!182.A06(0Tu.A05, qeF.A00, 36319403096153367L)) {
                    return false;
                }
                return true;
            }
        } else if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            if (qeC.A00 == 0) {
                return 182.A06(0Tu.A05, (0lg) qeC.A01, 36316190464872520L);
            }
        }
        return false;
    }

    public final boolean A09() {
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0d;
        }
        return false;
    }

    public final boolean A0A() {
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0l;
        }
        return false;
    }

    public final boolean A0B() {
        UserSession userSession;
        if (this instanceof C7967QeF) {
            userSession = ((C7967QeF) this).A00;
        } else if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            switch (qeC.A00) {
                case 1:
                    return ((SJN) qeC.A01).A0m;
                case 2:
                    userSession = ((AnonymousClass833) qeC.A01).A00;
                    break;
                default:
                    return false;
            }
        } else if (this instanceof C7966QeE) {
            return ((C7966QeE) this).A08;
        } else {
            return false;
        }
        return 182.A06(0Tu.A05, userSession, 36319373031382198L);
    }

    public final boolean A0C() {
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0v;
        }
        return false;
    }

    public final boolean A0D() {
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            if (1 - qeC.A00 == 0) {
                return ((SJN) qeC.A01).A0w;
            }
            return false;
        } else if (!(this instanceof C7967QeF)) {
            return false;
        } else {
            return 182.A06(0Tu.A05, ((C7967QeF) this).A00, 36316190461857829L);
        }
    }

    public final boolean A0E() {
        0lg r3;
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            switch (qeC.A00) {
                case 0:
                    r3 = (0lg) qeC.A01;
                    break;
                case 1:
                    return ((SJN) qeC.A01).A11;
                default:
                    return false;
            }
        } else if (!(this instanceof C7967QeF)) {
            return false;
        } else {
            r3 = ((C7967QeF) this).A00;
        }
        return 182.A06(0Tu.A05, r3, 36316190462709807L);
    }

    public final boolean A0F() {
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0N;
        }
        return false;
    }

    public final boolean A0G() {
        0lg r3;
        if (this instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) this;
            if (qeC.A00 != 0) {
                return false;
            }
            r3 = (0lg) qeC.A01;
        } else if (!(this instanceof C7967QeF)) {
            return false;
        } else {
            r3 = ((C7967QeF) this).A00;
        }
        return 182.A06(0Tu.A05, r3, 36322302199081016L);
    }

    public final boolean A0H() {
        if (this instanceof C7967QeF) {
            return true;
        }
        if (!(this instanceof C7964QeC)) {
            return false;
        }
        C7964QeC qeC = (C7964QeC) this;
        if (1 - qeC.A00 == 0) {
            return ((SJN) qeC.A01).A0Y;
        }
        return false;
    }

    public C11328SNg A0J() {
        return C11328SNg.A06;
    }

    public static boolean A00(C266724aF r1, C7334Q4k q4k, TimeUnit timeUnit, long j) {
        return r1.A06(timeUnit, j, q4k.A0H());
    }
}
