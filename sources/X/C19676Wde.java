package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;

/* renamed from: X.Wde  reason: case insensitive filesystem */
public final class C19676Wde implements C273494mf {
    public C229382nI A00;
    public C46620Di0 A01;
    public C331157Pu A02;
    public C15368UbL A03;
    public Product A04;
    public Boolean A05 = AnonymousClass7TE.A0u();
    public Fragment A06;
    public final Context A07;
    public final UserSession A08;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C20926X4r r5, com.instagram.shopping.model.variantselector.VariantSelectorModel r6, X.C273414mX r7, boolean r8) {
        /*
            r4 = this;
            r3 = 1
            com.instagram.model.shopping.ProductVariantDimension r0 = r6.A08
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r2 = r0.A00
            int r1 = r2.ordinal()
            if (r1 == r3) goto L_0x007d
            r0 = 2
            if (r1 != r0) goto L_0x008b
            X.Ur3 r0 = new X.Ur3
            r0.<init>()
        L_0x0013:
            r4.A03 = r0
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "variant_selector_model"
            r2.putParcelable(r0, r6)
            java.lang.String r0 = "arg_disable_sold_out"
            r2.putBoolean(r0, r3)
            com.instagram.user.model.Product r1 = r4.A04
            java.lang.String r0 = "product"
            r2.putParcelable(r0, r1)
            X.UbL r0 = r4.A03
            r0.setArguments(r2)
            r0.A01(r5)
            r0 = 0
            X.7Pr r2 = r4.A00(r6, r0)
            androidx.fragment.app.Fragment r0 = r4.A06
            if (r0 == 0) goto L_0x006c
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x006c
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            X.7Pu r1 = r1.A02
            r1.getClass()
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            r2.A03 = r0
            r2.A1G = r3
            r2.A0U = r7
            X.UbL r0 = r4.A03
            r1.A0E(r0, r2)
        L_0x0057:
            X.UbL r2 = r4.A03
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L_0x006b
            com.instagram.common.session.UserSession r1 = r4.A08
            X.2el r0 = X.C51969G9p.A0k()
            X.2nI r0 = X.C229382nI.A02(r2, r2, r1, r0)
            r4.A00 = r0
        L_0x006b:
            return
        L_0x006c:
            r2.A0U = r7
            X.7Pu r2 = r2.A00()
            android.content.Context r1 = r4.A07
            X.UbL r0 = r4.A03
            X.7Pu r0 = r2.A03(r1, r0)
            r4.A02 = r0
            goto L_0x0057
        L_0x007d:
            if (r8 == 0) goto L_0x0085
            X.Ur5 r0 = new X.Ur5
            r0.<init>()
            goto L_0x0013
        L_0x0085:
            X.Ur4 r0 = new X.Ur4
            r0.<init>()
            goto L_0x0013
        L_0x008b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported visual style: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19676Wde.A01(X.X4r, com.instagram.shopping.model.variantselector.VariantSelectorModel, X.4mX, boolean):void");
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onBottomSheetClosed() {
        this.A02 = null;
        this.A03 = null;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    private C331127Pr A00(VariantSelectorModel variantSelectorModel, int[] iArr) {
        C331127Pr r4 = new C331127Pr(this.A08);
        Context context = this.A07;
        Resources resources = context.getResources();
        ProductVariantDimension productVariantDimension = variantSelectorModel.A08;
        r4.A0d = AnonymousClass7TF.A0e(resources, productVariantDimension.A03, 2131976369);
        r4.A0T = this;
        if (iArr != null) {
            r4.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (productVariantDimension.A01 != null) {
            SpannableStringBuilder A082 = DbW.A08(context, 2131973915);
            C358838bY.A01(context, A082, Selection.getSelectionStart(A082), Selection.getSelectionEnd(A082), 2Yu.A0F(context, 16842907));
            C331137Ps r2 = new C331137Ps();
            r2.A06 = A082;
            r2.A05 = new WBD(69, (Object) variantSelectorModel, (Object) this);
            r2.A0A = true;
            r4.A07(r2.A00());
        }
        return r4;
    }

    public final void A03(C20932X4x x4x) {
        C331157Pu r1 = this.A02;
        if (r1 != null) {
            r1.A0L((C332277Ui) null);
            this.A02 = null;
        }
        Fragment fragment = this.A06;
        if (fragment != null) {
            BottomSheetFragment bottomSheetFragment = fragment.mParentFragment;
            if (bottomSheetFragment instanceof BottomSheetFragment) {
                C331157Pu r0 = bottomSheetFragment.A02;
                r0.getClass();
                r0.A0T();
                if (x4x != null) {
                    x4x.DX8();
                }
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
        C15368UbL ubL = this.A03;
        if (ubL == null || !ubL.isScrolledToTop()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C19676Wde(Context context, UserSession userSession, Product product) {
        this.A07 = context;
        this.A08 = userSession;
        this.A04 = product;
    }

    public final void A02(C20926X4r x4r, VariantSelectorModel variantSelectorModel, int[] iArr) {
        C331127Pr A002 = A00(variantSelectorModel, iArr);
        this.A03 = new C16242Ur5();
        Bundle bundle = new Bundle();
        bundle.putParcelable("variant_selector_model", variantSelectorModel);
        C15368UbL ubL = this.A03;
        ubL.setArguments(bundle);
        ubL.A01(x4r);
        A002.A0T = ubL;
        C331157Pu r0 = this.A02;
        r0.getClass();
        r0.A0F(ubL, A002);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public C19676Wde(Context context, Fragment fragment, UserSession userSession, Product product) {
        this.A07 = context;
        this.A08 = userSession;
        this.A06 = fragment;
        this.A04 = product;
    }
}
