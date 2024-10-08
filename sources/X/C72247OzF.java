package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;

/* renamed from: X.OzF  reason: case insensitive filesystem */
public final class C72247OzF implements C2365734g {
    public final /* synthetic */ P3E A00;
    public final /* synthetic */ boolean A01;

    public C72247OzF(P3E p3e, boolean z) {
        this.A00 = p3e;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        0qQ.A0B(view, 0);
        P3E p3e = this.A00;
        View requireViewById = view.requireViewById(R.id.direct_sticker_results_list);
        boolean z = this.A01;
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(p3e.A0K.A00);
        recyclerView.setLayoutManager(p3e.A0E);
        Context context = p3e.A0D;
        recyclerView.A11(C69922NuO.A00(context, (Integer) null, 0, false, z));
        Resources resources = context.getResources();
        recyclerView.A11(new C67827MvV(resources.getDimensionPixelOffset(R.dimen.album_music_sticker_text_vertical_padding), resources.getDimensionPixelOffset(R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin)));
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        p3e.A06 = recyclerView;
        p3e.A01 = view.findViewById(R.id.direct_sticker_results_empty_view);
        p3e.A04 = view.findViewById(R.id.sticker_tray_overflow_nav_contents);
        p3e.A07 = JTO.A0X(view, R.id.sticker_tray_overflow_header);
        p3e.A03 = view.findViewById(R.id.sticker_tray_overflow_back_button);
        p3e.A02 = view.findViewById(R.id.direct_sticker_results_loading_spinner);
        if (p3e.A0Z) {
            p3e.A08 = (IgdExpressionTrayHscrollLayout) DbV.A0T(view, R.id.direct_sticker_tray_hscroll_container, false).getView();
        }
    }
}
