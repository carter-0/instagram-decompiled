package androidx.compose.ui.contentcapture;

import X.00k;
import X.01O;
import X.01Q;
import X.01o;
import X.04u;
import X.0qQ;
import X.0yC;
import X.1HR;
import X.AnonymousClass00P;
import X.AnonymousClass01P;
import X.AnonymousClass05K;
import X.AnonymousClass07Z;
import X.AnonymousClass5SX;
import X.AnonymousClass5SY;
import X.C13907Tl7;
import X.C249513ju;
import X.C285815Sv;
import X.C288975cn;
import X.C290105el;
import X.C290115em;
import X.C60340gF;
import X.C62320sa;
import X.C63090yB;
import X.I2E;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;

public final class AndroidContentCaptureManager implements C13907Tl7, View.OnAttachStateChangeListener {
    public long A00;
    public 0yC A01;
    public AnonymousClass5SY A02;
    public C288975cn A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public 01O A07;
    public C62320sa A08;
    public final Handler A09;
    public final 04u A0A;
    public final 0yC A0B = new 0yC(6);
    public final C63090yB A0C;
    public final AndroidComposeView A0D;
    public final Runnable A0E;
    public final C249513ju A0F;

    public static final void A01(AndroidContentCaptureManager androidContentCaptureManager, AnonymousClass5SY r19, AnonymousClass5SX r20) {
        AndroidContentCaptureManager androidContentCaptureManager2;
        AnonymousClass5SX r14 = r20;
        List A082 = r14.A08(false, true);
        int size = A082.size();
        int i = 0;
        while (true) {
            androidContentCaptureManager2 = androidContentCaptureManager;
            if (i >= size) {
                break;
            }
            AnonymousClass5SX r2 = (AnonymousClass5SX) A082.get(i);
            if (androidContentCaptureManager2.A06().A04(r2.A02) && !r19.A00.A04(r2.A02)) {
                androidContentCaptureManager2.A04(r2);
            }
            i++;
        }
        0yC r5 = androidContentCaptureManager2.A01;
        int[] iArr = r5.A02;
        long[] jArr = r5.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i2 << 3) + i4];
                            if (!androidContentCaptureManager2.A06().A04(i5)) {
                                0yC r15 = androidContentCaptureManager2.A0B;
                                if (r15.A05(i5)) {
                                    r15.A07(i5);
                                } else {
                                    androidContentCaptureManager2.A0C.A06(i5);
                                }
                            }
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
        List A083 = r14.A08(false, true);
        int size2 = A083.size();
        for (int i6 = 0; i6 < size2; i6++) {
            AnonymousClass5SX r22 = (AnonymousClass5SX) A083.get(i6);
            if (androidContentCaptureManager2.A06().A04(r22.A02) && r5.A04(r22.A02)) {
                Object A032 = r5.A03(r22.A02);
                if (A032 != null) {
                    A01(androidContentCaptureManager2, (AnonymousClass5SY) A032, r22);
                } else {
                    I2E.A02("node not present in pruned tree before this change");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public static final void A02(AndroidContentCaptureManager androidContentCaptureManager, AnonymousClass5SY r17, AnonymousClass5SX r18) {
        AndroidContentCaptureManager androidContentCaptureManager2;
        01Q r11 = new 01Q();
        long[] jArr = 01o.A00;
        C63090yB.A02(r11, 6);
        AnonymousClass5SX r12 = r18;
        List A082 = r12.A08(false, true);
        int size = A082.size();
        int i = 0;
        while (true) {
            androidContentCaptureManager2 = androidContentCaptureManager;
            AnonymousClass5SY r8 = r17;
            if (i < size) {
                AnonymousClass5SX r2 = (AnonymousClass5SX) A082.get(i);
                if (androidContentCaptureManager2.A06().A04(r2.A02)) {
                    if (!r8.A00.A04(r2.A02)) {
                        break;
                    }
                    r11.A06(r2.A02);
                }
                i++;
            } else {
                C63090yB r0 = r8.A00;
                int[] iArr = r0.A02;
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
                                if ((255 & j) < 128 && !r11.A04(iArr[(i2 << 3) + i4])) {
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
                List A083 = r12.A08(false, true);
                int size2 = A083.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AnonymousClass5SX r22 = (AnonymousClass5SX) A083.get(i5);
                    if (androidContentCaptureManager2.A06().A04(r22.A02)) {
                        Object A032 = androidContentCaptureManager2.A01.A03(r22.A02);
                        if (A032 != null) {
                            A02(androidContentCaptureManager2, (AnonymousClass5SY) A032, r22);
                        } else {
                            I2E.A02("node not present in pruned tree before this change");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                return;
            }
        }
        if (androidContentCaptureManager2.A0A.add(r12.A04)) {
            androidContentCaptureManager2.A0F.FIG(C60340gF.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 3
            boolean r0 = X.C376709Ja.A00(r3, r9)
            if (r0 == 0) goto L_0x002c
            r6 = r9
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r6.A03
            X.1Hj r7 = X.1Hj.A02
            int r1 = r6.A00
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r4) goto L_0x003a
            if (r1 != r5) goto L_0x0032
            java.lang.Object r3 = r6.A02
            X.1IT r3 = (X.AnonymousClass1IT) r3
            java.lang.Object r2 = r6.A01
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r2 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r2
            goto L_0x004e
        L_0x002c:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r8, r9, r3)
            goto L_0x0015
        L_0x0032:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x003a:
            java.lang.Object r3 = r6.A02
            X.1IT r3 = (X.AnonymousClass1IT) r3
            java.lang.Object r2 = r6.A01
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r2 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r2
            goto L_0x005e
        L_0x0043:
            X.0eS.A00(r0)
            X.3ju r0 = r8.A0F     // Catch:{ all -> 0x00a4 }
            X.1IT r3 = r0.CfF()     // Catch:{ all -> 0x00a4 }
            r2 = r8
            goto L_0x0051
        L_0x004e:
            X.0eS.A00(r0)     // Catch:{ all -> 0x00a2 }
        L_0x0051:
            r6.A01 = r2     // Catch:{ all -> 0x00a2 }
            r6.A02 = r3     // Catch:{ all -> 0x00a2 }
            r6.A00 = r4     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = r3.A01(r6)     // Catch:{ all -> 0x00a2 }
            if (r0 != r7) goto L_0x0061
            goto L_0x0098
        L_0x005e:
            X.0eS.A00(r0)     // Catch:{ all -> 0x00a2 }
        L_0x0061:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x009a
            r3.A00()     // Catch:{ all -> 0x00a2 }
            X.5cn r1 = r2.A03     // Catch:{ all -> 0x00a2 }
            r0 = 0
            if (r1 == 0) goto L_0x0072
            r0 = 1
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r2.A00()     // Catch:{ all -> 0x00a2 }
        L_0x0077:
            boolean r0 = r2.A05     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0084
            r2.A05 = r4     // Catch:{ all -> 0x00a2 }
            android.os.Handler r1 = r2.A09     // Catch:{ all -> 0x00a2 }
            java.lang.Runnable r0 = r2.A0E     // Catch:{ all -> 0x00a2 }
            r1.post(r0)     // Catch:{ all -> 0x00a2 }
        L_0x0084:
            X.04u r0 = r2.A0A     // Catch:{ all -> 0x00a2 }
            r0.clear()     // Catch:{ all -> 0x00a2 }
            r0 = 100
            r6.A01 = r2     // Catch:{ all -> 0x00a2 }
            r6.A02 = r3     // Catch:{ all -> 0x00a2 }
            r6.A00 = r5     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = X.C241603Pv.A01(r6, r0)     // Catch:{ all -> 0x00a2 }
            if (r0 != r7) goto L_0x0051
            goto L_0x0099
        L_0x0098:
            return r7
        L_0x0099:
            return r7
        L_0x009a:
            X.04u r0 = r2.A0A
            r0.clear()
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r1 = move-exception
            r2 = r8
        L_0x00a6:
            X.04u r0 = r2.A0A
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A07(X.4D7):java.lang.Object");
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final void onViewAttachedToWindow(View view) {
    }

    private final void A00() {
        C288975cn r6 = this.A03;
        if (r6 != null && Build.VERSION.SDK_INT >= 29) {
            0yC r5 = this.A0B;
            boolean z = false;
            if (r5.A01 != 0) {
                z = true;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = r5.A04;
                long[] jArr = r5.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((j & ((j ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ -1) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    arrayList.add(objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((C290105el) arrayList.get(i4)).A00);
                }
                r6.A04(arrayList2);
                r5.A06();
            }
            C63090yB r52 = this.A0C;
            if (r52.A01 != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = r52.A02;
                long[] jArr2 = r52.A03;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j2 = jArr2[i5];
                        if ((j2 & ((j2 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                            int i6 = 8 - (((i5 - length2) ^ -1) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j2 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i5 << 3) + i7]));
                                }
                                j2 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList4.add(Long.valueOf((long) ((Number) arrayList3.get(i8)).intValue()));
                }
                r6.A05(00k.A0y(arrayList4));
                r52.A05();
            }
        }
    }

    public static final void A03(AndroidContentCaptureManager androidContentCaptureManager, String str, int i) {
        C288975cn r2;
        if (Build.VERSION.SDK_INT >= 29 && (r2 = androidContentCaptureManager.A03) != null) {
            AutofillId A012 = r2.A01((long) i);
            if (A012 != null) {
                r2.A03(A012, str);
            } else {
                I2E.A02("Invalid content capture ID");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bf, code lost:
        if (((r18 & ((r18 ^ -1) << 6)) & -9187201950435737472L) != 0) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(X.AnonymousClass5SX r23) {
        /*
            r22 = this;
            r6 = r22
            X.5cn r0 = r6.A03
            if (r0 == 0) goto L_0x01f4
            r5 = r23
            X.5SV r4 = r5.A05
            X.5Sb r0 = X.AnonymousClass5SZ.A0F
            java.lang.Object r9 = X.C285765So.A00(r4, r0)
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r2 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            if (r1 != r0) goto L_0x01d3
            boolean r0 = X.0qQ.A0K(r9, r7)
            if (r0 == 0) goto L_0x01d3
            X.5Sb r0 = X.C290125en.A0Q
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x0039
            X.0eL r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x0039
            r0.invoke(r8)
        L_0x0039:
            int r9 = r5.A02
            X.5cn r8 = r6.A03
            r10 = 0
            if (r8 == 0) goto L_0x005b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x005b
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0D
            android.view.autofill.AutofillId r7 = r0.getAutofillId()
            X.5SX r0 = r5.A07()
            if (r0 == 0) goto L_0x0072
            int r0 = r0.A02
            long r0 = (long) r0
            android.view.autofill.AutofillId r7 = r8.A01(r0)
            if (r7 != 0) goto L_0x0072
        L_0x005b:
            java.util.List r3 = r5.A08(r3, r2)
            r2 = 0
            int r1 = r3.size()
        L_0x0064:
            if (r2 >= r1) goto L_0x01f4
            java.lang.Object r0 = r3.get(r2)
            X.5SX r0 = (X.AnonymousClass5SX) r0
            r6.A04(r0)
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0072:
            long r0 = (long) r9
            X.5el r7 = r8.A02(r7, r0)
            if (r7 == 0) goto L_0x005b
            X.5Sb r1 = X.AnonymousClass5SZ.A0K
            java.util.Map r0 = r4.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x005b
            java.lang.Object r8 = r7.A00
            android.view.ViewStructure r8 = (android.view.ViewStructure) r8
            android.os.Bundle r12 = r8.getExtras()
            if (r12 == 0) goto L_0x0094
            long r0 = r6.A00
            java.lang.String r11 = "android.view.contentcapture.EventTimestamp"
            r12.putLong(r11, r0)
        L_0x0094:
            X.5Sb r0 = X.AnonymousClass5SZ.A0Q
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00a1
            r8.setId(r9, r10, r10, r0)
        L_0x00a1:
            X.5Sb r0 = X.AnonymousClass5SZ.A0R
            java.lang.Object r1 = X.C285765So.A00(r4, r0)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r10 = "\n"
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "android.widget.TextView"
            r8.setClassName(r0)
            java.lang.String r0 = X.C290155eq.A00(r10, r1)
            r8.setText(r0)
        L_0x00b9:
            X.5Sb r0 = X.AnonymousClass5SZ.A04
            java.lang.Object r1 = X.C285765So.A00(r4, r0)
            X.5Tq r1 = (X.C286025Tq) r1
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = "android.widget.EditText"
            r8.setClassName(r0)
            r8.setText(r1)
        L_0x00cb:
            X.5Sb r0 = X.AnonymousClass5SZ.A02
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = X.C290155eq.A00(r10, r0)
            r8.setContentDescription(r0)
        L_0x00dc:
            X.5Sb r0 = X.AnonymousClass5SZ.A0M
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            X.5aV r0 = (X.C287625aV) r0
            if (r0 == 0) goto L_0x00f1
            int r0 = r0.A00
            java.lang.String r0 = X.C290115em.A03(r0)
            if (r0 == 0) goto L_0x00f1
            r8.setClassName(r0)
        L_0x00f1:
            X.62f r0 = X.C290115em.A01(r4)
            if (r0 == 0) goto L_0x0112
            X.62Y r10 = r0.A04
            X.5Z4 r0 = r10.A04
            X.5ZB r0 = r0.A02
            long r0 = r0.A01
            float r4 = X.AnonymousClass5Z5.A00(r0)
            X.4cd r1 = r10.A06
            float r0 = r1.AwL()
            float r4 = r4 * r0
            float r0 = r1.B77()
            float r4 = r4 * r0
            r8.setTextStyle(r4, r3, r3, r3)
        L_0x0112:
            X.5SX r1 = r5.A07()
            if (r1 == 0) goto L_0x01c8
            X.4cg r4 = r5.A05()
            if (r4 == 0) goto L_0x01c8
            boolean r0 = r4.COx()
            if (r0 == 0) goto L_0x01c8
            X.4cD r1 = r1.A03
            r0 = 8
            X.4cg r0 = X.AnonymousClass5WH.A04(r1, r0)
            X.5VN r12 = r0.CgV(r4, r2)
        L_0x0130:
            float r1 = r12.A01
            int r11 = (int) r1
            float r10 = r12.A03
            int r4 = (int) r10
            float r0 = r12.A02
            float r0 = r0 - r1
            int r1 = (int) r0
            float r0 = r12.A00
            float r0 = r0 - r10
            int r0 = (int) r0
            r10 = r8
            r12 = r4
            r13 = r3
            r14 = r3
            r15 = r1
            r16 = r0
            r10.setDimens(r11, r12, r13, r14, r15, r16)
            X.0yB r10 = r6.A0C
            boolean r0 = r10.A04(r9)
            if (r0 == 0) goto L_0x01cc
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r9
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r11 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r10.A00
            int r21 = r1 >>> 7
            r21 = r21 & r4
            r20 = 0
        L_0x0161:
            long[] r8 = r10.A03
            int r7 = r21 >> 3
            r0 = r21 & 7
            int r1 = r0 << 3
            r12 = r8[r7]
            long r12 = r12 >>> r1
            int r0 = r7 + 1
            r18 = r8[r0]
            int r0 = 64 - r1
            long r18 = r18 << r0
            long r7 = (long) r1
            long r0 = -r7
            r7 = 63
            long r0 = r0 >> r7
            long r18 = r18 & r0
            long r18 = r18 | r12
            long r0 = (long) r11
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r12
            long r0 = r0 ^ r18
            long r7 = r0 - r12
            r16 = -1
            long r0 = r0 ^ r16
            long r0 = r0 & r7
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r14
        L_0x0193:
            r12 = 0
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x01b5
            int r7 = java.lang.Long.numberOfTrailingZeros(r0)
            int r8 = r7 >> 3
            int r8 = r8 + r21
            r8 = r8 & r4
            int[] r7 = r10.A02
            r7 = r7[r8]
            if (r7 != r9) goto L_0x01af
            if (r8 < 0) goto L_0x005b
            X.C63090yB.A03(r10, r8)
            goto L_0x005b
        L_0x01af:
            r12 = 1
            long r7 = r0 - r12
            long r0 = r0 & r7
            goto L_0x0193
        L_0x01b5:
            long r7 = r18 ^ r16
            r0 = 6
            long r7 = r7 << r0
            long r18 = r18 & r7
            long r18 = r18 & r14
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            int r20 = r20 + 8
            int r21 = r21 + r20
            r21 = r21 & r4
            goto L_0x0161
        L_0x01c8:
            X.5VN r12 = X.AnonymousClass5VN.A04
            goto L_0x0130
        L_0x01cc:
            X.0yC r0 = r6.A0B
            r0.A08(r9, r7)
            goto L_0x005b
        L_0x01d3:
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0039
            boolean r0 = X.0qQ.A0K(r9, r8)
            if (r0 == 0) goto L_0x0039
            X.5Sb r0 = X.C290125en.A0Q
            java.lang.Object r0 = X.C285765So.A00(r4, r0)
            X.5ep r0 = (X.C290145ep) r0
            if (r0 == 0) goto L_0x0039
            X.0eL r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x0039
            r0.invoke(r7)
            goto L_0x0039
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A04(X.5SX):void");
    }

    private final void A05(AnonymousClass5SX r5) {
        if (this.A03 != null) {
            int i = r5.A02;
            0yC r1 = this.A0B;
            if (r1.A05(i)) {
                r1.A07(i);
            } else {
                this.A0C.A06(i);
            }
            List A082 = r5.A08(false, true);
            int size = A082.size();
            for (int i2 = 0; i2 < size; i2++) {
                A05((AnonymousClass5SX) A082.get(i2));
            }
        }
    }

    public final 01O A06() {
        if (this.A06) {
            this.A06 = false;
            this.A07 = C290115em.A00(this.A0D.A0l);
            this.A00 = System.currentTimeMillis();
        }
        return this.A07;
    }

    public final void onStart(AnonymousClass07Z r2) {
        this.A03 = (C288975cn) this.A08.invoke();
        A04(this.A0D.A0l.A00());
        A00();
    }

    public final void onStop(AnonymousClass07Z r2) {
        A05(this.A0D.A0l.A00());
        A00();
        this.A03 = null;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A09.removeCallbacks(this.A0E);
        this.A03 = null;
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, C62320sa r7) {
        this.A0D = androidComposeView;
        this.A08 = r7;
        01Q r1 = new 01Q();
        long[] jArr = 01o.A00;
        C63090yB.A02(r1, 6);
        this.A0C = r1;
        this.A04 = AnonymousClass05K.A00;
        this.A06 = true;
        this.A0A = new 04u(0);
        this.A0F = new 1HR(1);
        this.A09 = new Handler(Looper.getMainLooper());
        0yC r3 = AnonymousClass01P.A00;
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A07 = r3;
        this.A01 = new 0yC(6);
        AnonymousClass5SX A002 = androidComposeView.A0l.A00();
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A02 = new AnonymousClass5SY(r3, A002);
        this.A0E = new C285815Sv(this);
    }
}
