package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.modal.ModalActivity;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.save.model.SavedCollection;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class H1P extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf, C229132mt {
    public static final C55906HpT A0P = new Object();
    public static final String __redex_internal_original_name = "DirectSaveToCollectionFragment";
    public RecyclerView A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgImageView A03;
    public C14190TrU A04;
    public C228172ku A05;
    public IXC A06;
    public C55954HqI A07;
    public List A08 = 0sn.A00;
    public final IXY A09 = new IXY(this, 0);
    public final C55477HiL A0A = new C55477HiL(this);
    public final C55478HiM A0B = new C55478HiM(this);
    public final C55479HiN A0C = new C55479HiN(this);
    public final C229122ms A0D = new C57414IaK(this, 0);
    public final String A0E = "direct_save_to_collection";
    public final AnonymousClass0eM A0F = A00(this, 13);
    public final AnonymousClass0eM A0G = A00(this, 14);
    public final AnonymousClass0eM A0H = A00(this, 15);
    public final AnonymousClass0eM A0I = A00(this, 16);
    public final AnonymousClass0eM A0J = A00(this, 17);
    public final AnonymousClass0eM A0K = A00(this, 18);
    public final AnonymousClass0eM A0L = A00(this, 19);
    public final AnonymousClass0eM A0M = C227642jf.A02(this);
    public final AnonymousClass0eM A0N = A00(this, 20);
    public final AnonymousClass0eM A0O = A00(this, 21);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016c, code lost:
        if (X.182.A06(r5, r6, r0) != false) goto L_0x016e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x038b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r4 = 0
            r10 = r17
            X.0qQ.A0B(r10, r4)
            r2 = r16
            r0 = r18
            super.onViewCreated(r10, r0)
            X.0eM r3 = r2.A0O
            boolean r0 = X.AnonymousClass7TF.A1Z(r3)
            if (r0 == 0) goto L_0x0123
            android.view.View r1 = r2.requireView()
            r0 = 2131437727(0x7f0b289f, float:1.849736E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r1, r0)
            X.0eM r7 = r2.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            boolean r1 = X.I31.A01(r0)
            r0 = 2131432582(0x7f0b1486, float:1.8486926E38)
            android.view.View r8 = r6.requireViewById(r0)
            if (r1 == 0) goto L_0x03c6
            r9 = r8
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.content.Context r5 = r2.requireContext()
            r1 = 2131238512(0x7f081e70, float:1.8093305E38)
            r0 = 2131100473(0x7f060339, float:1.7813328E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A06(r5, r1, r0)
            r9.setImageDrawable(r0)
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            android.content.Context r0 = r2.requireContext()
            r5 = 16
            int r0 = X.DbS.A02(r0, r5)
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            android.content.Context r0 = r2.requireContext()
            int r0 = X.DbS.A02(r0, r5)
            r1.height = r0
            X.0qQ.A0A(r8)
        L_0x0068:
            r0 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.widget.TextView r8 = X.DbU.A0G(r6, r0)
            android.content.Context r5 = r6.getContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            boolean r1 = X.I31.A01(r0)
            r0 = 2131969768(0x7f1346e8, float:1.9576468E38)
            if (r1 == 0) goto L_0x0083
            r0 = 2131969769(0x7f1346e9, float:1.957647E38)
        L_0x0083:
            X.DbT.A18(r5, r8, r0)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r6, r0)
            r2.A02 = r0
            r0 = 2131440657(0x7f0b3411, float:1.8503304E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r6, r0)
            r2.A03 = r0
            r0 = 2131440630(0x7f0b33f6, float:1.8503249E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r6, r0)
            r2.A01 = r0
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r2.A03
            java.lang.String r0 = "privateSaveToggleButton"
            if (r5 == 0) goto L_0x03c1
            android.content.Context r1 = r5.getContext()
            android.content.Context r0 = r2.getContext()
            int r0 = X.2Yu.A0B(r0)
            X.DbX.A12(r1, r5, r0)
            A04(r2)
            X.0eM r5 = r2.A0K
            X.1Xj r0 = X.C51966G9m.A0v(r5)
            r9 = 0
            if (r0 == 0) goto L_0x03be
            X.1Xy r0 = r0.A0C
            java.lang.Integer r8 = r0.BpM()
        L_0x00c8:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = X.C55114HcN.A00(r1, r8, r0)
            java.lang.String r7 = "privateSaveCountTextView"
            if (r0 == 0) goto L_0x03b3
            com.instagram.common.ui.base.IgTextView r0 = r2.A01
            if (r0 == 0) goto L_0x026b
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r1 = r2.A01
            if (r1 == 0) goto L_0x026b
            android.content.res.Resources r0 = X.DbV.A05(r2)
            java.lang.String r0 = X.C14066TpE.A00(r0, r8, r9, r4)
            r1.setText(r0)
        L_0x00ec:
            X.1Xj r0 = X.C51966G9m.A0v(r5)
            if (r0 == 0) goto L_0x0102
            com.instagram.common.typedurl.ImageUrl r1 = r0.A1Q()
            if (r1 == 0) goto L_0x0102
            r0 = 2131442756(0x7f0b3c44, float:1.850756E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r6, r0)
            r0.setUrl(r1, r2)
        L_0x0102:
            r0 = 57
            X.C56800ICx.A00(r6, r0, r2)
            boolean r0 = com.instagram.save.api.SaveApiUtil.A0A(r2, r5)
            r5 = 2131952370(0x7f1302f2, float:1.954118E38)
            if (r0 != 0) goto L_0x0113
            r5 = 2131952373(0x7f1302f5, float:1.9541187E38)
        L_0x0113:
            com.instagram.common.ui.base.IgTextView r1 = r2.A02
            java.lang.String r0 = "privateSaveTitleTextView"
            if (r1 == 0) goto L_0x03c1
            android.content.Context r0 = r1.getContext()
            X.DbU.A12(r0, r1, r5)
            r6.setVisibility(r4)
        L_0x0123:
            X.0eM r0 = r2.A0K
            X.1Xj r8 = X.C51966G9m.A0v(r0)
            if (r8 == 0) goto L_0x01c9
            X.0eM r0 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r0)
            java.lang.String r7 = r0.A07
            X.0eM r9 = r2.A0M
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r9)
            r15 = 1
            X.0qQ.A0B(r5, r15)
            r1 = 4
            X.9Ky r0 = new X.9Ky
            r0.<init>(r5, r1)
            X.0eM r1 = X.AnonymousClass1YB.A00(r0)
            X.0qQ.A0B(r7, r4)
            java.lang.String r0 = "clips"
            boolean r0 = X.00l.A0d(r7, r0, r4)
            if (r0 == 0) goto L_0x0398
            boolean r0 = r8.A5L()
            r11 = 1
            if (r0 == 0) goto L_0x03b0
            java.lang.Object r0 = r1.getValue()
            X.35H r0 = (X.AnonymousClass35H) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328654455913986(0x8110b800033e02, double:3.0377255894453925E-306)
        L_0x0168:
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x03b0
        L_0x016e:
            boolean r0 = r8.A5L()
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = r2.A0E
            X.2kQ r5 = X.C227942kP.A01(r0, r4, r15)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r9)
            X.Hrk r1 = new X.Hrk
            r1.<init>(r5, r0, r7)
            java.lang.String r0 = "save_sheet_impression"
            r1.A00(r8, r0)
        L_0x0188:
            if (r11 == 0) goto L_0x01c9
            r0 = 2131439792(0x7f0b30b0, float:1.850155E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r10, r0)
            androidx.compose.ui.platform.ComposeView r1 = (androidx.compose.ui.platform.ComposeView) r1
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r9)
            java.lang.String r0 = r2.A0E
            X.Hnu r9 = new X.Hnu
            r12 = r8
            r13 = r7
            r14 = r0
            r10 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            X.0qQ.A0B(r1, r15)
            long r5 = X.C55351HgJ.A00
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            android.app.Activity r10 = X.C61270mF.A00(r0)
            com.instagram.common.session.UserSession r11 = r9.A00
            X.1Xj r12 = r9.A01
            java.lang.String r13 = r9.A04
            java.lang.String r14 = r9.A03
            X.J9S r8 = new X.J9S
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = -1334197563(0xffffffffb079c2c5, float:-9.0862456E-10)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r8, r0, r15)
            r1.setContent(r0)
            r1.setVisibility(r4)
        L_0x01c9:
            boolean r0 = X.AnonymousClass7TF.A1Z(r3)
            if (r0 == 0) goto L_0x01d9
            android.view.View r1 = r2.requireView()
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            X.DbT.A1F(r1, r0, r4)
        L_0x01d9:
            android.view.View r1 = r2.requireView()
            r0 = 2131438165(0x7f0b2a55, float:1.849825E38)
            android.view.View r11 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.igds.components.button.IgdsButton r11 = (com.instagram.igds.components.button.IgdsButton) r11
            android.view.View r1 = r2.requireView()
            r0 = 2131432379(0x7f0b13bb, float:1.8486514E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r2.requireView()
            r0 = 2131432365(0x7f0b13ad, float:1.8486485E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r2.requireView()
            r0 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            android.view.View r7 = X.AnonymousClass7TF.A0F(r1, r0)
            boolean r0 = A08(r2)
            if (r0 == 0) goto L_0x02c6
            r0 = 2131970943(0x7f134b7f, float:1.9578851E38)
            java.lang.String r0 = r2.getString(r0)
            r11.setText((java.lang.String) r0)
            r0 = 53
            X.C56800ICx.A00(r11, r0, r2)
            r0 = 2131970944(0x7f134b80, float:1.9578853E38)
            X.DbU.A1G(r8, r2, r0)
            r0 = 2131970942(0x7f134b7e, float:1.957885E38)
            X.DbU.A1G(r6, r2, r0)
            r0 = 54
        L_0x022a:
            X.C56800ICx.A00(r7, r0, r2)
            boolean r0 = X.AnonymousClass7TF.A1Z(r3)
            if (r0 != 0) goto L_0x0243
            android.view.View r1 = r2.requireView()
            r0 = 2131436924(0x7f0b257c, float:1.8495732E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 58
            X.C56800ICx.A00(r1, r0, r2)
        L_0x0243:
            android.view.View r0 = r2.requireView()
            r5 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r0, r5)
            r2.A00 = r1
            java.lang.String r7 = "recyclerView"
            if (r1 == 0) goto L_0x026b
            X.0eM r0 = r2.A0F
            java.lang.Object r0 = r0.getValue()
            X.HrA r0 = (X.C56004HrA) r0
            X.2t9 r0 = r0.A00
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            if (r1 == 0) goto L_0x026b
            X.2ku r0 = r2.A05
            if (r0 != 0) goto L_0x0273
            java.lang.String r7 = "onScrollListeners"
        L_0x026b:
            X.0qQ.A0F(r7)
        L_0x026e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0273:
            r1.A15(r0)
            androidx.recyclerview.widget.RecyclerView r6 = r2.A00
            if (r6 == 0) goto L_0x026b
            android.content.Context r1 = r2.requireContext()
            r0 = 1
            X.DbU.A15(r1, r6, r0, r4)
            boolean r0 = X.AnonymousClass7TF.A1Z(r3)
            if (r0 == 0) goto L_0x02b4
            android.content.Context r3 = r2.requireContext()
            android.content.Context r1 = r2.getContext()
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r3 = r3.getColor(r0)
            android.view.View r1 = r2.requireView()
            r0 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackgroundColor(r3)
            android.view.View r0 = r2.requireView()
            android.view.View r0 = r0.requireViewById(r5)
            r0.setBackgroundColor(r3)
        L_0x02b4:
            X.0eM r0 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r0)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r2.A07(r0)
            return
        L_0x02c6:
            X.0eM r0 = r2.A0M
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36320940694512603(0x8109b4000123db, double:3.032847375674334E-306)
            boolean r10 = X.182.A06(r5, r9, r0)
            r0 = 55
            X.C56800ICx.A00(r11, r0, r2)
            r5 = 1
            if (r10 == 0) goto L_0x038f
            X.0eM r9 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r9)
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x038f
            r1 = 2131952364(0x7f1302ec, float:1.9541169E38)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r9)
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x03cd
            java.lang.String r0 = X.DbV.A0z(r2, r0, r1)
        L_0x02f8:
            r8.setText(r0)
            if (r10 == 0) goto L_0x038b
            X.0eM r0 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r0)
            java.util.List r0 = r0.A0A
            int r1 = r0.size()
            r0 = 2131952363(0x7f1302eb, float:1.9541167E38)
            if (r1 <= r5) goto L_0x0311
            r0 = 2131952362(0x7f1302ea, float:1.9541165E38)
        L_0x0311:
            X.DbU.A1G(r6, r2, r0)
            android.view.View r1 = r2.requireView()
            r0 = 2131432373(0x7f0b13b5, float:1.8486502E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r1, r0)
            android.view.View r1 = r2.requireView()
            r0 = 2131432368(0x7f0b13b0, float:1.8486491E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r8 = (com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView) r8
            r1 = 8
            if (r10 == 0) goto L_0x0384
            X.0eM r9 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r9)
            java.util.List r0 = r0.A0A
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0384
            r6.setVisibility(r1)
            r8.setVisibility(r4)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r9)
            java.util.List r0 = r0.A0A
            int r1 = r0.size()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r9)
            java.util.List r0 = r0.A0A
            if (r1 <= r5) goto L_0x037a
            java.lang.Object r6 = X.00k.A0I(r0)
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r9)
            java.util.List r0 = r0.A0A
            java.lang.Object r5 = r0.get(r5)
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A03(r2, r6, r5, r0)
        L_0x0376:
            r0 = 56
            goto L_0x022a
        L_0x037a:
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r8.A04(r0, r2)
            goto L_0x0376
        L_0x0384:
            r6.setVisibility(r4)
            r8.setVisibility(r1)
            goto L_0x0376
        L_0x038b:
            r0 = 2131952361(0x7f1302e9, float:1.9541163E38)
            goto L_0x0311
        L_0x038f:
            r0 = 2131952366(0x7f1302ee, float:1.9541173E38)
            java.lang.String r0 = r2.getString(r0)
            goto L_0x02f8
        L_0x0398:
            boolean r0 = r8.A5L()
            r11 = 1
            if (r0 == 0) goto L_0x03b0
            java.lang.Object r0 = r1.getValue()
            X.35H r0 = (X.AnonymousClass35H) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328654455848449(0x8110b800023e01, double:3.0377255894039466E-306)
            goto L_0x0168
        L_0x03b0:
            r11 = 0
            goto L_0x016e
        L_0x03b3:
            com.instagram.common.ui.base.IgTextView r1 = r2.A01
            if (r1 == 0) goto L_0x026b
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00ec
        L_0x03be:
            r8 = r9
            goto L_0x00c8
        L_0x03c1:
            X.0qQ.A0F(r0)
            goto L_0x026e
        L_0x03c6:
            r0 = 8
            r8.setVisibility(r0)
            goto L_0x0068
        L_0x03cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1P.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73909Plk(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Hj6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    public static final void A01(Context context, H1P h1p, 1Xj r17, int i, int i2) {
        C243373Ym r9;
        H1P h1p2 = h1p;
        AnonymousClass0eM r2 = h1p2.A0M;
        1Xj r6 = r17;
        if (SaveApiUtil.A09(AnonymousClass7TE.A0l(r2), r6)) {
            r9 = C243373Ym.NOT_SAVED;
        } else {
            r9 = C243373Ym.SAVED;
        }
        SaveApiUtil.A04(h1p2.requireActivity(), context, AnonymousClass7TE.A0l(r2), r6, h1p2, (JPV) null, r9, (SearchContext) null, (C249763kK) null, (String) null, (String) null, (String) null, i2, i, -1);
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r2));
        ? obj = new Object();
        obj.A00 = r6;
        A002.A00(C55120HcT.A00(obj));
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r2)).A00(new Object());
    }

    public static final void A03(H1P h1p) {
        View view = h1p.mView;
        if (view != null) {
            view.postDelayed(new C57724IfR(h1p), 200);
        }
    }

    public static final void A04(H1P h1p) {
        IgTextView igTextView = h1p.A02;
        String str = "privateSaveTitleTextView";
        if (igTextView != null) {
            Context context = igTextView.getContext();
            AnonymousClass0eM r3 = h1p.A0K;
            int i = 2131952371;
            if (!SaveApiUtil.A0A(h1p, r3)) {
                i = 2131952372;
            }
            DbT.A18(context, igTextView, i);
            IgImageView igImageView = h1p.A03;
            if (igImageView == null) {
                str = "privateSaveToggleButton";
            } else {
                boolean A0A2 = SaveApiUtil.A0A(h1p, r3);
                int i2 = R.drawable.instagram_save_pano_filled_24;
                if (!A0A2) {
                    i2 = R.drawable.instagram_save_pano_outline_24;
                }
                igImageView.setImageResource(i2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(H1P h1p, boolean z, boolean z2) {
        0xY A0g;
        if (C51966G9m.A0q(h1p.A0G).A03 == AnonymousClass05K.A01) {
            UserSession A0l = AnonymousClass7TE.A0l(h1p.A0M);
            if (z2) {
                A0g = AnonymousClass7TE.A0p(1Au.A00(A0l));
                A0g.E5T("has_seen_public_collections_upsell", true);
            } else {
                A0g = AnonymousClass7TG.A0g(AnonymousClass4k9.A00(A0l).A00, "direct_collab_collection_feed_creation_nux_impression_count");
            }
            A0g.apply();
            if (z) {
                DbT.A1F(h1p.requireView(), R.id.close_button, 0);
            }
        }
        0nA.A0V(h1p.requireView(), (int) A0P.A00(h1p.requireContext(), AnonymousClass7TF.A1Z(h1p.A0O)));
        DbX.A1B(h1p.requireView(), R.id.spinner);
        DbT.A1F(h1p.requireView(), R.id.empty_state, 0);
    }

    private final void A07(boolean z) {
        IXC ixc = this.A06;
        if (ixc == null) {
            0qQ.A0F("savedCollectionsFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ixc.A02(z, AnonymousClass7TF.A1W(C51966G9m.A0q(this.A0G).A03, AnonymousClass05K.A01));
        }
    }

    public static final boolean A08(H1P h1p) {
        AnonymousClass0eM r2 = h1p.A0M;
        if (DbT.A1a(AnonymousClass7TE.A0q(AnonymousClass7TE.A0l(r2)), "has_seen_public_collections_upsell") || AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(r2)).A1o() || !I31.A01(AnonymousClass7TE.A0l(r2))) {
            return false;
        }
        return true;
    }

    public static final boolean A09(H1P h1p) {
        return AnonymousClass7TF.A1Z(h1p.A0O);
    }

    public final UserSession A0A() {
        return AnonymousClass7TE.A0l(this.A0M);
    }

    public final void ACw() {
        IXC ixc = this.A06;
        if (ixc == null) {
            0qQ.A0F("savedCollectionsFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        ixc.A01();
        ((C56004HrA) this.A0F.getValue()).A00(C51966G9m.A0v(this.A0K), this.A08);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0E;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0M);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A02(C69289Nip nip, H1P h1p) {
        Bundle requireArguments = h1p.requireArguments();
        requireArguments.putInt(AnonymousClass000.A00(434), nip.ordinal());
        Dba.A0K(h1p.requireActivity(), requireArguments, AnonymousClass7TE.A0l(h1p.A0M), ModalActivity.class, "direct_new_collection").A0D(h1p, IgNetworkConsentStorage.MAX_ENTRIES);
    }

    public static final void A05(H1P h1p, boolean z) {
        DbX.A1B(h1p.requireView(), R.id.spinner);
        if (!AnonymousClass7TF.A1Z(h1p.A0O)) {
            DbT.A1F(h1p.requireView(), R.id.title_bar, 0);
        }
        RecyclerView recyclerView = h1p.A00;
        if (recyclerView == null) {
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setVisibility(0);
        if (z) {
            h1p.requireView().getLayoutParams().height = -1;
        }
    }

    public final void afterOnResume() {
        View view;
        super.afterOnResume();
        if (isVisible() && (view = this.mView) != null) {
            view.requestFocus();
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        SavedCollection savedCollection;
        C55954HqI hqI;
        super.onActivityResult(i, i2, intent);
        if (1000 == i && -1 == i2) {
            if (!(intent == null || (savedCollection = (SavedCollection) intent.getParcelableExtra("DirectCollaborativeCollectionsConstants_new_created_collection")) == null || (hqI = this.A07) == null)) {
                hqI.A00((ImageUrl) intent.getParcelableExtra("DirectCollaborativeCollectionsConstants_media_thumbnail_url"), savedCollection);
            }
            DbT.A1J(this);
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, X.2mt, X.H1P] */
    public final void onCreate(Bundle bundle) {
        String A002;
        String str;
        int A022 = AnonymousClass0fD.A02(1803294097);
        H1P.super.onCreate(bundle);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("count", String.valueOf(15));
        AnonymousClass0eM r2 = this.A0G;
        String str2 = C51966G9m.A0q(r2).A08;
        if (str2 != null) {
            A1H.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        }
        String str3 = C51966G9m.A0q(r2).A04;
        DirectCollectionArguments A0q = C51966G9m.A0q(r2);
        if (str3 != null) {
            A002 = A0q.A04;
            str = "media_fbid";
        } else {
            A002 = A0q.A00();
            str = "media_id";
        }
        A1H.put(str, A002);
        1Xj A0v = C51966G9m.A0v(this.A0K);
        int i = requireArguments().getInt(AnonymousClass000.A00(225));
        AnonymousClass0eM r1 = this.A0M;
        List A003 = I7Q.A00(AnonymousClass7TE.A0l(r1), A0v, AnonymousClass7TE.A1I(C54665HMw.MEDIA), i);
        this.A06 = new IXC(requireContext(), AnonymousClass07i.A00(this), this, AnonymousClass7TE.A0l(r1), (IXB) this.A0L.getValue(), A003, 03t.A0J(HMU.values()), A1H);
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C14190TrU trU = new C14190TrU(AnonymousClass7TE.A0l(r1), this, AnonymousClass05K.A01, 4);
        this.A04 = trU;
        C228172ku r0 = new C228172ku();
        r0.A03(trU);
        this.A05 = r0;
        A07(false);
        C56534I0f i0f = (C56534I0f) this.A0I.getValue();
        C56534I0f.A00(i0f, "open_save_to_collection_bottom_sheet", i0f.A01.A0B);
        AnonymousClass0fD.A09(-65891347, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1642949679);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.save_to_collection_fragment, false);
        AnonymousClass0fD.A09(-1052276784, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(780988409);
        super.onDestroy();
        boolean z = false;
        if (C51966G9m.A0q(this.A0G).A03 == AnonymousClass05K.A00) {
            List list = this.A08;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((SavedCollection) it.next()).A05()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else if (SaveApiUtil.A0A(this, this.A0K)) {
            z = true;
        }
        this.A0K.getValue();
        C56534I0f.A00((C56534I0f) this.A0I.getValue(), "close_save_to_collection_bottom_sheet", z);
        AnonymousClass0fD.A09(1360725967, A022);
    }
}
