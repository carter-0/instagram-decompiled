package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.6W3  reason: invalid class name */
public abstract class AnonymousClass6W3 {
    public static final C254923tH A00(C254783t2 r2) {
        0qQ.A0B(r2, 0);
        if (r2 instanceof C254773t1) {
            return C254923tH.DJANGO;
        }
        if (r2 instanceof AnonymousClass9HR) {
            return ((AnonymousClass9HR) r2).C9i();
        }
        if (r2 instanceof C333417Yw) {
            return C254923tH.DJANGO_ACT_MIXED;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadTarget or MsysThreadTarget: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final C254773t1 A01(C254783t2 r2) {
        0qQ.A0B(r2, 0);
        C254773t1 A02 = A02(r2);
        if (A02 != null) {
            return A02;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadTarget: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final C254773t1 A02(C254783t2 r1) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof C254773t1) {
            return (C254773t1) r1;
        }
        if (r1 instanceof C333417Yw) {
            return ((C333417Yw) r1).A00;
        }
        return null;
    }

    public static final AnonymousClass9HR A03(C254783t2 r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass9HR A04 = A04(r2);
        if (A04 != null) {
            return A04;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected MsysThreadTarget: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final AnonymousClass9HR A04(C254783t2 r1) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof AnonymousClass9HR) {
            return (AnonymousClass9HR) r1;
        }
        if (r1 instanceof C333417Yw) {
            return ((C333417Yw) r1).A01;
        }
        return null;
    }

    public static final C254793t3 A05(C254783t2 r4) {
        C254763t0 r2;
        MsysThreadId msysThreadId;
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C254793t3)) {
            if (!(r4 instanceof C333417Yw)) {
                return null;
            }
            C333417Yw r42 = (C333417Yw) r4;
            C254773t1 r22 = r42.A00;
            if (!(r22 instanceof C254763t0) || (r2 = (C254763t0) r22) == null) {
                return null;
            }
            AnonymousClass9HR r1 = r42.A01;
            if (!(r1 instanceof MsysThreadId) || (msysThreadId = (MsysThreadId) r1) == null) {
                return null;
            }
            r4 = new C69042Ndc(r2, msysThreadId);
        }
        return (C254793t3) r4;
    }

    @Deprecated(message = "Please use threadId (existing thread) or recipientIds (pending thread).")
    public static final C254743sy A06(C254783t2 r4) {
        0qQ.A0B(r4, 0);
        Object obj = null;
        if (r4 instanceof C254763t0) {
            obj = new DirectThreadKey(((C254763t0) r4).A00, (List) null);
        } else if (r4 instanceof C291175gg) {
            obj = new DirectThreadKey((Collection) ((C291175gg) r4).A00);
        } else if (r4 instanceof MsysThreadId) {
            obj = r4;
        } else if (r4 instanceof C333417Yw) {
            C333417Yw r42 = (C333417Yw) r4;
            AnonymousClass9HR r1 = r42.A01;
            if (r1 instanceof MsysThreadId) {
                C254743sy A06 = A06(r42.A00);
                0qQ.A0C(A06, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                C254743sy A062 = A06(r1);
                0qQ.A0C(A062, C66579MXk.A00(1003));
                obj = new DirectMsysMixedThreadKey((DirectThreadKey) A06, (MsysThreadId) A062);
            }
        } else if (r4 instanceof PIO) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be converted to UnifiedThreadKey: ");
            sb.append(r4);
            throw new IllegalStateException(sb.toString());
        }
        return (C254743sy) obj;
    }

    public static final boolean A08(C254783t2 r1) {
        0qQ.A0B(r1, 0);
        return A02(r1) != null;
    }

    public static final boolean A07(C254783t2 r2) {
        if (!(r2 instanceof AnonymousClass9HR) || ((AnonymousClass9HR) r2).C9i() != C254923tH.ACT) {
            return false;
        }
        return true;
    }
}
