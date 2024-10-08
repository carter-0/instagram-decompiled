package com.google.android.gms.internal.auth;

import X.AnonymousClass0fD;
import X.C365498nD;
import X.QpR;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

public final class zzx extends IStatusCallback.Stub {
    public final /* synthetic */ C365498nD A00;

    public zzx(C365498nD r3) {
        this.A00 = r3;
        AnonymousClass0fD.A0A(620593635, AnonymousClass0fD.A03(-1029619808));
    }

    public final void DfT(Status status) {
        int A03 = AnonymousClass0fD.A03(-825792969);
        QpR.A02(status, this.A00, (Object) null);
        AnonymousClass0fD.A0A(-1050853202, A03);
    }
}
