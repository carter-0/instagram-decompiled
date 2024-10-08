package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NK7 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "CollectionItemEmojiReactionsListFragment";
    public AnonymousClass2t9 A00;
    public C74459PvE A01;
    public C60227Jhk A02;
    public String A03;
    public String A04;
    public String A05;
    public RecyclerView A06;
    public String A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final AnonymousClass9HB A09 = new AnonymousClass9HB();

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "collection_item_reaction_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C74459PvE pvE;
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.header_text);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.emoji_reaction_list_header);
            if (findViewById2 != null) {
                if (requireArguments().getBoolean(AnonymousClass000.A00(60))) {
                    DbU.A1G(textView, this, 2131959226);
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById2.setVisibility(i);
                AnonymousClass2tC A0S = DbV.A0S(this);
                A0S.A01(new NOM(this, new O87(this)));
                this.A00 = DbU.A0U(A0S, new Object());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
                RecyclerView A0K = DbX.A0K(view);
                this.A06 = A0K;
                String str2 = "recyclerView";
                if (A0K != null) {
                    A0K.setLayoutManager(linearLayoutManager);
                    RecyclerView recyclerView = this.A06;
                    if (recyclerView != null) {
                        AnonymousClass2t9 r0 = this.A00;
                        if (r0 == null) {
                            str2 = "igRecyclerViewAdapter";
                        } else {
                            recyclerView.setAdapter(r0);
                            C60227Jhk jhk = this.A02;
                            if (jhk == null) {
                                0qQ.A0F("emojiReactionsListViewModel");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            Dba.A15(getViewLifecycleOwner(), jhk.A00, C74178PqK.A00(this, 44), 51);
                            if (this.A03 == null && (pvE = this.A01) != null) {
                                str = "collectionItemId is null";
                            } else if (this.A04 != null || (pvE = this.A01) == null) {
                                RecyclerView recyclerView2 = this.A06;
                                if (recyclerView2 != null) {
                                    C72693PFx pFx = new C72693PFx(this, 7);
                                    C3251771i r1 = C3251771i.A0A;
                                    C252553pI r02 = recyclerView2.A0D;
                                    if (r02 != null) {
                                        JTQ.A0y(r02, recyclerView2, pFx, r1);
                                        C60227Jhk jhk2 = this.A02;
                                        if (jhk2 == null) {
                                            str2 = "emojiReactionsListViewModel";
                                        } else {
                                            jhk2.A00(true);
                                            return;
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            } else {
                                str = "collectionType is null";
                            }
                            pvE.onError(str);
                            return;
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
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
        return DbS.A0T(this.A08);
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
        RecyclerView recyclerView = this.A06;
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

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07g, androidx.fragment.app.Fragment, X.NK7] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(187626278);
        NK7.super.onCreate(bundle);
        this.A03 = C320236s2.A01(requireArguments(), "direct_emoji_collection_item_id");
        this.A04 = C320236s2.A01(requireArguments(), "direct_emoji_collection_type");
        this.A05 = requireArguments().getString("direct_emoji_thread_id");
        this.A07 = requireArguments().getString("direct_emoji_message_id");
        UserSession A0l = AnonymousClass7TE.A0l(this.A08);
        String str = this.A03;
        if (str != null) {
            String str2 = this.A04;
            if (str2 != null) {
                String str3 = this.A05;
                if (str3 != null) {
                    this.A02 = new 2YN(new KEH(A0l, str, str2, str3, this.A07), this).A00(KRH.class);
                    AnonymousClass0fD.A09(-2016841405, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1822601791;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 1050013002;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 89776490;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2146654702);
        0qQ.A0B(layoutInflater, 0);
        int i = requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID");
        if (i != 0) {
            layoutInflater = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), i));
        }
        this.A09.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_emoji_reactions_list, viewGroup, false);
        AnonymousClass0fD.A09(1216075399, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1205118008);
        this.A09.A01();
        super.onDestroyView();
        AnonymousClass0fD.A09(-137584432, A022);
    }
}
