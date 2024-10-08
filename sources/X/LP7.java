package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class LP7 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgImageView A06;
    public AnonymousClass3Q2 A07;
    public SpinnerImageView A08;
    public Boolean A09;
    public final Context A0A;
    public final UserSession A0B;
    public final LE2 A0C;
    public final LPD A0D;
    public final C3499682q A0E;
    public final C66464MSs A0F;

    private void A00() {
        if (this.A06 == null) {
            View view = this.A01;
            if (view != null) {
                IgImageView A0F2 = DbY.A0F(view, R.id.info_button_view_stub);
                this.A06 = A0F2;
                A0F2.setColorFilter(R.color.baseline_neutral_80, PorterDuff.Mode.SRC_IN);
            } else {
                0wb.A03("ProductTagRowControllerImpl", "Trying to show infoButton before row is visible");
                return;
            }
        }
        this.A06.setVisibility(0);
    }

    public final void A01() {
        String A0e;
        String A0e2;
        if (this.A01 != null) {
            this.A02.getClass();
            this.A03.getClass();
            this.A00.getClass();
            boolean A032 = A03();
            View view = this.A01;
            if (!A032) {
                view.setAlpha(0.3f);
                this.A01.setOnClickListener((View.OnClickListener) null);
                this.A02.setVisibility(8);
                View view2 = this.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.A03.setVisibility(8);
            } else {
                if (view != null) {
                    view.setAlpha(1.0f);
                    C64273LXz.A00(this.A01, 57, this);
                }
                A02(false);
            }
            LPD lpd = this.A0D;
            if (lpd.A05()) {
                A00();
                L5A l5a = lpd.A01;
                l5a.getClass();
                A0e = l5a.A01;
                A0e2 = l5a.A00;
            } else {
                AnonymousClass3Q2 r0 = this.A07;
                if (r0 == null || !r0.CJe() || DbT.A0j(this.A0B).A1R()) {
                    0nA.A0O(this.A06);
                    return;
                }
                A00();
                BrandedContentTag A082 = this.A07.A08();
                A082.getClass();
                String str = A082.A02;
                Context context = this.A0A;
                A0e = AnonymousClass7TF.A0e(context.getResources(), str, 2131969868);
                A0e2 = AnonymousClass7TF.A0e(context.getResources(), str, 2131969867);
            }
            View view3 = this.A01;
            view3.getClass();
            AnonymousClass0fU.A00(new LXW(this, A0e, A0e2, 7), view3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r6 > 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        if (r0 == 0) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r8) {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r2 = r7.A0B
            X.82q r1 = r7.A0E
            int r6 = X.LTZ.A01(r2, r1)
            if (r8 == 0) goto L_0x0071
            X.Khv r0 = X.C62565Khv.A06
            java.util.ArrayList r0 = X.LTX.A01(r2, r1, r0)
            int r4 = r0.size()
            X.Khv r0 = X.C62565Khv.AUTO_PLACE
            java.util.ArrayList r0 = X.LTX.A01(r2, r1, r0)
            int r0 = r0.size()
            if (r6 > 0) goto L_0x0093
            if (r0 != 0) goto L_0x005d
        L_0x0022:
            if (r4 <= 0) goto L_0x005d
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x005c
            android.widget.TextView r3 = r7.A02
            if (r3 == 0) goto L_0x005c
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L_0x005c
            android.content.Context r2 = r7.A0A
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131820893(0x7f11015d, float:1.9274514E38)
            java.lang.String r0 = r1.getQuantityString(r0, r4)
            r3.setText(r0)
            android.widget.TextView r1 = r7.A02
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            X.DbT.A17(r2, r1, r0)
            android.widget.TextView r1 = r7.A02
            r0 = 0
            r1.setVisibility(r0)
        L_0x004e:
            android.widget.TextView r0 = r7.A03
            r1 = 8
        L_0x0052:
            r0.setVisibility(r1)
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r1)
        L_0x005c:
            return
        L_0x005d:
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x005c
            android.widget.TextView r2 = r7.A02
            if (r2 == 0) goto L_0x005c
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L_0x005c
            r1 = 8
            r2.setVisibility(r1)
            android.widget.TextView r0 = r7.A03
            goto L_0x0052
        L_0x0071:
            X.AnonymousClass7TG.A1N(r2, r1)
            java.util.Iterator r1 = X.JTP.A0w(r1)
            r4 = 0
        L_0x0079:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0091
            X.3Q2 r0 = X.JTS.A0U(r2, r1)
            if (r0 == 0) goto L_0x0079
            java.util.ArrayList r0 = r0.A43
            if (r0 == 0) goto L_0x008f
            int r0 = r0.size()
        L_0x008d:
            int r4 = r4 + r0
            goto L_0x0079
        L_0x008f:
            r0 = 0
            goto L_0x008d
        L_0x0091:
            if (r6 <= 0) goto L_0x0022
        L_0x0093:
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x005c
            android.widget.TextView r5 = r7.A02
            if (r5 == 0) goto L_0x005c
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L_0x005c
            android.content.Context r4 = r7.A0A
            android.content.res.Resources r3 = r4.getResources()
            r1 = 2131820863(0x7f11013f, float:1.9274453E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2 = 0
            java.lang.String r0 = X.DbV.A0v(r3, r0, r1, r6)
            r5.setText(r0)
            android.widget.TextView r1 = r7.A02
            int r0 = X.2Yu.A08(r4)
            X.DbT.A17(r4, r1, r0)
            android.widget.TextView r0 = r7.A02
            r0.setVisibility(r2)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LP7.A02(boolean):void");
    }

    public final boolean A03() {
        AnonymousClass3Q2 r0 = this.A07;
        if (r0 != null && r0.CJe() && !DbT.A0j(this.A0B).A1R()) {
            return false;
        }
        if (this.A0D.A06() || DbT.A0j(this.A0B).A1Q()) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        Boolean bool = this.A09;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        AnonymousClass3Q2 r0 = this.A07;
        if (r0 == null) {
            return false;
        }
        boolean A012 = LRu.A01(this.A0B, this.A0E, r0.A1G, "ProductTagRowControllerImpl", r0.A41);
        this.A09 = Boolean.valueOf(A012);
        return A012;
    }

    public LP7(Context context, UserSession userSession, C3499582p r5, LE2 le2, LPD lpd) {
        C65681Lxw lxw = new C65681Lxw(this, 2);
        this.A0F = lxw;
        this.A0A = context;
        this.A0B = userSession;
        this.A0E = r5.A00();
        this.A0C = le2;
        this.A0D = lpd;
        lpd.A00 = lxw;
    }
}
