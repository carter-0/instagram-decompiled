package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IVt  reason: case insensitive filesystem */
public final class C57284IVt implements JON, JOO, C254153s1 {
    public Integer A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ConstraintLayout A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final Map A08;
    public final View A09;
    public final UserSession A0A;
    public final Map A0B;

    public C57284IVt(View view, UserSession userSession) {
        0qQ.A0B(view, 2);
        this.A0A = userSession;
        this.A09 = AnonymousClass7TF.A0G(view, R.id.intent_aware_ad_grid_card_top_left);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.intent_aware_ad_grid_card_top_right);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.intent_aware_ad_grid_card_bottom_left);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.intent_aware_ad_grid_card_bottom_right);
        this.A04 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_grid_container);
        this.A06 = DbX.A0Z(view, R.id.intent_aware_ad_grid_see_all_button);
        this.A05 = DbX.A0Z(view, R.id.intent_aware_ad_grid_header_title);
        this.A07 = DbX.A0Z(view, R.id.intent_aware_ad_grid_sub_header_label);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        this.A08 = A1H;
        this.A0B = A1H;
    }

    public final View A00(int i) {
        Integer num = this.A00;
        if (num == null || num.intValue() != 33) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return this.A01;
                    }
                    if (i != 3) {
                        throw AnonymousClass7TE.A0z("Invalid position in grid multi ads");
                    }
                }
                return this.A03;
            }
            return this.A09;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass7TE.A0z("Invalid position in grid multi ads");
                }
            }
            return this.A03;
        }
        return this.A09;
        return this.A02;
    }

    public final Object BDh(1Xj r2) {
        return this.A08.get(r2);
    }

    public final Map BR4() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.intValue() != 33) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EuM() {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.A00
            r2 = 33
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            r1 = 3
            if (r0 == r2) goto L_0x000e
        L_0x000d:
            r1 = 4
        L_0x000e:
            int r5 = r1 + -1
            if (r5 < 0) goto L_0x0048
            r4 = 0
        L_0x0013:
            com.instagram.common.session.UserSession r3 = r6.A0A
            java.lang.Integer r2 = r6.A00
            android.view.View r0 = r6.A00(r4)
            X.IUM r1 = new X.IUM
            r1.<init>(r0)
            boolean r0 = X.I7D.A07(r3, r2)
            if (r0 == 0) goto L_0x003c
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A08
            X.C55047HbI.A00(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = r1.A0A
            X.C55047HbI.A00(r0)
            android.widget.Space r0 = r1.A03
        L_0x0032:
            android.view.View r0 = (android.view.View) r0
            X.C55047HbI.A00(r0)
            if (r4 == r5) goto L_0x0048
            int r4 = r4 + 1
            goto L_0x0013
        L_0x003c:
            boolean r0 = X.I7D.A08(r3, r2)
            if (r0 == 0) goto L_0x0045
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A09
            goto L_0x0032
        L_0x0045:
            com.instagram.common.ui.base.IgTextView r0 = r1.A0H
            goto L_0x0032
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57284IVt.EuM():void");
    }

    public final void ED9(int i) {
        I73.A03(A00(i));
    }
}
