package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class H15 extends AnonymousClass4DH implements C232682uF, AnonymousClass4DR, AnonymousClass4DS, C252213ok, C59611JQf, C240413Ku {
    public static final String __redex_internal_original_name = "SavedTabbedFeedFragment";
    public int A00 = -1;
    public View A01 = null;
    public View A02 = null;
    public C46329Dbx A03;
    public 1Ng A04;
    public UserSession A05;
    public IgEditText A06 = null;
    public C231002qi A07;
    public C230882qT A08;
    public C55881Hp2 A09;
    public HMH A0A;
    public C57417IaN A0B;
    public SavedCollection A0C;
    public HMV A0D;
    public C54665HMw A0E;
    public C56080HsT A0F;
    public I1X A0G;
    public C55968HqZ A0H;
    public EmptyStateView A0I;
    public IgBouncyUfiButtonImageView A0J = null;
    public C300835xz A0K;
    public String A0L;
    public String A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public View A0U = null;
    public AnonymousClass3E6 A0V;
    public C71662eb A0W;
    public C71662eb A0X;
    public C71662eb A0Y;
    public C324356z9 A0Z;
    public C55815Hnv A0a;
    public boolean A0b = false;
    public final Handler A0c = AnonymousClass7TF.A0D();
    public final 1wn A0d = new IO4(this, 13);
    public final 1wn A0e = new IO4(this, 12);
    public final C55522Hj4 A0f = new C55522Hj4(this);
    public final C55523Hj5 A0g = new C55523Hj5(this);
    public final JR5 A0h = new IXV(this);
    public final C322776wO A0i = new C57404IaA(this, 2);

    public static void A03(H15 h15) {
        UserSession userSession;
        boolean A1Y;
        String A062;
        C54378HAt hAt = new C54378HAt(h15, 0);
        C324356z9 r4 = h15.A0Z;
        boolean A1Y2 = DbY.A1Y(0Tu.A05, h15.A05, 36313016479843940L);
        if (h15.A0E == C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
            userSession = h15.A05;
            A1Y = DbW.A1a(h15.A0C);
            0qQ.A0B(userSession, 1);
            A062 = "feed/saved/all/";
        } else {
            String str = h15.A0L;
            userSession = h15.A05;
            A1Y = DbW.A1Y(userSession);
            A062 = 0mp.A06("feed/collection/%s/all/", new Object[]{str});
        }
        1NY A0b2 = AnonymousClass7TG.A0b(userSession);
        A0b2.A0A(A062);
        C51972G9s.A18(A0b2, userSession, C56343Hwu.class);
        A0b2.A0A = 002.A0R(A062, (String) null);
        A0b2.A03();
        A0b2.A0H("include_collection_info", A1Y);
        A0b2.A0H("include_clips_subtab", A1Y2);
        r4.A03(DbT.A0T(A0b2, "clips_subtab_first", "false"), hAt);
        A08(h15);
    }

    public final boolean isContainerFragment() {
        return true;
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A02(H15 h15) {
        C56080HsT hsT = h15.A0F;
        if (hsT != null) {
            LinearLayout linearLayout = hsT.A00;
            boolean z = hsT.A01;
            int i = 4;
            if (z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            C57417IaN iaN = h15.A0B;
            if (iaN.A05) {
                iaN.A05 = false;
                iaN.A02();
            }
            FragmentActivity activity = h15.getActivity();
            if (activity != null) {
                C51970G9q.A12(activity);
            }
        }
    }

    public static void A04(H15 h15) {
        if (h15.A0W != null) {
            C71662eb r1 = h15.A0Y;
            if (h15.A0C == null || !A0A(h15) || r1 == null) {
                SavedCollection savedCollection = h15.A0C;
                if (savedCollection != null && savedCollection.A07 == C54665HMw.MEDIA && h15.A0A == HMH.COLLECTION_FEED_PREVIEW) {
                    h15.A0a = new C55815Hnv(h15.A0W.A01());
                } else {
                    return;
                }
            } else {
                h15.A09 = new C55881Hp2(r1.A01());
            }
            A05(h15);
        }
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.H15 r23) {
        /*
            r13 = r23
            X.Hnv r4 = r13.A0a
            X.Hp2 r12 = r13.A09
            com.instagram.save.model.SavedCollection r11 = r13.A0C
            if (r11 == 0) goto L_0x0017
            if (r12 == 0) goto L_0x0200
            int r0 = r13.A00
            if (r0 != 0) goto L_0x0018
            X.2eb r0 = r13.A0Y
            if (r0 == 0) goto L_0x0018
            r0.A02()
        L_0x0017:
            return
        L_0x0018:
            X.2eb r0 = r13.A0Y
            if (r0 == 0) goto L_0x0017
            r10 = 0
            r0.A03(r10)
            android.content.Context r9 = r13.requireContext()
            java.lang.String r15 = r13.getModuleName()
            com.instagram.common.session.UserSession r8 = r13.A05
            boolean r1 = r13.A0N
            androidx.fragment.app.FragmentActivity r16 = r13.requireActivity()
            X.Hj4 r7 = r13.A0f
            int r3 = r13.A00
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r6 = 8
            X.0qQ.A0B(r7, r6)
            if (r1 == 0) goto L_0x0050
            android.view.View r4 = r12.A02
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingRight()
            r4.setPadding(r2, r1, r0, r10)
        L_0x0050:
            android.widget.TextView r1 = r12.A05
            java.lang.String r0 = r11.A0G
            r1.setText(r0)
            android.widget.TextView r2 = r12.A04
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131820947(0x7f110193, float:1.9274623E38)
            java.lang.String r1 = X.DbY.A0d(r1, r3, r0)
            X.0qQ.A07(r1)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r1, r0)
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r11.A05
            if (r0 == 0) goto L_0x012c
            java.util.List r3 = r0.A02
            java.lang.String r2 = r0.A01
            boolean r0 = r3.isEmpty()
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r12.A07
            if (r0 != 0) goto L_0x0127
            r0 = -2
            X.C51968G9o.A1D(r1, r0)
            int r0 = X.AnonymousClass7TG.A02(r9)
            android.graphics.drawable.Drawable r0 = X.C244283aw.A02(r9, r15, r3, r0)
            r1.setImageDrawable(r0)
        L_0x008b:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0096
            android.widget.TextView r0 = r12.A06
            r0.setText(r2)
        L_0x0096:
            com.instagram.user.follow.FollowButton r0 = r12.A0A
            r0.setVisibility(r6)
        L_0x009b:
            java.lang.String r0 = r8.A06
            boolean r0 = r11.A07(r0)
            if (r0 == 0) goto L_0x01fd
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r11.A05
            if (r0 == 0) goto L_0x00b8
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A08
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r1)
            android.widget.TextView r0 = r12.A03
            r0.setAlpha(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A09
            r0.setAlpha(r1)
        L_0x00b8:
            r0 = 24
            X.ID0 r1 = new X.ID0
            r1.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r7, (java.lang.Object) r11)
            r12.A00 = r1
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A09
            X.AnonymousClass0fU.A00(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r12.A08
            android.view.View$OnClickListener r0 = r12.A00
            X.AnonymousClass0fU.A00(r0, r3)
            android.widget.TextView r4 = r12.A03
            android.view.View$OnClickListener r0 = r12.A00
            X.AnonymousClass0fU.A00(r0, r4)
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0112
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r11.A05
            if (r0 != 0) goto L_0x0112
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r8)
            java.lang.Integer r2 = r0.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            android.content.res.Resources r1 = r9.getResources()
            if (r2 != r0) goto L_0x0108
            r0 = 2131972613(0x7f135205, float:1.9582239E38)
            X.Dbb.A0l(r1, r4, r0)
            r2 = 2131238333(0x7f081dbd, float:1.8092942E38)
        L_0x00f7:
            r1 = 2131100376(0x7f0602d8, float:1.7813132E38)
            android.graphics.Paint r0 = X.AnonymousClass3JT.A00
            int r0 = r9.getColor(r1)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r9, r2, r0)
            r3.setImageDrawable(r0)
            return
        L_0x0108:
            r0 = 2131972611(0x7f135203, float:1.9582234E38)
            X.Dbb.A0l(r1, r4, r0)
            r2 = 2131238964(0x7f082034, float:1.8094222E38)
            goto L_0x00f7
        L_0x0112:
            android.content.res.Resources r2 = r9.getResources()
            com.instagram.save.model.CollaborativeCollectionMetadata r1 = r11.A05
            r0 = 2131972612(0x7f135204, float:1.9582236E38)
            if (r1 == 0) goto L_0x0120
            r0 = 2131972610(0x7f135202, float:1.9582232E38)
        L_0x0120:
            X.Dbb.A0l(r2, r4, r0)
            r2 = 2131238512(0x7f081e70, float:1.8093305E38)
            goto L_0x00f7
        L_0x0127:
            r1.setVisibility(r6)
            goto L_0x008b
        L_0x012c:
            com.instagram.user.model.User r5 = X.AnonymousClass7TF.A0Q(r8)
            com.instagram.user.model.User r4 = r11.A08
            if (r4 == 0) goto L_0x01da
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L_0x01da
            android.widget.TextView r2 = r12.A06
            android.content.res.Resources r3 = r9.getResources()
            r1 = 2131972631(0x7f135217, float:1.9582275E38)
            java.lang.String r0 = r4.getUsername()
            android.text.Spanned r0 = X.DbU.A07(r3, r0, r1)
            r2.setText(r0)
            boolean r0 = r4.A29()
            r0 = r0 ^ 1
            com.instagram.user.follow.FollowButton r14 = r12.A0A
            if (r0 == 0) goto L_0x01fa
            X.4at r3 = r14.A0J
            X.HGM r0 = new X.HGM
            r17 = r0
            r18 = r9
            r19 = r16
            r20 = r13
            r21 = r8
            r22 = r12
            r23 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r3.A07(r0)
            X.0xF r2 = new X.0xF
            r2.<init>()
            java.lang.String r1 = "collection_id"
            java.lang.String r0 = r11.A0F
            X.0qQ.A07(r0)
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            X.0xF.A00(r2, r0, r1)
            java.lang.String r1 = "collection_name"
            java.lang.String r0 = r11.A0G
            X.0xF.A00(r2, r0, r1)
            r3.A03 = r2
            r3.A03(r13, r8, r4)
            r1 = 0
        L_0x0190:
            r14.setVisibility(r1)
            android.view.View r0 = r12.A01
            r0.setVisibility(r1)
        L_0x0198:
            X.LXm r14 = new X.LXm
            r23 = r10
            r22 = r15
            r20 = r4
            r21 = r5
            r18 = r12
            r19 = r11
            r17 = r8
            r15 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5.Bh3()
            java.lang.String r0 = r5.getId()
            boolean r0 = r11.A07(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r12.A07
            if (r0 == 0) goto L_0x01cc
            com.instagram.common.typedurl.ImageUrl r0 = r5.Bh3()
        L_0x01bf:
            r1.setUrl(r0, r13)
        L_0x01c2:
            X.AnonymousClass0fU.A00(r14, r1)
            android.widget.TextView r0 = r12.A06
            X.AnonymousClass0fU.A00(r14, r0)
            goto L_0x009b
        L_0x01cc:
            if (r4 == 0) goto L_0x01d3
            com.instagram.common.typedurl.ImageUrl r0 = r4.Bh3()
            goto L_0x01bf
        L_0x01d3:
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r9, r1, r0)
            goto L_0x01c2
        L_0x01da:
            java.lang.String r0 = r5.getId()
            boolean r0 = r11.A07(r0)
            if (r0 == 0) goto L_0x0198
            android.widget.TextView r2 = r12.A06
            android.content.res.Resources r3 = r9.getResources()
            r1 = 2131972631(0x7f135217, float:1.9582275E38)
            java.lang.String r0 = r5.getUsername()
            android.text.Spanned r0 = X.DbU.A07(r3, r0, r1)
            r2.setText(r0)
            com.instagram.user.follow.FollowButton r14 = r12.A0A
        L_0x01fa:
            r1 = 8
            goto L_0x0190
        L_0x01fd:
            android.view.View r0 = r12.A02
            goto L_0x024e
        L_0x0200:
            if (r4 == 0) goto L_0x0017
            android.content.Context r7 = r13.requireContext()
            java.lang.String r8 = r13.getModuleName()
            com.instagram.common.session.UserSession r2 = r13.A05
            X.Hj5 r1 = r13.A0g
            r0 = 2
            X.DbW.A1N(r2, r0, r1)
            android.widget.TextView r1 = r4.A02
            java.lang.String r0 = r11.A0G
            r1.setText(r0)
            com.instagram.save.model.CollaborativeCollectionMetadata r5 = r11.A05
            if (r5 == 0) goto L_0x025f
            java.util.List r0 = r5.A02
            boolean r0 = r0.isEmpty()
            r3 = 0
            r6 = 8
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r4.A04
            if (r0 != 0) goto L_0x025b
            java.util.List r1 = r5.A02
            int r0 = X.AnonymousClass7TG.A02(r7)
            android.graphics.drawable.Drawable r0 = X.C244283aw.A02(r7, r8, r1, r0)
            r2.setImageDrawable(r0)
            r2.setVisibility(r3)
        L_0x023a:
            java.lang.String r0 = r5.A01
            int r0 = r0.length()
            android.widget.TextView r1 = r4.A00
            if (r0 != 0) goto L_0x0252
            r1.setVisibility(r6)
        L_0x0247:
            android.widget.TextView r0 = r4.A01
        L_0x0249:
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A03
        L_0x024e:
            r0.setVisibility(r6)
            return
        L_0x0252:
            X.0nA.A0Z(r1, r3)
            java.lang.String r0 = r5.A01
            r1.setText(r0)
            goto L_0x0247
        L_0x025b:
            r2.setVisibility(r6)
            goto L_0x023a
        L_0x025f:
            android.widget.TextView r3 = r4.A00
            android.content.res.Resources r2 = r7.getResources()
            r1 = 2131820933(0x7f110185, float:1.9274595E38)
            java.lang.Integer r0 = r11.A0E
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.String r1 = X.DbY.A0d(r2, r0, r1)
            X.0qQ.A07(r1)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r3.setText(r1, r0)
            android.widget.TextView r0 = r4.A01
            r6 = 8
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A04
            goto L_0x0249
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H15.A05(X.H15):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        if (r5 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.H15 r7) {
        /*
            com.instagram.ui.emptystaterow.EmptyStateView r6 = r7.A0I
            if (r6 == 0) goto L_0x008a
            boolean r5 = r7.A0P
            boolean r4 = r7.A0T
            r0 = 65
            X.ICz r3 = X.C56802ICz.A00(r7, r0)
            if (r5 != 0) goto L_0x0012
            if (r4 == 0) goto L_0x00c4
        L_0x0012:
            X.6rr r2 = X.C320156rr.EMPTY
            r1 = 1
            java.util.HashMap r0 = r6.A01
            java.lang.Object r0 = r0.get(r2)
            r0.getClass()
            X.72b r0 = (X.C3253572b) r0
            r0.A01 = r1
            if (r4 == 0) goto L_0x00bf
            r0 = 2131237556(0x7f081ab4, float:1.8091366E38)
        L_0x0027:
            X.6rr r2 = X.C320156rr.EMPTY
            r6.A0R(r2, r0)
            r1 = 2131239153(0x7f0820f1, float:1.8094605E38)
            X.6rr r0 = X.C320156rr.ERROR
            r6.A0R(r0, r1)
            r6.A0N(r3, r0)
            com.instagram.save.model.SavedCollection r5 = r7.A0C
            if (r5 == 0) goto L_0x0082
            com.instagram.common.session.UserSession r0 = r7.A05
            java.lang.String r0 = r0.A06
            boolean r0 = r5.A07(r0)
            if (r0 == 0) goto L_0x00b6
            com.instagram.ui.emptystaterow.EmptyStateView r4 = r7.A0I
            boolean r0 = r7.A0T
            if (r0 == 0) goto L_0x009e
            android.content.res.Resources r3 = X.DbV.A05(r7)
            r1 = 2131972553(0x7f1351c9, float:1.9582117E38)
        L_0x0052:
            java.lang.String r0 = r5.A0G
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r3, r0, r1)
        L_0x0058:
            r4.A0W(r2, r0)
            boolean r0 = r7.A0T
            if (r0 == 0) goto L_0x008b
            android.content.res.Resources r3 = X.DbV.A05(r7)
            r1 = 2131972549(0x7f1351c5, float:1.9582109E38)
        L_0x0066:
            java.lang.String r0 = r5.A0G
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r3, r0, r1)
            r4.A0V(r2, r0)
            X.HMw r1 = r7.A0E
            X.HMw r0 = X.C54665HMw.MEDIA
            if (r1 != r0) goto L_0x0082
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r7.A0I
            r0 = 2131972535(0x7f1351b7, float:1.958208E38)
            r1.A0Q(r2, r0)
            X.6wO r0 = r7.A0i
            r1.A0O(r0, r2)
        L_0x0082:
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r7.A0I
            r0.A0H()
            A08(r7)
        L_0x008a:
            return
        L_0x008b:
            com.instagram.common.session.UserSession r0 = r7.A05
            boolean r0 = X.I31.A01(r0)
            android.content.res.Resources r3 = X.DbV.A05(r7)
            r1 = 2131972548(0x7f1351c4, float:1.9582107E38)
            if (r0 == 0) goto L_0x0066
            r1 = 2131972550(0x7f1351c6, float:1.958211E38)
            goto L_0x0066
        L_0x009e:
            boolean r0 = r7.A0P
            if (r0 == 0) goto L_0x00aa
            android.content.res.Resources r3 = X.DbV.A05(r7)
            r1 = 2131972552(0x7f1351c8, float:1.9582115E38)
            goto L_0x0052
        L_0x00aa:
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131972551(0x7f1351c7, float:1.9582113E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0058
        L_0x00b6:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r7.A0I
            r0 = 2131972554(0x7f1351ca, float:1.9582119E38)
            r1.A0T(r2, r0)
            goto L_0x0082
        L_0x00bf:
            r0 = 2131237557(0x7f081ab5, float:1.8091368E38)
            if (r5 != 0) goto L_0x0027
        L_0x00c4:
            r0 = 2131231750(0x7f080406, float:1.807959E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H15.A06(X.H15):void");
    }

    public static void A07(H15 h15) {
        View findViewById;
        SavedCollection savedCollection;
        SavedCollection savedCollection2 = h15.A0C;
        if (savedCollection2 != null && savedCollection2.A06() && A0A(h15) && I31.A02(h15.A05) && h15.A0X != null) {
            User user = h15.A0C.A08;
            if (user == null || user.getId().equals(h15.A05.A06)) {
                User user2 = h15.A0C.A08;
                if (user2 != null && user2.getId().equals(h15.A05.A06)) {
                    h15.A0X.A01().setVisibility(8);
                }
            } else {
                TextView A0d2 = AnonymousClass7TE.A0d(h15.A0X.A01(), R.id.composer_text);
                if (A0d2 != null) {
                    DbX.A1F(A0d2, h15, h15.A0C.A08.getUsername(), 2131970946);
                }
                AnonymousClass0fU.A00(new LWj(2), h15.A0X.A01());
                View view = h15.mView;
                if (view != null) {
                    h15.A06 = (IgEditText) view.findViewById(R.id.edit_text);
                    h15.A01 = h15.mView.findViewById(R.id.composer_container);
                    h15.A02 = h15.mView.findViewById(R.id.send_button);
                    h15.A0U = h15.mView.findViewById(R.id.dim_overlay);
                    h15.A0J = (IgBouncyUfiButtonImageView) h15.mView.findViewById(R.id.toolbar_like_button);
                    View view2 = h15.A02;
                    if (view2 != null) {
                        C56802ICz.A01(view2, 60, h15);
                    }
                    View view3 = h15.A0U;
                    if (view3 != null) {
                        C56802ICz.A01(view3, 61, h15);
                    }
                    IgEditText igEditText = h15.A06;
                    if (igEditText != null) {
                        igEditText.addTextChangedListener(new W7Z(7, h15, A0d2));
                    }
                }
                IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = h15.A0J;
                if (igBouncyUfiButtonImageView != null) {
                    boolean booleanValue = h15.A0C.A0B.booleanValue();
                    igBouncyUfiButtonImageView.A05();
                    h15.A0J.setSelected(booleanValue);
                    IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = h15.A0J;
                    int i = 2131964931;
                    if (booleanValue) {
                        i = 2131964944;
                    }
                    igBouncyUfiButtonImageView2.setContentDescription(h15.getString(i));
                    h15.A0K.A01(C51965G9l.A0v(h15.A0J));
                    C56802ICz.A01(h15.A0J, 62, h15);
                    if (!(h15.A0J == null || (savedCollection = h15.A0C) == null || savedCollection.A08 == null || !h15.isResumed() || h15.mView == null || AnonymousClass7TE.A0q(h15.A05).getBoolean(AnonymousClass000.A00(3227), false))) {
                        C315476jx r1 = new C315476jx((CharSequence) DbV.A0z(h15, h15.A0C.A08.getUsername(), 2131972620));
                        Activity rootActivity = h15.getRootActivity();
                        rootActivity.getClass();
                        AnonymousClass5Gt r4 = new AnonymousClass5Gt(rootActivity, r1);
                        r4.A03(h15.A0J);
                        r4.A02();
                        r4.A0F = true;
                        r4.A04 = new KSO(h15, 9);
                        AnonymousClass7TF.A0D().postDelayed(new C57751Ifs(r4), 450);
                    }
                }
                if (A0d2 != null) {
                    C56802ICz.A01(A0d2, 63, h15);
                }
            }
            if (h15.A0O) {
                C71662eb r12 = h15.A0X;
                if (r12.A00 != null && (findViewById = r12.A01().findViewById(R.id.toolbar_reshare_button)) != null) {
                    C56802ICz.A01(findViewById, 64, h15);
                }
            }
        }
    }

    public static void A08(H15 h15) {
        if (h15.A0I != null) {
            Integer num = h15.A0Z.A03.A03;
            Integer num2 = AnonymousClass05K.A00;
            boolean A1W = AnonymousClass7TF.A1W(num, num2);
            Integer num3 = AnonymousClass05K.A01;
            boolean A1W2 = AnonymousClass7TF.A1W(num, num3);
            boolean z = !h15.A0B.A03();
            if (A1W || A1W2 || z) {
                h15.A0I.setVisibility(0);
                EmptyStateView emptyStateView = h15.A0I;
                Integer num4 = h15.A0Z.A03.A03;
                if (num4 == num2) {
                    emptyStateView.A0L();
                } else if (num4 == num3) {
                    emptyStateView.A0J();
                } else {
                    emptyStateView.A0I();
                    emptyStateView.A0H();
                }
            } else {
                h15.A0I.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1.A07(r4.A05.A06) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A(X.H15 r4) {
        /*
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            r3 = 0
            if (r1 == 0) goto L_0x003f
            com.instagram.common.session.UserSession r0 = r4.A05
            boolean r0 = X.I31.A01(r0)
            if (r0 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.String r0 = r0.A06
            boolean r0 = r1.A07(r0)
            if (r0 != 0) goto L_0x001b
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r1.A05
            if (r0 == 0) goto L_0x0040
        L_0x001b:
            r2 = 1
        L_0x001c:
            com.instagram.common.session.UserSession r0 = r4.A05
            boolean r0 = X.I31.A00(r0)
            if (r0 == 0) goto L_0x002f
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.String r0 = r0.A06
            boolean r1 = r1.A07(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r2 != 0) goto L_0x0035
            r2 = 0
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            X.HMw r1 = r4.A0E
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 == r0) goto L_0x003f
            if (r2 == 0) goto L_0x003f
            r3 = 1
        L_0x003f:
            return r3
        L_0x0040:
            r2 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H15.A0A(X.H15):boolean");
    }

    public final void Cu3() {
        if (this.A0C != null) {
            ArrayList A012 = this.A0B.A01();
            I6H i6h = new I6H(requireActivity(), this.A05, this, (C249763kK) null);
            SavedCollection savedCollection = this.A0C;
            IXN ixn = new IXN(2, this, A012);
            i6h.A05((1Xj) A012.get(0), new IXL(2, this, A012), ixn, savedCollection);
        }
    }

    public final void DMr(int i, boolean z) {
        FragmentActivity requireActivity;
        int A0F2;
        if (this.mView != null && this.A06 != null && this.A01 != null && this.A0U != null && this.A0X != null && this.A0R && I31.A02(this.A05)) {
            if (i > 100) {
                this.A06.requestFocus();
                if (getRootActivity() instanceof AnonymousClass2ZP) {
                    this.A01.setTranslationY(((float) (this.mView.getTop() - i)) - 0nA.A04(this.mView.getContext(), 56));
                } else {
                    this.A0X.A01().setVisibility(8);
                }
                this.A0U.setVisibility(0);
                this.A0b = true;
                2dZ.A0t.A04(this).A0T();
                int rgb = Color.rgb(0, 0, 0);
                requireActivity = requireActivity();
                A0F2 = C51973G9u.A01(rgb, 80);
            } else {
                this.A0R = false;
                this.A06.clearFocus();
                this.A01.setVisibility(8);
                this.A0U.setVisibility(8);
                this.A0b = false;
                2dZ.A0t.A04(this).A0T();
                if (!(getRootActivity() instanceof AnonymousClass2ZP)) {
                    this.A0X.A01().setVisibility(0);
                }
                requireActivity = requireActivity();
                A0F2 = 2Yu.A0F(requireContext(), R.attr.statusBarBackgroundColor);
            }
            2db.A02(requireActivity, A0F2);
        }
    }

    public final void DSR() {
        if (this.A0C != null) {
            ArrayList A012 = this.A0B.A01();
            C57861Ihe ihe = new C57861Ihe(this, A012);
            I6H i6h = new I6H(requireActivity(), this.A05, this, (C249763kK) null);
            SavedCollection savedCollection = this.A0C;
            IXO ixo = new IXO(this, ihe, A012);
            i6h.A06((1Xj) A012.get(0), new IXM(this, ihe, A012), ixo, savedCollection);
        }
    }

    public final void DdM() {
        this.A0G.A01(new C56718I8y(9, (Object) this, (Object) this.A0B.A01()));
    }

    public final void Dv7() {
        ArrayList A012 = this.A0B.A01();
        this.A0G.A02(new C56718I8y(8, (Object) this, (Object) A012), A012.size());
    }

    public final String getModuleName() {
        SavedCollection savedCollection = this.A0C;
        if (savedCollection == null || !savedCollection.A06() || savedCollection.A07(this.A05.A06)) {
            return "feed_saved_collections";
        }
        return "feed_saved_collections_nonself";
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        if (!this.A0B.A05) {
            return this.A0S;
        }
        A02(this);
        return true;
    }

    public static int A00(List list) {
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1F.add(C51971G9r.A0v(it));
        }
        return A1F.size();
    }

    public static void A01(H15 h15) {
        Context requireContext = h15.requireContext();
        C49952FGh.A06(requireContext, requireContext.getString(2131975944), requireContext.getString(2131961740));
    }

    public static void A09(H15 h15, int i) {
        if (A0A(h15)) {
            h15.A00 -= i;
            return;
        }
        SavedCollection savedCollection = h15.A0C;
        if (savedCollection != null) {
            savedCollection.A0E = Integer.valueOf(AnonymousClass7TG.A0A(savedCollection.A0E) - i);
        }
    }

    public final 0jB E4k() {
        0jB A0k = C51965G9l.A0k();
        A0k.A04(C52240GKh.A00, this.A0L);
        SavedCollection savedCollection = this.A0C;
        if (savedCollection != null) {
            A0k.A04(C52240GKh.A01, savedCollection.A0G);
        }
        return A0k;
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L_0x00a3
            r0 = 1
            r5.Eu4(r0)
            X.IaN r0 = r4.A0B
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0013
            X.Dbc.A0k(r5)
        L_0x0013:
            boolean r0 = r4.A0T
            r3 = 0
            if (r0 == 0) goto L_0x00a4
            r0 = 2131970939(0x7f134b7b, float:1.9578843E38)
        L_0x001b:
            r5.Eom(r0)
        L_0x001e:
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x0033
            int r1 = android.graphics.Color.rgb(r3, r3, r3)
            r0 = 80
            int r0 = X.C51973G9u.A01(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r0)
            r5.ENd(r0)
        L_0x0033:
            X.HMH r1 = r4.A0A
            X.HMH r0 = X.HMH.COLLECTION_FEED
            if (r1 != r0) goto L_0x006b
            X.IaN r0 = r4.A0B
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x006b
            X.HqZ r0 = r4.A0H
            X.JR5 r2 = r0.A02
            com.instagram.save.model.SavedCollection r0 = r2.Aog()
            if (r0 == 0) goto L_0x006b
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x0055
            boolean r0 = r2.CJz()
            if (r0 == 0) goto L_0x006b
        L_0x0055:
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x006b
            X.3JR r1 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A02(r0)
            r0 = 66
            X.ICz r0 = X.C56802ICz.A00(r4, r0)
            X.DbX.A19(r0, r1, r5)
        L_0x006b:
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x00a3
            com.instagram.user.model.User r0 = r1.A08
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = r0.getId()
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.String r0 = r0.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a3
            boolean r0 = A0A(r4)
            if (r0 == 0) goto L_0x00a3
            X.3JR r1 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A02(r0)
            r0 = 67
            X.ICz r0 = X.C56802ICz.A00(r4, r0)
            X.DbX.A19(r0, r1, r5)
        L_0x00a3:
            return
        L_0x00a4:
            X.IaN r1 = r4.A0B
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x00ca
            X.IaN r0 = r4.A0B
            java.util.ArrayList r0 = r0.A01()
            int r2 = r0.size()
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131820945(0x7f110191, float:1.927462E38)
            java.lang.String r0 = X.DbY.A0d(r1, r2, r0)
        L_0x00c5:
            r5.setTitle(r0)
            goto L_0x001e
        L_0x00ca:
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L_0x00da
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.MEDIA
            if (r1 != r0) goto L_0x00df
            X.HMH r1 = r4.A0A
            X.HMH r0 = X.HMH.COLLECTION_FEED_PREVIEW
            if (r1 != r0) goto L_0x00df
        L_0x00da:
            r0 = 2131972515(0x7f1351a3, float:1.958204E38)
            goto L_0x001b
        L_0x00df:
            boolean r0 = A0A(r4)
            if (r0 != 0) goto L_0x00da
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.String r0 = r0.A0G
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H15.configureActionBar(X.2da):void");
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.0iw, X.H15, androidx.fragment.app.Fragment, X.4DJ, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005c, code lost:
        if (X.182.A06(r7, r8, 36329796917084493L) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 214074884(0xcc28604, float:2.997109E-31)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r9 = r14
            X.H15.super.onCreate(r15)
            android.os.Bundle r6 = r14.requireArguments()
            android.content.Context r3 = r14.requireContext()
            com.instagram.common.session.UserSession r5 = X.DbX.A0U(r14)
            r14.A05 = r5
            r4 = 31792043(0x1e51bab, float:8.4161016E-38)
            java.lang.String r0 = "saved_tabs"
            X.Dbx r1 = new X.Dbx
            r1.<init>(r5, r0, r4)
            r14.A03 = r1
            com.instagram.common.session.UserSession r0 = r14.A05
            X.2cc r0 = X.C71342cb.A00(r0)
            r1.A0O(r3, r0, r14, r14)
            com.instagram.common.session.UserSession r0 = r14.A05
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            r14.A04 = r0
            r4 = 0
            X.3E5 r0 = X.AnonymousClass3E4.A01(r14, r4, r4)
            r14.A0V = r0
            com.instagram.common.session.UserSession r5 = r14.A05
            X.0Tu r7 = X.0Tu.A05
            r0 = 36321185507910809(0x8109ed00052499, double:3.033002196653144E-306)
            boolean r0 = X.DbY.A1Y(r7, r5, r0)
            r5 = 1
            if (r0 == 0) goto L_0x005e
            com.instagram.common.session.UserSession r8 = r14.A05
            X.0qQ.A0B(r8, r4)
            r0 = 36329796917084493(0x8111c20001414d, double:3.038448086489943E-306)
            boolean r1 = X.182.A06(r7, r8, r0)
            r0 = 1
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            r14.A0P = r0
            java.lang.String r0 = "SaveFragment.SAVE_HOME_TAB_MODE"
            java.io.Serializable r0 = r6.getSerializable(r0)
            r0.getClass()
            X.HMH r0 = (X.HMH) r0
            r14.A0A = r0
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            android.os.Parcelable r1 = r6.getParcelable(r0)
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            r14.A0C = r1
            if (r1 == 0) goto L_0x017f
            java.lang.String r0 = r1.A0F
            r14.A0L = r0
            X.HMw r0 = r1.A07
        L_0x0080:
            r14.A0E = r0
            java.lang.String r0 = "prior_module"
            java.lang.String r0 = r6.getString(r0)
            r0.getClass()
            r14.A0M = r0
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_COLLECTION_STARTING_TAB_TYPE"
            java.io.Serializable r0 = r6.getSerializable(r0)
            X.HMV r0 = (X.HMV) r0
            r14.A0D = r0
            com.instagram.common.session.UserSession r6 = r14.A05
            r0 = 36326111835076106(0x810e680000360a, double:3.036117625789205E-306)
            boolean r6 = X.DbY.A1Y(r7, r6, r0)
            X.0hq r1 = r14.getChildFragmentManager()
            X.IaN r0 = new X.IaN
            r0.<init>(r1, r6)
            r14.A0B = r0
            X.5xz r0 = new X.5xz
            r0.<init>()
            r14.A0K = r0
            X.JR5 r6 = r14.A0h
            com.instagram.common.session.UserSession r1 = r14.A05
            X.HqZ r0 = new X.HqZ
            r0.<init>(r3, r14, r1, r6)
            r14.A0H = r0
            X.I1X r0 = new X.I1X
            r0.<init>(r3)
            r14.A0G = r0
            com.instagram.common.session.UserSession r0 = r14.A05
            X.6z9 r0 = X.C51970G9q.A0g(r3, r14, r0)
            r14.A0Z = r0
            X.1Ng r3 = r14.A04
            java.lang.Class<X.INo> r1 = X.C57074INo.class
            X.1wn r0 = r14.A0e
            r3.A01(r0, r1)
            java.lang.Class<X.INr> r1 = X.C57077INr.class
            X.1wn r0 = r14.A0d
            r3.A01(r0, r1)
            com.instagram.save.model.SavedCollection r0 = r14.A0C
            if (r0 == 0) goto L_0x00ed
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = "my_favs"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ed
            r4 = 1
        L_0x00ed:
            r14.A0T = r4
            if (r4 != 0) goto L_0x00f4
            A03(r14)
        L_0x00f4:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.SHARE_COLLECTION_BUTTON
            X.IWW r0 = new X.IWW
            r0.<init>(r14)
            r3.put(r1, r0)
            X.1YN r1 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r0 = r14.A05
            X.2qT r0 = r1.A04(r0, r3)
            r14.A08 = r0
            r14.registerLifecycleListener(r0)
            X.1YN r8 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r11 = r14.A05
            com.instagram.quickpromotion.intf.QuickPromotionSlot r13 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0u
            X.AnonymousClass2bO.A00()
            r0 = 2
            X.IWV r1 = new X.IWV
            r1.<init>(r14, r0)
            X.2qT r0 = r14.A08
            X.2bW r12 = X.2bV.A06(r1, r0)
            r10 = r14
            X.2qi r0 = r8.A01(r9, r10, r11, r12, r13)
            r14.A07 = r0
            com.instagram.save.model.SavedCollection r4 = r14.A0C
            if (r4 == 0) goto L_0x0140
            com.instagram.common.session.UserSession r3 = r14.A05
            java.lang.String r1 = r14.getModuleName()
            java.lang.String r0 = r14.A0M
            X.I34.A02(r3, r4, r1, r0)
            r14.A0Q = r5
        L_0x0140:
            android.app.Activity r0 = r14.getRootActivity()
            boolean r0 = r0 instanceof X.AnonymousClass2ZP
            if (r0 == 0) goto L_0x0178
            com.instagram.save.model.SavedCollection r0 = r14.A0C
            if (r0 == 0) goto L_0x0178
            com.instagram.user.model.User r0 = r0.A08
            if (r0 == 0) goto L_0x0178
            java.lang.String r1 = r0.getId()
            com.instagram.common.session.UserSession r0 = r14.A05
            java.lang.String r0 = r0.A06
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0178
            boolean r0 = A0A(r14)
            if (r0 == 0) goto L_0x0178
            com.instagram.common.session.UserSession r0 = r14.A05
            boolean r0 = X.I31.A02(r0)
            if (r0 == 0) goto L_0x0178
            android.app.Activity r1 = r14.getRootActivity()
            X.EE7 r0 = new X.EE7
            r0.<init>(r1)
            r14.registerLifecycleListener(r0)
        L_0x0178:
            r0 = 614482296(0x24a04178, float:6.949985E-17)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x017f:
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_ID"
            java.lang.String r0 = r6.getString(r0)
            r0.getClass()
            r14.A0L = r0
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_TYPE"
            java.io.Serializable r0 = r6.getSerializable(r0)
            r0.getClass()
            X.HMw r0 = (X.C54665HMw) r0
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H15.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1639614600);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_save_collection_tabbed_viewpager);
        AnonymousClass0fD.A09(1946826500, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1020104158);
        super.onDestroy();
        UserSession userSession = this.A05;
        0qQ.A0B(userSession, 0);
        C57095IOj iOj = (C57095IOj) userSession.A01(C57095IOj.class, C58486Ish.A00);
        iOj.A01.clear();
        iOj.A00 = false;
        1Ng r2 = this.A04;
        r2.A02(this.A0e, C57074INo.class);
        r2.A02(this.A0d, C57077INr.class);
        unregisterLifecycleListener(this.A08);
        AnonymousClass0fD.A09(-1946316983, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r13 = this;
            r0 = -1945377505(0xffffffff8c0be51f, float:-1.0777119E-31)
            int r1 = X.AnonymousClass0fD.A02(r0)
            super.onDestroyView()
            com.instagram.common.session.UserSession r4 = r13.A05
            java.lang.String r7 = r13.getModuleName()
            java.lang.String r8 = r13.A0M
            com.instagram.save.model.SavedCollection r3 = r13.A0C
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r2 = X.DbW.A1Y(r8)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r9 = 0
            if (r3 == 0) goto L_0x0096
            java.lang.Integer r0 = r3.A01(r4)
            java.lang.String r10 = X.I35.A01(r0)
            java.lang.String r11 = r3.A0F
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r3.A05
            if (r0 == 0) goto L_0x008d
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x0031:
            java.lang.String r12 = r3.A0G
        L_0x0033:
            X.I34.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.IaN r2 = r13.A0B
            com.google.android.material.tabs.TabLayout r0 = r2.A03
            if (r0 == 0) goto L_0x003f
            r0.setupWithViewPager(r9)
        L_0x003f:
            r2.A03 = r9
            r2.A01 = r9
            r2.A02 = r9
            r13.A0I = r9
            r13.A0F = r9
            r13.A0W = r9
            r13.A0Y = r9
            r13.A0a = r9
            boolean r0 = A0A(r13)
            if (r0 == 0) goto L_0x0081
            com.instagram.common.session.UserSession r0 = r13.A05
            boolean r0 = X.I31.A02(r0)
            if (r0 == 0) goto L_0x0081
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            int r2 = X.2db.A00(r0)
            android.content.Context r0 = r13.requireContext()
            r3 = 2130971249(0x7f040a71, float:1.7551231E38)
            int r0 = X.2Yu.A0F(r0, r3)
            if (r2 == r0) goto L_0x0081
            androidx.fragment.app.FragmentActivity r2 = r13.requireActivity()
            android.content.Context r0 = r13.requireContext()
            int r0 = X.2Yu.A0F(r0, r3)
            X.2db.A02(r2, r0)
        L_0x0081:
            X.5xz r0 = r13.A0K
            r0.A01(r9)
            r0 = 1207065139(0x47f25a33, float:124084.4)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x008d:
            boolean r0 = r3.A06()
            if (r0 != r2) goto L_0x0099
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x0031
        L_0x0096:
            java.lang.String r10 = "null"
            r11 = r9
        L_0x0099:
            r6 = r9
            if (r3 != 0) goto L_0x0031
            r12 = r9
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H15.onDestroyView():void");
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2037219426);
        H15.super.onPause();
        A02(this);
        this.A0V.EEH(this);
        AnonymousClass0fD.A09(-1487082882, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-972832836);
        this.A0V.A9Y(this);
        super.onResume();
        AnonymousClass0fD.A09(-621434008, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1704373293);
        H15.super.onStart();
        this.A0V.DmJ(getActivity());
        AnonymousClass0fD.A09(134716865, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1171234918);
        H15.super.onStop();
        this.A0V.onStop();
        AnonymousClass0fD.A09(-293783900, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C57417IaN iaN = this.A0B;
        0qQ.A0B(view, 0);
        iaN.A03 = (TabLayout) view.requireViewById(R.id.save_collection_tab_layout);
        iaN.A01 = view.requireViewById(R.id.save_collection_tabs_bottom_divider);
        iaN.A02 = view.requireViewById(R.id.save_collection_viewpager);
        Context context = view.getContext();
        iaN.A00 = AnonymousClass7TF.A03(context, R.attr.glyphColorPrimary);
        TabLayout tabLayout = iaN.A03;
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(iaN.A02);
        }
        TabLayout tabLayout2 = iaN.A03;
        if (tabLayout2 != null) {
            tabLayout2.A0C = iaN.A00;
            DbT.A16(context, tabLayout2, 2Yu.A0C(context));
        }
        ViewPager viewPager = iaN.A02;
        if (viewPager != null) {
            viewPager.setAdapter(iaN.A06);
        }
        iaN.A04 = AnonymousClass7TE.A1E();
        C57417IaN.A00(iaN);
        this.A0I = (EmptyStateView) view.requireViewById(R.id.empty);
        C56080HsT hsT = new C56080HsT((LinearLayout) view.requireViewById(R.id.bulk_actions_container), true);
        this.A0F = hsT;
        if (!this.A0T) {
            hsT.A01(requireContext(), this.A0E, this);
        }
        this.A0W = DbY.A0S(view, R.id.save_collection_header_stub);
        this.A0Y = DbY.A0S(view, R.id.public_save_collection_header_stub);
        this.A0X = DbY.A0S(view, R.id.public_collections_composer_container);
        A04(this);
        A06(this);
        A07(this);
        C55815Hnv hnv = this.A0a;
        if (hnv != null && hnv.A03.getVisibility() == 0) {
            UserSession userSession = this.A05;
            String moduleName = getModuleName();
            SavedCollection savedCollection = this.A0C;
            if (savedCollection != null) {
                str = I35.A01(savedCollection.A01(this.A05));
            } else {
                str = null;
            }
            0qQ.A0B(userSession, 0);
            I34.A01(userSession, AnonymousClass05K.A0C, moduleName, (String) null, str);
            C230882qT r3 = this.A08;
            C231002qi r2 = this.A07;
            r3.A00(hnv.A03, QPTooltipAnchor.SHARE_COLLECTION_BUTTON, r2);
            this.A07.Dh3();
        }
    }
}
