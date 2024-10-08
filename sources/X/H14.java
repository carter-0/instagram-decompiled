package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class H14 extends AnonymousClass4DH implements C229132mt, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SaveSelectCollectionFragment";
    public C53070Gi3 A00;
    public RecyclerView A01;
    public C3251871j A02;
    public IXC A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final List A05 = 0sr.A1P(new C54665HMw[]{C54665HMw.ALL_MEDIA_AUTO_COLLECTION, C54665HMw.MEDIA});

    public final String getModuleName() {
        return "save_collection_picker_dropdown";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        C53070Gi3 gi3 = this.A00;
        if (gi3 == null) {
            str = "adapter";
        } else {
            recyclerView.setAdapter(gi3);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setItemAnimator((AnonymousClass3AS) null);
            this.A01 = recyclerView;
            C3251871j r2 = new C3251871j(linearLayoutManager, this, C3251771i.A0A, false, false);
            this.A02 = r2;
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.A15(r2);
            }
            IXC ixc = this.A03;
            if (ixc == null) {
                str = "savedCollectionsFetcher";
            } else {
                ixc.A02(true, true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ACw() {
        IXC ixc = this.A03;
        if (ixc == null) {
            0qQ.A0F("savedCollectionsFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ixc.A01();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131972593);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.H14] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2081717735);
        H14.super.onCreate(bundle);
        IXB ixb = new IXB(this, 1);
        Context requireContext = requireContext();
        AnonymousClass0eM r1 = this.A04;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        this.A03 = new IXC(requireContext, AnonymousClass07i.A00(this), this, A0l, ixb, this.A05, 03t.A0J(HMU.values()), (Map) null);
        this.A00 = new C53070Gi3(this, AnonymousClass7TE.A0l(r1), this);
        AnonymousClass0fD.A09(1771371103, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-56212983);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_save_select_collection_list, false);
        AnonymousClass0fD.A09(1046441675, A022);
        return A0D;
    }

    public final void onDestroyView() {
        RecyclerView recyclerView;
        int A022 = AnonymousClass0fD.A02(-273932552);
        super.onDestroyView();
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((2Rw) null);
            recyclerView2.setLayoutManager((C252553pI) null);
        }
        C3251871j r1 = this.A02;
        if (!(r1 == null || (recyclerView = this.A01) == null)) {
            recyclerView.A16(r1);
        }
        this.A02 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-1019277215, A022);
    }
}
