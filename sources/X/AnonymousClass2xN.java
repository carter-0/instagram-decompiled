package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2xN  reason: invalid class name */
public final class AnonymousClass2xN {
    public WeakReference A00;
    public WeakReference A01;
    public boolean A02;
    public final UserSession A03;
    public final boolean A04;

    public final boolean A00(MotionEvent motionEvent) {
        C232722uK r0;
        if (!this.A02 && !C228092km.A00(this.A03).A0H) {
            WeakReference weakReference = this.A00;
            C238133Ar r6 = null;
            if (weakReference == null || (r0 = (C232722uK) weakReference.get()) == null || r0.A06 == AnonymousClass05K.A00) {
                WeakReference weakReference2 = this.A01;
                if (weakReference2 != null) {
                    r6 = (C238133Ar) weakReference2.get();
                }
                if (motionEvent != null && r6 != null && this.A04) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    int[] iArr = new int[2];
                    int B6L = r6.B6L();
                    int BLQ = r6.BLQ();
                    if (B6L <= BLQ) {
                        while (true) {
                            View AnE = r6.AnE(B6L);
                            if (AnE != null && (AnE.getTag() instanceof C240733Ma)) {
                                AnE.getLocationOnScreen(iArr);
                                int i = iArr[0];
                                int i2 = iArr[1];
                                int width = AnE.getWidth() + i;
                                int height = AnE.getHeight() + i2;
                                if (rawX >= ((float) i) && rawX <= ((float) width) && rawY >= ((float) i2) && rawY <= ((float) height)) {
                                    break;
                                }
                            }
                            if (B6L == BLQ) {
                                break;
                            }
                            B6L++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public AnonymousClass2xN(UserSession userSession) {
        this.A03 = userSession;
        this.A04 = AnonymousClass2xO.A01(userSession);
    }
}
