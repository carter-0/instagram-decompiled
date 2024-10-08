package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.google.android.gms.common.api.Status;
import com.instagram.common.session.UserSession;
import com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Pfk  reason: case insensitive filesystem */
public final class C73563Pfk extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73563Pfk(Context context, AnonymousClass4DH r3, UserSession userSession, C63768L6a l6a, LEH leh, ReelDashboardFragment reelDashboardFragment, AnonymousClass4D7 r8, boolean z) {
        super(2, r8);
        this.A08 = userSession;
        this.A03 = context;
        this.A06 = leh;
        this.A07 = l6a;
        this.A05 = r3;
        this.A04 = reelDashboardFragment;
        this.A09 = z;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Pfk, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r19) {
        AnonymousClass4D7 r7 = r19;
        if (this.A02 != 0) {
            Context context = (Context) this.A03;
            C63768L6a l6a = (C63768L6a) this.A07;
            C73563Pfk pfk = new C73563Pfk(context, (AnonymousClass4DH) this.A05, (UserSession) this.A08, l6a, (LEH) this.A06, (ReelDashboardFragment) this.A04, r7, this.A09);
            pfk.A01 = obj;
            return pfk;
        }
        Fragment fragment = (Fragment) this.A03;
        return new C73563Pfk((View) this.A08, fragment, (GoogleAuthController) this.A04, (OJS) this.A01, r7, (C62320sa) this.A06, (0sP) this.A07, (0sP) this.A05, this.A09);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.Pfk, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Runnable paG;
        if (this.A02 != 0) {
            1Hj r2 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                UserSession userSession = (UserSession) this.A08;
                MG8 mg8 = new MG8(userSession, (AnonymousClass4D7) null, 31);
                19B r1 = 19B.A00;
                1Eo.A01(AnonymousClass05K.A00, r1, mg8, (C262224Cq) this.A01);
                AnonymousClass4CZ r0 = AnonymousClass12W.A02;
                AnonymousClass134 r02 = AnonymousClass12y.A00;
                C63768L6a l6a = (C63768L6a) this.A07;
                FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2 fxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2 = new FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2((Context) this.A03, (AnonymousClass4DH) this.A05, userSession, l6a, (LEH) this.A06, (ReelDashboardFragment) this.A04, (AnonymousClass4D7) null, this.A09);
                this.A00 = 1;
                if (1Eo.A00(this, r02, fxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2) == r2) {
                    return r2;
                }
            }
        } else {
            1Hj r22 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                FragmentActivity A0E = DbT.A0E(this.A03);
                this.A00 = 1;
                obj = ((GoogleAuthController) this.A04).A08(A0E, this, true);
                if (obj == r22) {
                    return r22;
                }
            }
            C69551Nnv nnv = (C69551Nnv) obj;
            C62320sa r5 = (C62320sa) this.A06;
            View view = (View) this.A08;
            0sP r12 = (0sP) this.A07;
            OJS ojs = (OJS) this.A01;
            Fragment fragment = (Fragment) this.A03;
            GoogleAuthController googleAuthController = (GoogleAuthController) this.A04;
            boolean z = this.A09;
            0sP r4 = (0sP) this.A05;
            if (nnv instanceof N05) {
                r4.invoke(((C70402O5e) ((N05) nnv).A00).A00);
            } else if (nnv instanceof N04) {
                C74223PrB prB = (C74223PrB) ((N04) nnv).A00;
                if (0qQ.A0K(prB, C71599Ona.A00)) {
                    r5.invoke();
                } else if (N4v.A00(1, prB)) {
                    if (view != null) {
                        view.post(new C73381Pbe(fragment, prB, googleAuthController, ojs, z));
                    }
                    r12.invoke(prB);
                } else {
                    if (N4v.A00(0, prB)) {
                        if (((RKT) ((N4v) prB).A01).A00.A00 == 7) {
                            if (view != null) {
                                paG = new C73294PaF(fragment, prB, r12);
                            }
                        } else if (view != null) {
                            paG = new C73353PbC(fragment, prB, r12, z);
                        }
                    } else if (0qQ.A0K(prB, C71595OnW.A00)) {
                        N4v n4v = new N4v(new RKT(new Status(5, (String) null)));
                        if (view != null) {
                            paG = new C73354PbD(fragment, n4v, r12, z);
                        }
                    } else if (0qQ.A0K(prB, C71593OnU.A00) || 0qQ.A0K(prB, C71594OnV.A00) || 0qQ.A0K(prB, C71597OnY.A00) || 0qQ.A0K(prB, C71598OnZ.A00) || (prB instanceof N4u)) {
                        if (view != null) {
                            paG = new C73295PaG(fragment, prB, r12);
                        }
                    } else if (!0qQ.A0K(prB, C71596OnX.A00)) {
                        throw AnonymousClass7TE.A1K();
                    }
                    view.post(paG);
                }
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73563Pfk) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73563Pfk(View view, Fragment fragment, GoogleAuthController googleAuthController, OJS ojs, AnonymousClass4D7 r6, C62320sa r7, 0sP r8, 0sP r9, boolean z) {
        super(2, r6);
        this.A04 = googleAuthController;
        this.A03 = fragment;
        this.A06 = r7;
        this.A08 = view;
        this.A07 = r8;
        this.A01 = ojs;
        this.A09 = z;
        this.A05 = r9;
    }
}
