package X;

import com.instagram.api.schemas.AudioBrowserCollectionType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CUi  reason: case insensitive filesystem */
public abstract class C44065CUi {
    public static C61095Jx6 parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            AudioBrowserCollectionType audioBrowserCollectionType = null;
            String str2 = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("collection_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    audioBrowserCollectionType = (AudioBrowserCollectionType) AudioBrowserCollectionType.A01.get(str);
                    if (audioBrowserCollectionType == null) {
                        audioBrowserCollectionType = AudioBrowserCollectionType.UNRECOGNIZED;
                    }
                } else if ("image_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("sub_items".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C42060BFn parseFromJson = CbV.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C61095Jx6(audioBrowserCollectionType, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
