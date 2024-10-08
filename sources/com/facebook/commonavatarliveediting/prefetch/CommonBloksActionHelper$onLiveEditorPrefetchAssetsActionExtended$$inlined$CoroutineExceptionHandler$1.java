package com.facebook.commonavatarliveediting.prefetch;

import X.0KC;
import X.C18073Vl1;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ C18073Vl1 $liveEditingQplLogger$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$$inlined$CoroutineExceptionHandler$1(C2375037z r1, C18073Vl1 vl1) {
        super(r1);
        this.$liveEditingQplLogger$inlined = vl1;
    }

    public void handleException(C262094Cc r3, Throwable th) {
        0KC.A0F("CommonBloksActionHelper", "prefetch failed", th);
        this.$liveEditingQplLogger$inlined.A05(3);
    }
}
