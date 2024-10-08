package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.common.session.UserSession;

/* renamed from: X.WBt  reason: case insensitive filesystem */
public final class C18900WBt implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C18900WBt(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WW4 ww4;
        1Xj r1;
        Object obj;
        switch (this.A00) {
            case 0:
                return BugReportSevereSwitchView.A01((BugReportSevereSwitchView) this.A03, (UserSession) this.A02, (C49680F1n) this.A01, false);
            case 3:
                ww4 = ((C14372Tv1) this.A03).A03;
                r1 = ((HAR) this.A02).A01.A00;
                break;
            case 4:
                C296995qz r0 = (C296995qz) this.A02;
                0qQ.A0A(view);
                0qQ.A0A(motionEvent);
                return ((X8R) this.A01).DQs(motionEvent, view, r0, (1Xj) this.A03);
            case 5:
                ww4 = ((C14371Tv0) this.A03).A03;
                r1 = ((HAS) this.A02).A01;
                break;
            case 6:
                return false;
            default:
                ww4 = (WW4) this.A01;
                r1 = ((C52435GSn) this.A03).BPf();
                obj = this.A02;
                break;
        }
        obj = this.A01;
        0qQ.A0A(view);
        0qQ.A0A(motionEvent);
        return ww4.DQs(motionEvent, view, (C296995qz) obj, r1);
    }
}
