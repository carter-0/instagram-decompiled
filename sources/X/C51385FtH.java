package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.FtH  reason: case insensitive filesystem */
public final class C51385FtH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FZH A01;

    public C51385FtH(FZH fzh, int i) {
        this.A01 = fzh;
        this.A00 = i;
    }

    public final void run() {
        C49634Ezr ezr = (C49634Ezr) this.A01.A01;
        int i = this.A00;
        View view = ezr.A03;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float height = (float) (iArr[1] + view.getHeight());
        Context context = view.getContext();
        float A002 = height + 0nA.A00(context, 8.0f) + ((float) ezr.A02);
        float A08 = (float) (0nA.A08(context) - i);
        if (A002 > A08) {
            ezr.A04.smoothScrollBy(0, (int) (A002 - A08));
        }
    }
}
