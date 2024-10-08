package X;

import android.app.Fragment;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.2tp  reason: invalid class name and case insensitive filesystem */
public abstract class C232502tp {
    public final Context A00;
    public final AnonymousClass07Z A01;
    public final 16f A02;
    public final UserSession A03;
    public final C231502rm A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final 0sP A08;
    public final 0sP A09;
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ C232502tp(Context context, AnonymousClass07Z r8, UserSession userSession, String str, 0sP r11, 0sP r12, int i) {
        C231502rm r3 = null;
        str = (i & 8) != 0 ? "" : str;
        r11 = (i & 32) != 0 ? null : r11;
        r12 = (i & 64) != 0 ? null : r12;
        r3 = (i & 128) != 0 ? C231492rl.A00(userSession) : r3;
        0qQ.A0B(str, 4);
        0qQ.A0B(r3, 8);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = r8;
        this.A08 = r11;
        this.A09 = r12;
        this.A04 = r3;
        this.A07 = AnonymousClass0eN.A01(C232512tq.A00);
        this.A06 = AnonymousClass0eN.A01(new AnonymousClass9LL(this, 14));
        if (!(r8 instanceof Fragment) && !(r8 instanceof androidx.fragment.app.Fragment)) {
            StringBuilder sb = new StringBuilder();
            sb.append("LifecycleOwner is not a fragment: ");
            sb.append(r8);
            0KC.A0D("LithoBinder", sb.toString());
            0f9 AEf = 0wj.A00.AEf("LithoBinderLifecycleOwner", 817891147);
            AEf.ABQ("lifecycle_owner", r8.toString());
            AEf.report();
        }
        if (r3.A0B) {
            C232522tr r2 = new C232522tr(this);
            if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                r8.getLifecycle().A09(r2);
            } else {
                new Handler(Looper.getMainLooper()).post(new C57865Ihi(r2, this));
            }
        }
        this.A05 = AnonymousClass0eN.A01(new AnonymousClass9LL(this, 13));
        Object value = r3.A08.getValue();
        0qQ.A07(value);
        this.A0B = ((Boolean) value).booleanValue();
        UserSession userSession2 = r3.A02;
        0Tu r22 = 0Tu.A05;
        int A012 = ((int) 182.A01(r22, userSession2, 36598700524965115L)) + ((int) 182.A01(r22, userSession2, 36598700525030652L));
        Object value2 = r3.A07.getValue();
        0qQ.A07(value2);
        this.A0A = ((Boolean) value2).booleanValue();
        this.A02 = new C232532ts(this, A012 / 2 <= 0 ? 40 : A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.facebook.litho.LithoView r6, java.lang.String r7, X.C62320sa r8, X.C62320sa r9, X.C62320sa r10) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 4
            X.0qQ.A0B(r10, r0)
            X.16f r4 = r5.A02
            java.lang.Object r0 = r4.A02(r7)
            X.3X2 r0 = (X.AnonymousClass3X2) r0
            if (r0 != 0) goto L_0x0034
            com.instagram.common.session.UserSession r0 = r5.A03
            X.1Zn r3 = X.1Zm.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0H
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            r0 = 0
            X.1Zp r0 = r3.A00(r2, r1, r0, r0)
            r0.A00()
            r5.A07(r7, r8, r9, r10)
            java.lang.Object r0 = r4.A02(r7)
            X.3X2 r0 = (X.AnonymousClass3X2) r0
            if (r0 == 0) goto L_0x003a
        L_0x0034:
            com.facebook.litho.ComponentTree r1 = r0.A01
            r0 = 1
            r6.A0k(r1, r0)
        L_0x003a:
            r5.A06(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232502tp.A05(com.facebook.litho.LithoView, java.lang.String, X.0sa, X.0sa, X.0sa):void");
    }

    public void A06(LithoView lithoView, C62320sa r2) {
    }

