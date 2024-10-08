package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.memorytimeline.MemoryTimeline;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2nK  reason: invalid class name and case insensitive filesystem */
public final class C229402nK extends C249383je implements C252243on, C252293os {
    public MemoryTimeline A00;
    public C229442nP A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public List A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public final UserSession A0D;
    public final 02m A0E;
    public final C229602nj A0F;

    public C229402nK(Activity activity, AnonymousClass0iw r15, UserSession userSession, int i) {
        this(activity, r15, userSession, (Boolean) null, (Boolean) null, (AnonymousClass0eK) null, (AnonymousClass0eK) null, (AnonymousClass0eK) null, (AnonymousClass0eK) null, (AnonymousClass0eK) null, (AnonymousClass0eK) null, i);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
    }

    public final void DVx(int i, int i2) {
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onDestroyView() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void A01(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i == 0) {
                this.A01.A0G.A0A = "top_of_list_view";
            } else {
                boolean z2 = false;
                if (i2 == i3) {
                    z2 = true;
                }
                AnonymousClass2nX r0 = this.A01.A0G;
                if (z2) {
                    r0.A0A = "end_of_list_view";
                } else {
                    r0.A0A = "mid_of_list_view";
                }
            }
        }
        A02(z);
        if (z) {
            return;
        }
        if (i == 0) {
            this.A01.A02("top_of_list_view");
            return;
        }
        boolean z3 = false;
        if (i2 == i3) {
            z3 = true;
        }
        C229442nP r02 = this.A01;
        if (z3) {
            r02.A02("end_of_list_view");
        } else {
            r02.A02("mid_of_list_view");
        }
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void onPause() {
        C229442nP r2 = this.A01;
        r2.A0G.A0A = "on_pause";
        C229442nP.A00(r2);
        A00(true);
        C229602nj r1 = this.A0F;
        if (r1.A00) {
            r1.A00 = false;
            r1.A01.markerEnd(23592986, 2);
        }
    }

    private void A00(boolean z) {
        02m r2 = this.A0E;
        int hashCode = hashCode();
        if (!z) {
            r2.markerStart(23592980, hashCode);
        } else {
            r2.markerEnd(23592980, hashCode, 2);
        }
    }

    public final void A02(boolean z) {
        int A032 = AnonymousClass0fD.A03(21450523);
        this.A01.A03(z);
        A00(z);
        this.A0F.A00(z);
        AnonymousClass0fD.A0A(-1912333253, A032);
    }

