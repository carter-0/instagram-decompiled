package com.google.android.gms.common.api.internal;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C12550Sxb;
import X.C12554Sxf;
import X.C51965G9l;
import X.C8377Qpi;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

public final class zaar extends zac {
    public final WeakReference A00;

    public zaar(C12550Sxb sxb) {
        int A03 = AnonymousClass0fD.A03(-1157827430);
        this.A00 = C51965G9l.A0v(sxb);
        AnonymousClass0fD.A0A(1919574501, A03);
    }

    public final void FOP(zak zak) {
        int i;
        int A03 = AnonymousClass0fD.A03(1474510984);
        C12550Sxb sxb = (C12550Sxb) this.A00.get();
        if (sxb == null) {
            i = -1937852179;
        } else {
            C12554Sxf sxf = sxb.A0D;
            AnonymousClass7TE.A1S(sxf.A06, new C8377Qpi(sxb, sxb, zak), 1);
            i = 579599609;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
