package X;

import android.widget.RadioGroup;
import java.util.List;

public final class FQa implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ 2HA A00;
    public final /* synthetic */ C49681F1p A01;
    public final /* synthetic */ ESU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public FQa(2HA r1, C49681F1p f1p, ESU esu, String str, List list, boolean z) {
        this.A02 = esu;
        this.A04 = list;
        this.A03 = str;
        this.A00 = r1;
        this.A05 = z;
        this.A01 = f1p;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str = ((C70953OTa) this.A04.get(i)).A02;
        ESU esu = this.A02;
        if (DbY.A1Y(0Tu.A05, esu.A02, 36314210480687594L)) {
            String str2 = this.A03;
            if ("video_call".equals(str2) && str.equals("off")) {
                2HA r4 = this.A00;
                boolean z = this.A05;
                C49681F1p f1p = this.A01;
                C358248ab A0U = DbW.A0U(esu);
                A0U.A09(2131960694);
                A0U.A08(2131960693);
                A0U.A0I(new C50002FIn(r4, f1p, esu, str, str2, z), 2131960695);
                A0U.A0G(C50021FJg.A00(esu, 35), 2131960692);
                DbT.A1V(A0U);
                return;
            }
        }
        String str3 = this.A03;
        ESU.A08(this.A00, this.A01, esu, str, str3, this.A05);
    }
}
