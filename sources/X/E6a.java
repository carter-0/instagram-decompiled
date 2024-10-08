package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;

public final class E6a extends AnonymousClass32G implements AnonymousClass32I, C227272iw, AnonymousClass32K {
    public static final AnonymousClass3BQ A08 = AnonymousClass3BQ.FEATURED_USER;
    public static final String __redex_internal_original_name = "FeaturedUserFragment";
    public AnonymousClass32A A00;
    public AnonymousClass6VJ A01;
    public C47587E8z A02;
    public String A03;
    public AnonymousClass7Q8 A04;
    public final String A05 = "featured_user";
    public final String A06 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final C358248ab ALt(C358248ab r2) {
        0qQ.A0B(r2, 0);
        r2.A0l(this, DbT.A0X(this.A07));
        return r2;
    }

    public final void D33(SparseArray sparseArray, Integer num) {
    }

    public final void D34() {
    }

    public final void D35() {
    }

    public final void D37(SparseArray sparseArray) {
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131968280);
        r3.AA9(FP4.A00(this, 32), 2131960992);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A07);
    }

    public final boolean COC() {
        return false;
    }

    public final void D36() {
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0N = DbX.A0N(requireActivity(), this.A07);
            A0N.A0B((Bundle) null, FC6.A00().A00().A01("featured_user", getString(2131960850)));
            A0N.A04();
        }
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-698205107);
        E6a.super.onCreate(bundle);
        this.A03 = C320236s2.A01(requireArguments(), "FeaturedUserFragment.EXTRA_USER_NAME");
        Context requireContext = requireContext();
        AnonymousClass0eM r5 = this.A07;
        C47587E8z e8z = new C47587E8z(requireContext, this, AnonymousClass7TE.A0l(r5), this, new ELS(requireActivity(), AnonymousClass7TE.A0l(r5), this), this, this);
        this.A02 = e8z;
        A0V(e8z);
        Context requireContext2 = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        C47587E8z e8z2 = this.A02;
        if (e8z2 == null) {
            str = "adapter";
        } else {
            AnonymousClass7Q8 r0 = new AnonymousClass7Q8(requireContext2, A0l, e8z2);
            r0.A00();
            this.A04 = r0;
            0lg A0X = DbT.A0X(r5);
            String str2 = this.A03;
            if (str2 == null) {
                str = "displayedUsername";
            } else {
                1NY A0M = DbZ.A0M(A0X);
                A0M.A0A("users/featureduserinfo/");
                A0M.A9m(Dbe.A01(), str2);
                1OC A0S = DbU.A0S(A0M, DwA.class, C49808F7v.class);
                C47696EDf.A01(A0S, this, 43);
                schedule(A0S);
                AnonymousClass0fD.A09(1640839962, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(546112510);
        AnonymousClass7Q8 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-942477433, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(668062226);
        super.onResume();
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (A062 != null && A062.A0Z() && A062.A0H == A08) {
            A062.A0X(this);
        }
        AnonymousClass0fD.A09(969644138, A022);
    }
}
