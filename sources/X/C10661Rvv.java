package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.Rvv  reason: case insensitive filesystem */
public final class C10661Rvv {
    public final File A00;
    public final File A01;
    public final File A02;
    public final Random A03 = new Random();

    public C10661Rvv(File file) {
        this.A00 = file;
        this.A02 = JTO.A0s(file, "beacon_id.lock");
        this.A01 = JTO.A0s(file, "beacon_id");
    }
}