    public final void A07(String str, C62320sa r17, C62320sa r18, C62320sa r19) {
        boolean z;
        AnonymousClass07Z r11;
        String str2 = str;
        0qQ.A0B(str2, 1);
        C62320sa r2 = r19;
        0qQ.A0B(r2, 4);
        int intValue = ((Number) r17.invoke()).intValue();
        16f r6 = this.A02;
        synchronized (r6) {
            z = false;
            if (r6.A07.get(str2) != null) {
                z = true;
            }
        }
        Context context = this.A00;
        AnonymousClass3X2 r9 = (AnonymousClass3X2) r6.A02(str2);
        if (r9 == null) {
            if (this.A0B) {
                r11 = this.A01;
            } else {
                r11 = null;
            }
            r9 = new AnonymousClass3X2(context, r11, (2Sa) this.A05.getValue(), this.A04.A01, this.A0A);
            r6.A06(str2, r9);
        }
        boolean z2 = false;
        if (intValue != r9.A00) {
            z2 = true;
        }
        if (z && !z2) {
            r9 = null;
        }
        String A042 = A04();
        String A0T = 002.A0T(A042, str2, '/');
        if (r9 != null) {
            if (Systrace.A0E(1)) {
                0fS.A01(002.A0R("LithoBinder#prepareLithoComponent_", A042), -1519698413);
            }
            C251263mp A022 = A02(r18, r2);
            int A012 = A01();
            int A002 = A00();
            if (Systrace.A0E(1)) {
                0fS.A01("LithoPreparable#prepare", -611427800);
            }
            r9.A00 = intValue;
            ComponentTree componentTree = r9.A01;
            if (componentTree != null) {
                componentTree.A0E = A0T;
                componentTree.A0N(A022, A012, A002);
                if (Systrace.A0E(1)) {
                    0fS.A00(-1136518795);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(-1990008049);
                    return;
                }
                return;
            }
            throw new IllegalStateException("The ComponentTree should not be null when we attempt to prepare ");
        }
    }

    public int A00() {
        return AnonymousClass3XX.A00;
    }

