package com.google.android.gms.internal.p002authapi;

import X.AnonymousClass0fD;
import X.C13468Tav;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.internal.auth-api.zbk  reason: invalid package */
public final class zbk extends zbd {
    public final C13468Tav A00;

    public zbk(C13468Tav tav) {
        int A03 = AnonymousClass0fD.A03(-904703812);
        this.A00 = tav;
        AnonymousClass0fD.A0A(1821734319, A03);
    }

    public final void FOh(Status status) {
        int A03 = AnonymousClass0fD.A03(1445723329);
        ((BasePendingResult) this.A00).A06(status);
        AnonymousClass0fD.A0A(-795241570, A03);
    }
}
