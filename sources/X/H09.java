package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class H09 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MiddleStateProfilePreviewCardFragment";
    public int A00;
    public int A01;
    public View A02;
    public MiddleStateCardUser A03;
    public C293005js A04;
    public User A05;
    public C230012om A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public int A0C = -1;
    public final String A0D = "middle_state_profile_preview_card";
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final 1wn A0G = new IO4((Object) this, 5);

    public final void A04(User user, List list, boolean z) {
        String str;
        1Xj r2;
        ExtendedImageUrl A1m;
        View view = this.A02;
        Integer num = null;
        if (view != null) {
            ViewGroup A0I = DbX.A0I(view, R.id.profile_preview_card_user_media_container);
            if (user != null) {
                num = user.A0N();
            }
            if (num == AnonymousClass05K.A0C) {
                A01(R.drawable.instagram_lock_outline_96, AnonymousClass7TE.A16(requireContext(), 2131975275), AnonymousClass7TE.A16(requireContext(), 2131962588));
            } else if (AnonymousClass7TE.A1b(list)) {
                A0I.getLayoutParams().height = -2;
                int i = 0;
                do {
                    LayoutInflater from = LayoutInflater.from(getContext());
                    View view2 = this.A02;
                    if (view2 != null) {
                        int i2 = 0;
                        View inflate = from.inflate(R.layout.grid_row_container, (ViewGroup) view2, false);
                        0qQ.A0C(inflate, C273654mx.A00(1));
                        ViewGroup viewGroup = (ViewGroup) inflate;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        if (i < 1) {
                            layoutParams.setMargins(0, 0, 0, DbV.A05(this).getDimensionPixelSize(R.dimen.abc_control_corner_material));
                        }
                        viewGroup.setLayoutParams(layoutParams);
                        do {
                            int i3 = (i * 3) + i2;
                            if (i3 < list.size()) {
                                r2 = DbZ.A0T(list, i3);
                            } else {
                                r2 = null;
                            }
                            IgImageView constrainedImageView = new ConstrainedImageView(requireContext());
                            if (!(r2 == null || (A1m = r2.A1m(DbV.A05(this).getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble_and_uas))) == null)) {
                                constrainedImageView.setUrl(DbT.A0X(this.A0E), A1m, this);
                            }
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                            if (i2 < 2) {
                                layoutParams2.setMarginEnd(DbV.A05(this).getDimensionPixelSize(R.dimen.abc_control_corner_material));
                            }
                            constrainedImageView.setLayoutParams(layoutParams2);
                            constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            viewGroup.addView(constrainedImageView);
                            i2++;
                        } while (i2 < 3);
                        A0I.addView(viewGroup);
                        i++;
                    }
                } while (i < 2);
            } else if (z) {
                0qQ.A0B(A0I, 0);
                A01(R.drawable.instagram_arrow_cw_pano_outline_24, AnonymousClass7TE.A16(requireContext(), 2131956762), "");
                View requireViewById = A0I.requireViewById(R.id.profile_preview_card_empty_state_icon);
                int dimensionPixelSize = Dbb.A09(this, requireViewById).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                requireViewById.getLayoutParams().width = dimensionPixelSize;
                requireViewById.getLayoutParams().height = dimensionPixelSize;
            } else {
                if (user != null) {
                    str = DbY.A0b(requireContext(), user, 2131968413);
                    0qQ.A07(str);
                } else {
                    str = "";
                }
                A01(R.drawable.empty_state_camera, AnonymousClass7TE.A16(requireContext(), 2131968412), str);
            }
            C56802ICz.A01(A0I, 4, this);
            A0I.setVisibility(0);
            return;
        }
        0qQ.A0F("containerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbX.A0R(this.A0E).A01(this.A0G, AnonymousClass3KA.class);
        C51969G9p.A15(getViewLifecycleOwner(), ((C46780Dl7) this.A0F.getValue()).A00, J6S.A00(view, this, 28), 16);
    }

    public final void A00() {
        FragmentActivity activity;
        int i = this.A0C;
        if (!(i == -1 || (activity = getActivity()) == null)) {
            AnonymousClass2uJ.A04(activity, i);
        }
        1a1 A022 = C46447Df9.A02();
        AnonymousClass0eM r5 = this.A0E;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        UserSession A0l2 = AnonymousClass7TE.A0l(r5);
        String str = this.A0A;
        if (str == null) {
            0qQ.A0F("userId");
            throw AnonymousClass00P.createAndThrow();
        }
        C46474Dfc A012 = C46548Dgp.A01(A0l2, str, "middle_state_profile_preview_card", this.A0D);
        A012.A0i = true;
        Dbb.A11(A022.A02(A0l, A012.A04()), requireActivity(), DbT.A0X(r5));
    }

    public final void A01(int i, String str, String str2) {
        View view = this.A02;
        if (view == null) {
            0qQ.A0F("containerView");
            throw AnonymousClass00P.createAndThrow();
        }
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.profile_preview_card_empty_state_container);
        ImageView A0J = DbX.A0J(A0G2, R.id.profile_preview_card_empty_state_icon);
        TextView A0R = AnonymousClass7TG.A0R(A0G2, R.id.profile_preview_card_empty_state_title);
        TextView A0R2 = AnonymousClass7TG.A0R(A0G2, R.id.profile_preview_card_empty_state_subtitle);
        A0G2.setVisibility(0);
        A0J.setImageResource(i);
        A0R.setText(str);
        if (str2.length() > 0) {
            A0R2.setText(str2);
        } else {
            A0R2.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ad, code lost:
        if (r10 != null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b2, code lost:
        if (r10 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r9, com.instagram.user.model.User r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x00ac
            X.4Cl r0 = r10.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x00ac
            int r4 = r0.intValue()
        L_0x000e:
            X.4Cl r0 = r10.A03
            java.lang.Integer r0 = r0.B70()
            if (r0 == 0) goto L_0x00b1
            int r7 = r0.intValue()
        L_0x001a:
            X.4Cl r0 = r10.A03
            java.lang.Integer r0 = r0.BPt()
            if (r0 == 0) goto L_0x00b6
            int r6 = r0.intValue()
        L_0x0026:
            r0 = 2131438464(0x7f0b2b80, float:1.8498856E38)
            android.view.View r0 = r9.findViewById(r0)
            r3 = 0
            X.3oV r5 = X.2b1.A00(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440380(0x7f0b32fc, float:1.8502742E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            android.content.res.Resources r0 = X.DbV.A05(r8)
            r4 = 1
            java.lang.String r0 = X.C14066TpE.A00(r0, r1, r3, r4)
            r2.setText(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440384(0x7f0b3300, float:1.850275E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            android.content.res.Resources r0 = X.DbV.A05(r8)
            java.lang.String r0 = X.C14066TpE.A00(r0, r1, r3, r4)
            r2.setText(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440390(0x7f0b3306, float:1.8502762E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            android.content.res.Resources r0 = X.DbV.A05(r8)
            java.lang.String r0 = X.C14066TpE.A00(r0, r1, r3, r4)
            r2.setText(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440368(0x7f0b32f0, float:1.8502717E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackground(r3)
            android.view.View r1 = r5.getView()
            r0 = 2131440362(0x7f0b32ea, float:1.8502705E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackground(r3)
            android.view.View r1 = r5.getView()
            r0 = 2131440363(0x7f0b32eb, float:1.8502707E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackground(r3)
            return
        L_0x00ac:
            r4 = 0
            if (r10 == 0) goto L_0x00b1
            goto L_0x000e
        L_0x00b1:
            r7 = 0
            if (r10 == 0) goto L_0x00b6
            goto L_0x001a
        L_0x00b6:
            r6 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H09.A02(android.view.View, com.instagram.user.model.User):void");
    }

    public final void A05(String str) {
        MiddleStateCardUser middleStateCardUser = this.A03;
        String str2 = "middleStateCardUser";
        if (middleStateCardUser != null) {
            if (middleStateCardUser.A0A) {
                String str3 = this.A0A;
                if (str3 != null) {
                    String str4 = this.A07;
                    if (str4 == null) {
                        str2 = "containerModule";
                    } else {
                        String str5 = "";
                        String str6 = middleStateCardUser.A00;
                        int i = this.A01;
                        int i2 = this.A00;
                        String str7 = middleStateCardUser.A07;
                        String str8 = middleStateCardUser.A04;
                        String str9 = middleStateCardUser.A05;
                        String str10 = middleStateCardUser.A06;
                        String str11 = middleStateCardUser.A03;
                        if (str11 != null) {
                            str5 = str11;
                        }
                        C230012om r0 = this.A06;
                        if (r0 != null) {
                            C230012om.A04(r0, str6, str4, (String) null, str, str5, str8, str9, str10, str7, str3, "middle_state_profile", i2, i);
                            return;
                        }
                        return;
                    }
                }
            } else {
                C293005js r1 = this.A04;
                if (r1 != null) {
                    String str12 = this.A0A;
                    if (str12 != null) {
                        int i3 = this.A00;
                        String str13 = middleStateCardUser.A01;
                        if (str13 != null) {
                            r1.A03(str12, str13, "middle_state_profile", middleStateCardUser.A00, middleStateCardUser.A07, i3);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    return;
                }
            }
            str2 = "userId";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        0qQ.A0F("containerModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public H09() {
        C58178Ini ini = new C58178Ini(this, 37);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58178Ini(new C58178Ini(this, 34), 35));
        this.A0F = DbS.A0I(new C58178Ini(A002, 36), ini, new C58186Inq(7, (Object) null, A002), DbS.A0z(C46780Dl7.class));
        this.A0E = C227642jf.A02(this);
    }

    public final void A03(View view, User user) {
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(view, R.id.profile_header_avatar_container_top_left_stub);
        viewStub.setLayoutResource(R.layout.profile_header_user_avatar);
        View inflate = viewStub.inflate();
        IgImageView A0b = DbX.A0b(inflate, R.id.row_profile_header_imageview);
        if (user != null) {
            user.Bh3();
            DbU.A1S(this, A0b, user);
        } else {
            DbU.A13(requireContext(), A0b, R.drawable.profile_anonymous_user);
        }
        ViewGroup.MarginLayoutParams A0G2 = DbX.A0G(A0b);
        int dimension = (int) DbV.A05(this).getDimension(R.dimen.activation_card_icon_container_width);
        A0G2.height = dimension;
        A0G2.width = dimension;
        A0G2.bottomMargin = DbY.A01(requireContext());
        A0b.setLayoutParams(A0G2);
        DbX.A1B(inflate, R.id.reel_ring);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-50512349);
        H09.super.onCreate(bundle);
        MiddleStateCardUser middleStateCardUser = (MiddleStateCardUser) C320236s2.A00(requireArguments(), MiddleStateCardUser.class, "ARG_MIDDLE_STATE_CARD_USER");
        this.A03 = middleStateCardUser;
        if (middleStateCardUser != null) {
            this.A0A = middleStateCardUser.A08;
            String str = middleStateCardUser.A09;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            this.A0B = str;
            String str3 = middleStateCardUser.A02;
            if (str3 == null) {
                str3 = str2;
            }
            this.A09 = str3;
            this.A00 = requireArguments().getInt("ARG_ITEM_POSITION");
            this.A01 = requireArguments().getInt(C66579MXk.A00(86));
            String string = requireArguments().getString(C66579MXk.A00(85));
            if (string == null) {
                string = str2;
            }
            this.A08 = string;
            String string2 = requireArguments().getString(C66579MXk.A00(84));
            if (string2 != null) {
                str2 = string2;
            }
            this.A07 = str2;
            this.A0C = requireArguments().getInt("ARG_INITIAL_NAVIGATION_BAR_COLOR");
            MiddleStateCardUser middleStateCardUser2 = this.A03;
            if (middleStateCardUser2 != null) {
                boolean z = middleStateCardUser2.A0A;
                UserSession A0l = AnonymousClass7TE.A0l(this.A0E);
                if (z) {
                    this.A06 = new C230012om(this, A0l);
                } else {
                    this.A04 = new C293005js(this, A0l);
                }
                AnonymousClass0fD.A09(-1268465324, A022);
                return;
            }
        }
        0qQ.A0F("middleStateCardUser");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(740799425);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.profile_preview_card, viewGroup, false);
        this.A02 = inflate;
        if (inflate == null) {
            0qQ.A0F("containerView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1355409893, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-815063147);
        super.onDestroyView();
        DbX.A0R(this.A0E).A02(this.A0G, AnonymousClass3KA.class);
        AnonymousClass0fD.A09(995440015, A022);
    }
}
