package X;

import java.io.IOException;

/* renamed from: X.Cp8  reason: case insensitive filesystem */
public abstract class C45030Cp8 {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CwF, java.lang.Object] */
    public static C45435CwF parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("about_this_shop_content".equals(A17)) {
                    obj.A02 = C45025Cp3.parseFromJson(r3);
                } else if ("bloks_content".equals(A17)) {
                    obj.A04 = C45027Cp5.parseFromJson(r3);
                } else if ("checkout_button_content".equals(A17)) {
                    obj.A05 = C45029Cp7.parseFromJson(r3);
                } else if ("details_link_content".equals(A17)) {
                    obj.A06 = C45031Cp9.parseFromJson(r3);
                } else if ("set_reminder_and_save_button_content".equals(A17)) {
                    obj.A00 = C45054CpX.parseFromJson(r3);
                } else if (Pxd.A00(659).equals(A17)) {
                    obj.A08 = C45035CpD.parseFromJson(r3);
                } else if ("hero_carousel_content".equals(A17)) {
                    obj.A09 = C45036CpE.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1551).equals(A17)) {
                    obj.A0A = C45042CpL.parseFromJson(r3);
                } else if ("media_content".equals(A17)) {
                    obj.A0B = C45044CpN.parseFromJson(r3);
                } else if ("description_content".equals(A17)) {
                    obj.A0C = C45045CpO.parseFromJson(r3);
                } else if ("product_feed_content".equals(A17)) {
                    obj.A0D = C45046CpP.parseFromJson(r3);
                } else if ("shop_content".equals(A17)) {
                    obj.A0F = C45049CpS.parseFromJson(r3);
                } else if (AnonymousClass000.A00(4097).equals(A17)) {
                    obj.A0G = C45050CpT.parseFromJson(r3);
                } else if ("seller_badge_content".equals(A17)) {
                    obj.A0E = C45048CpR.parseFromJson(r3);
                } else if ("ar_content".equals(A17)) {
                    obj.A0H = C45051CpU.parseFromJson(r3);
                } else if ("boolean_content".equals(A17)) {
                    obj.A03 = C45026Cp4.parseFromJson(r3);
                } else if ("featured_product_permission_content".equals(A17)) {
                    obj.A07 = C45034CpC.parseFromJson(r3);
                } else if (AnonymousClass000.A00(639).equals(A17)) {
                    obj.A01 = C63336KvJ.parseFromJson(r3);
                } else if ("view_insights_content".equals(A17)) {
                    obj.A0I = C45052CpV.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
