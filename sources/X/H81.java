package X;

import android.view.View;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;

public final class H81 extends AnonymousClass0mG {
    public final /* synthetic */ ReelsVisualRepliesModel A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ JOM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H81(ReelsVisualRepliesModel reelsVisualRepliesModel, 1Xj r4, JOM jom, String str, String str2) {
        super(500);
        this.A02 = jom;
        this.A01 = r4;
        this.A00 = reelsVisualRepliesModel;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void A00(View view) {
        boolean z;
        JOM jom = this.A02;
        1Xj r3 = this.A01;
        MediaVCRTappableData mediaVCRTappableData = this.A00.A00;
        if (mediaVCRTappableData != null) {
            z = mediaVCRTappableData.A0A;
        } else {
            z = false;
        }
        jom.Dze(r3, this.A03, this.A04, z);
    }
}
