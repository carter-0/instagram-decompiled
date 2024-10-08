package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: X.MsE  reason: case insensitive filesystem */
public final class C67678MsE extends TextureView {
    public final /* synthetic */ C71743Oq3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67678MsE(Context context, C71743Oq3 oq3) {
        super(context);
        this.A00 = oq3;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = AnonymousClass0fD.A05(-756837661);
        boolean z = false;
        0qQ.A0B(motionEvent, 0);
        super.onTouchEvent(motionEvent);
        if (isEnabled()) {
            this.A00.A04.invoke(motionEvent);
            z = true;
            i = -1639074059;
        } else {
            i = -2137337258;
        }
        AnonymousClass0fD.A0C(i, A05);
        return z;
    }
}
