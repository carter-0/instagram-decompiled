package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;

public abstract class K6S extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf, AnonymousClass4DS, G6T {
    public static final String __redex_internal_original_name = "AudiencePickerFragment";
    public K9H A00;
    public C65614Lwp A01;
    public String A02;
    public final LRl A03 = new LRl();
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public static void A02(K6S k6s) {
        k6s.A09().A04(k6s.requireContext(), (View.OnClickListener) null, C320156rr.LOADING);
    }

    public static void A03(K6S k6s, Object obj) {
        0qQ.A0B(obj, 0);
        k6s.A00 = new K9H(k6s.requireContext(), k6s, k6s, k6s, k6s, k6s, k6s.A0B(), true, false);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, X.K6S, X.4DH] */
    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AnonymousClass7TF.A0F(view, R.id.search_box);
        View A0G = AnonymousClass7TF.A0G(view, R.id.search_exit_button);
        this.A01 = new C65614Lwp(requireContext(), A0G, AnonymousClass07i.A00(this), AnonymousClass7TE.A0l(this.A04), igdsInlineSearchBox, A09(), this.A02);
        RecyclerView A0c = JTR.A0c(view, R.id.recycler_view);
        DbY.A16(this, A0c);
        A0c.setAdapter(A09());
        C60473Jm5.A00(A0c, igdsInlineSearchBox, 17);
    }

    public final K9H A09() {
        K9H k9h = this.A00;
        if (k9h != null) {
            return k9h;
        }
        0qQ.A0F("listAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C65614Lwp A0A() {
        C65614Lwp lwp = this.A01;
        if (lwp != null) {
            return lwp;
        }
        0qQ.A0F("searchController");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r2.equals("collapsed") != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        return X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r2.equals("collapsed") != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A0B() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C62040KXc
            if (r0 == 0) goto L_0x003c
            r0 = r4
            X.KXc r0 = (X.C62040KXc) r0
            X.0eM r0 = r0.A06
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36885076058964566(0x830ac800020256, double:3.389608851744537E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            int r1 = r2.hashCode()
            r0 = 497541391(0x1da7e10f, float:4.4437237E-21)
            if (r1 == r0) goto L_0x0031
            r0 = 1880183383(0x70115257, float:1.7989948E29)
            if (r1 != r0) goto L_0x002e
            java.lang.String r0 = "collapsed"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0065
        L_0x002e:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0031:
            java.lang.String r0 = "facepile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x003c:
            boolean r0 = r4 instanceof X.KXg
            if (r0 == 0) goto L_0x002e
            r0 = r4
            X.KXg r0 = (X.KXg) r0
            X.0eM r0 = r0.A0A
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36882851266429390(0x8308c2000a01ce, double:3.388201883986771E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            int r1 = r2.hashCode()
            r0 = 1880183383(0x70115257, float:1.7989948E29)
            if (r1 != r0) goto L_0x002e
            java.lang.String r0 = "collapsed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
        L_0x0065:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6S.A0B():java.lang.Integer");
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
        if (this instanceof KXi) {
            KXi kXi = (KXi) this;
            RecyclerView recyclerView = kXi.A00;
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0) {
                    RecyclerView recyclerView2 = kXi.A00;
                    if (recyclerView2 != null) {
                        if (recyclerView2.computeVerticalScrollOffset() == 0) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static Context A00(SpannableStringBuilder spannableStringBuilder, Fragment fragment, CharSequence charSequence, int i) {
        spannableStringBuilder.append(fragment.getString(i)).append(" ").append(charSequence);
        return fragment.requireContext();
    }

    public static AnonymousClass3JR A01(2da r1, String str) {
        r1.ErN(str);
        r1.Eu4(true);
        AnonymousClass3JR r0 = new AnonymousClass3JR();
        r0.A00();
        return r0;
    }

    public static void A04(C65614Lwp lwp, User user) {
        lwp.A01(0mp.A06("users/search/", new Object[]{user.getId()}), "favorites_list_page");
    }

    public void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        boolean z = !igdsCheckBox.isChecked();
        igdsCheckBox.setChecked(z);
        boolean z2 = A0A().A01;
        LRl lRl = this.A03;
        lRl.A05(jva, JTP.A0j(z2 ? 1 : 0), z, z2);
        A09().A05(DbU.A0K(lRl.A03), DbU.A0K(lRl.A00));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1632508860);
        this.A00 = new K9H(DbT.A06(this, layoutInflater, 0), this, this, this, this, this, A0B(), false, false);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(1178973527, A022);
        return inflate;
    }
}
