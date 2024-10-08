package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Xb7 {
    public int A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final OUV A03;
    public final Runnable A04 = new Y1m(this);
    public final Runnable A05 = new Y1n(this);
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AudioManager A07;

    public Xb7(Context context, AudioManager audioManager, OUV ouv) {
        this.A01 = context;
        this.A07 = audioManager;
        this.A03 = ouv;
    }
}
