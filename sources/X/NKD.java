package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;

public final class NKD extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectCustomEmojiReactionsListFragment";
    public int A00;
    public long A01;
    public AnonymousClass2t9 A02;
    public C70458O7j A03;
    public C60232Jhp A04;
    public 2FW A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public int A0A = 1;
    public RecyclerView A0B;
    public DirectCustomReactionTabModel.TabType A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final String A0E = "direct_custom_emoji_reactions_list_fragment";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass2tC A0S = DbV.A0S(this);
        C72637PDq pDq = new C72637PDq(this);
        UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
        DirectCustomReactionTabModel.TabType tabType = this.A0C;
        if (tabType == null) {
            str = "tabType";
        } else {
            A0S.A01(new C68589NOl(this, A0l, (C70690OGl) null, pDq, AnonymousClass7TF.A1W(tabType, DirectCustomReactionTabModel.TabType.CUSTOM_EMOJI_TAB)));
            this.A02 = DbU.A0U(A0S, new Object());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
            RecyclerView A0K = DbX.A0K(view);
            this.A0B = A0K;
            str = "recyclerView";
            if (A0K != null) {
                A0K.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView = this.A0B;
                if (recyclerView != null) {
                    AnonymousClass2t9 r0 = this.A02;
                    if (r0 == null) {
                        str = "igRecyclerViewAdapter";
                    } else {
                        recyclerView.setAdapter(r0);
                        RecyclerView recyclerView2 = this.A0B;
                        if (recyclerView2 != null) {
                            C72693PFx pFx = new C72693PFx(this, 9);
                            C3251771i r1 = C3251771i.A0A;
                            C252553pI r02 = recyclerView2.A0D;
                            if (r02 != null) {
                                JTQ.A0y(r02, recyclerView2, pFx, r1);
                                DbV.A0J(this).A00(new MFW(this, A00(this), (AnonymousClass4D7) null, 33));
                                C60232Jhp jhp = this.A04;
                                if (jhp == null) {
                                    str = "emojiReactionsListViewModel";
                                } else {
                                    String str2 = this.A09;
                                    if (str2 != null) {
                                        String str3 = this.A08;
                                        if (str3 != null) {
                                            jhp.A00(str2, str3, this.A06, A00(this), this.A00, true);
                                            return;
                                        }
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final String A00(NKD nkd) {
        DirectCustomReactionTabModel.TabType tabType = nkd.A0C;
        if (tabType == null) {
            0qQ.A0F("tabType");
            throw AnonymousClass00P.createAndThrow();
        } else if (tabType == DirectCustomReactionTabModel.TabType.ALL_TAB) {
            return "all_tab";
        } else {
            String str = nkd.A06;
            if (str != null) {
                return str;
            }
            throw AnonymousClass7TE.A0y();
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

    public final String getModuleName() {
        return this.A0E;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
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
        RecyclerView recyclerView = this.A0B;
        if (recyclerView != null) {
            return C2808154f.A05(recyclerView);
        }
        C66580MXl.A19();
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

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(953672792);
        NKD.super.onCreate(bundle);
        this.A09 = requireArguments().getString("direct_emoji_thread_id");
        this.A08 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID");
        this.A06 = requireArguments().getString("DirectFragment.DIRECT_TABBED_REACTION_EMOJI");
        this.A0A = requireArguments().getInt("OFFSCREEN_PAGE_LIMIT");
        this.A00 = requireArguments().getInt("TAB_POSITION");
        DirectCustomReactionTabModel.TabType tabType = (DirectCustomReactionTabModel.TabType) requireArguments().getParcelable("DirectFragment.DIRECT_CUSTOM_REACTION_TAB_TYPE");
        if (tabType == null) {
            tabType = DirectCustomReactionTabModel.TabType.ALL_TAB;
        }
        this.A0C = tabType;
        this.A07 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT");
        this.A05 = 2FW.values()[requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CONTENT_TYPE_ORDINAL")];
        this.A01 = requireArguments().getLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS");
        this.A04 = new 2YN(new KDR(AnonymousClass7TE.A0l(this.A0D), this.A07, this.A0A), requireParentFragment()).A00(C60232Jhp.class);
        AnonymousClass0fD.A09(-885329910, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1746585205);
        View inflate = C66583MXo.A09(layoutInflater, this).inflate(R.layout.fragment_custom_emoji_reactions_list, viewGroup, false);
        AnonymousClass0fD.A09(796924018, A022);
        return inflate;
    }

    public final void onResume() {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(579328772);
        super.onResume();
        C60232Jhp jhp = this.A04;
        if (jhp == null) {
            0qQ.A0F("emojiReactionsListViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = this.A09;
        if (str != null) {
            String str2 = this.A08;
            if (str2 != null) {
                jhp.A00(str, str2, this.A06, A00(this), this.A00, true);
                AnonymousClass0fD.A09(612512304, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 733850523;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 275578783;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
