package X;

import android.content.Intent;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.6ZY  reason: invalid class name */
public final class AnonymousClass6ZY implements AnonymousClass6ZZ {
    public UserSession A00;
    public C310016aI A01;
    public C314026hX A02;
    public final AnonymousClass4DU A03;
    public final C273384mU A04;
    public final C317116mk A05;
    public final WeakReference A06;

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(motionEvent2, 1);
        return this.A05.Dq1(motionEvent, motionEvent2, f, f2);
    }

    public final void Dw4(C255773uh r2, C250973mM r3, Integer num) {
        0qQ.A0B(num, 2);
        this.A05.Dw4(r2, r3, num);
    }

    public final void DIB() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A06.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            Intent A032 = AnonymousClass14B.A03.A00().A03(activity, 268533760);
            A032.setData(0cp.A03(AnonymousClass000.A00(3358)).buildUpon().appendQueryParameter(DatePickerDialogModule.ARG_MODE, C391389so.LIVE.toString()).build());
            UserSession userSession = this.A00;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            C71342cb.A00(userSession).A0D(this.A03, "live_end_screen_pivot", fragment.getParentFragmentManager().A0M());
            0kR.A0B(activity, A032);
        }
    }

    public final void DNs() {
        this.A04.CpD();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0.A00 != r4.A1E.CMG(r8.A0H)) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DO0(X.C255773uh r7, X.C250973mM r8, X.C305836Jt r9, boolean r10) {
        /*
            r6 = this;
            X.4mU r5 = r6.A04
            r4 = r5
            instagram.features.stories.fragment.ReelViewerFragment r4 = (instagram.features.stories.fragment.ReelViewerFragment) r4
            X.3mM r3 = r4.A0a
            if (r3 != r8) goto L_0x0023
            X.6hX r0 = r6.A02
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "reelChromeAnimationManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            int r2 = r0.A00
            com.instagram.model.reels.Reel r1 = r8.A0H
            X.4gh r0 = r4.A1E
            int r0 = r0.CMG(r1)
            if (r2 == r0) goto L_0x0028
        L_0x0023:
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.ERT(r0)
        L_0x0028:
            if (r3 == r8) goto L_0x002c
            if (r10 == 0) goto L_0x002f
        L_0x002c:
            r5.D7R(r7, r9)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZY.DO0(X.3uh, X.3mM, X.6Jt, boolean):void");
    }

    public final void DO1(C255773uh r2, C250973mM r3, boolean z) {
        C310016aI r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else if (z) {
            r0.A09(r2, r3);
        }
    }

    public final boolean Dps(float f, float f2) {
        return this.A05.Dps(f, f2);
    }

    public final boolean Dpu() {
        return this.A05.Dpu();
    }

    public final boolean Dpw() {
        return this.A05.Dpw();
    }

    public final void Dqb(float f, float f2) {
        this.A05.Dqb(f, f2);
    }

    public final void Dxe(boolean z) {
        C305836Jt r2;
        C316026kz Aui = this.A04.Aui();
        if ((Aui instanceof C305836Jt) && (r2 = (C305836Jt) Aui) != null) {
            UserSession userSession = this.A00;
            if (z) {
                if (userSession != null) {
                    JZP.A02(r2);
                    return;
                }
            } else if (userSession != null) {
                r2.A01();
                r2.A03(true);
                return;
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public AnonymousClass6ZY(AnonymousClass4DU r1, C273384mU r2, C317116mk r3, WeakReference weakReference) {
        this.A06 = weakReference;
        this.A05 = r3;
        this.A04 = r2;
        this.A03 = r1;
    }
}
