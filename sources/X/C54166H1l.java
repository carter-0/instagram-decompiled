package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.wellbeing.limitsplus.viewmodel.LimitsPlusViewModel$savePreviouslyFetchedData$1;
import java.util.HashMap;

/* renamed from: X.H1l  reason: case insensitive filesystem */
public final class C54166H1l extends AnonymousClass4DH implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LimitsPlusMainFragment";
    public long A00;
    public View A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C58175Inf(this, 4));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58175Inf(this, 5));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C58175Inf(this, 6));
    public final AnonymousClass0eM A06;

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        int i = 2131965012;
        if (AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(this.A04), 36326292223702702L).booleanValue()) {
            i = 2131964962;
        }
        DbW.A1C(r5, getString(i));
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "limitsplus_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        View view2 = view;
        0qQ.A0B(view, 0);
        0wc A022 = AnonymousClass0kN.A02(DbT.A0X(this.A04));
        String A0l = DbW.A0l(this.A05);
        boolean A1Z = AnonymousClass7TF.A1Z(this.A02);
        String A0l2 = DbW.A0l(this.A03);
        HashMap A1E = AnonymousClass7TE.A1E();
        C51975G9x.A1K(A1E);
        if (A1Z) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (1 - num.intValue() != 0) {
            str = "v2_customizable";
        } else {
            str = "v2_not_customizable";
        }
        A1E.put("version", str);
        0Aj A0e = AnonymousClass7TE.A0e(A022, "instagram_wellbeing_limited_interactions_impression");
        G9w.A1C(A0e, A0l);
        A0e.AAJ("entrypoint", A0l2);
        C51969G9p.A1F(A0e, "surface", "main_setting", A1E);
        A0e.Cgf();
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.limits_plus_main_fragment_headline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_limits_refresh);
        igdsHeadline.setHeadline(2131965028);
        igdsHeadline.setBody(2131964998);
        A00(view, this);
        07U r10 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(view2, viewLifecycleOwner, r10, this, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
        View findViewById = view.findViewById(R.id.limits_plus_main_fragment_scrollview);
        this.A01 = findViewById;
        View findViewById2 = view.findViewById(R.id.limits_plus_bottom_button_layout);
        findViewById2.addOnLayoutChangeListener(new C71414OkD(5, findViewById, findViewById2));
    }

    public static final void A00(View view, C54166H1l h1l) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        I0A i0a = (I0A) ((C60145JgQ) h1l.A06.getValue()).A00.getValue();
        if (i0a != null) {
            C266444Yx r0 = i0a.A03;
            String str7 = null;
            if (r0 != null) {
                str = Dba.A0Y(h1l, r0);
            } else {
                str = null;
            }
            C266444Yx r02 = i0a.A06;
            if (r02 != null) {
                str2 = Dba.A0Y(h1l, r02);
            } else {
                str2 = null;
            }
            C266444Yx r03 = i0a.A05;
            if (r03 != null) {
                str3 = Dba.A0Y(h1l, r03);
            } else {
                str3 = null;
            }
            C266444Yx r04 = i0a.A00;
            if (r04 != null) {
                str4 = Dba.A0Y(h1l, r04);
            } else {
                str4 = null;
            }
            C266444Yx r05 = i0a.A01;
            if (r05 != null) {
                str5 = Dba.A0Y(h1l, r05);
            } else {
                str5 = null;
            }
            C266444Yx r06 = i0a.A02;
            if (r06 != null) {
                str6 = Dba.A0Y(h1l, r06);
            } else {
                str6 = null;
            }
            C266444Yx r07 = i0a.A04;
            if (r07 != null) {
                str7 = Dba.A0Y(h1l, r07);
            }
            boolean z = i0a.A07;
            boolean z2 = i0a.A09;
            IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.limits_plus_main_fragment_headline);
            igdsHeadline.setHeadline((CharSequence) str2);
            igdsHeadline.setBody((CharSequence) str3);
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.limits_plus_bottom_button_layout);
            igdsBottomButtonLayout.setPrimaryAction(str4, ID1.A00(h1l, 47));
            igdsBottomButtonLayout.setFooterText(str5);
            if (z) {
                IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_what_row);
                igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
                igdsListCell.A05(R.drawable.instagram_comment_pano_outline_24);
                Dba.A14(h1l, igdsListCell, 2131965038);
                if (str7 != null) {
                    igdsListCell.A0H(str7);
                }
                ID1.A01(igdsListCell, 48, h1l);
                2eS.A01(igdsListCell);
            }
            IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_who_row);
            if (!z2) {
                igdsListCell2.A04();
            }
            C69349Njo njo = C69349Njo.TYPE_CHEVRON;
            igdsListCell2.setTextCellType(njo);
            igdsListCell2.A05(R.drawable.instagram_user_pano_outline_24);
            Dba.A14(h1l, igdsListCell2, 2131965053);
            if (str6 != null) {
                igdsListCell2.A0H(str6);
            }
            if (z2) {
                igdsListCell2.A0F(C62512Kh2.WARNING);
            }
            igdsListCell2.A0C(new IB1(3, h1l, z));
            2eS.A01(igdsListCell2);
            IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_when_row);
            igdsListCell3.setTextCellType(njo);
            igdsListCell3.A05(R.drawable.instagram_timer_pano_outline_24);
            Dba.A14(h1l, igdsListCell3, 2131965042);
            if (str != null) {
                igdsListCell3.A0H(str);
            }
            AnonymousClass0fU.A00(new IB1(4, h1l, z), igdsListCell3);
            2eS.A01(igdsListCell3);
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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
        View view = this.A01;
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C54166H1l() {
        C58175Inf inf = new C58175Inf(this, 10);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58175Inf(new C58175Inf(this, 7), 8));
        this.A06 = DbS.A0I(new C58175Inf(A002, 9), inf, new MJ6(23, (Object) null, A002), DbS.A0z(C60145JgQ.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        C318136oS A002;
        0sL mg2;
        int A022 = AnonymousClass0fD.A02(-1520707617);
        C54166H1l.super.onCreate(bundle);
        boolean z = requireArguments().getBoolean("saved_state");
        AnonymousClass0eM r3 = this.A06;
        if (z) {
            C60145JgQ jgQ = (C60145JgQ) r3.getValue();
            boolean z2 = requireArguments().getBoolean("is_enabled");
            boolean z3 = requireArguments().getBoolean("non_followers");
            boolean z4 = requireArguments().getBoolean("new_followers");
            boolean z5 = requireArguments().getBoolean("non_close_friends");
            long j = requireArguments().getLong("reminder_date");
            long j2 = requireArguments().getLong("start_date");
            boolean z6 = requireArguments().getBoolean("some_interactions");
            boolean z7 = requireArguments().getBoolean("most_interactions");
            boolean z8 = requireArguments().getBoolean("feature_customization_enabled");
            A002 = C318116oQ.A00(jgQ);
            mg2 = new LimitsPlusViewModel$savePreviouslyFetchedData$1(jgQ, (AnonymousClass4D7) null, j, j2, z2, z3, z4, z5, z6, z7, z8);
        } else {
            2YL A0H = DbS.A0H(r3);
            A002 = C318116oQ.A00(A0H);
            mg2 = new MG2(A0H, (AnonymousClass4D7) null, 45);
        }
        19B r7 = 19B.A00;
        1Eo.A05(r7, mg2, A002);
        2YL A0H2 = DbS.A0H(r3);
        String A0l = DbW.A0l(this.A05);
        1Eo.A05(r7, new C66187MGy(A0H2, A0l, (AnonymousClass4D7) null, 36), C318116oQ.A00(A0H2));
        AnonymousClass0fD.A09(-1983597902, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(178959092);
        0qQ.A0B(layoutInflater, 0);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.limits_plus_main_fragment_layout, false);
        AnonymousClass0fD.A09(-2033540216, A022);
        return A0A;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1534274994);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(-265042184, A022);
    }
}
