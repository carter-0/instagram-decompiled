package X;

import android.view.View;

/* renamed from: X.8O6  reason: invalid class name */
public final class AnonymousClass8O6 implements Runnable {
    public final /* synthetic */ AnonymousClass8O4 A00;

    public AnonymousClass8O6(AnonymousClass8O4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8O4 r3 = this.A00;
        for (View view : r3.A0T) {
            Object obj = r3.A0U.get(view);
            obj.getClass();
            int i = 0;
            if (r3.A0N.A01.get(obj) == null) {
                i = 8;
            }
            view.setVisibility(i);
        }
        C21006X9e brush = AnonymousClass8O4.A00(r3).A00.getBrush();
        if (brush != null) {
            brush = (C21006X9e) r3.A0N.A01.get(brush.AiK());
        }
        AnonymousClass8O4.A06(r3, brush, true);
    }
}
