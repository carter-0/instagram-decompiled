package X;

import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public abstract class LPZ {
    public static final IGTVBrandedContentTags A00(String str) {
        if (str != null) {
            try {
                return C63296Kuf.parseFromJson(16P.A00(str));
            } catch (Throwable th) {
                0wb.A06("IGTVBrandedContentConverter", "Failed to deserialize Branded Content metadata in IGTV draft.", th);
            }
        }
        return null;
    }

    public static final String A02(IGTVBrandedContentTags iGTVBrandedContentTags) {
        if (iGTVBrandedContentTags != null) {
            try {
                StringWriter A0v = JTO.A0v();
                17W A0K = AnonymousClass7TF.A0K(A0v);
                if (iGTVBrandedContentTags.A01 != null) {
                    16P.A03(A0K, "branded_content_tags");
                    List list = iGTVBrandedContentTags.A01;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            BrandedContentTag A0l = JTO.A0l(it);
                            if (A0l != null) {
                                LJX.A00(A0K, A0l);
                            }
                        }
                        A0K.A0Y();
                        if (iGTVBrandedContentTags.A00 != null) {
                            A0K.A0q("branded_content_project_metadata");
                            LGt.A00(A0K, iGTVBrandedContentTags.A00);
                        }
                        return AnonymousClass7TG.A0k(A0K, A0v);
                    }
                }
                0qQ.A0F("brandedContentTags");
                throw AnonymousClass00P.createAndThrow();
            } catch (Throwable th) {
                0wb.A06("IGTVBrandedContentConverter", "Failed to serialize Branded Content metadata in IGTV draft.", th);
            }
        }
        return null;
    }

    public static String A01(1WE r3, C61035JvZ jvZ) {
        r3.ADa(27, jvZ.A0a ? 1 : 0);
        r3.ADa(28, jvZ.A0N ? 1 : 0);
        r3.ADa(29, jvZ.A0O ? 1 : 0);
        r3.ADa(30, jvZ.A0R ? 1 : 0);
        r3.ADa(31, jvZ.A0U ? 1 : 0);
        r3.ADa(32, jvZ.A0V ? 1 : 0);
        return A02(jvZ.A0F);
    }
}
