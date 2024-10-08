package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUt  reason: case insensitive filesystem */
public final class C68733NUt extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A04 = NJT.A0A(C68733NUt.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsV3IntroFragment";
    public C62320sa A00 = MYO.A01(this, 11);
    public final C319956rV A01 = new C46362Dde(this, MYO.A01(this, 6));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(MYO.A01(this, 5));
    public final AnonymousClass0eM A03;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_v3_intro_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterOnViewCreated() {
        /*
            r7 = this;
            X.0eM r0 = r7.A03
            java.lang.Object r4 = r0.getValue()
            X.MtO r4 = (X.C67709MtO) r4
            java.lang.Integer r6 = X.C71145Oe2.A02(r7)
            java.lang.Integer r1 = X.C71145Oe2.A03(r7)
            java.lang.Integer r5 = X.C71145Oe2.A01(r7)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            r3 = 10
            X.0qQ.A0B(r1, r0)
            X.NUN r2 = r4.A01
            java.lang.String r0 = "INTRODUCE_NUX_IMPRESSION"
            r2.A0B(r0)
            java.lang.String r1 = X.C69893Ntv.A00(r1)
            java.lang.String r0 = "PERIOD"
            r2.A0D(r0, r1)
            java.lang.String r1 = "SETUP_TYPE"
            java.lang.String r0 = "NONE"
            X.C66913Mex.A02(r2, r5, r1, r0)
            int r1 = r6.intValue()
            if (r1 == r3) goto L_0x0065
            r0 = 11
            if (r1 == r0) goto L_0x0062
            r0 = 4
            if (r1 == r0) goto L_0x005f
            r0 = 2
            if (r1 != r0) goto L_0x004c
            java.lang.String r1 = "SETTINGS"
        L_0x0047:
            java.lang.String r0 = "ENTRY_POINT"
            r2.A0D(r0, r1)
        L_0x004c:
            X.0eM r0 = r4.A02
            boolean r0 = X.C66582MXn.A1X(r0)
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = "GDRIVE"
        L_0x0056:
            java.lang.String r0 = "LEADING"
            r2.A0D(r0, r1)
            return
        L_0x005c:
            java.lang.String r1 = "PIN_CODE"
            goto L_0x0056
        L_0x005f:
            java.lang.String r1 = "FISHFOODING"
            goto L_0x0047
        L_0x0062:
            java.lang.String r1 = "INBOX_BANNER"
            goto L_0x0047
        L_0x0065:
            java.lang.String r1 = "THREAD_EXIT"
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68733NUt.afterOnViewCreated():void");
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
        return NJT.A08(this.A01, this, A04);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Dde, X.6rV] */
    public C68733NUt() {
        MYO A012 = MYO.A01(this, 10);
        AnonymousClass0eM A002 = MYO.A00(MYO.A01(this, 7), 0eO.A02, 8);
        this.A03 = DbS.A0I(MYO.A01(A002, 9), A012, C73915Plq.A00(A002, (Object) null, 12), DbS.A0z(C67709MtO.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1302215803);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_v3_intro_layout, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        FGX A023 = FGX.A02(requireContext(), true);
        A023.A05(getString(2131961136), getString(2131961137), R.drawable.instagram_lock_pano_outline_24);
        FGX.A03(A023, A0O, getString(2131961139), getString(2131961138), R.drawable.instagram_key_pano_outline_24);
        C71407Ok6.A02((C3021461u) AnonymousClass7TF.A0F(inflate, R.id.bottom_buttons), this, 48);
        NJT.A04(inflate, this);
        AnonymousClass0fD.A09(633672985, A022);
        return inflate;
    }
}
