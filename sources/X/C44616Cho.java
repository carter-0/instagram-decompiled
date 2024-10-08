package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cho  reason: case insensitive filesystem */
public abstract class C44616Cho {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.CwE, java.lang.Object] */
    public static C45434CwE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (C41845B3m.A1J(A17)) {
                    obj.A0A = AnonymousClass7TG.A0l(r5);
                } else if ("netego_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A0C = A0l;
                } else if ("item_type".equals(A17)) {
                    obj.A04 = AnonymousClass7TF.A0X(r5);
                } else if (C41845B3m.A1W(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    obj.A0E = A0l2;
                } else if ("background_media".equals(A17)) {
                    obj.A02 = 1Xj.A00(r5);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A0D = AnonymousClass7TG.A0l(r5);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    obj.A0B = AnonymousClass7TG.A0l(r5);
                } else if ("button_text".equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r5);
                } else if ("button_bloks_action".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("button_bloks_params".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r5);
                } else if ("has_dismiss".equals(A17)) {
                    obj.A0G = r5.A0d();
                } else if ("client_gap_rules".equals(A17)) {
                    obj.A03 = C250043ko.parseFromJson(r5);
                } else if ("icon_url".equals(A17)) {
                    obj.A09 = AnonymousClass7TG.A0l(r5);
                } else if ("brs_threshold".equals(A17)) {
                    obj.A05 = AnonymousClass7TF.A0Z(r5);
                } else if ("netego_service_client_dict".equals(A17)) {
                    obj.A00 = C44232Cat.parseFromJson(r5);
                } else if ("clips".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1F(r5, arrayList);
                        }
                    }
                    obj.A0F = arrayList;
                } else if ("threads_in_reels_unit_info_dict".equals(A17)) {
                    obj.A01 = C44617Chp.parseFromJson(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
