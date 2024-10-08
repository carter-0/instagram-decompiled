package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.332  reason: invalid class name */
public final class AnonymousClass332 extends C249383je implements C252243on {
    public C229402nK A00;
    public boolean A01 = false;
    public C2364833x A02;
    public boolean A03 = true;
    public final C231322rQ A04;
    public final AnonymousClass2xS A05;
    public final Fragment A06;
    public final C227622jd A07;
    public final UserSession A08;
    public final AnonymousClass333 A09;
    public final C228172ku A0A;
    public final C234422xq A0B;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public AnonymousClass332(Fragment fragment, C228422le r24, UserSession userSession, C2355030c r26, AnonymousClass310 r27, C231322rQ r28, C2362332y r29, AnonymousClass4DU r30, C234172xD r31, 0MB r32, AnonymousClass2xS r33, C234422xq r34, C229402nK r35, C2355630i r36, C228232l0 r37, C234342xi r38, C249763kK r39, List list) {
        AnonymousClass333 r8;
        Fragment fragment2 = fragment;
        C228172ku r9 = new C228172ku();
        this.A0A = r9;
        C227622jd r2 = new C227622jd();
        this.A07 = r2;
        C229402nK r10 = r35;
        this.A00 = r10;
        AnonymousClass2xS r6 = r33;
        this.A05 = r6;
        C234422xq r3 = r34;
        this.A0B = r3;
        UserSession userSession2 = userSession;
        C228422le r0 = r24;
        C231322rQ r7 = r28;
        if (r24 != null) {
            r8 = new AnonymousClass333(fragment2, r0, userSession2, r7);
        } else {
            r8 = null;
        }
        this.A09 = r8;
        r7.EWg(r6);
        this.A06 = fragment2;
        AnonymousClass310 r11 = r27;
        r7.EU8(r11);
        this.A04 = r7;
        this.A08 = userSession2;
        this.A02 = new C2364833x(userSession2);
        C2355030c r1 = r26;
        r2.A0E(r1.A04);
        r2.A0E(r1);
        AnonymousClass347 r12 = new AnonymousClass347(fragment2, new AnonymousClass343((AnonymousClass340) new C2365033z(r7), (AnonymousClass342) new AnonymousClass341((AnonymousClass4DV) fragment2), list));
        C231322rQ r17 = r7;
        AnonymousClass348 r13 = new AnonymousClass348(fragment2, userSession2, r30, r17, r32, r37, (C228232l0) null, r39);
        AnonymousClass34I r112 = new AnonymousClass34I(fragment2, userSession2, r11.C86(), r7);
        r9.A03(r6);
        r9.A03(r12);
        if (r8 != null && 182.A06(0Tu.A05, userSession2, 36323594984238379L)) {
            r9.A03(r8);
            r2.A0E(r8);
        }
        r9.A03(r10);
        r2.A0E(r10);
        r2.A0E(r6);
        r2.A0E(r13);
        r2.A0E(r112);
        r2.A0E(r38);
        r2.A0E(r36);
        if (AnonymousClass30D.A07(userSession2)) {
            r2.A0E(r3);
            C2364833x r14 = this.A02;
            0qQ.A0B(r6, 0);
            r14.A07.add(r6);
            r6.A02 = r14;
            r6.A0F.A03 = r14;
            C2364833x r15 = this.A02;
            0qQ.A0B(r3, 0);
            r15.A07.add(r3);
            r3.A01 = r15;
        }
        C234172xD r02 = r31;
        if (r31 != null) {
            r2.A0E(r02);
        }
        C2362332y r03 = r29;
        if (r29 != null) {
            r2.A0E(r03);
        }
        AnonymousClass4DM r22 = r6.A09;
        if (fragment2 instanceof AnonymousClass4DN) {
            this.A03 = false;
            AnonymousClass2k2 volumeKeyPressController = ((AnonymousClass4DN) fragment2).getVolumeKeyPressController();
            volumeKeyPressController.A00(r22);
            if (AnonymousClass30D.A07(userSession2)) {
                volumeKeyPressController.A00(r3.A05);
            }
        }
    }

    public final void D6z(View view) {
        View findViewById;
        if (this.A03 && (findViewById = view.findViewById(16908298)) != null) {
            findViewById.setOnKeyListener(this.A05);
            if (AnonymousClass30D.A07(this.A08)) {
                findViewById.setOnKeyListener(this.A0B);
            }
        }
        this.A07.A0C(view);
    }

    public final void onCreate() {
        this.A07.A01();
    }

    public final void onDestroy() {
        this.A07.A02();
    }

    public final void onDestroyView() {
        this.A07.A03();
    }

    public final void onPause() {
        this.A07.A04();
        this.A01 = false;
    }

