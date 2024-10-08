package X;

import com.instagram.quicksand.QuickSandSolverBridge;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EHh  reason: case insensitive filesystem */
public final class C47796EHh extends 0ng {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C17959Vis A04;
    public QuickSandSolverBridge A05;
    public String A06;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.Vir, java.lang.Object] */
    public final void run() {
        String str;
        while (this.A00 < this.A01) {
            QuickSandSolverBridge quickSandSolverBridge = this.A05;
            if (quickSandSolverBridge.A02()) {
                break;
            }
            int i = this.A03;
            if (r2 == i) {
                ArrayList A0v = DbS.A0v(i);
                for (int A1M : quickSandSolverBridge.A03(this.A02, this.A06)) {
                    AnonymousClass7TF.A1M(A0v, A1M);
                }
                try {
                    String A022 = new C239023El("-").A02(A0v);
                    MessageDigest instance = MessageDigest.getInstance(AnonymousClass000.A00(2487));
                    instance.update(A022.getBytes());
                    byte[] digest = instance.digest();
                    str = 0mp.A06(002.A0c("%0", "x", digest.length << 1), new Object[]{new BigInteger(1, digest)});
                } catch (NoSuchAlgorithmException unused) {
                    str = new String();
                }
                this.A06 = str;
                C17959Vis vis = this.A04;
                synchronized (vis) {
                    List list = vis.A00;
                    ? obj = new Object();
                    obj.A00 = A0v;
                    list.add(obj);
                }
            } else {
                this.A00--;
            }
            this.A00++;
        }
        this.A05.A00();
    }
}
