package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EG9 extends C232222tE {
    public final UserSession A00;
    public final C49411EvD A01;

    public EG9(UserSession userSession, C49411EvD evD) {
        0qQ.A0B(userSession, 2);
        this.A01 = evD;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46997Dop(DbT.A0D(layoutInflater, viewGroup, R.layout.universal_creation_menu_row, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (X.AnonymousClass7TG.A1a(r10, r10.A5l, X.1Av.A8a, 448) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (X.AnonymousClass7TG.A1a(r10, r10.A5h, X.1Av.A8a, 449) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        if (X.AnonymousClass7TG.A1a(r3, r3.A5b, X.1Av.A8a, 450) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (X.182.A06(X.0Tu.A06, r2, 36329410369962087L) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r12, X.C249703kE r13) {
        /*
            r11 = this;
            X.FY6 r12 = (X.FY6) r12
            X.Dop r13 = (X.C46997Dop) r13
            r8 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r8, r12, r13)
            java.lang.Integer r3 = r12.A00
            int r6 = r3.intValue()
            switch(r6) {
                case 0: goto L_0x015c;
                case 1: goto L_0x0154;
                case 2: goto L_0x014c;
                case 3: goto L_0x0144;
                case 4: goto L_0x013c;
                case 5: goto L_0x0134;
                case 6: goto L_0x012c;
                case 7: goto L_0x0124;
                case 8: goto L_0x011c;
                case 9: goto L_0x0114;
                case 10: goto L_0x010c;
                case 11: goto L_0x0104;
                default: goto L_0x0012;
            }
        L_0x0012:
            r0 = 2131975933(0x7f135efd, float:1.9588972E38)
            r1 = 2131238572(0x7f081eac, float:1.8093426E38)
        L_0x0018:
            com.instagram.common.ui.base.IgTextView r5 = r13.A01
            r5.setText(r0)
            android.widget.ImageView r0 = r13.A00
            r0.setImageResource(r1)
            X.3oV r4 = r13.A02
            com.instagram.common.session.UserSession r2 = r11.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            if (r3 != r0) goto L_0x00be
            X.1Av r10 = X.1Au.A00(r2)
            X.0s0 r9 = r10.A5c
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 223(0xdf, float:3.12E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r10, r9, r1, r0)
            if (r0 != 0) goto L_0x00be
            X.0Tu r9 = X.0Tu.A06
            r0 = 36329410369962087(0x81116800004067, double:3.038203632533233E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 != 0) goto L_0x00be
        L_0x0047:
            r0 = 0
        L_0x0048:
            r4.setVisibility(r0)
            android.view.View r2 = r13.itemView
            if (r6 == r8) goto L_0x00aa
            if (r6 == r7) goto L_0x00a2
            r0 = 3
            if (r6 == r0) goto L_0x009a
            r0 = 4
            if (r6 == r0) goto L_0x0092
            r0 = 5
            if (r6 == r0) goto L_0x008a
            r0 = 8
            if (r6 == r0) goto L_0x0082
            r0 = 11
            if (r6 == r0) goto L_0x007a
            r0 = 12
            if (r6 == r0) goto L_0x00b2
            java.lang.String r0 = X.DbV.A0y(r5)
        L_0x006a:
            r2.setContentDescription(r0)
            android.view.View r0 = r13.itemView
            X.2eS.A01(r0)
            android.view.View r1 = r13.itemView
            r0 = 64
            X.FPH.A00(r1, r13, r11, r12, r0)
            return
        L_0x007a:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975937(0x7f135f01, float:1.958898E38)
            goto L_0x00b9
        L_0x0082:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975929(0x7f135ef9, float:1.9588964E38)
            goto L_0x00b9
        L_0x008a:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975925(0x7f135ef5, float:1.9588956E38)
            goto L_0x00b9
        L_0x0092:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975931(0x7f135efb, float:1.9588968E38)
            goto L_0x00b9
        L_0x009a:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975939(0x7f135f03, float:1.9588984E38)
            goto L_0x00b9
        L_0x00a2:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975941(0x7f135f05, float:1.9588988E38)
            goto L_0x00b9
        L_0x00aa:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975927(0x7f135ef7, float:1.958896E38)
            goto L_0x00b9
        L_0x00b2:
            android.content.Context r1 = r2.getContext()
            r0 = 2131975934(0x7f135efe, float:1.9588974E38)
        L_0x00b9:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x006a
        L_0x00be:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            if (r3 != r0) goto L_0x00d4
            X.1Av r10 = X.1Au.A00(r2)
            X.0s0 r9 = r10.A5l
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 448(0x1c0, float:6.28E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r10, r9, r1, r0)
            if (r0 != 0) goto L_0x00d4
            goto L_0x0047
        L_0x00d4:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            if (r3 != r0) goto L_0x00ea
            X.1Av r10 = X.1Au.A00(r2)
            X.0s0 r9 = r10.A5h
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 449(0x1c1, float:6.29E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r10, r9, r1, r0)
            if (r0 != 0) goto L_0x00ea
            goto L_0x0047
        L_0x00ea:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r3 != r0) goto L_0x0100
            X.1Av r3 = X.1Au.A00(r2)
            X.0s0 r2 = r3.A5b
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 450(0x1c2, float:6.3E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0100
            goto L_0x0047
        L_0x0100:
            r0 = 8
            goto L_0x0048
        L_0x0104:
            r0 = 2131975936(0x7f135f00, float:1.9588978E38)
            r1 = 2131238629(0x7f081ee5, float:1.8093542E38)
            goto L_0x0018
        L_0x010c:
            r0 = 2131969931(0x7f13478b, float:1.9576799E38)
            r1 = 2131238060(0x7f081cac, float:1.8092388E38)
            goto L_0x0018
        L_0x0114:
            r0 = 2131963221(0x7f132d55, float:1.956319E38)
            r1 = 2131238947(0x7f082023, float:1.8094187E38)
            goto L_0x0018
        L_0x011c:
            r0 = 2131975928(0x7f135ef8, float:1.9588962E38)
            r1 = 2131238222(0x7f081d4e, float:1.8092717E38)
            goto L_0x0018
        L_0x0124:
            r0 = 2131975935(0x7f135eff, float:1.9588976E38)
            r1 = 2131238667(0x7f081f0b, float:1.809362E38)
            goto L_0x0018
        L_0x012c:
            r0 = 2131975932(0x7f135efc, float:1.958897E38)
            r1 = 2131238519(0x7f081e77, float:1.809332E38)
            goto L_0x0018
        L_0x0134:
            r0 = 2131975924(0x7f135ef4, float:1.9588954E38)
            r1 = 2131237857(0x7f081be1, float:1.8091976E38)
            goto L_0x0018
        L_0x013c:
            r0 = 2131975930(0x7f135efa, float:1.9588966E38)
            r1 = 2131238498(0x7f081e62, float:1.8093276E38)
            goto L_0x0018
        L_0x0144:
            r0 = 2131975938(0x7f135f02, float:1.9588982E38)
            r1 = 2131238690(0x7f081f22, float:1.8093666E38)
            goto L_0x0018
        L_0x014c:
            r0 = 2131975942(0x7f135f06, float:1.958899E38)
            r1 = 2131238856(0x7f081fc8, float:1.8094003E38)
            goto L_0x0018
        L_0x0154:
            r0 = 2131975940(0x7f135f04, float:1.9588986E38)
            r1 = 2131238596(0x7f081ec4, float:1.8093475E38)
            goto L_0x0018
        L_0x015c:
            r0 = 2131975926(0x7f135ef6, float:1.9588958E38)
            r1 = 2131238631(0x7f081ee7, float:1.8093546E38)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EG9.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FY6.class;
    }
}
