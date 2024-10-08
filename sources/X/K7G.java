package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class K7G extends AnonymousClass4DH implements C268594df, C273494mf {
    public static final String __redex_internal_original_name = "CommentStickerTabPickerFragment";
    public IgdsInlineSearchBox A00;
    public C74586PxZ A01;
    public OMY A02;
    public String A03;
    public ViewGroup A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C58177Inh(this, 25));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08 = DbS.A0I(new C58177Inh(this, 26), new C58177Inh(this, 27), new C58188Ins(33, (Object) null, this), DbS.A0z(C335127cR.class));

    public final void A00(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        0xY AR4 = C51969G9p.A0n(1Al.A01(userSession), 1An.A0r, this).AR4();
        AR4.E5g("comments_sticker_tray_last_used_tab", str);
        AR4.apply();
    }

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
        this.A05 = false;
    }

    public final void DMu(int i) {
        this.A05 = true;
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            viewGroup.setTranslationY(0.0f);
        }
    }

    public final boolean Erf() {
        return true;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final String getModuleName() {
        return "comment_sticker_picker_tab_fragment";
    }

    public final void onBottomSheetClosed() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        if (r1 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r3 = 0
            X.0qQ.A0B(r8, r3)
            super.onViewCreated(r8, r9)
            r0 = 2131442405(0x7f0b3ae5, float:1.8506849E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r8, r0)
            r7.A04 = r0
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r0 = r8.requireViewById(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r0
            r7.A00 = r0
            android.view.ViewGroup r4 = r7.A04
            if (r4 == 0) goto L_0x0031
            X.0eM r0 = r7.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.LzR r1 = new X.LzR
            r1.<init>(r7)
            X.OMY r0 = new X.OMY
            r0.<init>(r4, r2, r1)
            r7.A02 = r0
        L_0x0031:
            r0 = 1
            X.MBH r2 = new X.MBH
            r2.<init>(r7, r0)
            java.lang.String r4 = "gif_tab"
            r1 = 2131238322(0x7f081db2, float:1.809292E38)
            r0 = 2131956422(0x7f1312c6, float:1.95494E38)
            X.PRE r6 = new X.PRE
            r6.<init>(r4, r2, r1, r0)
            X.0eM r0 = r7.A07
            X.0lg r0 = X.DbT.A0X(r0)
            boolean r0 = X.JTR.A1X(r0)
            r5 = 2131237947(0x7f081c3b, float:1.8092159E38)
            if (r0 == 0) goto L_0x0056
            r5 = 2131237948(0x7f081c3c, float:1.809216E38)
        L_0x0056:
            X.MBH r1 = new X.MBH
            r1.<init>(r7, r3)
            java.lang.String r2 = "avatar_tab"
            r0 = 2131956416(0x7f1312c0, float:1.9549387E38)
            X.PRE r3 = new X.PRE
            r3.<init>(r2, r1, r5, r0)
            X.0eM r0 = r7.A06
            java.lang.Object r1 = r0.getValue()
            X.0xa r1 = (X.0xa) r1
            java.lang.String r0 = "comments_sticker_tray_last_used_tab"
            java.lang.String r0 = r1.getString(r0, r2)
            boolean r0 = X.0qQ.A0K(r0, r2)
            r2 = r6
            if (r0 == 0) goto L_0x007b
            r2 = r3
        L_0x007b:
            r7.A01 = r2
            X.OMY r1 = r7.A02
            if (r1 == 0) goto L_0x008c
            X.PxZ[] r0 = new X.C74586PxZ[]{r3, r6}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            r1.A01(r2, r0)
        L_0x008c:
            X.OMY r1 = r7.A02
            if (r1 == 0) goto L_0x009a
            X.0hq r0 = r7.getChildFragmentManager()
            X.0qQ.A07(r0)
            r1.A00(r0, r2)
        L_0x009a:
            java.lang.String r0 = r2.A02
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00b7
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r7.A00
            if (r1 == 0) goto L_0x00aa
            r0 = 0
        L_0x00a7:
            r1.setVisibility(r0)
        L_0x00aa:
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = r7.A00
            if (r2 == 0) goto L_0x00b6
            r1 = 2
            X.Lrt r0 = new X.Lrt
            r0.<init>(r7, r1)
            r2.A02 = r0
        L_0x00b6:
            return
        L_0x00b7:
            r0 = 8
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r7.A00
            if (r1 == 0) goto L_0x00aa
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K7G.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
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

    public final int getExtraDragSpace() {
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

    public final boolean isScrolledToBottom() {
        return false;
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        ViewGroup viewGroup;
        if (!this.A05 && (viewGroup = this.A04) != null) {
            viewGroup.setTranslationY((float) ((-i) - i2));
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final View C4U() {
        return requireView();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-303178770);
        K7G.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("args_entry_surface_module_name");
        } else {
            str = null;
        }
        this.A03 = str;
        AnonymousClass0fD.A09(-628914356, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-930005692);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_comment_sticker_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1536868270, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1375285323);
        C74586PxZ pxZ = this.A01;
        if (pxZ != null) {
            str = ((PRE) pxZ).A02;
        } else {
            str = null;
        }
        A00(AnonymousClass7TE.A0l(this.A07), str);
        super.onDestroyView();
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(1003078336, A022);
    }
}
