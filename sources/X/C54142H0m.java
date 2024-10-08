package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H0m  reason: case insensitive filesystem */
public final class C54142H0m extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "CreatorAIReadyFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return "creator_ai_preparation_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 15), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C54142H0m r5) {
        /*
            X.0eM r4 = r5.A01
            java.lang.String r0 = X.DbS.A0t(r4)
            if (r0 == 0) goto L_0x000f
            int r0 = r0.length()
            r2 = 0
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            X.0eM r1 = r5.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            if (r2 == 0) goto L_0x002b
            X.F3E r2 = new X.F3E
            r2.<init>(r0, r3)
            java.lang.String r1 = X.DbU.A0u(r1)
            X.IQc r0 = X.C57139IQc.A00
            r2.A00(r5, r0, r1)
            return
        L_0x002b:
            X.F3E r1 = new X.F3E
            r1.<init>(r0, r3)
            java.lang.String r0 = X.DbS.A0t(r4)
            r1.A01(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54142H0m.A00(X.H0m):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        if (((C59671JTb) ((H2Z) this.A03.getValue()).A03.getValue()).A00) {
            return false;
        }
        A00(this);
        return true;
    }

    public C54142H0m() {
        0eO r2 = 0eO.A02;
        this.A01 = C51975G9x.A0r(this, "sandbox_thread_igid", r2, 35);
        C58358Iqd iqd = C58358Iqd.A00;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, C58702IwB.A01(C58702IwB.A01(this, 4), 5));
        this.A03 = DbS.A0I(C58702IwB.A01(A002, 6), iqd, new C58689Ivy(17, A002, (Object) null), DbS.A0z(H2Z.class));
        this.A00 = C58702IwB.A00(this, 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1084678742);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 30), 326071867);
        AnonymousClass0fD.A09(1367364797, A022);
        return A0H;
    }
}
