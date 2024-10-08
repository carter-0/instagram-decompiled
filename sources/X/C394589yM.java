package X;

import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import java.util.List;

/* renamed from: X.9yM  reason: invalid class name and case insensitive filesystem */
public abstract class C394589yM {
    public static final StoryTemplateAssetDict A00(String str, String str2, String str3, int i) {
        return new StoryTemplateAssetDict(new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, (List) null, (List) null), new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, (List) null, (List) null), (Boolean) null, Integer.valueOf(i), 0, str, str2, str3);
    }
}
