package X;

import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

public abstract class AHN {
    public static final MusicOverlayStickerModel A00(StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf) {
        String str;
        int i;
        boolean z;
        Integer AzJ;
        LEP lep = new LEP();
        lep.A08 = storyTemplateMusicStickerDictIntf.Ad0();
        lep.A09 = storyTemplateMusicStickerDictIntf.getAudioAssetId();
        lep.A06 = storyTemplateMusicStickerDictIntf.getAudioClusterId();
        StoryTemplateMusicAssetInfoDictIntf BUj = storyTemplateMusicStickerDictIntf.BUj();
        String str2 = null;
        if (BUj != null) {
            str = BUj.getCoverArtworkThumbnailUri();
        } else {
            str = null;
        }
        lep.A03 = new SimpleImageUrl(str);
        StoryTemplateMusicAssetInfoDictIntf BUj2 = storyTemplateMusicStickerDictIntf.BUj();
        if (BUj2 != null) {
            str2 = BUj2.getCoverArtworkUri();
        }
        lep.A02 = new SimpleImageUrl(str2);
        lep.A07 = "";
        StoryTemplateMusicAssetInfoDictIntf BUj3 = storyTemplateMusicStickerDictIntf.BUj();
        boolean z2 = false;
        if (BUj3 == null || (AzJ = BUj3.AzJ()) == null) {
            i = 0;
        } else {
            i = AzJ.intValue();
        }
        lep.A00 = i;
        StoryTemplateMusicAssetInfoDictIntf BUj4 = storyTemplateMusicStickerDictIntf.BUj();
        if (BUj4 != null) {
            z = AnonymousClass7TF.A1Y(BUj4.BBW(), true);
        } else {
            z = false;
        }
        lep.A0F = z;
        StoryTemplateMusicAssetInfoDictIntf BUj5 = storyTemplateMusicStickerDictIntf.BUj();
        if (BUj5 != null) {
            z2 = AnonymousClass7TF.A1Y(BUj5.CSt(), true);
        }
        lep.A0G = z2;
        StoryTemplateMusicAssetInfoDictIntf BUj6 = storyTemplateMusicStickerDictIntf.BUj();
        if (BUj6 != null) {
            String progressiveDownloadUrl = BUj6.getProgressiveDownloadUrl();
            if (progressiveDownloadUrl != null) {
                lep.A0B = progressiveDownloadUrl;
                StoryTemplateMusicAssetInfoDictIntf BUj7 = storyTemplateMusicStickerDictIntf.BUj();
                if (BUj7 != null) {
                    String title = BUj7.getTitle();
                    if (title != null) {
                        lep.A0C = title;
                        MusicAssetModel A00 = lep.A00();
                        MusicProduct musicProduct = MusicProduct.POST_CAPTURE_STICKER;
                        0qQ.A0A(A00);
                        return C59670JTa.A03(musicProduct, A00, Integer.valueOf(storyTemplateMusicStickerDictIntf.getOverlapDurationInMs()), Integer.valueOf(storyTemplateMusicStickerDictIntf.getAudioAssetStartTimeInMs()), AnonymousClass7TF.A0b());
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r0.intValue() < 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36319939967786812L) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r3 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r9, com.instagram.reels.prompt.model.PromptStickerModel r10) {
        /*
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r10.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r8 = r0.C1M()
            r7 = 1
            if (r8 == 0) goto L_0x00b0
            com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf r0 = r8.BV3()
            if (r0 == 0) goto L_0x0016
            boolean r1 = A02(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r6 = r0 ^ 1
            java.util.List r1 = r8.C1I()
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0091
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0091
        L_0x0029:
            r0 = 0
        L_0x002a:
            r5 = r0 ^ 1
            com.instagram.api.schemas.StoryTemplateAssetDictIntf r2 = r8.C4X()
            if (r2 == 0) goto L_0x008f
            com.instagram.model.mediasize.ImageInfo r0 = r2.BGO()
            r1 = 0
            if (r0 == 0) goto L_0x0056
            com.instagram.model.mediasize.ImageInfo r0 = r2.BGO()
            if (r0 == 0) goto L_0x0088
            java.util.List r0 = r0.Al9()
        L_0x0043:
            boolean r0 = X.C253833rU.A04(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.Integer r0 = r2.CHa()
            if (r0 == 0) goto L_0x0056
            int r0 = r0.intValue()
            r4 = 1
            if (r0 >= 0) goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            com.instagram.model.mediasize.ImageInfo r0 = r2.Aew()
            if (r0 == 0) goto L_0x008a
            com.instagram.model.mediasize.ImageInfo r0 = r2.Aew()
            if (r0 == 0) goto L_0x0067
            java.util.List r1 = r0.Al9()
        L_0x0067:
            boolean r0 = X.C253833rU.A04(r1)
            if (r0 != 0) goto L_0x008a
            r3 = 1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939967786812(0x8108cb000b1f3c, double:3.0322145120633405E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x008b
        L_0x007b:
            r0 = 1
        L_0x007c:
            r0 = r0 ^ 1
            r8.C0B()
            if (r6 == 0) goto L_0x00b0
            if (r5 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            return r7
        L_0x0088:
            r0 = r1
            goto L_0x0043
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r4 != 0) goto L_0x008f
            if (r3 == 0) goto L_0x007b
        L_0x008f:
            r0 = 0
            goto L_0x007c
        L_0x0091:
            java.util.Iterator r1 = r1.iterator()
        L_0x0095:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf r0 = (com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf) r0
            com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf r0 = r0.B9L()
            if (r0 == 0) goto L_0x0095
            boolean r0 = A01(r0)
            if (r0 != 0) goto L_0x0095
            r0 = 1
            goto L_0x002a
        L_0x00b0:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHN.A03(com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel):boolean");
    }

    public static final boolean A01(StoryTemplateGiphyStickerDictIntf storyTemplateGiphyStickerDictIntf) {
        StoryTemplateGiphyStickerImageDictIntf BFu;
        String url;
        StoryTemplateGiphyStickerImageDictIntf BFu2;
        String CGZ;
        Float A0q;
        StoryTemplateGiphyStickerImageDictIntf BFu3;
        String BCv;
        Float A0q2;
        String B9D = storyTemplateGiphyStickerDictIntf.B9D();
        if (B9D == null || B9D.length() <= 0 || (BFu = storyTemplateGiphyStickerDictIntf.BFu()) == null || (url = BFu.getUrl()) == null || url.length() <= 0 || (BFu2 = storyTemplateGiphyStickerDictIntf.BFu()) == null || (CGZ = BFu2.CGZ()) == null || (A0q = 012.A0q(CGZ)) == null || A0q.floatValue() <= 0.0f || (BFu3 = storyTemplateGiphyStickerDictIntf.BFu()) == null || (BCv = BFu3.BCv()) == null || (A0q2 = 012.A0q(BCv)) == null || A0q2.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static final boolean A02(StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf) {
        StoryTemplateMusicAssetInfoDictIntf BUj;
        String coverArtworkThumbnailUri;
        StoryTemplateMusicAssetInfoDictIntf BUj2;
        String coverArtworkUri;
        StoryTemplateMusicAssetInfoDictIntf BUj3;
        String progressiveDownloadUrl;
        StoryTemplateMusicAssetInfoDictIntf BUj4;
        String title;
        LyricsIntf BOn;
        List BcI;
        if (storyTemplateMusicStickerDictIntf.Ad0().length() <= 0 || storyTemplateMusicStickerDictIntf.getAudioAssetId().length() <= 0 || storyTemplateMusicStickerDictIntf.getAudioClusterId().length() <= 0 || (BUj = storyTemplateMusicStickerDictIntf.BUj()) == null || (coverArtworkThumbnailUri = BUj.getCoverArtworkThumbnailUri()) == null || coverArtworkThumbnailUri.length() <= 0 || (BUj2 = storyTemplateMusicStickerDictIntf.BUj()) == null || (coverArtworkUri = BUj2.getCoverArtworkUri()) == null || coverArtworkUri.length() <= 0 || (BUj3 = storyTemplateMusicStickerDictIntf.BUj()) == null || (progressiveDownloadUrl = BUj3.getProgressiveDownloadUrl()) == null || progressiveDownloadUrl.length() <= 0 || (BUj4 = storyTemplateMusicStickerDictIntf.BUj()) == null || (title = BUj4.getTitle()) == null || title.length() <= 0 || A11.A00(storyTemplateMusicStickerDictIntf.AyE()).A00().A01 == -1) {
            return false;
        }
        if (!A11.A00(storyTemplateMusicStickerDictIntf.AyE()).A02() || ((BOn = storyTemplateMusicStickerDictIntf.BOn()) != null && (BcI = BOn.BcI()) != null && AnonymousClass7TE.A1b(BcI))) {
            return true;
        }
        return false;
    }
}
