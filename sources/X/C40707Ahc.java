package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ahc  reason: case insensitive filesystem */
public final class C40707Ahc implements B38 {
    public InstructionServiceListenerWrapper A00;

    public final void FKT(Bundle bundle) {
        String string;
        InstructionServiceListenerWrapper instructionServiceListenerWrapper;
        String string2;
        InstructionServiceListenerWrapper instructionServiceListenerWrapper2;
        ArrayList<Integer> arrayList;
        ArrayList<Integer> arrayList2;
        0qQ.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("autoInstructionType")) {
                    int i2 = bundle.getInt("autoInstructionType");
                    if (bundle.containsKey(IgReactMediaPickerNativeModule.WIDTH)) {
                        arrayList = bundle.getIntegerArrayList(IgReactMediaPickerNativeModule.WIDTH);
                    } else {
                        arrayList = null;
                    }
                    if (bundle.containsKey(IgReactMediaPickerNativeModule.HEIGHT)) {
                        arrayList2 = bundle.getIntegerArrayList(IgReactMediaPickerNativeModule.HEIGHT);
                    } else {
                        arrayList2 = null;
                    }
                    InstructionServiceListenerWrapper instructionServiceListenerWrapper3 = this.A00;
                    if (instructionServiceListenerWrapper3 != null) {
                        instructionServiceListenerWrapper3.setVisibleAutomaticInstruction(i2, (List) null, arrayList, arrayList2);
                    }
                }
            } else if (i == 1) {
                InstructionServiceListenerWrapper instructionServiceListenerWrapper4 = this.A00;
                if (instructionServiceListenerWrapper4 != null) {
                    instructionServiceListenerWrapper4.hideInstruction();
                }
            } else if (i == 2) {
                if (bundle.containsKey("token") && (string2 = bundle.getString("token")) != null && (instructionServiceListenerWrapper2 = this.A00) != null) {
                    instructionServiceListenerWrapper2.showInstructionForToken(string2);
                }
            } else if (i == 3 && bundle.containsKey("text") && (string = bundle.getString("text")) != null && (instructionServiceListenerWrapper = this.A00) != null) {
                instructionServiceListenerWrapper.showInstructionWithCustomText(string);
            }
        }
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(38);
    }

    public final void CMw(C371698yt r3) {
        InstructionServiceListenerWrapper instructionServiceListenerWrapper;
        if (r3 != null) {
            C371628yi r1 = C371728yy.A01;
            if (C371698yt.A01(r3, r1)) {
                C371728yy r0 = (C371728yy) r3.A02(r1);
                if (r0 != null) {
                    instructionServiceListenerWrapper = r0.A00;
                } else {
                    instructionServiceListenerWrapper = null;
                }
                this.A00 = instructionServiceListenerWrapper;
            }
        }
    }

    public final List EzR() {
        return AnonymousClass7TE.A1I(AnonymousClass7TH.A05(38));
    }
}
