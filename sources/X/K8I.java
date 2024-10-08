package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class K8I extends MYR implements C273494mf, G7N {
    public static final String __redex_internal_original_name = "IgLiveRoomsInviteFragment";
    public X9V A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final Collection getDefinitions() {
        return JTT.A0s(new KG8(C66365MOw.A00), new C15796Uif(this, AnonymousClass7TE.A0l(this.A01), (G7P) null, C313666go.BROADCASTER, this.A00, C66366MOx.A00));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MPC(this, 2));
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub A0F = DbS.A0F(view, R.id.recycler_top_view_stub);
        A0F.setLayoutResource(R.layout.top_search_bar);
        A0F.inflate();
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) view.findViewById(R.id.search_typeahead_header);
        if (typeaheadHeader != null) {
            typeaheadHeader.A03(DbU.A0m(this, 2131972797));
            typeaheadHeader.A01 = this;
        }
        AnonymousClass0eM r4 = this.A02;
        DbV.A1F(getViewLifecycleOwner(), ((C62303Kdb) r4.getValue()).A00, new MPC(this, 3), 64);
        ((C62303Kdb) r4.getValue()).A07("");
    }

    public final void registerTextViewLogging(TextView textView) {
    }

    public final void searchTextChanged(String str) {
        0qQ.A0B(str, 0);
        ((C62303Kdb) this.A02.getValue()).A07(str);
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
        return DbS.A0T(this.A01);
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K8I() {
        C66293MMc mMc = new C66293MMc(this, 30);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(this, 27), 0eO.A02, 28);
        this.A02 = C66304MMn.A00(A012, new C66293MMc(A012, 29), mMc, DbS.A0z(C62303Kdb.class), 28);
    }

    public static final List A00(List list, List list2, List list3, boolean z, boolean z2) {
        Integer num;
        String str;
        boolean z3;
        WSZ wsz;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0d = JTP.A0d(it);
            if (JTQ.A1T(A0d, list3)) {
                num = AnonymousClass05K.A0C;
                str = null;
            } else if (JTQ.A1T(A0d, list2)) {
                wsz = new WSZ(A0d, AnonymousClass05K.A01, (String) null, false, false);
                A0r.add(wsz);
            } else {
                num = AnonymousClass05K.A15;
                str = null;
                if (!z || !(A0d.A0M() == AnonymousClass05K.A00 || A0d.A0M() == AnonymousClass05K.A0N)) {
                    z3 = false;
                    wsz = new WSZ(A0d, num, str, z3, z2);
                    A0r.add(wsz);
                }
            }
            z3 = true;
            wsz = new WSZ(A0d, num, str, z3, z2);
            A0r.add(wsz);
        }
        return A0r;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() == 0 || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }
}
