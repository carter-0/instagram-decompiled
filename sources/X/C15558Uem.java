package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Uem  reason: case insensitive filesystem */
public final class C15558Uem extends C231632rz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public C15558Uem(Context context, ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass7TG.A1O(context, reelDashboardFragment);
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        boolean booleanValue;
        int A03 = AnonymousClass0fD.A03(1098484079);
        AnonymousClass7TG.A1O(view, obj);
        C17700VcV vcV = (C17700VcV) obj;
        ReelDashboardFragment reelDashboardFragment = this.A01;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelViewerListMegaphoneViewBinder.Holder");
        C17635VbR vbR = (C17635VbR) tag;
        View view2 = vbR.A00;
        TextView textView = vbR.A05;
        TextView textView2 = vbR.A02;
        if (vcV.A09 != null) {
            1Av A002 = 1Au.A00(reelDashboardFragment.A06);
            String str = vcV.A09;
            0qQ.A0B(str, 0);
            String string = A002.A01.getString(002.A0R("reel_viewers_list_megaphone_item_id", str), (String) null);
            if (string != null) {
                0Aj A0e = AnonymousClass7TE.A0e(reelDashboardFragment.A05, "reel_viewer_dashboard_fb_viewers_nux_impression");
                A0e.AAJ("module", 002.A0R("reel_", "dashboard"));
                1Xv r0 = 1Xj.A0h;
                G9t.A1J(A0e, 1Xv.A06(string));
                A0e.Cgf();
            }
        }
        Boolean bool = vcV.A00;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            view2.setOnClickListener((View.OnClickListener) null);
            view2.setVisibility(8);
        } else {
            WBD.A00(view2, 15, vcV, reelDashboardFragment);
            view2.setVisibility(0);
        }
        if (!TextUtils.isEmpty(vcV.A08)) {
            textView.setText(vcV.A08);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(vcV.A02)) {
            textView2.setText(vcV.A02);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (vcV.A05 != null) {
            String str2 = vcV.A03;
            if (str2 != null) {
                if (str2.equals("button")) {
                    TextView textView3 = vbR.A03;
                    textView3.setVisibility(8);
                    textView3.setOnClickListener((View.OnClickListener) null);
                    IgButton igButton = vbR.A06;
                    igButton.setText(vcV.A04);
                    WBD.A00(igButton, 16, vcV, reelDashboardFragment);
                    igButton.setVisibility(0);
                } else if (str2.equals("link")) {
                    IgButton igButton2 = vbR.A06;
                    igButton2.setVisibility(8);
                    igButton2.setOnClickListener((View.OnClickListener) null);
                    TextView textView4 = vbR.A03;
                    WBD.A00(textView4, 17, vcV, reelDashboardFragment);
                    textView4.setVisibility(0);
                }
            }
        } else {
            TextView textView5 = vbR.A03;
            textView5.setOnClickListener((View.OnClickListener) null);
            IgButton igButton3 = vbR.A06;
            igButton3.setOnClickListener((View.OnClickListener) null);
            textView5.setVisibility(8);
            igButton3.setVisibility(8);
        }
        String str3 = vcV.A07;
        TextView textView6 = vbR.A04;
        if (str3 != null) {
            textView6.setVisibility(0);
            textView6.setText(vcV.A06);
            WBD.A00(textView6, 18, vcV, reelDashboardFragment);
        } else {
            textView6.setOnClickListener((View.OnClickListener) null);
            textView6.setVisibility(8);
        }
        String str4 = vcV.A01;
        TextView textView7 = vbR.A01;
        if (str4 != null) {
            textView7.setVisibility(0);
            textView7.setText(vcV.A01);
        } else {
            textView7.setVisibility(8);
        }
        AnonymousClass0fD.A0A(-1651143637, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1306046659);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_reel_megaphone);
        A0C.setTag(new C17635VbR(A0C));
        AnonymousClass0fD.A0A(-1428838083, A04);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
