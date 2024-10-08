package X;

import com.google.common.collect.ImmutableSet;

/* renamed from: X.2sm  reason: invalid class name and case insensitive filesystem */
public final class C232012sm implements C232022sn {
    public final AnonymousClass5IN ABt(AnonymousClass4VR r5, AnonymousClass426 r6) {
        String str;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        ImmutableSet immutableSet = r6.A04;
        if (immutableSet.isEmpty()) {
            str = "No triggers";
        } else {
            str = "Unsupported trigger";
            if (immutableSet.size() == 1) {
                Object A0A = 00k.A0A(immutableSet);
                if (A0A == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (((AnonymousClass4VQ) r5).A01.CA0().contains(A0A)) {
                }
            } else {
                for (Object contains : ((AnonymousClass4VQ) r5).A01.CA0()) {
                    if (immutableSet.contains(contains)) {
                    }
                }
            }
            return AnonymousClass5IM.A00();
        }
        return AnonymousClass5IM.A03(str);
    }

    public final String FNO() {
        return null;
    }
}
