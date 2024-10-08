package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class R8I extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IGMerchantLoyaltyListFragment";
    public C273694n2 A00;
    public QD1 A01;
    public FrameLayout A02;
    public C229382nI A03;
    public AnonymousClass6NS A04;
    public 2el A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return "merchant_loyalty_list_fragment";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.R8I, X.4DQ, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.merchant_loyalty_container);
        this.A02 = frameLayout;
        this.A00 = new C273694n2(requireContext());
        2el r2 = this.A05;
        if (r2 == null) {
            str = "viewpointManager";
        } else {
            r2.A08(frameLayout, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
            QD1 qd1 = this.A01;
            if (qd1 != null) {
                C51969G9p.A15(this, qd1.A00, new J6H(this, 3), 15);
                QD1 qd12 = this.A01;
                if (qd12 != null) {
                    A00((C361088fe) qd12.A00.A02(), this);
                    return;
                }
            }
            str = "igViewModel";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C361088fe r4, R8I r8i) {
        FrameLayout frameLayout;
        if (r4 != null && (frameLayout = r8i.A02) != null) {
            frameLayout.setVisibility(0);
            AnonymousClass6NS r0 = r8i.A04;
            frameLayout.removeAllViews();
            if (r0 != null) {
                r0.A04();
            }
            Context requireContext = r8i.requireContext();
            C3034368u r1 = r4.A00;
            C229382nI r02 = r8i.A03;
            if (r02 == null) {
                0qQ.A0F("igBloksHost");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass6NS A002 = AnonymousClass6NS.A00(requireContext, r1, r02).A00();
            r8i.A04 = A002;
            C273694n2 r03 = r8i.A00;
            if (r03 != null) {
                A002.A07(r03);
                if (frameLayout.getChildCount() == 0) {
                    frameLayout.addView(A002.A00);
                    return;
                }
                throw AnonymousClass7TE.A0z("Trying to add root Bloks Hosting Component but already a root view present");
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.R8I, X.07g, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1659153280);
        R8I.super.onCreate(bundle);
        this.A06 = C320236s2.A01(requireArguments(), "sessionId");
        this.A05 = 2el.A00();
        0lg A0X = DbT.A0X(this.A07);
        2el r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = C229382nI.A03(this, A0X, r0);
        QD1 A002 = SRV.A00(this).A00(QD1.class);
        0qQ.A0C(A002, "null cannot be cast to non-null type com.fbpay.hub.merchantloyalty.vm.MerchantLoyaltyViewModel<com.instagram.bloks.util.IgBloksRequestTask.BloksParseResultResponse>");
        this.A01 = A002;
        AnonymousClass0fD.A09(-54980623, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1756449573);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_merchant_loyalty_list_section, viewGroup, false);
        AnonymousClass0fD.A09(-1572799843, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(1643479786);
        super.onResume();
        QD1 qd1 = this.A01;
        if (qd1 == null) {
            str = "igViewModel";
        } else {
            requireContext();
            String str2 = this.A06;
            if (str2 == null) {
                str = "sessionId";
            } else {
                SEL sel = qd1.A02;
                Map A0w = AnonymousClass7TF.A0w("logging_session_id", str2);
                R8c r8c = new R8c(sel);
                UserSession userSession = sel.A01;
                0qQ.A0B(userSession, 0);
                C360678ey A012 = C359988do.A01((AnonymousClass1O9) null, userSession, "com.bloks.www.fbpay.merchant_loyalty_list", (String) null, A0w, 0, 0, false);
                A012.A00(r8c);
                1ES.A03(A012);
                AnonymousClass0fD.A09(1465279899, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
