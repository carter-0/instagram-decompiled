package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Du4  reason: case insensitive filesystem */
public final class C47276Du4 extends C232922uf {
    public final /* synthetic */ C46719Djq A00;

    public final void DmE(2cs r6) {
        0qQ.A0B(r6, 0);
        C46719Djq djq = this.A00;
        Drawable drawable = djq.A02;
        if (drawable != null) {
            drawable.setAlpha((int) r6.A09.A00);
        }
        djq.invalidate();
    }

    public C47276Du4(C46719Djq djq) {
        this.A00 = djq;
    }
}
