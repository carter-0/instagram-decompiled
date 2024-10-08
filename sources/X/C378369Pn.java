package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9Pn  reason: invalid class name and case insensitive filesystem */
public final class C378369Pn implements View.OnClickListener, C353998Kg, MXP, B28 {
    public static final Matrix4 A0R = new Matrix4();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C379139Sq A05;
    public C359318cb A06;
    public C41838B2t A07;
    public C378459Pw A08;
    public AnonymousClass3Q2 A09;
    public AnonymousClass9R7 A0A;
    public Runnable A0B;
    public Runnable A0C;
    public Runnable A0D;
    public boolean A0E;
    public long A0F;
    public AnonymousClass8MA A0G;
    public C39888ADk A0H;
    public String A0I;
    public boolean A0J;
    public final Context A0K;
    public final UserSession A0L;
    public final Map A0M;
    public final Set A0N;
    public final C41843B2y A0O;
    public final C267834cI A0P;
    public final Integer A0Q;

    public final void A00() {
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A08().A00.A00();
        }
    }

    public final void A01() {
        AnonymousClass9RF r0;
        C378459Pw r1 = this.A08;
        if (r1 != null) {
            if (r1 instanceof C388789oO) {
                r0 = ((C388789oO) r1).A06;
            } else {
                r0 = ((C378809Rh) r1).A0E;
            }
            r0.A00.A01();
        }
        this.A04 = this.A03;
    }

    public final void A02() {
        C378459Pw r8 = this.A08;
        if (r8 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.A0F > 35) {
                r8.A08().A00.A03((Long) null);
                this.A0F = currentTimeMillis;
            }
        }
    }

    public final void A03() {
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            AnonymousClass9RG r2 = r0.A08().A00;
            Object obj = r2.A06;
            synchronized (obj) {
                r2.A0E = false;
                obj.notify();
            }
        }
    }

    public final void A04() {
        C39888ADk aDk = this.A0H;
        if (aDk != null) {
            View view = aDk.A00;
            if (view != null) {
                view.clearAnimation();
                aDk.A00.setVisibility(4);
            }
            AnonymousClass7TF.A16(aDk.A01);
        }
    }

    public final void A05(A67 a67, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        AnonymousClass9RE r1 = new AnonymousClass9RE(a67, this, runnable, runnable2, runnable3, runnable4);
        this.A07 = r1;
        this.A0C = runnable;
        this.A0D = runnable2;
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A04 = r1;
        }
    }

    public final void A06(C41838B2t b2t) {
        this.A07 = b2t;
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A04 = b2t;
        }
    }

    public final void A07(C352278Cs r2) {
        this.A0N.add(r2);
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A0A.add(r2);
        }
    }

    public final void A08(AnonymousClass3Q2 r3, int i) {
        this.A09 = r3;
        this.A04 = i;
        C378459Pw r1 = this.A08;
        if (r1 != null) {
            r1.A0J(this.A0L, r3, i);
        }
    }

    public final void A09(boolean z) {
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A0M(z);
        }
    }

    public final VideoFilter B5q() {
        AnonymousClass9T0 A082;
        AnonymousClass9R7 r0;
        C378459Pw r02 = this.A08;
        if (r02 == null || (A082 = r02.A08()) == null) {
            return null;
        }
        if (A082 instanceof C388779oN) {
            r0 = ((C388779oN) A082).A02;
        } else {
            r0 = ((C388769oM) A082).A01;
        }
        if (r0 == null) {
            return null;
        }
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(1058));
    }

    public final boolean CnC() {
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            return r0.A0O();
        }
        return false;
    }

    public final void Ddj(AnonymousClass9RG r20, AnonymousClass9R7 r21) {
        UserSession userSession;
        AnonymousClass9RG r9 = r20;
        AnonymousClass9R7 r10 = r21;
        if (this.A0Q == AnonymousClass05K.A01) {
            Context context = this.A0K;
            C39888ADk aDk = this.A0H;
            boolean z = this.A0E;
            boolean z2 = this.A0J;
            userSession = this.A0L;
            A41 a41 = new A41(this);
            C41843B2y b2y = this.A0O;
            this.A08 = new C388789oO(context, this.A0G, userSession, b2y, a41, aDk, r9, r10, this.A0I, z, z2);
            b2y.Dwo();
        } else {
            Context context2 = this.A0K;
            C39888ADk aDk2 = this.A0H;
            boolean z3 = this.A0E;
            boolean z4 = this.A0J;
            userSession = this.A0L;
            this.A08 = new C378809Rh(context2, userSession, aDk2, r9, r10, z3, z4);
        }
        AnonymousClass9T1 r2 = new AnonymousClass9T1(this);
        C267834cI r0 = this.A0P;
        if (r0 == null) {
            PendingMediaStoreSerializer A002 = 28E.A00(userSession);
            A002.A06(r2);
            A002.A03();
        } else {
            r0.EBv(r2);
        }
        this.A0A = r10;
    }

    public final void Ddk() {
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A04 = null;
            r0.A08().A00.A00();
            this.A08 = null;
        }
        this.A0M.clear();
    }

    public final void EEp() {
        C378459Pw r0 = this.A08;
        if (r0 != null) {
            r0.A0D();
        }
    }

    public C378369Pn(Context context, AnonymousClass8MA r4, UserSession userSession, C41843B2y b2y, C39888ADk aDk, C267834cI r8, Integer num, String str, boolean z, boolean z2) {
        this.A0M = AnonymousClass7TE.A1E();
        this.A0N = AnonymousClass7TE.A1F();
        this.A00 = -1;
        this.A01 = 100;
        this.A03 = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0K = context;
        this.A0P = r8;
        this.A0H = aDk;
        this.A0E = z;
        this.A0J = z2;
        this.A0L = userSession;
        this.A0O = b2y;
        this.A0Q = num;
        this.A0G = r4;
        this.A0I = str;
    }

    public final void onClick(View view) {
        View view2;
        View view3;
        C13862Tii tii;
        int A052 = AnonymousClass0fD.A05(1928524615);
        C378459Pw r5 = this.A08;
        if (r5 != null) {
            if (r5 instanceof C388789oO) {
                C388789oO r52 = (C388789oO) r5;
                STU stu = r52.A05;
                if (stu == null || (tii = stu.A04) == null || !tii.isPlaying()) {
                    r52.A0D();
                } else {
                    r52.A0M(false);
                }
            } else {
                C378809Rh r53 = (C378809Rh) r5;
                Object obj = r53.A0C;
                0qQ.A06(obj);
                synchronized (obj) {
                    if (r53.A0D && !r53.A0O()) {
                        if (!r53.A06) {
                            C39888ADk aDk = r53.A07;
                            if (!(aDk == null || (view3 = aDk.A01) == null)) {
                                view3.setVisibility(4);
                            }
                            r53.A09 = true;
                            if (r53.A08) {
                                AnonymousClass4MM r0 = r53.A04;
                                if (r0 != null) {
                                    r0.pause();
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } else {
                                r53.A05 = AnonymousClass05K.A0C;
                                C378809Rh.A04(r53, C378809Rh.A00(r53), false);
                            }
                            C41838B2t b2t = r53.A04;
                            if (b2t != null) {
                                b2t.DyY();
                            }
                            if (!(aDk == null || (view2 = aDk.A00) == null)) {
                                view2.clearAnimation();
                                aDk.A00.setVisibility(0);
                                View view4 = aDk.A00;
                                Animation animation = aDk.A02;
                                animation.getClass();
                                view4.startAnimation(animation);
                            }
                        } else if (r53.A07) {
                            C378809Rh.A01(r53);
                        } else {
                            r53.A0A();
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0C(2120000117, A052);
    }

    public final void EWp(int i) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C378369Pn(android.content.Context r12, com.instagram.common.session.UserSession r13, X.C39888ADk r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            r11 = this;
            r1 = r12
            boolean r0 = r12 instanceof X.C267834cI
            if (r0 == 0) goto L_0x0019
            r6 = r1
            X.4cI r6 = (X.C267834cI) r6
        L_0x0008:
            X.B2y r4 = X.C378459Pw.A0E
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r2 = 0
            r0 = r11
            r3 = r13
            r5 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0019:
            r6 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378369Pn.<init>(android.content.Context, com.instagram.common.session.UserSession, X.ADk, java.lang.String, boolean, boolean):void");
    }
}
