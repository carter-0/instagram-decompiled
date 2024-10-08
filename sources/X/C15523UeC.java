package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UeC  reason: case insensitive filesystem */
public final class C15523UeC extends C231632rz {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int A03 = AnonymousClass0fD.A03(1697701446);
        View view2 = view;
        AnonymousClass7TG.A1U(view2, obj3, obj4);
        VZV vzv = (VZV) obj4;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.featuredproducts.mediafeed.MediaGridCellWithFeaturedProductOverlayBinderGroup.Holder");
        VTQ vtq = (VTQ) tag;
        UserSession userSession = this.A00;
        ? r14 = vtq.A01;
        int i2 = vzv.A02;
        int i3 = vzv.A03;
        int i4 = vzv.A01;
        int i5 = vzv.A00;
        C321496uH.A02(this.A01, userSession, (1Xj) obj3, (C267644bx) null, (AnonymousClass32J) null, (AnonymousClass726) null, r14, (String) null, (String) null, -1.0f, i2, i3, i4, i5, false, false, false);
        C321496uH.A01(AnonymousClass7TE.A0S(view2), r14, vzv.A04);
        0nA.A0U(vtq.A00, DbX.A0G(r14).getMarginEnd());
        AnonymousClass0fD.A0A(2005471338, A03);
    }

    public C15523UeC(UserSession userSession, AnonymousClass4DU r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1717618962);
        View inflate = DbX.A0F(viewGroup, 1).inflate(R.layout.media_grid_cell_with_overlay, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(2));
        FrameLayout frameLayout = (FrameLayout) inflate;
        ? A002 = C321496uH.A00(AnonymousClass7TE.A0S(frameLayout));
        frameLayout.addView(A002, 0);
        frameLayout.setTag(new VTQ(frameLayout, A002));
        AnonymousClass0fD.A0A(-1726397440, A03);
        return frameLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
