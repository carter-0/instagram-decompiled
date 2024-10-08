package com.facebook.commonavatarliveediting.prefetch;

import X.0KC;
import X.0rm;
import X.C18073Vl1;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import X.C277014uI;
import X.C307896Rx;
import X.W04;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ C307896Rx $environment$inlined;
    public final /* synthetic */ C18073Vl1 $liveEditingQplLogger$inlined;
    public final /* synthetic */ 0rm $onEvent$inlined;
    public final /* synthetic */ W04 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1(C2375037z r1, W04 w04, 0rm r3, C307896Rx r4, C18073Vl1 vl1) {
        super(r1);
        this.this$0 = w04;
        this.$onEvent$inlined = r3;
        this.$environment$inlined = r4;
        this.$liveEditingQplLogger$inlined = vl1;
    }

    public void handleException(C262094Cc r5, Throwable th) {
        0KC.A0F("CommonBloksActionHelper", "load live editor failed", th);
        W04.A01(this.this$0, this.$environment$inlined, (C277014uI) this.$onEvent$inlined.A00, "unknown_error");
        this.$liveEditingQplLogger$inlined.A05(3);
    }
}
