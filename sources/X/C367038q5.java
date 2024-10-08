package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.8q5  reason: invalid class name and case insensitive filesystem */
public final class C367038q5 implements C357708Zh {
    public int A00 = -1;
    public Runnable A01;
    public boolean A02;
    public final View A03;
    public final AnonymousClass861 A04;
    public final C3510387i A05;
    public final C3499582p A06;
    public final C3506685r A07;
    public final AnonymousClass869 A08;
    public final AnonymousClass0eK A09;

    public C367038q5(View view, FragmentActivity fragmentActivity, C3510387i r6, C3499582p r7, C3506685r r8, AnonymousClass869 r9, AnonymousClass0eK r10) {
        0qQ.A0B(view, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r7, 5);
        0qQ.A0B(r10, 6);
        0qQ.A0B(fragmentActivity, 7);
        this.A03 = view;
        this.A08 = r9;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        AnonymousClass861 A002 = new 2YN(fragmentActivity).A00(AnonymousClass860.class).A00("post_capture");
        this.A04 = A002;
        this.A01 = new C367048q6(this);
        A002.A0A.A06(fragmentActivity, new C367058q7(new C377089Km(this, 9)));
    }

    public final /* synthetic */ int B85() {
        return 0;
    }

    public final int Bd7() {
        int A0E;
        AnonymousClass4M3 r0;
        int i;
        int BV1;
        C3499482o r3 = this.A06.A02;
        if (r3.A01() == C365758nd.A07) {
            C349307zv A042 = r3.A01.A04();
            if (A042 != null) {
                int i2 = A042.A0H;
                if (i2 > 0) {
                    A0E = A042.A06 - i2;
                } else {
                    A0E = ((AnonymousClass8LU) this.A09.get()).A0E();
                }
                if (A0E >= 0 || ((r0 = this.A05.A0P.A01) != null && (A0E = r0.AzN()) >= 0)) {
                    return A0E;
                }
                C3506785t A022 = this.A07.A02();
                if (A022.CKF() && (BV1 = A022.BV1()) >= 0) {
                    return BV1;
                }
                AnonymousClass869 r1 = this.A08;
                if (!r1.A03 || (i = r1.A01) < 0) {
                    return -1;
                }
                return i;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return -1;
    }

    public final int CEG() {
        int i;
        int i2;
        int BUw;
        int currentPositionMs;
        C378459Pw r0;
        C3499482o r2 = this.A06.A02;
        if (r2.A01() == C365758nd.A07) {
            C349307zv A042 = r2.A01.A04();
            if (A042 != null) {
                i = A042.A0H;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            i = 0;
        }
        C378369Pn r02 = ((AnonymousClass8LU) this.A09.get()).A0B;
        if (r02 == null || (r0 = r02.A08) == null) {
            i2 = -1;
        } else {
            i2 = r0.A07();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            AnonymousClass4M3 r03 = this.A05.A0P.A01;
            if (r03 != null && (currentPositionMs = r03.getCurrentPositionMs()) >= 0) {
                return currentPositionMs;
            }
            C3506785t A022 = this.A07.A02();
            i3 = -1;
            if (A022.CKF() && (BUw = A022.BUw() - A022.BV2()) >= 0) {
                return BUw;
            }
            int A002 = this.A08.A00();
            if (A002 >= 0) {
                return A002;
            }
        }
        return i3;
    }

    public final void Exh() {
        if (!this.A02) {
            this.A02 = true;
            View view = this.A03;
            Runnable runnable = this.A01;
            if (runnable == null) {
                0qQ.A0F("timeRunnable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view.postOnAnimation(runnable);
            }
        }
    }

    public final void EyM() {
        if (this.A02) {
            this.A02 = false;
            View view = this.A03;
            Runnable runnable = this.A01;
            if (runnable == null) {
                0qQ.A0F("timeRunnable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view.removeCallbacks(runnable);
            }
        }
    }

    public final /* synthetic */ int getDurationInMs() {
        return 0;
    }

    public final void onDestroyView() {
        this.A04.A0G.A0B(AnonymousClass861.A0O);
        EyM();
    }
}
