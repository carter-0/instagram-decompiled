package com.google.android.play.core.splitinstall;

import X.2Jg;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C365498nD;
import X.Pxe;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzbp;
import com.google.android.play.core.splitinstall.internal.zzl;
import java.util.List;

public abstract class zzbh extends zzbp {
    public final C365498nD A00;
    public final /* synthetic */ 2Jg A01;

    public zzbh(C365498nD r3, 2Jg r4) {
        this.A01 = r4;
        int A03 = AnonymousClass0fD.A03(1902545579);
        this.A00 = r3;
        AnonymousClass0fD.A0A(-2036981912, A03);
    }

    public void FPG(int i, Bundle bundle) {
        int A002 = zzl.A00(this, 1275983726);
        2Jg.A02.A03("onCancelInstall(%d)", AnonymousClass7TF.A1b(i));
        AnonymousClass0fD.A0A(1659203996, A002);
    }

    public void FPe(Bundle bundle) {
        int A002 = zzl.A00(this, -1264042034);
        2Jg.A02.A03("onDeferredInstall", Pxe.A1b());
        AnonymousClass0fD.A0A(1820937059, A002);
    }

    public void FPx(Bundle bundle) {
        int A002 = zzl.A00(this, 969156116);
        2Jg.A02.A03("onDeferredUninstall", Pxe.A1b());
        AnonymousClass0fD.A0A(1935872819, A002);
    }

    public void FQ5(List list) {
        int A002 = zzl.A00(this, 1015286713);
        2Jg.A02.A03("onGetSessionStates", Pxe.A1b());
        AnonymousClass0fD.A0A(1705113819, A002);
    }

    public void FQC(int i, Bundle bundle) {
        int A002 = zzl.A00(this, 1096559467);
        2Jg.A02.A03("onStartInstall(%d)", AnonymousClass7TF.A1b(i));
        AnonymousClass0fD.A0A(-914453389, A002);
    }
}
