package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;

public final class AZ9 implements MTS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ RectF A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ 28D A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ ReelsVisualRepliesModel A06;
    public final /* synthetic */ ClipsCelebrationReshareViewModel A07;
    public final /* synthetic */ MusicOverlayStickerModel A08;
    public final /* synthetic */ File A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    public AZ9(Activity activity, RectF rectF, RectF rectF2, 28D r4, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, MusicOverlayStickerModel musicOverlayStickerModel, File file, String str, String str2, String str3, int i, boolean z) {
        this.A05 = userSession;
        this.A01 = activity;
        this.A04 = r4;
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A0B = str;
        this.A00 = i;
        this.A0D = z;
        this.A0C = str2;
        this.A07 = clipsCelebrationReshareViewModel;
        this.A06 = reelsVisualRepliesModel;
        this.A0A = str3;
        this.A08 = musicOverlayStickerModel;
        this.A09 = file;
    }

    public final void onFailure(Exception exc) {
        C59689JTv.A0C(this.A01, AnonymousClass000.A00(276));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        Bundle A0a = AnonymousClass7TE.A0a();
        28D r17 = this.A04;
        RectF rectF = this.A02;
        RectF rectF2 = this.A03;
        String str = this.A0B;
        int i = this.A00;
        boolean z = this.A0D;
        String str2 = this.A0C;
        ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = this.A07;
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A06;
        String str3 = this.A0A;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A08;
        File file2 = this.A09;
        A0a.putSerializable("ReelFeedPostShareFragment.ARGUMENTS_KEY_ENTRY_POINT", r17);
        A0a.putParcelable(AnonymousClass000.A00(468), rectF);
        A0a.putParcelable(AnonymousClass000.A00(469), rectF2);
        A0a.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_MEDIA_ID", str);
        A0a.putInt("ReelFeedPostShareFragment.ARGUMENTS_CAROUSEL_INDEX", i);
        A0a.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_FILE_PATH", file.getAbsolutePath());
        A0a.putBoolean("ARGUMENTS_MEDIA_SHARED_TO_FEED", z);
        A0a.putString(AnonymousClass000.A00(470), str2);
        A0a.putParcelable("celebration_reshare_view_model", clipsCelebrationReshareViewModel);
        A0a.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_TARGET_GROUP_PROFILE", (Parcelable) null);
        A0a.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_COMMENT_SHARE_MODEL", reelsVisualRepliesModel);
        A0a.putString("ReelFeedPostShareFragment.ARGUMENTS_ACHIEVEMENT_STICKER_URL", str3);
        A0a.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_MUSIC_METADATA", musicOverlayStickerModel);
        if (file2 != null) {
            A0a.putString("feed_post_share_media_file_path", file2.getAbsolutePath());
        }
        UserSession userSession = this.A05;
        Activity activity = this.A01;
        AnonymousClass6W8.A02(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(3217)).A0C(activity);
    }
}
