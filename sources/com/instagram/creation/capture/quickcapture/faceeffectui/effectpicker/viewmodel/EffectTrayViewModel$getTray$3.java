package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel;

import X.02o;
import X.0eS;
import X.0sJ;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3", f = "EffectTrayViewModel.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
public final class EffectTrayViewModel$getTray$3 extends AnonymousClass1Ek implements 0sJ {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;

    public EffectTrayViewModel$getTray$3(AnonymousClass4D7 r2) {
        super(4, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        EffectTrayViewModel$getTray$3 effectTrayViewModel$getTray$3 = new EffectTrayViewModel$getTray$3((AnonymousClass4D7) obj4);
        effectTrayViewModel$getTray$3.A01 = obj;
        effectTrayViewModel$getTray$3.A02 = obj2;
        effectTrayViewModel$getTray$3.A03 = booleanValue;
        return effectTrayViewModel$getTray$3.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            02o r2 = (02o) this.A01;
            Object obj2 = this.A02;
            if (this.A03) {
                this.A01 = null;
                this.A00 = 1;
                if (r2.emit(obj2, this) == r4) {
                    return r4;
                }
            }
        }
        return C60340gF.A00;
    }
}
