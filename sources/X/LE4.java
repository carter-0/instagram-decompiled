package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;

public final class LE4 {
    public C65324LrN A00;
    public boolean A01 = true;
    public final View A02;
    public final LinearLayoutManager A03;
    public final RecyclerView A04;
    public final AppBarLayout A05;
    public final C61644KFu A06;
    public final AnonymousClass2t9 A07;

    public LE4(ViewStub viewStub, AppBarLayout appBarLayout, float f) {
        int A022 = DbW.A02(1, appBarLayout, viewStub);
        Context context = viewStub.getContext();
        View inflate = viewStub.inflate();
        if (inflate != null) {
            this.A02 = inflate;
            inflate.setVisibility(4);
            RecyclerView A0I = DbT.A0I(inflate, R.id.media_thumbnail_preview_recycler_view);
            this.A04 = A0I;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
            this.A03 = linearLayoutManager;
            A0I.setLayoutManager(linearLayoutManager);
            C61644KFu kFu = new C61644KFu(f);
            this.A06 = kFu;
            AnonymousClass2tC A002 = AnonymousClass2t9.A00(A0I.getContext());
            A002.A08 = true;
            A002.A01(new KFE(f));
            AnonymousClass2t9 A0U = DbU.A0U(A002, kFu);
            this.A07 = A0U;
            A0I.setAdapter(A0U);
            A0I.A11(new C60456Jlo(this, f));
            new C349087zZ().A07(A0I);
            C60473Jm5.A00(A0I, this, 1);
            this.A05 = appBarLayout;
            appBarLayout.A02(new C59967Jcc(this, A022));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int A00() {
        LinearLayoutManager linearLayoutManager = this.A03;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        int A1c = linearLayoutManager.A1c();
        if (Math.abs(A1b - A1a) > 1) {
            return (A1a + A1b) / 2;
        }
        return A1c;
    }
}
