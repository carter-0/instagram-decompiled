package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.JlH  reason: case insensitive filesystem */
public final class C60424JlH extends 2Rw {
    public AnonymousClass0iw A00;
    public List A01 = 0sn.A00;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C20654Wwm.A00);

    public C60424JlH(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A00(List list) {
        0qQ.A0B(list, 0);
        this.A01 = list;
        notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025c, code lost:
        if (r0 != null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        if (r0 != null) goto L_0x01ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r11, int r12) {
        /*
            r10 = this;
            r4 = 0
            X.0qQ.A0B(r11, r4)
            java.util.List r0 = r10.A01
            java.lang.Object r2 = r0.get(r12)
            X.MSZ r2 = (X.MSZ) r2
            r0 = 14
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r0)
            int r1 = r11.mItemViewType
            int r0 = X.JTO.A0A(r0, r1)
            java.lang.String r5 = "Required value was null."
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x019c;
                case 2: goto L_0x0264;
                case 3: goto L_0x0363;
                case 4: goto L_0x02b1;
                case 5: goto L_0x0028;
                case 6: goto L_0x02cd;
                case 7: goto L_0x0034;
                case 8: goto L_0x00bc;
                case 9: goto L_0x0040;
                case 10: goto L_0x0142;
                case 11: goto L_0x02dd;
                case 12: goto L_0x0320;
                case 13: goto L_0x0339;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = 28
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x0028:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsHScrollRowViewModel"
            X.0qQ.A0C(r2, r0)
            java.lang.String r0 = "getAdapter"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0034:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsMerchantHScrollRowViewModel"
            X.0qQ.A0C(r2, r0)
            java.lang.String r0 = "getSuggestedShops"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0040:
            X.Jp1 r11 = (X.C60654Jp1) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.fanclub.settings.viewmodel.FanClubSettingsRecommendationViewModel"
            X.0qQ.A0C(r2, r0)
            X.LuA r2 = (X.C65486LuA) r2
            X.0iw r3 = r10.A00
            if (r3 == 0) goto L_0x00b7
            X.0qQ.A0B(r2, r4)
            android.view.View r6 = r11.A00
            X.2eS.A01(r6)
            X.Kmu r1 = r2.A04
            boolean r0 = r1 instanceof X.C61917KRm
            if (r0 == 0) goto L_0x00b2
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r11.A04
            X.KRm r1 = (X.C61917KRm) r1
            java.lang.String r0 = r1.A00
            X.DbV.A1P(r3, r5, r0)
            boolean r3 = r2.A05
            android.content.Context r1 = X.DbS.A07(r11)
            r0 = 2131962075(0x7f1328db, float:1.9560865E38)
            if (r3 == 0) goto L_0x0072
            r0 = 2131962074(0x7f1328da, float:1.9560863E38)
        L_0x0072:
            X.DbU.A12(r1, r5, r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = r11.A03
            r0.setVisibility(r4)
            r5.setVisibility(r4)
            android.content.Context r1 = r6.getContext()
            int r0 = r2.A00
            int r0 = X.C242363Tt.A01(r1, r0)
            r5.setColorFilter(r0)
            android.widget.TextView r3 = r11.A02
            android.content.Context r1 = X.JTQ.A06(r11)
            X.4Yx r0 = r2.A03
            java.lang.CharSequence r0 = X.C66909Mes.A00(r1, r0)
            r3.setText(r0)
            android.widget.TextView r3 = r11.A01
            android.content.Context r1 = X.JTQ.A06(r11)
            X.4Yx r0 = r2.A02
            java.lang.CharSequence r0 = X.C66909Mes.A00(r1, r0)
            r3.setText(r0)
            android.view.View$OnClickListener r0 = r2.A01
            X.AnonymousClass0fU.A00(r0, r6)
            X.AnonymousClass0fU.A00(r0, r3)
            goto L_0x0360
        L_0x00b2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b7:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r5)
            throw r0
        L_0x00bc:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.fanclub.settings.viewmodel.FanClubMainRecommendationViewModel"
            X.0qQ.A0C(r2, r0)
            X.GqK r2 = (X.C53549GqK) r2
            X.JpC r11 = (X.C60665JpC) r11
            X.0iw r3 = r10.A00
            if (r3 == 0) goto L_0x013d
            X.0qQ.A0B(r2, r4)
            com.instagram.common.session.UserSession r6 = r11.A04
            boolean r0 = X.AnonymousClass2o2.A02(r6)
            if (r0 == 0) goto L_0x0101
            androidx.compose.ui.platform.ComposeView r5 = r11.A03
            r5.setVisibility(r4)
            X.GTZ r0 = X.GTZ.A00
            r5.setViewCompositionStrategy(r0)
            java.lang.String r4 = r3.getModuleName()
            r3 = 749688398(0x2caf564e, float:4.983381E-12)
            r1 = 22
            X.JG2 r0 = new X.JG2
            r0.<init>(r1, r2, r11)
            X.5PJ r2 = X.AnonymousClass5PI.A03(r0, r3)
            r0 = 5
            X.J7R r1 = new X.J7R
            r1.<init>(r2, r6, r4, r0)
            r0 = -2035550697(0xffffffff86abf617, float:-6.468465E-35)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r1, r0)
            r5.setContent(r0)
            return
        L_0x0101:
            android.view.View r0 = r11.A01
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x013a
            java.lang.String r1 = r2.A03
        L_0x0115:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A05
            X.DbV.A1P(r3, r0, r1)
            java.lang.String r1 = r2.A0B
            r0.setContentDescription(r1)
            android.widget.TextView r0 = r11.A02
            r0.setText(r1)
            com.instagram.igds.components.button.IgdsButton r1 = r11.A06
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = ""
        L_0x012c:
            r1.setText((java.lang.String) r0)
            android.view.View$OnClickListener r0 = r2.A00
            X.AnonymousClass0fU.A00(r0, r1)
            android.view.View r0 = r11.A00
            r0.setVisibility(r4)
            return
        L_0x013a:
            java.lang.String r1 = r2.A09
            goto L_0x0115
        L_0x013d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r5)
            throw r0
        L_0x0142:
            X.3ry r11 = (X.C254123ry) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsMegaphoneViewModel"
            X.0qQ.A0C(r2, r0)
            X.Lu6 r2 = (X.C65482Lu6) r2
            com.instagram.common.session.UserSession r1 = r10.A02
            X.0iw r0 = r10.A00
            if (r0 == 0) goto L_0x015e
            X.2sd r3 = new X.2sd
            r3.<init>(r0, r1)
            X.2bv r1 = r2.A00
            X.4UC r0 = r2.A01
            r3.ADo(r1, r0, r11)
            return
        L_0x015e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0163:
            X.Jnf r11 = (X.C60570Jnf) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsSectionHeaderViewModel"
            X.0qQ.A0C(r2, r0)
            X.Lu9 r2 = (X.C65485Lu9) r2
            X.0qQ.A0B(r2, r4)
            X.U56 r3 = r11.A00
            r3.A00()
            android.content.Context r1 = X.DbS.A07(r11)
            int r0 = r2.A00
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            boolean r0 = r2.A03
            r3.A02(r1, r0)
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0198
            int r1 = r0.intValue()
            android.content.Context r0 = X.DbS.A07(r11)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r0, r1)
            android.view.View$OnClickListener r0 = r2.A01
            r3.A03(r1, r0)
        L_0x0198:
            X.DbY.A0z(r3)
            return
        L_0x019c:
            X.Jo8 r11 = (X.C60599Jo8) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsButtonRowViewModel"
            X.0qQ.A0C(r2, r0)
            X.LuC r2 = (X.C65488LuC) r2
            X.0qQ.A0B(r2, r4)
            com.instagram.igds.components.textcell.IgdsListCell r5 = r11.A01
            r5.A04()
            X.Njo r7 = X.C69349Njo.TYPE_CHEVRON
            r3 = 1
            r5.A0G(r7, r3)
            X.2eS.A01(r5)
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r9 = r2.A02
            java.lang.Integer r6 = r2.A04
            if (r1 == 0) goto L_0x01dd
            android.content.Context r0 = X.DbS.A07(r11)
            android.graphics.drawable.Drawable r8 = X.JTP.A0E(r0, r1)
            if (r9 == 0) goto L_0x01dd
            if (r8 == 0) goto L_0x01dd
            android.content.Context r1 = X.DbS.A07(r11)
            int r0 = r9.intValue()
            int r0 = X.C242363Tt.A01(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0A(r8, r0)
        L_0x01dd:
            java.lang.Integer r0 = r2.A06
            if (r0 == 0) goto L_0x025f
            android.content.Context r1 = X.DbS.A07(r11)
            int r0 = r0.intValue()
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x01ed:
            r5.A0I(r0)
        L_0x01f0:
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x025a
            android.content.Context r1 = X.DbS.A07(r11)
            int r0 = r0.intValue()
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0200:
            r5.A0H(r0)
        L_0x0203:
            X.4Yx r1 = r2.A01
            if (r1 == 0) goto L_0x0219
            android.content.Context r0 = X.JTQ.A06(r11)
            java.lang.CharSequence r1 = X.C66909Mes.A00(r0, r1)
            r0 = 0
            X.0qQ.A0B(r1, r4)
            r5.A0J(r1, r0, r4)
            r5.setTextCellType(r7)
        L_0x0219:
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x024c
            X.Kh2 r0 = X.C62512Kh2.BLUE
        L_0x021f:
            r5.A0F(r0)
        L_0x0222:
            if (r6 == 0) goto L_0x0232
            int r0 = r6.intValue()
            if (r0 <= 0) goto L_0x0232
            java.lang.String r1 = r6.toString()
            r0 = 0
            r5.A0J(r1, r0, r3)
        L_0x0232:
            java.lang.Integer r3 = r2.A07
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0246
            if (r3 == 0) goto L_0x0246
            android.view.View r1 = X.JTO.A0F(r11)
            X.MB1 r0 = new X.MB1
            r0.<init>(r5, r11, r2, r3)
            X.0nA.A0t(r1, r0)
        L_0x0246:
            android.view.View$OnClickListener r0 = r2.A00
            r5.A0C(r0)
            return
        L_0x024c:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x0222
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0257
            r5.A03()
        L_0x0257:
            X.Kh2 r0 = X.C62512Kh2.ERROR_DOT
            goto L_0x021f
        L_0x025a:
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x0203
            goto L_0x0200
        L_0x025f:
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x01f0
            goto L_0x01ed
        L_0x0264:
            X.Jng r11 = (X.C60571Jng) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsSwitchRowViewModel"
            X.0qQ.A0C(r2, r0)
            X.LuB r2 = (X.C65487LuB) r2
            X.0qQ.A0B(r2, r4)
            com.instagram.igds.components.textcell.IgdsListCell r3 = r11.A00
            r3.A04()
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0288
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r3.setTextCellType(r0)
            boolean r0 = r2.A04
            r3.setChecked(r0)
            X.8bC r0 = r2.A03
            r3.A0E(r0)
        L_0x0288:
            android.content.Context r1 = r3.getContext()
            int r0 = r2.A01
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r3.A0I(r0)
            android.text.SpannableStringBuilder r0 = r2.A02
            if (r0 == 0) goto L_0x02a6
            r3.A0H(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            X.0qQ.A07(r0)
            r3.A0B(r0)
        L_0x02a6:
            boolean r0 = r2.A05
            r3.setEnabled(r0)
            int r0 = r2.A00
            r3.setId(r0)
            return
        L_0x02b1:
            X.Jnd r11 = (X.C60568Jnd) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsFooterRowViewModel"
            X.0qQ.A0C(r2, r0)
            X.Lu4 r2 = (X.C65480Lu4) r2
            X.0qQ.A0B(r2, r4)
            com.instagram.igds.components.textcell.IgdsFooterCell r3 = r11.A00
            android.content.Context r1 = X.DbS.A07(r11)
            int r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r3.A00(r0)
            return
        L_0x02cd:
            android.view.View r1 = r11.itemView
            r0 = 4
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = (com.facebook.shimmer.ShimmerFrameLayout) r1
            r1.A02()
            return
        L_0x02dd:
            X.Jnc r11 = (X.C60567Jnc) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsBannerViewModel"
            X.0qQ.A0C(r2, r0)
            X.Lu5 r2 = (X.C65481Lu5) r2
            X.0qQ.A0B(r2, r4)
            com.instagram.igds.components.banner.IgdsBanner r5 = r11.A00
            android.content.Context r1 = X.DbS.A07(r11)
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            if (r3 == 0) goto L_0x031e
            android.content.Context r1 = X.DbS.A07(r11)
            int r0 = r2.A00
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r1, r0)
        L_0x0307:
            r5.setIcon((android.graphics.drawable.Drawable) r3)
            r0 = 2131963655(0x7f132f07, float:1.956407E38)
            r5.setBody(r0)
            r0 = 2131963656(0x7f132f08, float:1.9564072E38)
            r5.setAction((int) r0)
            r5.setDividerVisibility(r4)
            X.G76 r0 = r2.A01
            r5.A00 = r0
            return
        L_0x031e:
            r3 = 0
            goto L_0x0307
        L_0x0320:
            X.Jo7 r11 = (X.C60598Jo7) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsTextViewModel"
            X.0qQ.A0C(r2, r0)
            X.Lu8 r2 = (X.C65484Lu8) r2
            X.0qQ.A0B(r2, r4)
            android.widget.TextView r1 = r11.A00
            java.lang.CharSequence r0 = r2.A01
            X.DbX.A1G(r1, r0)
            int r0 = r2.A00
            r1.setTextAppearance(r0)
            return
        L_0x0339:
            X.Joq r11 = (X.C60643Joq) r11
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.productsettings.viewmodel.ProductSettingsNextStepViewModel"
            X.0qQ.A0C(r2, r0)
            X.Lu7 r2 = (X.C65483Lu7) r2
            X.0qQ.A0B(r2, r4)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A03
            r0 = 2131238326(0x7f081db6, float:1.8092928E38)
            r1.setImageResource(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            r0 = 2131953013(0x7f130575, float:1.9542485E38)
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            int r0 = r2.A00
            r1.setText(r0)
            android.view.View r5 = r11.A00
            android.view.View$OnClickListener r0 = r2.A01
        L_0x0360:
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x0363:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60424JlH.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A0C = JTP.A0C(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(A0C);
        switch (JTO.A0A(AnonymousClass05K.A00(14), i)) {
            case 0:
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(A0C);
                return new C60570Jnf(new U56(A0C));
            case 1:
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(A0C);
                return new C60599Jo8(this.A02, new IgdsListCell(A0C, (AttributeSet) null));
            case 2:
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(A0C);
                return new C60571Jng(new IgdsListCell(A0C, (AttributeSet) null));
            case 3:
                int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C249703kE(DbT.A0D(from, viewGroup, R.layout.product_settings_loading_row, false));
            case 4:
                int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(A0C);
                return new C60568Jnd(new IgdsFooterCell(A0C, (AttributeSet) null));
            case 5:
                int i7 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C60569Jne(DbT.A0D(from, viewGroup, R.layout.product_settings_h_scroll_item, false));
            case 6:
                int i8 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(A0C);
                return new C60561JnW(VEA.A00(A0C, viewGroup, true));
            case 7:
                int i9 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A0A(from);
                0qQ.A0B(from, 1);
                Context context = from.getContext();
                View A0A = DbU.A0A(from, viewGroup, R.layout.merchant_hscroll, false);
                UEA uea = new UEA(A0A);
                A0A.setTag(uea);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
                linearLayoutManager.A0v(true);
                RecyclerView recyclerView = uea.A04;
                recyclerView.setLayoutManager(linearLayoutManager);
                Resources resources = context.getResources();
                ViewGroup.LayoutParams layoutParams = A0A.getLayoutParams();
                layoutParams.height = -2;
                A0A.setLayoutParams(layoutParams);
                JTP.A1D(recyclerView, AnonymousClass7TE.A0B(resources), AnonymousClass7TE.A0C(resources));
                0nA.A0X(recyclerView, AnonymousClass7TE.A0B(resources));
                return new UEA(A0A);
            case 8:
                int i10 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C60665JpC(DbT.A0D(from, viewGroup, R.layout.fan_club_main_recommendation_row, false), this.A02);
            case 9:
                int i11 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C60654Jp1(DbT.A0D(from, viewGroup, R.layout.fan_club_settings_recommendations_row, false));
            case 10:
                int i12 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C254123ry(DbT.A0D(from, viewGroup, R.layout.generic_v3_megaphone, false));
            case 11:
                int i13 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(A0C);
                return new C60567Jnc(new IgdsBanner(A0C, (AttributeSet) null, 0));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                int i14 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C60598Jo7(DbT.A0D(from, viewGroup, R.layout.product_setting_text_row, false));
            case 13:
                int i15 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C60643Joq(DbT.A0D(from, viewGroup, R.layout.product_settings_next_step_row, false));
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1701950599);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-371092068, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(123525585);
        int intValue = ((MSZ) this.A01.get(i)).BJc().intValue();
        AnonymousClass0fD.A0A(354204809, A032);
        return intValue;
    }
}
