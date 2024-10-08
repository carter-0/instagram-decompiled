package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.video.live.mvvm.viewmodel.bottomsheet.IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.KaQ  reason: case insensitive filesystem */
public final class C62118KaQ extends C262934Go implements C51903G6x, XCD {
    public C262204Co A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C313666go A03;
    public final X9V A04;
    public final C313886hJ A05;
    public final AnonymousClass0eM A06;

    public final /* synthetic */ void D9e() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onShareOneTap(DirectShareTarget directShareTarget) {
    }

    public final void A00() {
        AnonymousClass0r6 A022;
        AnonymousClass0Ud A10;
        AnonymousClass0eM r2 = this.A06;
        this.A00 = AnonymousClass11O.A03(DbV.A0J(this.A01), C66186MGx.A01(this, ((C60248Ji5) r2.getValue()).A0D, 42));
        C60248Ji5 ji5 = (C60248Ji5) r2.getValue();
        C262204Co r1 = ji5.A01;
        C262204Co r0 = null;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        int ordinal = ji5.A03.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                AnonymousClass0Ud r22 = ji5.A0A.A0g;
                L5Q l5q = ji5.A06;
                if (l5q != null) {
                    A10 = l5q.A01;
                } else {
                    A10 = C51970G9q.A10(false);
                }
                A022 = AnonymousClass10H.A03(new IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1(ji5, (AnonymousClass4D7) null), r22, A10);
            }
            ji5.A01 = r0;
        }
        A022 = MHB.A02(ji5, ji5.A0A.A0W, 22);
        r0 = AnonymousClass11O.A03(C318116oQ.A00(ji5), A022);
        ji5.A01 = r0;
    }

    public final void D9d() {
        C60248Ji5 ji5 = (C60248Ji5) this.A06.getValue();
        AnonymousClass7TF.A1O(ji5.A0A.A0C, false);
        ji5.A00 = 0.0f;
    }

    public final void DYG(int i, int i2) {
        ((C60248Ji5) this.A06.getValue()).A00((float) i);
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
        return true;
    }

    public final void onBottomSheetClosed() {
        C60248Ji5 ji5 = (C60248Ji5) this.A06.getValue();
        AnonymousClass7TF.A1O(ji5.A0A.A0C, false);
        ji5.A00 = 0.0f;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        ((C60248Ji5) this.A06.getValue()).A00((float) i);
    }

    public final void onShareTap(List list) {
        C60248Ji5 ji5 = (C60248Ji5) this.A06.getValue();
        if (ji5.A0G) {
            C66184MGv.A02(ji5, C318116oQ.A00(ji5), 13);
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C62118KaQ(AnonymousClass4DH r8, UserSession userSession, C313666go r10, X9V x9v, C313886hJ r12) {
        C51972G9s.A1C(userSession, r12);
        this.A01 = r8;
        this.A02 = userSession;
        this.A03 = r10;
        this.A05 = r12;
        this.A04 = x9v;
        C66292MMb A012 = C66292MMb.A01(this, 25);
        AnonymousClass0eM A002 = C66292MMb.A00(C66292MMb.A01(r8, 22), 0eO.A02, 23);
        this.A06 = DbS.A0I(C66292MMb.A01(A002, 24), A012, new C20614Wvv(36, (Object) null, A002), DbS.A0z(C60248Ji5.class));
        if (r10 != C313666go.VIEWER) {
            A00();
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
