package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import java.util.Collection;
import java.util.List;

public final class K8G extends MYR implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AppreciationGiftFeedFragment";
    public final String A00 = C2818159r.A01();
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        if (requireArguments().getBoolean("arg_full_screen")) {
            DbW.A1B(r3, 2131953046);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "appreciation_gift_feed";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JTQ.A0y(getRecyclerView().A0D, getRecyclerView(), new C65319LrI(this, 1), C3251771i.A0A);
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHH mhh = new MHH(r5, this, viewLifecycleOwner, (AnonymousClass4D7) null, 12);
        19B r52 = 19B.A00;
        1Eo.A05(r52, mhh, A002);
        2YL A0H = DbS.A0H(this.A09);
        String A012 = C320236s2.A01(requireArguments(), "arg_media_id");
        1Eo.A05(r52, new MGE(A0H, A012, (AnonymousClass4D7) null, 8), JTP.A0J(A0H, A012, 0));
    }

    public static final WSW A00(C61006Jv5 jv5, K8G k8g) {
        String str;
        long j = jv5.A01;
        C266444Yx r0 = (C266444Yx) jv5.A04;
        if (r0 != null) {
            str = Dba.A0Y(k8g, r0);
        } else {
            str = null;
        }
        return new WSW((ImageUrl) jv5.A03, str, Dba.A0Y(k8g, (C266444Yx) jv5.A02), j, jv5.A05);
    }

    public static final void A02(Activity activity, K8G k8g, String str) {
        AnonymousClass0eM r5 = k8g.A08;
        DbU.A0w(activity, C46447Df9.A02().A01(AnonymousClass7TE.A0l(r5), C46548Dgp.A01(AnonymousClass7TE.A0l(r5), str, "appreciation_gift_feed", "appreciation_gift_feed").A04()), DbT.A0X(r5), ModalActivity.class, "profile");
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

    /* JADX WARNING: type inference failed for: r9v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.2tE, X.KFJ, java.lang.Object] */
    public final Collection getDefinitions() {
        ? obj = new Object();
        EFz eFz = new EFz(this, new MP6(this, 27));
        C15795Uie uie = new C15795Uie(this, AnonymousClass7TE.A0l(this.A08), new C59111J6t(this, 11), new C59111J6t(this, 12), new JJQ(this, 22), new JK0(this, 4));
        ? obj2 = new Object();
        ? obj3 = new Object();
        obj3.A00 = (C63584KzX) this.A04.getValue();
        return 0sr.A1P(new C232222tE[]{obj, eFz, uie, obj2, obj3, new KF9(new MMI(this, 2)), new KFA(new MMI(this, 3))});
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MP6(this, 28));
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

    public final boolean isScrolledToTop() {
        if (this.mView == null || getRecyclerView().computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K8G() {
        MMI mmi = new MMI(this, 13);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMI(new MMI(this, 10), 11));
        this.A09 = DbS.A0I(new MMI(A002, 12), mmi, new MMZ(30, (Object) null, (Object) A002), DbS.A0z(C60311JjC.class));
        this.A01 = MMI.A00(this, 1);
        this.A03 = MMI.A00(this, 5);
        this.A02 = MMI.A00(this, 4);
        this.A07 = MMI.A00(this, 9);
        this.A05 = MMI.A00(this, 7);
        this.A06 = MMI.A00(this, 8);
        this.A04 = MMI.A00(this, 6);
        this.A08 = C227642jf.A02(this);
    }

    public static final List A01(K8G k8g, boolean z, boolean z2) {
        LE5 le5;
        boolean z3;
        01N A1H = 0jo.A1H();
        if (z) {
            le5 = new LE5();
            le5.A06 = "onboard_banner_start_button_tag";
            le5.A05 = Integer.valueOf(R.drawable.instagram_money_pano_outline_24);
            le5.A03 = 2131953045;
            le5.A02 = 2131953044;
            z3 = false;
        } else {
            if (z2) {
                le5 = new LE5();
                le5.A06 = "non_recorded_gifters_disclaimer_dismiss_tag";
                le5.A05 = Integer.valueOf(R.drawable.instagram_gift_box_pano_outline_24);
                le5.A03 = 2131953042;
                z3 = true;
            }
            A1H.add(k8g.A01.getValue());
            return 0jo.A1I(A1H);
        }
        le5.A07 = z3;
        le5.A00 = 1;
        le5.A04 = Integer.valueOf(2Yu.A0H(k8g.getContext(), R.attr.igds_color_elevated_separator));
        A1H.add(le5.A00());
        A1H.add(k8g.A01.getValue());
        return 0jo.A1I(A1H);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
