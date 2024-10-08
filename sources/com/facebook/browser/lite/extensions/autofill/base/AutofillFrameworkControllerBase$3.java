package com.facebook.browser.lite.extensions.autofill.base;

import X.AnonymousClass0fD;
import X.C11368SPm;
import X.STY;
import X.SUR;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class AutofillFrameworkControllerBase$3 extends AutofillContactDataCallback.Stub {
    public final /* synthetic */ STY A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Set A02;

    public AutofillFrameworkControllerBase$3(STY sty, Integer num, Set set) {
        this.A00 = sty;
        this.A02 = set;
        this.A01 = num;
        AnonymousClass0fD.A0A(1976328366, AnonymousClass0fD.A03(88418367));
    }

    public final void Czu(List list) {
        int A03 = AnonymousClass0fD.A03(-698202626);
        STY sty = this.A00;
        ArrayList A05 = SUR.A05(list);
        sty.A0F = A05;
        Set set = this.A02;
        sty.A0G(this.A01, C11368SPm.A02(A05, set), set, false);
        AnonymousClass0fD.A0A(2030566370, A03);
    }
}
