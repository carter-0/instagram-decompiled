package X;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class VQV {
    public int A00;
    public final Lock A01 = new ReentrantLock();
}
