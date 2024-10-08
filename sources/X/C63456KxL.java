package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.Map;

/* renamed from: X.KxL  reason: case insensitive filesystem */
public abstract class C63456KxL {
    public static void A00(AnonymousClass0iw r2, UserSession userSession, C62103Ka8 ka8, MediaTaggingInfo mediaTaggingInfo, C62630Kj1 kj1, MUJ muj, MVH mvh, Map map, boolean z, boolean z2, boolean z3) {
        ImageUrl imageUrl = mediaTaggingInfo.A02;
        if (imageUrl != null) {
            ka8.A00.setUrl(imageUrl, r2);
        }
        if (mediaTaggingInfo.A0H || imageUrl != null) {
            ka8.A02.A00 = LTZ.A00(mediaTaggingInfo);
        }
        TagsInteractiveLayout tagsInteractiveLayout = ka8.A01;
        tagsInteractiveLayout.A0H = z;
        tagsInteractiveLayout.removeAllViews();
        ka8.A01.setTags(mediaTaggingInfo, false, userSession);
        TagsInteractiveLayout tagsInteractiveLayout2 = ka8.A01;
        tagsInteractiveLayout2.A08 = mvh;
        tagsInteractiveLayout2.A06 = muj;
        tagsInteractiveLayout2.A0E = z2;
        tagsInteractiveLayout2.A0D = z3;
        tagsInteractiveLayout2.setEditingTagType(kj1);
        ka8.A00(LTZ.A02(mediaTaggingInfo, LOQ.A00.A01(userSession, mediaTaggingInfo.A07, false)));
        map.put(mediaTaggingInfo.A06, ka8.A01);
    }
}
