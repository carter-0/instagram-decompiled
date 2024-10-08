package X;

public abstract class Q2T {
    public static Q2S A00(C13503TbU tbU) {
        Q2R q2r = new Q2R();
        Q2S q2s = new Q2S(q2r);
        q2r.A00 = q2s;
        q2r.A02 = tbU.getClass();
        try {
            q2r.A02 = tbU.ACq(q2r);
            return q2s;
        } catch (Exception e) {
            q2s.A00.A07(e);
            return q2s;
        }
    }
}
