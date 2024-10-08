package X;

import java.util.Locale;

public final class XEU implements C231452rh {
    public final /* synthetic */ C67005Mgd A00;

    public XEU(C67005Mgd mgd) {
        this.A00 = mgd;
    }

    public final void D1O(int i, int i2, Object obj) {
        String.format(Locale.US, "onChanged(%d, %d)", C51968G9o.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.D1O(i, i2, obj);
    }

    public final void DKr(int i, int i2) {
        String.format(Locale.US, "onInserted(%d, %d)", C51968G9o.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.DKr(i, i2);
    }

    public final void DSU(int i, int i2) {
        String.format(Locale.US, "onMoved(%d, %d)", C51968G9o.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.DSU(i, i2);
    }

    public final void Ddf(int i, int i2) {
        String.format(Locale.US, "onRemoved(%d, %d)", C51968G9o.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.Ddf(i, i2);
    }
}
