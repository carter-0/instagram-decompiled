package X;

import android.view.View;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import java.util.List;

public final class WA2 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public WA2(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-686220948);
                if (this.A02 == AnonymousClass05K.A00) {
                    C15328Uac.A0D((C15328Uac) this.A03, AnonymousClass000.A00(586), this.A04, 002.A0O("messaging_ads_multi_suggestion_post_card_", this.A01), (String) null);
                } else {
                    C15328Uac.A0C((C15328Uac) this.A03, (String) null, "direct_inbox_setting_entrypoint", "promotion_list", "messaging_ads_multi_suggestion_post_selector");
                }
                i2 = 443974452;
                break;
            case 1:
                i = AnonymousClass0fD.A05(-1129146894);
                ((1Av) this.A03).A0b(this.A01 + 1);
                C17708Vcd vcd = (C17708Vcd) this.A02;
                C230242pG r5 = vcd.A08;
                String str = this.A04;
                int i3 = vcd.A00;
                List list = vcd.A0B;
                C60710Jpv jpv = vcd.A07;
                String str2 = vcd.A0A;
                r5.Dca(jpv, vcd.A04, vcd.A09, str, str2, list, i3, AnonymousClass7TF.A1V(vcd.A06));
                i2 = 1972326452;
                break;
            case 2:
                i = AnonymousClass0fD.A05(-1887413867);
                ((AnonymousClass2r1) this.A02).DRO((ShoppingBrandWithProducts) this.A03, this.A04, this.A01);
                i2 = 1819992843;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
