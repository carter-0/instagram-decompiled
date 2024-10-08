package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Fpc  reason: case insensitive filesystem */
public final class C51166Fpc implements Runnable {
    public final /* synthetic */ AnonymousClass3M3 A00;

    public C51166Fpc(AnonymousClass3M3 r1) {
        this.A00 = r1;
    }

    public final void run() {
        ViewGroup viewGroup;
        AnonymousClass3M3 r3 = this.A00;
        ImmutableMap immutableMap = AnonymousClass3M3.A0U;
        r3.A04.getClass();
        Throwable A05 = r3.A04.A05();
        if (A05 == null) {
            A05 = new Throwable("Bloks Request Error");
        }
        C268664dn r2 = new C268664dn(A05);
        String str = r3.A0G;
        if (!(r3.A09 == null || str == null)) {
            C48723Ej8.A00(r2, "AsyncScreen", str);
        }
        View view = r3.A00;
        if (!(view == null || (viewGroup = (ViewGroup) r3.mView) == null)) {
            viewGroup.removeView(view);
        }
        C71662eb r0 = r3.A0F;
        if (r0 == null) {
            G8K g8k = r3.A06;
            if (g8k != null) {
                g8k.CmM("component_missing");
            }
        } else {
            r0.A01().setVisibility(0);
        }
        F3o f3o = r3.A0B;
        if (f3o != null) {
            f3o.A04(r2);
        }
    }
}
