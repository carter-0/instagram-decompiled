package com.instagram.creation.capture.quickcapture.sundial.viewmodel;

import X.00k;
import X.0eS;
import X.0sF;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C60992Juo;
import X.C63816L7x;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsAudioMixEditorViewModel$1", f = "ClipsAudioMixEditorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsAudioMixEditorViewModel$1 extends AnonymousClass1Ek implements 0sF {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public /* synthetic */ Object A05;
    public /* synthetic */ Object A06;

    public ClipsAudioMixEditorViewModel$1(AnonymousClass4D7 r2) {
        super(8, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ClipsAudioMixEditorViewModel$1 clipsAudioMixEditorViewModel$1 = new ClipsAudioMixEditorViewModel$1((AnonymousClass4D7) obj8);
        clipsAudioMixEditorViewModel$1.A00 = obj;
        clipsAudioMixEditorViewModel$1.A01 = obj2;
        clipsAudioMixEditorViewModel$1.A02 = obj3;
        clipsAudioMixEditorViewModel$1.A03 = obj4;
        clipsAudioMixEditorViewModel$1.A04 = obj5;
        clipsAudioMixEditorViewModel$1.A05 = obj6;
        clipsAudioMixEditorViewModel$1.A06 = obj7;
        return clipsAudioMixEditorViewModel$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        Object obj2 = this.A01;
        Iterable iterable = (Iterable) this.A02;
        Object obj3 = this.A03;
        Object obj4 = this.A04;
        C63816L7x l7x = (C63816L7x) this.A05;
        Object obj5 = this.A06;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll((Collection) this.A00);
        if (obj2 != null) {
            A1C.add(obj2);
        }
        A1C.addAll(00k.A0X(iterable));
        if (obj3 != null) {
            A1C.add(obj3);
        }
        if (obj4 != null) {
            A1C.add(obj4);
        }
        if (obj5 != null) {
            A1C.add(obj5);
        }
        return new C60992Juo(l7x.A00, A1C, l7x.A03, l7x.A01, l7x.A02);
    }
}
