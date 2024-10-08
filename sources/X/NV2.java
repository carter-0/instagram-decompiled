package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

public final class NV2 extends C68058MzP {
    public final UserSession A00;
    public final OLM A01;
    public final OWC A02;
    public final C71859Os0 A03 = new Object();

    public final void A01(NVH nvh) {
        super.A01(nvh);
        N3F n3f = nvh.A01;
        OWC owc = this.A02;
        C252063oV r4 = owc.A0L;
        TextView textView = (TextView) r4.getView();
        textView.setVisibility(0);
        User user = n3f.A02;
        if (user != null) {
            AnonymousClass0eM r9 = owc.A0Q;
            IgImageView igImageView = (IgImageView) AnonymousClass7TE.A14(r9);
            View view = owc.A0D.getView();
            C71859Os0 os0 = this.A03;
            AnonymousClass7TG.A1U(igImageView, view, os0);
            DbU.A1S(os0, igImageView, user);
            view.setVisibility(0);
            if (182.A06(0Tu.A05, this.A00, 36319407398067575L)) {
                textView.setVisibility(0);
                DbU.A1H(textView, user);
                C71405Ok4.A01(textView, 28, user, this);
                C71405Ok4.A01(AnonymousClass7TH.A06(r9), 29, user, this);
            }
        }
        C252063oV r7 = owc.A0F;
        IgTextView view2 = r7.getView();
        String str = n3f.A06;
        if (str != null) {
            C66580MXl.A1Q(r7, 0);
            view2.setText(str);
            C63237Kti.A00(view2);
        }
        boolean BCL = nvh.BCL();
        TextView textView2 = (TextView) owc.A0I.getView();
        Context context = textView2.getContext();
        DbY.A11(textView2, context);
        if (BCL) {
            textView2.setVisibility(0);
            textView2.setText(2131960074);
        } else {
            Integer num = n3f.A04;
            if (num != null) {
                textView2.setText(1G0.A05(context, (double) num.intValue(), false));
                textView2.setVisibility(0);
            }
        }
        boolean BCL2 = nvh.BCL();
        View view3 = r4.getView();
        View view4 = r7.getView();
        View view5 = owc.A0D.getView();
        float f = 1.0f;
        if (BCL2) {
            f = 0.6f;
        }
        view5.setAlpha(f);
        view3.setAlpha(f);
        view4.setAlpha(f);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Os0, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NV2(android.view.View r8, com.instagram.common.session.UserSession r9, X.OLM r10, int r11, boolean r12) {
        /*
            r7 = this;
            X.OWC r4 = new X.OWC
            r2 = r8
            r4.<init>(r8, r9)
            r3 = r10
            X.AnonymousClass7TG.A1O(r9, r10)
            r1 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A00 = r9
            r7.A01 = r10
            r7.A02 = r4
            X.Os0 r0 = new X.Os0
            r0.<init>()
            r7.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NV2.<init>(android.view.View, com.instagram.common.session.UserSession, X.OLM, int, boolean):void");
    }
}
