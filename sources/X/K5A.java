package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class K5A extends AnonymousClass4DH implements AnonymousClass4DS, MXF {
    public static final String __redex_internal_original_name = "MediaKitReOrderFragment";
    public RecyclerView A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new MMD(this, 44));
    public final AnonymousClass0eM A02 = MMD.A00(this, 45);
    public final AnonymousClass0eM A03 = DbS.A0I(new MMD(this, 48), new MMD(this, 47), MMW.A00((Object) null, this, 19), DbS.A0z(C60327JjW.class));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A06 = MMD.A00(this, 46);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.ErN(DbV.A05(this).getString(2131966636));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131960992);
        DbX.A19(LY6.A00(this, 64), A0K, r3);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbX.A0K(view);
        C355568Qm r1 = (C355568Qm) this.A02.getValue();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            r1.A0A(recyclerView);
            AnonymousClass0eM r4 = this.A01;
            C60389Jki jki = (C60389Jki) r4.getValue();
            ArrayList arrayList = this.A05;
            0qQ.A0B(arrayList, 0);
            ArrayList arrayList2 = jki.A01;
            int size = arrayList2.size();
            arrayList2.addAll(arrayList);
            jki.notifyItemRangeInserted(size, arrayList.size());
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                Dba.A17(recyclerView2, r4);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final LDW BO3() {
        return (LDW) this.A06.getValue();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1376489043);
        K5A.super.onCreate(bundle);
        this.A05.addAll(JTT.A0a(this.A03).A07.A02.A04);
        AnonymousClass0fD.A09(189721713, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-820018382);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_simple_recycler_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-114799839, A022);
        return inflate;
    }
}
