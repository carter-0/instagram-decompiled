package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Ll5  reason: case insensitive filesystem */
public final class C64966Ll5 implements MXG, C66440MRu {
    public static final String __redex_internal_original_name = "PolaroidStickerGridController";
    public final int A00;
    public final GridLayoutManager A01;
    public final RecyclerView A02;
    public final AnonymousClass8MQ A03;
    public final AnonymousClass8XW A04;
    public final String A05 = "polaroid-sticker-controller";
    public final Set A06;

    public C64966Ll5(Context context, ViewGroup viewGroup, AnonymousClass07i r21, UserSession userSession, AnonymousClass8MQ r23, int i) {
        AnonymousClass07i r0 = r21;
        0qQ.A0B(r0, 3);
        this.A03 = r23;
        Context context2 = context;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context2, 3);
        this.A01 = gridLayoutManager;
        LinkedHashSet A0y = DbS.A0y();
        this.A06 = A0y;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.afi_margin_top);
        this.A00 = dimensionPixelSize;
        View A0G = AnonymousClass7TF.A0G(viewGroup, R.id.polaroid_sticker_grid_container);
        int i2 = (i - (dimensionPixelSize * 2)) / 3;
        int A052 = JTO.A05((float) i2, 0.5625f);
        C355608Qq r9 = new C355608Qq(context2, userSession, AnonymousClass05K.A00, i2, A052, false);
        C60445Jld jld = new C60445Jld(r9, this, (Integer) null, A052, true);
        jld.setHasStableIds(true);
        AnonymousClass8XN r8 = new AnonymousClass8XN(r0, r9);
        r8.A03 = AnonymousClass8XO.PHOTO_ONLY;
        r8.A09 = true;
        this.A04 = new AnonymousClass8XW(context2, (2Cn) null, jld, new AnonymousClass8XU(r8));
        RecyclerView A0I = DbT.A0I(A0G, R.id.polaroid_sticker_grid_recycler_view);
        this.A02 = A0I;
        A0I.setAdapter(jld);
        A0I.setLayoutManager(gridLayoutManager);
        C60467Jlz.A00(A0I, this, 6);
        A0I.setOverScrollMode(2);
        A0y.add(A0G);
    }

    public final /* synthetic */ void Dfq() {
    }

    public final /* synthetic */ void close() {
    }

    public final Set Acf() {
        return this.A06;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void Cw3() {
        C2808154f.A01(this.A02, true);
    }

    public final void DMQ(Medium medium) {
        this.A03.DXx(medium);
    }

    public final void E0h() {
        this.A04.A07();
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final boolean isScrolledToBottom() {
        return C2808154f.A02(this.A01);
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A03(this.A01);
    }
}
