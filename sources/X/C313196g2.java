package X;

import androidx.fragment.app.Fragment;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6g2  reason: invalid class name and case insensitive filesystem */
public final class C313196g2 implements C313206g3 {
    public final C273384mU A00;
    public final C273404mW A01;
    public final WeakReference A02;

    public final /* bridge */ /* synthetic */ void DK9(Object obj, float f) {
        C255773uh r3 = (C255773uh) obj;
        0qQ.A0B(r3, 0);
        Fragment fragment = (Fragment) this.A02.get();
        if (fragment != null && fragment.getContext() != null) {
            C309426Yf Bz3 = ((C310566bG) ((ReelViewerFragment) this.A00).A1E).A0B.Bz3(r3);
            if (f != f || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
                f = Bz3.A0A;
            }
            Bz3.A0A = f;
        }
    }

    public final /* bridge */ /* synthetic */ void DKA(Object obj, double d) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        ((C310566bG) ((ReelViewerFragment) this.A00).A1E).A0B.Bz3(r2).A03 = d;
    }

    public final /* bridge */ /* synthetic */ void DKB(Object obj) {
        C313056fm r2;
        Fragment fragment = (Fragment) this.A02.get();
        if (fragment != null && fragment.getContext() != null && (r2 = ((ReelViewerFragment) this.A00).mViewPager) != null) {
            r2.EJb(new AnonymousClass9LR(obj, 28));
        }
    }

    public final /* bridge */ /* synthetic */ void DaM(Object obj) {
        this.A01.DaM(obj);
    }

    public final /* bridge */ /* synthetic */ void DaO(Object obj) {
        this.A01.DaO(obj);
    }

    public final /* bridge */ /* synthetic */ void DaT(Object obj, float f) {
        this.A01.DaT(obj, f);
    }

    public C313196g2(C273384mU r1, C273404mW r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = weakReference;
    }
}
