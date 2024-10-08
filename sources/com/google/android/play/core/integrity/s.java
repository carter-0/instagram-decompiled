package com.google.android.play.core.integrity;

import X.AnonymousClass0fD;
import X.C10613Rv7;
import X.C11229SGh;
import X.C365498nD;
import android.os.IInterface;
import com.google.android.play.integrity.internal.b;

public final class s extends b implements IInterface {
    public final C365498nD A00;
    public final C11229SGh A01;
    public final /* synthetic */ C10613Rv7 A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(C365498nD r4, C10613Rv7 rv7) {
        this();
        this.A02 = rv7;
        int A03 = AnonymousClass0fD.A03(-1886292617);
        this.A01 = new C11229SGh("OnRequestIntegrityTokenCallback");
        this.A00 = r4;
        AnonymousClass0fD.A0A(-659758952, A03);
    }

    public s() {
        int A03 = AnonymousClass0fD.A03(354494532);
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        AnonymousClass0fD.A0A(2004969641, A03);
        AnonymousClass0fD.A0A(-507884623, AnonymousClass0fD.A03(-1133778173));
    }
}
