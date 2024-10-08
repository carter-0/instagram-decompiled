package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.U1o  reason: case insensitive filesystem */
public final class C14689U1o extends Handler {
    public final /* synthetic */ WM9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14689U1o(Looper looper, WM9 wm9) {
        super(looper);
        this.A00 = wm9;
    }

    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            WM9 wm9 = this.A00;
            if (obj == wm9.A02) {
                int i2 = wm9.A00;
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    wm9.A02 = null;
                    if (obj2 instanceof Exception) {
                        Exception exc = (Exception) obj2;
                        WM6 wm6 = (WM6) wm9.A0A;
                        wm6.A00 = null;
                        Set set = wm6.A01;
                        ImmutableList copyOf = ImmutableList.copyOf((Collection) set);
                        set.clear();
                        C249803kO it = copyOf.iterator();
                        while (it.hasNext()) {
                            WM9.A01((WM9) it.next(), exc, 3);
                        }
                        return;
                    }
                    try {
                        wm9.A0C.E4y((byte[]) obj2);
                        WM6 wm62 = (WM6) wm9.A0A;
                        wm62.A00 = null;
                        Set set2 = wm62.A01;
                        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) set2);
                        set2.clear();
                        C249803kO it2 = copyOf2.iterator();
                        while (it2.hasNext()) {
                            WM9 wm92 = (WM9) it2.next();
                            if (WM9.A05(wm92)) {
                                WM9.A03(wm92, true);
                            }
                        }
                    } catch (Exception e) {
                        WM6 wm63 = (WM6) wm9.A0A;
                        wm63.A00 = null;
                        Set set3 = wm63.A01;
                        ImmutableList copyOf3 = ImmutableList.copyOf((Collection) set3);
                        set3.clear();
                        C249803kO it3 = copyOf3.iterator();
                        while (it3.hasNext()) {
                            WM9.A01((WM9) it3.next(), e, 1);
                        }
                    }
                }
            }
        } else if (i == 1) {
            WM9 wm93 = this.A00;
            if (obj == wm93.A01) {
                int i3 = wm93.A00;
                if (i3 == 3 || i3 == 4) {
                    wm93.A01 = null;
                    if (obj2 instanceof Exception) {
                        WM9.A02(wm93, (Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] E4w = wm93.A0C.E4w(wm93.A04, (byte[]) obj2);
                        if (!(wm93.A03 == null || E4w == null || E4w.length == 0)) {
                            wm93.A03 = E4w;
                        }
                        wm93.A00 = 4;
                        for (C265184Sw A002 : wm93.A0F.A01()) {
                            A002.A00();
                        }
                    } catch (Exception e2) {
                        WM9.A02(wm93, e2, true);
                    }
                }
            }
        }
    }
}
