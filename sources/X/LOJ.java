package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class LOJ {
    public MVV A00;
    public LR6 A01;
    public boolean A02;
    public final RecyclerView A03;
    public final UserSession A04;
    public final LGD A05;
    public final C60402Jkv A06;
    public final ArrayList A07;
    public final C63669L2f A08;

    public static final void A00(LOJ loj) {
        if (loj.A02) {
            LGD lgd = loj.A05;
            ImageView imageView = lgd.A07;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.instagram_chevron_down_pano_outline_24);
            }
            AnonymousClass7TH.A0R(lgd.A02);
            MVV mvv = loj.A00;
            if (mvv != null) {
                if (C63272KuH.A00(loj.A04)) {
                    mvv.CLB();
                } else {
                    mvv.CLg();
                }
            }
            loj.A02 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = r3.A0Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.LR6 r5, java.lang.String r6) {
        /*
            r4 = this;
            X.LR6 r0 = r4.A01
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.A01
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0064
        L_0x000c:
            X.L2f r0 = r4.A08
            X.LPF r0 = r0.A00
            com.instagram.ui.widget.gallery.GalleryView r3 = r0.A03
            if (r3 != 0) goto L_0x001e
            java.lang.String r0 = "galleryView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            r2 = 0
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x0035
            java.util.LinkedHashSet r0 = r3.A0Y
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0035
            r0.clear()
            X.MUM r0 = r3.A0F
            if (r0 == 0) goto L_0x0035
            r0.DSe(r2, r1, r2)
        L_0x0035:
            X.JeM r2 = r3.A0C
            if (r2 == 0) goto L_0x0050
            java.util.HashMap r1 = r2.A04
            boolean r0 = r1.containsKey(r6)
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r1.get(r6)
            X.LR6 r0 = (X.LR6) r0
            X.C60054JeM.A00(r2, r0)
            r0 = 1793796023(0x6aeb27b7, float:1.4214256E26)
            X.0fE.A00(r2, r0)
        L_0x0050:
            android.widget.GridView r1 = r3.A0T
            X.M4z r0 = new X.M4z
            r0.<init>(r3)
            r1.post(r0)
            com.instagram.ui.widget.gallery.GalleryView.A07(r3)
            X.LGD r0 = r4.A05
            r0.A01(r6)
            r4.A01 = r5
        L_0x0064:
            A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOJ.A01(X.LR6, java.lang.String):void");
    }

    public LOJ(Context context, UserSession userSession, LGD lgd, C63669L2f l2f, MVV mvv) {
        this.A04 = userSession;
        this.A05 = lgd;
        this.A00 = mvv;
        this.A08 = l2f;
        View A082 = DbU.A08(LayoutInflater.from(context), R.layout.media_picker_gallery_folder_list);
        0qQ.A0C(A082, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) A082;
        this.A03 = recyclerView;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A07 = A1C;
        DbV.A1B(recyclerView.getContext(), recyclerView);
        C60402Jkv jkv = new C60402Jkv(context, userSession, A1C, new C59346JFy(this, 4));
        this.A06 = jkv;
        recyclerView.setAdapter(jkv);
        lgd.A01(AnonymousClass7TE.A16(context, 2131965943));
        LY5 A002 = LY5.A00(this, 11);
        View view = lgd.A02;
        if (view != null) {
            AnonymousClass0fU.A00(A002, view);
        }
    }
}
