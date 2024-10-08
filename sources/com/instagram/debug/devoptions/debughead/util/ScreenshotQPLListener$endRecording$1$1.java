package com.instagram.debug.devoptions.debughead.util;

import X.00k;
import X.0XY;
import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.debughead.util.ScreenshotQPLListener$endRecording$1$1", f = "ScreenshotQPLListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenshotQPLListener$endRecording$1$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ List $it;
    public final /* synthetic */ 0XY $quickEvent;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenshotQPLListener$endRecording$1$1(0XY r2, List list, AnonymousClass4D7 r4) {
        super(2, r4);
        this.$quickEvent = r2;
        this.$it = list;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.debughead.util.ScreenshotQPLListener$endRecording$1$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new ScreenshotQPLListener$endRecording$1$1(this.$quickEvent, this.$it, r5);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((ScreenshotQPLListener$endRecording$1$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            ScreenshotQPLListener.INSTANCE.saveToDisk(this.$quickEvent, 00k.A0g(this.$it, new ScreenshotQPLListener$endRecording$1$1$invokeSuspend$$inlined$sortedBy$1()));
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0x();
    }
}
