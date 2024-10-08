package X;

public abstract class GQL {
    public static final void A00(GPU gpu, GQN gqn) {
        long j;
        if (!gpu.A0C && gpu.A0B) {
            gqn.A01();
        }
        if (!GPS.A02(gpu)) {
            0sn r6 = gpu.A02;
            if (r6 == null) {
                r6 = 0sn.A00;
            }
            int size = r6.size();
            for (int i = 0; i < size; i++) {
                GQT gqt = (GQT) r6.get(i);
                gqn.A02(gqt.A02, gqt.A00);
            }
            j = gpu.A0A;
            gqn.A02(j, gpu.A00);
        } else {
            j = gpu.A0A;
            if (j - gqn.A00 > 40) {
                gqn.A01();
            }
        }
        gqn.A00 = j;
    }
}
