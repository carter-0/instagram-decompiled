package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class H26 extends C273374mT implements C249763kK, C229132mt, JOT {
    public static final String __redex_internal_original_name = "SaveToCollectionFragment";
    public int A00;
    public RecyclerView A01;
    public 1Xj A02;
    public AnonymousClass4DU A03;
    public C53078GiB A04;
    public IXC A05;
    public JT0 A06;
    public C54613HKw A07;
    public SpinnerImageView A08;
    public String A09;
    public String A0A;
    public int A0B;
    public C56561I1p A0C;

    public final void onViewCreated(View view, Bundle bundle) {
        List A3i;
        String str;
        super.onViewCreated(view, bundle);
        boolean z = false;
        1Xj r2 = this.A02;
        if (r2 != null) {
            z = Boolean.valueOf(I7Q.A09(getSession(), r2, this.A00));
        }
        C53078GiB giB = new C53078GiB(getContext(), this, this, z, I7Q.A08(getSession()));
        this.A04 = giB;
        if (this.A07.ordinal() != 1 || (str = this.A09) == null) {
            1Xj r0 = this.A02;
            if (r0 != null) {
                A3i = r0.A3i();
            } else {
                throw AnonymousClass7TE.A0z("mSelectionMode disallows mMedia or mCollectionIdViewing to be null");
            }
        } else {
            A3i = Collections.singletonList(str);
        }
        giB.A00 = A3i;
        RecyclerView A0I = DbT.A0I(view, R.id.collections_recycler_view);
        this.A01 = A0I;
        A0I.setAdapter(this.A04);
        DbV.A1A(getContext(), this.A01);
        RecyclerView recyclerView = this.A01;
        recyclerView.A15(new C3251871j(recyclerView.A0D, this, C3251771i.A08));
        int A022 = AnonymousClass7TG.A02(requireContext());
        this.A01.A11(new AnonymousClass3V7(A022, A022));
        this.A08 = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
        C53078GiB giB2 = this.A04;
        giB2.A06.clear();
        giB2.notifyDataSetChanged();
        this.A08.setLoadingStatus(C255943uy.LOADING);
        this.A05.A02(true, true);
        1Xj r22 = this.A02;
        if (r22 != null) {
            C267154b3.A00(view, this.A03, getSession(), r22);
        }
    }

    public final void ACw() {
        this.A05.A01();
    }

    public final void D4S(SavedCollection savedCollection) {
        if (this.A06 != null) {
            SavedCollection savedCollection2 = savedCollection;
            if (this.A07.ordinal() != 1) {
                1Xj r5 = this.A02;
                if (r5 != null) {
                    String str = savedCollection.A0F;
                    String str2 = C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION.A01;
                    C56561I1p i1p = this.A0C;
                    if (str == str2) {
                        int i = this.A00;
                        int i2 = this.A0B;
                        this.A04.getItemCount();
                        i1p.A01(this.mParentFragment, r5, i, i2);
                    } else {
                        int i3 = this.A00;
                        int i4 = this.A0B;
                        i1p.A02(this.mParentFragment, r5, savedCollection2, this.A09, i3, i4);
                    }
                }
                this.A06.APV();
            } else if (!TextUtils.isEmpty(this.A09) && !this.A09.equals(savedCollection.A0F)) {
                this.A06.Coi(savedCollection);
            }
        }
    }

    public final String getModuleName() {
        if (this.A07 == C54613HKw.MOVE_TO) {
            return "move_to_collection_tray";
        }
        return "save_to_collections_tray";
    }

    public final String getSessionId() {
        return requireArguments().getString("SaveToCollectionFragment.ARGS_SESSION_ID");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, X.H26, androidx.fragment.app.Fragment, X.4mT, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(108822075);
        H26.super.onCreate(bundle);
        this.A09 = requireArguments().getString("SaveToCollectionFragment.ARGS_COLLECTION_ID_VIEWING");
        this.A02 = 1E7.A00(getSession()).A02(requireArguments().getString("SaveToCollectionFragment.ARGS_MEDIA_ID"));
        this.A00 = requireArguments().getInt("SaveToCollectionFragment.ARGS_CAROUSEL_INDEX");
        this.A0A = requireArguments().getString("SaveToCollectionFragment.ARGS_NAVIGATION_TYPE");
        this.A03 = (AnonymousClass4DU) requireArguments().getParcelable("SaveToCollectionFragment.ARGS_PARENT_MODULE");
        this.A0B = requireArguments().getInt("SaveToCollectionFragment.ARGS_POSITION");
        this.A07 = (C54613HKw) requireArguments().getSerializable("SaveToCollectionFragment.ARGS_SELECTION_MODE");
        AnonymousClass4DU r4 = this.A03;
        UserSession session = getSession();
        C249763kK r1 = this;
        if (requireArguments().getString("SaveToCollectionFragment.ARGS_SESSION_ID") == null) {
            r1 = null;
        }
        this.A0C = new C56561I1p(this, session, r4, r1);
        List A002 = I7Q.A00(getSession(), this.A02, Arrays.asList(new C54665HMw[]{C54665HMw.MEDIA}), this.A00);
        this.A05 = new IXC(getContext(), AnonymousClass07i.A00(this), this, getSession(), new IXB(this, 2), A002, Collections.emptyList(), (Map) null);
        C54613HKw hKw = this.A07;
        if (hKw == null || ((hKw == C54613HKw.MOVE_TO && this.A09 == null) || (hKw == C54613HKw.SAVE_TO && this.A02 == null))) {
            JT0 jt0 = this.A06;
            if (jt0 != null) {
                jt0.APV();
            } else {
                DbX.A14(requireContext(), AnonymousClass37D.A00);
            }
        }
        AnonymousClass0fD.A09(-2041628461, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1869346370);
        H26.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0C2 = DbT.A0C(layoutInflater, (ViewGroup) null, R.layout.save_to_collection);
        AnonymousClass0fD.A09(-784843665, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(194162887);
        super.onDestroyView();
        this.A08 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-1344215562, A022);
    }
}
