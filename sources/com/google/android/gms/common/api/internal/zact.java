package com.google.android.gms.common.api.internal;

import X.AnonymousClass0fD;
import X.AnonymousClass63I;
import X.AnonymousClass63w;
import X.AnonymousClass63y;
import X.AnonymousClass640;
import X.AnonymousClass643;
import X.AnonymousClass64P;
import X.AnonymousClass64R;
import X.C10134RnB;
import X.C13954TmH;
import X.TH6;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

public final class zact extends zac implements AnonymousClass63y, AnonymousClass640 {
    public static final AnonymousClass63I A07 = C10134RnB.A00;
    public AnonymousClass64R A00;
    public C13954TmH A01;
    public final Context A02;
    public final Handler A03;
    public final AnonymousClass63I A04;
    public final AnonymousClass643 A05;
    public final Set A06;

    public zact(Context context, Handler handler, AnonymousClass643 r6) {
        AnonymousClass63I r2 = A07;
        int A032 = AnonymousClass0fD.A03(-184067704);
        this.A02 = context;
        this.A03 = handler;
        this.A05 = r6;
        this.A06 = r6.A05;
        this.A04 = r2;
        AnonymousClass0fD.A0A(385056328, A032);
    }

    public final void D5e(Bundle bundle) {
        int A032 = AnonymousClass0fD.A03(1516191761);
        this.A01.FOS(this);
        AnonymousClass0fD.A0A(395332081, A032);
    }

    public final void D5m(ConnectionResult connectionResult) {
        int A032 = AnonymousClass0fD.A03(1024919413);
        this.A00.FOV(connectionResult);
        AnonymousClass0fD.A0A(1631099790, A032);
    }

    public final void D5q(int i) {
        int A032 = AnonymousClass0fD.A03(1807558776);
        AnonymousClass64P r2 = (AnonymousClass64P) this.A00;
        AnonymousClass63w r22 = (AnonymousClass63w) r2.A05.A09.get(r2.A04);
        if (r22 != null) {
            if (r22.A02) {
                r22.A0B(new ConnectionResult(17));
            } else {
                r22.D5q(i);
            }
        }
        AnonymousClass0fD.A0A(1839042446, A032);
    }

    public final void FOP(zak zak) {
        int A032 = AnonymousClass0fD.A03(1139740329);
        this.A03.post(new TH6(this, zak));
        AnonymousClass0fD.A0A(111042279, A032);
    }
}
