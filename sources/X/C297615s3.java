package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5s3  reason: invalid class name and case insensitive filesystem */
public final class C297615s3 implements View.OnTouchListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ AnonymousClass49Q A02;
    public final /* synthetic */ C297595s1 A03;

    public C297615s3(Context context, AnonymousClass0iw r2, AnonymousClass49Q r3, C297595s1 r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass49Q r1 = this.A02;
        C297595s1 r0 = this.A03;
        C267324bN r5 = r0.A01;
        if (r5 != null) {
            0qQ.A0A(view);
            MotionEvent motionEvent2 = motionEvent;
            0qQ.A0A(motionEvent);
            int bindingAdapterPosition = r0.getBindingAdapterPosition();
            return r1.D1B(this.A00, motionEvent2, view, r5, this.A01, bindingAdapterPosition);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
