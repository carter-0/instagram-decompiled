package X;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.friendmap.view.fragment.FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.NJg  reason: case insensitive filesystem */
public final class C68468NJg extends AnonymousClass4DH implements AnonymousClass4DR, C262944Gp, C273494mf {
    public static final String __redex_internal_original_name = "FriendMapUpdatesBottomSheetFragment";
    public AnonymousClass2t9 A00;
    public final AnonymousClass0eM A01 = C73898PlZ.A00(this, 27);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = C73898PlZ.A00(this, 33);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final String A08;

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }

    public final /* synthetic */ void D4N() {
    }

    public final /* synthetic */ void D4O(Integer num) {
    }

    public final /* synthetic */ void Dx6(C61065Jw3 jw3) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A06;
        DbY.A16(this, (RecyclerView) AnonymousClass7TE.A14(r4));
        AnonymousClass2tC r3 = new AnonymousClass2tC(getLayoutInflater());
        r3.A01(new C68622NPs(AnonymousClass7TE.A0l(this.A04), new O92(this)));
        this.A00 = DbU.A0U(r3, new Object());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A14(r4);
        AnonymousClass2t9 r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("notesAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(r0);
        07U r42 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r42, this, (AnonymousClass4D7) null, 37), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass0eM r43 = this.A03;
        ((SearchEditText) AnonymousClass7TE.A14(r43)).A0B = new C65797Lzp(this, 2);
        ((SearchEditText) AnonymousClass7TE.A14(r43)).A0C = new PRP(this, 2);
        int A032 = AnonymousClass7TF.A03(getContext(), R.attr.igds_color_secondary_icon);
        ((SearchEditText) AnonymousClass7TE.A14(r43)).setCompoundDrawableTintList(ColorStateList.valueOf(A032));
        ((SearchEditText) AnonymousClass7TE.A14(r43)).setClearButtonColorFilter(AnonymousClass37O.A00(A032));
        ((SearchEditText) AnonymousClass7TE.A14(r43)).setSearchIconEnabled(true);
        ((SearchEditText) AnonymousClass7TE.A14(r43)).setClearButtonEnabled(true);
        AnonymousClass37D A0i = DbX.A0i(this);
        if (A0i != null) {
            ((SearchEditText) AnonymousClass7TE.A14(r43)).setOnFocusChangeListener(new LYL(2, A0i, this));
            A0i.A0Q(this);
        }
    }

    public static final void A00(C68468NJg nJg) {
        AnonymousClass0eM r1 = nJg.A03;
        if (((SearchEditText) AnonymousClass7TE.A14(r1)).hasFocus()) {
            ((SearchEditText) AnonymousClass7TE.A14(r1)).clearFocus();
            0nA.A0N((SearchEditText) AnonymousClass7TE.A14(r1));
        }
    }

    public final void DHB(Integer num) {
        C71144Ody.A06(new C71144Ody(this, JTS.A0J(this.A04)), (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, "BOTTOM_SHEET", "IMPRESSION", (String) null, "FULLSCREEN", (String) null);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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
        return this.A08;
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
        return !JTP.A1Y(AnonymousClass7TH.A06(this.A06));
    }

    public final boolean onBackPressed() {
        OCQ ocq;
        FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig friendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig = (FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig) this.A05.getValue();
        if (friendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig == null || (ocq = friendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig.A00) == null) {
            return false;
        }
        ocq.A00.invoke();
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C68468NJg() {
        C73898PlZ plZ = new C73898PlZ(this, 35);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73898PlZ(new C73898PlZ(this, 30), 31));
        this.A07 = DbS.A0I(new C73898PlZ(A002, 32), plZ, new C58185Inp(26, (Object) null, A002), DbS.A0z(NdC.class));
        this.A06 = C73898PlZ.A00(this, 34);
        this.A02 = C73898PlZ.A00(this, 28);
        this.A03 = C73898PlZ.A00(this, 29);
        this.A08 = __redex_internal_original_name;
    }

    public final void D9d() {
        A00(this);
    }

    public final void DYG(int i, int i2) {
        int abs;
        AnonymousClass37D A0i = DbX.A0i(this);
        if (A0i != null) {
            int A082 = A0i.A08();
            float f = ((float) A082) * 0.2f;
            if (i == 0) {
                abs = 0;
            } else {
                abs = Math.abs(A082 - i);
            }
            if (((float) abs) < f) {
                A00(this);
            }
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(945890431);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.friend_map_updates_bottom_sheet, false);
        AnonymousClass0fD.A09(304237902, A022);
        return A0D;
    }

    public final void onDestroy() {
        int i;
        int A022 = AnonymousClass0fD.A02(-109067600);
        super.onDestroy();
        AnonymousClass37D A0i = DbX.A0i(this);
        if (A0i == null) {
            i = 455852634;
        } else {
            A0i.A0R(this);
            i = 1198841548;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final void Cv6(float f) {
        A00(this);
    }
}
