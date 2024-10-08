package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.File;

/* renamed from: X.9jn  reason: invalid class name and case insensitive filesystem */
public final class C385949jn extends 2Cn {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ ReelsVisualRepliesModel A03;
    public final /* synthetic */ ClipsCelebrationReshareViewModel A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ AnonymousClass6ST A06;
    public final /* synthetic */ String A07;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        AnonymousClass9PJ.A00(this.A02).A08(exc.getMessage());
        C59689JTv.A0B(this.A00, "save_media_failed");
    }

    public C385949jn(Activity activity, 28D r2, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r6, AnonymousClass6ST r7, String str) {
        this.A06 = r7;
        this.A00 = activity;
        this.A02 = userSession;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = clipsCelebrationReshareViewModel;
        this.A03 = reelsVisualRepliesModel;
        this.A07 = str;
    }

    public final void onFinish() {
        if (!this.A00.isDestroyed()) {
            this.A06.dismiss();
        }
    }

    public final void onStart() {
        AnonymousClass0fN.A00(this.A06);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ExtendedImageUrl A1n;
        File file = (File) obj;
        0qQ.A0B(file, 0);
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36323225617050631L);
        Activity activity = this.A00;
        1Xj r10 = this.A05;
        28D r11 = this.A01;
        ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = this.A04;
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A03;
        String str = this.A07;
        if (A062) {
            ExtendedImageUrl A1l = r10.A1l();
            if (A1l != null) {
                String str2 = A1l.A0A;
                0qQ.A07(str2);
                A1n = new ExtendedImageUrl(str2, A1l.getWidth(), A1l.getHeight());
            } else {
                A1n = r10.A1n(activity);
            }
            Bundle A002 = Q21.A00(AnonymousClass7TE.A1L(AnonymousClass000.A00(210), r11), AnonymousClass7TE.A1L(AnonymousClass000.A00(212), r10.getId()), AnonymousClass7TE.A1L(AnonymousClass000.A00(211), file.getCanonicalPath()), AnonymousClass7TE.A1L("ClipsConstants.ARG_CLIPS_SHARE_CELEBRATION_VIEW_MODEL", clipsCelebrationReshareViewModel), AnonymousClass7TE.A1L(AnonymousClass000.A00(57), (Object) null), AnonymousClass7TE.A1L("ClipsConstants.ARG_CLIPS_COMMENT_SHARE_MODEL", reelsVisualRepliesModel), AnonymousClass7TE.A1L("ClipsConstants.ARG_CLIPS_ACHIEVEMENTS_STICKER_URL", str));
            Activity activity2 = activity;
            LTL.A04(activity2, A1n, new FZF(activity, A002, userSession, 0), 2RR.A01(), activity.getColor(R.color.black), true);
            return;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable(AnonymousClass000.A00(210), r11);
        A0a.putString(AnonymousClass000.A00(212), r10.getId());
        A0a.putString(AnonymousClass000.A00(211), file.getCanonicalPath());
        A0a.putParcelable("ClipsConstants.ARG_CLIPS_SHARE_CELEBRATION_VIEW_MODEL", clipsCelebrationReshareViewModel);
        A0a.putParcelable(AnonymousClass000.A00(57), (Parcelable) null);
        A0a.putParcelable("ClipsConstants.ARG_CLIPS_COMMENT_SHARE_MODEL", reelsVisualRepliesModel);
        A0a.putString("ClipsConstants.ARG_CLIPS_ACHIEVEMENTS_STICKER_URL", str);
        AnonymousClass6W8.A02(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(916)).A0C(activity);
    }
}
