package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class E12 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ChannelsListFragment";
    public AnonymousClass2t9 A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "channels_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.channels_list);
        this.A00 = DbU.A0U(DbV.A0S(this), new EGF(this, this, (0sK) null, requireContext().getColor(R.color.fds_transparent)));
        DbU.A15(requireContext(), recyclerView, 1, false);
        Dba.A15(getViewLifecycleOwner(), DbT.A0G(((C46751Dke) this.A02.getValue()).A02), new C74191PqX(30, (Object) recyclerView, (Object) this), 23);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public E12() {
        C41655Ay7 ay7 = new C41655Ay7(this, 9);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C41655Ay7(new C41655Ay7(this, 6), 7));
        this.A02 = DbS.A0I(new C41655Ay7(A002, 8), ay7, new C73664Phd(32, A002, (Object) null), DbS.A0z(C46751Dke.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1234067214);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_channels_fragment, false);
        AnonymousClass0fD.A09(1597316329, A022);
        return A0D;
    }
}
