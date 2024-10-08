package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.rendercore.RenderTreeNode;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3XO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XO implements Runnable {
    public final /* synthetic */ AnonymousClass3XN A00;

    public AnonymousClass3XO(AnonymousClass3XN r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str;
        int i;
        int i2;
        int i3;
        AnonymousClass3XN r3 = this.A00;
        Integer A01 = 2SN.A01("Litho.ComponentTree.MountContent.Preallocated");
        if (A01 != null) {
            2SN.A05("Litho.ComponentTree.MountContent.Preallocated", String.valueOf(r3.A00), new HashMap(), A01.intValue());
        }
        boolean z = r3.A07;
        if (z) {
            str = "(avoidRedundantPreAllocations)";
        } else {
            str = "";
        }
        String A0R = 002.A0R("preAllocateMountContentForTree", str);
        if (ComponentsSystrace.A00.isTracing()) {
            ComponentsSystrace.A02(A0R);
        }
        List<RenderTreeNode> list = (List) r3.A05.invoke();
        if (!list.isEmpty()) {
            0vu r0 = AnonymousClass01i.A00;
            0vu r4 = new 0vu(6);
            for (RenderTreeNode renderTreeNode : list) {
                C251263mp r5 = C245543d5.A00(renderTreeNode).A03;
                if (!(r5 instanceof C251253mo) || !((C251253mo) r5).AFh()) {
                    C245343ci r1 = renderTreeNode.A06;
                    if ((r1 instanceof C245343ci) && r1.A00.A01.A01.AFh()) {
                    }
                }
                String A0J = r5.A0J();
                0qQ.A07(A0J);
                if (z) {
                    0vu r8 = r3.A01;
                    synchronized (r8) {
                        try {
                            int A03 = r8.A03(A0J);
                            if (A03 >= 0) {
                                i2 = r8.A02[A03];
                            } else {
                                i2 = 0;
                            }
                        } catch (Throwable th) {
                            if (ComponentsSystrace.A00.isTracing()) {
                                ComponentsSystrace.A01();
                            }
                            throw th;
                        }
                    }
                    int A032 = r4.A03(A0J);
                    if (A032 >= 0) {
                        i3 = r4.A02[A032];
                    } else {
                        i3 = 0;
                    }
                    r4.A06(A0J, i3 + 1);
                    if (i3 < i2) {
                        continue;
                    }
                }
                String A0R2 = 002.A0R("preallocateMount: ", A0J);
                try {
                    if (ComponentsSystrace.A00.isTracing()) {
                        ComponentsSystrace.A02(A0R2);
                    }
                    0sL r52 = r3.A06;
                    Context context = r3.A02.A0C;
                    0qQ.A07(context);
                    if (((Boolean) r52.invoke(context, renderTreeNode.A06.A0I())).booleanValue() && z) {
                        0vu r53 = r3.A01;
                        synchronized (r53) {
                            int A033 = r53.A03(A0J);
                            if (A033 >= 0) {
                                i = r53.A02[A033];
                            } else {
                                i = 0;
                            }
                            r53.A06(A0J, i + 1);
                        }
                    }
                    if (ComponentsSystrace.A00.isTracing()) {
                        ComponentsSystrace.A01();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ComponentsSystrace.A00.isTracing()) {
                        ComponentsSystrace.A01();
                    }
                    throw th;
                }
            }
        }
        if (ComponentsSystrace.A00.isTracing()) {
            ComponentsSystrace.A01();
        }
        if (A01 != null) {
            2SN.A03(A01.intValue(), 0Yt.A0E());
        }
    }
}
