package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CzJ  reason: case insensitive filesystem */
public final class C45607CzJ {
    public static C43808CEa parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                ArrayList arrayList = null;
                if ("alacorn_session_id".equals(A17)) {
                    r2.A02 = AnonymousClass7TG.A0l(r8);
                } else if ("dark_banner_message".equals(A17)) {
                    r2.A03 = AnonymousClass7TG.A0l(r8);
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            TrackOrOriginalSoundSchema parseFromJson = C44546Cgg.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r2.A04 = arrayList;
                } else if ("music_reels".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass3HX parseFromJson2 = AnonymousClass3HR.parseFromJson(r8);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r2.A05 = arrayList;
                } else if ("page_info".equals(A17)) {
                    r2.A00 = C44228Cap.parseFromJson(r8);
                } else {
                    1XY.A01(r8, r2, A17);
                }
                r8.A0z();
            }
            String str = r2.A02;
            String str2 = r2.A03;
            List list = r2.A04;
            0qQ.A0A(list);
            List list2 = r2.A05;
            BB1 bb1 = r2.A00;
            0qQ.A0A(bb1);
            r2.A01 = new C60933Jtr(bb1, str, str2, list, list2);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
