package X;

import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;

public final /* synthetic */ class MBS implements C62320sa {
    public final /* synthetic */ CreativeConfigIntf A00;
    public final /* synthetic */ PromptStickerModel A01;
    public final /* synthetic */ C310416b1 A02;
    public final /* synthetic */ C310236ae A03;

    public /* synthetic */ MBS(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C310416b1 r3, C310236ae r4) {
        this.A03 = r4;
        this.A01 = promptStickerModel;
        this.A02 = r3;
        this.A00 = creativeConfigIntf;
    }

    public final Object invoke() {
        C310236ae r0 = this.A03;
        PromptStickerModel promptStickerModel = this.A01;
        C310416b1 r3 = this.A02;
        r0.A00.A01(this.A00, promptStickerModel, r3, false);
        return C60340gF.A00;
    }
}
