package X;

import android.content.Context;
import android.content.DialogInterface;
import java.io.IOException;
import java.util.Set;

public final class W51 implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public W51(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A03 = obj;
        this.A05 = obj4;
        this.A01 = i;
        this.A04 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            C15397Uc0 uc0 = (C15397Uc0) this.A02;
            Integer num = (Integer) this.A03;
            Integer num2 = (Integer) this.A04;
            try {
                String str = uc0.A0C;
                str.getClass();
                uc0.A09.A00(8);
                C21029XAi xAi = uc0.A08;
                Set set = uc0.A04.A0G;
                xAi.Co2(new C15607UfZ(uc0, num2, str, uc0.A04.A0G, set.size()), num, "feed_photos_of_you", set);
            } catch (IOException unused) {
                C59689JTv.A0F((Context) this.A05, "media_action_io_exception", this.A01);
            }
        } else {
            Context context = (Context) this.A03;
            int i2 = this.A01;
            C46521DgO.A02(context, (JV7) this.A04, (C46521DgO) this.A02, (C283155Gi) this.A05, i2);
        }
    }
}
