package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.Map;

public final class E65 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectSuggestedRecipientsFragment";
    public E5H A00;
    public Map A01;
    public Context A02;
    public RecyclerView A03;
    public F15 A04;
    public IgdsInlineSearchBox A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.E65, X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A02 = requireContext;
        UserSession A0l = AnonymousClass7TE.A0l(this.A06);
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            C228602lw r6 = new C228602lw(requireContext(), AnonymousClass07i.A00(this), (Integer) null);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A05;
            if (igdsInlineSearchBox == null) {
                str = "inlineSearchBox";
            } else {
                E5H e5h = this.A00;
                if (e5h == null) {
                    str = "recipientSelectedListener";
                } else {
                    Map map = this.A01;
                    if (map == null) {
                        str = "selectedTargetsIds";
                    } else {
                        this.A04 = new F15(requireContext, recyclerView, this, r6, A0l, e5h, igdsInlineSearchBox, map);
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
        return DbS.A0T(this.A06);
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
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
        int A022 = AnonymousClass0fD.A02(652605707);
        E65.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1319991851, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1069823937);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_suggested_recipients_list, false);
        this.A03 = DbT.A0I(A0D, R.id.suggested_recipients_list);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0D.requireViewById(R.id.suggested_recipients_inline_search_bar);
        this.A05 = igdsInlineSearchBox;
        if (igdsInlineSearchBox == null) {
            0qQ.A0F("inlineSearchBox");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsInlineSearchBox.setImeOptions(6);
        AnonymousClass0fD.A09(1787702950, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1614311635);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1581431376, A022);
    }
}