    public final void DhK(AnonymousClass3TF r5, float f, float f2) {
        Integer num;
        int A032 = AnonymousClass0fD.A03(-1474912393);
        C229442nP r2 = this.A01;
        if (f < f2) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A0N;
        }
        r2.A0G.A09 = num;
        AnonymousClass0fD.A0A(-153629500, A032);
    }

    public final void DhS(AnonymousClass3TF r4, AnonymousClass3TF r5) {
        int A032 = AnonymousClass0fD.A03(-1221069828);
        boolean z = false;
        if (r4 == AnonymousClass3TF.IDLE) {
            z = true;
        }
        this.A01.A03(z);
        A00(z);
        this.A0F.A00(z);
        AnonymousClass0fD.A0A(652562996, A032);
    }

    public final void onScroll(C238133Ar r6, int i, int i2, int i3, int i4, int i5) {
        Integer num;
        Integer num2;
        int A032 = AnonymousClass0fD.A03(384942584);
        if (r6.CWN()) {
            int i6 = this.A0C;
            if (i != i6) {
                C229442nP r0 = this.A01;
                if (i > i6) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    num2 = AnonymousClass05K.A00;
                }
                r0.A0G.A09 = num2;
            }
            this.A0C = i;
        } else {
            C229442nP r3 = this.A01;
            r3.A03 = true;
            AnonymousClass2nX r2 = r3.A0G;
            r2.A03 += i4;
            r2.A04 += i5;
            r2.A00 += Math.abs(i4);
            r2.A01 += Math.abs(i5);
            r3.A0F.onScrolled(i4, i5);
            if (i4 != 0) {
                if (i4 > 0) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A0C;
                }
            } else if (i5 != 0) {
                if (i5 > 0) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
            }
            r2.A09 = num;
        }
        AnonymousClass0fD.A0A(-2008928340, A032);
    }

    public final void onScrollStateChanged(C238133Ar r7, int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(996156292);
        if (i == 2) {
            i2 = -769652546;
        } else {
            boolean z = false;
            if (i == 0) {
                z = true;
            }
            A01(r7.B6L(), r7.BLQ(), r7.getCount() - 1, z);
            i2 = 323201153;
        }
        AnonymousClass0fD.A0A(i2, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 2342153813785313587L) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        if (r0 == 23592971) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C229402nK(android.app.Activity r41, X.AnonymousClass0iw r42, com.instagram.common.session.UserSession r43, java.lang.Boolean r44, java.lang.Boolean r45, X.AnonymousClass0eK r46, X.AnonymousClass0eK r47, X.AnonymousClass0eK r48, X.AnonymousClass0eK r49, X.AnonymousClass0eK r50, X.AnonymousClass0eK r51, int r52) {
        /*
            r40 = this;
            r1 = r40
            r1.<init>()
            r0 = 0
            r1.A04 = r0
            r1.A06 = r0
            r1.A05 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A08 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A09 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A07 = r0
            r2 = 0
            r1.A0C = r2
            r5 = r43
            r1.A0D = r5
            X.02m r15 = X.02m.A0p
            r1.A0E = r15
            r3 = 23592968(0x1680008, float:4.2611693E-38)
            r0 = r52
            if (r0 == r3) goto L_0x003e
            r3 = 23592969(0x1680009, float:4.2611695E-38)
            if (r0 == r3) goto L_0x003e
            r4 = 23592971(0x168000b, float:4.26117E-38)
            r3 = 0
            if (r0 != r4) goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            r1.A0B = r3
            X.0qQ.A0B(r5, r2)
            X.0kM r3 = new X.0kM
            r3.<init>(r5)
            r14 = r42
            r3.A00 = r14
            X.0wc r16 = r3.A00()
            X.C60510iO.A00(r5)
            X.1Jf r10 = X.AnonymousClass1K7.A00()
            java.lang.String r4 = r14.getModuleName()
            r3 = 1
            X.0qQ.A0B(r15, r3)
            r3 = 2
            X.0qQ.A0B(r4, r3)
            X.2nL r3 = new X.2nL
            r3.<init>(r5)
            X.2nM r9 = new X.2nM
            r9.<init>(r15, r3, r4)
            boolean r3 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.isAvailable()
            r19 = 0
            if (r3 == 0) goto L_0x007e
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin r3 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.sInstance
            if (r3 == 0) goto L_0x007e
            com.instagram.debug.devoptions.debughead.data.provider.DebugHeadDebugDropFrameListener r19 = com.instagram.debug.devoptions.debughead.data.provider.DebugHeadDebugDropFrameListener.getInstance()
        L_0x007e:
            r3 = 23592973(0x168000d, float:4.2611707E-38)
            r34 = 0
            if (r0 != r3) goto L_0x0087
            r34 = 1
        L_0x0087:
            r6 = 23592966(0x1680006, float:4.2611687E-38)
            if (r0 != r6) goto L_0x009b
            X.0Tu r7 = X.0Tu.A05
            r3 = 2342153813785313587(0x2081007c00000133, double:4.057788936997132E-152)
            boolean r3 = X.182.A06(r7, r5, r3)
            r35 = 1
            if (r3 != 0) goto L_0x009d
        L_0x009b:
            r35 = 0
        L_0x009d:
            X.0Tu r4 = X.0Tu.A05
            r7 = 36310864701161820(0x81008a0000015c, double:3.02647527690653E-306)
            boolean r36 = X.182.A06(r4, r5, r7)
            r37 = 0
            if (r0 != r6) goto L_0x00ae
            r37 = 1
        L_0x00ae:
            r6 = 36311921263117105(0x81018000000331, double:3.027143450941486E-306)
            boolean r38 = X.182.A06(r4, r5, r6)
            r3 = 23592968(0x1680008, float:4.2611693E-38)
            if (r0 != r3) goto L_0x0181
            java.lang.String r3 = "direct_secure_thread"
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x0181
            r6 = 36314300675131909(0x8103aa00020a05, double:3.028648200680771E-306)
            boolean r3 = X.182.A06(r4, r5, r6)
            if (r3 == 0) goto L_0x0181
            X.AYF r3 = new X.AYF
            r3.<init>(r1)
        L_0x00d4:
            r6 = 36310804571685172(0x81007c00010134, double:3.026437250783376E-306)
            boolean r39 = X.182.A06(r4, r5, r6)
            r12 = r41
            X.0qQ.A0B(r12, r2)
            r4 = 1
            r5 = 7
            X.0qQ.A0B(r10, r5)
            r7 = 0
            r6 = 1
            if (r19 != 0) goto L_0x017d
            X.2nR r19 = X.C229442nP.A0c
            if (r3 == 0) goto L_0x0174
            boolean r5 = r3.Esu()
            if (r5 != r4) goto L_0x0174
        L_0x00f5:
            X.C229442nP.A0b = r6
        L_0x00f7:
            if (r3 == 0) goto L_0x00fd
            int r7 = r3.CCx()
        L_0x00fd:
            X.C229442nP.A0Z = r7
            android.content.Context r4 = r12.getApplicationContext()
            X.2nS r17 = X.C229472nS.A04
            if (r17 != 0) goto L_0x010e
            X.2nS r17 = new X.2nS
            r17.<init>()
            X.C229472nS.A04 = r17
        L_0x010e:
            X.2nU r5 = new X.2nU
            r5.<init>(r12)
            com.facebook.common.time.AwakeTimeSinceBootClock r13 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            X.0qQ.A07(r13)
            X.0qQ.A0A(r4)
            float r3 = X.AnonymousClass2nW.A00
            X.0qQ.A0B(r4, r2)
            int r3 = X.AnonymousClass2nW.A01
            if (r3 > 0) goto L_0x0130
            android.content.res.Resources r2 = r4.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r3 = r2.densityDpi
            X.AnonymousClass2nW.A01 = r3
        L_0x0130:
            float r2 = X.AnonymousClass2nW.A00
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0143
            android.content.res.Resources r2 = r4.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            X.AnonymousClass2nW.A00 = r2
        L_0x0143:
            X.2nP r11 = new X.2nP
            r23 = r44
            r24 = r45
            r25 = r46
            r26 = r47
            r27 = r48
            r28 = r49
            r29 = r50
            r30 = r51
            r22 = r1
            r31 = r2
            r32 = r0
            r33 = r3
            r20 = r9
            r21 = r10
            r18 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1.A01 = r11
            X.2nj r0 = new X.2nj
            r0.<init>(r14, r15)
            r1.A0F = r0
            com.facebook.memorytimeline.MemoryTimeline r0 = X.AnonymousClass1JB.A01
            r1.A00 = r0
            return
        L_0x0174:
            boolean r4 = com.facebook.endtoend.EndToEnd.A05()
            if (r4 != 0) goto L_0x00f5
            r6 = 0
            goto L_0x00f5
        L_0x017d:
            X.C229442nP.A0a = r4
            goto L_0x00f7
        L_0x0181:
            java.lang.Class<X.2nN> r7 = X.C229432nN.class
            r6 = 18
            X.G2l r3 = new X.G2l
            r3.<init>((java.lang.Object) r5, (int) r6)
            java.lang.Object r3 = r5.A01(r7, r3)
            X.2nN r3 = (X.C229432nN) r3
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229402nK.<init>(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Boolean, X.0eK, X.0eK, X.0eK, X.0eK, X.0eK, X.0eK, int):void");
    }
}
