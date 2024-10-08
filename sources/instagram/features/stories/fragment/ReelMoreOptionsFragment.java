package instagram.features.stories.fragment;

import X.0Tu;
import X.1Ln;
import X.1Ng;
import X.1OC;
import X.1wn;
import X.27p;
import X.27r;
import X.29R;
import X.2Yu;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7AV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8CA;
import X.AnonymousClass8CB;
import X.C267544bj;
import X.C279294yP;
import X.C46448DfA;
import X.C47518E6c;
import X.C59689JTv;
import X.C59904JbT;
import X.C60013JdM;
import X.C62126Kac;
import X.C62127Kad;
import X.C62939Kor;
import X.C64679Lg6;
import X.C65762LzG;
import X.C68504NKx;
import X.C70966OTn;
import X.C71277OhI;
import X.C74369Ptj;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.DbY;
import X.Dbc;
import X.F0T;
import X.FAZ;
import X.JTO;
import X.JTR;
import X.LSV;
import X.LY3;
import X.LZR;
import X.Lg8;
import X.LgJ;
import X.PR7;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.HashSet;
import java.util.List;

public class ReelMoreOptionsFragment extends C47518E6c implements AnonymousClass4DU, AnonymousClass4DS {
    public Intent A00;
    public 1OC A01;
    public UserSession A02;
    public ReelMoreOptionsModel A03;
    public ReelMoreOptionsModel A04;
    public C62939Kor A05;
    public C62939Kor A06;
    public C71277OhI A07;
    public PR7 A08;
    public PR7 A09;
    public PR7 A0A;
    public Boolean A0B = null;
    public Integer A0C = AnonymousClass05K.A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N;
    public FAZ A0O;
    public FAZ A0P;
    public C46448DfA A0Q;
    public C68504NKx A0R;
    public Boolean A0S;
    public Integer A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public final View.OnClickListener A0Y = new LY3(this, 42);
    public final View.OnClickListener A0Z = new LY3(this, 41);
    public final View.OnClickListener A0a = new LY3(this, 38);
    public final View.OnClickListener A0b = new LY3(this, 37);
    public final View.OnClickListener A0c = new LY3(this, 40);
    public final View.OnClickListener A0d = new LY3(this, 39);
    public final 1wn A0e = new LgJ(this, 20);
    public final 1wn A0f = new LgJ(this, 21);
    public final HashSet A0g = AnonymousClass7TE.A1F();
    public final TextView.OnEditorActionListener A0h = new LZR(this, 4);
    public final C74369Ptj A0i = new C65762LzG(this);
    public Drawable mAddIconDrawable;
    public Drawable mInfoIconDrawable;
    public ActionButton mSaveButton;

    public static void A08(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, PR7 pr7, ReelMoreOptionsFragment reelMoreOptionsFragment, boolean z) {
        Drawable drawable;
        if (z) {
            drawable = null;
        } else {
            drawable = reelMoreOptionsFragment.mAddIconDrawable;
        }
        pr7.A02 = drawable;
        if (z) {
            onClickListener = null;
        }
        pr7.A04 = onClickListener;
        pr7.A06 = !z;
        if (reelMoreOptionsFragment.getContext() != null) {
            pr7.A00 = reelMoreOptionsFragment.getContext().getColor(2Yu.A0D(reelMoreOptionsFragment.getContext()));
        }
        if (!z) {
            onClickListener2 = null;
        }
        pr7.A03 = onClickListener2;
    }

    public final String getModuleName() {
        return "reel_more_options";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    private FAZ A06(CharSequence charSequence) {
        FAZ faz = new FAZ(charSequence);
        faz.A01 = 8388627;
        faz.A05 = new F0T(DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), DbV.A05(this).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material), DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), DbV.A05(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        faz.A00 = 1.33f;
        faz.A03 = R.style.ReelMoreOptionsFooter;
        return faz;
    }

    private void A09(AnonymousClass8CA r3) {
        AnonymousClass8CB r0 = new AnonymousClass8CB(this.A03);
        r0.A09 = r3;
        this.A03 = r0.A01();
    }

