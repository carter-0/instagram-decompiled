package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Map;

public final class KG9 extends C232222tE {
    public final Integer A00;
    public final Map A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60592Jo1(DbU.A09(layoutInflater, viewGroup, R.layout.direct_text_header_tray_item, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r10, X.C249703kE r11) {
        /*
            r9 = this;
            X.JyL r10 = (X.C61169JyL) r10
            X.Jo1 r11 = (X.C60592Jo1) r11
            r2 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r2, r10, r11)
            android.widget.TextView r4 = r11.A00
            int r0 = r10.A00
            r4.setText(r0)
            com.instagram.common.ui.base.IgButton r5 = r11.A01
            java.lang.Integer r1 = r10.A05
            r0 = 0
            if (r1 != 0) goto L_0x0019
            r0 = 8
        L_0x0019:
            r5.setVisibility(r0)
            if (r1 == 0) goto L_0x0025
            int r0 = r1.intValue()
            r5.setText(r0)
        L_0x0025:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x00b6
            android.content.Context r1 = r5.getContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x0030:
            X.JTS.A0u(r1, r5, r0)
        L_0x0033:
            java.lang.Boolean r0 = r10.A04
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x00ad
            android.content.Context r1 = r10.A01
            if (r1 == 0) goto L_0x00ad
            int r0 = X.2Yu.A0A(r1)
            X.DbT.A17(r1, r4, r0)
            r0 = 2132018632(0x7f1405c8, float:1.9675576E38)
            r5.setTextAppearance(r0)
            r4 = r5
            int r0 = X.2Yu.A0A(r1)
            int r0 = r1.getColor(r0)
        L_0x0055:
            r4.setTextColor(r0)
        L_0x0058:
            X.Kzg r0 = r10.A02
            if (r0 == 0) goto L_0x00a9
            X.K4g r7 = r0.A00
            boolean r0 = r7 instanceof X.K3N
            if (r0 == 0) goto L_0x00aa
            r0 = r7
            X.K3N r0 = (X.K3N) r0
            boolean r0 = r0.A02
        L_0x0067:
            if (r0 == 0) goto L_0x00a9
            X.0eM r6 = r7.A0S
            X.0lg r8 = X.AnonymousClass7TF.A0L(r6, r2)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319003664194351(0x8107f100001b2f, double:3.031622389901276E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.26t r0 = X.26G.A00(r0)
            X.0xa r1 = r0.A00
            r0 = 3482(0xd9a, float:4.88E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r4, r2)
            if (r0 != 0) goto L_0x00a9
            X.M5u r2 = new X.M5u
            r2.<init>(r5, r7)
            r0 = 500(0x1f4, double:2.47E-321)
            r5.postDelayed(r2, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.26t r0 = X.26G.A00(r0)
            X.0xa r0 = r0.A00
            X.DbX.A1V(r0, r4, r3)
        L_0x00a9:
            return
        L_0x00aa:
            boolean r0 = r7.A0H
            goto L_0x0067
        L_0x00ad:
            java.lang.Integer r0 = r9.A00
            if (r0 == 0) goto L_0x0058
            int r0 = r0.intValue()
            goto L_0x0055
        L_0x00b6:
            java.util.Map r1 = r9.A01
            if (r1 == 0) goto L_0x0033
            X.Nj1 r0 = r10.A03
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x00c4
            X.MKX r1 = X.MKX.A00
        L_0x00c4:
            r0 = 6
            X.LYB.A00(r5, r0, r1)
            android.content.Context r1 = r5.getContext()
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KG9.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C61169JyL.class;
    }

    public KG9(Integer num, Map map) {
        this.A01 = map;
        this.A00 = num;
    }

    public KG9() {
        this((Integer) null, (Map) null);
    }
}
