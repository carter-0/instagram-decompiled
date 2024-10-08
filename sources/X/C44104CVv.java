package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CVv  reason: case insensitive filesystem */
public abstract class C44104CVv {
    public static N37 parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            Integer num = null;
            Integer num2 = null;
            C68156N2w n2w = null;
            User user = null;
            String str2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                if (C41846B3n.A1Y(r13, A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = 1dH.parseFromJson(r13);
                } else if ("is_dash_eligible".equals(A0q)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if (C41845B3m.A1O(A0q)) {
                    num2 = AnonymousClass7TF.A0X(r13);
                } else if ("preview_url_info".equals(A0q)) {
                    n2w = C44108CVz.parseFromJson(r13);
                } else if (C41845B3m.A1B(A0q)) {
                    user = C41845B3m.A0a(r13, false);
                } else if ("video_dash_manifest".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("video_duration".equals(A0q)) {
                    num3 = AnonymousClass7TF.A0X(r13);
                } else if ("video_versions".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C68157N2x parseFromJson = C393349wI.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r13.A0z();
            }
            return new N37(n2w, imageInfoImpl, user, num, num2, num3, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
