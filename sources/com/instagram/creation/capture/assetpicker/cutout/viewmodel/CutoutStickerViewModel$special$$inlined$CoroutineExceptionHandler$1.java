package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.AnonymousClass8N2;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import X.KK3;
import android.graphics.Bitmap;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ AnonymousClass8N2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1(C2375037z r1, AnonymousClass8N2 r2) {
        super(r1);
        this.this$0 = r2;
    }

    public void handleException(C262094Cc r4, Throwable th) {
        this.this$0.A0A.Epw(new KK3((Bitmap) null, (Integer) null, th));
    }
}
