package X;

public final class HF4 extends C249863kU {
    public final int A00;

    public HF4(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C251373n0 A02(Integer num, Object obj, int i) {
        switch (this.A00) {
            case 0:
                GV8 gv8 = (GV8) obj;
                DbY.A1S(gv8, num);
                return new IYO(gv8, num, i);
            case 1:
                C376509Ig r3 = (C376509Ig) obj;
                DbY.A1S(r3, num);
                return new C52564GXp(r3, num, i);
            case 4:
                GV8 gv82 = (GV8) obj;
                DbY.A1S(gv82, num);
                return new GV4(gv82, num, i);
            default:
                C376489Ie r32 = (C376489Ie) obj;
                DbY.A1S(r32, num);
                return new IYP(r32, num, i);
        }
    }
}
