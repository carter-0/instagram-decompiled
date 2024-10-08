package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IDc  reason: case insensitive filesystem */
public final class C56805IDc implements View.OnTouchListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C317286n1 A04;

    public C56805IDc(Context context, AnonymousClass0iw r2, UserSession userSession, C255773uh r4, C317286n1 r5) {
        this.A04 = r5;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A04.DrK(this.A00, this.A01, this.A02, this.A03);
        }
        return true;
    }
}
