package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.W2e  reason: case insensitive filesystem */
public final class C18796W2e {
    public static int A00 = Integer.MAX_VALUE;
    public static final Handler A01 = AnonymousClass7TF.A0D();
    public static final int A02 = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    public static volatile VQX A03;

    public static VQX A00() {
        if (A03 == null) {
            synchronized (C18796W2e.class) {
                if (A03 == null) {
                    A03 = new VQX(A02);
                }
            }
        }
        return A03;
    }

    public static void A01(C20368Wq8 wq8) {
        int i = A00;
        A00 = i - 1;
        wq8.A00 = ((long) i) << 32;
        wq8.A02 = null;
        wq8.A01 = 0;
        A00().A00.add(wq8);
    }

    public static void A02(C20368Wq8 wq8, String str) {
        int i = A00;
        A00 = i - 1;
        wq8.A00 = ((long) i) << 32;
        wq8.A02 = str;
        wq8.A01 = 0;
        A00().A00.add(wq8);
    }

    public static void A03(String str) {
        BlockingQueue<C20368Wq8> blockingQueue = A00().A00;
        for (C20368Wq8 wq8 : blockingQueue) {
            if (str.equals(wq8.A02)) {
                blockingQueue.remove(wq8);
                if (wq8 instanceof UHH) {
                    ((UHH) wq8).A05.A04();
                } else if (wq8 instanceof UHF) {
                    2R6.A09.release();
                }
            }
        }
    }
}
