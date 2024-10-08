package com.facebook.cameracore.mediapipeline.services.haptic;

import X.C371938zO;
import java.util.List;

public class HapticServiceDelegateWrapper {
    public final C371938zO mDelegate;

    public void cancel() {
        this.mDelegate.cancel();
    }

    public void vibrate(List list, List list2) {
        this.mDelegate.FMz(list, list2);
    }

    public void vibrateSingleShot() {
        this.mDelegate.FN0();
    }

    public HapticServiceDelegateWrapper(C371938zO r1) {
        this.mDelegate = r1;
    }
}
