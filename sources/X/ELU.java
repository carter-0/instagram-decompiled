package X;

import android.app.Activity;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccount;
import java.util.HashMap;
import java.util.List;

public final class ELU extends C49878FBc implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(ELU.class);
    public static final String __redex_internal_original_name = "FxCalControllerImpl";
    public 02m A00;
    public C50342FYz A01;
    public G7U A02;

    public final void A04(String str) {
        this.A05 = str;
        this.A06 = null;
        UserSession userSession = this.A07;
        DbS.A1Z(userSession);
        if (!A01(userSession)) {
            C50342FYz.A00(this.A01, "initial_async_controller_request_start", "", str, AnonymousClass7TE.A1E());
            this.A05 = str;
            11Z.A02(new C51205FqM(this));
        }
    }

    public final boolean A06(String str, List list) {
        String str2;
        0qQ.A0B(str, 0);
        UserSession userSession = this.A07;
        if (userSession instanceof UserSession) {
            UserSession userSession2 = userSession;
            boolean z = false;
            if (userSession2 != null) {
                this.A05 = str;
                this.A06 = list;
                FxCalAccount A012 = 2Lv.A00(userSession2).A01(A03, "ig_android_linking_cache_fx_internal");
                if (A012 == null || (str2 = A012.A07) == null || str2.length() == 0) {
                    z = true;
                    02m r2 = this.A00;
                    r2.markerStart(444800256);
                    r2.markerAnnotate(444800256, "entrypoint", str);
                    if (!A01(userSession2)) {
                        C50342FYz.A00(this.A01, "initial_async_controller_request_start", "", str, AnonymousClass7TE.A1E());
                        this.A05 = str;
                        11Z.A02(new C51205FqM(this));
                        return true;
                    }
                } else {
                    A05(str2);
                }
                return z;
            }
        }
        return false;
    }

    public static void A00(0lg r2, ELU elu, G7U g7u) {
        elu.A02 = g7u;
        elu.A01 = (C50342FYz) r2.A01(C50342FYz.class, new C73662Phb(r2, 19));
        SparseArray sparseArray = new SparseArray();
        elu.A02 = sparseArray;
        sparseArray.put(R.id.fx_linking_unified_launcher, elu);
        elu.A00 = 02m.A0p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (X.F5u.A01(r5.A01, true) == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(com.instagram.common.session.UserSession r7) {
        /*
            r6 = this;
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318707311450513(0x8107ac00001991, double:3.0314349752327564E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r2 = 0
            if (r0 == 0) goto L_0x00d6
            X.0qQ.A0B(r7, r2)
            r0 = 13
            X.Phb r1 = new X.Phb
            r1.<init>(r7, r0)
            java.lang.Class<X.G4l> r0 = X.C51853G4l.class
            java.lang.Object r5 = r7.A01(r0, r1)
            X.G4l r5 = (X.C51853G4l) r5
            androidx.fragment.app.Fragment r0 = r6.A04
            if (r0 == 0) goto L_0x00c0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
        L_0x0028:
            X.Eyy r1 = new X.Eyy
            r1.<init>(r0, r6)
            r5.A02 = r1
            android.app.Activity r0 = r1.A00
            X.0qQ.A0B(r0, r2)
            r5.A00 = r0
            android.view.Window r0 = r0.getWindow()
            X.0qQ.A07(r0)
            r5.A01 = r0
            X.FYz r4 = r5.A02
            java.lang.String r3 = r5.A01()
            r5.A00()
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "initial_async_controller_request_start"
            java.lang.String r0 = ""
            X.C50342FYz.A00(r4, r1, r0, r3, r2)
            java.lang.String r1 = r5.A01()
            java.lang.String r0 = "ig_interop"
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 != 0) goto L_0x0069
            com.instagram.common.session.UserSession r0 = r5.A01
            boolean r0 = X.F5u.A01(r0, r4)
            r3 = 1
            if (r0 != 0) goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            X.02m r2 = r5.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "show_loading_state"
            r2.markerPoint(r1, r0)
            X.1ZF r2 = X.C48916EmG.A00()
            android.app.Activity r1 = r5.A00
            if (r1 == 0) goto L_0x00c9
            android.view.Window r0 = r5.A01
            if (r0 == 0) goto L_0x00cc
            r2.A00(r1, r0, r4, r3)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r0 = 2131433345(0x7f0b1781, float:1.8488473E38)
            r3.put(r0, r5)
            com.instagram.common.session.UserSession r2 = r5.A01
            android.app.Activity r1 = r5.A00
            if (r1 == 0) goto L_0x00c9
            X.DbS.A1X(r1)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0xG r0 = X.C51853G4l.A03
            X.2nI r3 = X.C229382nI.A01(r3, r1, r0, r2)
            java.lang.String r0 = r5.A00()
            X.FBO r2 = new X.FBO
            r2.<init>(r0)
            X.Eyy r0 = r5.A02
            if (r0 == 0) goto L_0x00c6
            java.util.Map r0 = r0.A03
            r2.A04 = r0
            r1 = 7
            X.FVR r0 = new X.FVR
            r0.<init>(r5, r1)
            r2.A02 = r0
            android.app.Activity r0 = r5.A00
            if (r0 == 0) goto L_0x00c9
            r2.A01(r0, r3)
            return r4
        L_0x00c0:
            android.app.Activity r0 = r6.A00
            if (r0 == 0) goto L_0x00d6
            goto L_0x0028
        L_0x00c6:
            java.lang.String r0 = "unifiedLauncherFlowConfig"
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r0 = "activity"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r0 = "window"
        L_0x00ce:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELU.A01(com.instagram.common.session.UserSession):boolean");
    }

    public ELU(Activity activity, 0lg r2, G7U g7u) {
        super(activity, r2);
        A00(r2, this, g7u);
    }

    public final void A03() {
        super.A03();
        this.A00.markerPoint(444800256, "hide_loading_state");
    }

    public final void A05(String str) {
        int length = str.length();
        C50342FYz fYz = this.A01;
        String str2 = this.A05;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (length == 0) {
            C50342FYz.A00(fYz, "client_flow_failed", "Client Flow Interrupted", str2, A1E);
            this.A02.onAuthorizeFail();
            return;
        }
        C50342FYz.A00(fYz, "client_flow_succeeded", "", str2, A1E);
        this.A02.onAuthorizeSuccess(str, this.A05);
    }

    public ELU(Fragment fragment, 0lg r2, G7U g7u) {
        super(fragment, r2);
        A00(r2, this, g7u);
    }
}
