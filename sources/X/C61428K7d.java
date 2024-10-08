package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* renamed from: X.K7d  reason: case insensitive filesystem */
public final class C61428K7d extends AnonymousClass4DH implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UserPaySupporterListBottomSheetFragment";
    public TextView A00;
    public TextView A01;
    public LFJ A02;
    public C60427JlK A03;
    public C62506Kgw A04 = C62506Kgw.DURING_LIVE;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public RecyclerView A0D;
    public final AnonymousClass0eM A0E = MMF.A00(this, 32);
    public final AnonymousClass0eM A0F = MMF.A00(this, 33);
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        if (!AnonymousClass7TF.A1Z(this.A0E) ? !this.A0A : this.A04 != C62506Kgw.SETTINGS) {
            r5.Etr(false);
            return;
        }
        r5.Eom(2131965433);
        r5.Eu4(true);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K7d, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        int intValue;
        String str2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String str3 = "0";
            String string2 = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_BADGES", str3);
            if (string2 != null) {
                str3 = string2;
            }
            String str4 = null;
            if (A00(this)) {
                TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
                Context A0S = AnonymousClass7TE.A0S(view);
                String A0d2 = DbY.A0d(A0S.getResources(), AnonymousClass7TG.A0A(00y.A0l(str3)), R.plurals.live_user_pay_badges_uppercase);
                0qQ.A07(A0d2);
                A0d.setText(A0d2);
                A0d.setVisibility(0);
                A0d.setGravity(17);
                Integer A0l = 00y.A0l(str3);
                if (!(A0l == null || A0l.intValue() == 0)) {
                    C51967G9n.A0x(view, R.id.sort_selector, 0);
                    TextView A0d3 = AnonymousClass7TE.A0d(view, R.id.sort_by_time);
                    this.A01 = A0d3;
                    str2 = "timeSortButton";
                    if (A0d3 != null) {
                        2eS.A01(A0d3);
                        TextView textView = this.A01;
                        if (textView != null) {
                            LY2.A00(textView, 17, view, this);
                            TextView A0d4 = AnonymousClass7TE.A0d(view, R.id.sort_by_amount);
                            this.A00 = A0d4;
                            str2 = "amountSortButton";
                            if (A0d4 != null) {
                                2eS.A01(A0d4);
                                TextView textView2 = this.A00;
                                if (textView2 != null) {
                                    LY2.A00(textView2, 18, view, this);
                                }
                            }
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                TextView A0d5 = AnonymousClass7TE.A0d(view, R.id.subheader_text);
                A0d5.setVisibility(0);
                DbU.A1G(A0d5, this, 2131953608);
                TextView A0d6 = AnonymousClass7TE.A0d(view, R.id.estimated_earnings);
                A0d6.setVisibility(0);
                DbU.A1G(A0d6, this, 2131976338);
                TextView A0d7 = AnonymousClass7TE.A0d(view, R.id.estimated_earnings_amount);
                A0d7.setVisibility(0);
                A0d7.setText(bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_BADGES_ESTIMATED_EARNINGS", "$0"));
                View findViewById = view.findViewById(R.id.info_button);
                findViewById.setVisibility(0);
                AnonymousClass0fU.A00((View.OnClickListener) null, findViewById);
            } else if (this.A04 == C62506Kgw.STICKER_EDITING) {
                TextView A0d8 = AnonymousClass7TE.A0d(view, R.id.title);
                Long l = this.A06;
                if (l != null) {
                    str4 = 1G0.A01((double) l.longValue());
                }
                String str5 = this.A09;
                if (str5 == null || 00l.A0W(str5)) {
                    string = getString(2131953596);
                } else {
                    string = this.A09;
                }
                if (str4 == null || (str = getString(2131953595, new Object[]{string, str4})) == null) {
                    str = string;
                }
                A0d8.setText(str);
                A0d8.setVisibility(0);
                A0d8.setGravity(8388611);
                Integer num = this.A05;
                if (!(num == null || (intValue = num.intValue()) == 0)) {
                    TextView A0d9 = AnonymousClass7TE.A0d(view, R.id.subheader_text);
                    A0d9.setVisibility(0);
                    A0d9.setText(DbY.A0d(view.getResources(), intValue, R.plurals.user_pay_badges_thanks_sticker_notification_description));
                }
                view.findViewById(R.id.divider).setVisibility(8);
            }
            RecyclerView A0F2 = DbZ.A0F(view, R.id.supporter_list_recycler_view);
            A0F2.setLayoutManager(new FastScrollingLinearLayoutManager(view.getContext()));
            JTQ.A0y(A0F2.A0D, A0F2, new C65319LrI(this, 12), C3251771i.A0A);
            C60427JlK jlK = this.A03;
            if (jlK == null) {
                str2 = "adapter";
            } else {
                A0F2.setAdapter(jlK);
                this.A0D = A0F2;
                if (!A00(this)) {
                    if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0G, 0), 36312415184421993L) && this.A04 != C62506Kgw.STICKER_EDITING) {
                        LFJ lfj = this.A02;
                        if (lfj == null) {
                            str2 = "interactor";
                        } else {
                            lfj.A00().A06(this, new C64315LZp(4, view, this));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final boolean A00(C61428K7d k7d) {
        if (AnonymousClass7TF.A1Z(k7d.A0E)) {
            if (k7d.A04 == C62506Kgw.DURING_LIVE) {
                return true;
            }
            return false;
        } else if (k7d.A0B || k7d.A0A) {
            return false;
        } else {
            return true;
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
        return DbS.A0T(this.A0G);
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
        RecyclerView recyclerView = this.A0D;
        if (recyclerView != null) {
            return !JTP.A1Y(recyclerView);
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.A0C = true;
            C59689JTv.A07(requireContext(), 2131953606);
            View view = this.mView;
            if (view != null) {
                AnonymousClass7TH.A0R(view.findViewById(R.id.supporter_list_action_button));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.K7d] */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        Integer num;
        String str3;
        Long l;
        boolean z;
        boolean z2;
        C62506Kgw kgw;
        int A022 = AnonymousClass0fD.A02(-973380144);
        C61428K7d.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Object obj = null;
        if (bundle2 != null) {
            str = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_ID");
        } else {
            str = null;
        }
        0qQ.A0A(str);
        this.A08 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_INSIGHTS_ID");
        } else {
            str2 = null;
        }
        this.A07 = str2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            num = DbV.A0o(bundle4, "UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_SUPPORTERS");
        } else {
            num = null;
        }
        this.A05 = num;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_TITLE");
        } else {
            str3 = null;
        }
        this.A09 = str3;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            l = Long.valueOf(bundle6.getLong("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_DATETIME"));
        } else {
            l = null;
        }
        this.A06 = l;
        AnonymousClass0eM r5 = this.A0E;
        boolean A1Z = AnonymousClass7TF.A1Z(r5);
        boolean z3 = false;
        Bundle bundle7 = this.mArguments;
        if (A1Z) {
            if (bundle7 != null) {
                obj = bundle7.get("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_ENTRY_POINT");
            }
            if (!(obj instanceof C62506Kgw) || (kgw = (C62506Kgw) obj) == null) {
                kgw = C62506Kgw.DURING_LIVE;
            }
            this.A04 = kgw;
        } else {
            if (bundle7 != null) {
                z = bundle7.getBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_FROM_SETTINGS");
            } else {
                z = false;
            }
            this.A0A = z;
            Bundle bundle8 = this.mArguments;
            if (bundle8 != null) {
                z2 = bundle8.getBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_POST_LIVE");
            } else {
                z2 = false;
            }
            this.A0B = z2;
        }
        if (!AnonymousClass7TF.A1Z(r5)) {
            z3 = this.A0A;
        } else if (this.A04 == C62506Kgw.SETTINGS) {
            z3 = true;
        }
        this.A03 = new C60427JlK(this, this, A00(this), z3);
        LFJ lfj = new LFJ(new C63689L2z(new C63688L2y(AnonymousClass7TE.A0l(this.A0G))));
        this.A02 = lfj;
        String str4 = this.A08;
        if (str4 != null) {
            lfj.A01(str4, true, this.A07);
            LFJ lfj2 = this.A02;
            if (lfj2 != null) {
                lfj2.A00().A06(this, new C64317LZr(this, 25));
                if (A00(this)) {
                    LFJ lfj3 = this.A02;
                    if (lfj3 != null) {
                        lfj3.A00 = "time";
                        String str5 = this.A08;
                        if (str5 != null) {
                            lfj3.A01(str5, true, this.A07);
                            LFJ lfj4 = this.A02;
                            if (lfj4 != null) {
                                lfj4.A00().A06(this, new C64317LZr(this, 26));
                            }
                        }
                    }
                }
                AnonymousClass0fD.A09(1766412958, A022);
                return;
            }
            0qQ.A0F("interactor");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("mediaId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1438316491);
        0qQ.A0B(layoutInflater, 0);
        C61428K7d.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_supporter_list_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-2041749289, A022);
        return inflate;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }
}