    public int A01() {
        int A012;
        AnonymousClass0eM r0;
        AnonymousClass0eM r02;
        if (this instanceof AnonymousClass3XU) {
            r0 = ((AnonymousClass3XU) this).A04;
        } else {
            if (this instanceof C242913Wr) {
                r02 = ((C242913Wr) this).A07;
            } else if (this instanceof C262334Dh) {
                r02 = ((C262334Dh) this).A06;
            } else if (this instanceof C243073Xh) {
                r02 = ((C243073Xh) this).A0B;
            } else if (this instanceof C262314Df) {
                r0 = ((C262314Df) this).A05;
            } else if (!(this instanceof C232492to)) {
                return AnonymousClass3XX.A00;
            } else {
                A012 = AnonymousClass0nB.A01(((C232492to) this).A00);
                int i = AnonymousClass3XX.A00;
                return View.MeasureSpec.makeMeasureSpec(A012, SN3.MAX_SIGNED_POWER_OF_TWO);
            }
            return ((Number) r02.getValue()).intValue();
        }
        A012 = ((Number) r0.getValue()).intValue();
        int i2 = AnonymousClass3XX.A00;
        return View.MeasureSpec.makeMeasureSpec(A012, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public C251263mp A02(C62320sa r26, C62320sa r27) {
        C62320sa r3 = r26;
        if (this instanceof AnonymousClass3XU) {
            AnonymousClass3XU r4 = (AnonymousClass3XU) this;
            0qQ.A0B(r3, 0);
            return new C243383Yo(r4.A01, r4.A02, r4.A03, r3);
        }
        C62320sa r7 = r27;
        if (this instanceof C242913Wr) {
            C242913Wr r10 = (C242913Wr) this;
            0qQ.A0B(r3, 0);
            0qQ.A0B(r7, 1);
            FragmentActivity fragmentActivity = r10.A00;
            UserSession userSession = r10.A01;
            AnonymousClass4DU r6 = r10.A03;
            C242813Wa r5 = r10.A04;
            C242903Wq r42 = r10.A05;
            AnonymousClass3WV r2 = r10.A02;
            boolean z = r10.A08;
            return new AnonymousClass3XW(fragmentActivity, 2WX.A02, userSession, r2, r6, r5, r42, r10.A06, "", r3, r7, z);
        } else if (this instanceof C262334Dh) {
            C262334Dh r8 = (C262334Dh) this;
            0qQ.A0B(r3, 0);
            0qQ.A0B(r7, 1);
            UserSession userSession2 = r8.A01;
            AnonymousClass4DU r52 = r8.A03;
            C242813Wa r43 = r8.A04;
            boolean z2 = r8.A07;
            return new AnonymousClass4Li(userSession2, r8.A02, r52, r43, r8.A05, r3, r7, z2);
        } else if (this instanceof C243073Xh) {
            C243073Xh r102 = (C243073Xh) this;
            0qQ.A0B(r3, 0);
            0qQ.A0B(r7, 1);
            GAA gaa = new GAA(r102.A07);
            C243033Xd r62 = r102.A06;
            AnonymousClass4DU r53 = r102.A05;
            boolean z3 = r102.A0C;
            UserSession userSession3 = r102.A02;
            AnonymousClass33B r15 = r102.A03;
            AnonymousClass339 r22 = r102.A08;
            C232722uK r1 = r102.A09;
            C229382nI r13 = r102.A01;
            return new AnonymousClass3Y2(new AnonymousClass9IV(r102.A04, C231592rv.LITHO_MEDIA_CONTENT), (2Wd) null, r13, userSession3, r15, r53, r62, gaa, r22, r1, r102.A0A, r3, z3, false);
        } else if (this instanceof C262314Df) {
            C262314Df r63 = (C262314Df) this;
            0qQ.A0B(r3, 0);
            AnonymousClass4DU r54 = r63.A04;
            AnonymousClass3WV r44 = r63.A03;
            boolean z4 = r63.A06;
            return new C248453hz((2WX) null, r63.A01, r63.A02, r44, r54, r3, z4);
        } else if (this instanceof C232492to) {
            C232492to r12 = (C232492to) this;
            0qQ.A0B(r3, 0);
            C229382nI r23 = r12.A01;
            if (r23 == null) {
                return null;
            }
            2V1 r0 = new 2V1(r12.A00);
            C3034368u r14 = (C3034368u) r3.invoke();
            if (r14 == null) {
                return null;
            }
            C53617GrW A002 = GY5.A00(r0);
            A002.A0B(r14);
            A002.A0C(r23);
            return A002.A0A();
        } else {
            0qQ.A0B(r3, 0);
            return new C53689Gsg(((C232572tx) this).A00, C227942kP.A01("AIConsumptionFeedUnitNetegoLithoBinder", false, false), r3);
        }
    }

    public final LithoView A03() {
        Object obj;
        LithoView lithoView = new LithoView(this.A00);
        0sP r0 = this.A08;
        if (r0 == null || (obj = r0.invoke(lithoView)) == null) {
            obj = new C245633dE(lithoView);
        }
        lithoView.setTag(obj);
        lithoView.getRootView().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return lithoView;
    }

    public String A04() {
        if (this instanceof AnonymousClass3XU) {
            return "LITHO_COALESCED_FOOTER";
        }
        if (this instanceof C242913Wr) {
            return "LITHO_COALESCED_HEADER";
        }
        if (this instanceof C262334Dh) {
            return "LITHO_MEDIA_HEADER";
        }
        if (this instanceof C243073Xh) {
            return "LITHO_MEDIA_CONTENT";
        }
        if (this instanceof C262314Df) {
            return "MEDIA_UFI";
        }
        if (this instanceof C232492to) {
            return "BloksLithoBinder";
        }
        return "MemuInFeedUnitNetegoLithoBinder";
    }
}
