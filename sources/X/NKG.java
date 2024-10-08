package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class NKG extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectScheduledMessagesFragment";
    public AnonymousClass2t9 A00;
    public boolean A01 = true;
    public RecyclerView A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final 1wn A07;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "direct_scheduled_messages_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        DirectThreadThemeInfo directThreadThemeInfo;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new Object());
        A0S.A01(new Object());
        this.A00 = DbU.A0U(A0S, new Object());
        RecyclerView A0I = DbT.A0I(view, R.id.scheduled_messages_layout);
        this.A02 = A0I;
        if (A0I != null) {
            A0I.setAdapter(this.A00);
        }
        Context requireContext = requireContext();
        AnonymousClass9HD r0 = AnonymousClass9HC.A1b;
        AnonymousClass0eM r1 = this.A04;
        AnonymousClass9HC A0M = C66584MXp.A0M(r0, r1);
        if (AnonymousClass3HA.A00(requireActivity())) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        AnonymousClass3U9 B33 = 2L2.A00(AnonymousClass7TE.A0l(r1)).B33((DirectThreadKey) this.A05.getValue());
        if (B33 != null) {
            directThreadThemeInfo = B33.C5v();
        } else {
            directThreadThemeInfo = null;
        }
        AnonymousClass7L2 A012 = C329927Kt.A00.A01(requireContext, A0M, directThreadThemeInfo, num);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(viewLifecycleOwner, A012, r4, this, (AnonymousClass4D7) null, 26), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final boolean A01(C254703su r2, C254703su r3) {
        if (r3 == null || A00(r2) || A00(r3) || r2.A0P() != null || r3.A0P() != null || !0qQ.A0K(r3.A1Q, r2.A1Q)) {
            return false;
        }
        return true;
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
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return C2808154f.A05(recyclerView);
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NKG() {
        0eO r3 = 0eO.A02;
        this.A05 = C51804G2n.A01(this, AnonymousClass000.A00(15), r3, 23);
        C73902Pld pld = new C73902Pld(this, 27);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C73902Pld(new C73902Pld(this, 24), 25));
        this.A06 = DbS.A0I(new C73902Pld(A002, 26), pld, new C73665Phe(19, A002, (Object) null), DbS.A0z(K8P.class));
        this.A07 = C71932OtG.A00(this, 17);
        this.A03 = AnonymousClass1YB.A00(C66256MKr.A00);
    }

    public static final boolean A00(C254703su r5) {
        Calendar instance = Calendar.getInstance();
        instance.add(12, -5);
        return AnonymousClass7TF.A1R((instance.getTimeInMillis() > TimeUnit.SECONDS.toMillis(DbY.A04(r5.A1Q)) ? 1 : (instance.getTimeInMillis() == TimeUnit.SECONDS.toMillis(DbY.A04(r5.A1Q)) ? 0 : -1)));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1427502516);
        NKG.super.onCreate(bundle);
        ((K8P) this.A06.getValue()).A00((DirectThreadKey) this.A05.getValue());
        DbX.A0R(this.A04).A01(this.A07, 2Kb.class);
        AnonymousClass0fD.A09(-1929119677, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1690129748);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_scheduled_messages_viewer, false);
        AnonymousClass0fD.A09(1895661309, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2120944995);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        DbX.A0R(this.A04).A02(this.A07, 2Kb.class);
        AnonymousClass0fD.A09(677483209, A022);
    }
}
