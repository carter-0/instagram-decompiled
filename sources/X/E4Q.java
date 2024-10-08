package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.List;

public final class E4Q extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBulletListFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public UserSession A05;
    public IgImageView A06;
    public QuickPromotionSlot A07;
    public C231002qi A08;
    public boolean A09;
    public boolean A0A;
    public View A0B;
    public AnonymousClass4UC A0C;
    public boolean A0D;
    public final Handler A0E = AnonymousClass7TF.A0D();
    public final List A0F = AnonymousClass7TE.A1C();

    public final String getModuleName() {
        return "quick promotion";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        return !this.A0D;
    }

    public static void A00(View view, IgLinearLayout igLinearLayout, IgTextView igTextView, List list, int i) {
        IgImageView requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        list.add(new EyB(igLinearLayout, igTextView, requireViewById));
    }

    public final void configureActionBar(2da r2) {
        Dba.A1G(r2);
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r1 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r4.length() == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = -1112479482(0xffffffffbdb0e906, float:-0.08638196)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r5 = r10
            X.E4Q.super.onCreate(r11)
            X.Dbb.A1M(r10)
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x008c
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r10.A07 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION"
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L_0x002f
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            r3 = 0
            if (r0 != 0) goto L_0x0043
            X.16F r0 = X.16P.A00(r4)     // Catch:{ IOException -> 0x003c }
            X.4UC r3 = X.AnonymousClass4V6.parseFromJson(r0)     // Catch:{ IOException -> 0x003c }
            goto L_0x0043
        L_0x003c:
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "Error parsing fullscreen interstitial promotion"
            X.0wb.A03(r1, r0)
        L_0x0043:
            r10.A0C = r3
            com.instagram.common.session.UserSession r7 = X.DbX.A0U(r10)
            r10.A05 = r7
            X.1YN r4 = X.AnonymousClass2bO.A00()
            if (r7 != 0) goto L_0x005b
            java.lang.String r0 = "userSession"
        L_0x0053:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x005b:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = r10.A07
            if (r9 != 0) goto L_0x0062
            java.lang.String r0 = "quickPromotionSlot"
            goto L_0x0053
        L_0x0062:
            X.AnonymousClass2bO.A00()
            r1 = 9
            X.Fhb r0 = new X.Fhb
            r0.<init>(r10, r1)
            X.2bW r8 = X.2bV.A08(r0)
            r6 = r10
            X.2qi r0 = r4.A01(r5, r6, r7, r8, r9)
            r10.A08 = r0
            X.4UC r0 = r10.A0C
            if (r0 == 0) goto L_0x0082
            X.4V7 r0 = r0.A08
            X.4VG r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            r10.A0D = r0
            r0 = 1260330741(0x4b1f1ef5, float:1.0428149E7)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x008c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 16212264(0xf76128, float:2.271822E-38)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4Q.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(210068170);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_bullet_list_fragment, viewGroup, false);
        this.A06 = DbT.A0b(inflate, R.id.image);
        this.A02 = DbU.A0G(inflate, R.id.primary_button);
        this.A03 = DbU.A0G(inflate, R.id.secondary_button);
        this.A00 = DbU.A0G(inflate, R.id.content);
        this.A01 = AnonymousClass7TE.A0d(inflate, R.id.learn_more_link);
        this.A04 = Dba.A06(inflate);
        this.A0B = inflate.requireViewById(R.id.content_container);
        List list = this.A0F;
        A00(inflate, (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.bullet_item_1), DbX.A0Z(inflate, R.id.bullet_item_text_1), list, R.id.bullet_item_icon_1);
        A00(inflate, (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.bullet_item_2), DbX.A0Z(inflate, R.id.bullet_item_text_2), list, R.id.bullet_item_icon_2);
        A00(inflate, (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.bullet_item_3), DbX.A0Z(inflate, R.id.bullet_item_text_3), list, R.id.bullet_item_icon_3);
        A00(inflate, (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.bullet_item_4), DbX.A0Z(inflate, R.id.bullet_item_text_4), list, R.id.bullet_item_icon_4);
        A00(inflate, (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.bullet_item_5), DbX.A0Z(inflate, R.id.bullet_item_text_5), list, R.id.bullet_item_icon_5);
        A00(inflate, (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.bullet_item_6), DbX.A0Z(inflate, R.id.bullet_item_text_6), list, R.id.bullet_item_icon_6);
        AnonymousClass0fD.A09(-333584571, A022);
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r10 = this;
            r0 = 1494957487(0x591b3daf, float:2.7310277E15)
            int r6 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.4UC r4 = r10.A0C
            if (r4 == 0) goto L_0x0124
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x0124
            X.2qi r0 = r10.A08
            if (r0 != 0) goto L_0x0020
            java.lang.String r7 = "_quickPromotionDelegate"
        L_0x0018:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0020:
            r0.DbK(r4)
            X.4V7 r3 = r4.A08
            X.5Ju r5 = r3.A06
            X.5Ju r2 = r3.A07
            android.content.Context r0 = r10.requireContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            java.lang.String r7 = "imageView"
            if (r0 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r10.A06
            if (r1 == 0) goto L_0x0018
            com.instagram.common.typedurl.ImageUrl r0 = r5.A00
        L_0x003d:
            r1.setUrl(r0, r10)
        L_0x0040:
            X.4V8 r0 = r3.A09
            android.widget.TextView r1 = r10.A04
            if (r1 != 0) goto L_0x0052
            java.lang.String r7 = "titleText"
            goto L_0x0018
        L_0x0049:
            if (r2 == 0) goto L_0x0040
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r10.A06
            if (r1 == 0) goto L_0x0018
            com.instagram.common.typedurl.ImageUrl r0 = r2.A00
            goto L_0x003d
        L_0x0052:
            java.lang.String r0 = X.DbZ.A0n(r0)
            r1.setText(r0)
            X.5Jo r0 = r3.A03
            if (r0 == 0) goto L_0x006b
            android.widget.TextView r1 = r10.A00
            if (r1 != 0) goto L_0x0064
            java.lang.String r7 = "contentText"
            goto L_0x0018
        L_0x0064:
            java.lang.String r0 = X.DbZ.A0n(r0)
            r1.setText(r0)
        L_0x006b:
            X.4VG r0 = r3.A02
            if (r0 == 0) goto L_0x0090
            java.lang.String r7 = r0.A03
            android.widget.TextView r5 = r10.A01
            android.widget.TextView r1 = r10.A03
            r2 = 0
            if (r7 == 0) goto L_0x010f
            if (r5 == 0) goto L_0x010f
            X.4V8 r0 = r0.A00
            java.lang.String r0 = X.DbZ.A0n(r0)
            r5.setText(r0)
            r1 = 19
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r7, (java.lang.Object) r10, (int) r1)
            X.AnonymousClass0fU.A00(r0, r5)
            r5.setVisibility(r2)
        L_0x0090:
            X.4VG r2 = r3.A01
            if (r2 == 0) goto L_0x00ac
            android.widget.TextView r1 = r10.A02
            java.lang.String r7 = "primaryButton"
            if (r1 == 0) goto L_0x0018
            X.4V8 r0 = r2.A00
            java.lang.String r0 = X.DbZ.A0n(r0)
            r1.setText(r0)
            android.widget.TextView r1 = r10.A02
            if (r1 == 0) goto L_0x0018
            r0 = 50
            X.FPH.A00(r1, r2, r10, r4, r0)
        L_0x00ac:
            java.util.List r0 = r3.A0A
            if (r0 == 0) goto L_0x0138
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r5 == 0) goto L_0x0138
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0138
            int r4 = r5.size()
            r3 = 0
            r2 = 0
        L_0x00c2:
            if (r2 >= r4) goto L_0x0138
            java.lang.Object r7 = r5.get(r2)
            X.Cv0 r7 = (X.C45358Cv0) r7
            java.util.List r9 = r10.A0F
            java.lang.Object r0 = r9.get(r2)
            X.EyB r0 = (X.EyB) r0
            com.instagram.common.ui.base.IgLinearLayout r0 = r0.A00
            r0.setVisibility(r3)
            X.5Ju r8 = r7.A00
            if (r8 == 0) goto L_0x00e8
            java.lang.Object r0 = r9.get(r2)
            X.EyB r0 = (X.EyB) r0
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A02
            com.instagram.common.typedurl.ImageUrl r0 = r8.A00
            r1.setUrl(r0, r10)
        L_0x00e8:
            java.lang.Object r0 = r9.get(r2)
            X.EyB r0 = (X.EyB) r0
            com.instagram.common.ui.base.IgTextView r1 = r0.A01
            java.lang.String r0 = r7.A02
            if (r0 == 0) goto L_0x0102
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = r7.A02
        L_0x00fc:
            r1.setText(r0)
        L_0x00ff:
            int r2 = r2 + 1
            goto L_0x00c2
        L_0x0102:
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x00ff
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r7.A01
            goto L_0x00fc
        L_0x010f:
            if (r1 == 0) goto L_0x0090
            X.4V8 r0 = r0.A00
            java.lang.String r0 = X.DbZ.A0n(r0)
            r1.setText(r0)
            r0 = 40
            X.FPG.A00(r1, r0, r4, r10)
            r1.setVisibility(r2)
            goto L_0x0090
        L_0x0124:
            boolean r0 = r10.isVisible()
            if (r0 == 0) goto L_0x013f
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x013f
            X.0hq r0 = r10.mFragmentManager
            if (r0 == 0) goto L_0x0143
            r0.A0c()
        L_0x0135:
            r0 = 1
            r10.A09 = r0
        L_0x0138:
            r0 = 1535727511(0x5b895797, float:7.7316756E16)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x013f:
            r0 = 1
            r10.A0A = r0
            goto L_0x0135
        L_0x0143:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4Q.onResume():void");
    }
}
