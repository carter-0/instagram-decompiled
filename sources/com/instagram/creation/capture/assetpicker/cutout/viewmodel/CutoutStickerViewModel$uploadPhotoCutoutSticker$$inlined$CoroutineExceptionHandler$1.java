package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.AnonymousClass7TF;
import X.AnonymousClass8N2;
import X.C226132fh;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import X.LSX;
import android.content.Context;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CutoutStickerViewModel$uploadPhotoCutoutSticker$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ WeakReference $contextWeakReference$inlined;
    public final /* synthetic */ AnonymousClass8N2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$uploadPhotoCutoutSticker$$inlined$CoroutineExceptionHandler$1(C2375037z r1, WeakReference weakReference, AnonymousClass8N2 r3) {
        super(r1);
        this.$contextWeakReference$inlined = weakReference;
        this.this$0 = r3;
    }

    public void handleException(C262094Cc r5, Throwable th) {
        Context context = (Context) this.$contextWeakReference$inlined.get();
        if (context != null) {
            LSX.A02(context, AnonymousClass7TF.A0A(context), (Integer) null, ((NineSixteenLayoutConfigImpl) C226132fh.A00(context, this.this$0.A0E)).A0G);
        }
    }
}
