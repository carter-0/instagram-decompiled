package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.UsI  reason: case insensitive filesystem */
public final class C16298UsI extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotePaymentsInterstitialFragment";
    public AnonymousClass07i A00;
    public BaseFragmentActivity A01;
    public WGU A02;
    public 0wc A03;
    public C16655Uyr A04;
    public C17676Vc7 A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131953829);
        r2.setIsLoading(this.A07);
        r2.Ets(this.A07);
    }

    public final String getModuleName() {
        return "promote_payments_interstitial_settings";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.E6c, androidx.fragment.app.Fragment, X.UsI] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1953150286);
        super.onCreate(bundle);
        this.A00 = AnonymousClass07i.A00(this);
        this.A01 = C13989Tnp.A0R(this);
        AnonymousClass0eM r6 = this.A08;
        this.A03 = AnonymousClass0kN.A02(DbT.A0X(r6));
        this.A02 = JTU.A0D(r6);
        0wc r9 = this.A03;
        if (r9 != null) {
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            BaseFragmentActivity baseFragmentActivity = this.A01;
            if (baseFragmentActivity == null) {
                str = "activity";
            } else {
                WGU wgu = this.A02;
                if (wgu == null) {
                    str = "promotedPostsLogger";
                } else {
                    String str2 = wgu.A03;
                    0qQ.A07(str2);
                    this.A05 = new C17676Vc7(baseFragmentActivity, r9, A0l, this, this, str2);
                    0wc r1 = this.A03;
                    if (r1 != null) {
                        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(r1, "fulcrum_event"), 154);
                        r2.A0l("fulcrum_nexus_entry");
                        r2.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "fulcrum_nexus");
                        r2.A0R("flow", "fulcrum_nexus_main");
                        r2.A0k("view");
                        r2.Cgf();
                        if (182.A06(0Tu.A06, DbT.A0X(r6), 36319596369747467L)) {
                            C18418VrN.A00(DbY.A0R(r6)).A00(new N49("AD_PAYMENTS", (String) null, 18));
                        }
                        AnonymousClass0fD.A09(-788502099, A022);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "logger";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1747215634);
        C16298UsI.super.onStart();
        this.A07 = true;
        ? r1 = this.A01;
        String str = "activity";
        if (r1 != 0) {
            C51970G9q.A12(r1);
            ? r4 = this.A01;
            if (r4 != 0) {
                AnonymousClass07i r3 = this.A00;
                if (r3 == null) {
                    str = "loaderManager";
                } else {
                    C18794W2b.A01(r4, r3, new C19182WOo(this, 5), AnonymousClass7TE.A0l(this.A08));
                    AnonymousClass0fD.A09(1689583736, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
