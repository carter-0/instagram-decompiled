package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Map;

public final class E69 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "UniversalCreationMenuFragment";
    public AnonymousClass2t9 A00;
    public C49411EvD A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public RecyclerView A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final String A0A = "universal_creation_menu";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E69, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C49411EvD evD = this.A01;
        if (evD != null) {
            this.A00 = DbU.A0U(DbV.A0S(this), new EG9(AnonymousClass7TE.A0l(this.A09), evD));
        } else if (getActivity() != null) {
            DbV.A0I(this).A0c();
            return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!this.A02) {
            A00(AnonymousClass05K.A0N, A1C);
        }
        A00(AnonymousClass05K.A00, A1C);
        AnonymousClass0eM r4 = this.A09;
        0lg A0X = DbT.A0X(r4);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, A0X, 36323500495350984L)) {
            A00(AnonymousClass05K.A03, A1C);
        }
        if (!this.A03) {
            A00(AnonymousClass05K.A01, A1C);
        }
        if (!this.A07) {
            if (!182.A06(r2, DbT.A0X(r4), 36319098153540505L)) {
                A00(AnonymousClass05K.A0C, A1C);
            }
            if (182.A06(r2, DbT.A0X(r4), 36326464022460183L)) {
                A00(AnonymousClass05K.A04, A1C);
            }
            A00(AnonymousClass05K.A0Y, A1C);
            if (182.A06(r2, AnonymousClass7TF.A0L(r4, 0), 36324076020969210L)) {
                A00(AnonymousClass05K.A0j, A1C);
                if (182.A06(r2, AnonymousClass7TF.A0L(r4, 0), 36330204939108872L)) {
                    boolean A062 = 182.A06(r2, AnonymousClass7TF.A0L(r4, 0), 36324076024049425L);
                    AnonymousClass0xx A0E = DbW.A0E(this);
                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                    if (A062) {
                        C63977LGr.A00(A0l, A0E);
                    } else {
                        C63977LGr.A01(A0l, A0E);
                    }
                }
            }
            if (182.A06(r2, DbT.A0X(r4), 36318333649885269L) && !182.A06(r2, DbT.A0X(r4), 36329599348588756L)) {
                A00(AnonymousClass05K.A0u, A1C);
            }
            0eE r1 = AnonymousClass0t1.A01;
            if (DbX.A0l(r1, r4).A1M()) {
                A00(AnonymousClass05K.A15, A1C);
            }
            if (DbX.A1a(DbX.A0l(r1, r4).A03.COg()) && 182.A06(r2, DbT.A0X(r4), 36313557645658203L)) {
                A00(AnonymousClass05K.A1F, A1C);
                LTM.A06(this, AnonymousClass7TE.A0l(r4), "create_fundraiser_cell", "PROFILE_COMPOSER", (String) null, (String) null, (Map) null);
            }
            if (this.A04) {
                A00(AnonymousClass05K.A02, A1C);
            }
        }
        if (this.A06 && 182.A06(r2, DbT.A0X(r4), 36314893384223618L) && 182.A06(r2, DbT.A0X(r4), 36314893381077881L)) {
            A00(AnonymousClass05K.A1I, A1C);
        }
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(A1C);
        AnonymousClass2t9 r0 = this.A00;
        if (r0 != null) {
            r0.A05(A0R);
        }
        RecyclerView A0K = DbX.A0K(view);
        DbV.A1B(A0K.getContext(), A0K);
        A0K.setAdapter(this.A00);
        this.A08 = A0K;
        if (this.A05) {
            UserSession A0S = DbW.A0S(r4, 0);
            if (AnonymousClass5IJ.A01(A0S) && AnonymousClass5IJ.A02(A0S)) {
                C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(r4));
                int A003 = C48809EkX.A00(AnonymousClass7TE.A0l(r4), (Integer) null);
                ChannelCreationSource channelCreationSource = ChannelCreationSource.PROFILE;
                A002.A0E(channelCreationSource, A003);
                C69866NtU.A00(AnonymousClass7TE.A0l(r4)).A06(channelCreationSource);
                return;
            }
        }
        if (this.A05 && AnonymousClass5IJ.A01(AnonymousClass7TE.A0l(r4))) {
            C313746gw.A00(AnonymousClass7TE.A0l(r4)).A0E(ChannelCreationSource.PROFILE, C48809EkX.A00(AnonymousClass7TE.A0l(r4), (Integer) null));
        } else if (this.A05 && C375489Dt.A01(AnonymousClass7TE.A0l(r4))) {
            C50338FYv A004 = C69866NtU.A00(AnonymousClass7TE.A0l(r4));
            1Ln A005 = C50338FYv.A00(A004);
            if (DbT.A1Y(A005)) {
                Dbb.A1G(A005, A004.A03);
                Dba.A1D(A005, "create_social_channel_button_rendered");
                A005.A0p("profile_view");
                Dba.A1E(A005, "profile");
                A005.Cgf();
            }
        }
    }

    public static void A00(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new FY6(num));
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
        return this.A0A;
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

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A08;
        if (recyclerView == null || recyclerView.canScrollVertically(-1)) {
            return false;
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004c, code lost:
        if (X.AnonymousClass5IJ.A00(X.AnonymousClass7TE.A0l(r4)) == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -64119302(0xfffffffffc2d9dfa, float:-3.605886E36)
            int r5 = X.AnonymousClass0fD.A02(r0)
            X.E69.super.onCreate(r7)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "show_only_main_options"
            boolean r0 = r1.getBoolean(r0)
            r6.A07 = r0
            java.lang.String r0 = "is_group_profile"
            boolean r0 = r1.getBoolean(r0)
            r6.A06 = r0
            java.lang.String r0 = "hide_stories"
            boolean r0 = r1.getBoolean(r0)
            r6.A03 = r0
            java.lang.String r0 = "hide_reels"
            boolean r0 = r1.getBoolean(r0)
            r6.A02 = r0
            X.0eM r4 = r6.A09
            X.0lg r3 = X.DbT.A0X(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315881223622291(0x81051a000a0e93, double:3.0296477459104465E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6.A05 = r0
            if (r0 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r1 = X.AnonymousClass5IJ.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r6.A04 = r0
            r0 = -30621228(0xfffffffffe2cc1d4, float:-5.7408407E37)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E69.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1001939059);
        0qQ.A0B(layoutInflater, 0);
        E69.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, (ViewGroup) null, R.layout.layout_universal_creation_menu, false);
        AnonymousClass0fD.A09(1172142976, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-466282741);
        super.onDestroyView();
        RecyclerView recyclerView = this.A08;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        RecyclerView recyclerView2 = this.A08;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((C252553pI) null);
        }
        this.A08 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-1300651016, A022);
    }
}
