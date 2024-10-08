package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hcm  reason: case insensitive filesystem */
public abstract class C55138Hcm {
    public static C55853Hoa parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C55853Hoa hoa = new C55853Hoa();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("sections".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C295745oq parseFromJson = C295735op.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    hoa.A05 = arrayList;
                } else if ("next_max_id".equals(A17)) {
                    hoa.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("has_more".equals(A17)) {
                    hoa.A06 = r5.A0d();
                } else if (AnonymousClass000.A00(44).equals(A17)) {
                    r5.A0d();
                } else if ("rank_token".equals(A17)) {
                    hoa.A03 = AnonymousClass7TG.A0l(r5);
                } else {
                    if (DialogModule.KEY_TITLE.equals(A17)) {
                        if (r5.A11() == 16L.A0G) {
                        }
                    } else if ("grid_post_click_experience".equals(A17)) {
                        if (r5.A11() == 16L.A0G) {
                        }
                    } else if (C66579MXk.A00(386).equals(A17)) {
                        hoa.A00 = AnonymousClass7TG.A0l(r5);
                    } else if ("reels_page_index".equals(A17)) {
                        hoa.A04 = AnonymousClass7TG.A0l(r5);
                    } else if (AnonymousClass000.A00(3222).equals(A17)) {
                        hoa.A01 = AnonymousClass7TG.A0l(r5);
                    }
                    r5.A1P();
                }
                r5.A0z();
            }
            return hoa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
