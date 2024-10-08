package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.CustomFadingEdgeListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class K6T extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf, C66441MRv, C268604dg {
    public static final String __redex_internal_original_name = "EmojiPickerSheetFragment";
    public C63701L3l A00;
    public MS1 A01;
    public C314276hw A02;
    public LYO A03;
    public LZE A04;
    public int A05 = 6;
    public View A06;
    public ViewGroup A07;
    public ListView A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final C64953Lks A0A = new C64953Lks(this);
    public final Integer A0B = AnonymousClass05K.A0N;

    public final void DMu(int i) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "emoji_picker_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C314276hw r0 = this.A02;
        if (r0 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C40291AZg aZg : r0.A08()) {
                C317486nL r2 = aZg.A04;
                if (r2 != null && aZg.A02 == C317476nK.EMOJI) {
                    A1C.add(r2);
                }
            }
            if (DbT.A1b(A1C)) {
                C63701L3l l3l = this.A00;
                if (l3l == null) {
                    0qQ.A0F("emojiSheetHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
                K9D k9d = l3l.A01;
                List A0X = 00k.A0X(A1C);
                List list = k9d.A01;
                list.clear();
                list.addAll(A0X);
                K9D.A00(k9d);
            }
        }
    }

    public final Integer Aci() {
        return this.A0B;
    }

    public final void DMt() {
        LYO lyo = this.A03;
        if (lyo == null) {
            0qQ.A0F("emojiSearchBarController");
            throw AnonymousClass00P.createAndThrow();
        } else if (lyo.A00 && lyo.A01.getSearchString().length() == 0) {
            lyo.A00();
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
        return DbS.A0T(this.A09);
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

    public final boolean onBackPressed() {
        LYO lyo = this.A03;
        if (lyo == null) {
            0qQ.A0F("emojiSearchBarController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!lyo.A00) {
            return false;
        } else {
            lyo.A00();
            return true;
        }
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

    public final boolean isScrolledToTop() {
        AdapterView adapterView;
        if (!isAdded()) {
            return true;
        }
        C63701L3l l3l = this.A00;
        String str = "emojiSheetHolder";
        if (l3l != null) {
            if (l3l.A00.getVisibility() == 0) {
                C63701L3l l3l2 = this.A00;
                if (l3l2 != null) {
                    adapterView = l3l2.A00;
                }
            } else {
                adapterView = this.A08;
                if (adapterView == null) {
                    str = "searchResultsListView";
                }
            }
            Field field = W11.A00;
            if (adapterView.getChildCount() == 0) {
                return true;
            }
            if (adapterView.getFirstVisiblePosition() != 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop()) {
                return false;
            }
            return true;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(639039348);
        K6T.super.onCreate(bundle);
        if (this.mArguments != null) {
            AnonymousClass0fD.A09(1713771041, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-102463956, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-423699357);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.layout_emoji_picker, viewGroup, false);
        this.A06 = inflate;
        if (inflate != null) {
            this.A07 = DbU.A0C(inflate, R.id.asset_items_container);
            View view = this.A06;
            if (view != null) {
                this.A08 = (ListView) view.requireViewById(R.id.assets_search_results_list);
                View view2 = this.A06;
                if (view2 != null) {
                    this.A03 = new LYO(view2, this);
                    AnonymousClass0eM r1 = this.A09;
                    UserSession A0l = AnonymousClass7TE.A0l(r1);
                    View view3 = this.A06;
                    if (view3 != null) {
                        C64953Lks lks = this.A0A;
                        this.A04 = new LZE(view3, this, A0l, this, lks, this);
                        View view4 = this.A06;
                        if (view4 != null) {
                            Context A0S = AnonymousClass7TE.A0S(view4);
                            UserSession A0l2 = AnonymousClass7TE.A0l(r1);
                            ViewGroup viewGroup2 = this.A07;
                            String str = "assetItemsContainer";
                            if (viewGroup2 != null) {
                                int i = this.A05;
                                C51972G9s.A1B(A0l2, lks);
                                View inflate2 = LayoutInflater.from(A0S).inflate(R.layout.layout_fading_edge_listview, viewGroup2, false);
                                0qQ.A0C(inflate2, "null cannot be cast to non-null type com.instagram.ui.listview.CustomFadingEdgeListView");
                                inflate2.setTag(new C63701L3l(A0S, viewGroup2, this, A0l2, (CustomFadingEdgeListView) inflate2, lks, i, JTR.A04(A0S)));
                                Object tag = inflate2.getTag();
                                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.EmojiSheetWithRecentViewBinder.Holder");
                                C63701L3l l3l = (C63701L3l) tag;
                                this.A00 = l3l;
                                ViewGroup viewGroup3 = this.A07;
                                if (viewGroup3 != null) {
                                    if (l3l == null) {
                                        str = "emojiSheetHolder";
                                    } else {
                                        viewGroup3.addView(l3l.A00);
                                        View view5 = this.A06;
                                        if (view5 != null) {
                                            AnonymousClass0fD.A09(-892841606, A022);
                                            return view5;
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
            }
        }
        0qQ.A0F("container");
        throw AnonymousClass00P.createAndThrow();
    }
}
