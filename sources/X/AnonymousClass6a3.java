package X;

import android.content.Context;
import android.view.MotionEvent;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6a3  reason: invalid class name */
public final class AnonymousClass6a3 implements C309916a4 {
    public C314756in A00;
    public final C273384mU A01;
    public final C317116mk A02;
    public final WeakReference A03;

    public final boolean DcE(C255783ui r2, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(motionEvent2, 1);
        return this.A02.Dq1(motionEvent, motionEvent2, f, f2);
    }

    public final void DA9(float f) {
        this.A02.DA9(f);
    }

    public final void DDL() {
        this.A01.CpD();
    }

    public final void DP2(float f, float f2) {
        this.A02.DP2(f, f2);
    }

    public final void DXv(Reel reel) {
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A01;
        C250973mM r2 = reelViewerFragment.A0a;
        if (r2 != null) {
            reelViewerFragment.A1E.EET(reelViewerFragment.A1E.CMG(reel));
            reelViewerFragment.A1E.EzG(reel, r2);
            reelViewerFragment.FK0(-1);
            reelViewerFragment.A1E.notifyDataSetChanged();
        }
    }

    public final void Dnq(C255773uh r3, C250973mM r4, C69061Ndy ndy, boolean z) {
        C273384mU r1 = this.A01;
        if (0qQ.A0K(((ReelViewerFragment) r1).A0a, r4) || z) {
            r1.D7R(r3, ndy);
        }
    }

    public final boolean Dps(float f, float f2) {
        return this.A02.Dps(f, f2);
    }

    public final boolean Dpu() {
        return this.A02.Dpu();
    }

    public final boolean Dpw() {
        return this.A02.Dpw();
    }

    public final void Dqb(float f, float f2) {
        this.A02.Dqb(f, f2);
    }

    public final void DvB(boolean z) {
        this.A02.DvB(z);
    }

    public AnonymousClass6a3(C273384mU r1, C317116mk r2, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A02 = r2;
        this.A01 = r1;
    }

    public final void CtG(Context context, C255773uh r6) {
        int A09 = (int) (((float) 0nA.A09(context)) * AnonymousClass4EQ.A00(context));
        int A092 = 0nA.A09(context);
        if (0mk.A02(context)) {
            A09 = A092 - A09;
        }
        this.A02.Dqb((float) (A09 + 1), 0.0f);
    }
}
