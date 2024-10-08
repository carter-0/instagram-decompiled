package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.H1g  reason: case insensitive filesystem */
public final class C54162H1g extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ContentNotesImmersiveSelfNoteFragment";
    public RecyclerView A00;
    public PIF A01;
    public C238143As A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final AnonymousClass0iw A0A;
    public final IR3 A0B;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.909, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final void configureElementAboveTitle(C252063oV r60) {
        C252063oV r1 = r60;
        0qQ.A0B(r1, 0);
        if (isAdded()) {
            ViewGroup viewGroup = (ViewGroup) r1.getView();
            LithoView lithoView = new LithoView(viewGroup.getContext());
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            marginLayoutParams.A00 = 1;
            viewGroup.setLayoutParams(marginLayoutParams);
            C51968G9o.A1D(lithoView, -2);
            lithoView.setId(R.id.self_content_notes_bottomsheet_above_title);
            viewGroup.addView(lithoView);
            AnonymousClass0eM r58 = this.A03;
            ContentNotesImmersiveSelfNoteContent contentNotesImmersiveSelfNoteContent = (ContentNotesImmersiveSelfNoteContent) r58.getValue();
            AnonymousClass0eM r57 = this.A09;
            UserSession A0l = AnonymousClass7TE.A0l(r57);
            0qQ.A0B(contentNotesImmersiveSelfNoteContent, 0);
            0qQ.A0B(A0l, 1);
            NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = contentNotesImmersiveSelfNoteContent.A01;
            String str = notesPogThoughtBubbleUiState.A0F;
            NoteTextContent noteTextContent = notesPogThoughtBubbleUiState.A05;
            ImageUrl imageUrl = notesPogThoughtBubbleUiState.A03;
            boolean z = notesPogThoughtBubbleUiState.A0N;
            String str2 = notesPogThoughtBubbleUiState.A0J;
            String str3 = notesPogThoughtBubbleUiState.A0H;
            Integer num = notesPogThoughtBubbleUiState.A07;
            User user = notesPogThoughtBubbleUiState.A06;
            boolean z2 = notesPogThoughtBubbleUiState.A0P;
            Long l = notesPogThoughtBubbleUiState.A0B;
            int i = notesPogThoughtBubbleUiState.A00;
            String str4 = notesPogThoughtBubbleUiState.A0C;
            Integer num2 = AnonymousClass05K.A0N;
            String str5 = notesPogThoughtBubbleUiState.A0D;
            String str6 = notesPogThoughtBubbleUiState.A0I;
            List list = notesPogThoughtBubbleUiState.A0L;
            List list2 = notesPogThoughtBubbleUiState.A0K;
            boolean z3 = notesPogThoughtBubbleUiState.A0S;
            Integer num3 = notesPogThoughtBubbleUiState.A08;
            boolean z4 = notesPogThoughtBubbleUiState.A0Q;
            String str7 = notesPogThoughtBubbleUiState.A0E;
            ImageUrl imageUrl2 = notesPogThoughtBubbleUiState.A04;
            int i2 = notesPogThoughtBubbleUiState.A01;
            boolean z5 = notesPogThoughtBubbleUiState.A0R;
            Integer num4 = notesPogThoughtBubbleUiState.A09;
            C249223jK r0 = C249223jK.A00;
            boolean A092 = r0.A09(A0l);
            boolean A082 = r0.A08(A0l);
            boolean z6 = notesPogThoughtBubbleUiState.A0V;
            0Tu r9 = 0Tu.A05;
            boolean A062 = 182.A06(r9, A0l, 36326713131284420L);
            boolean A063 = 182.A06(r9, A0l, 36326713131153346L);
            boolean A052 = C249223jK.A05(A0l);
            NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = new NotesPogThoughtBubbleUiState(notesPogThoughtBubbleUiState.A02, imageUrl, imageUrl2, noteTextContent, user, num, num2, num3, num4, l, str, str2, str3, str4, str5, str6, str7, (String) null, list, list2, i, i2, z, z2, false, z3, z4, z5, true, false, A092, A082, z6, A062, A063, A052);
            UserSession A0l2 = AnonymousClass7TE.A0l(r57);
            AnonymousClass2kQ A012 = C227942kP.A01(__redex_internal_original_name, ((ContentNotesImmersiveSelfNoteContent) r58.getValue()).A02, ((ContentNotesImmersiveSelfNoteContent) r58.getValue()).A03);
            AnonymousClass0iw r11 = this.A0A;
            C57127IPq iPq = new C57127IPq(((ContentNotesImmersiveSelfNoteContent) r58.getValue()).A00.A05, ((ContentNotesImmersiveSelfNoteContent) r58.getValue()).A00.A02);
            long doubleToRawLongBits = Double.doubleToRawLongBits(136.0d);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(190.0d);
            Resources A053 = DbV.A05(this);
            0qQ.A07(A053);
            String A002 = C69982NvM.A00(A053, new NoteAudienceItem(AnonymousClass916.A00(G9w.A0W(r58).A07), (String) null, (List) null, 0));
            int length = A002.length();
            String A0e = AnonymousClass7TF.A0e(A053, A002, 2131954072);
            0qQ.A07(A0e);
            SpannableStringBuilder A0C = DbS.A0C(A0e);
            StyleSpan styleSpan = new StyleSpan(1);
            int length2 = A0e.length();
            A0C.setSpan(styleSpan, length2 - length, length2, 18);
            lithoView.setComponentAsync(new C53849GvG(A0C, r11, A0l2, iPq, notesPogThoughtBubbleUiState2, (C57131IPu) this.A06.getValue(), (C52977GgU) this.A08.getValue(), A012, doubleToRawLongBits, doubleToRawLongBits2));
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean isElementAboveTitleEnabled() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C238143As r2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A04;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MH4 mh4 = new MH4(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 37);
        19B r0 = 19B.A00;
        1Eo.A05(r0, mh4, A002);
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r0, new MH4(r4, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00(viewLifecycleOwner2));
        07U r42 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
        1Eo.A05(r0, new MH4(r42, this, viewLifecycleOwner3, (AnonymousClass4D7) null, 39), AnonymousClass07a.A00(viewLifecycleOwner3));
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            r2 = null;
        } else {
            C238133Ar A003 = C238103Ao.A00(recyclerView);
            0qQ.A0C(A003, C66579MXk.A00(371));
            r2 = (C238143As) A003;
            r2.ErF(new C57718IfL(this));
            r2.ENw(this.A01);
        }
        this.A02 = r2;
        view.setBackground(C51965G9l.A0D(AnonymousClass7TF.A03(getThemedContext(), R.attr.igds_color_elevated_background)));
        View A0G = AnonymousClass7TF.A0G(view, R.id.note_action_buttons);
        AnonymousClass07Z viewLifecycleOwner4 = getViewLifecycleOwner();
        1Eo.A05(r0, new MHG(viewLifecycleOwner4, r42, this, A0G, (AnonymousClass4D7) null, 44), AnonymousClass07a.A00(viewLifecycleOwner4));
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

    public final AnonymousClass0wW getSession() {
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

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C54162H1g() {
        0eO r4 = 0eO.A02;
        this.A03 = C51975G9x.A0r(this, AnonymousClass000.A00(3636), r4, 29);
        this.A06 = AnonymousClass1YB.A00(C58334IqF.A00);
        MMC mmc = new MMC(this, 46);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new MJ0(new MJ0(this, 1), 2));
        this.A07 = DbS.A0I(new MJ0(A002, 3), mmc, new GNG(40, (Object) null, A002), DbS.A0z(C53020GhB.class));
        C58335IqG iqG = C58335IqG.A00;
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new MJ0(new MJ0(this, 4), 5));
        this.A08 = DbS.A0I(new MJ0(A003, 6), iqG, new GNG(41, (Object) null, A003), DbS.A0z(C52977GgU.class));
        MMC mmc2 = new MMC(this, 45);
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r4, new MMC(new MMC(this, 48), 49));
        this.A05 = DbS.A0I(new MJ0(A004, 0), mmc2, new GNG(39, (Object) null, A004), DbS.A0z(C60261JiI.class));
        this.A04 = DbS.A0I(new MMC(this, 47), new MMC(this, 44), new GNG(37, (Object) null, this), DbS.A0z(C53016Gh7.class));
        this.A0B = new IR3(this);
        this.A0A = DbS.A0O(__redex_internal_original_name);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1646900548);
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass0eM r1 = this.A03;
        ((C53016Gh7) this.A04.getValue()).A00(((ContentNotesImmersiveSelfNoteContent) r1.getValue()).A00.A08);
        View inflate = layoutInflater.inflate(R.layout.content_notes_immersive_self_note, viewGroup, false);
        if (AnonymousClass7TE.A1b(G9w.A0W(r1).A0K)) {
            this.A00 = (RecyclerView) inflate.findViewById(R.id.notes_user_rows_recycler_view);
            LayoutInflater layoutInflater2 = getLayoutInflater();
            0qQ.A07(layoutInflater2);
            this.A01 = new PIF(layoutInflater2, this, this.A0B);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A15(new C67837Mvh(this, 1));
            }
        }
        AnonymousClass0fD.A09(1923793821, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-913791833);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        ((C53016Gh7) this.A04.getValue()).A01(((ContentNotesImmersiveSelfNoteContent) this.A03.getValue()).A00.A08, (String) null);
        AnonymousClass0fD.A09(1634813160, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-902574305);
        super.onResume();
        ((C60261JiI) this.A05.getValue()).A02(false);
        AnonymousClass0fD.A09(193121295, A022);
    }
}
