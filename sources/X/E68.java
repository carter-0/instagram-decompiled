package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;

public final class E68 extends AnonymousClass4DH implements C273494mf {
    public static final F1J A08 = new Object();
    public static final String __redex_internal_original_name = "ContentNotesNuxFragment";
    public C51898G6o A00;
    public NestedScrollView A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        int i;
        AnonymousClass0eM r7;
        0xY A0p;
        int i2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (NestedScrollView) view.findViewById(R.id.content_notes_production_nux_scrollable_content);
        AnonymousClass0eM r3 = this.A07;
        C247383gF A002 = C247323g9.A00(AnonymousClass7TE.A0l(r3));
        AnonymousClass0eM r2 = this.A02;
        String A0t = DbS.A0t(r2);
        0qQ.A0B(A0t, 0);
        if (A0t.equals("clips_viewer_clips_media_notes") || A0t.equals(AnonymousClass000.A00(1180))) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        int intValue = num.intValue();
        C247353gC r0 = A002.A06;
        if (intValue != 0) {
            i = A002.A03;
            r7 = r0.A07;
            A0p = AnonymousClass7TE.A0p((1Av) r7.getValue());
            i2 = 4650;
        } else {
            i = A002.A01;
            r7 = r0.A07;
            A0p = AnonymousClass7TE.A0p((1Av) r7.getValue());
            i2 = 4649;
        }
        A0p.E5Z(AnonymousClass000.A00(i2), i);
        A0p.apply();
        0xY A0p2 = AnonymousClass7TE.A0p((1Av) r7.getValue());
        A0p2.E5T(AnonymousClass000.A00(1402), true);
        A0p2.apply();
        if (this.A06.getValue() == null) {
            int i3 = A002.A04;
            0xY A0p3 = AnonymousClass7TE.A0p((1Av) r7.getValue());
            A0p3.E5Z(AnonymousClass000.A00(1221), i3);
            A0p3.apply();
        }
        C48784Ek7.A00(AnonymousClass7TG.A0R(view, R.id.control_text_body), AnonymousClass7TE.A0l(r3), DbU.A0m(this, 2131956628));
        C3021461u r4 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.note_action_buttons);
        Context context = view.getContext();
        AnonymousClass0eM r72 = this.A03;
        int i4 = 2131956623;
        if (AnonymousClass7TF.A1Z(r72)) {
            i4 = 2131956615;
        }
        r4.setPrimaryAction(context.getString(i4), FP5.A00(this, 49));
        if (AnonymousClass7TF.A1Z(r72)) {
            r4.setSecondaryButtonEnabled(false);
        } else {
            r4.setSecondaryAction(context.getString(2131956625), FP5.A00(this, 50));
        }
        0lg A0X = DbT.A0X(r3);
        String A0t2 = DbS.A0t(r2);
        GPK gpk = (GPK) this.A04.getValue();
        String A0t3 = DbS.A0t(this.A05);
        0qQ.A0B(A0X, 0);
        DbZ.A0t(1, A0t2, gpk, A0t3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0X), "instagram_media_note_production_nux_bottom_sheet_impression_client");
        if (A0e.isSampled()) {
            A0e.AAJ("media_id", A0t3);
            DbS.A1O(A0e, A0t2);
            A0e.A8M(gpk, "event_source");
            A0e.Cgf();
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
        return DbS.A0T(this.A07);
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
        NestedScrollView nestedScrollView = this.A01;
        if (nestedScrollView == null || nestedScrollView.getScrollY() == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E68() {
        0eO r4 = 0eO.A02;
        this.A05 = AnonymousClass0eN.A00(r4, new C58719IwS("", this, "media_id", 36));
        this.A02 = AnonymousClass0eN.A00(r4, new C58719IwS("", this, "container_module", 37));
        this.A03 = AnonymousClass0eN.A00(r4, new C58719IwS(AnonymousClass7TE.A0u(), this, "disable_secondary_button", 38));
        this.A06 = AnonymousClass0eN.A00(r4, new C58719IwS((Object) null, this, "mimicry_entry_point", 39));
        this.A04 = AnonymousClass0eN.A00(r4, new C51803G2m((Object) this, "event_source", "event_source", 30));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(880754724);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_production_nux_landing, viewGroup, false);
        AnonymousClass0fD.A09(1539707756, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1718476783);
        this.A01 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-685729954, A022);
    }
}
