package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.E2p  reason: case insensitive filesystem */
public final class C47443E2p extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PublisherControlFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = C51791G2a.A00(this, 47);
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131963687);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        DbY.A16(this, recyclerView);
        Dba.A17(recyclerView, this.A01);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59703JUk((Object) r2, (Object) this, (Object) viewLifecycleOwner, (Object) recyclerView, (Object) findViewById, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C47443E2p() {
        C51802G2l g2l = new C51802G2l((Object) this, 1);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 48), 49));
        this.A02 = DbS.A0I(new C51802G2l((Object) A002, 0), g2l, new MJ4(5, (Object) null, A002), DbS.A0z(C46758Dkl.class));
    }

    public static final void A00(C47443E2p e2p, List list, List list2, int i) {
        String quantityString;
        int size = list2.size();
        if (size <= 5) {
            quantityString = DbT.A0z(", ", list2, (0sP) null);
        } else {
            int i2 = size - 5;
            quantityString = DbV.A05(e2p).getQuantityString(i, i2, new Object[]{AnonymousClass7TE.A13(list2), list2.get(1), list2.get(2), list2.get(3), list2.get(4), Integer.valueOf(i2)});
        }
        list.add(new C65484Lu8(quantityString, R.style.control_option_title_text));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.E2p, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1314368080);
        C47443E2p.super.onCreate(bundle);
        getParentFragmentManager().A0v(new C50129FQm(this, 7), this, "BLOCKLIST_FRAGMENT_REQUEST_KEY");
        AnonymousClass0fD.A09(393284472, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1341733881);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_blocklist, false);
        AnonymousClass0fD.A09(-1385716381, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2086751964);
        super.onDestroy();
        getParentFragmentManager().A0x("BLOCKLIST_FRAGMENT_REQUEST_KEY");
        AnonymousClass0fD.A09(-34427244, A022);
    }
}
