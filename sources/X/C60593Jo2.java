package X;

import android.view.View;

/* renamed from: X.Jo2  reason: case insensitive filesystem */
public final class C60593Jo2 extends C249703kE {
    public final MVS A00;
    public final /* synthetic */ C62136Kan A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60593Jo2(View view, C62136Kan kan, MVS mvs) {
        super(view);
        0qQ.A0B(view, 2);
        this.A01 = kan;
        this.A00 = mvs;
        view.post(new M71(this, kan));
    }
}
