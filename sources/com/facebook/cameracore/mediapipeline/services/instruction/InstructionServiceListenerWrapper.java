package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass82N;
import X.C40729AiG;
import X.C40942Alo;
import X.C40943Alp;
import X.C41225AqN;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

public class InstructionServiceListenerWrapper {
    public final AnonymousClass82N mListener;
    public final Handler mUIHandler = new Handler(Looper.getMainLooper());

    public void setVisibleAutomaticInstruction(int i, List list, List list2, List list3) {
        this.mUIHandler.post(new C41225AqN(this, list, list2, list3, i));
    }

    public void hideInstruction() {
        this.mUIHandler.post(new C40729AiG(this));
    }

    public void showInstructionForToken(String str) {
        this.mUIHandler.post(new C40942Alo(this, str));
    }

    public void showInstructionWithCustomText(String str) {
        this.mUIHandler.post(new C40943Alp(this, str));
    }

    public InstructionServiceListenerWrapper(AnonymousClass82N r3) {
        this.mListener = r3;
    }
}
