package X;

import android.os.Process;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.systrace.Systrace;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7Od  reason: invalid class name and case insensitive filesystem */
public final class C330777Od extends 0ng {
    public String A00;
    public final List A01;
    public final boolean A02;
    public final /* synthetic */ AnonymousClass7LO A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C330777Od(X.AnonymousClass7LO r5, java.lang.String r6, java.util.List r7) {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319128218901428(0x81080e000a1bb4, double:3.031701158799573E-306)
            boolean r3 = X.182.A06(r2, r3, r0)
            r0 = 2
            X.0qQ.A0B(r6, r0)
            r4.A03 = r5
            r2 = 1788300865(0x6a974e41, float:9.145867E25)
            r1 = 3
            r0 = 0
            r4.<init>(r2, r1, r3, r0)
            r4.A00 = r6
            r4.A01 = r7
            r4.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330777Od.<init>(X.7LO, java.lang.String, java.util.List):void");
    }

    public final void run() {
        Integer num;
        int i;
        boolean A0E;
        if (this.A02) {
            num = 0;
        } else {
            num = null;
        }
        AnonymousClass7LO r6 = this.A03;
        if (num != null) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            int intValue = num.intValue();
            if (intValue >= threadPriority) {
                0fh.A01("MessageThreadViewHolderPreloader.preload", -949586868);
                AnonymousClass0eM r5 = r6.A02.A0A;
                Object value = r5.getValue();
                0qQ.A07(value);
                ((C2366634p) value).A08((String) null);
                FrameLayout frameLayout = new FrameLayout(r6.A00);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                for (Number intValue2 : this.A01) {
                    int intValue3 = intValue2.intValue();
                    0sP r0 = (0sP) r6.A05.invoke(Integer.valueOf(intValue3));
                    if (r0 != null) {
                        A00(frameLayout, r0, intValue3);
                    }
                }
                Object value2 = r5.getValue();
                0qQ.A07(value2);
                ((C2366634p) value2).A05();
                i = -1102203298;
            } else {
                if (Systrace.A0E(1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AnonymousClass000.A00(125));
                    sb.append(num);
                    0fS.A01(sb.toString(), 1934370717);
                }
                Process.setThreadPriority(intValue);
                try {
                    0fh.A01("MessageThreadViewHolderPreloader.preload", -299264595);
                    AnonymousClass0eM r7 = r6.A02.A0A;
                    Object value3 = r7.getValue();
                    0qQ.A07(value3);
                    ((C2366634p) value3).A08((String) null);
                    FrameLayout frameLayout2 = new FrameLayout(r6.A00);
                    frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    for (Number intValue4 : this.A01) {
                        int intValue5 = intValue4.intValue();
                        0sP r02 = (0sP) r6.A05.invoke(Integer.valueOf(intValue5));
                        if (r02 != null) {
                            A00(frameLayout2, r02, intValue5);
                        }
                    }
                    Object value4 = r7.getValue();
                    0qQ.A07(value4);
                    ((C2366634p) value4).A05();
                    0fh.A00(1910831746);
                    if (!A0E) {
                        return;
                    }
                    return;
                } finally {
                    Process.setThreadPriority(threadPriority);
                    if (Systrace.A0E(1)) {
                        0fS.A00(-67943831);
                    }
                }
            }
        } else {
            0fh.A01("MessageThreadViewHolderPreloader.preload", 1303661986);
            AnonymousClass0eM r52 = r6.A02.A0A;
            Object value5 = r52.getValue();
            0qQ.A07(value5);
            ((C2366634p) value5).A08((String) null);
            FrameLayout frameLayout3 = new FrameLayout(r6.A00);
            frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            for (Number intValue6 : this.A01) {
                int intValue7 = intValue6.intValue();
                0sP r03 = (0sP) r6.A05.invoke(Integer.valueOf(intValue7));
                if (r03 != null) {
                    A00(frameLayout3, r03, intValue7);
                }
            }
            Object value6 = r52.getValue();
            0qQ.A07(value6);
            ((C2366634p) value6).A05();
            i = -550311061;
        }
        0fh.A00(i);
    }

    private final void A00(ViewGroup viewGroup, 0sP r7, int i) {
        Object invoke = r7.invoke(viewGroup);
        AnonymousClass7LO r3 = this.A03;
        HashMap hashMap = r3.A03;
        Integer valueOf = Integer.valueOf(i);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new C330767Oc();
            hashMap.put(valueOf, obj);
        }
        C330767Oc r2 = (C330767Oc) obj;
        if (0qQ.A0K(this.A00, r3.A09)) {
            0qQ.A0B(invoke, 0);
            r2.A01.add(invoke);
            return;
        }
        this.A00 = r3.A09;
        A00(viewGroup, r7, i);
    }
}
