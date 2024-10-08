package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.2i0  reason: invalid class name */
public final class AnonymousClass2i0 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C226742hm A01;
    public final /* synthetic */ C226732hl A02;
    public final /* synthetic */ C226702hi A03;
    public final /* synthetic */ Object A04;

    public AnonymousClass2i0(View view, C226742hm r2, C226732hl r3, C226702hi r4, Object obj) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = obj;
        this.A00 = view;
        this.A03 = r4;
    }

    public final void run() {
        1Tq A002 = C226722hk.A00();
        C226742hm r8 = this.A01;
        C226732hl r9 = this.A02;
        Object obj = this.A04;
        View view = this.A00;
        A002.AUi(new Rect(0, 0, view.getWidth(), view.getHeight()), (ContextChain) null, (AnonymousClass6QN) null, (JLT) null, r8, r9, this.A03, (AnonymousClass579) null, obj);
    }
}
