package X;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5qA  reason: invalid class name and case insensitive filesystem */
public final class C296505qA {
    public AnonymousClass57r A00;
    public Long A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C39664A4e A09;
    public final C296495q9 A0A;
    public final C296495q9 A0B;
    public final AnonymousClass0JR A0C;
    public final String A0D;
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final List A0G = new ArrayList();
    public final Map A0H = new HashMap();
    public final MotionEvent A0I;
    public final C296505qA A0J;

    public C296505qA(MotionEvent motionEvent, C296505qA r4, C39664A4e a4e, C296495q9 r6, AnonymousClass0JR r7, long j) {
        C296495q9 r0;
        long j2;
        0qQ.A0B(r6, 2);
        this.A0C = r7;
        this.A0B = r6;
        this.A0I = motionEvent;
        this.A06 = j;
        this.A0J = r4;
        this.A09 = a4e;
        this.A03 = motionEvent.getRawX();
        this.A04 = motionEvent.getRawY();
        if (r4 != null) {
            r0 = r4.A0B;
        } else {
            r0 = C296495q9.UNDEFINED;
        }
        this.A0A = r0;
        if (r4 != null) {
            j2 = r4.A07;
        } else {
            j2 = 0;
        }
        this.A08 = j2;
        this.A0D = AnonymousClass0HM.A00().toString();
        this.A05 = r7.now();
        this.A07 = motionEvent.getEventTime();
    }

    public final ArrayList A00() {
        List<C296545qF> list = this.A0E;
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (C296545qF r0 : list) {
            arrayList.add(r0.A09);
        }
        return arrayList;
    }
}
