package androidx.compose.ui.platform;

import X.002;
import X.00k;
import X.01H;
import X.01K;
import X.01O;
import X.01Q;
import X.01V;
import X.01o;
import X.01s;
import X.02Z;
import X.04u;
import X.057;
import X.0Yw;
import X.0eP;
import X.0fg;
import X.0qQ;
import X.0sK;
import X.0sP;
import X.0sr;
import X.0yC;
import X.1HR;
import X.AnonymousClass01L;
import X.AnonymousClass01P;
import X.AnonymousClass01R;
import X.AnonymousClass5Q8;
import X.AnonymousClass5R6;
import X.AnonymousClass5SR;
import X.AnonymousClass5SS;
import X.AnonymousClass5ST;
import X.AnonymousClass5SU;
import X.AnonymousClass5SV;
import X.AnonymousClass5SX;
import X.AnonymousClass5SY;
import X.AnonymousClass5SZ;
import X.AnonymousClass5Sq;
import X.AnonymousClass5VN;
import X.AnonymousClass6IQ;
import X.AnonymousClass6JZ;
import X.AnonymousClass972;
import X.AnonymousClass9M0;
import X.C249513ju;
import X.C268054cg;
import X.C285635Sb;
import X.C285765So;
import X.C285785Sr;
import X.C285965Tk;
import X.C286025Tq;
import X.C287625aV;
import X.C289295dM;
import X.C289325dP;
import X.C290115em;
import X.C290125en;
import X.C290145ep;
import X.C290155eq;
import X.C290215ex;
import X.C3022462f;
import X.C305656Ja;
import X.C305666Jb;
import X.C305676Jc;
import X.C305686Jd;
import X.C305696Je;
import X.C377189Kw;
import X.C378099Om;
import X.C54743HRb;
import X.C55823Ho6;
import X.C58006Ijz;
import X.C60340gF;
import X.C62320sa;
import X.C63090yB;
import X.C63120yJ;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class AndroidComposeViewAccessibilityDelegateCompat extends 02Z {
    public static final 01K A0Y;
    public int A00;
    public int A01;
    public int A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public long A03;
    public C63120yJ A04;
    public C63120yJ A05;
    public 0yC A06;
    public C63090yB A07;
    public 01s A08;
    public 01s A09;
    public C55823Ho6 A0A;
    public AnonymousClass5SY A0B;
    public AccessibilityNodeInfoCompat A0C;
    public Integer A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public 01O A0I;
    public AnonymousClass5ST A0J;
    public 0sP A0K = new C377189Kw(this, 5);
    public final Handler A0L;
    public final AccessibilityManager.AccessibilityStateChangeListener A0M;
    public final AccessibilityManager.TouchExplorationStateChangeListener A0N;
    public final AccessibilityManager A0O;
    public final 0yC A0P;
    public final 0yC A0Q;
    public final AndroidComposeView A0R;
    public final AnonymousClass5SU A0S;
    public final Runnable A0T;
    public final List A0U;
    public final 04u A0V;
    public final 0sP A0W;
    public final C249513ju A0X;

    public static final String A0A(AnonymousClass5SX r4) {
        Object A0J2;
        AnonymousClass5SV r42 = r4.A05;
        C285635Sb r2 = AnonymousClass5SZ.A02;
        Map map = r42.A02;
        if (map.containsKey(r2)) {
            return C290155eq.A00(",", (List) r42.A00(r2));
        }
        C285635Sb r22 = AnonymousClass5SZ.A04;
        if (map.containsKey(r22)) {
            A0J2 = C285765So.A00(r42, r22);
        } else {
            List list = (List) C285765So.A00(r42, AnonymousClass5SZ.A0R);
            if (list == null) {
                return null;
            }
            A0J2 = 00k.A0J(list);
        }
        C286025Tq r0 = (C286025Tq) A0J2;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public static final void A0C(Bundle bundle, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, int i) {
        int i2;
        RectF rectF;
        long j;
        C63120yJ r0;
        int i3;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
        int i4 = i;
        C290215ex r02 = (C290215ex) A06(androidComposeViewAccessibilityDelegateCompat).A03(i4);
        if (r02 != null) {
            AnonymousClass5SX r6 = r02.A01;
            String A0A2 = A0A(r6);
            String str2 = str;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
            if (0qQ.A0K(str2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL")) {
                r0 = androidComposeViewAccessibilityDelegateCompat.A05;
            } else if (0qQ.A0K(str2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL")) {
                r0 = androidComposeViewAccessibilityDelegateCompat.A04;
            } else {
                AnonymousClass5SV r2 = r6.A05;
                C285635Sb r03 = C290125en.A08;
                Map map = r2.A02;
                if (!map.containsKey(r03) || bundle == null || !0qQ.A0K(str2, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    C285635Sb r1 = AnonymousClass5SZ.A0Q;
                    if (map.containsKey(r1) && bundle != null && 0qQ.A0K(str2, "androidx.compose.ui.semantics.testTag")) {
                        String str3 = (String) C285765So.A00(r2, r1);
                        if (str3 != null) {
                            accessibilityNodeInfoCompat2.mInfo.getExtras().putCharSequence(str2, str3);
                            return;
                        }
                        return;
                    } else if (0qQ.A0K(str2, "androidx.compose.ui.semantics.id")) {
                        accessibilityNodeInfoCompat2.mInfo.getExtras().putInt(str2, r6.A02);
                        return;
                    } else {
                        return;
                    }
                } else {
                    int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i6 > 0 && i5 >= 0) {
                        if (A0A2 != null) {
                            i2 = A0A2.length();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i5 < i2) {
                            C3022462f A012 = C290115em.A01(r2);
                            if (A012 != null) {
                                ArrayList arrayList = new ArrayList();
                                int i7 = 0;
                                do {
                                    int i8 = i5 + i7;
                                    if (i8 >= A012.A04.A03.length()) {
                                        rectF = null;
                                    } else {
                                        AnonymousClass5VN A052 = A012.A05(i8);
                                        rectF = null;
                                        C268054cg A053 = r6.A05();
                                        if (A053 == null || !A053.COx()) {
                                            j = 0;
                                        } else {
                                            j = A053.CgY(0);
                                        }
                                        AnonymousClass5VN A032 = A052.A03(j);
                                        AnonymousClass5VN A033 = r6.A03();
                                        if (A032.A05(A033)) {
                                            AnonymousClass5VN A042 = A032.A04(A033);
                                            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat2.A0R;
                                            long Cga = androidComposeView.Cga(C289325dP.A00(A042.A01, A042.A03));
                                            long Cga2 = androidComposeView.Cga(C289325dP.A00(A042.A02, A042.A00));
                                            rectF = new RectF(C289295dM.A01(Cga), C289295dM.A02(Cga), C289295dM.A01(Cga2), C289295dM.A02(Cga2));
                                        }
                                    }
                                    arrayList.add(rectF);
                                    i7++;
                                } while (i7 < i6);
                                accessibilityNodeInfoCompat2.mInfo.getExtras().putParcelableArray(str2, (Parcelable[]) arrayList.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
            }
            int A034 = r0.A03(i4);
            if (A034 >= 0 && (i3 = r0.A03[A034]) != -1) {
                accessibilityNodeInfoCompat2.mInfo.getExtras().putInt(str2, i3);
            }
        }
    }

    public static final boolean A0O(AnonymousClass6IQ r2, float f) {
        if (f < 0.0f && ((Number) r2.A01.invoke()).floatValue() > 0.0f) {
            return true;
        }
        if (f <= 0.0f || ((Number) r2.A01.invoke()).floatValue() >= ((Number) r2.A00.invoke()).floatValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r13 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[Catch:{ all -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[Catch:{ all -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0a(X.AnonymousClass4D7 r16) {
        /*
            r15 = this;
            r3 = 3
            r4 = r16
            boolean r0 = X.C376739Jd.A00(r3, r4)
            if (r0 == 0) goto L_0x0032
            r7 = r4
            X.9Jd r7 = (X.C376739Jd) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0017:
            java.lang.Object r0 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 == r4) goto L_0x0040
            if (r1 != r5) goto L_0x0038
            java.lang.Object r8 = r7.A03
            X.1IT r8 = (X.AnonymousClass1IT) r8
            java.lang.Object r3 = r7.A02
            X.0yB r3 = (X.C63090yB) r3
            java.lang.Object r2 = r7.A01
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x0063
        L_0x0032:
            X.9Jd r7 = new X.9Jd
            r7.<init>(r15, r4, r3)
            goto L_0x0017
        L_0x0038:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0040:
            java.lang.Object r8 = r7.A03
            X.1IT r8 = (X.AnonymousClass1IT) r8
            java.lang.Object r3 = r7.A02
            X.0yB r3 = (X.C63090yB) r3
            java.lang.Object r2 = r7.A01
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x0076
        L_0x004d:
            X.0eS.A00(r0)
            X.0yB r3 = new X.0yB     // Catch:{ all -> 0x01be }
            r3.<init>()     // Catch:{ all -> 0x01be }
            long[] r0 = X.01o.A00     // Catch:{ all -> 0x01be }
            r0 = 6
            X.C63090yB.A02(r3, r0)     // Catch:{ all -> 0x01be }
            X.3ju r0 = r15.A0X     // Catch:{ all -> 0x01be }
            X.1IT r8 = r0.CfF()     // Catch:{ all -> 0x01be }
            r2 = r15
            goto L_0x0066
        L_0x0063:
            X.0eS.A00(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0066:
            r7.A01 = r2     // Catch:{ all -> 0x01c1 }
            r7.A02 = r3     // Catch:{ all -> 0x01c1 }
            r7.A03 = r8     // Catch:{ all -> 0x01c1 }
            r7.A00 = r4     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r8.A01(r7)     // Catch:{ all -> 0x01c1 }
            if (r0 != r6) goto L_0x0079
            goto L_0x01b4
        L_0x0076:
            X.0eS.A00(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0079:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01b6
            r8.A00()     // Catch:{ all -> 0x01c1 }
            boolean r0 = r2.A0b()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0066
            X.04u r9 = r2.A0V     // Catch:{ all -> 0x01c1 }
            int r11 = r9.size()     // Catch:{ all -> 0x01c1 }
            r10 = 0
        L_0x0091:
            if (r10 >= r11) goto L_0x0186
            java.lang.Object[] r0 = r9.A02     // Catch:{ all -> 0x01c1 }
            r14 = r0[r10]     // Catch:{ all -> 0x01c1 }
            X.5R6 r14 = (X.AnonymousClass5R6) r14     // Catch:{ all -> 0x01c1 }
            r13 = r14
            X.4co r0 = r14.A0A     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x010c
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.A0R     // Catch:{ all -> 0x01c1 }
            X.6Gd r0 = r0.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x010c
            X.5RP r0 = r14.A0W     // Catch:{ all -> 0x01c1 }
            X.4cD r0 = r0.A02     // Catch:{ all -> 0x01c1 }
            int r0 = r0.A00     // Catch:{ all -> 0x01c1 }
            r1 = r0 & 8
            r0 = 0
            if (r1 == 0) goto L_0x00b8
            r0 = 1
        L_0x00b8:
            if (r0 != 0) goto L_0x00d2
            X.6JT r1 = X.AnonymousClass6JT.A00     // Catch:{ all -> 0x01c1 }
        L_0x00bc:
            X.5R6 r13 = r13.A0B()     // Catch:{ all -> 0x01c1 }
            if (r13 == 0) goto L_0x00cf
            java.lang.Object r0 = r1.invoke(r13)     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00bc
            goto L_0x00d0
        L_0x00cf:
            r13 = 0
        L_0x00d0:
            if (r13 == 0) goto L_0x010c
        L_0x00d2:
            X.5SV r0 = r13.A0C()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x010c
            boolean r0 = r0.A01     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x00f6
            X.6JU r12 = X.AnonymousClass6JU.A00     // Catch:{ all -> 0x01c1 }
            r1 = r13
        L_0x00df:
            X.5R6 r1 = r1.A0B()     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r0 = r12.invoke(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00df
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r13 = r1
        L_0x00f6:
            int r1 = r13.A01     // Catch:{ all -> 0x01c1 }
            boolean r0 = r3.A06(r1)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x010c
            int r13 = A00(r2, r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01c1 }
            r1 = 0
            r0 = 2048(0x800, float:2.87E-42)
            A0J(r2, r12, r1, r13, r0)     // Catch:{ all -> 0x01c1 }
        L_0x010c:
            X.4co r0 = r14.A0A     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0134
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.A0R     // Catch:{ all -> 0x01c1 }
            X.6Gd r0 = r0.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0134
            int r1 = r14.A01     // Catch:{ all -> 0x01c1 }
            X.0yC r0 = r2.A0P     // Catch:{ all -> 0x01c1 }
            java.lang.Object r13 = r0.A03(r1)     // Catch:{ all -> 0x01c1 }
            X.6IQ r13 = (X.AnonymousClass6IQ) r13     // Catch:{ all -> 0x01c1 }
            X.0yC r0 = r2.A0Q     // Catch:{ all -> 0x01c1 }
            java.lang.Object r12 = r0.A03(r1)     // Catch:{ all -> 0x01c1 }
            X.6IQ r12 = (X.AnonymousClass6IQ) r12     // Catch:{ all -> 0x01c1 }
            if (r13 != 0) goto L_0x0138
            if (r12 != 0) goto L_0x0138
        L_0x0134:
            int r10 = r10 + 1
            goto L_0x0091
        L_0x0138:
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r1 = A04(r2, r1, r0)     // Catch:{ all -> 0x01c1 }
            if (r13 == 0) goto L_0x0160
            X.0sa r0 = r13.A01     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x01c1 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c1 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setScrollX(r0)     // Catch:{ all -> 0x01c1 }
            X.0sa r0 = r13.A00     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x01c1 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c1 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setMaxScrollX(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0160:
            if (r12 == 0) goto L_0x0182
            X.0sa r0 = r12.A01     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x01c1 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c1 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setScrollY(r0)     // Catch:{ all -> 0x01c1 }
            X.0sa r0 = r12.A00     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x01c1 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c1 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setMaxScrollY(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0182:
            A0D(r1, r2)     // Catch:{ all -> 0x01c1 }
            goto L_0x0134
        L_0x0186:
            r3.A05()     // Catch:{ all -> 0x01c1 }
            boolean r0 = r2.A0F     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0196
            r2.A0F = r4     // Catch:{ all -> 0x01c1 }
            android.os.Handler r1 = r2.A0L     // Catch:{ all -> 0x01c1 }
            java.lang.Runnable r0 = r2.A0T     // Catch:{ all -> 0x01c1 }
            r1.post(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0196:
            r9.clear()     // Catch:{ all -> 0x01c1 }
            X.0yC r0 = r2.A0P     // Catch:{ all -> 0x01c1 }
            r0.A06()     // Catch:{ all -> 0x01c1 }
            X.0yC r0 = r2.A0Q     // Catch:{ all -> 0x01c1 }
            r0.A06()     // Catch:{ all -> 0x01c1 }
            long r0 = r2.A03     // Catch:{ all -> 0x01c1 }
            r7.A01 = r2     // Catch:{ all -> 0x01c1 }
            r7.A02 = r3     // Catch:{ all -> 0x01c1 }
            r7.A03 = r8     // Catch:{ all -> 0x01c1 }
            r7.A00 = r5     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = X.C241603Pv.A01(r7, r0)     // Catch:{ all -> 0x01c1 }
            if (r0 != r6) goto L_0x0066
            goto L_0x01b5
        L_0x01b4:
            return r6
        L_0x01b5:
            return r6
        L_0x01b6:
            X.04u r0 = r2.A0V
            r0.clear()
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x01be:
            r1 = move-exception
            r2 = r15
            goto L_0x01c2
        L_0x01c1:
            r1 = move-exception
        L_0x01c2:
            X.04u r0 = r2.A0V
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0a(X.4D7):java.lang.Object");
    }

    public final boolean A0b() {
        return this.A0O.isEnabled() && (this.A0E.isEmpty() ^ true);
    }

    static {
        int[] iArr = new int[32];
        System.arraycopy(new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26}, 0, iArr, 0, 27);
        System.arraycopy(new int[]{R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31}, 0, iArr, 27, 5);
        01K r2 = AnonymousClass01L.A00;
        01K r6 = new 01K(32);
        int i = r6.A00;
        if (i < 0 || i > i) {
            throw new IndexOutOfBoundsException(002.A02(i, i, "Index ", " must be in 0.."));
        }
        r6.A03(i + 32);
        int[] iArr2 = r6.A01;
        int i2 = r6.A00;
        if (i != i2) {
            0Yw.A0T(iArr2, iArr2, i + 32, i, i2);
        }
        0Yw.A0T(iArr, iArr2, i, 0, 32);
        r6.A00 += 32;
        A0Y = r6;
    }

    public static final int A00(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        if (i == androidComposeViewAccessibilityDelegateCompat.A0R.A0l.A00().A02) {
            return -1;
        }
        return i;
    }

    public static final int A01(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass5SX r5) {
        AnonymousClass5SV r3 = r5.A05;
        C285635Sb r0 = AnonymousClass5SZ.A02;
        Map map = r3.A02;
        if (!map.containsKey(r0)) {
            C285635Sb r1 = AnonymousClass5SZ.A0S;
            if (map.containsKey(r1)) {
                return (int) (((C285965Tk) r3.A00(r1)).A00 & 4294967295L);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final int A02(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass5SX r5) {
        AnonymousClass5SV r3 = r5.A05;
        C285635Sb r0 = AnonymousClass5SZ.A02;
        Map map = r3.A02;
        if (!map.containsKey(r0)) {
            C285635Sb r1 = AnonymousClass5SZ.A0S;
            if (map.containsKey(r1)) {
                return (int) (((C285965Tk) r3.A00(r1)).A00 >> 32);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final Rect A03(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C290215ex r7) {
        Rect rect = r7.A00;
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0R;
        long Cga = androidComposeView.Cga(C289325dP.A00((float) rect.left, (float) rect.top));
        long Cga2 = androidComposeView.Cga(C289325dP.A00((float) rect.right, (float) rect.bottom));
        return new Rect((int) ((float) Math.floor((double) C289295dM.A01(Cga))), (int) ((float) Math.floor((double) C289295dM.A02(Cga))), (int) ((float) Math.ceil((double) C289295dM.A01(Cga2))), (int) ((float) Math.ceil((double) C289295dM.A02(Cga2))));
    }

    public static final AccessibilityEvent A05(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        AccessibilityEvent A042 = A04(androidComposeViewAccessibilityDelegateCompat, i, 8192);
        if (num != null) {
            A042.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A042.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A042.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A042.getText().add(charSequence);
        }
        return A042;
    }

    public static final 01O A06(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        AnonymousClass5SX r3;
        if (androidComposeViewAccessibilityDelegateCompat.A0G) {
            androidComposeViewAccessibilityDelegateCompat.A0G = false;
            androidComposeViewAccessibilityDelegateCompat.A0I = C290115em.A00(androidComposeViewAccessibilityDelegateCompat.A0R.A0l);
            if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
                C63120yJ r6 = androidComposeViewAccessibilityDelegateCompat.A05;
                r6.A04();
                C63120yJ r5 = androidComposeViewAccessibilityDelegateCompat.A04;
                r5.A04();
                C290215ex r0 = (C290215ex) A06(androidComposeViewAccessibilityDelegateCompat).A03(-1);
                if (r0 != null) {
                    r3 = r0.A01;
                } else {
                    r3 = null;
                }
                0qQ.A0A(r3);
                boolean z = false;
                if (r3.A04.A0D == AnonymousClass5Q8.Rtl) {
                    z = true;
                }
                int i = 1;
                ArrayList A0B2 = androidComposeViewAccessibilityDelegateCompat.A0B(0sr.A1M(new AnonymousClass5SX[]{r3}), z);
                0qQ.A0B(A0B2, 0);
                int size = A0B2.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((AnonymousClass5SX) A0B2.get(i - 1)).A02;
                        int i3 = ((AnonymousClass5SX) A0B2.get(i)).A02;
                        r6.A05(i2, i3);
                        r5.A05(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A0I;
    }

    /* JADX WARNING: type inference failed for: r1v67, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04d8, code lost:
        if (r4.containsKey(X.AnonymousClass5SZ.A0B) != false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0513, code lost:
        if (r15 == false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a19, code lost:
        if (X.0qQ.A0K(X.C285765So.A00(r0, r10), true) != false) goto L_0x0a1d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0838  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x085e  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0874  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0933  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0967  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0b28  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0b59  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x02a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat A07(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r46, int r47) {
        /*
            r9 = r46
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            r46 = r0
            X.5XH r0 = r46.getViewTreeOwners()
            r4 = 0
            if (r0 == 0) goto L_0x001e
            X.07Z r0 = r0.A00
            X.07V r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001e
            X.07U r1 = r0.A07()
        L_0x0019:
            X.07U r0 = X.07U.A02
            if (r1 != r0) goto L_0x0020
            return r4
        L_0x001e:
            r1 = r4
            goto L_0x0019
        L_0x0020:
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            r7.<init>(r0)
            X.01O r0 = A06(r9)
            r8 = r47
            java.lang.Object r2 = r0.A03(r8)
            X.5ex r2 = (X.C290215ex) r2
            if (r2 != 0) goto L_0x0038
            return r4
        L_0x0038:
            X.5SX r6 = r2.A01
            r3 = -1
            if (r8 != r3) goto L_0x0167
            android.view.ViewParent r1 = r46.getParentForAccessibility()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0048
            r4 = r1
            android.view.View r4 = (android.view.View) r4
        L_0x0048:
            r7.setParent(r4)
        L_0x004b:
            r7.mVirtualDescendantId = r8
            android.view.accessibility.AccessibilityNodeInfo r1 = r7.mInfo
            r0 = r46
            r1.setSource(r0, r8)
            android.graphics.Rect r1 = A03(r9, r2)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setBoundsInScreen(r1)
            java.lang.String r0 = "android.view.View"
            r7.setClassName(r0)
            X.5SV r5 = r6.A05
            X.5Sb r20 = X.AnonymousClass5SZ.A04
            java.util.Map r4 = r5.A02
            r0 = r20
            boolean r0 = r4.containsKey(r0)
            java.lang.String r3 = "android.widget.EditText"
            if (r0 == 0) goto L_0x0075
            r7.setClassName(r3)
        L_0x0075:
            X.5Sb r1 = X.AnonymousClass5SZ.A0R
            boolean r0 = r4.containsKey(r1)
            java.lang.String r2 = "android.widget.TextView"
            if (r0 == 0) goto L_0x0082
            r7.setClassName(r2)
        L_0x0082:
            X.5Sb r0 = X.AnonymousClass5SZ.A0M
            java.lang.Object r13 = X.C285765So.A00(r5, r0)
            X.5aV r13 = (X.C287625aV) r13
            if (r13 == 0) goto L_0x00b3
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x009c
            r10 = 0
            r0 = 1
            java.util.List r0 = r6.A08(r10, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b3
        L_0x009c:
            r0 = 4
            int r10 = r13.A00
            if (r10 != r0) goto L_0x012c
            android.content.Context r0 = r46.getContext()
            android.content.res.Resources r10 = r0.getResources()
            r0 = 2131974921(0x7f135b09, float:1.958692E38)
        L_0x00ac:
            java.lang.String r0 = r10.getString(r0)
            r7.setRoleDescription(r0)
        L_0x00b3:
            X.5Sb r23 = X.C290125en.A0O
            r0 = r23
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x00c0
            r7.setClassName(r3)
        L_0x00c0:
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00c9
            r7.setClassName(r2)
        L_0x00c9:
            android.content.Context r0 = r46.getContext()
            java.lang.String r2 = r0.getPackageName()
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setPackageName(r2)
            boolean r2 = X.C290115em.A05(r6)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setImportantForAccessibility(r2)
            r3 = 0
            r12 = 1
            java.util.List r17 = r6.A08(r3, r12)
            int r11 = r17.size()
            r16 = 0
            r10 = 0
        L_0x00ec:
            r18 = -1
            if (r10 >= r11) goto L_0x018d
            r0 = r17
            java.lang.Object r15 = r0.get(r10)
            X.5SX r15 = (X.AnonymousClass5SX) r15
            X.01O r2 = A06(r9)
            int r0 = r15.A02
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x011f
            X.6Gd r0 = r46.getAndroidViewsHandler$ui_release()
            java.util.HashMap r2 = r0.A01
            X.5R6 r0 = r15.A04
            java.lang.Object r14 = r2.get(r0)
            android.view.View r14 = (android.view.View) r14
            int r2 = r15.A02
            r0 = r18
            if (r2 == r0) goto L_0x011f
            if (r14 == 0) goto L_0x0122
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.addChild(r14)
        L_0x011f:
            int r10 = r10 + 1
            goto L_0x00ec
        L_0x0122:
            int r14 = r15.A02
            android.view.accessibility.AccessibilityNodeInfo r2 = r7.mInfo
            r0 = r46
            r2.addChild(r0, r14)
            goto L_0x011f
        L_0x012c:
            r0 = 2
            if (r10 != r0) goto L_0x013c
            android.content.Context r0 = r46.getContext()
            android.content.res.Resources r10 = r0.getResources()
            r0 = 2131974866(0x7f135ad2, float:1.9586808E38)
            goto L_0x00ac
        L_0x013c:
            java.lang.String r11 = X.C290115em.A03(r10)
            r0 = 5
            if (r10 != r0) goto L_0x015d
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0162
            r10 = 0
            r0 = 1
            java.util.List r0 = r6.A08(r10, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0162
            X.5R6 r10 = r6.A04
            X.6JY r0 = X.AnonymousClass6JY.A00
            X.5R6 r0 = X.C290085ej.A00(r10, r0)
            if (r0 != 0) goto L_0x0162
        L_0x015d:
            r7.setClassName(r11)
            goto L_0x00b3
        L_0x0162:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00b3
            goto L_0x015d
        L_0x0167:
            X.5SX r0 = r6.A07()
            if (r0 == 0) goto L_0x0b61
            int r1 = r0.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0b61
            r0 = r46
            X.5SP r0 = r0.A0l
            X.5SX r0 = r0.A00()
            int r0 = r0.A02
            if (r1 == r0) goto L_0x0182
            r3 = r1
        L_0x0182:
            r7.mParentVirtualDescendantId = r3
            android.view.accessibility.AccessibilityNodeInfo r1 = r7.mInfo
            r0 = r46
            r1.setParent(r0, r3)
            goto L_0x004b
        L_0x018d:
            int r2 = r9.A01
            r17 = 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            if (r8 != r2) goto L_0x02b3
            r0.setAccessibilityFocused(r12)
            X.04x r0 = X.04x.A05
        L_0x019a:
            r7.addAction(r0)
            r0 = r20
            java.lang.Object r11 = X.C285765So.A00(r5, r0)
            X.5Tq r11 = (X.C286025Tq) r11
            java.lang.Object r0 = X.C285765So.A00(r5, r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r0 = X.00k.A0J(r0)
            X.5Tq r0 = (X.C286025Tq) r0
        L_0x01b3:
            if (r11 != 0) goto L_0x01b6
            r11 = r0
        L_0x01b6:
            if (r11 == 0) goto L_0x03b0
            r46.getFontFamilyResolver()
            X.4cd r37 = r46.getDensity()
            X.5SU r0 = r9.A0S
            r45 = r0
            java.lang.String r0 = r11.A00
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            java.util.List r0 = r11.A03
            r35 = r0
            r34 = 0
            if (r0 == 0) goto L_0x02ba
            int r33 = r35.size()
            r32 = 0
        L_0x01d8:
            r1 = r33
            r0 = r32
            if (r0 >= r1) goto L_0x02ba
            r1 = r35
            java.lang.Object r0 = r1.get(r0)
            X.62b r0 = (X.C3022062b) r0
            java.lang.Object r2 = r0.A02
            X.5ZB r2 = (X.AnonymousClass5ZB) r2
            int r15 = r0.A01
            int r14 = r0.A00
            X.5ZA r0 = r2.A0C
            r31 = r0
            long r29 = r31.Aoz()
            long r0 = r2.A01
            r43 = r0
            X.5ZD r0 = r2.A08
            r28 = r0
            X.5hl r0 = r2.A06
            r19 = r0
            X.5ho r0 = r2.A0D
            r27 = r0
            X.5Ud r0 = r2.A09
            r42 = r0
            long r0 = r2.A00
            r25 = r0
            X.5ht r0 = r2.A0B
            r24 = r0
            long r21 = r31.Aoz()
            long r0 = X.AnonymousClass5RW.A01
            int r0 = (r29 > r21 ? 1 : (r29 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0220
            X.5ZA r31 = X.AnonymousClass5Z8.A00(r29)
        L_0x0220:
            long r0 = r31.Aoz()
            X.AnonymousClass6BU.A00(r10, r15, r14, r0)
            r36 = r10
            r38 = r15
            r39 = r14
            r40 = r43
            X.AnonymousClass6BU.A02(r36, r37, r38, r39, r40)
            r2 = 33
            if (r28 != 0) goto L_0x02ab
            if (r19 == 0) goto L_0x025f
            X.5ZD r28 = X.AnonymousClass5ZD.A04
        L_0x023a:
            r0 = r19
            int r0 = r0.A00
            r19 = r0
        L_0x0240:
            r0 = r28
            int r0 = r0.A00
            r1 = r0
            r0 = 600(0x258, float:8.41E-43)
            int r0 = X.0qQ.A00(r1, r0)
            r1 = 0
            if (r0 < 0) goto L_0x024f
            r1 = 1
        L_0x024f:
            r0 = r19
            if (r0 != r12) goto L_0x02a6
            r0 = 2
            if (r1 == 0) goto L_0x0257
            r0 = 3
        L_0x0257:
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r0)
            r10.setSpan(r1, r15, r14, r2)
        L_0x025f:
            if (r24 == 0) goto L_0x027d
            r0 = r24
            int r0 = r0.A00
            r1 = r0 | 1
            if (r1 != r0) goto L_0x0271
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            r10.setSpan(r1, r15, r14, r2)
        L_0x0271:
            r1 = r0 | 2
            if (r1 != r0) goto L_0x027d
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r10.setSpan(r0, r15, r14, r2)
        L_0x027d:
            if (r27 == 0) goto L_0x028b
            r0 = r27
            float r1 = r0.A00
            android.text.style.ScaleXSpan r0 = new android.text.style.ScaleXSpan
            r0.<init>(r1)
            r10.setSpan(r0, r15, r14, r2)
        L_0x028b:
            r0 = r42
            X.AnonymousClass6BU.A01(r10, r0, r15, r14)
            r21 = 16
            int r0 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x02a2
            int r1 = X.C285595Rx.A00(r25)
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            r10.setSpan(r0, r15, r14, r2)
        L_0x02a2:
            int r32 = r32 + 1
            goto L_0x01d8
        L_0x02a6:
            r0 = 0
            if (r1 == 0) goto L_0x0257
            r0 = 1
            goto L_0x0257
        L_0x02ab:
            if (r19 != 0) goto L_0x023a
            r19 = 0
            goto L_0x0240
        L_0x02b0:
            r0 = 0
            goto L_0x01b3
        L_0x02b3:
            r0.setAccessibilityFocused(r3)
            X.04x r0 = X.04x.A04
            goto L_0x019a
        L_0x02ba:
            int r22 = r11.length()
            r0 = r22
            java.util.List r21 = r11.A04(r3, r0)
            int r19 = r21.size()
            r14 = 0
        L_0x02c9:
            r1 = 33
            r0 = r19
            if (r14 >= r0) goto L_0x0304
            r0 = r21
            java.lang.Object r15 = r0.get(r14)
            X.62b r15 = (X.C3022062b) r15
            java.lang.Object r2 = r15.A02
            X.HP8 r2 = (X.HP8) r2
            int r0 = r15.A01
            r25 = r0
            int r0 = r15.A00
            r24 = r0
            boolean r0 = r2 instanceof X.C52947Gfy
            if (r0 == 0) goto L_0x02fe
            X.Gfy r2 = (X.C52947Gfy) r2
            java.lang.String r2 = r2.A00
            android.text.style.TtsSpan$VerbatimBuilder r0 = new android.text.style.TtsSpan$VerbatimBuilder
            r0.<init>(r2)
            android.text.style.TtsSpan r15 = r0.build()
            r2 = r25
            r0 = r24
            r10.setSpan(r15, r2, r0, r1)
            int r14 = r14 + 1
            goto L_0x02c9
        L_0x02fe:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0304:
            r0 = r22
            java.util.List r21 = r11.A05(r3, r0)
            int r19 = r21.size()
            r15 = 0
        L_0x030f:
            r0 = r19
            if (r15 >= r0) goto L_0x0349
            r0 = r21
            java.lang.Object r14 = r0.get(r15)
            X.62b r14 = (X.C3022062b) r14
            java.lang.Object r2 = r14.A02
            X.Hrz r2 = (X.C56050Hrz) r2
            int r0 = r14.A01
            r26 = r0
            int r0 = r14.A00
            r25 = r0
            r0 = r45
            java.util.WeakHashMap r0 = r0.A01
            r24 = r0
            java.lang.Object r14 = r0.get(r2)
            if (r14 != 0) goto L_0x033f
            java.lang.String r0 = r2.A00
            android.text.style.URLSpan r14 = new android.text.style.URLSpan
            r14.<init>(r0)
            r0 = r24
            r0.put(r2, r14)
        L_0x033f:
            r2 = r26
            r0 = r25
            r10.setSpan(r14, r2, r0, r1)
            int r15 = r15 + 1
            goto L_0x030f
        L_0x0349:
            r0 = r22
            java.util.List r21 = r11.A02(r0)
            int r19 = r21.size()
        L_0x0353:
            r2 = r34
            r0 = r19
            if (r2 >= r0) goto L_0x03b2
            r0 = r21
            java.lang.Object r11 = r0.get(r2)
            X.62b r11 = (X.C3022062b) r11
            java.lang.Object r0 = r11.A02
            boolean r0 = r0 instanceof X.C52946Gfx
            if (r0 == 0) goto L_0x0399
            java.lang.Object r15 = r11.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url"
            X.0qQ.A0C(r15, r0)
            int r2 = r11.A01
            int r0 = r11.A00
            X.62b r14 = new X.62b
            r14.<init>(r15, r2, r0)
            r0 = r45
            java.util.WeakHashMap r15 = r0.A02
            java.lang.Object r2 = r15.get(r14)
            if (r2 != 0) goto L_0x038f
            java.lang.Object r0 = r14.A02
            X.Gfx r0 = (X.C52946Gfx) r0
            java.lang.String r0 = r0.A01
            android.text.style.URLSpan r2 = new android.text.style.URLSpan
            r2.<init>(r0)
            r15.put(r14, r2)
        L_0x038f:
            int r0 = r11.A01
            int r11 = r11.A00
            r10.setSpan(r2, r0, r11, r1)
            int r34 = r34 + 1
            goto L_0x0353
        L_0x0399:
            r0 = r45
            java.util.WeakHashMap r14 = r0.A00
            java.lang.Object r2 = r14.get(r11)
            if (r2 != 0) goto L_0x038f
            java.lang.Object r0 = r11.A02
            X.6Gc r0 = (X.C305016Gc) r0
            X.Gd8 r2 = new X.Gd8
            r2.<init>(r0)
            r14.put(r11, r2)
            goto L_0x038f
        L_0x03b0:
            r1 = 0
            goto L_0x03b6
        L_0x03b2:
            java.lang.CharSequence r1 = A08(r10)
        L_0x03b6:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setText(r1)
            X.5Sb r1 = X.AnonymousClass5SZ.A05
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x03d3
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setContentInvalid(r12)
            java.lang.Object r1 = X.C285765So.A00(r5, r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setError(r1)
        L_0x03d3:
            java.lang.String r0 = r9.A09(r6)
            r7.setStateDescription(r0)
            boolean r1 = A0Q(r6)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setCheckable(r1)
            X.5Sb r0 = X.AnonymousClass5SZ.A0U
            java.lang.Object r1 = X.C285765So.A00(r5, r0)
            if (r1 == 0) goto L_0x03f4
            X.6JW r0 = X.AnonymousClass6JW.On
            if (r1 != r0) goto L_0x0a48
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setChecked(r12)
        L_0x03f4:
            X.5Sb r1 = X.AnonymousClass5SZ.A0O
            java.lang.Object r0 = X.C285765So.A00(r5, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x040e
            boolean r2 = r0.booleanValue()
            r10 = 4
            if (r13 == 0) goto L_0x0a41
            int r0 = r13.A00
            if (r0 != r10) goto L_0x0a41
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setSelected(r2)
        L_0x040e:
            boolean r0 = r5.A01
            r2 = 0
            if (r0 == 0) goto L_0x041d
            java.util.List r0 = r6.A08(r3, r12)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0430
        L_0x041d:
            X.5Sb r0 = X.AnonymousClass5SZ.A02
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0a3e
            java.lang.Object r0 = X.00k.A0J(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x042d:
            r7.setContentDescription(r0)
        L_0x0430:
            X.5Sb r21 = X.AnonymousClass5SZ.A0Q
            r0 = r21
            java.lang.Object r15 = X.C285765So.A00(r5, r0)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x045a
            r14 = r6
        L_0x043d:
            X.5SV r11 = r14.A05
            X.5Sb r10 = X.AnonymousClass6GM.A00
            java.util.Map r0 = r11.A02
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x0a36
            java.lang.Object r0 = r11.A00(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x045a
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setViewIdResourceName(r15)
        L_0x045a:
            X.5Sb r0 = X.AnonymousClass5SZ.A07
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            if (r0 == 0) goto L_0x0467
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setHeading(r12)
        L_0x0467:
            X.5Sb r0 = X.AnonymousClass5SZ.A0K
            boolean r10 = r4.containsKey(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setPassword(r10)
            X.5Sb r0 = X.AnonymousClass5SZ.A0D
            boolean r10 = r4.containsKey(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setEditable(r10)
            X.5Sb r0 = X.AnonymousClass5SZ.A0I
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0a33
            int r10 = r0.intValue()
        L_0x048b:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setMaxTextLength(r10)
            boolean r0 = X.C54743HRb.A00(r6)
            r7.setEnabled(r0)
            X.5Sb r10 = X.AnonymousClass5SZ.A06
            boolean r11 = r4.containsKey(r10)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setFocusable(r11)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            boolean r0 = r0.isFocusable()
            r14 = 2
            if (r0 == 0) goto L_0x04c5
            java.lang.Object r0 = r5.A00(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setFocused(r11)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x0a2e
            r7.addAction(r14)
        L_0x04c5:
            X.4cg r0 = r6.A05()
            if (r0 == 0) goto L_0x04d1
            boolean r0 = r0.A0p()
            if (r0 != 0) goto L_0x04da
        L_0x04d1:
            X.5Sb r0 = X.AnonymousClass5SZ.A0B
            boolean r0 = r4.containsKey(r0)
            r11 = 1
            if (r0 == 0) goto L_0x04db
        L_0x04da:
            r11 = 0
        L_0x04db:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setVisibleToUser(r11)
            X.5Sb r0 = X.AnonymousClass5SZ.A0H
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            if (r0 == 0) goto L_0x04ed
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setLiveRegion(r14)
        L_0x04ed:
            r7.setClickable(r3)
            X.5Sb r0 = X.C290125en.A0A
            java.lang.Object r14 = X.C285765So.A00(r5, r0)
            X.5ep r14 = (X.C290145ep) r14
            r19 = 16
            if (r14 == 0) goto L_0x0533
            java.lang.Object r11 = X.C285765So.A00(r5, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            boolean r15 = X.0qQ.A0K(r11, r0)
            r0 = 4
            if (r13 == 0) goto L_0x0515
            int r11 = r13.A00
            if (r11 == r0) goto L_0x0512
            r0 = 3
            if (r11 != r0) goto L_0x0515
        L_0x0512:
            r0 = 0
            if (r15 != 0) goto L_0x0516
        L_0x0515:
            r0 = 1
        L_0x0516:
            r7.setClickable(r0)
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x0533
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto L_0x0533
            java.lang.String r13 = r14.A00
            X.04x r11 = new X.04x
            r0 = r19
            r11.<init>(r0, r13)
            r7.addAction(r11)
        L_0x0533:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setLongClickable(r3)
            X.5Sb r0 = X.C290125en.A0C
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x0559
            android.view.accessibility.AccessibilityNodeInfo r11 = r7.mInfo
            r11.setLongClickable(r12)
            boolean r11 = X.C54743HRb.A00(r6)
            if (r11 == 0) goto L_0x0559
            r13 = 32
            java.lang.String r11 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r13, r11)
            r7.addAction(r0)
        L_0x0559:
            X.5Sb r0 = X.C290125en.A02
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x056f
            r13 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r11 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r13, r11)
            r7.addAction(r0)
        L_0x056f:
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x05eb
            r0 = r23
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x058b
            r13 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r11 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r13, r11)
            r7.addAction(r0)
        L_0x058b:
            X.5Sb r0 = X.C290125en.A0B
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x05a2
            r13 = 16908372(0x1020054, float:2.3877464E-38)
            java.lang.String r11 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r13, r11)
            r7.addAction(r0)
        L_0x05a2:
            X.5Sb r0 = X.C290125en.A04
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x05b8
            r13 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r11 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r13, r11)
            r7.addAction(r0)
        L_0x05b8:
            X.5Sb r0 = X.C290125en.A0H
            java.lang.Object r11 = X.C285765So.A00(r5, r0)
            X.5ep r11 = (X.C290145ep) r11
            if (r11 == 0) goto L_0x05eb
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x05eb
            r0 = r46
            X.5TB r0 = r0.A0d
            android.content.ClipboardManager r0 = r0.A00
            android.content.ClipDescription r13 = r0.getPrimaryClipDescription()
            if (r13 == 0) goto L_0x05eb
            java.lang.String r0 = "text/*"
            boolean r0 = r13.hasMimeType(r0)
            if (r0 == 0) goto L_0x05eb
            r13 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r11 = r11.A00
            X.04x r0 = new X.04x
            r0.<init>(r13, r11)
            r7.addAction(r0)
        L_0x05eb:
            java.lang.String r0 = A0A(r6)
            if (r0 == 0) goto L_0x0659
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0659
            int r13 = A02(r9, r6)
            int r11 = A01(r9, r6)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setTextSelection(r13, r11)
            X.5Sb r0 = X.C290125en.A0N
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r0 == 0) goto L_0x0612
            java.lang.String r2 = r0.A00
        L_0x0612:
            X.04x r0 = new X.04x
            r0.<init>(r11, r2)
            r7.addAction(r0)
            r0 = 256(0x100, float:3.59E-43)
            r7.addAction(r0)
            r0 = 512(0x200, float:7.175E-43)
            r7.addAction(r0)
            r2 = 11
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setMovementGranularities(r2)
            X.5Sb r0 = X.AnonymousClass5SZ.A02
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x063b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0659
        L_0x063b:
            X.5Sb r0 = X.C290125en.A08
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0659
            r0 = r20
            boolean r0 = r4.containsKey(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r12)
            if (r0 == 0) goto L_0x09f5
            java.lang.Object r0 = X.C285765So.A00(r5, r10)
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x09f5
        L_0x0659:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = "androidx.compose.ui.semantics.id"
            r2.add(r0)
            java.lang.CharSequence r0 = r7.getText()
            if (r0 == 0) goto L_0x067c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x067c
            X.5Sb r0 = X.C290125en.A08
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x067c
            java.lang.String r0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r2.add(r0)
        L_0x067c:
            r0 = r21
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0689
            java.lang.String r0 = "androidx.compose.ui.semantics.testTag"
            r2.add(r0)
        L_0x0689:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setAvailableExtraData(r2)
            X.5Sb r0 = X.AnonymousClass5SZ.A0L
            java.lang.Object r13 = X.C285765So.A00(r5, r0)
            X.6JX r13 = (X.AnonymousClass6JX) r13
            if (r13 == 0) goto L_0x0712
            X.5Sb r11 = X.C290125en.A0M
            boolean r0 = r4.containsKey(r11)
            if (r0 == 0) goto L_0x09f1
            java.lang.String r0 = "android.widget.SeekBar"
        L_0x06a2:
            r7.setClassName(r0)
            X.6JX r0 = X.AnonymousClass6JX.A03
            if (r13 == r0) goto L_0x06ca
            X.Pxc r0 = r13.A02
            java.lang.Comparable r2 = r0.Byc()
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            java.lang.Comparable r0 = r0.B1S()
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            float r0 = r13.A00
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r12, r10, r2, r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setRangeInfo(r2)
        L_0x06ca:
            boolean r0 = r4.containsKey(r11)
            if (r0 == 0) goto L_0x0712
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x0712
            float r10 = r13.A00
            X.Pxc r0 = r13.A02
            java.lang.Comparable r2 = r0.B1S()
            java.lang.Number r2 = (java.lang.Number) r2
            float r14 = r2.floatValue()
            java.lang.Comparable r11 = r0.Byc()
            java.lang.Number r11 = (java.lang.Number) r11
            float r13 = r11.floatValue()
            int r0 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x06f3
            r14 = r13
        L_0x06f3:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x06fc
            X.04x r0 = X.04x.A0Z
            r7.addAction(r0)
        L_0x06fc:
            float r11 = r11.floatValue()
            float r2 = r2.floatValue()
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0709
            r11 = r2
        L_0x0709:
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0712
            X.04x r0 = X.04x.A0X
            r7.addAction(r0)
        L_0x0712:
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x072f
            X.5Sb r0 = X.C290125en.A0M
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x072f
            r10 = 16908349(0x102003d, float:2.38774E-38)
            java.lang.String r2 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r10, r2)
            r7.addAction(r0)
        L_0x072f:
            X.5SV r0 = r6.A06()
            X.5Sb r2 = X.AnonymousClass5SZ.A00
            java.lang.Object r0 = X.C285765So.A00(r0, r2)
            X.6JS r0 = (X.AnonymousClass6JS) r0
            if (r0 == 0) goto L_0x099e
            int r10 = r0.A01
            int r0 = r0.A00
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r10 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r10, r0, r3, r3)
        L_0x0745:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setCollectionInfo(r10)
        L_0x074a:
            X.5SV r10 = r6.A06()
            X.5Sb r0 = X.AnonymousClass5SZ.A01
            X.C285765So.A00(r10, r0)
            X.5SX r10 = r6.A07()
            if (r10 == 0) goto L_0x0779
            X.5SV r11 = r10.A06()
            X.5Sb r0 = X.AnonymousClass5SZ.A0N
            java.lang.Object r0 = X.C285765So.A00(r11, r0)
            if (r0 == 0) goto L_0x0779
            X.5SV r0 = r10.A06()
            java.lang.Object r11 = X.C285765So.A00(r0, r2)
            X.6JS r11 = (X.AnonymousClass6JS) r11
            if (r11 == 0) goto L_0x0914
            int r0 = r11.A01
            if (r0 < 0) goto L_0x0779
            int r0 = r11.A00
            if (r0 >= 0) goto L_0x0914
        L_0x0779:
            X.5Sb r0 = X.AnonymousClass5SZ.A08
            java.lang.Object r3 = X.C285765So.A00(r5, r0)
            X.6IQ r3 = (X.AnonymousClass6IQ) r3
            X.5Sb r0 = X.C290125en.A0J
            java.lang.Object r11 = X.C285765So.A00(r5, r0)
            r10 = 0
            if (r3 == 0) goto L_0x07f4
            if (r11 == 0) goto L_0x07f4
            X.5SV r0 = r6.A06()
            java.lang.Object r0 = X.C285765So.A00(r0, r2)
            if (r0 != 0) goto L_0x07a7
            X.5SV r1 = r6.A06()
            X.5Sb r0 = X.AnonymousClass5SZ.A0N
            java.lang.Object r0 = X.C285765So.A00(r1, r0)
            if (r0 != 0) goto L_0x07a7
            java.lang.String r0 = "android.widget.HorizontalScrollView"
            r7.setClassName(r0)
        L_0x07a7:
            X.0sa r0 = r3.A00
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x07be
            android.view.accessibility.AccessibilityNodeInfo r1 = r7.mInfo
            r0 = r17
            r1.setScrollable(r0)
        L_0x07be:
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x07f4
            boolean r0 = A0N(r3)
            if (r0 == 0) goto L_0x07dc
            X.04x r0 = X.04x.A0Z
            r7.addAction(r0)
            X.5R6 r0 = r6.A04
            X.5Q8 r1 = r0.A0D
            X.5Q8 r0 = X.AnonymousClass5Q8.Rtl
            if (r1 != r0) goto L_0x0910
            X.04x r0 = X.04x.A0b
        L_0x07d9:
            r7.addAction(r0)
        L_0x07dc:
            boolean r0 = A0M(r3)
            if (r0 == 0) goto L_0x07f4
            X.04x r0 = X.04x.A0X
            r7.addAction(r0)
            X.5R6 r0 = r6.A04
            X.5Q8 r1 = r0.A0D
            X.5Q8 r0 = X.AnonymousClass5Q8.Rtl
            if (r1 != r0) goto L_0x090c
            X.04x r0 = X.04x.A0c
        L_0x07f1:
            r7.addAction(r0)
        L_0x07f4:
            X.5Sb r0 = X.AnonymousClass5SZ.A0W
            java.lang.Object r1 = X.C285765So.A00(r5, r0)
            X.6IQ r1 = (X.AnonymousClass6IQ) r1
            if (r1 == 0) goto L_0x0858
            if (r11 == 0) goto L_0x0858
            X.5SV r0 = r6.A06()
            java.lang.Object r0 = X.C285765So.A00(r0, r2)
            if (r0 != 0) goto L_0x081b
            X.5SV r2 = r6.A06()
            X.5Sb r0 = X.AnonymousClass5SZ.A0N
            java.lang.Object r0 = X.C285765So.A00(r2, r0)
            if (r0 != 0) goto L_0x081b
            java.lang.String r0 = "android.widget.ScrollView"
            r7.setClassName(r0)
        L_0x081b:
            X.0sa r0 = r1.A00
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0832
            android.view.accessibility.AccessibilityNodeInfo r2 = r7.mInfo
            r0 = r17
            r2.setScrollable(r0)
        L_0x0832:
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x0858
            boolean r0 = A0N(r1)
            if (r0 == 0) goto L_0x0848
            X.04x r0 = X.04x.A0Z
            r7.addAction(r0)
            X.04x r0 = X.04x.A0Y
            r7.addAction(r0)
        L_0x0848:
            boolean r0 = A0M(r1)
            if (r0 == 0) goto L_0x0858
            X.04x r0 = X.04x.A0X
            r7.addAction(r0)
            X.04x r0 = X.04x.A0e
            r7.addAction(r0)
        L_0x0858:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0861
            X.C54742HRa.A00(r6, r7)
        L_0x0861:
            X.5Sb r0 = X.AnonymousClass5SZ.A0J
            java.lang.Object r1 = X.C285765So.A00(r5, r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setPaneTitle(r1)
            boolean r0 = X.C54743HRb.A00(r6)
            if (r0 == 0) goto L_0x0b05
            X.5Sb r0 = X.C290125en.A06
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x088a
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r1 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r2, r1)
            r7.addAction(r0)
        L_0x088a:
            X.5Sb r0 = X.C290125en.A01
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x08a0
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r1 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r2, r1)
            r7.addAction(r0)
        L_0x08a0:
            X.5Sb r0 = X.C290125en.A05
            java.lang.Object r0 = X.C285765So.A00(r5, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x08b6
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r1 = r0.A00
            X.04x r0 = new X.04x
            r0.<init>(r2, r1)
            r7.addAction(r0)
        L_0x08b6:
            X.5Sb r1 = X.C290125en.A03
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0b05
            java.lang.Object r14 = r5.A00(r1)
            java.util.List r14 = (java.util.List) r14
            int r0 = r14.size()
            X.01K r2 = A0Y
            int r3 = r2.A00
            if (r0 >= r3) goto L_0x0aef
            r0 = 10
            X.01s r13 = new X.01s
            r13.<init>(r0)
            X.0vu r0 = X.AnonymousClass01i.A00
            r0 = 6
            X.0vu r12 = new X.0vu
            r12.<init>(r0)
            X.01s r11 = r9.A09
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x08e6
            X.AnonymousClass01t.A01(r11)
        L_0x08e6:
            int[] r1 = r11.A02
            int r0 = r11.A00
            int r0 = X.01u.A00(r1, r0, r8)
            if (r0 < 0) goto L_0x0aca
            java.lang.Object r10 = X.AnonymousClass01t.A00(r11, r8)
            X.01h r10 = (X.01h) r10
            r0 = 16
            X.0yG r5 = new X.0yG
            r5.<init>(r0)
            int[] r3 = r2.A01
            int r2 = r2.A00
            r1 = 0
        L_0x0902:
            if (r1 >= r2) goto L_0x0a53
            r0 = r3[r1]
            r5.A02(r0)
            int r1 = r1 + 1
            goto L_0x0902
        L_0x090c:
            X.04x r0 = X.04x.A0b
            goto L_0x07f1
        L_0x0910:
            X.04x r0 = X.04x.A0c
            goto L_0x07d9
        L_0x0914:
            X.5SV r0 = r6.A06()
            java.util.Map r0 = r0.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0779
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0 = r17
            java.util.List r14 = r10.A08(r3, r0)
            int r12 = r14.size()
            r11 = 0
            r15 = 0
        L_0x0931:
            if (r11 >= r12) goto L_0x095f
            java.lang.Object r10 = r14.get(r11)
            X.5SX r10 = (X.AnonymousClass5SX) r10
            X.5SV r0 = r10.A06()
            java.util.Map r0 = r0.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x095c
            r13.add(r10)
            X.5R6 r0 = r10.A04
            X.5SI r0 = r0.A0U
            X.5SJ r0 = r0.A0J
            int r10 = r0.A03
            X.5R6 r0 = r6.A04
            X.5SI r0 = r0.A0U
            X.5SJ r0 = r0.A0J
            int r0 = r0.A03
            if (r10 >= r0) goto L_0x095c
            int r15 = r15 + 1
        L_0x095c:
            int r11 = r11 + 1
            goto L_0x0931
        L_0x095f:
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0779
            boolean r0 = X.C54747HRf.A00(r13)
            r19 = r15
            r21 = 0
            if (r0 == 0) goto L_0x0975
            r19 = 0
            r21 = r15
        L_0x0975:
            X.5SV r0 = r6.A06()
            X.Awu r10 = X.C41580Awu.A00
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0987
            java.lang.Object r0 = r10.invoke()
        L_0x0987:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r24 = r0.booleanValue()
            r20 = r17
            r22 = r17
            r23 = r3
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r19, r20, r21, r22, r23, r24)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setCollectionItemInfo(r1)
            goto L_0x0779
        L_0x099e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.5SV r10 = r6.A06()
            X.5Sb r0 = X.AnonymousClass5SZ.A0N
            java.lang.Object r0 = X.C285765So.A00(r10, r0)
            if (r0 == 0) goto L_0x09d2
            java.util.List r14 = r6.A08(r3, r12)
            int r13 = r14.size()
            r12 = 0
        L_0x09b8:
            if (r12 >= r13) goto L_0x09d2
            java.lang.Object r10 = r14.get(r12)
            X.5SX r10 = (X.AnonymousClass5SX) r10
            X.5SV r0 = r10.A06()
            java.util.Map r0 = r0.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x09cf
            r11.add(r10)
        L_0x09cf:
            int r12 = r12 + 1
            goto L_0x09b8
        L_0x09d2:
            boolean r0 = r11.isEmpty()
            r10 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x074a
            boolean r0 = X.C54747HRf.A00(r11)
            if (r0 == 0) goto L_0x09ec
            r0 = 1
            int r10 = r11.size()
        L_0x09e6:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r10 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r0, r10, r3, r3)
            goto L_0x0745
        L_0x09ec:
            int r0 = r11.size()
            goto L_0x09e6
        L_0x09f1:
            java.lang.String r0 = "android.widget.ProgressBar"
            goto L_0x06a2
        L_0x09f5:
            X.5R6 r13 = r6.A04
            X.IzX r2 = X.C58908IzX.A00
        L_0x09f9:
            X.5R6 r13 = r13.A0B()
            if (r13 == 0) goto L_0x0a1d
            java.lang.Object r0 = r2.invoke(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x09f9
            X.5SV r0 = r13.A0C()
            if (r0 == 0) goto L_0x0659
            java.lang.Object r0 = X.C285765So.A00(r0, r10)
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x0a1d
            goto L_0x0659
        L_0x0a1d:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            int r0 = r0.getMovementGranularities()
            r0 = r0 | 4
            r2 = r0 | 16
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setMovementGranularities(r2)
            goto L_0x0659
        L_0x0a2e:
            r7.addAction(r12)
            goto L_0x04c5
        L_0x0a33:
            r10 = -1
            goto L_0x048b
        L_0x0a36:
            X.5SX r14 = r14.A07()
            if (r14 == 0) goto L_0x045a
            goto L_0x043d
        L_0x0a3e:
            r0 = r2
            goto L_0x042d
        L_0x0a41:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setChecked(r2)
            goto L_0x040e
        L_0x0a48:
            X.6JW r0 = X.AnonymousClass6JW.Off
            if (r1 != r0) goto L_0x03f4
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setChecked(r3)
            goto L_0x03f4
        L_0x0a53:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r17 = r14.size()
            r3 = 0
        L_0x0a5d:
            r0 = r17
            if (r3 >= r0) goto L_0x0aa6
            java.lang.Object r1 = r14.get(r3)
            X.6Eq r1 = (X.C304646Eq) r1
            X.0qQ.A0A(r10)
            java.lang.String r0 = r1.A00
            int r0 = r10.A03(r0)
            if (r0 < 0) goto L_0x0aa2
            java.lang.String r2 = r1.A00
            int r1 = r10.A04(r2)
            r13.A07(r1, r2)
            r12.A06(r2, r1)
            int[] r0 = r5.A01
            r16 = r0
            int r0 = r5.A00
            r19 = r0
            r15 = 0
        L_0x0a87:
            r0 = r19
            if (r15 >= r0) goto L_0x0a94
            r0 = r16[r15]
            if (r1 != r0) goto L_0x0a9f
            if (r15 < 0) goto L_0x0a94
            r5.A01(r15)
        L_0x0a94:
            X.04x r0 = new X.04x
            r0.<init>(r1, r2)
            r7.addAction(r0)
        L_0x0a9c:
            int r3 = r3 + 1
            goto L_0x0a5d
        L_0x0a9f:
            int r15 = r15 + 1
            goto L_0x0a87
        L_0x0aa2:
            r4.add(r1)
            goto L_0x0a9c
        L_0x0aa6:
            int r10 = r4.size()
            r3 = 0
        L_0x0aab:
            if (r3 >= r10) goto L_0x0afd
            java.lang.Object r0 = r4.get(r3)
            X.6Eq r0 = (X.C304646Eq) r0
            int r2 = r5.A00(r3)
            java.lang.String r1 = r0.A00
            r13.A07(r2, r1)
            r12.A06(r1, r2)
            X.04x r0 = new X.04x
            r0.<init>(r2, r1)
            r7.addAction(r0)
            int r3 = r3 + 1
            goto L_0x0aab
        L_0x0aca:
            int r4 = r14.size()
        L_0x0ace:
            r0 = r16
            if (r0 >= r4) goto L_0x0afd
            java.lang.Object r1 = r14.get(r0)
            X.6Eq r1 = (X.C304646Eq) r1
            int r3 = r2.A00(r0)
            java.lang.String r1 = r1.A00
            r13.A07(r3, r1)
            r12.A06(r1, r3)
            X.04x r0 = new X.04x
            r0.<init>(r3, r1)
            r7.addAction(r0)
            int r16 = r16 + 1
            goto L_0x0ace
        L_0x0aef:
            java.lang.String r1 = "Can't have more than "
            java.lang.String r0 = " custom actions for one widget"
            java.lang.String r0 = X.002.A0c(r1, r0, r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0afd:
            X.01s r0 = r9.A08
            r0.A07(r8, r13)
            r11.A07(r8, r12)
        L_0x0b05:
            boolean r1 = r9.A0P(r6)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setScreenReaderFocusable(r1)
            X.0yJ r0 = r9.A05
            int r1 = r0.A03(r8)
            if (r1 < 0) goto L_0x0b33
            int[] r0 = r0.A03
            r2 = r0[r1]
            r0 = r18
            if (r2 == r0) goto L_0x0b33
            X.6Gd r0 = r46.getAndroidViewsHandler$ui_release()
            X.Gdi r1 = X.C290115em.A02(r0, r2)
            if (r1 == 0) goto L_0x0b59
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setTraversalBefore(r1)
        L_0x0b2d:
            java.lang.String r1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"
            r0 = 0
            A0C(r0, r9, r7, r1, r8)
        L_0x0b33:
            X.0yJ r0 = r9.A04
            int r1 = r0.A03(r8)
            if (r1 < 0) goto L_0x0b58
            int[] r0 = r0.A03
            r1 = r0[r1]
            r0 = r18
            if (r1 == r0) goto L_0x0b58
            X.6Gd r0 = r46.getAndroidViewsHandler$ui_release()
            X.Gdi r1 = X.C290115em.A02(r0, r1)
            if (r1 == 0) goto L_0x0b58
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.setTraversalAfter(r1)
            java.lang.String r1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"
            r0 = 0
            A0C(r0, r9, r7, r1, r8)
        L_0x0b58:
            return r7
        L_0x0b59:
            android.view.accessibility.AccessibilityNodeInfo r1 = r7.mInfo
            r0 = r46
            r1.setTraversalBefore(r0, r2)
            goto L_0x0b2d
        L_0x0b61:
            java.lang.String r1 = "semanticsNode "
            java.lang.String r0 = " has null parent"
            java.lang.String r0 = X.002.A0c(r1, r0, r8)
            X.I2E.A02(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A07(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        if (r5 == 0.0f) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A09(X.AnonymousClass5SX r10) {
        /*
            r9 = this;
            X.5SV r4 = r10.A05
            X.5Sb r0 = X.AnonymousClass5SZ.A0P
            java.lang.Object r5 = X.C285765So.A00(r4, r0)
            X.5Sb r0 = X.AnonymousClass5SZ.A0U
            java.lang.Object r1 = X.C285765So.A00(r4, r0)
            X.6JW r1 = (X.AnonymousClass6JW) r1
            X.5Sb r0 = X.AnonymousClass5SZ.A0M
            java.lang.Object r3 = X.C285765So.A00(r4, r0)
            X.5aV r3 = (X.C287625aV) r3
            r2 = 1
            r0 = 0
            if (r1 == 0) goto L_0x003a
            int r1 = r1.ordinal()
            if (r1 == r0) goto L_0x016f
            if (r1 == r2) goto L_0x0157
            r0 = 2
            if (r1 != r0) goto L_0x003a
            if (r5 != 0) goto L_0x003a
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131964331(0x7f1331ab, float:1.956544E38)
        L_0x0036:
            java.lang.String r5 = r1.getString(r0)
        L_0x003a:
            X.5Sb r0 = X.AnonymousClass5SZ.A0O
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x004f
            boolean r6 = r0.booleanValue()
            r1 = 4
            if (r3 == 0) goto L_0x013d
            int r0 = r3.A00
            if (r0 != r1) goto L_0x013d
        L_0x004f:
            X.5Sb r0 = X.AnonymousClass5SZ.A0L
            java.lang.Object r8 = X.C285765So.A00(r4, r0)
            X.6JX r8 = (X.AnonymousClass6JX) r8
            if (r8 == 0) goto L_0x00c3
            X.6JX r0 = X.AnonymousClass6JX.A03
            if (r8 == r0) goto L_0x0129
            if (r5 != 0) goto L_0x00c3
            X.Pxc r0 = r8.A02
            java.lang.Comparable r7 = r0.B1S()
            java.lang.Number r7 = (java.lang.Number) r7
            float r1 = r7.floatValue()
            java.lang.Comparable r3 = r0.Byc()
            java.lang.Number r3 = (java.lang.Number) r3
            float r0 = r3.floatValue()
            float r1 = r1 - r0
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
            float r5 = r8.A00
            float r0 = r3.floatValue()
            float r5 = r5 - r0
            float r1 = r7.floatValue()
            float r0 = r3.floatValue()
            float r1 = r1 - r0
            float r5 = r5 / r1
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0127
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0123
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0098:
            r1 = 100
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            r0 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r0
            int r1 = java.lang.Math.round(r5)
            r0 = 99
            if (r1 >= r2) goto L_0x011e
            r1 = 1
        L_0x00aa:
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r5 = r0.getResources()
            r3 = 2131975062(0x7f135b96, float:1.9587206E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = r5.getString(r3, r0)
        L_0x00c3:
            X.5Sb r6 = X.AnonymousClass5SZ.A04
            java.util.Map r0 = r4.A02
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0119
            X.4cD r3 = r10.A03
            X.5R6 r1 = r10.A04
            X.5SX r0 = new X.5SX
            r0.<init>(r3, r1, r4, r2)
            X.5SV r1 = r0.A06()
            X.5Sb r0 = X.AnonymousClass5SZ.A02
            java.lang.Object r0 = X.C285765So.A00(r1, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011c
        L_0x00ea:
            X.5Sb r0 = X.AnonymousClass5SZ.A0R
            java.lang.Object r0 = X.C285765So.A00(r1, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011c
        L_0x00fa:
            java.lang.Object r0 = X.C285765So.A00(r1, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0108
            int r0 = r0.length()
            if (r0 != 0) goto L_0x011c
        L_0x0108:
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131974186(0x7f13582a, float:1.9585429E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x0119:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x011c:
            r5 = 0
            goto L_0x0119
        L_0x011e:
            if (r1 <= r0) goto L_0x00aa
            r1 = 99
            goto L_0x00aa
        L_0x0123:
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0098
        L_0x0127:
            r1 = 0
            goto L_0x00aa
        L_0x0129:
            if (r5 != 0) goto L_0x00c3
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131964226(0x7f133142, float:1.9565228E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x00c3
        L_0x013d:
            if (r5 != 0) goto L_0x004f
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131968523(0x7f13420b, float:1.9573943E38)
            if (r6 == 0) goto L_0x0151
            r0 = 2131973045(0x7f1353b5, float:1.9583115E38)
        L_0x0151:
            java.lang.String r5 = r1.getString(r0)
            goto L_0x004f
        L_0x0157:
            r1 = 2
            if (r3 == 0) goto L_0x003a
            int r0 = r3.A00
            if (r0 != r1) goto L_0x003a
            if (r5 != 0) goto L_0x003a
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131974188(0x7f13582c, float:1.9585433E38)
            goto L_0x0036
        L_0x016f:
            r1 = 2
            if (r3 == 0) goto L_0x003a
            int r0 = r3.A00
            if (r0 != r1) goto L_0x003a
            if (r5 != 0) goto L_0x003a
            androidx.compose.ui.platform.AndroidComposeView r0 = r9.A0R
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131974189(0x7f13582d, float:1.9585435E38)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(X.5SX):java.lang.String");
    }

    private final ArrayList A0B(List list, boolean z) {
        Comparator comparator;
        0yC r0 = AnonymousClass01P.A00;
        0yC r14 = new 0yC(6);
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            A0E(r14, (AnonymousClass5SX) list2.get(i), arrayList);
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        0qQ.A0B(arrayList, 0);
        int size2 = arrayList.size() - 1;
        int i2 = 0;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                AnonymousClass5SX r7 = (AnonymousClass5SX) arrayList.get(i3);
                if (i3 != 0) {
                    float f = r7.A04().A03;
                    float f2 = r7.A04().A00;
                    boolean z2 = false;
                    if (f >= f2) {
                        z2 = true;
                    }
                    0qQ.A0B(arrayList2, 0);
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        int i4 = 0;
                        while (true) {
                            AnonymousClass5VN r3 = (AnonymousClass5VN) ((0eP) arrayList2.get(i4)).A00;
                            boolean z3 = false;
                            if (r3.A03 >= r3.A00) {
                                z3 = true;
                            }
                            if (!z2 && !z3) {
                                float f3 = r3.A03;
                                float max = Math.max(f, f3);
                                float f4 = r3.A00;
                                if (max < Math.min(f2, f4)) {
                                    arrayList2.set(i4, new 0eP(new AnonymousClass5VN(Math.max(r3.A01, 0.0f), Math.max(f3, f), Math.min(r3.A02, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((0eP) arrayList2.get(i4)).A01));
                                    ((List) ((0eP) arrayList2.get(i4)).A01).add(r7);
                                    break;
                                }
                            }
                            if (i4 == size3) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
                arrayList2.add(new 0eP(r7.A04(), 0sr.A1M(new AnonymousClass5SX[]{r7})));
                if (i3 == size2) {
                    break;
                }
                i3++;
            }
        }
        01V.A1D(arrayList2, AnonymousClass6JZ.A00);
        ArrayList arrayList3 = new ArrayList();
        int size4 = arrayList2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            0eP r5 = (0eP) arrayList2.get(i5);
            List list3 = (List) r5.A01;
            if (z) {
                comparator = C58006Ijz.A00;
            } else {
                comparator = C305656Ja.A00;
            }
            01V.A1D(list3, new C305676Jc(new C305666Jb(comparator, AnonymousClass5R6.A0Z)));
            arrayList3.addAll((Collection) r5.A01);
        }
        01V.A1D(arrayList3, new C305696Je(C305686Jd.A00));
        while (true) {
            0qQ.A0B(arrayList3, 0);
            if (i2 > arrayList3.size() - 1) {
                return arrayList3;
            }
            List list4 = (List) r14.A03(((AnonymousClass5SX) arrayList3.get(i2)).A02);
            if (list4 != null) {
                if (!A0P((AnonymousClass5SX) arrayList3.get(i2))) {
                    arrayList3.remove(i2);
                } else {
                    i2++;
                }
                arrayList3.addAll(i2, list4);
                i2 += list4.size();
            } else {
                i2++;
            }
        }
    }

    private final void A0E(0yC r5, AnonymousClass5SX r6, ArrayList arrayList) {
        boolean z = false;
        if (r6.A04.A0D == AnonymousClass5Q8.Rtl) {
            z = true;
        }
        AnonymousClass5SV r0 = r6.A05;
        boolean z2 = r0.A02.get(AnonymousClass5SZ.A0G);
        if (z2 == null) {
            z2 = false;
        }
        boolean booleanValue = ((Boolean) z2).booleanValue();
        if (booleanValue || A0P(r6)) {
            01O A062 = A06(this);
            int i = r6.A02;
            if (A062.A05(i)) {
                arrayList.add(r6);
            }
            if (booleanValue) {
                r5.A08(i, A0B(00k.A0U(r6.A08(!r6.A06, false)), z));
                return;
            }
        }
        List A082 = r6.A08(!r6.A06, false);
        int size = A082.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0E(r5, (AnonymousClass5SX) A082.get(i2), arrayList);
        }
    }

    public static final void A0F(AnonymousClass5R6 r1, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0V.add(r1)) {
            androidComposeViewAccessibilityDelegateCompat.A0X.FIG(C60340gF.A00);
        }
    }

    public static final void A0G(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        C55823Ho6 ho6 = androidComposeViewAccessibilityDelegateCompat.A0A;
        if (ho6 != null) {
            int i2 = ho6.A05.A02;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - ho6.A04 <= 1000) {
                AccessibilityEvent A042 = A04(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i2), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                A042.setFromIndex(ho6.A01);
                A042.setToIndex(ho6.A03);
                A042.setAction(ho6.A00);
                A042.setMovementGranularity(ho6.A02);
                A042.getText().add(A0A(ho6.A05));
                A0D(A042, androidComposeViewAccessibilityDelegateCompat);
            }
        }
        androidComposeViewAccessibilityDelegateCompat.A0A = null;
    }

    public static final void A0H(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C378099Om r5) {
        if (r5.A05.contains(r5)) {
            androidComposeViewAccessibilityDelegateCompat.A0R.A0b.A00(r5, new AnonymousClass9M0(7, r5, androidComposeViewAccessibilityDelegateCompat), androidComposeViewAccessibilityDelegateCompat.A0W);
        }
    }

    public static final void A0I(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass5SY r18, AnonymousClass5SX r19) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2;
        int[] iArr = AnonymousClass01R.A00;
        01Q r12 = new 01Q();
        long[] jArr = 01o.A00;
        C63090yB.A02(r12, 6);
        AnonymousClass5SX r13 = r19;
        List A082 = r13.A08(false, true);
        int size = A082.size();
        int i = 0;
        while (true) {
            androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
            AnonymousClass5SY r8 = r18;
            if (i < size) {
                AnonymousClass5SX r7 = (AnonymousClass5SX) A082.get(i);
                if (A06(androidComposeViewAccessibilityDelegateCompat2).A04(r7.A02)) {
                    if (!r8.A00.A04(r7.A02)) {
                        break;
                    }
                    r12.A06(r7.A02);
                }
                i++;
            } else {
                C63090yB r0 = r8.A00;
                int[] iArr2 = r0.A02;
                long[] jArr2 = r0.A03;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop1:
                    while (true) {
                        long j = jArr2[i2];
                        if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128 && !r12.A04(iArr2[(i2 << 3) + i4])) {
                                    break loop1;
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                List A083 = r13.A08(false, true);
                int size2 = A083.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AnonymousClass5SX r2 = (AnonymousClass5SX) A083.get(i5);
                    if (A06(androidComposeViewAccessibilityDelegateCompat2).A04(r2.A02)) {
                        Object A032 = androidComposeViewAccessibilityDelegateCompat2.A06.A03(r2.A02);
                        0qQ.A0A(A032);
                        A0I(androidComposeViewAccessibilityDelegateCompat2, (AnonymousClass5SY) A032, r2);
                    }
                }
                return;
            }
        }
        A0F(r13.A04, androidComposeViewAccessibilityDelegateCompat2);
    }

    public static final void A0J(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Integer num, List list, int i, int i2) {
        if (i != Integer.MIN_VALUE && androidComposeViewAccessibilityDelegateCompat.A0b()) {
            AccessibilityEvent A042 = A04(androidComposeViewAccessibilityDelegateCompat, i, i2);
            if (num != null) {
                A042.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                A042.setContentDescription(C290155eq.A00(",", list));
            }
            0fg.A01("sendEvent", -1657607598);
            try {
                A0D(A042, androidComposeViewAccessibilityDelegateCompat);
            } finally {
                0fg.A00(-1109672564);
            }
        }
    }

    public static final boolean A0L(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass5SX r7, int i, int i2, boolean z) {
        String A0A2;
        Integer num;
        AnonymousClass5SV r2 = r7.A05;
        C285635Sb r1 = C290125en.A0N;
        boolean z2 = false;
        if (!r2.A02.containsKey(r1) || !C54743HRb.A00(r7)) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
            if ((i == i2 && i2 == androidComposeViewAccessibilityDelegateCompat.A00) || (A0A2 = A0A(r7)) == null) {
                return false;
            }
            if (i < 0 || i != i2 || i2 > A0A2.length()) {
                i = -1;
            }
            androidComposeViewAccessibilityDelegateCompat2.A00 = i;
            int length = A0A2.length();
            if (length > 0) {
                z2 = true;
            }
            int i3 = r7.A02;
            int A002 = A00(androidComposeViewAccessibilityDelegateCompat2, i3);
            Integer num2 = null;
            if (z2) {
                num = Integer.valueOf(i);
                num2 = Integer.valueOf(length);
            } else {
                num = null;
            }
            A0D(A05(androidComposeViewAccessibilityDelegateCompat2, A0A2, num, num, num2, A002), androidComposeViewAccessibilityDelegateCompat2);
            A0G(androidComposeViewAccessibilityDelegateCompat2, i3);
            return true;
        }
        0sK r3 = ((C290145ep) r2.A00(r1)).A01;
        if (r3 != null) {
            return ((Boolean) r3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        return false;
    }

    public static final boolean A0M(AnonymousClass6IQ r3) {
        C62320sa r2 = r3.A01;
        if (((Number) r2.invoke()).floatValue() > 0.0f && !r3.A02) {
            return true;
        }
        if (((Number) r2.invoke()).floatValue() >= ((Number) r3.A00.invoke()).floatValue() || !r3.A02) {
            return false;
        }
        return true;
    }

    public static final boolean A0N(AnonymousClass6IQ r3) {
        C62320sa r2 = r3.A01;
        if (((Number) r2.invoke()).floatValue() < ((Number) r3.A00.invoke()).floatValue() && !r3.A02) {
            return true;
        }
        if (((Number) r2.invoke()).floatValue() <= 0.0f || !r3.A02) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (A0Q(r6) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0P(X.AnonymousClass5SX r6) {
        /*
            r5 = this;
            X.5SV r4 = r6.A05
            X.5Sb r0 = X.AnonymousClass5SZ.A02
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = X.00k.A0J(r0)
        L_0x0010:
            r3 = 0
            if (r0 != 0) goto L_0x003a
            X.5Sb r0 = X.AnonymousClass5SZ.A04
            java.lang.Object r2 = X.C285765So.A00(r4, r0)
            r1 = r2
            X.5Sb r0 = X.AnonymousClass5SZ.A0R
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = X.00k.A0J(r0)
        L_0x0028:
            if (r2 != 0) goto L_0x002b
            r1 = r0
        L_0x002b:
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = r5.A09(r6)
            if (r0 != 0) goto L_0x003a
            boolean r0 = A0Q(r6)
            r2 = 0
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x005a
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x005b
            r0 = 1
            java.util.List r0 = r6.A08(r3, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            X.5R6 r1 = r6.A04
            X.6JY r0 = X.AnonymousClass6JY.A00
            X.5R6 r0 = X.C290085ej.A00(r1, r0)
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
        L_0x005a:
            r3 = 1
        L_0x005b:
            return r3
        L_0x005c:
            r0 = 0
            goto L_0x0028
        L_0x005e:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(X.5SX):boolean");
    }

    public static final boolean A0Q(AnonymousClass5SX r5) {
        AnonymousClass5SV r52 = r5.A05;
        Object A002 = C285765So.A00(r52, AnonymousClass5SZ.A0U);
        C287625aV r4 = (C287625aV) C285765So.A00(r52, AnonymousClass5SZ.A0M);
        boolean z = false;
        if (A002 != null) {
            z = true;
        }
        if (C285765So.A00(r52, AnonymousClass5SZ.A0O) == null) {
            return z;
        }
        if (r4 == null || r4.A00 != 4) {
            return true;
        }
        return z;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0R = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.A0O = accessibilityManager;
        this.A03 = 100;
        this.A0M = new AnonymousClass5SR(this);
        this.A0N = new AnonymousClass5SS(this);
        this.A0E = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A0J = new AnonymousClass5ST(this);
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A0P = new 0yC(6);
        this.A0Q = new 0yC(6);
        this.A08 = new 01s(10);
        this.A09 = new 01s(10);
        this.A00 = -1;
        this.A0V = new 04u(0);
        this.A0X = new 1HR(1);
        this.A0G = true;
        0yC r4 = AnonymousClass01P.A00;
        0qQ.A0C(r4, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A0I = r4;
        01Q r1 = new 01Q();
        long[] jArr = 01o.A00;
        C63090yB.A02(r1, 6);
        this.A07 = r1;
        01H r0 = new 01H();
        C63120yJ.A02(r0, 6);
        this.A05 = r0;
        01H r02 = new 01H();
        C63120yJ.A02(r02, 6);
        this.A04 = r02;
        this.A0S = new AnonymousClass5SU();
        this.A06 = new 0yC(6);
        AnonymousClass5SX A002 = androidComposeView.A0l.A00();
        0qQ.A0C(r4, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A0B = new AnonymousClass5SY(r4, A002);
        androidComposeView.addOnAttachStateChangeListener(new AnonymousClass5Sq(this));
        this.A0T = new C285785Sr(this);
        this.A0U = new ArrayList();
        this.A0W = new C377189Kw(this, 6);
    }

    public static final AccessibilityEvent A04(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2) {
        C290215ex r0;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0R;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0b() && (r0 = (C290215ex) A06(androidComposeViewAccessibilityDelegateCompat).A03(i)) != null) {
            AnonymousClass5SV r02 = r0.A01.A05;
            obtain.setPassword(r02.A02.containsKey(AnonymousClass5SZ.A0K));
        }
        return obtain;
    }

    public static final CharSequence A08(CharSequence charSequence) {
        int i = 100000;
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i);
        0qQ.A0C(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    public static final void A0D(AccessibilityEvent accessibilityEvent, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                androidComposeViewAccessibilityDelegateCompat.A0H = true;
            }
            try {
                androidComposeViewAccessibilityDelegateCompat.A0K.invoke(accessibilityEvent);
            } finally {
                androidComposeViewAccessibilityDelegateCompat.A0H = false;
            }
        }
    }

    public static final void A0K(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i, int i2) {
        AccessibilityEvent A042 = A04(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i), 32);
        A042.setContentChangeTypes(i2);
        if (str != null) {
            A042.getText().add(str);
        }
        A0D(A042, androidComposeViewAccessibilityDelegateCompat);
    }

    public final boolean A0c(long j, int i, boolean z) {
        C285635Sb r9;
        AnonymousClass6IQ r10;
        if (0qQ.A0K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            01O A062 = A06(this);
            if (j != 9205357640488583168L && C289295dM.A09(j)) {
                if (z) {
                    r9 = AnonymousClass5SZ.A0W;
                } else {
                    r9 = AnonymousClass5SZ.A08;
                }
                Object[] objArr = A062.A04;
                long[] jArr = A062.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((-1 ^ j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j2 & 255) < 128) {
                                    C290215ex r102 = (C290215ex) objArr[(i2 << 3) + i4];
                                    Rect rect = r102.A00;
                                    AnonymousClass5VN r11 = new AnonymousClass5VN((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                                    float A012 = C289295dM.A01(j);
                                    if (A012 >= r11.A01 && A012 < r11.A02) {
                                        float A022 = C289295dM.A02(j);
                                        if (A022 >= r11.A03 && A022 < r11.A00 && (r10 = (AnonymousClass6IQ) C285765So.A00(r102.A01.A05, r9)) != null) {
                                            boolean z3 = r10.A02;
                                            int i5 = i;
                                            int i6 = i5;
                                            if (z3) {
                                                i6 = -i5;
                                            }
                                            if ((i != 0 || !z3) && i6 >= 0) {
                                                if (((Number) r10.A01.invoke()).floatValue() >= ((Number) r10.A00.invoke()).floatValue()) {
                                                }
                                            } else if (((Number) r10.A01.invoke()).floatValue() <= 0.0f) {
                                            }
                                            z2 = true;
                                        }
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                return z2;
                            }
                        }
                        if (i2 == length) {
                            return z2;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public final 057 A0Z(View view) {
        return this.A0J;
    }
}
