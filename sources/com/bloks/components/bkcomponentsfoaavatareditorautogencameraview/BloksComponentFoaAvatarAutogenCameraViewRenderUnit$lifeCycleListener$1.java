package com.bloks.components.bkcomponentsfoaavatareditorautogencameraview;

import X.0qQ;
import X.19E;
import X.AnonymousClass00P;
import X.AnonymousClass12W;
import X.AnonymousClass12y;
import X.AnonymousClass4CZ;
import X.C11254SHo;
import X.C40161AUb;
import X.Pxi;
import X.R9G;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ R9G A00;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1(R9G r9g) {
        this.A00 = r9g;
    }

    public final void onActivityPaused(Activity activity) {
        C11254SHo sHo = this.A00.A00;
        if (sHo == null) {
            0qQ.A0F("selfieViewProvider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            sHo.A01();
        }
    }

    public final void onActivityResumed(Activity activity) {
        C11254SHo sHo = this.A00.A00;
        if (sHo == null) {
            0qQ.A0F("selfieViewProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        C40161AUb aUb = sHo.A03;
        if (aUb != null) {
            aUb.EIx();
        }
        Activity A002 = C11254SHo.A00(sHo.A05, sHo);
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        Pxi.A1J(A002, 19E.A02(AnonymousClass12y.A00), 20);
    }
}
