package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VnB  reason: case insensitive filesystem */
public abstract class C18193VnB {
    public static UVA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("image_metadata".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            UVC parseFromJson = VBK.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("image_contents".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            UVB parseFromJson2 = VBJ.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r5.A0z();
            }
            return new UVA(arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, UVA uva) {
        r4.A0c();
        List list = uva.A01;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "image_metadata", list);
            while (A0s.hasNext()) {
                UVC uvc = (UVC) A0s.next();
                if (uvc != null) {
                    r4.A0c();
                    Integer num = uvc.A01;
                    if (num != null) {
                        r4.A0P("start_position", num.intValue());
                    }
                    Integer num2 = uvc.A00;
                    if (num2 != null) {
                        r4.A0P("length", num2.intValue());
                    }
                    String str = uvc.A02;
                    if (str != null) {
                        r4.A0R("image_id", str);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        List list2 = uva.A00;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r4, "image_contents", list2);
            while (A0s2.hasNext()) {
                UVB uvb = (UVB) A0s2.next();
                if (uvb != null) {
                    r4.A0c();
                    String str2 = uvb.A02;
                    if (str2 != null) {
                        r4.A0R("image_id", str2);
                    }
                    String str3 = uvb.A00;
                    if (str3 != null) {
                        r4.A0R("fallback_text", str3);
                    }
                    String str4 = uvb.A01;
                    if (str4 != null) {
                        r4.A0R("image_binary_base64", str4);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
