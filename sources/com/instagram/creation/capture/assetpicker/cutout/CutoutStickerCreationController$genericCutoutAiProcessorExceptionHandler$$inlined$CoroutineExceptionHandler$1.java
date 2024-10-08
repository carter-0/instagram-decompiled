package com.instagram.creation.capture.assetpicker.cutout;

import X.AnonymousClass7TF;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import X.C62320sa;
import X.C64965Ll4;
import X.LPO;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ C62320sa $actionButtonHandler$inlined;
    public final /* synthetic */ C64965Ll4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(C2375037z r1, C64965Ll4 ll4, C62320sa r3) {
        super(r1);
        this.this$0 = ll4;
        this.$actionButtonHandler$inlined = r3;
    }

    public void handleException(C262094Cc r6, Throwable th) {
        IgdsMediaButton igdsMediaButton = this.this$0.A0C;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(false);
        }
        IgdsMediaButton igdsMediaButton2 = this.this$0.A07;
        if (igdsMediaButton2 != null) {
            igdsMediaButton2.setEnabled(false);
        }
        C64965Ll4.A02(this.this$0);
        LPO.A01(this.this$0.A0I, AnonymousClass7TF.A0m("CutoutStickerCreationController: error during image processing: cause ", th), "Error while ai processing", this.$actionButtonHandler$inlined, 2131972371);
    }
}
