package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;

/* renamed from: X.Fbl  reason: case insensitive filesystem */
public final class C50438Fbl implements G73 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void DoN(1Xj r12) {
        0qQ.A0B(r12, 0);
        UserSession userSession = this.A02;
        FFV.A02(this.A00, this.A01, new RectF(0.0f, 0.0f, 0.0f, 0.0f), userSession, (ClipsCelebrationReshareViewModel) null, r12, this.A04, (String) null, 0, true);
    }

    public C50438Fbl(Activity activity, RectF rectF, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = rectF;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onFail(String str) {
        C59689JTv.A0B(this.A00, "shareFeedPostToStoryWithMediaId_something_went_wrong");
        0f9 AEf = 0wj.A01.AEf("Failed to fetch media from mediaId: $errorMessage", 817891009);
        AEf.ABQ("Media Id", this.A03);
        AEf.report();
    }
}
