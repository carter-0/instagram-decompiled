package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.H1i  reason: case insensitive filesystem */
public final class C54164H1i extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "PublicCollectionsAudienceSelectorBottomSheetFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public JOU A02;
    public SavedCollection A03;
    public String A04;
    public boolean A05;
    public IgdsBottomButtonLayout A06;
    public boolean A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "public_collections_audience_selector_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Context requireContext;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgdsListCell) view.requireViewById(R.id.private_audience);
        this.A01 = (IgdsListCell) view.requireViewById(R.id.public_audience);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.done_button);
        this.A06 = igdsBottomButtonLayout;
        String str = "finishedButton";
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(getString(2131972502));
            IgdsListCell igdsListCell = this.A00;
            if (igdsListCell == null) {
                str = "privateListCell";
            } else {
                C69349Njo njo = C69349Njo.TYPE_RADIO;
                igdsListCell.A0G(njo, true);
                igdsListCell.setChecked(!this.A05);
                0eE r8 = AnonymousClass0t1.A01;
                AnonymousClass0eM r7 = this.A08;
                DbX.A0l(r8, r7).A0N();
                Integer num = AnonymousClass05K.A01;
                igdsListCell.A0C(new C56761IBk(2, igdsListCell, this, false));
                igdsListCell.setCompoundButtonClickListener(new C56761IBk(3, igdsListCell, this, false));
                IgdsListCell igdsListCell2 = this.A01;
                if (igdsListCell2 == null) {
                    str = "publicListCell";
                } else {
                    boolean z = this.A05;
                    igdsListCell2.A0G(njo, true);
                    igdsListCell2.setChecked(z);
                    if (DbX.A0l(r8, r7).A0N() == num) {
                        igdsListCell2.A0I(AnonymousClass7TE.A16(requireContext(), 2131972629));
                        igdsListCell2.A0H(AnonymousClass7TE.A16(requireContext(), 2131972628));
                        requireContext = requireContext();
                        i = R.drawable.instagram_globe_pano_outline_24;
                    } else {
                        igdsListCell2.A0I(AnonymousClass7TE.A16(requireContext(), 2131972618));
                        igdsListCell2.A0H(AnonymousClass7TE.A16(requireContext(), 2131972617));
                        requireContext = requireContext();
                        i = R.drawable.instagram_users_pano_outline_24;
                    }
                    Drawable drawable = requireContext.getDrawable(i);
                    if (drawable != null) {
                        igdsListCell2.A09(drawable);
                    }
                    igdsListCell2.A0C(new C56761IBk(2, igdsListCell2, this, true));
                    igdsListCell2.setCompoundButtonClickListener(new C56761IBk(3, igdsListCell2, this, true));
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A06;
                    if (igdsBottomButtonLayout2 != null) {
                        C56802ICz.A01(igdsBottomButtonLayout2, 42, this);
                        A00();
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00() {
        View view = this.mView;
        if (view != null) {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.privacy_warning);
            if (!this.A07 || !this.A05) {
                A0R.setVisibility(8);
                return;
            }
            A0R.setVisibility(0);
            DbU.A1G(A0R, this, 2131972622);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.igds.components.textcell.IgdsListCell r4, X.C54164H1i r5, boolean r6) {
        /*
            boolean r0 = r4.A0H
            if (r0 != 0) goto L_0x0061
            r0 = 1
            r4.setChecked(r0)
            if (r6 == 0) goto L_0x0018
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.A00
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "privateListCell"
        L_0x0010:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.A01
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "publicListCell"
            goto L_0x0010
        L_0x001f:
            r1 = 0
            r0.setChecked(r1)
            r5.A05 = r6
            if (r6 == 0) goto L_0x005e
            java.lang.String r4 = "public"
        L_0x0029:
            X.0eM r0 = r5.A08
            X.0lg r0 = X.DbT.A0X(r0)
            java.lang.String r3 = r5.A04
            X.0wc r1 = X.DbT.A0Q(r5, r0, r1)
            java.lang.String r0 = "ig_collections"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x005a
            java.lang.String r1 = "public_collections_audience_selector_bottom_sheet"
            java.lang.String r0 = "module_name"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "audience_selector_tap"
            X.DbS.A1I(r2, r0)
            java.lang.String r0 = "collection_id"
            r2.AAJ(r0, r3)
            java.lang.String r0 = "collection_type"
            r2.AAJ(r0, r4)
            X.AnonymousClass7TH.A0V(r2)
        L_0x005a:
            r5.A00()
            return
        L_0x005e:
            java.lang.String r4 = "private"
            goto L_0x0029
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54164H1i.A01(com.instagram.igds.components.textcell.IgdsListCell, X.H1i, boolean):void");
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
        return DbS.A0T(this.A08);
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
        int A022 = AnonymousClass0fD.A02(867640426);
        C54164H1i.super.onCreate(bundle);
        this.A05 = requireArguments().getBoolean("is_public_collection", false);
        this.A07 = requireArguments().getBoolean("arg_has_private_media", false);
        this.A04 = requireArguments().getString("audience_selector_collection_id", (String) null);
        this.A03 = (SavedCollection) requireArguments().getParcelable("audience_selector_collection");
        AnonymousClass0fD.A09(-1344171375, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1011147572);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.public_collections_audience_selector_sheet, viewGroup, false);
        AnonymousClass0fD.A09(399532206, A022);
        return inflate;
    }
}
