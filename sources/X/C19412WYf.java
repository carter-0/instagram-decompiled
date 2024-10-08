package X;

import android.content.Context;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView;
import java.text.SimpleDateFormat;
import java.util.List;

/* renamed from: X.WYf  reason: case insensitive filesystem */
public final class C19412WYf implements X4I {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19412WYf(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    public final void CvW(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        String str2;
        String str3;
        Object obj;
        switch (this.A00) {
            case 0:
                AnonymousClass7TF.A1H(leadGenFormBaseQuestion, str);
                ((C18077Vl6) this.A01).A05(leadGenFormBaseQuestion, str, false);
                C16033UnM.A01((C15045UKy) this.A02, (C16033UnM) this.A03, str);
                return;
            case 1:
                C16028UnH unH = (C16028UnH) this.A03;
                C15045UKy uKy = (C15045UKy) this.A02;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                SimpleDateFormat simpleDateFormat = W33.A04;
                LeadGenFormStoreLocatorView leadGenFormStoreLocatorView = unH.A00;
                if (W33.A01.contains(leadGenFormStoreLocatorView.getCountryCode())) {
                    List list = ((LeadGenFormBaseQuestion) uKy.A08.get(0)).A0F;
                    if (list != null) {
                        obj = 00k.A0O(list, 0);
                    } else {
                        obj = null;
                    }
                    boolean A0K = 0qQ.A0K(obj, "post_code");
                    Context context = leadGenFormStoreLocatorView.getContext();
                    int i2 = 2131964703;
                    if (A0K) {
                        i2 = 2131964702;
                    }
                    String A0p = C51967G9n.A0p(context, i2);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = unH.A09;
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setFooterText(A0p);
                    }
                } else {
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = unH.A09;
                    if (igdsBottomButtonLayout2 != null) {
                        igdsBottomButtonLayout2.setFooterText("");
                    }
                }
                if (str.length() > 0) {
                    str2 = 002.A0T(leadGenFormStoreLocatorView.getCountryCode(), str, ':');
                } else {
                    str2 = str;
                }
                C18077Vl6 vl6 = (C18077Vl6) this.A01;
                List list2 = ((LeadGenFormBaseQuestion) uKy.A08.get(0)).A0F;
                if (list2 == null || (str3 = (String) 00k.A0O(list2, 0)) == null) {
                    str3 = "";
                }
                0qQ.A0B(str2, 1);
                C15998Umf umf = vl6.A00;
                if (umf.A00 != null) {
                    C13990Tnq.A0R(umf).A0c.Epw(new C15050ULg(str3, str2, 2));
                }
                leadGenFormStoreLocatorView.A00 = str;
                return;
            default:
                return;
        }
    }
}
