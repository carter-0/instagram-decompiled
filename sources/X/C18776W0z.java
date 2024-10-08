package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.W0z  reason: case insensitive filesystem */
public final class C18776W0z {
    public static final C18776W0z A00 = new Object();

    /* JADX WARNING: type inference failed for: r0v22, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r4, X.X8N r5, X.C17715Vck r6, X.C21004X9b r7, X.AnonymousClass0iw r8) {
        /*
            X.VeW r2 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A00
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = r2.A00(r7)
            int r0 = r0.ordinal()
            android.widget.TextView r1 = r6.A0A
            switch(r0) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x000f;
                case 2: goto L_0x000f;
                case 3: goto L_0x00ef;
                case 4: goto L_0x000f;
                case 5: goto L_0x00f7;
                case 6: goto L_0x000f;
                case 7: goto L_0x000f;
                case 8: goto L_0x00ff;
                case 9: goto L_0x0103;
                case 10: goto L_0x00eb;
                case 11: goto L_0x00f3;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r7
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r0 = r0.A0I
            r1.setText(r0)
        L_0x0017:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r2 = r2.A00(r7)
            int r0 = r2.ordinal()
            android.widget.TextView r1 = r6.A03
            switch(r0) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x0024;
                case 3: goto L_0x0024;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00c8;
                case 8: goto L_0x0024;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00dc;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = 2131970111(0x7f13483f, float:1.9577164E38)
        L_0x0027:
            r1.setText(r0)
            r0 = 4
            X.WB4.A00(r1, r2, r5, r7, r0)
            com.instagram.business.promote.model.InstagramMediaProductType r1 = r7.BHn()
            com.instagram.business.promote.model.InstagramMediaProductType r0 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            r3 = 8
            r2 = 0
            if (r1 != r0) goto L_0x00bf
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r6.A0C
            r1.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r6.A0D
        L_0x0040:
            r0.setVisibility(r3)
            com.instagram.common.typedurl.ImageUrl r0 = r7.C73()
            r1.setUrl(r0, r8)
            X.WBx r0 = X.C18904WBx.A00
            r1.setOnTouchListener(r0)
            r0 = 29
            X.WBH.A01(r1, r0, r5, r7)
            android.widget.TextView r1 = r6.A08
            com.instagram.business.promote.model.PromotionMetric r0 = r7.BSs()
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x010b
            r1.setText(r0)
            com.instagram.business.promote.model.PromotionMetric r0 = r7.BSs()
            java.lang.Integer r0 = r0.A00
            android.widget.TextView r3 = r6.A09
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "--"
        L_0x006d:
            r3.setText(r0)
            android.widget.TextView r1 = r6.A06
            r0 = 2131970163(0x7f134873, float:1.957727E38)
            r1.setText(r0)
            java.lang.String r3 = r7.B7l()
            java.lang.String r1 = r7.B7d()
            if (r3 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x00af
            r0 = 2131970164(0x7f134874, float:1.9577271E38)
            java.lang.String r1 = X.DbV.A0u(r4, r3, r1, r0)
        L_0x008b:
            X.0qQ.A0A(r1)
            android.widget.TextView r0 = r6.A07
            r0.setText(r1)
            android.widget.TextView r1 = r6.A04
            r0 = 2131970162(0x7f134872, float:1.9577267E38)
            r1.setText(r0)
            android.widget.TextView r1 = r6.A05
            java.lang.String r0 = r7.AdJ()
            r1.setText(r0)
            android.view.View r0 = r6.A02
            r0.setVisibility(r2)
            android.view.View r0 = r6.A00
            r0.setVisibility(r2)
            return
        L_0x00af:
            java.lang.String r1 = ""
            goto L_0x008b
        L_0x00b2:
            com.instagram.business.promote.model.PromotionMetric r0 = r7.BSs()
            java.lang.Integer r1 = r0.A00
            java.lang.String r0 = "%s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            goto L_0x006d
        L_0x00bf:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r6.A0D
            r1.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r6.A0C
            goto L_0x0040
        L_0x00c8:
            r0 = 2131970113(0x7f134841, float:1.9577168E38)
            goto L_0x0027
        L_0x00cd:
            r0 = 2131970108(0x7f13483c, float:1.9577158E38)
            goto L_0x0027
        L_0x00d2:
            r0 = 2131970112(0x7f134840, float:1.9577166E38)
            goto L_0x0027
        L_0x00d7:
            r0 = 2131970110(0x7f13483e, float:1.9577162E38)
            goto L_0x0027
        L_0x00dc:
            r0 = 2131962478(0x7f132a6e, float:1.9561682E38)
            goto L_0x0027
        L_0x00e1:
            r0 = 2131970538(0x7f1349ea, float:1.957803E38)
            goto L_0x0027
        L_0x00e6:
            r0 = 2131970114(0x7f134842, float:1.957717E38)
            goto L_0x0027
        L_0x00eb:
            r0 = 2131970167(0x7f134877, float:1.9577277E38)
            goto L_0x0106
        L_0x00ef:
            r0 = 2131970166(0x7f134876, float:1.9577275E38)
            goto L_0x0106
        L_0x00f3:
            r0 = 2131970169(0x7f134879, float:1.9577281E38)
            goto L_0x0106
        L_0x00f7:
            r0 = 2131970161(0x7f134871, float:1.9577265E38)
            goto L_0x0106
        L_0x00fb:
            r0 = 2131970692(0x7f134a84, float:1.9578342E38)
            goto L_0x0106
        L_0x00ff:
            r0 = 2131970168(0x7f134878, float:1.957728E38)
            goto L_0x0106
        L_0x0103:
            r0 = 2131970165(0x7f134875, float:1.9577273E38)
        L_0x0106:
            r1.setText(r0)
            goto L_0x0017
        L_0x010b:
            java.lang.String r0 = "metricName"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18776W0z.A01(android.content.Context, X.X8N, X.Vck, X.X9b, X.0iw):void");
    }

    public static final C17715Vck A00(View view, View view2) {
        View view3 = view;
        View A0G = AnonymousClass7TF.A0G(view, R.id.thumbnail_circular_text_container_view);
        TextView A08 = C13991Tnr.A08(view, R.id.thumbnail_circular_text_view);
        TextView A082 = C13991Tnr.A08(view3, R.id.promotion_metric_label);
        TextView A083 = C13991Tnr.A08(view3, R.id.promotion_metric_value);
        TextView A084 = C13991Tnr.A08(view3, R.id.promotion_budget_label);
        TextView A085 = C13991Tnr.A08(view3, R.id.promotion_budget_value);
        TextView A086 = C13991Tnr.A08(view3, R.id.promotion_audience_label);
        TextView A087 = C13991Tnr.A08(view3, R.id.promotion_audience_value);
        return new C17715Vck(view3, view2, A0G, C13991Tnr.A08(view2, R.id.boost_status), C13991Tnr.A08(view2, R.id.boost_action_button), A08, A082, A083, A084, A085, A086, A087, (RoundedCornerImageView) AnonymousClass7TF.A0G(view, R.id.promotion_thumbnail), (RoundedCornerImageView) AnonymousClass7TF.A0G(view, R.id.story_promotion_thumbnail));
    }
}
