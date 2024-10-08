package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import kotlin.Deprecated;

/* renamed from: X.5yF  reason: invalid class name and case insensitive filesystem */
public abstract class C300965yF {
    public static final C254763t0 A01(C254793t3 r2) {
        0qQ.A0B(r2, 0);
        C254763t0 A02 = A02(r2);
        if (A02 != null) {
            return A02;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadId: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final C254763t0 A02(C254793t3 r1) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof C254763t0) {
            return (C254763t0) r1;
        }
        if (r1 instanceof C69042Ndc) {
            return ((C69042Ndc) r1).A00;
        }
        return null;
    }

    public static final MsysThreadId A03(C254793t3 r2) {
        0qQ.A0B(r2, 0);
        MsysThreadId A04 = A04(r2);
        if (A04 != null) {
            return A04;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected MsysThreadId: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final MsysThreadId A04(C254793t3 r1) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof MsysThreadId) {
            return (MsysThreadId) r1;
        }
        if (r1 instanceof C69042Ndc) {
            return ((C69042Ndc) r1).A01;
        }
        return null;
    }

    public static final C254743sy A05(C254793t3 r2) {
        Object obj;
        0qQ.A0B(r2, 0);
        if (r2 instanceof C254763t0) {
            obj = C327647Bq.A00((C254763t0) r2);
        } else {
            boolean z = r2 instanceof MsysThreadId;
            obj = r2;
            if (!z) {
                if (r2 instanceof C69042Ndc) {
                    C69042Ndc ndc = (C69042Ndc) r2;
                    obj = new DirectMsysMixedThreadKey(C327647Bq.A00(ndc.A00), ndc.A01);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AnonymousClass000.A00(108));
                    sb.append(r2);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return (C254743sy) obj;
    }

    @Deprecated(message = "DO NOT USE THIS METHOD. Passing around thread IDs as raw Strings is dangerous and is a sign that code is not properly data source agnostic.")
    public static final String A06(C254793t3 r2) {
        C254763t0 r22;
        0qQ.A0B(r2, 0);
        if (r2 instanceof C254763t0) {
            r22 = (C254763t0) r2;
        } else if (r2 instanceof MsysThreadId) {
            return String.valueOf(((MsysThreadId) r2).A00);
        } else {
            if (r2 instanceof C69042Ndc) {
                r22 = ((C69042Ndc) r2).A00;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass000.A00(108));
                sb.append(r2);
                throw new IllegalStateException(sb.toString());
            }
        }
        return r22.A00;
    }

    public static final String A07(C254793t3 r2) {
        C254763t0 r22;
        0qQ.A0B(r2, 0);
        if (r2 instanceof C254763t0) {
            r22 = (C254763t0) r2;
        } else if (r2 instanceof MsysThreadId) {
            return "-1";
        } else {
            if (r2 instanceof C69042Ndc) {
                r22 = ((C69042Ndc) r2).A00;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass000.A00(108));
                sb.append(r2);
                throw new IllegalStateException(sb.toString());
            }
        }
        return r22.A00;
    }

    public static final C254923tH A00(C254793t3 r2) {
        if (r2 instanceof C254763t0) {
            return C254923tH.DJANGO;
        }
        if (r2 instanceof C333417Yw) {
            return C254923tH.DJANGO_ACT_MIXED;
        }
        if (r2 instanceof MsysThreadId) {
            return ((MsysThreadId) r2).A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(108));
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }
}
