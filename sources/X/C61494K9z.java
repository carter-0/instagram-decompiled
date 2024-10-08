package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K9z  reason: case insensitive filesystem */
public final class C61494K9z extends C336937fQ {
    public final JWT A00 = new JWT(AnonymousClass05K.A01);

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1950173984);
        if (view == null) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            view = DbX.A0F(viewGroup, 0).inflate(R.layout.gallery_header, viewGroup, false);
            DbY.A0z(view);
            Resources resources = viewGroup.getResources();
            view.setPadding(view.getPaddingLeft(), resources.getDimensionPixelSize(R.dimen.direct_composer_redesign_background_height), view.getPaddingRight(), JTP.A03(resources));
            0qQ.A0A(view);
            view.setTag(new C60684JpV(view));
        }
        ((C60684JpV) DbT.A0o(view)).A00(this.A00.A00, (C66093MBb) null);
        AnonymousClass0fD.A0A(2071582438, A03);
        return view;
    }
}