    public static void A0A(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        ReelMoreOptionsFragment reelMoreOptionsFragment2 = reelMoreOptionsFragment;
        ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment2.A03;
        AnonymousClass8CA r18 = reelMoreOptionsModel.A09;
        String str = reelMoreOptionsModel.A0C;
        String str2 = reelMoreOptionsModel.A0B;
        String str3 = reelMoreOptionsModel.A0A;
        ProfileShopLink profileShopLink = reelMoreOptionsModel.A06;
        InstagramShopLink instagramShopLink = reelMoreOptionsModel.A03;
        ProductCollectionLink productCollectionLink = reelMoreOptionsModel.A04;
        ProductCollectionLink productCollectionLink2 = reelMoreOptionsModel.A05;
        ReelProductLink reelProductLink = reelMoreOptionsModel.A08;
        ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel.A07;
        BrandedContentGatingInfo brandedContentGatingInfo = reelMoreOptionsModel.A00;
        List list = reelMoreOptionsModel.A0D;
        BrandedContentProjectMetadata brandedContentProjectMetadata = reelMoreOptionsModel.A01;
        boolean z = reelMoreOptionsModel.A0E;
        boolean z2 = reelMoreOptionsModel.A0F;
        String str4 = str;
        List list2 = list;
        boolean z3 = z;
        AnonymousClass8CA r22 = r18;
        String str5 = str3;
        String str6 = str2;
        ProfileShopLink profileShopLink2 = profileShopLink;
        ReelMultiProductLink reelMultiProductLink2 = reelMultiProductLink;
        ReelProductLink reelProductLink2 = reelProductLink;
        InstagramShopLink instagramShopLink2 = instagramShopLink;
        ProductCollectionLink productCollectionLink3 = productCollectionLink;
        ProductCollectionLink productCollectionLink4 = productCollectionLink2;
        BrandedContentGatingInfo brandedContentGatingInfo2 = brandedContentGatingInfo;
        BrandedContentProjectMetadata brandedContentProjectMetadata2 = brandedContentProjectMetadata;
        ReelMoreOptionsModel A002 = AnonymousClass8CB.A00(brandedContentGatingInfo2, brandedContentProjectMetadata2, reelMoreOptionsModel.A02, instagramShopLink2, productCollectionLink3, productCollectionLink4, profileShopLink2, reelMultiProductLink2, reelProductLink2, r22, str5, str6, str4, list2, z3, z2, reelMoreOptionsFragment2.A0F, reelMoreOptionsFragment2.A0L);
        reelMoreOptionsFragment2.A03 = A002;
        if (A002.A01()) {
            C59689JTv.A07(reelMoreOptionsFragment2.getActivity(), 2131954531);
        }
        Intent intent = reelMoreOptionsFragment2.A00;
        intent.getClass();
        intent.putExtra(AnonymousClass000.A00(456), reelMoreOptionsFragment2.A03);
        reelMoreOptionsFragment2.requireActivity().setResult(-1, reelMoreOptionsFragment2.A00);
        if (JTR.A1Z(reelMoreOptionsFragment2.A02)) {
            if (DbY.A1Y(0Tu.A05, reelMoreOptionsFragment2.A02, 36321619299346017L)) {
                27r A012 = 27p.A01(reelMoreOptionsFragment2.A02);
                boolean z4 = reelMoreOptionsFragment2.A0F;
                29R r3 = A012.A09;
                1Ln A0N2 = JTO.A0N(r3);
                C279294yP A0J2 = r3.A0J();
                if (DbT.A1Y(A0N2) && A0J2 != null) {
                    JTO.A1V(A0N2);
                    Dbc.A0i(A0N2, Dbc.A08(A0N2, A0J2, r3, "ADS_MODE_SETTINGS_SAVE"));
                    A0N2.A0O("ads_mode_boost_story_enabled", Boolean.valueOf(z4));
                    A0N2.Cgf();
                }
                if (reelMoreOptionsFragment2.A0F) {
                    29R A0b2 = JTO.A0b(reelMoreOptionsFragment2.A02);
                    1Ln A0N3 = JTO.A0N(A0b2);
                    C279294yP A0J3 = A0b2.A0J();
                    if (DbT.A1Y(A0N3) && A0J3 != null) {
                        JTO.A1V(A0N3);
                        Dbc.A0i(A0N3, Dbc.A08(A0N3, A0J3, A0b2, "ADS_MODE_CAMERA_POST_CAPTURE_EDIT_SESSION_START"));
                        A0N3.A0O("ads_mode_boost_story_enabled", AnonymousClass7TE.A0v());
                        A0N3.Cgf();
                    }
                }
            }
        }
        DbT.A1J(reelMoreOptionsFragment2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(instagram.features.stories.fragment.ReelMoreOptionsFragment r4) {
        /*
            com.instagram.actionbar.ActionButton r0 = r4.mSaveButton
            if (r0 == 0) goto L_0x0028
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r4.A03
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A04
            boolean r0 = r1.equals(r0)
            r3 = 0
            if (r0 == 0) goto L_0x001b
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A03
            java.util.List r0 = r0.A0D
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x001b:
            r2 = 1
        L_0x001c:
            com.instagram.actionbar.ActionButton r1 = r4.mSaveButton
            boolean r0 = r4.A0M
            if (r0 != 0) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            r3 = 1
        L_0x0025:
            r1.setEnabled(r3)
        L_0x0028:
            return
        L_0x0029:
            boolean r1 = r4.A0L
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r4.A03
            boolean r0 = r2.A0H
            if (r1 != r0) goto L_0x001b
            boolean r1 = r4.A0E
            boolean r0 = r2.A0E
            if (r1 != r0) goto L_0x001b
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x0045
            X.OhI r0 = r4.A07
            java.lang.String r0 = r0.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001b
        L_0x0045:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0050
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A03
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x0050
            goto L_0x001b
        L_0x0050:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r4.A03
            X.8CA r1 = r2.A09
            if (r1 != 0) goto L_0x0058
            X.8CA r1 = X.AnonymousClass8CA.NONE
        L_0x0058:
            X.8CA r0 = X.AnonymousClass8CA.BUSINESS_TRANSACTION
            if (r1 == r0) goto L_0x001b
            boolean r0 = r2.A0F
            r2 = 0
            if (r0 == 0) goto L_0x001c
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.fragment.ReelMoreOptionsFragment.A0B(instagram.features.stories.fragment.ReelMoreOptionsFragment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0209, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(instagram.features.stories.fragment.ReelMoreOptionsFragment r10, java.lang.Integer r11) {
        /*
            r10.A0C = r11
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.HashSet r1 = r10.A0g
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0013
            X.DfA r0 = r10.A0Q
            r2.add(r0)
        L_0x0013:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01b0
            X.8CA r0 = X.AnonymousClass8CA.WEB_URL
            r10.A09(r0)
            X.PR7 r0 = r10.A0A
            r2.add(r0)
            X.OhI r0 = r10.A07
            r2.add(r0)
            X.FAZ r0 = r10.A0P
        L_0x002c:
            r2.add(r0)
        L_0x002f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0057
            android.content.res.Resources r4 = X.DbV.A05(r10)
            r3 = 2131820545(0x7f110001, float:1.9273808E38)
            int r0 = r1.size()
            java.lang.String r0 = r4.getQuantityString(r3, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            X.FAZ r0 = r10.A06(r0)
            r2.add(r0)
        L_0x0057:
            com.instagram.common.session.UserSession r0 = r10.A02
            boolean r0 = X.C347037wA.A05(r0)
            if (r0 == 0) goto L_0x00f3
            com.instagram.common.session.UserSession r4 = r10.A02
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36321249932289222(0x8109fc000324c6, double:3.033042938889468E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00f3
            r0 = 2131954125(0x7f1309cd, float:1.954474E38)
            X.C46448DfA.A02(r2, r0)
            X.OTn r0 = r10.A07()
            r2.add(r0)
            android.content.Context r5 = r10.requireContext()
            r0 = 2131954165(0x7f1309f5, float:1.9544822E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 2131954187(0x7f130a0b, float:1.9544866E38)
            r3 = 1
            android.text.SpannableStringBuilder r1 = X.DbY.A0D(r5, r4, r0)
            X.Dj8 r0 = new X.Dj8
            r0.<init>(r5, r3)
            X.AnonymousClass7AV.A05(r1, r0, r4)
            X.FGF r0 = new X.FGF
            r0.<init>((android.text.SpannableStringBuilder) r1)
            r2.add(r0)
            com.instagram.common.session.UserSession r0 = r10.A02
            boolean r0 = X.LPL.A02(r0)
            if (r0 != 0) goto L_0x00e4
            X.DbV.A1W(r2, r3)
            r0 = 2131954162(0x7f1309f2, float:1.9544815E38)
            X.C46448DfA.A02(r2, r0)
            r3 = 2131969189(0x7f1344a5, float:1.9575294E38)
            boolean r1 = r10.A0E
            r0 = 24
            X.LZJ.A01(r10, r2, r0, r3, r1)
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            com.instagram.common.session.UserSession r0 = r10.A02
            android.text.SpannableStringBuilder r1 = X.C49950FGf.A00(r1, r0)
            X.FGF r0 = new X.FGF
            r0.<init>((android.text.SpannableStringBuilder) r1)
            r2.add(r0)
            boolean r0 = r10.A0E
            if (r0 == 0) goto L_0x00e4
            android.content.Context r1 = r10.requireContext()
            r0 = 2131969173(0x7f134495, float:1.9575261E38)
            java.lang.String r1 = r1.getString(r0)
            X.FGF r0 = new X.FGF
            r0.<init>((java.lang.CharSequence) r1)
            r2.add(r0)
        L_0x00e4:
            X.NKx r0 = r10.A0R
            r0.setItems(r2)
            X.3Ar r1 = r10.getScrollingViewProxy()
            X.NKx r0 = r10.A0R
            r1.ENw(r0)
            return
        L_0x00f3:
            com.instagram.common.session.UserSession r4 = r10.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A0F
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.Integer r0 = X.LPL.A00(r4)
            X.JVF.A02(r10, r4, r3, r1, r0)
            r0 = 2131954125(0x7f1309cd, float:1.954474E38)
            X.C46448DfA.A02(r2, r0)
            X.OTn r0 = r10.A07()
            r2.add(r0)
            com.instagram.common.session.UserSession r0 = r10.A02
            boolean r0 = X.JTR.A1Z(r0)
            if (r0 == 0) goto L_0x017a
            com.instagram.common.session.UserSession r3 = r10.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321619299346017(0x810a5200012661, double:3.033276528103507E-306)
            boolean r0 = X.DbY.A1Y(r4, r3, r0)
            if (r0 == 0) goto L_0x017a
            com.instagram.common.session.UserSession r3 = r10.A02
            r0 = 36603094276379504(0x820a5200061370, double:3.211282436988243E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r4, r3, r0)
            long r8 = r0.longValue()
            r0 = 1
            X.DbV.A1W(r2, r0)
            r6 = 0
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r0 = 2131952255(0x7f13027f, float:1.9540948E38)
            if (r1 != 0) goto L_0x0143
            r0 = 2131952254(0x7f13027e, float:1.9540946E38)
        L_0x0143:
            X.C46448DfA.A02(r2, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0155
            r1 = 2131952253(0x7f13027d, float:1.9540944E38)
            X.FGF r0 = new X.FGF
            r0.<init>((int) r1)
            r2.add(r0)
        L_0x0155:
            r5 = 2131954028(0x7f13096c, float:1.9544544E38)
            r3 = 1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01a6
            r5 = 2131954034(0x7f130972, float:1.9544556E38)
        L_0x0161:
            boolean r1 = r10.A0K
            r0 = 25
            X.LZJ.A01(r10, r2, r0, r5, r1)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r1 = 2131954031(0x7f13096f, float:1.954455E38)
            if (r0 != 0) goto L_0x0172
            r1 = 2131954030(0x7f13096e, float:1.9544548E38)
        L_0x0172:
            X.FGF r0 = new X.FGF
            r0.<init>((int) r1)
            r2.add(r0)
        L_0x017a:
            int r3 = r2.size()
            r0 = 2
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "bc_total"
            r5.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "all_total"
            r5.put(r0, r1)
            com.instagram.common.session.UserSession r4 = r10.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A0e
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r5)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.JVF.A05(r10, r4, r3, r1)
            goto L_0x00e4
        L_0x01a6:
            r3 = 2
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0161
            r5 = 2131954035(0x7f130973, float:1.9544558E38)
            goto L_0x0161
        L_0x01b0:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01e6
            X.8CA r0 = X.AnonymousClass8CA.BUSINESS_TRANSACTION
            r10.A09(r0)
            X.PR7 r0 = r10.A09
            r2.add(r0)
            X.Kor r0 = r10.A06
            r2.add(r0)
            X.FAZ r0 = r10.A0P
            r2.add(r0)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r10.A03
            X.8CA r3 = r0.A09
            if (r3 != 0) goto L_0x01d4
            X.8CA r3 = X.AnonymousClass8CA.NONE
        L_0x01d4:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r10.A04
            r0.getClass()
            X.8CA r0 = r0.A09
            if (r0 != 0) goto L_0x01df
            X.8CA r0 = X.AnonymousClass8CA.NONE
        L_0x01df:
            if (r3 == r0) goto L_0x002f
            A0B(r10)
            goto L_0x002f
        L_0x01e6:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x020d
            X.8CA r0 = X.AnonymousClass8CA.AR_EFFECT
            r10.A09(r0)
            X.PR7 r0 = r10.A08
            r2.add(r0)
            X.Kor r0 = r10.A05
            r2.add(r0)
            java.lang.Boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002f
            X.FAZ r0 = r10.A0O
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        L_0x020d:
            X.8CA r0 = X.AnonymousClass8CA.NONE
            r10.A09(r0)
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x021b
            X.PR7 r0 = r10.A0A
            r2.add(r0)
        L_0x021b:
            boolean r0 = r10.A0G
            if (r0 == 0) goto L_0x0224
            X.PR7 r0 = r10.A08
            r2.add(r0)
        L_0x0224:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x002f
            X.PR7 r0 = r10.A09
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(instagram.features.stories.fragment.ReelMoreOptionsFragment, java.lang.Integer):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        obj.A02 = this.A0U;
        obj.A00 = R.drawable.instagram_arrow_back_24;
        ActionButton A002 = C59904JbT.A00(new LY3(this, 35), r4, obj);
        this.mSaveButton = A002;
        A002.setVisibility(0);
        DbX.A1A(new LY3(this, 36), DbX.A0M(), r4);
        A0B(this);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    private C70966OTn A07() {
        C70966OTn oTn = new C70966OTn((View.OnClickListener) new LY3(this, 34), 2131952328);
        List A002 = this.A03.A00();
        String A003 = LSV.A00(requireContext(), this.A03.A01, A002, this.A0L);
        oTn.A03 = A003;
        if (A003.isEmpty()) {
            oTn.A06 = true;
        }
        return oTn;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.E6c, instagram.features.stories.fragment.ReelMoreOptionsFragment, X.0iw, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0112 A[LOOP:0: B:24:0x010c->B:26:0x0112, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 388091306(0x1721cdaa, float:5.228149E-25)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onCreate(r7)
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r6)
            r6.A02 = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2121(0x849, float:2.972E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r0)
            r6.A0N = r0
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ARGUMENT_MEDIA_TYPE"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "IGMediaTypePhoto"
        L_0x002e:
            r6.A0D = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2117(0x845, float:2.967E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "back"
        L_0x0042:
            r6.A0X = r0
            android.content.Context r2 = r6.requireContext()
            com.instagram.common.session.UserSession r1 = r6.A02
            X.Kam r0 = new X.Kam
            r0.<init>(r2, r6, r1, r6)
            r6.A0R = r0
            com.instagram.common.session.UserSession r0 = r6.A02
            boolean r0 = X.JTR.A1Z(r0)
            if (r0 == 0) goto L_0x0182
            com.instagram.common.session.UserSession r4 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321619299346017(0x810a5200012661, double:3.033276528103507E-306)
            boolean r0 = X.DbY.A1Y(r2, r4, r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131952256(0x7f130280, float:1.954095E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x006f:
            r6.A0U = r0
            r0 = 456(0x1c8, float:6.39E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r2 = 0
            if (r7 == 0) goto L_0x011f
            android.os.Bundle r0 = r6.requireArguments()
            android.os.Parcelable r0 = r0.getParcelable(r4)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r0
            r6.A04 = r0
            java.lang.String r0 = "saved_instance_state_more_options_model"
            android.os.Parcelable r0 = r7.getParcelable(r0)
            r0.getClass()
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r0
        L_0x0091:
            r6.A03 = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2538(0x9ea, float:3.556E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            r6.A0I = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2315(0x90b, float:3.244E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            r6.A0G = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2110(0x83e, float:2.957E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            r6.A0H = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r6.A0J = r0
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r6.A03
            boolean r0 = r1.A0H
            r6.A0L = r0
            boolean r0 = r1.A0E
            r6.A0E = r0
            boolean r0 = r1.A0G
            r6.A0K = r0
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x00ec
            java.util.HashSet r1 = r6.A0g
            X.8CA r0 = X.AnonymousClass8CA.WEB_URL
            r1.add(r0)
        L_0x00ec:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x00f7
            java.util.HashSet r1 = r6.A0g
            X.8CA r0 = X.AnonymousClass8CA.AR_EFFECT
            r1.add(r0)
        L_0x00f7:
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x0102
            java.util.HashSet r1 = r6.A0g
            X.8CA r0 = X.AnonymousClass8CA.BUSINESS_TRANSACTION
            r1.add(r0)
        L_0x0102:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.HashSet r0 = r6.A0g
            java.util.Iterator r2 = r0.iterator()
        L_0x010c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r2.next()
            X.8CA r0 = (X.AnonymousClass8CA) r0
            int r0 = r0.A00
            long r0 = (long) r0
            X.AnonymousClass7TE.A1Y(r4, r0)
            goto L_0x010c
        L_0x011f:
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2071(0x817, float:2.902E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)
            r6.A0V = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2080(0x820, float:2.915E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0T = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2072(0x818, float:2.903E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0S = r0
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2073(0x819, float:2.905E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0, r5)
            r6.A0W = r0
            android.os.Bundle r0 = r6.requireArguments()
            android.os.Parcelable r1 = r0.getParcelable(r4)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r1
            r6.A04 = r1
            r1.getClass()
            X.8CB r0 = new X.8CB
            r0.<init>(r1)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A01()
            goto L_0x0091
        L_0x0182:
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2362(0x93a, float:3.31E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x006f
        L_0x0192:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r0 = r6.A0D
            r1.A22(r4, r0)
            X.0hq r2 = r6.getParentFragmentManager()
            r0 = 2
            X.LZW r1 = new X.LZW
            r1.<init>(r6, r0)
            java.lang.String r0 = "request_key_audience_restrictions"
            r2.A0v(r1, r6, r0)
            r0 = -107788848(0xfffffffff99345d0, float:-9.558545E34)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.fragment.ReelMoreOptionsFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2065898790);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.getClass();
        onCreateView.setBackgroundColor(2Yu.A00(requireContext()));
        AnonymousClass0fD.A09(-757928980, A022);
        return onCreateView;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(16813303);
        super.onDestroy();
        1Ng A002 = AnonymousClass1Nd.A00(this.A02);
        A002.A02(this.A0e, C64679Lg6.class);
        A002.A02(this.A0f, Lg8.class);
        AnonymousClass0fD.A09(2080074506, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(357770566);
        super.onDestroyView();
        ReelMoreOptionsFragmentLifecycleUtil.cleanupReferences(this);
        27r A012 = 27p.A01(this.A02);
        AnonymousClass8CA r0 = this.A03.A09;
        if (r0 == null) {
            r0 = AnonymousClass8CA.NONE;
        }
        A012.A1x("reel_more_options", Integer.toString(r0.A00), this.A0X, this.A0D);
        AnonymousClass0fD.A09(226498598, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_instance_state_more_options_model", this.A03);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        this.A0Q = new C46448DfA((CharSequence) getString(2131974844));
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_add_pano_outline_24);
        this.mAddIconDrawable = drawable;
        DbX.A11(requireContext(), drawable.mutate(), R.color.grey_5);
        Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_info_pano_outline_24);
        this.mInfoIconDrawable = drawable2;
        DbX.A11(requireContext(), drawable2.mutate(), R.color.grey_5);
        String string = getString(2131969732);
        boolean z = true;
        SpannableStringBuilder A0E2 = DbY.A0E(this, string, 2131954532);
        AnonymousClass7AV.A05(A0E2, new C60013JdM(this), string);
        this.A0P = A06(A0E2);
        PR7 pr7 = new PR7(getString(2131976823), getString(2131972132));
        this.A0A = pr7;
        A08(this.A0b, this.A0a, pr7, this, !TextUtils.isEmpty(this.A03.A0C));
        String string2 = getString(2131976822);
        String str = this.A03.A0C;
        if (str == null) {
            str = "";
        }
        this.A07 = new C71277OhI(this.A0h, this.A0i, Integer.valueOf(Constants.LOAD_RESULT_WITH_VDEX_ODEX), string2, str, true);
        if (this.A0G) {
            if (getContext() != null) {
                SpannableStringBuilder A0C2 = DbS.A0C(AnonymousClass7TF.A0e(getContext().getResources(), string, 2131953133));
                AnonymousClass7AV.A05(A0C2, new C60013JdM(this), string);
                this.A0O = A06(A0C2);
            }
            PR7 pr72 = new PR7(getString(2131953132), getString(2131972132));
            this.A08 = pr72;
            A08(this.A0Z, this.A0Y, pr72, this, AnonymousClass7TF.A1V(this.A03.A0A));
            this.A05 = new C62127Kad(this.A02, this, this.A03.A0A);
        }
        if (this.A0H) {
            C267544bj B4O = DbV.A0k(this.A02).B4O();
            B4O.getClass();
            this.A09 = new PR7(B4O.Bzy(), getString(2131972132));
            String str2 = this.A0V;
            Integer num2 = this.A0T;
            num2.getClass();
            Boolean bool = this.A0S;
            bool.getClass();
            this.A06 = new C62126Kac(bool, num2, str2, this.A0W);
            PR7 pr73 = this.A09;
            View.OnClickListener onClickListener = this.A0d;
            View.OnClickListener onClickListener2 = this.A0c;
            AnonymousClass8CA r1 = this.A03.A09;
            if (r1 == null) {
                r1 = AnonymousClass8CA.NONE;
            }
            if (r1 != AnonymousClass8CA.BUSINESS_TRANSACTION) {
                z = false;
            }
            A08(onClickListener, onClickListener2, pr73, this, z);
        }
        if (!TextUtils.isEmpty(this.A03.A0C)) {
            num = AnonymousClass05K.A00;
        } else {
            ReelMoreOptionsModel reelMoreOptionsModel = this.A03;
            if (reelMoreOptionsModel.A0A != null) {
                num = AnonymousClass05K.A0N;
            } else {
                AnonymousClass8CA r12 = reelMoreOptionsModel.A09;
                if (r12 == null) {
                    r12 = AnonymousClass8CA.NONE;
                }
                if (r12 == AnonymousClass8CA.BUSINESS_TRANSACTION) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0C;
                }
            }
        }
        A0C(this, num);
        getScrollingViewProxy().ENw(this.A0R);
        27r A012 = 27p.A01(this.A02);
        Boolean valueOf = Boolean.valueOf(this.A0K);
        29R r3 = A012.A09;
        1Ln A0N2 = JTO.A0N(r3);
        C279294yP A0J2 = r3.A0J();
        if (DbT.A1Y(A0N2) && A0J2 != null) {
            JTO.A1V(A0N2);
            Dbc.A0i(A0N2, Dbc.A08(A0N2, A0J2, r3, "ADS_MODE_PARTNER_ADS_SETTINGS_SCREEN_SHOWN"));
            A0N2.A0O("ads_mode_boost_story_enabled", valueOf);
            A0N2.Cgf();
        }
    }
}
