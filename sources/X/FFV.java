package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;

public abstract class FFV {
    public static final void A02(Activity activity, RectF rectF, RectF rectF2, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r17, String str, String str2, int i, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Activity activity2 = activity;
        1Xj r10 = r17;
        AnonymousClass7TF.A1B(activity, 1, r10);
        RectF rectF3 = rectF;
        0qQ.A0B(rectF, 5);
        1Xj r1 = r10;
        RectF rectF4 = rectF2;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        boolean z2 = z;
        if ((!r10.A5D() || (r1 = r10.A1c(i2)) != null) && r1.CeS() && r10.A1v() != ProductType.IGTV && r10.A1v() != ProductType.CLIPS) {
            A01(activity2, rectF3, rectF4, 28D.A2o, userSession2, (ReelsVisualRepliesModel) null, r10, str3, str4, i2, z2);
        } else {
            A00(activity2, rectF3, rectF4, 28D.A2o, userSession2, (ReelsVisualRepliesModel) null, clipsCelebrationReshareViewModel, r10, (File) null, str3, str4, i2, z2);
        }
    }

    public static final void A03(Activity activity, RectF rectF, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        C48898Ely.A00(userSession, 1ES.A01(), new C50438Fbl(activity, rectF, userSession, str2, str), str);
    }

    public static final void A00(Activity activity, RectF rectF, RectF rectF2, 28D r26, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r30, File file, String str, String str2, int i, boolean z) {
        ExtendedImageUrl A1n;
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        AnonymousClass7TG.A1S(rectF3, rectF4);
        28D r7 = r26;
        0qQ.A0B(r7, 7);
        UserSession userSession2 = userSession;
        AnonymousClass9PJ.A00(userSession2).A07(r7, true);
        1Xj r2 = r30;
        MusicOverlayStickerModel A03 = C271404in.A03(MusicProduct.MUSIC_IN_FEED, r2, 15000);
        if (A03 == null || !182.A06(0Tu.A05, userSession2, 36326163374683714L)) {
            A03 = null;
        }
        Activity activity2 = activity;
        int i2 = i;
        if (r2.A5D()) {
            1Xj A1c = r2.A1c(i2);
            if (A1c != null) {
                A1n = A1c.A1n(activity2);
            }
            0wb.A03("ReelFeedPostShareHelper", "No url for media item");
            C59689JTv.A0B(activity2, "sizedTypedUrl is null");
        }
        A1n = r2.A1n(activity2);
        if (A1n != null) {
            LTL.A04(activity2, A1n, new AZ9(activity2, rectF3, rectF4, r7, userSession2, reelsVisualRepliesModel, clipsCelebrationReshareViewModel, A03, file, r2.getId(), str, str2, i2, z), 2RR.A01(), DbU.A01(activity2), false);
            return;
        }
        0wb.A03("ReelFeedPostShareHelper", "No url for media item");
        C59689JTv.A0B(activity2, "sizedTypedUrl is null");
    }

    public static final void A01(Activity activity, RectF rectF, RectF rectF2, 28D r21, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, 1Xj r24, String str, String str2, int i, boolean z) {
        1Xj r8 = r24;
        1Xj r1 = r8;
        int i2 = i;
        if (r8.A5D()) {
            r1 = r8.A1c(i2);
        }
        String str3 = null;
        Activity activity2 = activity;
        AnonymousClass6ST r9 = new AnonymousClass6ST(activity2, true);
        DbX.A15(activity2, r9);
        if (r1 != null) {
            str3 = r1.A2U();
        }
        UserSession userSession2 = userSession;
        C290815g0 A03 = C59730JVo.A03(activity2, userSession2, new C11211SFl(str3, "ReelFeedPostShareHelper", true, false, false));
        A03.A00 = new EHV(activity2, rectF, rectF2, r21, userSession2, reelsVisualRepliesModel, r8, r9, str, str2, i2, z);
        1ES.A03(A03);
    }
}
