package X;

import android.media.SoundPool;

/* renamed from: X.OgX  reason: case insensitive filesystem */
public final class C71266OgX implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ C71765OqR A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ C62320sa A03;

    public C71266OgX(C71765OqR oqR, String str, C62320sa r3, C62320sa r4) {
        this.A00 = oqR;
        this.A01 = str;
        this.A03 = r3;
        this.A02 = r4;
    }

    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        C62320sa r0;
        if (i2 == 0) {
            Integer valueOf = Integer.valueOf(i);
            C71765OqR oqR = this.A00;
            oqR.A05.put(this.A01, valueOf);
            oqR.A00 = i;
            r0 = this.A03;
        } else {
            this.A00.A00 = -1;
            r0 = this.A02;
        }
        r0.invoke();
    }
}
