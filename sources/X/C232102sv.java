package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.2sv  reason: invalid class name and case insensitive filesystem */
public final class C232102sv implements C232022sn {
    public final C232122sx A00 = new C232122sx();

    public final AnonymousClass5IN ABt(AnonymousClass4VR r14, AnonymousClass426 r15) {
        AnonymousClass5IZ r2;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        AnonymousClass4VT r0 = ((AnonymousClass4VQ) r14).A02;
        if (r0 != null) {
            AnonymousClass4VU r4 = r0.A00;
            if (r4.A00 != AnonymousClass05K.A0N) {
                try {
                    r2 = C232122sx.A00(this.A00, r14, r15, r4);
                } catch (C232112sw | IllegalArgumentException | NullPointerException unused) {
                    r2 = new AnonymousClass5IZ((ImmutableList) null, r4, false);
                }
                if (!r2.A02) {
                    ImmutableList immutableList = r2.A00;
                    C283525Ia r42 = new C283525Ia(immutableList);
                    if (immutableList == null || immutableList.isEmpty()) {
                        AnonymousClass4VU r6 = r2.A01;
                        if (r6 != null) {
                            return new AnonymousClass5IN(r42, (AnonymousClass4VV) null, r6, (Integer) null, "Failed filter clause", (Throwable) null, false, false, false);
                        }
                        return AnonymousClass5IM.A02(r42, "failed_context_filter");
                    }
                    AnonymousClass4VV r5 = (AnonymousClass4VV) immutableList.get(0);
                    0qQ.A0A(r5);
                    0qQ.A0B(r5, 1);
                    return new AnonymousClass5IN(r42, r5, (AnonymousClass4VU) null, (Integer) null, "Failed context filter", (Throwable) null, false, false, false);
                }
            }
        }
        return AnonymousClass5IM.A00();
    }

    public final String FNO() {
        return "client_filters";
    }
}
