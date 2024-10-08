package X;

import com.instagram.infocenter.model.ShareInfo;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VEH {
    public static ShareInfo parseFromJson(16F r8) {
        Integer num;
        0qQ.A0B(r8, 0);
        try {
            ShareInfo shareInfo = new ShareInfo();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("info_center_type".equals(A17)) {
                    shareInfo.A05 = VEC.A00(r8.A1Q());
                } else if (AnonymousClass000.A00(1511).equals(A17)) {
                    shareInfo.A0D = r8.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A1E(A17)) {
                        shareInfo.A0A = AnonymousClass7TG.A0l(r8);
                    } else if ("subtitle".equals(A17)) {
                        shareInfo.A08 = AnonymousClass7TG.A0l(r8);
                    } else if ("text_color".equals(A17)) {
                        shareInfo.A09 = AnonymousClass7TG.A0l(r8);
                    } else if (AnonymousClass000.A00(2712).equals(A17)) {
                        shareInfo.A06 = AnonymousClass7TG.A0l(r8);
                    } else if ("background_gradient".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r8.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r8, arrayList);
                            }
                        }
                        shareInfo.A0B = arrayList;
                    } else if ("card_gradient".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r8.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r8, arrayList);
                            }
                        }
                        shareInfo.A0C = arrayList;
                    } else if ("background_image".equals(A17)) {
                        shareInfo.A01 = 16W.parseFromJson(r8);
                    } else if ("logo_image".equals(A17)) {
                        shareInfo.A02 = 16W.parseFromJson(r8);
                    } else if ("gradient_orientation".equals(A17)) {
                        String A1Q = r8.A1Q();
                        0qQ.A0B(A1Q, 0);
                        Integer[] A00 = AnonymousClass05K.A00(4);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                num = null;
                                break;
                            }
                            num = A00[i];
                            if (0qQ.A0K(VEB.A00(num), A1Q)) {
                                break;
                            }
                            i++;
                        }
                        shareInfo.A04 = num;
                    } else if (AnonymousClass000.A00(3271).equals(A17)) {
                        shareInfo.A00 = 16h.A00(r8);
                    } else if ("story_background_image".equals(A17)) {
                        shareInfo.A03 = 16W.parseFromJson(r8);
                    } else if ("deep_link_url".equals(A17)) {
                        shareInfo.A07 = AnonymousClass7TG.A0l(r8);
                    }
                }
                r8.A0z();
            }
            return shareInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
