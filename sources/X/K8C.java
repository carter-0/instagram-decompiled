package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class K8C extends MYR implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C322776wO, C66517MUv {
    public static final String __redex_internal_original_name = "IGTVUploadSeriesSelectionFragment";
    public View A00;
    public K1C A01;
    public C61634KFk A02;
    public boolean A03 = true;
    public FragmentActivity A04;
    public C64720Lgx A05;
    public C3253572b A06;
    public final AnonymousClass0eM A07 = C66299MMi.A01(this, 18);
    public final AnonymousClass0eM A08 = C66299MMi.A00(this, new C66299MMi(this, 19), new C73666Phf(20, (Object) null, this), DbS.A0z(C60266JiN.class), 20);
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final AnonymousClass0eM A0A = C66299MMi.A00(this, new C66299MMi(this, 21), new C73666Phf(21, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 22);

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131976528);
        boolean z = true;
        r5.Eu4(true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131964096);
        A0K.A0G = LY6.A00(this, 31);
        View A0P = C51970G9q.A0P(A0K, r5);
        this.A00 = A0P;
        C61634KFk kFk = this.A02;
        if (kFk == null) {
            0qQ.A0F("seriesItemDefinition");
            throw AnonymousClass00P.createAndThrow();
        }
        if (kFk.A00 == JTT.A0W(this.A08).A01) {
            z = false;
        }
        LJB.A00(A0P, z);
    }

    public final String getModuleName() {
        return "igtv_upload_series_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.LZi] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = getRecyclerView();
        if (!this.A03) {
            0nA.A0e(recyclerView, 0);
        }
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        Context requireContext = requireContext();
        C3253572b r1 = new C3253572b();
        r1.A02 = R.drawable.instagram_play_outline_96;
        r1.A0D = requireContext.getString(2131964070);
        r1.A07 = requireContext.getString(2131964101);
        r1.A03 = C51968G9o.A04(requireContext);
        r1.A0C = requireContext.getString(2131964100);
        r1.A00 = 2Yu.A0F(requireContext, R.attr.backgroundColorSecondary);
        r1.A06 = this;
        this.A06 = r1;
        C63064Kqt.A00(this, new Object());
    }

    public static final List A00(K8C k8c) {
        C3253572b r2;
        C320156rr r1;
        K1C k1c = k8c.A01;
        if (k1c == null) {
            Context requireContext = k8c.requireContext();
            r2 = new C3253572b();
            r2.A00 = 2Yu.A00(requireContext);
            r1 = C320156rr.LOADING;
        } else if (k1c.A00.isEmpty()) {
            r2 = k8c.A06;
            if (r2 == null) {
                0qQ.A0F("emptyBindings");
                throw AnonymousClass00P.createAndThrow();
            }
            r1 = C320156rr.EMPTY;
        } else {
            List<C61292K1d> list = k1c.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C61292K1d lhi : list) {
                A0r.add(new C64766Lhi(lhi));
            }
            return 00k.A0T(new Object(), A0r);
        }
        return AnonymousClass7TE.A1I(new NPA(r2, r1));
    }

    public static final void A01(K8C k8c) {
        if (k8c.A03) {
            JTO.A0k(k8c.A0A).A04((AnonymousClass4DU) null, KT2.A00);
            return;
        }
        LJB.A01(k8c, new KTV(), AnonymousClass7TE.A0l(k8c.A09), C64092LMk.A06);
    }

    public final void A0C(int i, boolean z) {
        if (z) {
            notifyItemChanged(i);
        }
        View view = this.A00;
        if (view != null) {
            C61634KFk kFk = this.A02;
            if (kFk == null) {
                0qQ.A0F("seriesItemDefinition");
                throw AnonymousClass00P.createAndThrow();
            } else {
                LJB.A00(view, JTQ.A1O(kFk.A00, JTT.A0W(this.A08).A01));
            }
        }
    }

    public final boolean BCK() {
        int i = JTT.A0W(this.A08).A01;
        C61634KFk kFk = this.A02;
        if (kFk != null) {
            return JTQ.A1O(i, kFk.A00);
        }
        0qQ.A0F("seriesItemDefinition");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cxb() {
        if (this.A03) {
            C63299Kui.A00(this, this.A0A);
        }
    }

    public final void D92() {
        if (this.A03) {
            JTO.A0k(this.A0A).A04(this, KTO.A00);
        } else {
            DbT.A1I(this);
        }
    }

    public final Collection getDefinitions() {
        C61634KFk kFk = new C61634KFk(this, JTT.A0W(this.A08).A01);
        this.A02 = kFk;
        return JTT.A0s(kFk, new KFN(this));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MPA.A00(this, 39));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean onBackPressed() {
        C64720Lgx lgx = this.A05;
        if (lgx != null) {
            return lgx.onBackPressed();
        }
        0qQ.A0F("backHandlerDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DBy() {
        A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2080313402);
        K8C.super.onCreate(bundle);
        this.A03 = getActivity() instanceof IGTVUploadActivity;
        this.A05 = new C64720Lgx(requireContext(), this);
        this.A04 = requireActivity();
        AnonymousClass0fD.A09(1472328836, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1844203471);
        super.onResume();
        this.A01 = null;
        A0B(A00(this));
        AnonymousClass7TE.A1Z(new MH0(this, (AnonymousClass4D7) null, 32), DbV.A0J(this));
        AnonymousClass0eM r8 = this.A08;
        C64088LMg lMg = ((C60266JiN) r8.getValue()).A00;
        if (lMg != null) {
            C61292K1d k1d = new C61292K1d(C62573Ki6.SERIES, lMg.A02, lMg.A03);
            C61634KFk kFk = this.A02;
            if (kFk == null) {
                0qQ.A0F("seriesItemDefinition");
                throw AnonymousClass00P.createAndThrow();
            }
            int i = lMg.A01;
            int i2 = kFk.A00;
            kFk.A00 = i;
            kFk.A01 = k1d;
            kFk.A02.A0C(i2, JTQ.A1O(i2, -1));
            C60266JiN jiN = (C60266JiN) r8.getValue();
            C64088LMg lMg2 = jiN.A01;
            int i3 = lMg2.A01;
            if (i3 != -1) {
                lMg2 = new C64088LMg(i3 + 1, lMg2.A00, lMg2.A02, lMg2.A03);
            }
            jiN.A01 = lMg2;
            ((C60266JiN) r8.getValue()).A00 = null;
        }
        AnonymousClass0fD.A09(799319283, A022);
    }
}
