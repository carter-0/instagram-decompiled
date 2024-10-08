package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.common.session.UserSession;

/* renamed from: X.UeN  reason: case insensitive filesystem */
public final class C15534UeN extends C231632rz {
    public final Context A00;
    public final X8N A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15534UeN(Context context, X8N x8n, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = x8n;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int i2;
        View view2;
        int A032 = AnonymousClass0fD.A03(170014293);
        AnonymousClass7TG.A1O(view, obj);
        C17683VcE vcE = (C17683VcE) view.getTag();
        if (vcE != null) {
            AnonymousClass0iw r4 = this.A02;
            X8N x8n = this.A01;
            C21004X9b x9b = (C21004X9b) obj;
            C51973G9u.A0r(3, r4, x8n, x9b);
            C17715Vck vck = vcE.A07;
            Context context = vcE.A00;
            C18776W0z.A01(context, x8n, vck, x9b, r4);
            C17715Vck vck2 = vcE.A08;
            C21004X9b x9b2 = (C21004X9b) 00k.A0J(x9b.ByH());
            if (x9b2 != null) {
                C18776W0z.A01(context, x8n, vck2, x9b2, r4);
                vck.A01.setVisibility(0);
                vck.A0B.setText("A");
                vcE.A02.setVisibility(0);
                vck2.A01.setVisibility(0);
                vck2.A0B.setText("B");
                textView = vcE.A05;
                i2 = 2131976607;
            } else {
                vck2.A02.setVisibility(8);
                vck2.A00.setVisibility(8);
                vcE.A02.setVisibility(8);
                vck.A01.setVisibility(8);
                textView = vcE.A05;
                i2 = 2131976633;
            }
            textView.setText(i2);
            int i3 = 0;
            if (PromoteAdsManagerActionType.A00.A00(x9b) == PromoteAdsManagerActionType.DRAFT) {
                vcE.A03.setVisibility(8);
                view2 = vcE.A01;
            } else {
                View view3 = vcE.A03;
                view3.setVisibility(0);
                WBH.A01(view3, 28, x8n, x9b);
                if (x9b.CWA()) {
                    View view4 = vcE.A04;
                    view4.setVisibility(0);
                    WBH.A01(view4, 30, x8n, x9b);
                    if (x9b.BVy() > 0) {
                        vcE.A09.setVisibility(0);
                        TextView textView2 = vcE.A06;
                        textView2.setVisibility(0);
                        C13988Tno.A15(textView2, x9b.BVy());
                        AnonymousClass0fD.A0A(1047636026, A032);
                        return;
                    }
                    i3 = 8;
                    vcE.A09.setVisibility(8);
                    view2 = vcE.A06;
                } else {
                    view2 = vcE.A04;
                    i3 = 8;
                }
            }
            view2.setVisibility(i3);
            AnonymousClass0fD.A0A(1047636026, A032);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(1366293363, A032);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        int A04 = DbX.A04(viewGroup2, -458835979);
        Context context = this.A00;
        View A09 = DbW.A09(DbT.A0B(context), viewGroup2, R.layout.promotion_list_view, false);
        View A0G = AnonymousClass7TF.A0G(A09, R.id.ad_tools_view_insights_row);
        TextView A08 = C13991Tnr.A08(A0G, R.id.secondary_text);
        View A0G2 = AnonymousClass7TF.A0G(A09, R.id.new_leads_arrow);
        View A0G3 = AnonymousClass7TF.A0G(A09, R.id.boost_list_view_bottom_padding);
        A09.setTag(new C17683VcE(context, AnonymousClass7TF.A0G(A09, R.id.promotion_row_internal_separator_view), A0G, A0G2, A0G3, C13991Tnr.A08(A09, R.id.new_leads_count), A08, C18776W0z.A00(AnonymousClass7TF.A0G(A09, R.id.primary_promotion_row_view), AnonymousClass7TF.A0G(A09, R.id.primary_status_view)), C18776W0z.A00(AnonymousClass7TF.A0G(A09, R.id.secondary_promotion_row_view), AnonymousClass7TF.A0G(A09, R.id.secondary_status_view)), AnonymousClass7TF.A0G(A09, R.id.new_leads_blue_dot)));
        AnonymousClass0fD.A0A(2055401161, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
