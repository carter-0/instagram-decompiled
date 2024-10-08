package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.Collections;
import java.util.List;

public final class E61 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ClipsPreloadedSettingsBottomSheetFragment";
    public C39779A8y A00;
    public C46842DmI A01;
    public List A02;
    public RecyclerView A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "clips_preloading_audio_effect_bottom_sheet_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        List list = this.A02;
        if (list == null) {
            str = "preloadedSettingItems";
        } else {
            this.A01 = new C46842DmI(requireContext, this, list);
            RecyclerView A0K = DbX.A0K(view);
            this.A03 = A0K;
            str = "recyclerView";
            if (A0K != null) {
                DbU.A15(requireContext(), A0K, 1, false);
                RecyclerView recyclerView = this.A03;
                if (recyclerView != null) {
                    C46842DmI dmI = this.A01;
                    if (dmI == null) {
                        str = "adapter";
                    } else {
                        recyclerView.setAdapter(dmI);
                        C3021461u r3 = (C3021461u) view.requireViewById(R.id.bottom_bottom_layout);
                        if (r3 != null) {
                            Context context = view.getContext();
                            r3.setPrimaryAction(context.getString(2131955592), FP5.A00(this, 56));
                            r3.setSecondaryAction(context.getString(2131955593), FP5.A00(this, 57));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
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
        return false;
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
        List emptyList;
        int A022 = AnonymousClass0fD.A02(1328139266);
        E61.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (emptyList = bundle2.getParcelableArrayList(AnonymousClass000.A00(2085))) == null) {
            emptyList = Collections.emptyList();
            0qQ.A07(emptyList);
        }
        this.A02 = emptyList;
        AnonymousClass0fD.A09(1817739171, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1919972204);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_preloaded_settings_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(2009215065, A022);
        return inflate;
    }
}
