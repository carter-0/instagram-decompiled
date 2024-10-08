package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8AR  reason: invalid class name */
public final class AnonymousClass8AR extends C249403jg {
    public long A00;
    public final /* synthetic */ AnonymousClass8AL A01;

    public AnonymousClass8AR(AnonymousClass8AL r1) {
        this.A01 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A02;
        C380619Yw r1;
        int A03 = AnonymousClass0fD.A03(-1986743335);
        if (i == 1) {
            AnonymousClass8AL r0 = this.A01;
            C353308Hc r4 = r0.A03;
            if (r4 != null) {
                Iterator it = AnonymousClass8AL.A03(r0).iterator();
                while (it.hasNext()) {
                    C380619Yw.A00((C380619Yw) it.next(), true, true);
                }
                r4.A00.A03 = false;
            }
        } else if (i == 2) {
            AnonymousClass8AL r12 = this.A01;
            if (r12.A03 != null) {
                Iterator it2 = AnonymousClass8AL.A03(r12).iterator();
                while (it2.hasNext()) {
                    C380619Yw r13 = (C380619Yw) it2.next();
                    C380619Yw.A00(r13, r13.A07.isSelected(), true);
                }
            }
        } else if (i == 0) {
            AnonymousClass8AL r42 = this.A01;
            C353308Hc r14 = r42.A03;
            if (r42.A06 && r42.A0D && r14 != null) {
                r42.A06 = false;
                C353358Hh r02 = r14.A00;
                r02.A01 = true;
                int itemCount = r02.getItemCount();
                LinearLayoutManager linearLayoutManager = r42.A0K;
                if (itemCount > linearLayoutManager.A1b()) {
                    int A1b = linearLayoutManager.A1b();
                    while (true) {
                        if (A1b < linearLayoutManager.A1a()) {
                            r1 = null;
                            break;
                        }
                        C249703kE A0X = r42.A0P.A0X(A1b, false);
                        if (A0X instanceof C380619Yw) {
                            r1 = (C380619Yw) A0X;
                            break;
                        }
                        A1b--;
                    }
                    r42.A01 = r1;
                    if (r1 != null) {
                        r1.A02 = new C40322AaH(r42);
                    }
                }
                Runnable runnable = r42.A04;
                if (runnable != null) {
                    runnable.run();
                    r42.A04 = null;
                }
                r42.A05 = true;
            }
            if (r42.A02 == null) {
                AnonymousClass8AL.A06(r42);
                C353308Hc r15 = r42.A03;
                if (r15 != null) {
                    r15.A02(AnonymousClass8AL.A03(r42));
                }
                if (r42.A0D) {
                    AnonymousClass8AY r03 = r42.A0Q;
                    r03.getClass();
                    if (r03.A02.size() > 1 && (A02 = AnonymousClass8AL.A02(r42)) == 0) {
                        r42.EKg(1, A02);
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(1925274712, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        float f;
        int A03 = AnonymousClass0fD.A03(137571095);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        if (j > 0) {
            f = ((float) i) / ((float) (currentTimeMillis - j));
        } else {
            f = 0.0f;
        }
        AnonymousClass8AL r7 = this.A01;
        if (r7.A0P.getScrollState() != 0) {
            this.A00 = currentTimeMillis;
        }
        if (r7.A02 == null && r7.A03 != null) {
            if (r7.A0A) {
                AnonymousClass8AL.A05(r7);
            }
            int A02 = AnonymousClass8AL.A02(r7);
            if (r7.A0D) {
                if (A02 != 0) {
                    A02--;
                }
            }
            C353308Hc r0 = r7.A03;
            ArrayList A032 = AnonymousClass8AL.A03(r7);
            boolean z = r7.A07;
            C353358Hh r1 = r0.A00;
            if (r1.A00 != A02 && !r1.A03) {
                r1.A02(A02);
            }
            if (!z) {
                float f2 = f * 3.0f;
                Iterator it = A032.iterator();
                while (it.hasNext()) {
                    ((C380619Yw) it.next()).A01(f2);
                }
            }
        }
        AnonymousClass0fD.A0A(-635106984, A03);
    }
}
