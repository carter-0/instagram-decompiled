package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.List;

public final class K5F extends AnonymousClass4DH implements C66531MVj, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PartnershipLabelAndAdsFragment";
    public BrandedContentGatingInfoIntf A00;
    public BrandedContentProjectMetadataIntf A01;
    public List A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(MMG.A00(this, 34));
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(MMG.A00(this, 37));
    public final AnonymousClass0eM A09;
    public final 1wn A0A;

    public final void Cu0() {
    }

    public final void Cu1() {
    }

    public final boolean CuC(boolean z) {
        return false;
    }

    public final boolean Cv5(boolean z) {
        return false;
    }

    public final void DOk(View view) {
    }

    public final void DS8(View view) {
    }

    public final boolean Dil() {
        return false;
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969192);
        r2.Etr(AnonymousClass7TF.A1Z(this.A08));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0F = DbZ.A0F(view, R.id.recycler_view);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new KFC(this));
        A0S.A01(new Object());
        AnonymousClass0eM r2 = this.A07;
        AnonymousClass2t9 A0U = DbU.A0U(A0S, new EG1(this, AnonymousClass7TE.A0l(r2)));
        A0F.setAdapter(A0U);
        DbU.A15(getContext(), A0F, 1, false);
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        A0F.setItemAnimator(r0);
        C60236Jht jht = (C60236Jht) this.A09.getValue();
        jht.A00 = AnonymousClass7TF.A1Z(this.A04);
        r2.getValue();
        List list = this.A02;
        if (list == null) {
            0qQ.A0F("brandedContentTags");
            throw AnonymousClass00P.createAndThrow();
        }
        jht.A00(LSV.A00(requireContext(), this.A01, list, this.A03));
        Dba.A16(getViewLifecycleOwner(), jht.A01, new C58728Iwb(A0U, 21), 46);
        Dba.A16(getViewLifecycleOwner(), DbT.A0G(jht.A04), new C58728Iwb(this, 22), 46);
    }

    public final boolean Cts(boolean z) {
        C60236Jht jht = (C60236Jht) this.A09.getValue();
        this.A07.getValue();
        List list = this.A02;
        if (list == null) {
            0qQ.A0F("brandedContentTags");
            throw AnonymousClass00P.createAndThrow();
        }
        String A002 = LSV.A00(requireContext(), this.A01, list, this.A03);
        jht.A00 = z;
        jht.A00(A002);
        AnonymousClass1Nd.A00(jht.A02).A00(new Lg8(z));
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public K5F() {
        MMG A002 = MMG.A00(this, 41);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMG.A00(MMG.A00(this, 38), 39));
        this.A09 = DbS.A0I(MMG.A00(A003, 40), A002, new C58716IwP(46, (Object) null, (Object) A003), DbS.A0z(C60236Jht.class));
        this.A06 = AnonymousClass1YB.A00(MMG.A00(this, 36));
        this.A05 = AnonymousClass1YB.A00(MMG.A00(this, 35));
        this.A0A = C64698LgT.A00(this, 3);
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        Object parcelable;
        Object parcelable2;
        int A022 = AnonymousClass0fD.A02(182751987);
        K5F.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("argument_is_paid_partnership_label");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableArrayList = requireArguments.getParcelableArrayList("argument_bc_tag_list", BrandedContentTag.class);
        } else {
            parcelableArrayList = requireArguments.getParcelableArrayList("argument_bc_tag_list");
        }
        this.A02 = JTT.A0t(parcelableArrayList);
        if (i >= 33) {
            parcelable = requireArguments.getParcelable("argument_bc_project_metadata", BrandedContentProjectMetadata.class);
        } else {
            parcelable = requireArguments.getParcelable("argument_bc_project_metadata");
        }
        this.A01 = (BrandedContentProjectMetadataIntf) parcelable;
        if (i >= 33) {
            parcelable2 = requireArguments.getParcelable("argument_bc_gating_info", BrandedContentGatingInfo.class);
        } else {
            parcelable2 = requireArguments.getParcelable("argument_bc_gating_info");
        }
        this.A00 = (BrandedContentGatingInfo) parcelable2;
        DbX.A0R(this.A07).A01(this.A0A, C64679Lg6.class);
        AnonymousClass0fD.A09(774617613, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-757940451);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_recyclerview, false);
        AnonymousClass0fD.A09(1729966750, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1072051628);
        super.onDestroy();
        DbX.A0R(this.A07).A02(this.A0A, C64679Lg6.class);
        AnonymousClass0fD.A09(-2026833886, A022);
    }
}
