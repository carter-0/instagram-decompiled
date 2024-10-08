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

/* renamed from: X.Ll6  reason: case insensitive filesystem */
public final class C64967Ll6 implements MXG, C66440MRu {
    public static final String __redex_internal_original_name = "GalleryStickerGridController";
    public AnonymousClass8XW A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final View A04;
    public final AnonymousClass07i A05;
    public final GridLayoutManager A06;
    public final C355608Qq A07;
    public final UserSession A08;
    public final C60445Jld A09;
    public final AnonymousClass8MP A0A;
    public final C66503MUh A0B;
    public final String A0C = "story-sticker-gallery";
    public final Set A0D;

    public C64967Ll6(Context context, ViewGroup viewGroup, AnonymousClass07i r24, UserSession userSession, AnonymousClass8MP r26, C66503MUh mUh, int i) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass07i r0 = r24;
        AnonymousClass7TF.A1D(r0, 3, viewGroup2);
        Context context2 = context;
        this.A03 = context2;
        this.A08 = userSession2;
        this.A05 = r0;
        this.A0A = r26;
        this.A0B = mUh;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context2, 3);
        this.A06 = gridLayoutManager;
        LinkedHashSet A0y = DbS.A0y();
        this.A0D = A0y;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.afi_margin_top);
        this.A02 = dimensionPixelSize;
        View requireViewById = viewGroup2.requireViewById(R.id.gallery_sticker_grid_container);
        this.A04 = requireViewById;
        int i2 = (i - (dimensionPixelSize * 2)) / 3;
        int A052 = JTO.A05((float) i2, 0.5625f);
        C355608Qq r9 = new C355608Qq(context2, userSession2, AnonymousClass05K.A00, i2, A052, false);
        this.A07 = r9;
        C60445Jld jld = new C60445Jld(r9, this, (Integer) null, A052, true);
        jld.setHasStableIds(true);
        this.A09 = jld;
        RecyclerView A0c = JTR.A0c(requireViewById, R.id.gallery_sticker_grid_recycler_view);
        A0c.setAdapter(jld);
        A0c.setLayoutManager(gridLayoutManager);
        C60467Jlz.A00(A0c, this, 5);
        A0c.setOverScrollMode(2);
        A0y.add(requireViewById);
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public final /* synthetic */ void close() {
    }

    public final Set Acf() {
        return this.A0D;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void DMQ(Medium medium) {
        this.A0A.DHX(medium, this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A08, 36323620754042171L) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A08, 36323620754107708L) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0h() {
        /*
            r7 = this;
            X.8XW r0 = r7.A00
            r5 = 1
            if (r0 != 0) goto L_0x0021
            X.07i r2 = r7.A05
            X.8Qq r1 = r7.A07
            X.8XN r0 = new X.8XN
            r0.<init>(r2, r1)
            r0.A09 = r5
            X.8XU r4 = new X.8XU
            r4.<init>(r0)
            X.Jld r3 = r7.A09
            android.content.Context r2 = r7.A03
            r1 = 0
            X.8XW r0 = new X.8XW
            r0.<init>(r2, r1, r3, r4)
            r7.A00 = r0
        L_0x0021:
            X.MUh r6 = r7.A0B
            boolean r0 = r6.CVI()
            if (r0 == 0) goto L_0x0039
            com.instagram.common.session.UserSession r3 = r7.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323620754107708(0x810c2400012d3c, double:3.034542256154012E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            boolean r0 = r6.CVC()
            if (r0 == 0) goto L_0x0050
            com.instagram.common.session.UserSession r3 = r7.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323620754042171(0x810c2400002d3b, double:3.034542256112566E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            boolean r0 = r6.CSP()
            if (r0 == 0) goto L_0x005b
            if (r4 != 0) goto L_0x005c
            if (r1 != 0) goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            r7.A01 = r5
            X.8XW r3 = r7.A00
            java.lang.String r0 = "mediaLoaderController"
            if (r3 != 0) goto L_0x006c
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006c:
            if (r5 == 0) goto L_0x007c
            X.8XO r2 = X.AnonymousClass8XO.PHOTO_AND_VIDEO
        L_0x0070:
            X.8XZ r1 = r3.A08
            X.8XO r0 = r1.A02
            if (r0 == r2) goto L_0x0078
            r1.A02 = r2
        L_0x0078:
            r3.A07()
            return
        L_0x007c:
            X.8XO r2 = X.AnonymousClass8XO.PHOTO_ONLY
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64967Ll6.E0h():void");
    }

    public final String getModuleName() {
        return this.A0C;
    }

    public final boolean isScrolledToBottom() {
        return C2808154f.A02(this.A06);
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A03(this.A06);
    }
}
