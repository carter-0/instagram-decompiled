package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KKM extends K5K {
    public static final String __redex_internal_original_name = "AlbumPickerFragment";
    public RecyclerView A00;
    public C60419JlC A01;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbZ.A0F(view, R.id.parent_recyclerview);
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        Resources A05 = DbV.A05(this);
        int dimensionPixelOffset = A05.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        int dimensionPixelOffset2 = A05.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
        int A012 = (((AnonymousClass0nB.A01(requireContext()) - (dimensionPixelOffset * 2)) - (dimensionPixelOffset2 * 3)) - A05.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)) / 3;
        C60419JlC jlC = new C60419JlC(new C53368Gms(A012, A012, 8), A0l);
        this.A01 = jlC;
        C60321JjQ jjQ = this.A00;
        if (jjQ != null) {
            jlC.A00 = jjQ;
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setAdapter(jlC);
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 != null) {
                    DbU.A15(requireContext(), recyclerView2, 1, false);
                    RecyclerView recyclerView3 = this.A00;
                    if (recyclerView3 != null) {
                        AnonymousClass9YR r0 = new AnonymousClass9YR();
                        recyclerView3.A13(r0);
                        recyclerView3.A15(r0);
                        C60321JjQ jjQ2 = this.A00;
                        if (jjQ2 != null) {
                            Dba.A16(getViewLifecycleOwner(), DbT.A0G(jjQ2.A05), new C58727Iwa(this, 41), 59);
                            return;
                        }
                        C51965G9l.A15();
                    }
                }
            }
            0qQ.A0F("parentRecyclerview");
        } else {
            C51965G9l.A15();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(490043480);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.album_picker_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(506749860, A02);
        return inflate;
    }
}
