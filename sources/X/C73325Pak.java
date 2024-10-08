package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pak  reason: case insensitive filesystem */
public final class C73325Pak implements Runnable {
    public final /* synthetic */ C68028Myu A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ 0rh A02;

    public C73325Pak(C68028Myu myu, List list, 0rh r3) {
        this.A00 = myu;
        this.A02 = r3;
        this.A01 = list;
    }

    public final void run() {
        int measuredWidth = this.A00.A01.getMeasuredWidth() / 3;
        float f = ((float) measuredWidth) / this.A02.A00;
        List<PJS> list = this.A01;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (PJS pjs : list) {
            0nA.A0g(pjs.A00, measuredWidth, (int) f);
            A0r.add(C60340gF.A00);
        }
    }
}
