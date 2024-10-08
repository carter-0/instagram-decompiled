package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsSpotlightModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class GDB {
    public Drawable A00;
    public Drawable A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public RelativeLayout A05;
    public 2da A06;
    public ActionBarTitleViewSwitcher A07;
    public HCB A08;
    public HPJ A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final FragmentActivity A0D;
    public final ClipsViewerConfig A0E;
    public final ClipsViewerSource A0F;
    public final UserSession A0G;
    public final C55925Hpn A0H;
    public final C227232is A0I;
    public final GBE A0J;
    public final JR1 A0K;
    public final C52012GBj A0L;
    public final GD9 A0M;
    public final List A0N;
    public final AnonymousClass0eM A0O = AnonymousClass0eN.A01(GJQ.A00);

    public GDB(ClipsViewerConfig clipsViewerConfig, UserSession userSession, HPJ hpj, C55925Hpn hpn, C227232is r6, GBE gbe, JR1 jr1, C52012GBj gBj, GD9 gd9, List list) {
        AnonymousClass7TG.A0w(1, userSession, gd9, clipsViewerConfig);
        C51972G9s.A1E(hpn, list);
        0qQ.A0B(hpj, 10);
        this.A0G = userSession;
        this.A0I = r6;
        this.A0M = gd9;
        this.A0E = clipsViewerConfig;
        this.A0L = gBj;
        this.A0H = hpn;
        this.A0N = list;
        this.A0K = jr1;
        this.A0J = gbe;
        this.A09 = hpj;
        this.A0D = r6.requireActivity();
        this.A0C = r6.requireContext();
        this.A0F = clipsViewerConfig.A0J;
    }

    public final void A0C(C267324bN r13) {
        String id;
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            IgImageView A0b = AnonymousClass7TE.A0b(relativeLayout, R.id.sender_profile_pic);
            TextView A0B2 = DbW.A0B(relativeLayout, R.id.sender_username_or_fullname);
            TextView A0B3 = DbW.A0B(relativeLayout, R.id.sender_timestamp);
            View A0b2 = AnonymousClass7TE.A0b(relativeLayout, R.id.suggested_title);
            1Xj r0 = r13.A02;
            ClipsSpotlightModel clipsSpotlightModel = null;
            if (!(r0 == null || (id = r0.getId()) == null)) {
                ClipsSpotlightData clipsSpotlightData = this.A0E.A0M;
                if (clipsSpotlightData != null) {
                    clipsSpotlightModel = (ClipsSpotlightModel) clipsSpotlightData.A00.get(id);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (clipsSpotlightModel != null) {
                User user = clipsSpotlightModel.A01;
                C56801ICy.A01(A0b, 38, new C54313H7i(4, user, this));
                A0b.setUrl(user.Bh3(), this.A0J.A19);
                SpannableStringBuilder A0C2 = DbS.A0C(user.B8Q());
                if (user.isVerified()) {
                    C244273av.A08(this.A0C, A0C2, false);
                }
                C56801ICy.A01(A0B2, 38, new C54313H7i(4, user, this));
                A0B2.setText(A0C2);
                Context context = this.A0C;
                DbX.A13(context, A0B3, 1G0.A09(AnonymousClass7TF.A0A(context), (double) clipsSpotlightModel.A00), 2131972284);
                A0b.setVisibility(0);
                A0B2.setVisibility(0);
                A0B3.setVisibility(0);
                A0b2.setVisibility(8);
                return;
            }
            A0B2.setVisibility(8);
            A0B3.setVisibility(8);
            A0b2.setVisibility(8);
            A0b.setVisibility(8);
        }
    }

    private final int A00() {
        boolean A092 = AnonymousClass3ZJ.A09(this.A0M.A02(), this.A0G);
        boolean A0W = this.A0J.A1K.A0W();
        if (!A092) {
            return R.drawable.instagram_volume_none_outline_44;
        }
        if (A0W) {
            return R.drawable.instagram_volume_outline_44;
        }
        return R.drawable.instagram_volume_off_outline_44;
    }

    public static final String A02(GDB gdb) {
        String A16 = AnonymousClass7TE.A16(gdb.A0C, ((GJY) AnonymousClass7TE.A13(gdb.A0N)).A00);
        ClipsViewerConfig clipsViewerConfig = gdb.A0E;
        String str = clipsViewerConfig.A0s;
        if (!(str == null || str.length() == 0)) {
            if (clipsViewerConfig.A0J != ClipsViewerSource.BLEND) {
                GBE gbe = gdb.A0J;
                if (!AnonymousClass7TF.A1Z(gbe.A1m) || !AnonymousClass7TF.A1Z(gbe.A1o) || !AnonymousClass7TF.A1Z(gbe.A1q)) {
                    return str;
                }
            }
            return str;
        }
        return A16;
    }

    public static final void A03(GDB gdb) {
        Integer num;
        View view;
        C295365o2 r1;
        View view2;
        ImageView imageView;
        2dZ r12;
        UserSession userSession = gdb.A0G;
        boolean A062 = 182.A06(0Tu.A06, userSession, 36321584941311540L);
        ClipsViewerConfig clipsViewerConfig = gdb.A0E;
        if ((clipsViewerConfig.A00() || A062) && (r12 = gdb.A06) != null) {
            r12.A0D = true;
        }
        HPJ hpj = gdb.A09;
        if (hpj instanceof C52066GDm) {
            num = ((C52066GDm) hpj).A00;
        } else if (hpj instanceof C54349H8v) {
            num = ((C54349H8v) hpj).A00;
        } else {
            num = ((C54350H8w) hpj).A00;
        }
        ClipsViewerSource clipsViewerSource = gdb.A0F;
        ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.CLIPS_TAB;
        boolean z = true;
        if (!AnonymousClass7TF.A1W(clipsViewerSource, clipsViewerSource2) ? !gdb.A06() || num != AnonymousClass05K.A00 : num == AnonymousClass05K.A01) {
            z = false;
        }
        View view3 = null;
        if (z) {
            C56801ICy A002 = C56801ICy.A00(gdb, 41);
            Drawable drawable = gdb.A00;
            AnonymousClass3JR A012 = gdb.A01(A002, 2131956638, R.id.clips_viewer_content_notes_button, true);
            if (drawable != null) {
                A012.A0F = drawable;
            }
            2da r0 = gdb.A06;
            if (r0 != null) {
                view3 = C51970G9q.A0P(A012, r0);
            }
            gdb.A03 = view3;
            if ((view3 instanceof ImageView) && (imageView = (ImageView) view3) != null) {
                imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), DbS.A02(gdb.A0C, 8), imageView.getPaddingBottom());
                imageView.clearColorFilter();
            }
            RecyclerView A032 = C52012GBj.A03(gdb.A0L);
            if (A032 != null) {
                C238123Aq r4 = new C238123Aq(A032);
                View view4 = gdb.A03;
                if (view4 != null) {
                    Integer num2 = ((C55611HkW) gdb.A0O.getValue()).A01;
                    if (num2 != null) {
                        view4.setY(-((float) C229632nm.A03(r4.A03.computeVerticalScrollOffset(), 0, num2.intValue())));
                    }
                    r4.AAD(new HC9(2, view4, gdb));
                    return;
                }
                return;
            }
            return;
        }
        0Tu r7 = 0Tu.A05;
        if (0qQ.A0K(182.A04(r7, userSession, 36878509054492861L), "explore")) {
            AnonymousClass3JR A013 = gdb.A01(C56801ICy.A00(gdb, 43), 2131961865, R.id.clips_viewer_search_button, true);
            A013.A06 = R.drawable.instagram_search_pano_outline_24;
            2da r13 = gdb.A06;
            if (r13 != null) {
                r13.AA3(new AnonymousClass3Jb(A013));
            }
        }
        if (gdb.A06()) {
            boolean A063 = 182.A06(r7, userSession, 36324973669134880L);
            int i = R.drawable.instagram_camera_outline_44;
            boolean z2 = false;
            if (A063) {
                i = R.drawable.instagram_camera_gallery_pano_outline_24;
                z2 = true;
            }
            AnonymousClass3JR A014 = gdb.A01(C56801ICy.A00(gdb, 40), 2131956097, R.id.clips_viewer_camera_button, z2);
            A014.A06 = i;
            2da r02 = gdb.A06;
            if (r02 != null) {
                view = C51970G9q.A0P(A014, r02);
            } else {
                view = null;
            }
            gdb.A02 = view;
            C267324bN A022 = gdb.A0M.A02();
            if (A022 != null) {
                r1 = A022.A01;
            } else {
                r1 = null;
            }
            if (r1 == C295365o2.MIDCARD && C52213GJe.A00 && (view2 = gdb.A02) != null) {
                view2.setVisibility(8);
            }
        }
        if (clipsViewerSource == clipsViewerSource2 && 182.A06(r7, userSession, 36320038751313804L)) {
            AnonymousClass3JR A015 = gdb.A01(C56801ICy.A00(gdb, 44), 2131956098, R.id.clips_viewer_clips_showcase_button, false);
            A015.A06 = R.drawable.instagram_compass_pano_outline_24;
            2da r14 = gdb.A06;
            if (r14 != null) {
                r14.AA3(new AnonymousClass3Jb(A015));
            }
        }
        if (clipsViewerConfig.A0J == ClipsViewerSource.BLEND) {
            AnonymousClass3JR A016 = gdb.A01(C56801ICy.A00(gdb, 39), 2131956096, R.id.clips_viewer_blend_settings_button, false);
            A016.A06 = R.drawable.instagram_settings_pano_outline_24;
            2da r15 = gdb.A06;
            if (r15 != null) {
                r15.AA3(new AnonymousClass3Jb(A016));
            }
        }
        if (!1KU.A07(userSession) || !182.A06(r7, userSession, 36321254227125448L)) {
            gdb.A04 = null;
            return;
        }
        int i2 = 2131963761;
        if (gdb.A0J.A1K.A0W()) {
            i2 = 2131963762;
        }
        int A003 = gdb.A00();
        AnonymousClass3JR A017 = gdb.A01(C56801ICy.A00(gdb, 42), i2, R.id.audio_button, false);
        A017.A06 = A003;
        2da r03 = gdb.A06;
        if (r03 != null) {
            view3 = C51970G9q.A0P(A017, r03);
        }
        0qQ.A0C(view3, "null cannot be cast to non-null type android.widget.ImageView");
        gdb.A04 = (ImageView) view3;
        gdb.A0E(gdb.A0A);
    }

    public static final void A04(GDB gdb) {
        View view;
        2da r3 = gdb.A06;
        if (r3 != null) {
            view = r3.ETg(R.layout.layout_clips_action_bar_sender_info_layout, 0, 0, true);
        } else {
            view = null;
        }
        0qQ.A0C(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
        gdb.A05 = (RelativeLayout) view;
    }

    public static final void A05(GDB gdb) {
        ViewGroup viewGroup;
        View findViewById;
        1Xj r10;
        User user;
        GDB gdb2 = gdb;
        GD9 gd9 = gdb2.A0M;
        C267324bN A022 = gd9.A02();
        int A012 = C52012GBj.A01(gd9.A00);
        List<GJY> A0c = 00k.A0c(gdb2.A0N, 1);
        ArrayList A0r = AnonymousClass7TG.A0r(A0c);
        Iterator it = A0c.iterator();
        while (true) {
            Drawable drawable = null;
            if (!it.hasNext()) {
                break;
            }
            GJY gjy = (GJY) it.next();
            Context context = gdb2.A0C;
            String A16 = AnonymousClass7TE.A16(context, gjy.A00);
            Integer num = gjy.A04;
            if (num != null) {
                drawable = context.getDrawable(num.intValue());
            }
            A0r.add(new C367618rI((Drawable) null, drawable, (C15048ULb) null, new IVH(A022, gdb2, gjy, A012), (Integer) null, A16, 0, 0, 0, false, false, false, true, false, false, false));
        }
        IgTextView igTextView = gdb2.A07;
        if (igTextView == null) {
            2da r0 = gdb2.A06;
            if (r0 != null) {
                igTextView = r0.C7y();
            } else {
                igTextView = null;
            }
        }
        View view = (View) igTextView;
        if (view != null) {
            Context context2 = gdb2.A0C;
            int A013 = DbY.A01(context2);
            UserSession userSession = gdb2.A0G;
            C355148Ov r02 = new C355148Ov(context2, userSession, (Integer) null, false);
            r02.A02(A0r);
            r02.showAsDropDown(view, 0, A013);
            GBE gbe = gdb2.A0J;
            gdb2.A0K.AGC(A022, C52318GNk.ITEM_INTERACTION, C52317GNj.A0D);
            for (GJY gjy2 : A0c) {
                C51979GAc gAc = gbe.A19;
                if (A022 != null) {
                    r10 = A022.A02;
                } else {
                    r10 = null;
                }
                AnonymousClass93T r6 = gbe.A1D;
                C52209GJa gJa = gjy2.A01;
                AnonymousClass7TF.A1C(gAc, 0, r6);
                if (r10 != null) {
                    user = C51966G9m.A11(r10);
                } else {
                    user = null;
                }
                if (!(gJa == null || r10 == null || user == null)) {
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, userSession), "instagram_clips_viewer_lane_button_impression");
                    if (A0e.isSampled()) {
                        C51979GAc.A01(A0e, gAc);
                        String A2n = r10.A2n();
                        if (A2n != null) {
                            G9t.A1J(A0e, A2n);
                            G9t.A1K(A0e, user.getId());
                            C51969G9p.A16(A0e, A012);
                            C51970G9q.A1G(A0e, r6);
                            A0e.A8M(gJa, "lane_type");
                            C51972G9s.A14(A0e, r10);
                            C51965G9l.A1R(A0e, r6.AmZ());
                            AnonymousClass7TH.A0V(A0e);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        continue;
                    }
                }
            }
            2dZ r03 = gdb2.A06;
            if (r03 != null && (viewGroup = r03.A0Q) != null && (findViewById = viewGroup.findViewById(R.id.content_notes_nux_new_pill_background)) != null) {
                C51972G9s.A0I(findViewById).start();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r2 = r5.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r2.A1q != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r2.A1a != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r2.A0J == com.instagram.clips.intf.ClipsViewerSource.BLEND) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r5.A0J.A0V() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2.A1f != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (X.182.A06(r2, r3, r0) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 26) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A0G, 36324187689725820L) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06() {
        /*
            r5 = this;
            com.instagram.clips.intf.ClipsViewerSource r0 = r5.A0F
            int r1 = r0.ordinal()
            r0 = 11
            r4 = 1
            if (r1 == r0) goto L_0x0051
            r0 = 13
            if (r1 == r0) goto L_0x0051
            r0 = 67
            if (r1 == r0) goto L_0x0047
            r0 = 26
            if (r1 == r0) goto L_0x0027
        L_0x0017:
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324187689725820(0x810ca800002f7c, double:3.0349007885217726E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            com.instagram.clips.intf.ClipsViewerConfig r2 = r5.A0E
            boolean r0 = r2.A1q
            if (r0 != 0) goto L_0x0061
            boolean r0 = r2.A1a
            if (r0 != 0) goto L_0x0061
            com.instagram.clips.intf.ClipsViewerSource r1 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r1 == r0) goto L_0x0061
            X.GBE r0 = r5.A0J
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x0061
        L_0x0042:
            boolean r0 = r2.A1f
            if (r0 != 0) goto L_0x0061
            return r4
        L_0x0047:
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318217685178363(0x81073a000017fb, double:3.031125333606682E-306)
            goto L_0x005a
        L_0x0051:
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318217685309437(0x81073a000217fd, double:3.031125333689574E-306)
        L_0x005a:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0027
            goto L_0x0017
        L_0x0061:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDB.A06():boolean");
    }

    public static final boolean A07(GDB gdb) {
        List list = gdb.A0N;
        UserSession userSession = gdb.A0G;
        if (!list.containsAll(0sr.A1P(new GJY[]{GJY.A08, GJY.A09}))) {
            return false;
        }
        if ((!C52274GLq.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36318518333348059L)) && (!GM2.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36320128946085939L))) {
            return false;
        }
        return true;
    }

    public final void A08() {
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            View findViewById = relativeLayout.findViewById(R.id.sender_profile_pic);
            View findViewById2 = relativeLayout.findViewById(R.id.sender_username_or_fullname);
            View findViewById3 = relativeLayout.findViewById(R.id.sender_timestamp);
            View findViewById4 = relativeLayout.findViewById(R.id.suggested_title);
            if (findViewById != null && findViewById2 != null && findViewById3 != null && findViewById4 != null) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(8);
                findViewById4.setVisibility(8);
            }
        }
    }

    public final void A0A() {
        AnonymousClass9IL r0;
        User user;
        FriendshipStatus B8F;
        GMD A002 = GNS.A00(this.A0G);
        0qQ.A07(A002);
        int A062 = this.A0L.A06();
        AnonymousClass9JD A012 = A002.A01(0);
        if (A012 == null || (r0 = (AnonymousClass9IL) A012.A01) == null || (user = (User) r0.A02) == null || (B8F = user.A03.B8F()) == null || !AnonymousClass7TF.A1Y(B8F.B6y(), true)) {
            int i = ((GJY) this.A0N.get(0)).A00;
            2da r1 = this.A06;
            if (r1 != null) {
                r1.Eol(i, 2Yu.A0A(this.A0C));
                return;
            }
            return;
        }
        A08();
        Context context = this.A0C;
        float A042 = 0nA.A04(context, 70);
        2da r12 = this.A06;
        if (r12 != null) {
            r12.ETf((int) A042);
        }
        A04(this);
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            View findViewById = relativeLayout.findViewById(R.id.suggested_title);
            if (findViewById != null) {
                int i2 = 0;
                if (A062 == 0) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
            if (A062 == 0) {
                IgImageView findViewById2 = relativeLayout.findViewById(R.id.sender_profile_pic);
                TextView A0d = AnonymousClass7TE.A0d(relativeLayout, R.id.sender_username_or_fullname);
                TextView A0d2 = AnonymousClass7TE.A0d(relativeLayout, R.id.sender_timestamp);
                if (findViewById2 != null && A0d != null && A0d2 != null) {
                    C56801ICy.A01(findViewById2, 38, new C54313H7i(4, user, this));
                    findViewById2.setUrl(new SimpleImageUrl(user.Bh3()), this.A0J.A19);
                    findViewById2.setVisibility(0);
                    if (user.getFullName() != null) {
                        A0d.setText(user.getFullName());
                        A0d.setVisibility(0);
                    }
                    if (user.getUsername().length() != 0) {
                        DbU.A1H(A0d, user);
                        A0d.setVisibility(0);
                    }
                    DbT.A18(context, A0d2, 2131973119);
                    A0d2.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 >= 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(int r14) {
        /*
            r13 = this;
            com.instagram.clips.intf.ClipsViewerSource r1 = r13.A0F
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r1 == r0) goto L_0x000b
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r1 == r0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            android.widget.RelativeLayout r4 = r13.A05
            if (r4 == 0) goto L_0x000a
            com.instagram.common.session.UserSession r2 = r13.A0G
            X.GMD r10 = X.GNS.A00(r2)
            X.0qQ.A07(r10)
            int r0 = r10.A00
            r1 = 1
            r7 = 0
            if (r14 == r0) goto L_0x0020
            if (r14 != 0) goto L_0x0023
        L_0x0020:
            r11 = 1
            if (r0 < 0) goto L_0x0024
        L_0x0023:
            r11 = 0
        L_0x0024:
            X.GBj r0 = r13.A0L
            int r0 = r0.A06()
            if (r0 != 0) goto L_0x00f1
            if (r11 != 0) goto L_0x00f1
            X.9JD r6 = r10.A01(r7)
        L_0x0032:
            r0 = 2131441136(0x7f0b35f0, float:1.8504275E38)
            android.view.View r12 = r4.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r12 = (com.instagram.common.ui.widget.imageview.IgImageView) r12
            r0 = 2131441139(0x7f0b35f3, float:1.8504281E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r4, r0)
            r0 = 2131441138(0x7f0b35f2, float:1.850428E38)
            android.widget.TextView r9 = X.AnonymousClass7TE.A0d(r4, r0)
            r0 = 2131442150(0x7f0b39e6, float:1.8506332E38)
            android.view.View r5 = r4.findViewById(r0)
            if (r12 == 0) goto L_0x000a
            if (r3 == 0) goto L_0x000a
            if (r9 == 0) goto L_0x000a
            if (r5 == 0) goto L_0x000a
            r8 = 8
            if (r6 == 0) goto L_0x00f7
            java.lang.Object r4 = r6.A01
            X.9IL r4 = (X.AnonymousClass9IL) r4
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r11 = r4.A02
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            if (r11 == 0) goto L_0x000a
            r10 = 4
            X.H7i r0 = new X.H7i
            r0.<init>(r10, r11, r13)
            r6 = 38
            X.C56801ICy.A01(r12, r6, r0)
            com.instagram.common.typedurl.ImageUrl r1 = r11.Bh3()
            X.GBE r0 = r13.A0J
            X.GAc r0 = r0.A19
            r12.setUrl(r1, r0)
            r12.setVisibility(r7)
            boolean r0 = X.2R8.A04(r2, r11)
            if (r0 == 0) goto L_0x00ec
            android.content.Context r1 = r13.A0C
            r0 = 2131956139(0x7f1311ab, float:1.9548825E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0090:
            X.0qQ.A0A(r0)
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r0)
            boolean r0 = r11.isVerified()
            if (r0 == 0) goto L_0x00a2
            android.content.Context r0 = r13.A0C
            X.C244273av.A08(r0, r1, r7)
        L_0x00a2:
            X.H7i r0 = new X.H7i
            r0.<init>(r10, r11, r13)
            X.C56801ICy.A01(r3, r6, r0)
            r3.setText(r1)
            r3.setVisibility(r7)
            long r3 = r4.A01
            double r0 = (double) r3
            android.content.Context r3 = r13.A0C
            android.content.res.Resources r4 = X.AnonymousClass7TF.A0A(r3)
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r10
            java.lang.String r1 = X.1G0.A09(r4, r0)
            boolean r0 = X.C328447Ev.A01(r2)
            if (r0 != 0) goto L_0x00db
            boolean r0 = X.C328447Ev.A00(r2)
            if (r0 != 0) goto L_0x00db
            boolean r0 = X.C328447Ev.A02(r2)
            if (r0 != 0) goto L_0x00db
            boolean r0 = X.C328447Ev.A03(r2)
            if (r0 == 0) goto L_0x00e2
        L_0x00db:
            r0 = 2131972284(0x7f1350bc, float:1.9581571E38)
            java.lang.String r1 = X.DbW.A0h(r3, r1, r0)
        L_0x00e2:
            r9.setText(r1)
            r9.setVisibility(r7)
            r5.setVisibility(r8)
            return
        L_0x00ec:
            java.lang.String r0 = r11.B8Q()
            goto L_0x0090
        L_0x00f1:
            X.9JD r6 = r10.A01(r0)
            goto L_0x0032
        L_0x00f7:
            com.google.common.collect.ImmutableList r0 = r10.A03()
            int r0 = r0.size()
            if (r14 != r0) goto L_0x0148
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0148
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0148
            boolean r0 = X.C328447Ev.A01(r2)
            if (r0 != 0) goto L_0x0148
            boolean r0 = X.C328447Ev.A00(r2)
            if (r0 != 0) goto L_0x0148
            boolean r0 = X.C328447Ev.A02(r2)
            if (r0 != 0) goto L_0x0148
            r13.A0B = r1
            X.1xC r4 = X.1xC.A01
            X.6ap r3 = X.DbS.A0a()
            X.6aq r0 = X.C310346aq.SUCCESS
            r3.A0C(r0)
            android.content.Context r2 = r13.A0C
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r3.A02 = r0
            r0 = 2131975300(0x7f135c84, float:1.9587688E38)
            X.DbS.A19(r2, r3, r0)
            int r0 = X.Dc5.A01()
            r3.A01 = r0
            X.DbY.A1K(r4, r3)
        L_0x0148:
            r13.A08()
            if (r6 != 0) goto L_0x0153
            if (r11 != 0) goto L_0x0153
        L_0x014f:
            r5.setVisibility(r7)
            return
        L_0x0153:
            r7 = 8
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDB.A0B(int):void");
    }

    public final void A0D(boolean z) {
        0xa r4;
        0xY AR4;
        UserSession userSession = this.A0G;
        if (182.A06(0Tu.A05, userSession, 36321254227387596L)) {
            1Av A002 = 1Au.A00(userSession);
            if (!z) {
                r4 = A002.A01;
                if (!(!DbT.A1a(r4, "has_seen_tap_to_pause_audio_control_nux"))) {
                    return;
                }
            } else {
                0Tu r7 = 0Tu.A06;
                if (182.A06(r7, userSession, 36321254227584207L)) {
                    r4 = A002.A01;
                    boolean A1T = C51970G9q.A1T((((long) r4.getInt("tap_to_pause_audio_control_nux_shown_count", 0)) > 182.A01(r7, userSession, 36602729204355817L) ? 1 : (((long) r4.getInt("tap_to_pause_audio_control_nux_shown_count", 0)) == 182.A01(r7, userSession, 36602729204355817L) ? 0 : -1)));
                    boolean z2 = false;
                    if (System.currentTimeMillis() - DbW.A06(r4, "time_last_seen_tap_to_pause_audio_control_nux_on_paused") >= TimeUnit.DAYS.toMillis(182.A01(r7, userSession, 36602729204421354L))) {
                        z2 = true;
                    }
                    if (r4.getBoolean("has_clicked_audio_control_button", false) || !A1T || !z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C315476jx r2 = new C315476jx((CharSequence) AnonymousClass7TE.A16(this.A0C, 2131975020));
            ImageView imageView = this.A04;
            if (imageView != null) {
                AnonymousClass5Gt r1 = new AnonymousClass5Gt(this.A0D, r2);
                r1.A03(imageView);
                r1.A01();
                r1.A00 = 5000;
                r1.A0A = true;
                r1.A0G = true;
                r1.A04 = new C54392HBj(1);
                AnonymousClass5Gv A003 = r1.A00();
                if (z) {
                    A003.A07(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    0xY AR42 = r4.AR4();
                    AR42.E5c("time_last_seen_tap_to_pause_audio_control_nux_on_paused", currentTimeMillis);
                    AR42.apply();
                    AR4 = r4.AR4();
                    AR4.E5Z("tap_to_pause_audio_control_nux_shown_count", DbT.A00(r4, "tap_to_pause_audio_control_nux_shown_count") + 1);
                } else {
                    imageView.postDelayed(new C57872Ihp(A003, this), 500);
                    AR4 = r4.AR4();
                    AR4.E5T("has_seen_tap_to_pause_audio_control_nux", true);
                }
                AR4.apply();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (X.0sr.A1P(new X.C295365o2[]{X.C295365o2.MIDCARD, X.C295365o2.MULTI_ADS}).contains(r5.A01) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(boolean r7) {
        /*
            r6 = this;
            r6.A0A = r7
            X.GD9 r0 = r6.A0M
            X.4bN r5 = r0.A02()
            android.widget.ImageView r3 = r6.A04
            if (r3 == 0) goto L_0x0041
            com.instagram.common.session.UserSession r4 = r6.A0G
            boolean r0 = X.1KU.A07(r4)
            if (r0 == 0) goto L_0x0042
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321254227125448(0x8109fd000124c8, double:3.0330456549611915E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0042
            r1 = 0
            if (r5 == 0) goto L_0x003c
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x003c
            X.5o2 r2 = X.C295365o2.MIDCARD
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            X.5o2[] r0 = new X.C295365o2[]{r2, r0}
            java.util.List r2 = X.0sr.A1P(r0)
            X.5o2 r0 = r5.A01
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x003e
        L_0x003c:
            r1 = 8
        L_0x003e:
            r3.setVisibility(r1)
        L_0x0041:
            return
        L_0x0042:
            X.HMf r0 = X.C54648HMf.A04
            int r2 = r0.ordinal()
            r0 = 2
            r1 = 0
            if (r2 == r0) goto L_0x0062
            r0 = 3
            if (r2 == r0) goto L_0x0053
            r0 = 1
            if (r2 == r0) goto L_0x003e
            goto L_0x003c
        L_0x0053:
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x003e
            X.GBE r0 = r6.A0J
            X.GBn r0 = r0.A1K
            boolean r0 = r0.A0W()
            if (r0 != 0) goto L_0x003c
            goto L_0x003e
        L_0x0062:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDB.A0E(boolean):void");
    }

    private final AnonymousClass3JR A01(View.OnClickListener onClickListener, int i, int i2, boolean z) {
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A05 = i;
        A0K2.A04 = i2;
        A0K2.A0G = onClickListener;
        A0K2.A0N = false;
        Context context = this.A0C;
        A0K2.A02 = AnonymousClass7TF.A03(context, R.attr.igds_color_icon_on_media);
        A0K2.A09 = 17;
        if (!z) {
            A0K2.A0O = true;
            A0K2.A0B = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
            A0K2.A07 = 0;
            A0K2.A0E = 0;
            A0K2.A00 = 0;
        }
        return A0K2;
    }

    public final void A09() {
        Object obj;
        Number number;
        int A002 = A00();
        String str = null;
        if (182.A06(0Tu.A06, this.A0G, 36321254227518670L)) {
            ImageView imageView = this.A04;
            if (imageView != null) {
                obj = imageView.getTag();
            } else {
                obj = null;
            }
            if (!(obj instanceof Integer) || (number = (Number) obj) == null || number.intValue() != A002) {
                ImageView imageView2 = this.A04;
                if (imageView2 != null) {
                    imageView2.setTag(Integer.valueOf(A002));
                }
            } else {
                return;
            }
        }
        ImageView imageView3 = this.A04;
        if (imageView3 != null) {
            imageView3.setImageResource(A002);
        }
        ImageView imageView4 = this.A04;
        if (imageView4 != null) {
            Context context = imageView4.getContext();
            if (context != null) {
                int i = 2131963761;
                if (this.A0J.A1K.A0W()) {
                    i = 2131963762;
                }
                str = context.getString(i);
            }
            imageView4.setContentDescription(str);
        }
    }
}
