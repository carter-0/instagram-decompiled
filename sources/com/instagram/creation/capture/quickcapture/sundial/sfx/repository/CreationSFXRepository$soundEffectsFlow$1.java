package com.instagram.creation.capture.quickcapture.sundial.sfx.repository;

import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C381669c8;
import X.C60340gF;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.sfx.repository.CreationSFXRepository$soundEffectsFlow$1", f = "CreationSFXRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreationSFXRepository$soundEffectsFlow$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;

    public CreationSFXRepository$soundEffectsFlow$1(AnonymousClass4D7 r2) {
        super(3, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        CreationSFXRepository$soundEffectsFlow$1 creationSFXRepository$soundEffectsFlow$1 = new CreationSFXRepository$soundEffectsFlow$1((AnonymousClass4D7) obj3);
        creationSFXRepository$soundEffectsFlow$1.A01 = obj;
        creationSFXRepository$soundEffectsFlow$1.A00 = intValue;
        return creationSFXRepository$soundEffectsFlow$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        int i = this.A00;
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) this.A01) {
            long j = ((C381669c8) next).A01;
            if (0 <= j && j <= ((long) i)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
