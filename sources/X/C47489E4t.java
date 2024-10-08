package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.E4t  reason: case insensitive filesystem */
public class C47489E4t extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C254093rv {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBloksFragment";
    public ViewGroup A00;
    public AnonymousClass6NS A01;
    public QuickPromotionSlot A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass4UC A05;
    public C231002qi A06;
    public boolean A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final C231002qi A00() {
        if (this instanceof C47980EPm) {
            Bundle requireArguments = requireArguments();
            UserSession A0U = DbS.A0U(requireArguments);
            String string = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT");
            if (string == null) {
                string = AnonymousClass000.A00(2355);
            }
            return new C47978EPk(this, this, A0U, QuickPromotionSlot.valueOf(string));
        }
        UserSession A0l = AnonymousClass7TE.A0l(this.A08);
        QuickPromotionSlot quickPromotionSlot = this.A02;
        if (A0l == null || quickPromotionSlot == null) {
            return null;
        }
        Handler A0D = AnonymousClass7TF.A0D();
        1YN A002 = AnonymousClass2bO.A00();
        AnonymousClass2bO.A00();
        return A002.A01(this, this, A0l, 2bV.A08(new C50737Fhc(2, A0D, this)), quickPromotionSlot);
    }

    public String getModuleName() {
        return "quick promotion";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass4UC r6;
        C229382nI r4;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C231002qi r5 = this.A06;
        if (r5 != null && (r6 = this.A05) != null && (r4 = (C229382nI) r5.A02.getValue()) != null) {
            r4.A01.put(R.id.bloks_action_listener, new C49599EzI(requireContext(), r4, r5, r6, this, (Map) null));
        }
    }

    public final void DJV(AnonymousClass6NS r3, C49599EzI ezI) {
        this.A01 = r3;
        AnonymousClass4UC r1 = this.A05;
        if (r1 != null) {
            C231002qi A002 = A00();
            if (A002 != null) {
                A002.DbK(r1);
            }
            C273694n2 r12 = new C273694n2(requireContext());
            AnonymousClass6NS r0 = this.A01;
            if (r0 != null) {
                r0.A07(r12);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.addView(r12);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final boolean onBackPressed() {
        AnonymousClass4UC r1;
        C231002qi r0;
        if (this instanceof C47980EPm) {
            return false;
        }
        if (!(!this.A07 || (r1 = this.A05) == null || (r0 = this.A06) == null)) {
            r0.DbJ(r1);
        }
        return !this.A07;
    }

    public final void DOJ(String str) {
        if (isAdded()) {
            DbT.A1I(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass4UC r1;
        int A022 = AnonymousClass0fD.A02(1331936430);
        C47489E4t.super.onCreate(bundle);
        Dbb.A1M(this);
        Bundle requireArguments = requireArguments();
        this.A02 = QuickPromotionSlot.valueOf(C320236s2.A01(requireArguments, "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"));
        UserSession A0l = AnonymousClass7TE.A0l(this.A08);
        String string = requireArguments.getString("QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION");
        if (!(string == null || string.length() == 0)) {
            try {
                r1 = AnonymousClass4V6.parseFromJson(16P.A00(string));
                if (r1 != null) {
                    this.A07 = AnonymousClass7TF.A1V(r1.A08.A00);
                    this.A05 = r1;
                    this.A06 = A00();
                    AnonymousClass0fD.A09(-1000319115, A022);
                }
            } catch (IOException e) {
                C46436Dey.A00(A0l, AnonymousClass05K.A0N, "Error parsing fullscreen bloks interstitial promotion", e);
            }
        }
        r1 = null;
        this.A05 = r1;
        this.A06 = A00();
        AnonymousClass0fD.A09(-1000319115, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2121546853);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        if (inflate != null) {
            this.A00 = DbS.A0E(inflate, R.id.bloks_container);
        } else {
            inflate = null;
        }
        AnonymousClass0fD.A09(-1305749622, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1807098315);
        AnonymousClass6NS r0 = this.A01;
        if (r0 != null) {
            r0.A04();
        }
        this.A01 = null;
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(333408857, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1489650485);
        super.onResume();
        if (this.A05 == null || this.A04) {
            if (isAdded()) {
                DbT.A1I(this);
            }
            this.A03 = true;
        }
        AnonymousClass0fD.A09(151990368, A022);
    }

    public final void configureActionBar(2da r1) {
        Dba.A1G(r1);
    }
}
