package X;

import android.content.DialogInterface;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class LU9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C314696ih A00;

    public LU9(C314696ih r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C314696ih r3 = this.A00;
        r3.A00 = true;
        LS7 A01 = LT8.A01(r3.A03);
        A01.A02.getClass();
        if (A01.A04) {
            Reel reel = A01.A02;
            List list = A01.A06;
            reel.A0X(list);
            A01.A02.A03 = DbZ.A0T(list, C51966G9m.A06(list)).A1A();
            Reel reel2 = A01.A02;
            String str = A01.A03;
            str.getClass();
            reel2.A0r = str;
            Reel reel3 = A01.A02;
            C63830L8l l8l = A01.A01;
            l8l.getClass();
            reel3.A0L = LS7.A00(l8l);
            Reel reel4 = A01.A02;
            C63830L8l l8l2 = A01.A01;
            l8l2.getClass();
            reel4.A0L = LS7.A00(l8l2);
            A01.A02 = null;
            A01.A04 = false;
        }
        r3.A04.CpD();
    }
}