    public final void onResume() {
        this.A07.A05();
        this.A01 = true;
        AnonymousClass2xS r1 = this.A05;
        if (!r1.A0M) {
            r1.A0F.A0D.sendEmptyMessage(0);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A07.A0D(view, bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0043 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(X.C238133Ar r10) {
        /*
            r9 = this;
            int r7 = r10.B6L()
            r6 = -1
            r5 = 0
            r4 = -1
        L_0x0007:
            int r0 = r10.BLQ()
            java.lang.String r3 = ""
            if (r7 > r0) goto L_0x0065
            X.2rQ r0 = r9.A04
            int r0 = r0.getCount()
            if (r7 >= r0) goto L_0x008c
            android.view.View r8 = r10.AnE(r7)
            if (r8 == 0) goto L_0x0043
            androidx.fragment.app.Fragment r0 = r9.A06
            android.view.View r1 = r0.mView
            if (r1 == 0) goto L_0x0043
            r0 = 2131441822(0x7f0b389e, float:1.8505666E38)
            r1.findViewById(r0)
            r3 = 1
            r0 = 2
            int[] r2 = new int[r0]
            r8.getLocationInWindow(r2)
            r1 = r2[r3]
            if (r1 >= 0) goto L_0x0046
            int r1 = r8.getBottom()
            r0 = r2[r3]
            int r0 = java.lang.Math.abs(r0)
        L_0x003e:
            int r1 = r1 - r0
        L_0x003f:
            if (r1 <= r5) goto L_0x0043
            r4 = r7
            r5 = r1
        L_0x0043:
            int r7 = r7 + 1
            goto L_0x0007
        L_0x0046:
            int r0 = r8.getBottom()
            int r1 = r1 + r0
            android.view.ViewGroup r0 = r10.CEd()
            int r0 = r0.getBottom()
            if (r1 <= r0) goto L_0x0060
            android.view.ViewGroup r0 = r10.CEd()
            int r1 = r0.getHeight()
            r0 = r2[r3]
            goto L_0x003e
        L_0x0060:
            int r1 = r8.getBottom()
            goto L_0x003f
        L_0x0065:
            if (r4 == r6) goto L_0x008c
            X.2rQ r2 = r9.A04
            java.lang.Object r1 = r2.getItem(r4)
            boolean r0 = r1 instanceof X.1Xl
            if (r0 == 0) goto L_0x007f
            X.1Xl r1 = (X.1Xl) r1
            X.1Xj r0 = r1.BPf()
            X.1iA r0 = r0.BR7()
            java.lang.String r3 = r0.name()
        L_0x007f:
            java.lang.String r2 = r2.getBinderGroupName(r4)
            java.lang.String r1 = "["
            java.lang.String r0 = "]"
            java.lang.String r0 = X.002.A0u(r2, r1, r3, r0)
            return r0
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass332.A00(X.3Ar):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r4 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r14.CWN() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScroll(X.C238133Ar r14, int r15, int r16, int r17, int r18, int r19) {
        /*
            r13 = this;
            r0 = 1017572890(0x3ca6ee1a, float:0.020377208)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.2rQ r2 = r13.A04
            boolean r1 = r2.CRD()
            r7 = r14
            if (r1 == 0) goto L_0x0017
            boolean r0 = r14.CWN()
            r4 = 0
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r4 = 1
        L_0x0018:
            boolean r0 = r14.CWN()
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0050
            boolean r0 = X.W11.A01()
            if (r0 == 0) goto L_0x0050
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            X.Wji r2 = new X.Wji
            r2.<init>(r13)
            r0 = 0
            r3.postDelayed(r2, r0)
        L_0x0039:
            if (r4 == 0) goto L_0x0049
        L_0x003b:
            X.2ku r6 = r13.A0A
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r6.onScroll(r7, r8, r9, r10, r11, r12)
        L_0x0049:
            r0 = -1996166032(0xffffffff8904ec70, float:-1.6000094E-33)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0050:
            android.view.ViewGroup r0 = r14.CEd()
            android.widget.AdapterView r0 = (android.widget.AdapterView) r0
            boolean r0 = X.W11.A02(r0)
            if (r0 == 0) goto L_0x0039
            r2.Crn()
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass332.onScroll(X.3Ar, int, int, int, int, int):void");
    }

    public final void onScrollStateChanged(C238133Ar r5, int i) {
        int A032 = AnonymousClass0fD.A03(1858169347);
        if (i == 1) {
            if (Process.getThreadPriority(Process.myTid()) > -4) {
                Process.setThreadPriority(-4);
            }
        } else if (i == 0) {
            this.A00.A01.A0G.A0B = A00(r5);
        }
        this.A0A.onScrollStateChanged(r5, i);
        if (i == 1) {
            this.A00.A01.A0G.A0D = A00(r5);
        }
        AnonymousClass0fD.A0A(-997429107, A032);
    }
}
