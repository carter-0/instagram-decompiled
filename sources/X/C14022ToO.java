package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ToO  reason: case insensitive filesystem */
public abstract /* synthetic */ class C14022ToO {
    public static Map A00(SpritesheetInfo spritesheetInfo) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (spritesheetInfo.B5j() != null) {
            linkedHashMap.put("file_size_kb", spritesheetInfo.B5j());
        }
        if (spritesheetInfo.BPQ() != null) {
            linkedHashMap.put("max_thumbnails_per_sprite", spritesheetInfo.BPQ());
        }
        if (spritesheetInfo.Blq() != null) {
            linkedHashMap.put("rendered_width", spritesheetInfo.Blq());
        }
        if (spritesheetInfo.ByS() != null) {
            linkedHashMap.put("sprite_height", spritesheetInfo.ByS());
        }
        if (spritesheetInfo.ByT() != null) {
            List<ImageUrl> ByT = spritesheetInfo.ByT();
            if (ByT != null) {
                arrayList = new ArrayList();
                for (ImageUrl url : ByT) {
                    String url2 = url.getUrl();
                    if (url2 != null) {
                        arrayList.add(url2);
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("sprite_urls", arrayList);
        }
        if (spritesheetInfo.ByU() != null) {
            linkedHashMap.put("sprite_width", spritesheetInfo.ByU());
        }
        if (spritesheetInfo.C6u() != null) {
            linkedHashMap.put("thumbnail_duration", AnonymousClass7TH.A0D(spritesheetInfo.C6u()));
        }
        if (spritesheetInfo.C6w() != null) {
            linkedHashMap.put("thumbnail_height", spritesheetInfo.C6w());
        }
        if (spritesheetInfo.C77() != null) {
            linkedHashMap.put("thumbnail_width", spritesheetInfo.C77());
        }
        if (spritesheetInfo.C79() != null) {
            linkedHashMap.put("thumbnails_per_row", spritesheetInfo.C79());
        }
        if (spritesheetInfo.C8r() != null) {
            linkedHashMap.put("total_thumbnail_num_per_sprite", spritesheetInfo.C8r());
        }
        if (spritesheetInfo.CE8() != null) {
            linkedHashMap.put("video_length", AnonymousClass7TH.A0D(spritesheetInfo.CE8()));
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
