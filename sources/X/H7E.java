package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class H7E extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C55624Hkj A02;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r10, X.C249703kE r11) {
        /*
            r9 = this;
            X.IOQ r10 = (X.IOQ) r10
            X.GjF r11 = (X.C53143GjF) r11
            X.AnonymousClass7TG.A1N(r10, r11)
            com.instagram.common.session.UserSession r2 = r9.A01
            X.0iw r8 = r9.A00
            X.Hkj r3 = r9.A02
            X.C51974G9v.A1M(r2, r8, r3)
            android.view.View r1 = r11.A01
            r0 = 7
            X.ID0.A00(r1, r3, r11, r10, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r11.A05
            com.instagram.model.direct.DirectShareTarget r4 = r10.A00
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r2)
            java.util.List r0 = r4.A0Q
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.A0S()
            r7 = 0
            X.34S r6 = X.AnonymousClass3UE.A02(r7, r1, r7, r0)
            com.instagram.common.typedurl.ImageUrl r0 = X.OXB.A02(r2, r4)
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r4.A0M()
            if (r0 != 0) goto L_0x003c
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x00b2
        L_0x003c:
            java.lang.Object r1 = r6.A00
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r0 = r6.A01
            if (r0 == 0) goto L_0x00b2
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r5.A0G(r7, r8, r1, r0)
            android.content.Context r1 = r5.getContext()
            int r0 = X.2Yu.A0C(r1)
            int r0 = r1.getColor(r0)
            r5.setBackgroundRingColor(r0)
        L_0x005a:
            r0 = 0
            r5.setGradientSpinnerVisible(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.String r6 = X.AnonymousClass50n.A03(r4, r0)
            X.0qQ.A07(r6)
            com.instagram.common.ui.base.IgTextView r0 = r11.A02
            r0.setText(r6)
            com.instagram.common.ui.base.IgTextView r5 = r11.A03
            android.content.Context r1 = r11.A00
            r0 = 6
            android.text.SpannableStringBuilder r0 = X.C49751F5c.A00(r1, r2, r4, r6, r0)
            r5.setText(r0)
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L_0x0086
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008b
        L_0x0086:
            r0 = 8
            r5.setVisibility(r0)
        L_0x008b:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r11.A04
            android.content.Context r1 = r2.getContext()
            r0 = 2131956263(0x7f131227, float:1.9549077E38)
            X.DbU.A12(r1, r2, r0)
            java.lang.String r1 = r4.A09()
            X.0qQ.A07(r1)
            X.HmG r0 = r3.A01
            com.instagram.model.direct.DirectShareTarget r0 = r0.A00
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = r0.A09()
        L_0x00a8:
            boolean r0 = r1.equals(r0)
            r2.setChecked(r0)
            return
        L_0x00b0:
            r0 = 0
            goto L_0x00a8
        L_0x00b2:
            java.lang.Object r0 = r6.A00
            if (r0 == 0) goto L_0x005a
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
        L_0x00b8:
            r5.A0F(r7, r8, r0)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7E.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return IOQ.class;
    }

    public H7E(AnonymousClass0iw r1, UserSession userSession, C55624Hkj hkj) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = hkj;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53143GjF(DbT.A0D(layoutInflater, viewGroup, R.layout.new_collab_collection_target_thread_row, false));
    }
}
