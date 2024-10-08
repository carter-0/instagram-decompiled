package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.quicklog.EventBuilder;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Der  reason: case insensitive filesystem */
public final class C46430Der extends AnonymousClass32G implements AnonymousClass0iw, AnonymousClass4DU, AnonymousClass4DR, C273494mf, AbsListView.OnScrollListener, G7N, C51960G9g, AnonymousClass32I, AnonymousClass4DS, C51923G7r, C51885G6a, AnonymousClass4Zh, AnonymousClass32K, G6S, G6T, G6X, G5J {
    public static final String __redex_internal_original_name = "FollowListFragment";
    public int A00;
    public int A01 = 1;
    public ViewGroup A02;
    public 0wc A03;
    public 1Xl A04;
    public C324466zK A05;
    public 1vn A06;
    public C49945FFy A07;
    public C46730DkJ A08;
    public C320106rm A09;
    public AnonymousClass3AD A0A;
    public TypeaheadHeader A0B;
    public User A0C;
    public FollowListData A0D;
    public C46435Dex A0E;
    public F05 A0F;
    public F28 A0G;
    public C48104EVw A0H = C48104EVw.DEFAULT;
    public C47291DuK A0I;
    public C46434Dew A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R = "";
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z = true;
    public boolean A0a;
    public boolean A0b = true;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public TextView A0f;
    public 1OC A0g;
    public AnonymousClass32A A0h;
    public AnonymousClass7Q8 A0i;
    public C46432Det A0j;
    public String A0k;
    public List A0l = 0sn.A00;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public final AnonymousClass0eM A0s = AnonymousClass0eN.A01(new C51796G2f(this, 37));
    public final AnonymousClass0eM A0t = AnonymousClass0eN.A01(new C51796G2f(this, 38));
    public final AnonymousClass0eM A0u = C51796G2f.A00(this, 40);
    public final Handler A0v = AnonymousClass7TF.A0D();
    public final 1wn A0w = new FXT(this, 0);
    public final 1wn A0x = FX1.A00(this, 30);
    public final 1wn A0y = FX1.A00(this, 31);
    public final C228172ku A0z = new C228172ku();
    public final EUR A10 = new EUR(this);
    public final EUS A11 = new EUS(this);
    public final Map A12 = AnonymousClass7TE.A1H();
    public final Set A13 = DbS.A0y();
    public final Set A14 = DbS.A0y();
    public final AnonymousClass0eM A15 = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r1 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (X.0qQ.A0K(r10.A0M, "non_recip_followers") == false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(X.C46430Der r10, java.util.List r11) {
        /*
            r5 = r11
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0118
            boolean r0 = r10.A0U
            if (r0 == 0) goto L_0x0029
            com.instagram.user.recommended.FollowListData r0 = r10.A0D
            if (r0 == 0) goto L_0x010e
            X.Df5 r1 = r0.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r1 != r0) goto L_0x0029
            java.util.Iterator r2 = r11.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0029
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            r1.A0n(r0)
            goto L_0x0019
        L_0x0029:
            com.instagram.common.session.UserSession r2 = A03(r10)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0Tu r3 = X.0Tu.A06
            r0 = 36327335900756311(0x810f8500003957, double:3.0368917298542834E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x005b
            com.instagram.user.recommended.FollowListData r0 = r10.A0D
            java.lang.String r2 = "followListData"
            if (r0 == 0) goto L_0x0110
            X.Df5 r1 = r0.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r1 != r0) goto L_0x005b
            com.instagram.common.session.UserSession r1 = A03(r10)
            com.instagram.user.recommended.FollowListData r0 = r10.A0D
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = r0.A02
            boolean r1 = X.2R8.A05(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r8 = 1
            if (r0 == 0) goto L_0x0071
            java.util.Iterator r1 = r11.iterator()
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0071
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            r0.A13(r8)
            goto L_0x0063
        L_0x0071:
            com.instagram.user.recommended.FollowListData r0 = r10.A0D
            if (r0 == 0) goto L_0x010e
            X.Df5 r1 = r0.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r1 == r0) goto L_0x00b8
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r1 == r0) goto L_0x00b8
            X.Df5 r0 = X.C46443Df5.FOLLOWING_SIMPLIFIED
            if (r1 == r0) goto L_0x00b8
            com.instagram.common.session.UserSession r4 = A03(r10)
            boolean r8 = r10.A0S
            com.instagram.common.session.UserSession r2 = X.DbU.A0W(r10)
            r0 = 36327443274938815(0x810f9e000039bf, double:3.03695963371966E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00ad
            com.instagram.user.recommended.FollowListData r0 = r10.A0D
            if (r0 == 0) goto L_0x010e
            X.Df5 r1 = r0.A00
            X.Df5 r0 = X.C46443Df5.GROUP_FOLLOWERS
            if (r1 != r0) goto L_0x00ad
            java.lang.String r1 = r10.A0M
            java.lang.String r0 = "non_recip_followers"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r9 = 1
            if (r0 != 0) goto L_0x00ae
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            r6 = 0
            X.1OC r0 = X.C320126ro.A04(r4, r5, r6, r8, r9)
        L_0x00b4:
            r10.schedule(r0)
            return
        L_0x00b8:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r11.iterator()
        L_0x00c0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.4Cl r0 = r1.A03
            com.instagram.user.model.FriendshipStatus r0 = r0.B8F()
            if (r0 == 0) goto L_0x00f7
            X.4Cl r0 = r1.A03
            com.instagram.user.model.FriendshipStatus r0 = r0.B8F()
            if (r0 == 0) goto L_0x00f7
            java.lang.Boolean r0 = r0.B6y()
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r1.A2B()
            if (r0 != 0) goto L_0x00f7
            X.4Cl r0 = r1.A03
            com.instagram.user.model.FriendshipStatus r0 = r0.B8F()
            if (r0 == 0) goto L_0x00f7
            java.lang.Boolean r0 = r0.BZS()
            if (r0 != 0) goto L_0x00c0
        L_0x00f7:
            r4.add(r2)
            goto L_0x00c0
        L_0x00fb:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x0118
            com.instagram.common.session.UserSession r3 = A03(r10)
            boolean r7 = r10.A0S
            r5 = 0
            X.1OC r0 = X.C320126ro.A04(r3, r4, r5, r7, r8)
            goto L_0x00b4
        L_0x010e:
            java.lang.String r2 = "followListData"
        L_0x0110:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.A0M(X.Der, java.util.List):void");
    }

    public final void D2K(IgImageView igImageView, 1Xl r9, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TF.A1C(r9, 0, igImageView);
        C271794jb r4 = new C271794jb(A03(this), r9);
        r4.A00 = i2;
        r4.A01 = i;
        Q03 q03 = new Q03(this, A03(this), r4, this, 2EG.A2D);
        q03.A00(igImageView, r4, Dbb.A0N(r9, q03, i2, i));
        if (r9 instanceof AnonymousClass3OA) {
            q03.A0O = (AnonymousClass3OA) r9;
        }
        new Q02(q03).A02();
    }

    public final void D2p(User user) {
        0qQ.A0B(user, 0);
        F8H.A00(this, A03(this), user);
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        0qQ.A0B(gradientSpinnerAvatarView, 1);
        Reel reel2 = reel;
        List A1I = AnonymousClass7TE.A1I(reel);
        AnonymousClass32A r3 = this.A0h;
        if (r3 == null) {
            0qQ.A0F("reelViewerLauncher");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.A0C = this.A0k;
        C50896Fkb.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 16);
        r3.A09(reel2, AnonymousClass3BQ.FOLLOW_LIST, gradientSpinnerAvatarView2, A1I, A1I, A1I);
    }

    public final void D33(SparseArray sparseArray, Integer num) {
    }

    public final void D34() {
    }

    public final void D35() {
    }

    public final void D37(SparseArray sparseArray) {
        A0Q(true);
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DSJ(View view, User user, boolean z) {
        C49945FFy fFy;
        Context context = getContext();
        if (context != null) {
            User user2 = user;
            DbZ.A0G(this.A03, user2, "follow_list_overflow_menu_tapped").Cgf();
            String str = this.A0M;
            if (str == null || !str.equals("potential_spam")) {
                FollowListData followListData = this.A0D;
                if (followListData == null) {
                    0qQ.A0F("followListData");
                    throw AnonymousClass00P.createAndThrow();
                }
                int ordinal = followListData.A00.ordinal();
                View view2 = view;
                if (ordinal == 1 || ordinal == 8) {
                    C46498Dg1 dg1 = new C46498Dg1(context, A03(this));
                    dg1.A08(user2.getUsername());
                    dg1.A07(user2.Bh3());
                    dg1.A0C(AnonymousClass7TE.A16(context, 2131965839), new C50102FOs(context, user2, this, 5));
                    UserSession A0W2 = DbU.A0W(this);
                    0Tu r9 = 0Tu.A05;
                    if (182.A06(r9, A0W2, 36319093858507671L)) {
                        dg1.A0C(AnonymousClass7TE.A16(context, 2131973887), new C50102FOs(context, user2, this, 3));
                    }
                    dg1.A0C(AnonymousClass7TE.A16(context, 2131967919), new C50102FOs(context, user2, this, 4));
                    if (DbV.A0i(A03(this), user2) == FollowStatus.A05 && z) {
                        dg1.A0A(AnonymousClass7TE.A16(context, 2131975854), new FP7(31, (Object) user2, (Object) this));
                    }
                    if (view == null || !182.A06(r9, DbU.A0W(this), 36328040275393412L)) {
                        dg1.A03 = new C65348Lro(3, user2, this);
                        fFy = new C49945FFy(dg1);
                        this.A07 = fFy;
                    } else {
                        C355148Ov r8 = new C355148Ov(context, A03(this), (Integer) null, false);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (C67293MlS mlS : dg1.A09) {
                            String str2 = mlS.A04;
                            if (str2 == null) {
                                str2 = "";
                            }
                            int i = mlS.A08;
                            A1C.add(new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new C50480FcS(mlS, 3), Integer.valueOf(i), str2, 0, 0, 0, false, false, false, true, false, false, false));
                        }
                        r8.A02(A1C);
                        r8.A01(view2);
                        return;
                    }
                } else {
                    if (view != null) {
                        if (182.A06(0Tu.A05, DbU.A0W(this), 36326683065726883L)) {
                            FragmentActivity requireActivity = requireActivity();
                            UserSession A032 = A03(this);
                            C20614Wvv wvv = new C20614Wvv(25, user2, this);
                            C20614Wvv wvv2 = new C20614Wvv(26, user2, this);
                            C20614Wvv wvv3 = new C20614Wvv(27, user2, this);
                            boolean A1Y = DbW.A1Y(A032);
                            C355148Ov r3 = new C355148Ov(context, A032, (Integer) null, false);
                            C367618rI r12 = new C367618rI(context.getDrawable(R.drawable.instagram_user_circle_pano_outline_24), (Drawable) null, (C15048ULb) null, new C50488Fca(0, requireActivity, context, A032, user2), (Integer) null, AnonymousClass7TF.A0d(context.getResources(), 2131951989), 0, 0, 0, false, false, false, A1Y, false, false, false);
                            String A0d2 = AnonymousClass7TF.A0d(context.getResources(), 2131971974);
                            int A033 = 2Yu.A03(context);
                            User user3 = user2;
                            boolean z2 = A1Y;
                            r3.A02(0sr.A1P(new C367618rI[]{r12, new C367618rI(context.getDrawable(R.drawable.instagram_user_unfollow_pano_outline_24), (Drawable) null, (C15048ULb) null, new C50488Fca(A1Y ? 1 : 0, context, wvv, user3, wvv3), Integer.valueOf(A033), A0d2, 0, 0, 0, false, false, false, z2, false, false, false), new C367618rI(context.getDrawable(R.drawable.instagram_circle_block_off_pano_outline_24), (Drawable) null, (C15048ULb) null, new C50490Fcc(context, this, A032, user3, wvv2), Integer.valueOf(2Yu.A03(context)), AnonymousClass7TF.A0d(context.getResources(), 2131953909), 0, 0, 0, false, false, false, z2, false, false, false)}));
                            View contentView = r3.getContentView();
                            if (contentView != null) {
                                contentView.measure(0, 0);
                                int A012 = DbY.A01(context);
                                r3.showAsDropDown(view2, -(contentView.getMeasuredWidth() - A012), A012, 8388613);
                                return;
                            }
                            r3.showAsDropDown(view2);
                            return;
                        }
                    }
                    A0A(context, user2);
                    return;
                }
            } else {
                C46498Dg1 dg12 = new C46498Dg1(context, A03(this));
                dg12.A08(user2.getUsername());
                dg12.A07(user2.Bh3());
                dg12.A03(new FP7(30, (Object) user2, (Object) this), 2131965866);
                dg12.A04(C50097FOn.A00, 2131954722);
                fFy = new C49945FFy(dg12);
            }
            fFy.A03(requireActivity());
        }
    }

    public final void DhN() {
    }

    public final void Dln(C48104EVw eVw) {
        if (this.A0H != eVw) {
            A0R(AnonymousClass7TF.A1W(eVw, C48104EVw.DEFAULT));
            this.A0H = eVw;
            C46435Dex dex = this.A0E;
            if (dex == null) {
                0qQ.A0F("followListAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            dex.A09 = C49188Eqt.A00(dex.A0O, eVw);
            dex.A0G(false, false);
            A03(this);
            02m.A0p.markEventBuilder(224332946, "sorting_option_selected").annotate("list_title", A05(this)).annotate("sorting_option", eVw.toString()).report();
            A06();
        }
    }

    public final void EG6(UserSession userSession, int i) {
        String id;
        String str;
        FollowListData followListData;
        String moduleName;
        ImmutableList A092;
        C46443Df5 df5;
        int i2 = i;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        C46435Dex dex = this.A0E;
        String str2 = "followListAdapter";
        Integer num = null;
        if (dex != null) {
            List list = dex.A0B;
            if (list != null) {
                if (i < list.size()) {
                    G90 g90 = (G90) list.get(i);
                    String A002 = C49187Eqs.A00(g90.B9u(), g90.getCategory());
                    if (this.A13.add(A002)) {
                        0Aj A0e2 = AnonymousClass7TE.A0e(this.A03, "user_list_group_impression");
                        A0e2.AAJ("group_name", A002);
                        A0e2.Cgf();
                        return;
                    }
                    return;
                }
                i2 = i - list.size();
            }
            C46435Dex dex2 = this.A0E;
            if (dex2 != null) {
                if (i2 < dex2.A0C.size()) {
                    C46435Dex dex3 = this.A0E;
                    if (dex3 != null) {
                        User user = (User) dex3.A0C.get(i2);
                        if (this.A14.add(user.getId())) {
                            FollowListData followListData2 = this.A0D;
                            str2 = "followListData";
                            if (followListData2 != null) {
                                if (2R8.A07(userSession.A06, followListData2.A02)) {
                                    C46443Df5 df52 = followListData2.A00;
                                    if (df52 == C46443Df5.FOLLOWERS) {
                                        id = user.getId();
                                        df5 = C46443Df5.SELF_FOLLOWERS;
                                    } else {
                                        if (df52 == C46443Df5.FOLLOWING || df52 == C46443Df5.FOLLOWING_SIMPLIFIED) {
                                            id = user.getId();
                                            df5 = C46443Df5.SELF_FOLLOWING;
                                        }
                                        this.A12.put(user.getId(), Integer.valueOf(i2));
                                        return;
                                    }
                                    FollowListData followListData3 = this.A0D;
                                    if (followListData3 != null) {
                                        followListData = C46451DfE.A00(df5, followListData3.A02, (String) null, false);
                                        moduleName = getModuleName();
                                        str = null;
                                    }
                                } else {
                                    id = user.getId();
                                    C46432Det det = this.A0j;
                                    if (det != null) {
                                        if (det.A01()) {
                                            str = DbS.A0o(user);
                                        } else {
                                            str = null;
                                        }
                                        C46432Det det2 = this.A0j;
                                        if (det2 != null) {
                                            if (det2.A01() && (A092 = user.A09()) != null) {
                                                num = Integer.valueOf(A092.size());
                                            }
                                            followListData = this.A0D;
                                            if (followListData != null) {
                                                moduleName = getModuleName();
                                            }
                                        }
                                    }
                                    0qQ.A0F("followListParams");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                F87.A00(userSession2, followListData, num, id, str, moduleName, i2);
                                this.A12.put(user.getId(), Integer.valueOf(i2));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r2 = X.DbU.A0m(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r2 = getString(r0);
        X.0qQ.A0A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r1 = (X.2dZ) r5;
        r1.AHX();
        X.2dZ.A0K(r1, r2, false, true);
        r5.Eu4(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4.A0m == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r2 = X.DbZ.A0D(r4, r1);
        X.DbU.A1G(r2, r4, 2131965823);
        r1 = r2.getContext();
        X.DbT.A17(r1, r2, X.2Yu.A0H(r1, com.instagram.android.R.attr.igds_color_primary_text));
        X.FP4.A01(r2, 47, r4);
        r4.A0f = r2;
        r1 = X.DbS.A0K();
        r1.A0I = r4.A0f;
        r5.AA4(new X.AnonymousClass3Jb(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Integer r0 = r4.A0K
            if (r0 == 0) goto L_0x008b
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0039;
                case 2: goto L_0x002d;
                case 3: goto L_0x0029;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Invalid entry type for FollowListFragment"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0016:
            java.lang.String r2 = r4.A0L
            if (r2 != 0) goto L_0x004a
            java.lang.Integer r2 = r4.A0K
            if (r2 == 0) goto L_0x008b
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            r0 = 2131962634(0x7f132b0a, float:1.9561999E38)
            if (r2 != r1) goto L_0x0043
            r0 = 2131962608(0x7f132af0, float:1.9561946E38)
            goto L_0x0043
        L_0x0029:
            r0 = 2131964900(0x7f1333e4, float:1.9566595E38)
            goto L_0x0034
        L_0x002d:
            r0 = 2131962633(0x7f132b09, float:1.9561997E38)
            goto L_0x0034
        L_0x0031:
            r0 = 2131962634(0x7f132b0a, float:1.9561999E38)
        L_0x0034:
            java.lang.String r2 = X.DbU.A0m(r4, r0)
            goto L_0x004a
        L_0x0039:
            boolean r1 = r4.A0U
            r0 = 2131962608(0x7f132af0, float:1.9561946E38)
            if (r1 == 0) goto L_0x0043
            r0 = 2131967933(0x7f133fbd, float:1.9572746E38)
        L_0x0043:
            java.lang.String r2 = r4.getString(r0)
            X.0qQ.A0A(r2)
        L_0x004a:
            r0 = 1
            r1 = r5
            X.2dZ r1 = (X.2dZ) r1
            r1.AHX()
            X.2dZ.A0K(r1, r2, r3, r0)
            r5.Eu4(r0)
            boolean r0 = r4.A0m
            if (r0 == 0) goto L_0x008a
            android.widget.TextView r2 = X.DbZ.A0D(r4, r1)
            r0 = 2131965823(0x7f13377f, float:1.9568467E38)
            X.DbU.A1G(r2, r4, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r1, r2, r0)
            r0 = 47
            X.FP4.A01(r2, r0, r4)
            r4.A0f = r2
            X.3JR r1 = X.DbS.A0K()
            android.widget.TextView r0 = r4.A0f
            r1.A0I = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r5.AA4(r0)
        L_0x008a:
            return
        L_0x008b:
            java.lang.String r0 = "type"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.configureActionBar(X.2da):void");
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isScrolledToBottom() {
        return !getScrollingViewProxy().CEd().canScrollVertically(1);
    }

    public final boolean isScrolledToTop() {
        return !getScrollingViewProxy().CEd().canScrollVertically(-1);
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        1OC A0U2;
        1P0 eBq;
        ArrayList<String> stringArrayListExtra;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i4 == -1 && intent != null) {
            if (i3 == 531) {
                ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("ARG_USER_IDS");
                if (stringArrayListExtra2 != null) {
                    if (intent2.getBooleanExtra("ARG_IS_POSITIVE_ACTION", false)) {
                        A0U2 = C320126ro.A01(A03(this), DbT.A0z(", ", stringArrayListExtra2, (0sP) null));
                        eBq = new EDV(46, stringArrayListExtra2, this);
                    } else {
                        UserSession A0W2 = DbU.A0W(this);
                        1NY A0a2 = AnonymousClass7TG.A0a(A0W2);
                        A0a2.A0A("friendships/remove_all_followers/");
                        A0a2.A9m("user_ids", C320126ro.A05(stringArrayListExtra2));
                        Dbb.A1K(A0a2, new FVI(A0W2, 1), A0W2);
                        A0U2 = DbT.A0U(A0a2, true);
                        eBq = new C47656EBq(0, stringArrayListExtra2, this);
                    }
                    A0U2.A00 = eBq;
                    schedule(A0U2);
                }
            } else if (i3 == 532 && (stringArrayListExtra = intent2.getStringArrayListExtra("ARG_USER_IDS")) != null) {
                2IS A042 = C41845B3m.A04();
                2IS A043 = C41845B3m.A04();
                2IV r6 = new 2IV();
                r6.A05("user_ids", stringArrayListExtra);
                A042.A00(r6, "data");
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "BulkUnfollowAccountsMutation", A042.getParamsCopy(), A043.getParamsCopy(), C43680C5c.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__friendships__unfollow_all", AnonymousClass7TE.A1C());
                1vn r8 = this.A06;
                if (r8 == null) {
                    0qQ.A0F("graphQLQueryExecutor");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r8.ATL(new C50150FRi(2, stringArrayListExtra, this), new FSG(7, stringArrayListExtra, this), pandoGraphQLRequest);
                }
            }
        }
        super.onActivityResult(i3, i4, intent2);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUserRowClick(com.instagram.user.model.User r11) {
        /*
            r10 = this;
            r2 = 0
            java.util.Map r1 = r10.A12
            java.lang.String r0 = r11.getId()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0156
            com.instagram.common.session.UserSession r3 = A03(r10)
            com.instagram.user.recommended.FollowListData r4 = r10.A0D
            java.lang.String r7 = "followListData"
            if (r4 == 0) goto L_0x009d
            java.lang.String r5 = r11.getId()
            int r9 = r0.intValue()
            com.instagram.user.recommended.FollowListData r0 = r10.A0D
            if (r0 == 0) goto L_0x009d
            java.lang.String r7 = r0.A02
            java.lang.String r8 = r10.getModuleName()
            java.lang.String r6 = "follow_list_user_tap"
            X.F87.A01(r3, r4, r5, r6, r7, r8, r9)
        L_0x0030:
            A03(r10)
            X.02m r5 = X.02m.A0p
            java.lang.Integer r1 = r10.A0K
            java.lang.String r7 = "type"
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x0133
            java.lang.String r4 = r10.A0L
            if (r4 != 0) goto L_0x004d
            r0 = 2131962634(0x7f132b0a, float:1.9561999E38)
            java.lang.String r4 = r10.getString(r0)
            X.0qQ.A0A(r4)
        L_0x004d:
            r3 = 224332946(0xd5f0c92, float:6.873231E-31)
            java.lang.String r1 = A05(r10)
            java.lang.String r0 = "_list_user_tap"
            java.lang.String r0 = X.002.A0R(r1, r0)
            com.facebook.quicklog.EventBuilder r3 = r5.markEventBuilder(r3, r0)
            java.lang.String r1 = r11.getId()
            java.lang.String r0 = "selected_user"
            com.facebook.quicklog.EventBuilder r1 = r3.annotate(r0, r1)
            java.lang.String r0 = "position"
            com.facebook.quicklog.EventBuilder r1 = r1.annotate(r0, r9)
            java.lang.String r0 = "list_title"
            com.facebook.quicklog.EventBuilder r3 = r1.annotate(r0, r4)
            X.EVw r0 = r10.A0H
            java.lang.String r1 = r0.toString()
            r0 = 1830(0x726, float:2.564E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.facebook.quicklog.EventBuilder r3 = r3.annotate(r0, r1)
            boolean r0 = r10.A0b
            r1 = 1
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = r10.A0R
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0130
        L_0x0091:
            java.lang.String r0 = "is_searching"
            com.facebook.quicklog.EventBuilder r5 = r3.annotate(r0, r1)
            X.Dex r6 = r10.A0E
            if (r6 != 0) goto L_0x00a5
            java.lang.String r7 = "followListAdapter"
        L_0x009d:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a5:
            com.instagram.common.session.UserSession r4 = r6.A0T
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324737446785333(0x810d2800133135, double:3.0352484570999026E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x00e3
            r0 = 36324737446850870(0x810d2800143136, double:3.0352484571413484E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00e5
            int r1 = r6.A01
            java.util.List r4 = r6.A0C
            int r0 = r4.size()
            int r3 = java.lang.Math.min(r1, r0)
            r1 = 0
        L_0x00d0:
            if (r1 >= r3) goto L_0x00e5
            java.lang.Object r0 = r4.get(r1)
            java.lang.String r0 = X.DbS.A0q(r0)
            boolean r0 = X.DbV.A1Z(r11, r0)
            if (r0 != 0) goto L_0x00e3
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00e3:
            r1 = 1
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            java.lang.String r0 = "is_local_search_result"
            com.facebook.quicklog.EventBuilder r0 = r5.annotate(r0, r1)
            r0.report()
            java.lang.Integer r0 = r10.A0K
            if (r0 == 0) goto L_0x009d
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0129
            if (r1 == r2) goto L_0x0126
            java.lang.String r3 = "follow_list_user_row"
        L_0x00fe:
            com.instagram.common.session.UserSession r2 = A03(r10)
            java.lang.String r1 = r11.getId()
            java.lang.String r0 = r10.getModuleName()
            X.Dfc r1 = X.C46548Dgp.A01(r2, r1, r3, r0)
            boolean r0 = r10.A0n
            r1.A0T = r0
            com.instagram.profile.intf.UserDetailLaunchConfig r3 = r1.A04()
            boolean r0 = r10.A0Y
            if (r0 == 0) goto L_0x0159
            com.instagram.common.session.UserSession r1 = A03(r10)
            android.app.Activity r0 = r10.getRootActivity()
            X.F8F.A00(r0, r1, r3)
            return
        L_0x0126:
            r0 = 703(0x2bf, float:9.85E-43)
            goto L_0x012b
        L_0x0129:
            r0 = 700(0x2bc, float:9.81E-43)
        L_0x012b:
            java.lang.String r3 = X.C273654mx.A00(r0)
            goto L_0x00fe
        L_0x0130:
            r1 = 0
            goto L_0x0091
        L_0x0133:
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x013e;
                case 2: goto L_0x0142;
                case 3: goto L_0x0146;
                case 4: goto L_0x014a;
                case 5: goto L_0x014e;
                case 6: goto L_0x0152;
                default: goto L_0x013a;
            }
        L_0x013a:
            java.lang.String r4 = "Following"
            goto L_0x004d
        L_0x013e:
            java.lang.String r4 = "Followers"
            goto L_0x004d
        L_0x0142:
            java.lang.String r4 = "UnfollowChain"
            goto L_0x004d
        L_0x0146:
            java.lang.String r4 = "Misinformation"
            goto L_0x004d
        L_0x014a:
            java.lang.String r4 = "Groups"
            goto L_0x004d
        L_0x014e:
            java.lang.String r4 = "GroupFollowers"
            goto L_0x004d
        L_0x0152:
            java.lang.String r4 = "GroupFollowing"
            goto L_0x004d
        L_0x0156:
            r9 = -1
            goto L_0x0030
        L_0x0159:
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            com.instagram.common.session.UserSession r0 = A03(r10)
            X.6Yo r2 = X.DbU.A0Q(r1, r0)
            X.1a1 r1 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r0 = A03(r10)
            androidx.fragment.app.Fragment r0 = r1.A02(r0, r3)
            r2.A0D(r0)
            r2.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.onUserRowClick(com.instagram.user.model.User):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.G6S, X.4Zh, X.4DU, X.0S7, android.widget.AbsListView$OnScrollListener, X.Der, X.G7N, X.07g, androidx.fragment.app.Fragment, java.lang.Object, X.32G] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        0qQ.A0B(view, 0);
        if (A0S(this)) {
            this.A0A = C3253672c.A00(view, A03(this), new C51001Fmo(this, 2));
        } else if (!this.A0U) {
            DbY.A10(view, R.id.refreshablelistview_stub);
        }
        String str2 = this.A0R;
        if (str2.length() > 0) {
            TypeaheadHeader typeaheadHeader = this.A0B;
            if (typeaheadHeader != null) {
                typeaheadHeader.A04(str2);
            }
            TypeaheadHeader typeaheadHeader2 = this.A0B;
            if (typeaheadHeader2 != null) {
                typeaheadHeader2.A02();
            }
        }
        TypeaheadHeader typeaheadHeader3 = this.A0B;
        if (typeaheadHeader3 != null) {
            typeaheadHeader3.A01 = this;
            Integer num = this.A0K;
            if (num == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            switch (num.intValue()) {
                case 0:
                case 4:
                case 6:
                    i = 2131972812;
                    break;
                case 1:
                case 2:
                case 3:
                case 5:
                    i = 2131972811;
                    break;
                default:
                    throw AnonymousClass7TE.A15("Invalid entry type for FollowListFragment");
            }
            typeaheadHeader3.A03(DbU.A0m(this, i));
        }
        C228172ku r4 = this.A0z;
        C46434Dew dew = this.A0J;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            r4.A03(dew);
            r4.A03(new C46446Df8(A03(this), this));
            TypeaheadHeader typeaheadHeader4 = this.A0B;
            if (typeaheadHeader4 != null) {
                r4.A03(typeaheadHeader4.A04);
                0S7.A00(this);
                this.A04.setOnScrollListener(this);
                0S7.A00(this);
                this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                if (this.A0Y) {
                    0S7.A00(this);
                    this.A04.setBackground((Drawable) null);
                    TypeaheadHeader typeaheadHeader5 = this.A0B;
                    if (typeaheadHeader5 != null) {
                        typeaheadHeader5.setEditTextBackground(requireContext().getDrawable(R.drawable.searchbar_on_elevated_background));
                    }
                }
                Context requireContext = requireContext();
                if (this.A05 != null) {
                    ViewGroup viewGroup = this.A02;
                    if (viewGroup == null) {
                        str = "followContainer";
                    } else {
                        GTF gtf = new GTF(requireContext, A03(this), this);
                        View A012 = GTF.A04.A01(requireContext, viewGroup, A03(this));
                        GTH gth = new GTH(A03(this), this, this);
                        GTG gtg = new GTG(-1, 0);
                        Object tag = A012.getTag();
                        if (tag != null) {
                            GTD gtd = (GTD) tag;
                            1Xl r0 = this.A04;
                            if (r0 != null) {
                                gtf.A00(gth.A00(r0, gtg), gtd);
                                viewGroup.addView(A012);
                                viewGroup.invalidate();
                                C324466zK r02 = this.A05;
                                if (r02 != null) {
                                    r02.A02(A012);
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
                C46435Dex dex = this.A0E;
                if (dex == null) {
                    str = "followListAdapter";
                } else {
                    A0V(dex);
                    if (C267044ar.A01(requireContext(), A03(this))) {
                        if (182.A06(0Tu.A05, A03(this), 36329848456626531L)) {
                            Context applicationContext = requireContext().getApplicationContext();
                            0qQ.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            C46730DkJ A002 = new 2YN(new C47741EEz((Application) applicationContext, A03(this)), this).A00(C46730DkJ.class);
                            this.A08 = A002;
                            if (A002 != null) {
                                A002.A0E(A01(this));
                            }
                        }
                    }
                    C46730DkJ dkJ = this.A08;
                    if (dkJ != null) {
                        DbZ.A1C(this, new C66184MGv((Object) this, (AnonymousClass4D7) null, 1), dkJ.A06);
                    }
                    super.onViewCreated(view, bundle);
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void registerTextViewLogging(TextView textView) {
        0qQ.A0B(textView, 0);
        textView.addTextChangedListener(AnonymousClass4v0.A00(A03(this)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r4.A0H == X.C48104EVw.A05) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void searchTextChanged(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r0 = r4.A0R
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x005e
            r4.A0R = r5
            com.instagram.common.session.UserSession r3 = X.DbU.A0W(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324737446719796(0x810d2800123134, double:3.035248457058457E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r5)
            r4.A0R = r0
        L_0x0025:
            java.lang.String r0 = r4.A0R
            int r0 = r0.length()
            r3 = 1
            if (r0 > 0) goto L_0x0035
            X.EVw r1 = r4.A0H
            X.EVw r0 = X.C48104EVw.DEFAULT
            r2 = 0
            if (r1 != r0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            r4.A0R(r2)
            X.DkJ r1 = r4.A08
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = r4.A0R
            r1.A0F(r0)
        L_0x0042:
            X.Dex r1 = r4.A0E
            if (r1 != 0) goto L_0x0050
            java.lang.String r0 = "followListAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0050:
            java.lang.String r0 = r4.A0R
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0059
            r3 = 0
        L_0x0059:
            r1.A0F = r3
            r4.A06()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.searchTextChanged(java.lang.String):void");
    }

    public static final C48145EZn A01(C46430Der der) {
        FollowListData followListData = der.A0D;
        if (followListData == null) {
            0qQ.A0F("followListData");
            throw AnonymousClass00P.createAndThrow();
        }
        int ordinal = followListData.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return C48145EZn.OTHER;
            }
            if (2R8.A04(A03(der), der.A0C)) {
                return C48145EZn.SELF_FOLLOWING_PAGE;
            }
            return C48145EZn.OTHERS_FOLLOWING_PAGE;
        } else if (2R8.A04(A03(der), der.A0C)) {
            return C48145EZn.SELF_FOLLOWER_PAGE;
        } else {
            return C48145EZn.OTHERS_FOLLOWER_PAGE;
        }
    }

    public static final C2366634p A02(C46430Der der) {
        UnifiedFollowFragment unifiedFollowFragment = der.mParentFragment;
        if (unifiedFollowFragment == null || !(unifiedFollowFragment instanceof UnifiedFollowFragment)) {
            return null;
        }
        C47291DuK duK = unifiedFollowFragment.A0E;
        if (duK != null) {
            return duK.A00;
        }
        0qQ.A0F("followListPerfLogger2");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final UserSession A03(C46430Der der) {
        return (UserSession) der.A15.getValue();
    }

    public static final C49529Ex9 A04(C46430Der der, List list, int i) {
        FollowListData followListData = der.A0D;
        if (followListData == null) {
            0qQ.A0F("followListData");
            throw AnonymousClass00P.createAndThrow();
        }
        C46443Df5 df5 = followListData.A00;
        if ((df5 != C46443Df5.FOLLOWING && df5 != C46443Df5.GROUP_FOLLOWING) || i == 0) {
            return null;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A1A.append("#");
            A1A.append(AnonymousClass7TE.A19(list, i2));
            DbY.A1V(A1A, list, i2);
        }
        if (list.size() < i) {
            A1A.append(der.getString(2131961564));
        }
        return new C49529Ex9(DbU.A0m(der, 2131963303), DbT.A10(A1A));
    }

    public static final String A05(C46430Der der) {
        Integer num = der.A0K;
        if (num == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            throw AnonymousClass00P.createAndThrow();
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "Followers";
        }
        if (intValue != 0) {
            return "FollowList";
        }
        return "Following";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbU.A0W(r5), 36324737446785333L) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A07() {
        /*
            r5 = this;
            X.Dew r1 = r5.A0J
            if (r1 != 0) goto L_0x000e
            java.lang.String r4 = "paginationHelper"
        L_0x0006:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            r0 = 0
            r1.A02 = r0
            X.Dex r0 = r5.A0E
            java.lang.String r4 = "followListAdapter"
            if (r0 == 0) goto L_0x0006
            boolean r0 = r0.A12
            if (r0 != 0) goto L_0x002c
            com.instagram.common.session.UserSession r3 = X.DbU.A0W(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324737446785333(0x810d2800133135, double:3.0352484570999026E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002f
        L_0x002c:
            r5.A09()
        L_0x002f:
            X.Dex r1 = r5.A0E
            if (r1 == 0) goto L_0x0006
            r0 = 1
            r1.A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.A07():void");
    }

    private final void A08() {
        1OC r0 = this.A0g;
        if (r0 != null) {
            r0.cancel();
        }
        1OC A002 = C46396DeJ.A00(A03(this), 10, getModuleName());
        C47696EDf.A01(A002, this, 51);
        this.A0g = A002;
        schedule(A002);
        C320106rm r02 = this.A09;
        String str = "latencyPerfLogger";
        if (r02 != null) {
            r02.A00.A04();
            C320106rm r1 = this.A09;
            if (r1 != null) {
                r1.A0E("fetch_request_start");
                C47291DuK duK = this.A0I;
                if (duK == null) {
                    str = "perfLogger";
                } else {
                    duK.A0E("fetch_su_request_start");
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (X.AnonymousClass7TF.A1V(r1.A00) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A09() {
        /*
            r2 = this;
            X.Dew r1 = r2.A0J
            java.lang.String r0 = "paginationHelper"
            if (r1 != 0) goto L_0x000e
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            boolean r0 = r1.isLoading()
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r1.A00
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            r0 = 1
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            X.C46445Df7.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.A09():void");
    }

    public static final void A0B(User user, C46430Der der) {
        C294695ms.A00(A03(der)).A08(der.requireActivity(), new EDV(48, user, der), A03(der), user);
    }

    public static final void A0D(C46430Der der) {
        if (!der.A0q) {
            der.A08();
        } else if (!der.A0c) {
            der.A08();
            der.A0c = true;
        }
    }

    public static final void A0E(C46430Der der) {
        String str;
        C46443Df5 df5 = C46443Df5.FOLLOWERS;
        User user = der.A0C;
        if (user != null) {
            str = user.getId();
        } else {
            str = "";
        }
        C46430Der Cr3 = C46339Dch.A01().Cr3(A03(der), C46451DfE.A00(df5, str, (String) null, false));
        C309516Yo A0M2 = DbS.A0M(der.requireActivity(), A03(der));
        A0M2.A0G((String) null, 1);
        A0M2.A0B((Bundle) null, Cr3);
        A0M2.A04();
    }

    public static final void A0F(C46430Der der) {
        String str;
        C46434Dew dew = der.A0J;
        if (dew == null) {
            str = "paginationHelper";
        } else {
            dew.A02 = true;
            C46435Dex dex = der.A0E;
            str = "followListAdapter";
            if (dex != null) {
                if (dex.A12) {
                    der.A09();
                }
                C46435Dex dex2 = der.A0E;
                if (dex2 != null) {
                    dex2.A0M = false;
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0125, code lost:
        if (r6.length() == 0) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.C46430Der r8, X.C22360Y0o r9, java.lang.String r10) {
        /*
            X.DuK r2 = r8.A0I
            java.lang.String r6 = "perfLogger"
            if (r2 == 0) goto L_0x01ed
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "_follow_list_model_conversion_started"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.A0E(r0)
            boolean r0 = r9 instanceof X.CTT
            if (r0 == 0) goto L_0x01b9
            X.CTT r9 = (X.CTT) r9
            X.Y0v r5 = new X.Y0v
            r5.<init>(r9)
        L_0x001c:
            X.G8I r5 = (X.G8I) r5
            X.DuK r2 = r8.A0I
            if (r2 == 0) goto L_0x01ed
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "_follow_list_model_conversion_finished"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.A0E(r0)
            java.util.List r2 = r5.BW1()
            A0M(r8, r2)
            int r1 = r2.size()
            X.Dew r0 = r8.A0J
            java.lang.String r6 = "paginationHelper"
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r0.A00
            A0I(r8, r0, r1)
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r8.A0R
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x005d
        L_0x004f:
            boolean r0 = r8.A0b
            if (r0 != 0) goto L_0x019b
            X.EVw r0 = r8.A0H
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x019b
        L_0x005d:
            int r0 = r10.length()
            r4 = 0
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r7 = "followListAdapter"
            if (r0 == 0) goto L_0x0076
            boolean r1 = r5.CCU()
            r8.A0T = r1
            X.Dex r0 = r8.A0E
            if (r0 == 0) goto L_0x01f5
            r0.A0D = r1
        L_0x0076:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0085
            boolean r0 = A0U(r8, r2)
            if (r0 == 0) goto L_0x0085
            A0D(r8)
        L_0x0085:
            boolean r0 = A0U(r8, r2)
            if (r0 == 0) goto L_0x00ab
            int r1 = r2.size()
            r0 = 10
            if (r1 >= r0) goto L_0x0096
            A0D(r8)
        L_0x0096:
            boolean r0 = r8.A0T
            if (r0 == 0) goto L_0x00ab
            X.Dex r0 = r8.A0E
            if (r0 == 0) goto L_0x01f5
            java.util.Set r0 = r0.A0y
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ab
            A0D(r8)
        L_0x00ab:
            java.util.List r1 = r5.C2q()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b8
            A0O(r8, r1)
        L_0x00b8:
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r5.CPt()
            if (r0 == 0) goto L_0x00d1
            android.content.Context r3 = r8.requireContext()
            long r0 = r5.AjP()
            X.FEJ.A02(r3, r0)
        L_0x00d1:
            boolean r0 = r5.BuE()
            if (r0 == 0) goto L_0x00de
            X.Dex r1 = r8.A0E
            if (r1 == 0) goto L_0x01f5
            r0 = 1
            r1.A0L = r0
        L_0x00de:
            X.Dew r1 = r8.A0J
            if (r1 == 0) goto L_0x01ed
            java.lang.String r0 = r5.getNextMaxId()
            r1.A00 = r0
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x00fe
            X.Dex r3 = r8.A0E
            if (r3 == 0) goto L_0x01f5
            java.util.List r1 = r5.Bey()
            int r0 = r5.BCX()
            X.Ex9 r0 = A04(r8, r1, r0)
            r3.A04 = r0
        L_0x00fe:
            X.Dex r1 = r8.A0E
            if (r1 == 0) goto L_0x01f5
            X.G9S r0 = r5.B8C()
            r1.A05 = r0
            r1.A0G(r4, r4)
            java.util.List r1 = r5.BAC()
            boolean r0 = r5.BUB()
            A0P(r8, r1, r0)
            boolean r0 = A0S(r8)
            if (r0 == 0) goto L_0x016c
            java.lang.String r6 = r8.A0P
            if (r6 == 0) goto L_0x0127
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L_0x0128
        L_0x0127:
            r1 = 1
        L_0x0128:
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x019c
            X.Dex r3 = r8.A0E
            if (r3 == 0) goto L_0x01f5
            if (r6 != 0) goto L_0x0133
            r6 = r0
        L_0x0133:
            r3.A07 = r6
            r3.A0G(r4, r4)
        L_0x0138:
            java.lang.String r1 = r8.A0Q
            if (r1 == 0) goto L_0x014b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x014b
            X.Dex r0 = r8.A0E
            if (r0 == 0) goto L_0x01f5
            r0.A06 = r1
            r0.A0G(r4, r4)
        L_0x014b:
            java.lang.String r1 = r8.A0M
            if (r1 == 0) goto L_0x016c
            java.lang.String r0 = "potential_spam"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016c
            X.Dex r1 = r8.A0E
            if (r1 == 0) goto L_0x01f5
            r0 = 1
            r1.A0E = r0
            r1.A0G(r4, r4)
            X.Dex r1 = r8.A0E
            if (r1 == 0) goto L_0x01f5
            int r0 = r8.A00
            r1.A00 = r0
            r1.A0G(r4, r4)
        L_0x016c:
            boolean r0 = A0T(r8)
            if (r0 == 0) goto L_0x0175
            A0L(r8, r2)
        L_0x0175:
            boolean r0 = A0S(r8)
            if (r0 == 0) goto L_0x01e0
            boolean r0 = r8.A0e
            if (r0 == 0) goto L_0x01e0
            X.Dex r1 = r8.A0E
            if (r1 == 0) goto L_0x01f5
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r2)
            r1.A0F(r0)
        L_0x018a:
            com.instagram.api.schemas.GraphGuardianContent r1 = r5.By9()
            if (r1 == 0) goto L_0x0199
            X.Dex r0 = r8.A0E
            if (r0 == 0) goto L_0x01f5
            r0.A02 = r1
            r0.A0G(r4, r4)
        L_0x0199:
            r8.A0e = r4
        L_0x019b:
            return
        L_0x019c:
            java.util.List r0 = r5.BAC()
            if (r0 != 0) goto L_0x0138
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0138
            X.Dex r3 = r8.A0E
            if (r3 == 0) goto L_0x01f5
            android.content.Context r1 = r8.requireContext()
            r0 = 2131963236(0x7f132d64, float:1.956322E38)
            java.lang.String r6 = r1.getString(r0)
            goto L_0x0133
        L_0x01b9:
            boolean r0 = r9 instanceof X.CTU
            if (r0 == 0) goto L_0x01c6
            X.CTU r9 = (X.CTU) r9
            X.Y0x r5 = new X.Y0x
            r5.<init>(r9)
            goto L_0x001c
        L_0x01c6:
            boolean r0 = r9 instanceof X.CTS
            if (r0 == 0) goto L_0x01d3
            X.CTS r9 = (X.CTS) r9
            X.Y0w r5 = new X.Y0w
            r5.<init>(r9)
            goto L_0x001c
        L_0x01d3:
            boolean r0 = r9 instanceof X.CTR
            if (r0 == 0) goto L_0x0209
            X.CTR r9 = (X.CTR) r9
            X.Y0u r5 = new X.Y0u
            r5.<init>(r9)
            goto L_0x001c
        L_0x01e0:
            X.Dex r0 = r8.A0E
            if (r0 == 0) goto L_0x01f5
            r0.A0E(r2)
            X.F28 r3 = r8.A0G
            if (r3 != 0) goto L_0x01f9
            java.lang.String r6 = "tailLoadPerfLogger"
        L_0x01ed:
            X.0qQ.A0F(r6)
        L_0x01f0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f5:
            X.0qQ.A0F(r7)
            goto L_0x01f0
        L_0x01f9:
            int r2 = r3.A00
            if (r2 == 0) goto L_0x018a
            X.02m r1 = r3.A01
            java.lang.String r0 = "users_added_to_view"
            r1.markerPoint(r2, r0)
            r0 = 2
            r3.A00(r0)
            goto L_0x018a
        L_0x0209:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.A0G(X.Der, X.Y0o, java.lang.String):void");
    }

    public static final void A0I(C46430Der der, String str, int i) {
        Integer B70;
        User user;
        Integer B6v;
        FollowListData followListData = der.A0D;
        if (followListData != null) {
            C46443Df5 df5 = followListData.A00;
            C46443Df5 df52 = C46443Df5.FOLLOWERS;
            if ((df5 == df52 || df5 == C46443Df5.FOLLOWING || df5 == C46443Df5.FOLLOWING_SIMPLIFIED) && str == null && i == 0) {
                if (!(df5 == df52 && ((user = der.A0C) == null || (B6v = user.A03.B6v()) == null || B6v.intValue() != 0))) {
                    FollowListData followListData2 = der.A0D;
                    if (followListData2 != null) {
                        if (followListData2.A00 == C46443Df5.FOLLOWING) {
                            User user2 = der.A0C;
                            if (!(user2 == null || (B70 = user2.A03.B70()) == null || B70.intValue() != 0)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                A03(der);
                EventBuilder markEventBuilder = 02m.A0p.markEventBuilder(1001142197, "");
                FollowListData followListData3 = der.A0D;
                if (followListData3 != null) {
                    markEventBuilder.annotate("list_type", followListData3.A00.name()).annotate("is_self", 2R8.A04(A03(der), der.A0C)).report();
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("followListData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0K(C46430Der der, String str, String str2, ArrayList arrayList, int i) {
        C46432Det det = der.A0j;
        if (det != null) {
            0eP A1L = AnonymousClass7TE.A1L("ARG_IS_FACEPILE_ENABLED", Boolean.valueOf(det.A02()));
            C46432Det det2 = der.A0j;
            if (det2 != null) {
                Boolean valueOf = Boolean.valueOf(det2.A03());
                DbW.A0W(der.requireActivity(), Q21.A00(A1L, AnonymousClass7TE.A1L(AnonymousClass000.A00(414), valueOf), AnonymousClass7TE.A1L(AnonymousClass000.A00(410), arrayList), AnonymousClass7TE.A1L(AnonymousClass000.A00(409), str), AnonymousClass7TE.A1L("ARG_HEADER_TEXT", str2)), A03(der), ModalActivity.class, C273654mx.A00(240)).A0D(der, i);
                return;
            }
        }
        0qQ.A0F("followListParams");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0N(C46430Der der, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1NK.A00().A0O(A03(der), ((AnonymousClass3UL) it.next()).A03.Bh3(), der.getModuleName());
            }
            1OC A032 = C320126ro.A03(A03(der), list);
            C47696EDf.A01(A032, der, 50);
            der.schedule(A032);
        }
    }

    public static final void A0P(C46430Der der, List list, boolean z) {
        String str;
        if (list != null && !list.isEmpty()) {
            UserSession A032 = A03(der);
            FollowListData followListData = der.A0D;
            if (followListData == null) {
                str = "followListData";
            } else if (2R8.A05(A032, followListData.A02)) {
                Integer num = der.A0K;
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                if (num != null) {
                    if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A01) {
                        C46435Dex dex = der.A0E;
                        if (dex == null) {
                            str = "followListAdapter";
                        } else {
                            dex.A0B = list;
                            dex.A0I = z;
                            dex.A0G(false, false);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final void A0Q(boolean z) {
        String str;
        C14221Ts1 ts1;
        if (z) {
            this.A0Z = false;
            if (this.A0b) {
                str = this.A0R;
            } else {
                str = this.A0H.A00;
            }
            F05 f05 = this.A0F;
            if (f05 == null) {
                0qQ.A0F("followListFragmentQueryManager");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0B(str, 0);
            if (f05.A00) {
                ts1 = f05.A01;
            } else {
                ts1 = f05.A02;
            }
            ts1.A03(str);
        }
    }

    private final void A0R(boolean z) {
        String str;
        C14221Ts1 ts1;
        this.A0b = z;
        F05 f05 = this.A0F;
        if (f05 == null) {
            str = "followListFragmentQueryManager";
        } else {
            if (f05.A00 != z) {
                f05.A00 = z;
                if (z) {
                    ts1 = f05.A02;
                } else {
                    ts1 = f05.A01;
                }
                ts1.A02();
            }
            C46435Dex dex = this.A0E;
            str = "followListAdapter";
            if (dex != null) {
                dex.A0J = z;
                String str2 = this.A0R;
                0qQ.A0B(str2, 0);
                dex.A08 = str2;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A0S(C46430Der der) {
        FollowListData followListData = der.A0D;
        if (followListData != null) {
            return followListData.A00.A01;
        }
        0qQ.A0F("followListData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A0T(C46430Der der) {
        String str;
        if (!(!der.A0l.isEmpty()) || der.A0R.length() != 0) {
            return false;
        }
        UserSession A032 = A03(der);
        FollowListData followListData = der.A0D;
        if (followListData == null) {
            str = "followListData";
        } else if (!2R8.A05(A032, followListData.A02)) {
            return false;
        } else {
            Integer num = der.A0K;
            if (num == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
            } else if (num == AnonymousClass05K.A01) {
                return true;
            } else {
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A0U(C46430Der der, List list) {
        String str;
        if (der.A0R.length() != 0) {
            return false;
        }
        UserSession A032 = A03(der);
        FollowListData followListData = der.A0D;
        if (followListData == null) {
            str = "followListData";
        } else if (!2R8.A05(A032, followListData.A02) && list.size() > 1000000000) {
            return false;
        } else {
            Integer num = der.A0K;
            str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
            if (num != null) {
                if ((num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) && der.A0l.isEmpty()) {
                    return true;
                }
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CJz() {
        C46435Dex dex = this.A0E;
        if (dex != null) {
            return !dex.isEmpty();
        }
        0qQ.A0F("followListAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CgO() {
        A0Q(!this.A0T);
    }

    public final void CtJ(C46448DfA dfA) {
        Dba.A1I(this.A03, "user_list_groups_see_all_tap");
        C46443Df5 df5 = C46443Df5.GROUPS;
        FollowListData followListData = this.A0D;
        if (followListData == null) {
            0qQ.A0F("followListData");
            throw AnonymousClass00P.createAndThrow();
        }
        FollowListData A002 = C46451DfE.A00(df5, followListData.A02, (String) null, false);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        DbU.A1D(A0a2, A03(this));
        A0a2.putInt("FollowListFragment.EntryType", 4);
        A0a2.putParcelable("FollowListFragment.FollowListData", A002);
        A0a2.putBoolean("FollowListFragment.DisplayOnlyMutual", false);
        A0a2.putString("FollowListFragment.GroupTitle", requireContext().getString(2131962561));
        A0a2.putBoolean("FollowListFragment.ShowSearchBar", false);
        A0a2.putString("FollowListFragment.GroupSubtitle", requireContext().getString(2131962563));
        C309516Yo A0Q2 = DbU.A0Q(requireActivity(), A03(this));
        C46339Dch.A00();
        DbW.A0y(A0a2, new C46430Der(), A0Q2);
    }

    public final void D36() {
        String str;
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0Q2 = DbU.A0Q(requireActivity(), A03(this));
            C48258Ebd A002 = FC6.A00().A00();
            FollowListData followListData = this.A0D;
            if (followListData == null) {
                0qQ.A0F("followListData");
                throw AnonymousClass00P.createAndThrow();
            }
            if (followListData.A00 == C46443Df5.FOLLOWERS) {
                str = "empty_self_followers_list";
            } else {
                str = "empty_self_following_list";
            }
            A0Q2.A0B((Bundle) null, A002.A01(str, getString(2131960850)));
            A0Q2.A04();
        }
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

    public final View getRowView() {
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            return typeaheadHeader;
        }
        if (AnonymousClass2Rc.A00) {
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0z(C66579MXk.A00(8));
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

    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        if (!this.A0d) {
            return false;
        }
        this.A0d = false;
        A0E(this);
        return true;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (AnonymousClass2Rc.A00) {
            return super.onCreateAnimation(i, z, i2);
        }
        boolean z2 = C70542Rd.A03;
        return null;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    private final void A06() {
        String str;
        AnonymousClass7g1 r0;
        String str2;
        boolean z;
        ArrayList A1C;
        UserSession A032 = A03(this);
        boolean A062 = 182.A06(DbS.A0J(A032, 0), A032, 36324737446785333L);
        if (this.A0b) {
            str = this.A0R;
        } else {
            str = this.A0H.A00;
        }
        F05 f05 = this.A0F;
        if (f05 == null) {
            str2 = "followListFragmentQueryManager";
        } else {
            0qQ.A0B(str, 0);
            if (f05.A00) {
                r0 = f05.A03;
            } else {
                r0 = f05.A04;
            }
            AnonymousClass9P5 BiX = r0.BiX(str);
            Integer num = BiX.A01;
            List list = BiX.A06;
            String str3 = BiX.A03;
            str2 = "followListAdapter";
            if (num == AnonymousClass05K.A0C) {
                A07();
                C46434Dew dew = this.A0J;
                if (dew != null) {
                    dew.A00 = str3;
                    C46435Dex dex = this.A0E;
                    if (dex != null) {
                        if (list != null) {
                            dex.A0F(AnonymousClass7TE.A1D(list));
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                }
            } else {
                C46434Dew dew2 = this.A0J;
                if (dew2 != null) {
                    dew2.A00 = null;
                    C46435Dex dex2 = this.A0E;
                    if (dex2 != null) {
                        if (A062) {
                            z = true;
                            if (this.A0b) {
                                String str4 = dex2.A08;
                                if (str4.length() == 0) {
                                    A1C = AnonymousClass7TE.A1C();
                                } else {
                                    Locale locale = Locale.ROOT;
                                    String A122 = DbT.A12(locale, str4);
                                    List list2 = dex2.A0C;
                                    A1C = AnonymousClass7TE.A1C();
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        User A0k2 = DbT.A0k(it);
                                        if (00l.A0d(DbT.A12(locale, A0k2.getUsername()), A122, false) || 00l.A0d(DbT.A12(locale, A0k2.A0Q()), A122, false)) {
                                            A1C.add(A0k2);
                                        }
                                    }
                                }
                                dex2.A0F(A1C);
                                dex2.A01 = A1C.size();
                                dex2.A0H = false;
                                dex2.A0G(false, false);
                                dex2.A0K = z;
                                A0C(this);
                                return;
                            }
                        }
                        z = false;
                        dex2.A0C.clear();
                        dex2.A0z.clear();
                        dex2.A01 = 0;
                        dex2.A0H = false;
                        dex2.A0G(false, false);
                        dex2.A0K = z;
                        A0C(this);
                        return;
                    }
                }
            }
            0qQ.A0F("paginationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A0A(Context context, User user) {
        String A16 = AnonymousClass7TE.A16(context, 2131972021);
        SpannableStringBuilder A0C2 = DbS.A0C(DbY.A0b(context, user, 2131972020));
        DbZ.A1S(this.A03, "remove_follower_dialog_impression", user.getId());
        C46498Dg1 dg1 = new C46498Dg1(context, A03(this));
        dg1.A0D(A16, A0C2.toString());
        dg1.A07(user.Bh3());
        dg1.A02(new FP7(32, (Object) user, (Object) this), 2131972017);
        C49945FFy.A00(this, dg1);
    }

    public static final void A0C(C46430Der der) {
        String str;
        C14221Ts1 ts1;
        String str2;
        A0F(der);
        if (der.A0b) {
            str = der.A0R;
        } else {
            str = der.A0H.A00;
        }
        User user = der.A0C;
        if (user != null) {
            user.A03.B6v();
        }
        User user2 = der.A0C;
        if (user2 != null) {
            user2.A03.BVD();
        }
        if (der.A0r) {
            der.A07();
            if (!der.A0c) {
                der.A08();
                der.A0c = true;
            }
            C46435Dex dex = der.A0E;
            if (dex == null) {
                str2 = "followListAdapter";
            } else {
                dex.A0F(AnonymousClass7TE.A1C());
                return;
            }
        } else {
            F05 f05 = der.A0F;
            if (f05 == null) {
                str2 = "followListFragmentQueryManager";
            } else {
                0qQ.A0B(str, 0);
                if (f05.A00) {
                    ts1 = f05.A01;
                } else {
                    ts1 = f05.A02;
                }
                ts1.A06(str);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0H(C46430Der der, String str) {
        String str2;
        AnonymousClass3AD r1;
        if (A0S(der) && (r1 = der.A0A) != null) {
            r1.setIsLoading(false);
        }
        if (der.A0b) {
            der.A0V = true;
            str2 = der.A0R;
        } else {
            str2 = der.A0H.A00;
        }
        if (str.equals(str2)) {
            der.A07();
        }
        C47291DuK duK = der.A0I;
        if (duK == null) {
            0qQ.A0F("perfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C46329Dbx.A00(duK);
        C2366634p A022 = A02(der);
        if (A022 != null) {
            A022.A05();
        }
    }

    public static final void A0J(C46430Der der, String str, String str2) {
        0xI A002 = 0xI.A00(der, str);
        A002.A0C("target_id", str2);
        DbU.A1R(A002, A03(der));
    }

    public static final void A0L(C46430Der der, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (der.A0l.contains(((User) next).getId())) {
                A1C.add(next);
            }
        }
        List A0a2 = 00k.A0a(A1C);
        if (!A0a2.isEmpty()) {
            C46435Dex dex = der.A0E;
            if (dex == null) {
                0qQ.A0F("followListAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            List list2 = dex.A0w;
            list2.clear();
            list2.addAll(A0a2);
            dex.A0G(false, false);
        }
    }

    public static final void A0O(C46430Der der, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k2 = DbT.A0k(it);
            AnonymousClass3UL r1 = new AnonymousClass3UL((AnonymousClass3UJ) null);
            0qQ.A0B(A0k2, 0);
            r1.A03 = A0k2;
            String A0o2 = DbS.A0o(A0k2);
            if (A0o2 != null) {
                r1.A05 = A0o2;
            }
            A1C.add(r1);
        }
        AnonymousClass3UH r12 = new AnonymousClass3UH((AnonymousClass3UG) null);
        r12.A0M = A1C;
        C46435Dex dex = der.A0E;
        if (dex == null) {
            0qQ.A0F("followListAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        dex.A0C(r12);
        A0N(der, A1C);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return A03(this);
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        String str;
        AnonymousClass7TG.A1N(user, followStatus);
        if (followStatus == FollowStatus.A06) {
            C49061Eof.A00(A03(this)).A02(EWT.LIST_FOLLOW_USER_FLOW, (Integer) null);
        }
        UserSession A032 = A03(this);
        Integer num = this.A0K;
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        if (num != null) {
            if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0u) {
                str = "following_list";
            } else {
                str = "followers_list";
            }
            F8H.A01(this, A032, user, str);
            Number number = (Number) this.A12.get(user.getId());
            if (number != null) {
                int intValue = number.intValue();
                UserSession A033 = A03(this);
                FollowListData followListData = this.A0D;
                str2 = "followListData";
                if (followListData != null) {
                    String id = user.getId();
                    FollowListData followListData2 = this.A0D;
                    if (followListData2 != null) {
                        F87.A01(A033, followListData, id, "follow_list_user_follow", followListData2.A02, getModuleName(), intValue);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DdL(User user) {
        Context context = getContext();
        if (context != null) {
            A0A(context, user);
            DbZ.A1S(this.A03, AnonymousClass000.A00(1757), user.getId());
        }
    }

    public final String getModuleName() {
        if (A0S(this)) {
            String str = this.A0M;
            if (str == null || str.length() == 0) {
                return "user_list_groups_page";
            }
            return C49187Eqs.A00(str, this.A0N);
        }
        FollowListData followListData = this.A0D;
        if (followListData != null) {
            String str2 = followListData.A00.A00;
            UserSession A032 = A03(this);
            FollowListData followListData2 = this.A0D;
            if (followListData2 != null) {
                if (2R8.A05(A032, followListData2.A02)) {
                    return 002.A0R("self_", str2);
                }
                return str2;
            }
        }
        0qQ.A0F("followListData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.32K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: X.G6T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: X.G6X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: X.G9g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: X.32I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: X.Der} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0291, code lost:
        if (r6.equals("potential_spam") == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        if (r5 != X.AnonymousClass05K.A01) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r5 == X.AnonymousClass05K.A00) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c1, code lost:
        if (r7 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0281, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36325673748608128L) == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
        if (r0.intValue() != 0) goto L_0x0075;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r56) {
        /*
            r55 = this;
            r0 = -1785801833(0xffffffff958ed397, float:-5.7687173E-26)
            int r15 = X.AnonymousClass0fD.A02(r0)
            r4 = r55
            r0 = r56
            X.C46430Der.super.onCreate(r0)
            com.instagram.common.session.UserSession r0 = A03(r4)
            X.0wc r0 = X.AnonymousClass0kN.A01(r4, r0)
            r4.A03 = r0
            android.os.Bundle r3 = r4.requireArguments()
            r0 = 7
            java.lang.Integer[] r1 = X.AnonymousClass05K.A00(r0)
            java.lang.String r0 = "FollowListFragment.EntryType"
            int r0 = r3.getInt(r0)
            r0 = r1[r0]
            r4.A0K = r0
            java.lang.Class<com.instagram.user.recommended.FollowListData> r1 = com.instagram.user.recommended.FollowListData.class
            java.lang.String r0 = "FollowListFragment.FollowListData"
            android.os.Parcelable r0 = X.C320236s2.A00(r3, r1, r0)
            com.instagram.user.recommended.FollowListData r0 = (com.instagram.user.recommended.FollowListData) r0
            r4.A0D = r0
            com.instagram.common.session.UserSession r0 = A03(r4)
            X.17i r1 = X.17h.A00(r0)
            com.instagram.user.recommended.FollowListData r0 = r4.A0D
            java.lang.String r17 = "followListData"
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = r0.A02
            com.instagram.user.model.User r0 = r1.A02(r0)
            r4.A0C = r0
            com.instagram.common.session.UserSession r5 = A03(r4)
            r2 = 0
            X.0Tu r7 = X.DbS.A0J(r5, r2)
            r0 = 36323693768551825(0x810c3500012d91, double:3.034588430782477E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0449
            com.instagram.user.model.User r0 = r4.A0C
            if (r0 == 0) goto L_0x0075
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x0075
            int r0 = r0.intValue()
            r5 = 1
            if (r0 == 0) goto L_0x0076
        L_0x0075:
            r5 = 0
        L_0x0076:
            java.lang.String r16 = "type"
            if (r5 == 0) goto L_0x0082
            java.lang.Integer r5 = r4.A0K
            if (r5 == 0) goto L_0x0377
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 == r0) goto L_0x009c
        L_0x0082:
            com.instagram.user.model.User r0 = r4.A0C
            if (r0 == 0) goto L_0x0449
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B70()
            if (r0 == 0) goto L_0x0449
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0449
            java.lang.Integer r5 = r4.A0K
            if (r5 == 0) goto L_0x0377
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r5 != r0) goto L_0x0449
        L_0x009c:
            r0 = 1
        L_0x009d:
            r4.A0r = r0
            com.instagram.common.session.UserSession r0 = X.DbU.A0W(r4)
            r5 = 36323693768486288(0x810c3500002d90, double:3.0345884307410313E-306)
            boolean r0 = X.182.A06(r7, r0, r5)
            r4.A0q = r0
            com.instagram.common.session.UserSession r0 = X.DbU.A0W(r4)
            r5 = 36324612891619512(0x810d0b000230b8, double:3.035169687911494E-306)
            boolean r0 = X.182.A06(r7, r0, r5)
            r4.A0p = r0
            java.lang.String r0 = "FollowListFragment.DisplayOnlyMutual"
            boolean r0 = r3.getBoolean(r0)
            r4.A0U = r0
            java.lang.String r0 = "FollowListFragment.ShowSearchBar"
            boolean r49 = r3.getBoolean(r0, r1)
            r9 = -1
            java.lang.String r0 = "FollowListFragment.FollowerCount"
            int r46 = r3.getInt(r0, r9)
            java.lang.String r0 = "FollowListFragment.Username"
            java.lang.String r44 = r3.getString(r0)
            java.lang.String r0 = "FollowListFragment.ShouldBypassUnfollowConfirmationDialog"
            r3.getBoolean(r0, r2)
            java.lang.String r0 = "FollowListFragment.IsBottomSheet"
            boolean r0 = r3.getBoolean(r0)
            r4.A0Y = r0
            java.lang.String r0 = "FollowListFragment.Group"
            java.lang.String r0 = r3.getString(r0)
            r4.A0M = r0
            java.lang.String r0 = "FollowListFragment.GroupTitle"
            java.lang.String r0 = r3.getString(r0)
            r4.A0L = r0
            java.lang.String r0 = "FollowListFragment.GroupSubtitle"
            java.lang.String r0 = r3.getString(r0)
            r4.A0P = r0
            java.lang.String r0 = "FollowListFragment.GroupSubtitleButtonText"
            java.lang.String r0 = r3.getString(r0)
            r4.A0Q = r0
            java.lang.String r0 = "FollowListFragment.UserCount"
            int r0 = r3.getInt(r0)
            r4.A00 = r0
            java.lang.String r0 = "FollowListFragment.Category"
            java.lang.String r0 = r3.getString(r0)
            r4.A0N = r0
            java.lang.String r0 = "FollowListFragment.GroupRankingOrder"
            java.lang.String r0 = r3.getString(r0)
            r4.A0O = r0
            java.lang.String r0 = "FollowListFragment.AutoExpandChaining"
            boolean r0 = r3.getBoolean(r0)
            r4.A0n = r0
            java.lang.String r0 = "FollowListFragment.LazyLoading"
            boolean r0 = r3.getBoolean(r0, r2)
            r4.A0a = r0
            java.lang.String r0 = "FollowListFragment.AllowActionBarBulkManage"
            boolean r0 = r3.getBoolean(r0, r2)
            r4.A0m = r0
            java.lang.String r0 = "FollowListFragment.NewFollowersList"
            java.util.ArrayList r0 = r3.getStringArrayList(r0)
            if (r0 == 0) goto L_0x013f
            r4.A0l = r0
        L_0x013f:
            java.lang.String r5 = r4.A0M
            java.lang.String r0 = "non_recip_followers"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02db
            java.lang.String r0 = r4.A0L
            if (r0 == 0) goto L_0x0153
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02db
        L_0x0153:
            r0 = 2131963235(0x7f132d63, float:1.9563218E38)
            java.lang.String r0 = r4.getString(r0)
            r4.A0L = r0
            r0 = 2131963231(0x7f132d5f, float:1.956321E38)
        L_0x015f:
            java.lang.String r0 = r4.getString(r0)
            r4.A0P = r0
        L_0x0165:
            com.instagram.user.recommended.FollowListData r5 = r4.A0D
            if (r5 == 0) goto L_0x0247
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x0175
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0175
            r4.A0o = r1
        L_0x0175:
            X.Df5 r6 = r5.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r6 == r0) goto L_0x0183
            X.Df5 r5 = X.C46443Df5.FOLLOWING
            if (r6 == r5) goto L_0x0183
            X.Df5 r5 = X.C46443Df5.FOLLOWING_SIMPLIFIED
            if (r6 != r5) goto L_0x02d7
        L_0x0183:
            boolean r5 = r4.A0U
            if (r5 != 0) goto L_0x02d7
            X.EUR r7 = r4.A10
        L_0x0189:
            com.instagram.common.session.UserSession r6 = A03(r4)
            X.F05 r5 = new X.F05
            r5.<init>(r6, r7)
            r4.A0F = r5
            int r5 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            com.instagram.common.session.UserSession r6 = A03(r4)
            X.Dew r5 = new X.Dew
            r5.<init>(r4, r6, r4)
            r4.A0J = r5
            com.instagram.common.session.UserSession r5 = A03(r4)
            X.1vn r5 = X.1vm.A01(r5)
            r4.A06 = r5
            java.lang.Integer r7 = r4.A0K
            java.lang.String r10 = "type"
            if (r7 == 0) goto L_0x02d2
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r7 != r5) goto L_0x02c0
            androidx.fragment.app.Fragment r6 = r4.mParentFragment
            if (r6 == 0) goto L_0x02c0
            boolean r5 = r6 instanceof com.instagram.user.userlist.fragment.UnifiedFollowFragment
            if (r5 == 0) goto L_0x02c0
            com.instagram.user.userlist.fragment.UnifiedFollowFragment r6 = (com.instagram.user.userlist.fragment.UnifiedFollowFragment) r6
            X.DuK r7 = r6.A0G
        L_0x01c1:
            if (r7 != 0) goto L_0x01ef
        L_0x01c3:
            com.instagram.common.session.UserSession r8 = A03(r4)
            java.lang.Integer r5 = r4.A0K
            if (r5 == 0) goto L_0x02d2
            int r5 = r5.intValue()
            if (r5 == r1) goto L_0x02bb
            r6 = 31784969(0x1e50009, float:8.4121365E-38)
            if (r5 == r2) goto L_0x01d7
            r6 = 0
        L_0x01d7:
            java.lang.String r5 = A05(r4)
            X.DuK r7 = new X.DuK
            r7.<init>(r8, r5, r6)
            android.content.Context r6 = r4.requireContext()
            com.instagram.common.session.UserSession r5 = A03(r4)
            X.2cc r5 = X.C71342cb.A00(r5)
            r7.A0R(r6, r5, r4)
        L_0x01ef:
            r4.A0I = r7
            java.lang.String r16 = "perfLogger"
            if (r7 == 0) goto L_0x0377
            com.instagram.user.model.User r5 = r4.A0C
            if (r5 == 0) goto L_0x02b7
            java.lang.String r6 = r5.getId()
        L_0x01fd:
            java.lang.String r5 = "user_id"
            r7.A0J(r5, r6)
            java.lang.String r5 = "using_graphql"
            r7.A0K(r5, r1)
            com.instagram.common.session.UserSession r7 = A03(r4)
            com.instagram.user.recommended.FollowListData r6 = r4.A0D
            if (r6 == 0) goto L_0x0247
            X.Det r5 = new X.Det
            r5.<init>(r3, r7, r6)
            r4.A0j = r5
            android.content.Context r20 = r4.requireContext()
            androidx.fragment.app.FragmentActivity r19 = r4.requireActivity()
            com.instagram.common.session.UserSession r22 = A03(r4)
            com.instagram.user.model.User r5 = r4.A0C
            r28 = r5
            com.instagram.user.recommended.FollowListData r14 = r4.A0D
            if (r14 == 0) goto L_0x0247
            X.EUM r13 = new X.EUM
            r13.<init>(r4)
            androidx.fragment.app.FragmentActivity r6 = r4.requireActivity()
            com.instagram.common.session.UserSession r5 = A03(r4)
            X.ELS r12 = new X.ELS
            r12.<init>((androidx.fragment.app.FragmentActivity) r6, (com.instagram.common.session.UserSession) r5, (X.C46430Der) r4)
            X.EvK r11 = new X.EvK
            r11.<init>(r4)
            X.Dew r10 = r4.A0J
            if (r10 != 0) goto L_0x024f
            java.lang.String r17 = "paginationHelper"
        L_0x0247:
            X.0qQ.A0F(r17)
        L_0x024a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024f:
            android.content.Context r6 = r4.requireContext()
            X.EVw r5 = r4.A0H
            java.lang.String r43 = X.C49188Eqt.A00(r6, r5)
            boolean r5 = r4.A0o
            r21 = r5
            com.instagram.user.recommended.FollowListData r5 = r4.A0D
            if (r5 == 0) goto L_0x0247
            X.Df5 r6 = r5.A00
            com.instagram.common.session.UserSession r8 = A03(r4)
            X.AnonymousClass7TG.A1N(r6, r8)
            if (r6 == r0) goto L_0x0274
            X.Df5 r5 = X.C46443Df5.FOLLOWING
            if (r6 == r5) goto L_0x0274
            X.Df5 r5 = X.C46443Df5.MUTUAL
            if (r6 != r5) goto L_0x0283
        L_0x0274:
            X.0Tu r7 = X.0Tu.A05
            r5 = 36325673748608128(0x810e0200033480, double:3.035840578142823E-306)
            boolean r5 = X.182.A06(r7, r8, r5)
            r50 = 1
            if (r5 != 0) goto L_0x0285
        L_0x0283:
            r50 = 0
        L_0x0285:
            java.lang.String r6 = r4.A0M
            if (r6 == 0) goto L_0x0293
            java.lang.String r5 = "potential_spam"
            boolean r5 = r6.equals(r5)
            r51 = 0
            if (r5 != 0) goto L_0x0295
        L_0x0293:
            r51 = 1
        L_0x0295:
            com.instagram.common.session.UserSession r8 = X.DbU.A0W(r4)
            X.0Tu r7 = X.0Tu.A06
            r5 = 36597119976868576(0x8204e300060ae0, double:3.207504265920959E-306)
            int r47 = X.DbS.A04(r7, r8, r5)
            X.DuK r7 = r4.A0I
            if (r7 == 0) goto L_0x0377
            java.lang.String r5 = r4.A0R
            r18 = r5
            boolean r5 = r4.A0p
            r16 = r5
            X.Det r6 = r4.A0j
            if (r6 != 0) goto L_0x0312
            java.lang.String r17 = "followListParams"
            goto L_0x0247
        L_0x02b7:
            java.lang.String r6 = ""
            goto L_0x01fd
        L_0x02bb:
            r6 = 31784968(0x1e50008, float:8.412136E-38)
            goto L_0x01d7
        L_0x02c0:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r7 != r5) goto L_0x01c3
            androidx.fragment.app.Fragment r6 = r4.mParentFragment
            if (r6 == 0) goto L_0x01c3
            boolean r5 = r6 instanceof com.instagram.user.userlist.fragment.UnifiedFollowFragment
            if (r5 == 0) goto L_0x01c3
            com.instagram.user.userlist.fragment.UnifiedFollowFragment r6 = (com.instagram.user.userlist.fragment.UnifiedFollowFragment) r6
            X.DuK r7 = r6.A0F
            goto L_0x01c1
        L_0x02d2:
            X.0qQ.A0F(r10)
            goto L_0x024a
        L_0x02d7:
            X.EUS r7 = r4.A11
            goto L_0x0189
        L_0x02db:
            java.lang.String r0 = "aggregated_scf"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = r4.A0L
            if (r0 == 0) goto L_0x02ed
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02fb
        L_0x02ed:
            r0 = 2131963234(0x7f132d62, float:1.9563216E38)
            java.lang.String r0 = r4.getString(r0)
            r4.A0L = r0
            r0 = 2131963230(0x7f132d5e, float:1.9563208E38)
            goto L_0x015f
        L_0x02fb:
            r0 = 3141(0xc45, float:4.401E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0165
            r0 = 2131963233(0x7f132d61, float:1.9563214E38)
            java.lang.String r0 = r4.getString(r0)
            r4.A0L = r0
            goto L_0x0165
        L_0x0312:
            boolean r8 = r4.A0Y
            java.lang.String r5 = "FollowListFragment.AddAdUniversalCTAGap"
            boolean r54 = r3.getBoolean(r5, r2)
            X.Dex r2 = new X.Dex
            r23 = r4
            r24 = r12
            r25 = r4
            r26 = r10
            r27 = r4
            r29 = r14
            r30 = r13
            r31 = r4
            r32 = r4
            r33 = r11
            r34 = r4
            r35 = r4
            r36 = r4
            r37 = r4
            r38 = r4
            r39 = r4
            r40 = r4
            r41 = r7
            r42 = r6
            r45 = r18
            r48 = r21
            r52 = r16
            r53 = r8
            r18 = r2
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r4.A0E = r2
            com.instagram.common.session.UserSession r6 = A03(r4)
            X.328 r5 = new X.328
            r5.<init>(r4, r9)
            X.32A r2 = new X.32A
            r2.<init>(r4, r6, r5)
            r4.A0h = r2
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            r4.A0k = r2
            android.content.Context r7 = r4.requireContext()
            com.instagram.common.session.UserSession r6 = A03(r4)
            X.Dex r5 = r4.A0E
            if (r5 != 0) goto L_0x037c
            java.lang.String r16 = "followListAdapter"
        L_0x0377:
            X.0qQ.A0F(r16)
            goto L_0x024a
        L_0x037c:
            X.7Q8 r2 = new X.7Q8
            r2.<init>(r7, r6, r5)
            r4.A0i = r2
            A03(r4)
            X.02m r5 = X.02m.A0p
            X.0qQ.A07(r5)
            X.F28 r2 = new X.F28
            r2.<init>(r5)
            r4.A0G = r2
            X.0h9 r9 = r4.mLifecycleRegistry
            com.instagram.common.session.UserSession r8 = A03(r4)
            android.content.Context r7 = r4.requireContext()
            com.instagram.user.recommended.FollowListData r2 = r4.A0D
            if (r2 == 0) goto L_0x0247
            java.lang.String r6 = r2.A02
            r2 = 39
            X.G2f r5 = new X.G2f
            r5.<init>(r4, r2)
            X.72F r2 = new X.72F
            r2.<init>(r7, r8, r6, r5)
            r9.A09(r2)
            com.instagram.common.session.UserSession r2 = A03(r4)
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Class<X.3DS> r5 = X.AnonymousClass3DS.class
            X.1wn r2 = r4.A0w
            r6.A01(r2, r5)
            java.lang.Class<X.36g> r5 = X.C2370836g.class
            X.7Q8 r2 = r4.A0i
            if (r2 != 0) goto L_0x03ca
            java.lang.String r17 = "followStatusUpdatedListener"
            goto L_0x0247
        L_0x03ca:
            r6.A01(r2, r5)
            java.lang.Class<X.FWS> r5 = X.FWS.class
            X.1wn r2 = r4.A0y
            r6.A01(r2, r5)
            java.lang.Class<X.FW0> r5 = X.FW0.class
            X.1wn r2 = r4.A0x
            r6.A01(r2, r5)
            com.instagram.common.session.UserSession r5 = A03(r4)
            com.instagram.user.recommended.FollowListData r2 = r4.A0D
            if (r2 == 0) goto L_0x0247
            java.lang.String r2 = r2.A02
            boolean r2 = X.2R8.A05(r5, r2)
            if (r2 == 0) goto L_0x03fd
            com.instagram.user.recommended.FollowListData r2 = r4.A0D
            if (r2 == 0) goto L_0x0247
            X.Df5 r2 = r2.A00
            if (r2 == r0) goto L_0x03fb
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r2 == r0) goto L_0x03fb
            X.Df5 r0 = X.C46443Df5.FOLLOWING_SIMPLIFIED
            if (r2 != r0) goto L_0x03fd
        L_0x03fb:
            r4.A0S = r1
        L_0x03fd:
            java.lang.String r1 = "FollowListFragment.MediaId"
            r0 = 0
            java.lang.String r2 = r3.getString(r1, r0)
            if (r2 == 0) goto L_0x0423
            android.content.Context r0 = r4.requireContext()
            X.6zK r0 = X.C324456zJ.A00(r0)
            r4.A05 = r0
            r4.registerLifecycleListener(r0)
            com.instagram.common.session.UserSession r1 = X.DbU.A0W(r4)
            java.lang.String r0 = "fragment_argument_ad_retrieval_key"
            java.lang.String r0 = r3.getString(r0)
            X.1Xl r0 = X.C324666zh.A00(r1, r0, r2)
            r4.A04 = r0
        L_0x0423:
            com.instagram.common.session.UserSession r3 = A03(r4)
            r1 = 31793647(0x1e521ef, float:8.4170007E-38)
            java.lang.String r0 = "follow_list_su"
            X.6rm r2 = new X.6rm
            r2.<init>(r3, r0, r1)
            r4.A09 = r2
            android.content.Context r1 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = A03(r4)
            X.2cc r0 = X.C71342cb.A00(r0)
            r2.A0R(r1, r0, r4)
            r0 = -1721966452(0xffffffff995ce08c, float:-1.141908E-23)
            X.AnonymousClass0fD.A09(r0, r15)
            return
        L_0x0449:
            r0 = 0
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46430Der.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(523129157);
        0qQ.A0B(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        this.A0B = new TypeaheadHeader(context);
        boolean z = this.A0U;
        int i = R.layout.layout_refreshablelistview_with_progress;
        if (z) {
            i = R.layout.layout_listview_with_progress;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        if (inflate == null) {
            0qQ.A0F("view");
            throw AnonymousClass00P.createAndThrow();
        }
        View requireViewById = inflate.requireViewById(R.id.layout_listview_parent_container);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A02 = (ViewGroup) requireViewById;
        AnonymousClass0fD.A09(497504517, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1222244794);
        FollowListData followListData = this.A0D;
        String str = "followListData";
        if (followListData != null) {
            C61076JwE jwE = new C61076JwE(followListData.A00, followListData.A02);
            ConcurrentHashMap concurrentHashMap = ((F2V) this.A0t.getValue()).A02;
            if (concurrentHashMap.containsKey(jwE)) {
                concurrentHashMap.remove(jwE);
            }
            F05 f05 = this.A0F;
            if (f05 == null) {
                str = "followListFragmentQueryManager";
            } else {
                f05.A01.onDestroy();
                f05.A02.onDestroy();
                1Ng A002 = AnonymousClass1Nd.A00(A03(this));
                A002.A02(this.A0w, AnonymousClass3DS.class);
                Class<C2370836g> cls = C2370836g.class;
                AnonymousClass7Q8 r0 = this.A0i;
                str = "followStatusUpdatedListener";
                if (r0 != null) {
                    A002.A02(r0, cls);
                    A002.A02(this.A0y, FWS.class);
                    A002.A02(this.A0x, FW0.class);
                    AnonymousClass7Q8 r02 = this.A0i;
                    if (r02 != null) {
                        r02.A01();
                        F28 f28 = this.A0G;
                        if (f28 == null) {
                            str = "tailLoadPerfLogger";
                        } else {
                            int i = f28.A00;
                            if (i != 0) {
                                02m r2 = f28.A01;
                                r2.markerAnnotate(i, AnonymousClass000.A00(537), "User Exited Follow List Fragment");
                                r2.markerEnd(f28.A00, 4);
                                f28.A00 = 0;
                            }
                            super.onDestroy();
                            AnonymousClass0fD.A09(-1590272177, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        String str;
        AnonymousClass7g1 r0;
        String str2;
        AnonymousClass7g1 r02;
        int A022 = AnonymousClass0fD.A02(-9297215);
        F05 f05 = this.A0F;
        if (f05 == null) {
            str2 = "followListFragmentQueryManager";
        } else {
            if (this.A0b) {
                str = this.A0R;
            } else {
                str = this.A0H.A00;
            }
            0qQ.A0B(str, 0);
            if (f05.A00) {
                r0 = f05.A03;
            } else {
                r0 = f05.A04;
            }
            AnonymousClass9P5 BiX = r0.BiX(str);
            f05.A01.onDestroyView();
            f05.A02.onDestroyView();
            if (BiX.A01 != AnonymousClass05K.A00) {
                if (f05.A00) {
                    r02 = f05.A03;
                } else {
                    r02 = f05.A04;
                }
                r02.A9y(BiX, str);
            }
            C228172ku r1 = this.A0z;
            C46434Dew dew = this.A0J;
            if (dew == null) {
                str2 = "paginationHelper";
            } else {
                ArrayList arrayList = r1.A02;
                arrayList.remove(dew);
                TypeaheadHeader typeaheadHeader = this.A0B;
                if (typeaheadHeader != null) {
                    C46458DfM dfM = typeaheadHeader.A04;
                    0qQ.A0B(dfM, 0);
                    arrayList.remove(dfM);
                    typeaheadHeader.A01();
                }
                this.A0B = null;
                this.A0f = null;
                this.A0v.removeCallbacksAndMessages((Object) null);
                super.onDestroyView();
                AnonymousClass0fD.A09(1779047731, A022);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1451256472);
        C46430Der.super.onPause();
        DbS.A1D(this);
        C49945FFy fFy = this.A07;
        if (fFy != null) {
            fFy.A02();
        }
        F28 f28 = this.A0G;
        if (f28 == null) {
            0qQ.A0F("tailLoadPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = f28.A00;
        if (i != 0) {
            f28.A01.markerPoint(i, C273654mx.A00(148));
        }
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            typeaheadHeader.A03 = null;
        }
        AnonymousClass0fD.A09(-2047071548, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1276345286);
        super.onResume();
        if (!this.A0V && (!this.A0a || this.A0X)) {
            A0C(this);
        }
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (A062 != null && A062.A0Z() && A062.A0H == AnonymousClass3BQ.FOLLOW_LIST) {
            A062.A0X(this);
        }
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            typeaheadHeader.A03 = this;
        }
        F28 f28 = this.A0G;
        if (f28 == null) {
            0qQ.A0F("tailLoadPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = f28.A00;
        if (i != 0) {
            f28.A01.markerPoint(i, C273654mx.A00(2395));
        }
        AnonymousClass0fD.A09(1226099290, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        String str;
        int A032 = AnonymousClass0fD.A03(-1091440234);
        0qQ.A0B(absListView, 0);
        this.A0z.onScroll(absListView, i, i2, i3);
        if (!this.A0T) {
            C46434Dew dew = this.A0J;
            if (dew == null) {
                str = "paginationHelper";
            } else {
                String str2 = dew.A00;
                if ((str2 == null || str2.length() == 0) && !this.A0c) {
                    C46435Dex dex = this.A0E;
                    if (dex == null) {
                        str = "followListAdapter";
                    } else if (A0U(this, dex.A0C) && i + i2 == i3 - 5 && !this.A0c) {
                        A08();
                        this.A0c = true;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(513049017, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, -1554540686);
        this.A0z.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(169628704, A0D2);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-782690242);
        C46430Der.super.onStart();
        A09();
        AnonymousClass0fD.A09(-738489409, A022);
    }

    public final C358248ab ALt(C358248ab r1) {
        Dba.A1K(this, r1);
        return r1;
    }
}
