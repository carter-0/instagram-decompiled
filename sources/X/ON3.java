package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

public final class ON3 {
    public float A00 = 0.4f;
    public int A01 = 3;
    public int A02 = 0;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07 = AnonymousClass05K.A00;
    public Integer A08;
    public Integer A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = true;
    public boolean A0G = false;
    public final int A0H;
    public final Context A0I;
    public final String A0J;
    public final List A0K;

    public final C244323b0 A00() {
        if (this.A09 == null) {
            this.A09 = Integer.valueOf(DbS.A02(this.A0I, 2));
        }
        if (this.A08 == null) {
            try {
                Context context = this.A0I;
                this.A08 = DbV.A0n(context, 2Yu.A0C(context));
            } catch (Resources.NotFoundException e) {
                Context context2 = this.A0I;
                2Yn.A03(context2, e);
                context2.getTheme().applyStyle(2Yn.A00(), true);
                this.A08 = DbV.A0n(context2, 2Yu.A0C(context2));
            }
        }
        if (this.A05 == null) {
            this.A05 = DbV.A0n(this.A0I, R.color.grey_5);
        }
        if (this.A04 == null) {
            this.A04 = this.A08;
        }
        Integer num = this.A03;
        if (num == null) {
            num = DbV.A0n(this.A0I, R.color.grey_5);
            this.A03 = num;
        }
        Context context3 = this.A0I;
        List list = this.A0K;
        int i = this.A0H;
        boolean z = this.A0G;
        Integer num2 = this.A07;
        boolean z2 = this.A0B;
        boolean z3 = this.A0F;
        boolean z4 = this.A0D;
        float f = this.A00;
        int intValue = this.A09.intValue();
        int intValue2 = this.A08.intValue();
        int i2 = this.A01;
        int i3 = this.A02;
        int intValue3 = this.A05.intValue();
        int intValue4 = this.A04.intValue();
        boolean z5 = this.A0A;
        int intValue5 = num.intValue();
        Integer num3 = this.A06;
        boolean z6 = this.A0C;
        return C244293ax.A00(context3, (Drawable) null, num2, (Integer) null, (Integer) null, (Integer) null, num3, (Integer) null, this.A0J, list, f, i, intValue, intValue2, i2, i3, intValue3, intValue4, intValue5, z, z2, z3, z4, z5, z6, this.A0E, true);
    }

    public ON3(Context context, String str, List list, int i) {
        this.A0I = context;
        this.A0K = list;
        this.A0H = i;
        this.A0J = str;
    }

    public final void A01(int i) {
        this.A09 = Integer.valueOf(i);
    }
}
