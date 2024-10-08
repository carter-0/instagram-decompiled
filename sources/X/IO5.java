package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class IO5 implements 1wn, AnonymousClass2xU {
    public String A00;
    public String A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final IgSimpleImageView A05;
    public final C55846HoT A06;
    public final UserSession A07;
    public final IgTextView A08;

    public IO5(View view, UserSession userSession, boolean z) {
        0qQ.A0B(view, 2);
        this.A07 = userSession;
        this.A04 = view;
        this.A08 = DbX.A0Z(view, R.id.title_text);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.row_feed_cta_overlay);
        this.A05 = DbX.A0Y(view, R.id.chevron_icon);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.edit_button);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A06 = new C55846HoT(2Yu.A0F(A0S, R.attr.textColorPrimary), 2Yu.A0F(A0S, R.attr.ctaPressedColorNormal), 2Yu.A0F(A0S, R.attr.inverseBackgroundColorPrimary), 2Yu.A0F(A0S, R.attr.textColorPrimary), 2Yu.A0F(A0S, R.attr.ctaPressedColorNormal), 2Yu.A0F(A0S, R.attr.ctaPressedColorNormal), A0S.getColor(z ? R.color.grey_2 : R.color.grey_9));
    }

    public final void DQp(AnonymousClass3W1 r2, int i) {
        0qQ.A0B(r2, 0);
        if (i == 5) {
            A00(r2);
        }
    }

    public final void A00(AnonymousClass3W1 r4) {
        View view;
        int i;
        boolean z = r4.A29;
        IgTextView igTextView = this.A08;
        C55846HoT hoT = this.A06;
        if (z) {
            igTextView.setTextColor(hoT.A05);
            this.A05.setColorFilter(hoT.A01);
            view = this.A04;
            i = hoT.A00;
        } else {
            igTextView.setTextColor(hoT.A06);
            this.A05.setColorFilter(hoT.A02);
            view = this.A04;
            i = 0;
        }
        view.setBackgroundColor(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (X.182.A01(X.0Tu.A05, r9.A07, 36608797992556293L) == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0004
            r9.A01 = r10
        L_0x0004:
            android.view.View r0 = r9.A04
            android.content.Context r8 = r0.getContext()
            java.lang.String r7 = r9.A01
            if (r7 == 0) goto L_0x002e
            com.instagram.common.ui.base.IgTextView r6 = r9.A08
            if (r11 != 0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r9.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36608797992556293(0x820f8200001705, double:3.214889490065466E-306)
            long r4 = X.182.A01(r2, r3, r0)
            r2 = 1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 2131954208(0x7f130a20, float:1.9544909E38)
            if (r1 != 0) goto L_0x002b
        L_0x0028:
            r0 = 2131954216(0x7f130a28, float:1.9544925E38)
        L_0x002b:
            X.DbX.A13(r8, r6, r7, r0)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IO5.A01(java.lang.String, boolean):void");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1118573335);
        C57070INk iNk = (C57070INk) obj;
        int A0D = AnonymousClass7TG.A0D(iNk, -1312963382);
        if (0qQ.A0K(iNk.A00, this.A00)) {
            A01((String) null, iNk.A01);
        }
        AnonymousClass0fD.A0A(-1714761387, A0D);
        AnonymousClass0fD.A0A(-394617739, A032);
    }
}
