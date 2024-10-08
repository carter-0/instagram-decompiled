package X;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Oln  reason: case insensitive filesystem */
public final class C71498Oln implements C13907Tl7, AnonymousClass07Y {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71498Oln(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r3) {
        OG1 og1;
        if (this.A00 != 0 && (og1 = (OG1) this.A02) != null) {
            View view = og1.A01;
            if (view != null && view.getVisibility() == 0) {
                AnonymousClass7TH.A0R(og1.A01);
            }
            og1.A00 = null;
            og1.A01 = null;
            og1.A02 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void onResume(AnonymousClass07Z r6) {
        if (this.A00 != 0) {
            OG1 og1 = (OG1) this.A02;
            if (og1 != null) {
                NJA nja = (NJA) this.A01;
                0qQ.A0B(nja, 0);
                og1.A02 = nja;
                if (og1.A01 == null) {
                    og1.A01 = og1.A04.requireViewById(R.id.scrim_screen_overlay);
                    og1.A00 = new GestureDetector(og1.A03, new C67671Ms7(og1));
                    View view = og1.A01;
                    if (view != null) {
                        C71439Oke.A01(view, 5, og1);
                    }
                }
                View view2 = og1.A01;
                if (view2 != null) {
                    view2.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        Handler.createAsync(Looper.getMainLooper()).postDelayed(new Object(), 500);
        ((AnonymousClass07V) this.A02).A0A(this);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }
}
