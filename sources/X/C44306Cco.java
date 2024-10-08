package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cco  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44306Cco {
    public static Map A00(AnonymousClass3I8 r4) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Amd() != null) {
            A1H.put("challenge_id", r4.Amd());
        }
        if (r4.BLV() != null) {
            A1H.put("lat", AnonymousClass7TH.A0D(r4.BLV()));
        }
        if (r4.BNV() != null) {
            A1H.put("lng", AnonymousClass7TH.A0D(r4.BNV()));
        }
        String str2 = null;
        if (r4.BNj() != null) {
            LocationDictIntf BNj = r4.BNj();
            if (BNj != null) {
                treeUpdaterJNI = BNj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("location_dict", treeUpdaterJNI);
        }
        if (r4.getName() != null) {
            C41845B3m.A0z(r4.getName(), A1H);
        }
        if (r4.getPk() != null) {
            A1H.put("pk", r4.getPk());
        }
        if (r4.Bh3() != null) {
            ImageUrl Bh3 = r4.Bh3();
            if (Bh3 != null) {
                str = Bh3.getUrl();
            } else {
                str = null;
            }
            A1H.put("profile_pic_url", str);
        }
        if (r4.Bh5() != null) {
            A1H.put("profile_pic_username", r4.Bh5());
        }
        if (r4.getShortName() != null) {
            A1H.put("short_name", r4.getShortName());
        }
        if (r4.CAS() != null) {
            MultiAuthorStoryType CAS = r4.CAS();
            if (CAS != null) {
                str2 = CAS.A00;
            }
            C41845B3m.A11(str2, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
