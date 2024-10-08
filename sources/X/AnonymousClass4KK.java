package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.4KK  reason: invalid class name */
public abstract class AnonymousClass4KK {
    public static final Long A01(C254783t2 r1) {
        AnonymousClass9HR r12;
        0qQ.A0B(r1, 0);
        if (r1 instanceof AnonymousClass9HR) {
            r12 = (AnonymousClass9HR) r1;
        } else if (!(r1 instanceof C333417Yw)) {
            return null;
        } else {
            r12 = ((C333417Yw) r1).A01;
        }
        if (r12 instanceof MsysThreadId) {
            return ((MsysThreadId) r12).A02;
        }
        return null;
    }

    public static final String A02(C254783t2 r1) {
        C254773t1 r12;
        0qQ.A0B(r1, 0);
        if (r1 instanceof C254773t1) {
            r12 = (C254773t1) r1;
        } else if (!(r1 instanceof C333417Yw)) {
            return null;
        } else {
            r12 = ((C333417Yw) r1).A00;
        }
        if (r12 instanceof C254763t0) {
            return ((C254763t0) r12).A00;
        }
        return null;
    }

    public static final C254923tH A00(C254783t2 r1) {
        if (r1 instanceof C254773t1) {
            return C254923tH.DJANGO;
        }
        if (r1 instanceof C333417Yw) {
            return C254923tH.DJANGO_ACT_MIXED;
        }
        if (r1 instanceof AnonymousClass9HR) {
            return ((AnonymousClass9HR) r1).C9i();
        }
        return null;
    }
}
