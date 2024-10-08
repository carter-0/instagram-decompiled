package X;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class W82 implements Choreographer.FrameCallback {
    public boolean A00 = false;
    public volatile boolean A01 = false;
    public final /* synthetic */ WJb A02;

    public W82(WJb wJb) {
        this.A02 = wJb;
    }

    public final void A00() {
        if (!this.A01) {
            this.A01 = true;
            if (!C18401Vr3.A00.enableFabricRendererExclusively()) {
                S9B.A00().A02(this.A02.A06, RFI.TIMERS_EVENTS);
            }
        }
    }

    public final void doFrame(long j) {
        ArrayList arrayList;
        short s;
        if (this.A00) {
            this.A01 = false;
        } else if (!C18401Vr3.A00.enableFabricRendererExclusively()) {
            S9B.A00().A02(this.A02.A06, RFI.TIMERS_EVENTS);
        }
        0fc.A01(8192, "ScheduleDispatchFrameCallback", 73730556);
        try {
            WJb wJb = this.A02;
            synchronized (wJb.A07) {
                synchronized (wJb.A08) {
                    int i = 0;
                    while (true) {
                        arrayList = wJb.A09;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        W0S w0s = (W0S) arrayList.get(i);
                        if (!w0s.A0D()) {
                            int i2 = wJb.A00;
                            W0S[] w0sArr = wJb.A02;
                            int length = w0sArr.length;
                            if (i2 == length) {
                                w0sArr = (W0S[]) Arrays.copyOf(w0sArr, length * 2);
                                wJb.A02 = w0sArr;
                            }
                            int i3 = wJb.A00;
                            wJb.A00 = i3 + 1;
                            w0sArr[i3] = w0s;
                        } else {
                            int i4 = w0s.A02;
                            String A07 = w0s.A07();
                            short A08 = w0s.A08();
                            Map map = wJb.A0A;
                            Short sh = (Short) map.get(A07);
                            if (sh != null) {
                                s = sh.shortValue();
                            } else {
                                s = wJb.A01;
                                wJb.A01 = (short) (s + 1);
                                map.put(A07, Short.valueOf(s));
                            }
                            long j2 = ((((long) s) & 65535) << 32) | ((long) i4) | ((((long) A08) & 65535) << 48);
                            LongSparseArray longSparseArray = wJb.A03;
                            Integer num = (Integer) longSparseArray.get(j2);
                            W0S w0s2 = null;
                            if (num == null) {
                                longSparseArray.put(j2, Integer.valueOf(wJb.A00));
                            } else {
                                W0S[] w0sArr2 = wJb.A02;
                                int intValue = num.intValue();
                                W0S w0s3 = w0sArr2[intValue];
                                W0S w0s4 = w0s3;
                                if (w0s.A03 >= w0s3.A03) {
                                    w0s4 = w0s;
                                }
                                if (w0s4 != w0s3) {
                                    longSparseArray.put(j2, Integer.valueOf(wJb.A00));
                                    wJb.A02[intValue] = null;
                                    w0s2 = w0s3;
                                    w0s = w0s4;
                                } else {
                                    w0s2 = w0s;
                                    w0s2.A04 = false;
                                    w0s2.A09();
                                }
                            }
                            int i5 = wJb.A00;
                            W0S[] w0sArr3 = wJb.A02;
                            int length2 = w0sArr3.length;
                            if (i5 == length2) {
                                w0sArr3 = (W0S[]) Arrays.copyOf(w0sArr3, length2 * 2);
                                wJb.A02 = w0sArr3;
                            }
                            int i6 = wJb.A00;
                            wJb.A00 = i6 + 1;
                            w0sArr3[i6] = w0s;
                            if (w0s2 != null) {
                                w0s2.A04 = false;
                                w0s2.A09();
                            }
                        }
                        i++;
                    }
                    while (true) {
                    }
                }
                arrayList.clear();
            }
            if (!wJb.A0F) {
                wJb.A0F = true;
                Systrace.A07(8192, "ScheduleDispatchFrameCallback", wJb.A0D.get());
                QZK qzk = wJb.A04;
                C19946WiJ wiJ = wJb.A05;
                MessageQueueThread messageQueueThread = qzk.A03;
                0Sd.A00(messageQueueThread);
                messageQueueThread.runOnQueue(wiJ);
            }
        } finally {
            0fc.A00(8192, -1327842485);
        }
    }
}
