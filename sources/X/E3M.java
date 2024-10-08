package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.List;

public final class E3M extends AnonymousClass4DH implements C227272iw {
    public static final String __redex_internal_original_name = "DirectPhoneContactsFragment";
    public RecyclerView A00;
    public C46826Dm2 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final boolean A03 = true;

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, DbT.A06(this, r3, 0).getString(2131972278));
    }

    public final String getModuleName() {
        return "direct_phone_contacts_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r5 = this.A02;
        0lg A0L = AnonymousClass7TF.A0L(r5, 0);
        List list = ((C50321FYb) A0L.A01(C50321FYb.class, new C67570Mq4(A0L, 49))).A00;
        this.A01 = new C46826Dm2(requireContext(), AnonymousClass7TE.A0l(r5), list);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AnonymousClass7TF.A0F(view, R.id.search_box);
        igdsInlineSearchBox.setSearchGlyphColor(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_secondary_text));
        igdsInlineSearchBox.setTextsize((float) DbV.A05(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        igdsInlineSearchBox.setImeOptions(6);
        igdsInlineSearchBox.A02 = new Fd1(this, 4);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView A0I = DbT.A0I(view, R.id.direct_phone_contacts_recycler_view);
        this.A00 = A0I;
        String str = "recyclerView";
        if (A0I != null) {
            A0I.setItemAnimator((AnonymousClass3AS) null);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 != null) {
                    C46826Dm2 dm2 = this.A01;
                    if (dm2 == null) {
                        str = "adapter";
                    } else {
                        recyclerView2.setAdapter(dm2);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean COC() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-722174587);
        E3M.super.onCreate(bundle);
        AnonymousClass0fD.A09(1508120717, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-891835706);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_share_contacts, viewGroup, false);
        AnonymousClass0fD.A09(-652804683, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1521612394);
        super.onDestroy();
        AnonymousClass0fD.A09(1420851555, A022);
    }
}
