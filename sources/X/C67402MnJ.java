package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.MnJ  reason: case insensitive filesystem */
public final class C67402MnJ implements AnonymousClass2eo {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C14450TwY A01;

    public C67402MnJ(View view, C14450TwY twY) {
        this.A00 = view;
        this.A01 = twY;
    }

    public final void Ann(Rect rect) {
        Context context = this.A00.getContext();
        0qQ.A07(context);
        rect.set(AnonymousClass972.MUTABLE_FLAG_MASK, 0nA.A08(context) - this.A01.A00, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
