package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.util.List;

/* renamed from: X.Wp1  reason: case insensitive filesystem */
public final /* synthetic */ class C20312Wp1 implements Runnable {
    public final /* synthetic */ GLDrawingView A00;
    public final /* synthetic */ AnonymousClass8QD A01;
    public final /* synthetic */ C354998Oe A02;

    public /* synthetic */ C20312Wp1(GLDrawingView gLDrawingView, AnonymousClass8QD r2, C354998Oe r3) {
        this.A00 = gLDrawingView;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        float f;
        int i;
        GLDrawingView gLDrawingView = this.A00;
        C354998Oe r0 = this.A02;
        AnonymousClass8QD r7 = this.A01;
        C20366Wq6 wq6 = gLDrawingView.A0E;
        List<C17544VZx> list = r0.A00;
        wq6.A01();
        C21006X9e x9e = wq6.A05;
        if (x9e != null) {
            C19723WeP weP = (C19723WeP) x9e;
            f = weP.A00;
            i = weP.A03;
        } else {
            f = 0.0f;
            i = 0;
        }
        for (C17544VZx vZx : list) {
            AnonymousClass8O9 r02 = wq6.A03;
            r02.getClass();
            C21006X9e x9e2 = (C21006X9e) r02.A01.get(vZx.A04);
            wq6.A05 = x9e2;
            if (x9e2 == null) {
                wq6.A05 = new C19723WeP("FAIL_SAFE");
            } else {
                x9e2.ElQ(vZx.A00);
                wq6.A05.ESC(vZx.A01);
                int intValue = vZx.A03.intValue();
                if (intValue == 0) {
                    wq6.A03(vZx.A02);
                } else if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            wq6.A03(vZx.A02);
                            wq6.A0B = true;
                        }
                    }
                    wq6.A05(vZx.A02);
                } else {
                    wq6.A04(vZx.A02);
                }
            }
        }
        wq6.A05 = x9e;
        if (x9e != null) {
            x9e.ElQ(f);
            x9e.ESC(i);
        }
        List list2 = wq6.A0H;
        int A06 = C51966G9m.A06(list2) - 10;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            XCG xcg = (XCG) list2.get(i2);
            xcg.E3l();
            C19725WeR weR = wq6.A07;
            weR.getClass();
            weR.A03(xcg);
            if (i2 <= A06 && list2.size() > 10) {
                xcg.E3l();
                C19725WeR weR2 = wq6.A08;
                weR2.getClass();
                weR2.A03(xcg);
                wq6.A01 = i2;
            }
        }
        gLDrawingView.A03();
        r7.DAy();
    }
}
