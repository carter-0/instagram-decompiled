package X;

import android.view.View;
import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;
import java.util.ArrayList;
import java.util.List;

public final class ICJ implements View.OnClickListener {
    public final /* synthetic */ JR4 A00;
    public final /* synthetic */ C57244IUf A01;
    public final /* synthetic */ C55834HoH A02;
    public final /* synthetic */ AfiSecondaryLinkButton A03;
    public final /* synthetic */ Integer A04;

    public ICJ(JR4 jr4, C57244IUf iUf, C55834HoH hoH, AfiSecondaryLinkButton afiSecondaryLinkButton, Integer num) {
        this.A02 = hoH;
        this.A04 = num;
        this.A00 = jr4;
        this.A03 = afiSecondaryLinkButton;
        this.A01 = iUf;
    }

    public final void onClick(View view) {
        int i;
        long j;
        Long A10;
        H7Y h7y;
        JSM jsm;
        int A05 = AnonymousClass0fD.A05(-1483584019);
        C55834HoH hoH = this.A02;
        HorizontalFlowLayout horizontalFlowLayout = hoH.A05;
        int i2 = horizontalFlowLayout.A00;
        Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 5;
        }
        11Z.A02(new C57950Ij5(this.A01, hoH, this.A03, i));
        JR4 jr4 = this.A00;
        List<View> A012 = horizontalFlowLayout.A01(i2, i - 1);
        ArrayList<JSM> A1C = AnonymousClass7TE.A1C();
        for (View view2 : A012) {
            if (!(!(view2 instanceof H7Y) || (h7y = (H7Y) view2) == null || (jsm = h7y.A00) == null)) {
                A1C.add(jsm);
            }
        }
        IL4 il4 = (IL4) jr4;
        0Aj A0e = AnonymousClass7TE.A0e(il4.A00, "instagram_ads_feedback_interface_expand_interests");
        if (A0e.isSampled()) {
            String str = il4.A04;
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            IL4.A01(A0e, il4, j);
            String str2 = il4.A05;
            if (str2 == null) {
                str2 = "";
            }
            IL4.A03(A0e, il4, str2);
            IL4.A02(A0e, il4, IL4.A00(A0e, il4, "question_id", "interests"));
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            for (JSM jsm2 : A1C) {
                0qQ.A0B(jsm2, 0);
                0bb r1 = new 0bb();
                String name = jsm2.getName();
                if (name != null) {
                    IL4.A04(r1, jsm2, C51976G9y.A0K(r1, jsm2, name));
                    A0r.add(r1);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0e.AAe("interests", A0r);
            A0e.Cgf();
        }
        AnonymousClass0fD.A0C(378774328, A05);
    }
}
