package com.facebook.onecamera.outputcontrollers.camera.basic;

import X.AnonymousClass8GD;
import X.C340547lR;
import X.C340607lX;
import X.C343837qt;
import X.C344287rc;
import X.C344307re;
import X.C344327rg;
import X.C345477tY;
import X.C345497tb;
import X.C372218zy;
import X.C40963Am9;
import android.os.Handler;

public final class BasicCameraOutputController extends C345477tY implements C345497tb {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public Integer A02 = null;
    public Integer A03 = null;
    public volatile C340547lR A04;

    public static C340607lX A00(BasicCameraOutputController basicCameraOutputController) {
        return ((C344307re) ((C344327rg) basicCameraOutputController.A00.Ape(C344327rg.A00))).A02.A0N;
    }

    public final void A09() {
        this.A04 = ((C344307re) ((C344327rg) this.A00.Ape(C344327rg.A00))).A02;
    }

    public final C344287rc BJx() {
        return C345497tb.A00;
    }

    public BasicCameraOutputController(C343837qt r2) {
        super(r2);
    }

    public static void A01(Handler handler, AnonymousClass8GD r3, Exception exc) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            r3.A01(exc);
        } else {
            handler.post(new C40963Am9(r3, exc));
        }
    }

    public static void A03(Handler handler, AnonymousClass8GD r3, Object obj) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            r3.A02(obj);
        } else {
            handler.post(new C372218zy(r3, obj));
        }
    }
}
