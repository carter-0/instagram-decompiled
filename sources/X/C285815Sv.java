package X;

import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Sv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285815Sv implements Runnable {
    public final /* synthetic */ AndroidContentCaptureManager A00;

    public /* synthetic */ C285815Sv(AndroidContentCaptureManager androidContentCaptureManager) {
        this.A00 = androidContentCaptureManager;
    }

    public final void run() {
        Object obj;
        Object obj2;
        Object obj3;
        AndroidContentCaptureManager androidContentCaptureManager = this.A00;
        if (androidContentCaptureManager.A03 != null) {
            AndroidComposeView androidComposeView = androidContentCaptureManager.A0D;
            androidComposeView.Co0(true);
            AnonymousClass5SP r15 = androidComposeView.A0l;
            AndroidContentCaptureManager.A02(androidContentCaptureManager, androidContentCaptureManager.A02, r15.A00());
            AndroidContentCaptureManager.A01(androidContentCaptureManager, androidContentCaptureManager.A02, r15.A00());
            01O A06 = androidContentCaptureManager.A06();
            int[] iArr = A06.A02;
            long[] jArr = A06.A03;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ -1) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = iArr[(i << 3) + i3];
                                AnonymousClass5SY r13 = (AnonymousClass5SY) androidContentCaptureManager.A01.A03(i4);
                                C290215ex r0 = (C290215ex) A06.A03(i4);
                                if (r0 != null) {
                                    AnonymousClass5SX r3 = r0.A01;
                                    AnonymousClass5SV r2 = r3.A05;
                                    Iterator it = r2.iterator();
                                    if (r13 == null) {
                                        while (it.hasNext()) {
                                            Object key = ((Map.Entry) it.next()).getKey();
                                            C285635Sb r1 = AnonymousClass5SZ.A0R;
                                            if (0qQ.A0K(key, r1)) {
                                                List list = (List) C285765So.A00(r2, r1);
                                                if (list != null) {
                                                    obj3 = 00k.A0J(list);
                                                } else {
                                                    obj3 = null;
                                                }
                                                AndroidContentCaptureManager.A03(androidContentCaptureManager, String.valueOf(obj3), r3.A02);
                                            }
                                        }
                                    } else {
                                        while (it.hasNext()) {
                                            Object key2 = ((Map.Entry) it.next()).getKey();
                                            C285635Sb r14 = AnonymousClass5SZ.A0R;
                                            if (0qQ.A0K(key2, r14)) {
                                                List list2 = (List) C285765So.A00(r13.A01, r14);
                                                if (list2 != null) {
                                                    obj = 00k.A0J(list2);
                                                } else {
                                                    obj = null;
                                                }
                                                List list3 = (List) C285765So.A00(r2, r14);
                                                if (list3 != null) {
                                                    obj2 = 00k.A0J(list3);
                                                } else {
                                                    obj2 = null;
                                                }
                                                if (!0qQ.A0K(obj, obj2)) {
                                                    AndroidContentCaptureManager.A03(androidContentCaptureManager, String.valueOf(obj2), r3.A02);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    I2E.A02("no value for specified key");
                                    throw AnonymousClass00P.createAndThrow();
                                }
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
            0yC r142 = androidContentCaptureManager.A01;
            r142.A06();
            01O A062 = androidContentCaptureManager.A06();
            int[] iArr2 = A062.A02;
            Object[] objArr = A062.A04;
            long[] jArr2 = A062.A03;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((-1 ^ j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i6 = 8 - (((i5 - length2) ^ -1) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j2) < 128) {
                                int i8 = (i5 << 3) + i7;
                                r142.A08(iArr2[i8], new AnonymousClass5SY(androidContentCaptureManager.A06(), ((C290215ex) objArr[i8]).A01));
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
            androidContentCaptureManager.A02 = new AnonymousClass5SY(androidContentCaptureManager.A06(), r15.A00());
            androidContentCaptureManager.A05 = false;
        }
    }
}
