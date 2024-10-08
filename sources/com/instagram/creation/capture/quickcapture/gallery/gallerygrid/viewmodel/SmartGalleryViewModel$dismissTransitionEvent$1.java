package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel;

import X.0eS;
import X.0sK;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass85O;
import X.C249513ju;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.SmartGalleryViewModel$dismissTransitionEvent$1", f = "SmartGalleryViewModel.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class SmartGalleryViewModel$dismissTransitionEvent$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ AnonymousClass85O A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartGalleryViewModel$dismissTransitionEvent$1(AnonymousClass85O r2, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        SmartGalleryViewModel$dismissTransitionEvent$1 smartGalleryViewModel$dismissTransitionEvent$1 = new SmartGalleryViewModel$dismissTransitionEvent$1(this.A03, (AnonymousClass4D7) obj3);
        smartGalleryViewModel$dismissTransitionEvent$1.A01 = booleanValue;
        smartGalleryViewModel$dismissTransitionEvent$1.A02 = booleanValue2;
        return smartGalleryViewModel$dismissTransitionEvent$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.SmartGalleryViewModel$dismissTransitionEvent$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        boolean z = false;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            boolean z2 = this.A01;
            boolean z3 = this.A02;
            if (z2 && z3) {
                C249513ju r1 = this.A03.A04;
                this.A00 = 1;
                if (r1.ELH(false, this) == r4) {
                    return r4;
                }
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
