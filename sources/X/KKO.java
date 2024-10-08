package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KKO extends K5K implements C66442MRw {
    public static final String __redex_internal_original_name = "ShowAllAlbumsFragment";
    public RecyclerView A00;
    public KKL A01;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        int dimensionPixelOffset = DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A00 = DbZ.A0F(view, R.id.albums_recyclerview);
        int A012 = (AnonymousClass0nB.A01(requireContext()) - (dimensionPixelOffset * 3)) / 2;
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        C60321JjQ jjQ = this.A00;
        if (jjQ != null) {
            C53368Gms gms = new C53368Gms(A012, A012, 8);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                KKL kkl = new KKL(gms, A0l, new C59948JcE(recyclerView, this), jjQ);
                this.A01 = kkl;
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(kkl);
                    RecyclerView recyclerView3 = this.A00;
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 2, 1, false));
                        int i = requireArguments().getInt(AnonymousClass000.A00(2631));
                        C60321JjQ jjQ2 = this.A00;
                        if (jjQ2 != null) {
                            Dba.A16(getViewLifecycleOwner(), DbT.A0G(jjQ2.A05), new C58735Iwi(i, 11, this), 61);
                            RecyclerView recyclerView4 = this.A00;
                            if (recyclerView4 != null) {
                                recyclerView4.A11(new C60462Jlu(1, 2, dimensionPixelOffset, dimensionPixelOffset));
                                return;
                            }
                        } else {
                            C51965G9l.A15();
                        }
                    }
                }
            }
            0qQ.A0F("albumsRecyclerview");
        } else {
            C51965G9l.A15();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void DKL(Object obj, int i) {
        C61080JwI jwI = (C61080JwI) obj;
        0qQ.A0B(jwI, 0);
        C60321JjQ jjQ = this.A00;
        if (jjQ != null) {
            jjQ.Ch9(jwI, i);
        } else {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1293410477);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.show_all_albums_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-385787353, A02);
        return inflate;
    }
}
