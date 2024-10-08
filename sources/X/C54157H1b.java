package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.instagram.android.R;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.H1b  reason: case insensitive filesystem */
public final class C54157H1b extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ContentNoteOverflowFragment";
    public GridView A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.H1b, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle requireArguments = requireArguments();
        ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState = (ContentNotesOverflowFragmentUiState) 2Yc.A01(requireArguments, ContentNotesOverflowFragmentUiState.class, "notes");
        if (contentNotesOverflowFragmentUiState == null) {
            DbT.A1Q(0wj.A01, "android_null_view_model_in_overflow", 817892647);
            return;
        }
        String string = requireArguments.getString("carousel_child_id");
        String A002 = AnonymousClass000.A00(69);
        if (requireArguments.containsKey(A002)) {
            num = DbV.A0o(requireArguments, A002);
        } else {
            num = null;
        }
        C57127IPq iPq = new C57127IPq(string, num);
        GridView gridView = (GridView) view2.findViewById(R.id.note_grid);
        this.A00 = gridView;
        int floor = (int) ((float) Math.floor((double) (0nA.A01(requireContext(), (float) AnonymousClass0nB.A01(requireContext())) / 120.0f)));
        if (floor <= 0) {
            floor = 1;
        }
        gridView.setNumColumns(floor);
        AnonymousClass0eM r5 = this.A02;
        C52865Gdy gdy = new C52865Gdy(requireContext(), AnonymousClass7TE.A0l(r5), iPq, (C52976GgT) this.A01.getValue(), contentNotesOverflowFragmentUiState, new AnonymousClass33A(requireActivity(), this, AnonymousClass7TE.A0l(r5)), C227942kP.A01(DbT.A10(C54900HXi.class), false, false));
        AnonymousClass7TE.A1Z(new C66188MGz((Object) gdy, (Object) this, (AnonymousClass4D7) null, 43), DbW.A0E(this));
        gridView.setAdapter(gdy);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = (NotesPogThoughtBubbleUiState) 00k.A0J(contentNotesOverflowFragmentUiState.A01);
        if (notesPogThoughtBubbleUiState != null) {
            0lg A0X = DbT.A0X(r5);
            String str = notesPogThoughtBubbleUiState.A0C;
            String str2 = notesPogThoughtBubbleUiState.A0D;
            String str3 = notesPogThoughtBubbleUiState.A0I;
            String str4 = contentNotesOverflowFragmentUiState.A00;
            String str5 = iPq.A01;
            Integer num2 = iPq.A00;
            0qQ.A0B(A0X, 0);
            C51972G9s.A1B(str, str4);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0X), "instagram_media_note_overflow_sheet_impression_client");
            if (A0e.isSampled()) {
                C51965G9l.A1J(A0e, str4);
                C51971G9r.A1A(A0e, str, str2);
                C51965G9l.A1G(A0e, DbZ.A0c(num2));
                C51973G9u.A14(A0e, "carousel_media_id", str5);
                C51969G9p.A1D(A0e, str3);
            }
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
        return DbT.A10(C54900HXi.class);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
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
        GridView gridView = this.A00;
        if (gridView == null || gridView.getFirstVisiblePosition() == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C54157H1b() {
        C58337IqI iqI = C58337IqI.A00;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MJ0(new MJ0(this, 12), 13));
        this.A01 = DbS.A0I(new MJ0(A002, 14), iqI, new GNG(42, (Object) null, A002), DbS.A0z(C52976GgT.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1078859225);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_overflow_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-597967388, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(438008877);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1185508331, A022);
    }
}
