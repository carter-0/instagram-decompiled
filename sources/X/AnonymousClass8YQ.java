package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YQ  reason: invalid class name */
public final class AnonymousClass8YQ implements C354038Kk {
    public final C354388Lv A00;
    public final C354098Kq A01;
    public final C353998Kg A02;
    public final C354008Kh A03;
    public final ArrayList A04 = new ArrayList();
    public final List A05;

    public final void AKm(C354098Kq r3) {
        0qQ.A0B(r3, 0);
        C354098Kq r1 = this.A01;
        synchronized (r1) {
            r3.A01 = r1.A01;
            r3.A02 = r1.A02;
            r3.A00 = r1.A00;
            Integer num = r1.A03;
            if (num != null) {
                r3.A03 = num;
            } else {
                0qQ.A0F("swipeMode");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void DC5(Integer num, float f) {
        Integer num2 = num;
        0qQ.A0B(num, 0);
        C354388Lv r4 = this.A00;
        if (r4 != null) {
            C318136oS A002 = C318116oQ.A00(r4);
            AnonymousClass9K4 r3 = new AnonymousClass9K4(r4, num2, (AnonymousClass4D7) null, f, 0);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
        }
    }

    public final void DSQ(Integer num, float f) {
        Integer num2 = num;
        0qQ.A0B(num, 0);
        C354388Lv r4 = this.A00;
        if (r4 != null) {
            C318136oS A002 = C318116oQ.A00(r4);
            AnonymousClass9K4 r3 = new AnonymousClass9K4(r4, num2, (AnonymousClass4D7) null, f, 1);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
        }
    }

    public final int Au0() {
        int i;
        C354098Kq r1 = this.A01;
        synchronized (r1) {
            i = r1.A01;
        }
        return i;
    }

    public final void ETV(int i) {
        C354388Lv r4 = this.A00;
        if (r4 != null) {
            C318136oS A002 = C318116oQ.A00(r4);
            C376929Jw r2 = new C376929Jw((Object) r4, (AnonymousClass4D7) null, i, 2);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
        }
    }

    public final void onStart() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((AnonymousClass8KA) it.next()).Dpx();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8Kq, java.lang.Object] */
    public AnonymousClass8YQ(C354388Lv r5, C353998Kg r6, C354008Kh r7, List list) {
        this.A00 = r5;
        this.A02 = r6;
        this.A05 = list;
        this.A03 = r7;
        ? obj = new Object();
        Integer num = AnonymousClass05K.A0N;
        0qQ.A0B(num, 0);
        obj.A03 = num;
        this.A01 = obj;
        synchronized (obj) {
            if (r5 != null) {
                C354398Lw r1 = (C354398Lw) r5.A07.getValue();
                if (r1 != null) {
                    obj.A01 = r1.A01;
                    obj.A02 = r1.A02;
                    obj.A00 = r1.A00;
                    Integer num2 = r1.A03;
                    0qQ.A0B(num2, 0);
                    obj.A03 = num2;
                }
            }
        }
    }
}
