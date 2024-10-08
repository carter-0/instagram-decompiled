package com.instagram.creation.capture.quickcapture.cameradestinationpicker;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass85X;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.cameradestinationpicker.CameraDestinationPickerController$7", f = "CameraDestinationPickerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CameraDestinationPickerController$7 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ boolean A00;
    public final /* synthetic */ AnonymousClass85X A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraDestinationPickerController$7(AnonymousClass85X r2, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.capture.quickcapture.cameradestinationpicker.CameraDestinationPickerController$7, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? cameraDestinationPickerController$7 = new CameraDestinationPickerController$7(this.A01, r4);
        cameraDestinationPickerController$7.A00 = ((Boolean) obj).booleanValue();
        return cameraDestinationPickerController$7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CameraDestinationPickerController$7) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        boolean z = this.A00;
        AnonymousClass85X r0 = this.A01;
        r0.A0I = z;
        AnonymousClass85X.A06(r0);
        AnonymousClass85X.A04(r0);
        return C60340gF.A00;
    }
}
