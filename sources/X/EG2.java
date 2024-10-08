package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.fragment.OnboardingCheckListFragment;

public final class EG2 extends C232222tE {
    public final OnboardingCheckListFragment A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47012Dp4(DbT.A0D(layoutInflater, viewGroup, R.layout.onboarding_check_list_item_row_with_subtitle, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r9, X.C249703kE r10) {
        /*
            r8 = this;
            X.FXy r9 = (X.FXy) r9
            X.Dp4 r10 = (X.C47012Dp4) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            X.F3Q r3 = r9.A00
            java.lang.String r0 = r3.A05
            X.0qQ.A07(r0)
            java.lang.Integer r2 = X.C48741EjQ.A00(r0)
            if (r2 == 0) goto L_0x007f
            android.widget.TextView r1 = r10.A05
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            android.widget.ImageView r1 = r10.A01
            int r0 = r2.intValue()
            switch(r0) {
                case 1: goto L_0x00a7;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00c5;
                case 9: goto L_0x00c5;
                case 10: goto L_0x00ca;
                case 11: goto L_0x00c5;
                case 12: goto L_0x00cf;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = 2131238956(0x7f08202c, float:1.8094205E38)
        L_0x0027:
            r1.setImageResource(r0)
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x0035
            android.widget.TextView r0 = r10.A04
            if (r0 == 0) goto L_0x0035
            r0.setText(r1)
        L_0x0035:
            android.view.View r5 = r10.A00
            android.content.Context r6 = r5.getContext()
            X.EzY r2 = r3.A00
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "complete"
            boolean r0 = r0.equals(r1)
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0080
            android.widget.ImageView r2 = r10.A02
            r0 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r2.setImageResource(r0)
            boolean r1 = r8.A01
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            if (r1 == 0) goto L_0x005b
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
        L_0x005b:
            int r0 = X.AnonymousClass7TF.A03(r6, r0)
            r2.setColorFilter(r0)
            r0 = 0
            r5.setOnClickListener(r0)
        L_0x0066:
            r7 = 0
        L_0x0067:
            r0 = 20
            X.FPE.A01(r5, r0, r9, r8)
            android.widget.ImageView r1 = r10.A02
            r0 = 0
            if (r7 == 0) goto L_0x0073
            r0 = 8
        L_0x0073:
            r1.setVisibility(r0)
            android.widget.TextView r0 = r10.A03
            if (r7 != 0) goto L_0x007c
            r4 = 8
        L_0x007c:
            r0.setVisibility(r4)
        L_0x007f:
            return
        L_0x0080:
            if (r2 == 0) goto L_0x0097
            int r3 = r2.A00
            if (r3 <= 0) goto L_0x0097
            int r0 = r2.A01
            if (r3 >= r0) goto L_0x0097
            android.widget.TextView r2 = r10.A03
            r1 = 2131976912(0x7f1362d0, float:1.9590958E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.DbX.A13(r6, r2, r0, r1)
            goto L_0x0067
        L_0x0097:
            android.widget.ImageView r1 = r10.A02
            r0 = 2131238091(0x7f081ccb, float:1.809245E38)
            r1.setImageResource(r0)
            int r0 = X.2Yu.A09(r6)
            X.DbU.A14(r6, r1, r0)
            goto L_0x0066
        L_0x00a7:
            r0 = 2131238009(0x7f081c79, float:1.8092285E38)
            goto L_0x0027
        L_0x00ac:
            r0 = 2131238593(0x7f081ec1, float:1.809347E38)
            goto L_0x0027
        L_0x00b1:
            r0 = 2131238690(0x7f081f22, float:1.8093666E38)
            goto L_0x0027
        L_0x00b6:
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            goto L_0x0027
        L_0x00bb:
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            goto L_0x0027
        L_0x00c0:
            r0 = 2131238472(0x7f081e48, float:1.8093224E38)
            goto L_0x0027
        L_0x00c5:
            r0 = 2131238667(0x7f081f0b, float:1.809362E38)
            goto L_0x0027
        L_0x00ca:
            r0 = 2131238129(0x7f081cf1, float:1.8092528E38)
            goto L_0x0027
        L_0x00cf:
            r0 = 2131238968(0x7f082038, float:1.809423E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EG2.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FXy.class;
    }

    public EG2(OnboardingCheckListFragment onboardingCheckListFragment, boolean z) {
        this.A01 = z;
        this.A00 = onboardingCheckListFragment;
    }
}
