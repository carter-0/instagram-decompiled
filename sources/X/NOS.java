package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class NOS extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C321586uQ A01;
    public final 0sP A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67929MxF(DbT.A0D(layoutInflater, viewGroup, R.layout.shop_entrypoint_row, false), this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        C71963Oto oto = (C71963Oto) r14;
        if (r15 != null && oto != null) {
            N3G n3g = oto.A00;
            View A0F = JTO.A0F(r15);
            AnonymousClass0iw r3 = this.A00;
            String str = n3g.A03;
            int i = n3g.A01;
            boolean z = n3g.A0B;
            C70336O2o.A00(A0F, r3, (ImageUrl) null, n3g.A02, str, new C20613Wvu(21, this, n3g), i, z, JTQ.A1O(i, -1));
            C321586uQ r2 = this.A01;
            View A0F2 = JTO.A0F(r15);
            String str2 = n3g.A06;
            String str3 = n3g.A0A;
            String str4 = n3g.A04;
            String str5 = n3g.A05;
            if (str5 == null) {
                str5 = "mini_shops";
            }
            String str6 = n3g.A07;
            String str7 = n3g.A08;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = n3g.A09;
            if (str8 == null) {
                str8 = "";
            }
            r2.A00(A0F2, n3g.A00, str2, str3, str4, C273654mx.A00(3039), str5, str6, str7, str8);
        }
    }

    public final Class modelClass() {
        return C71963Oto.class;
    }

    public NOS(AnonymousClass0iw r1, C321586uQ r2, 0sP r3) {
        AnonymousClass7TG.A1O(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
