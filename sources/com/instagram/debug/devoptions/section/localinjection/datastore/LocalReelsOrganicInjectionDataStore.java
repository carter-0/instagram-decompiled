package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.002;
import X.00k;
import X.0Yv;
import X.0qQ;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C13992Tns;
import X.Dba;
import android.content.Context;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class LocalReelsOrganicInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public Map getInjectionDataStore() {
        List A1P = 0sr.A1P(new LocalInjectionUnit.Item[]{new LocalInjectionUnit.Item("Photo", "clips_mixed_media_photo.json", LocalMediaInjectionConstants.ID_REELS_PHOTO), new LocalInjectionUnit.Item("Photo with Music", "clips_mixed_media_photo_with_music.json", LocalMediaInjectionConstants.ID_REELS_PHOTO_WITH_MUSIC), new LocalInjectionUnit.Item("Photo Carousel", "clips_mixed_media_photo_carousel.json", LocalMediaInjectionConstants.ID_REELS_PHOTO_CAROUSEL), new LocalInjectionUnit.Item("Video Carousel", "clips_mixed_media_video_carousel.json", LocalMediaInjectionConstants.ID_REELS_VIDEO_CAROUSEL), new LocalInjectionUnit.Item("Video && Photo Carousel", "clips_mixed_media_video_and_photo_carousel.json", LocalMediaInjectionConstants.ID_REELS_VIDEO_AND_PHOTO_CAROUSEL), new LocalInjectionUnit.Item("Carousel with Music", "clips_mixed_media_carousel_with_music.json", LocalMediaInjectionConstants.ID_REELS_CAROUSEL_WITH_MUSIC)});
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        int i = 0;
        for (Object next : A1P) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            LocalInjectionUnit.Item item = (LocalInjectionUnit.Item) next;
            A0p.add(new LocalInjectionUnit(C13992Tns.A0L(item), 002.A0R("reels_organic/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.REELS_ORGANIC));
            i = i2;
        }
        ArrayList A0T = 00k.A0T(new LocalInjectionUnit(LocalMediaInjectionConstants.ID_REELS_UNAVAILABLE, "", "Inject Unavailable Reel", LocalInjectionUnit.InjectionUnitType.REELS_ORGANIC), A0p);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(0Yv.A1E(A0T, 10)));
        Iterator it = A0T.iterator();
        while (it.hasNext()) {
            C13991Tnr.A1T(it, linkedHashMap);
        }
        return linkedHashMap;
    }

    public /* synthetic */ List getAllInjectionItems() {
        return Dba.A0e(getInjectionDataStore());
    }

    public List getInjectedJSONStrings(Context context, Set set) {
        AnonymousClass7TG.A1N(context, set);
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (!0qQ.A0K(next, LocalMediaInjectionConstants.ID_REELS_UNAVAILABLE)) {
                arrayList.add(next);
            }
        }
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, 00k.A0k(arrayList));
    }
}
