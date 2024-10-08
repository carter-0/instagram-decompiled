package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5Ao  reason: invalid class name and case insensitive filesystem */
public abstract class C282015Ao {
    public static StoryTemplateFillableStickersDictImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            StoryTemplateFillableMusicStickerDictImpl storyTemplateFillableMusicStickerDictImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("fillable_gallery_stickers".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            StoryTemplateFillableGalleryStickerDictImpl parseFromJson = C393549wc.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fillable_music_sticker".equals(A0q)) {
                    storyTemplateFillableMusicStickerDictImpl = C44451Cf9.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new StoryTemplateFillableStickersDictImpl(storyTemplateFillableMusicStickerDictImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
