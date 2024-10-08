package X;

import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.FxAccountInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F6m  reason: case insensitive filesystem */
public final class C49779F6m {
    public static ConnectContent parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("fb_profile_pic_url".equals(A17)) {
                    r0.A00 = 16h.A00(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("fb_profile_name".equals(A17)) {
                        r0.A0D = AnonymousClass7TG.A0l(r4);
                    } else if ("connect_subtitle".equals(A17)) {
                        r0.A08 = AnonymousClass7TG.A0l(r4);
                    } else if ("connect_title".equals(A17)) {
                        r0.A09 = AnonymousClass7TG.A0l(r4);
                    } else if ("connect_footer".equals(A17)) {
                        r0.A07 = AnonymousClass7TG.A0l(r4);
                    } else if ("connect_button_label1".equals(A17)) {
                        r0.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("connect_button_label2".equals(A17)) {
                        r0.A06 = AnonymousClass7TG.A0l(r4);
                    } else if ("disclosure_title".equals(A17)) {
                        r0.A0C = AnonymousClass7TG.A0l(r4);
                    } else if ("disclosure_text".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                ContentText parseFromJson = Eo8.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A0I = arrayList;
                    } else if ("disclosure_button_label1".equals(A17)) {
                        r0.A0A = AnonymousClass7TG.A0l(r4);
                    } else if ("disclosure_button_label2".equals(A17)) {
                        r0.A0B = AnonymousClass7TG.A0l(r4);
                    } else if ("partial_screen_primary_button_label".equals(A17)) {
                        r0.A0F = AnonymousClass7TG.A0l(r4);
                    } else if ("partial_screen_toast_text".equals(A17)) {
                        r0.A0G = AnonymousClass7TG.A0l(r4);
                    } else if ("final_screen_toast_text".equals(A17)) {
                        r0.A0E = AnonymousClass7TG.A0l(r4);
                    } else if ("scroll_hint_text".equals(A17)) {
                        r0.A0H = AnonymousClass7TG.A0l(r4);
                    } else if ("ap".equals(A17)) {
                        r0.A04 = AnonymousClass7TG.A0l(r4);
                    } else if ("target_linked_accounts".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                FxAccountInfo parseFromJson2 = C49033EoD.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r0.A0J = arrayList;
                    } else if ("target_account".equals(A17)) {
                        r0.A03 = C49033EoD.parseFromJson(r4);
                    } else if ("age_restriction_screen".equals(A17)) {
                        r0.A01 = C49032EoC.parseFromJson(r4);
                    } else if ("initiator_account".equals(A17)) {
                        r0.A02 = C49033EoD.parseFromJson(r4);
                    } else {
                        1XY.A01(r4, r0, A17);
                    }
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
