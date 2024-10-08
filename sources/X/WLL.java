package X;

public final class WLL implements X2w {
    public String A00;

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        boolean z;
        WM1 wm1 = (WM1) C17133VJi.A00.get(obj);
        if (wm1 != null) {
            z = wm1.A00.contains(this.A00);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
