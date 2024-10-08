package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import java.io.File;

public final class EHV extends 2Cn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ RectF A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ 28D A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ ReelsVisualRepliesModel A06;
    public final /* synthetic */ 1Xj A07;
    public final /* synthetic */ AnonymousClass6ST A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public EHV(Activity activity, RectF rectF, RectF rectF2, 28D r4, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, 1Xj r7, AnonymousClass6ST r8, String str, String str2, int i, boolean z) {
        this.A08 = r8;
        this.A01 = activity;
        this.A05 = userSession;
        this.A07 = r7;
        this.A00 = i;
        this.A0B = z;
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A04 = r4;
        this.A0A = str;
        this.A06 = reelsVisualRepliesModel;
        this.A09 = str2;
    }

    public final void onFail(Exception exc) {
        C59689JTv.A0B(this.A01, "shareVideoFeedPostToStory_something_went_wrong");
    }

    public final void onFinish() {
        if (!this.A01.isDestroyed()) {
            this.A08.dismiss();
        }
    }

    public final void onStart() {
        AnonymousClass0fN.A00(this.A08);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File A0T = Dba.A0T(obj);
        UserSession userSession = this.A05;
        Activity activity = this.A01;
        1Xj r7 = this.A07;
        int i = this.A00;
        boolean z = this.A0B;
        FFV.A00(activity, this.A02, this.A03, this.A04, userSession, this.A06, (ClipsCelebrationReshareViewModel) null, r7, A0T, this.A0A, this.A09, i, z);
    }
}
