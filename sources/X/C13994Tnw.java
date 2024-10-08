package X;

import android.content.Context;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.Tnw  reason: case insensitive filesystem */
public final class C13994Tnw implements C20870X1w {
    public final Context A00;

    public final void Cg2(1rN r3) {
        ThreadPoolExecutor A002 = 1rO.A00("EmojiCompatInitializer");
        A002.execute(new 1rQ(r3, this, A002));
    }

    public C13994Tnw(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
