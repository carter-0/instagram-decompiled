package X;

import android.view.View;

public final class TzF implements C20943X5m {
    public static final TzF A00 = new Object();

    public final AnonymousClass2Ta Cfj(C244943c0 r14, 2Th r15, C276544tV r16, C276544tV r17, int i, int i2) {
        C307996Sh r2;
        int i3;
        C276544tV A07;
        C276544tV r1 = r17;
        0qQ.A0B(r1, 5);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), AnonymousClass972.MUTABLE_FLAG_MASK);
        C276544tV A072 = r1.A07(36);
        C245663dH r6 = null;
        C244943c0 r7 = r14;
        int i4 = i;
        if (A072 == null || (A07 = A072.A07(35)) == null) {
            r2 = null;
        } else {
            AnonymousClass2Ta AEy = A07.AEy(r14, i4, makeMeasureSpec);
            0qQ.A07(AEy);
            r2 = C308006Si.A00(r7, AEy, A07, (Object) null, C244873bt.A00(i4, makeMeasureSpec));
        }
        int size = View.MeasureSpec.getSize(i2);
        if (r2 != null) {
            i3 = r2.A01.A00();
        } else {
            i3 = 0;
        }
        AnonymousClass2Ta AEy2 = r16.AEy(r14, i4, View.MeasureSpec.makeMeasureSpec(size - i3, AnonymousClass972.MUTABLE_FLAG_MASK));
        0qQ.A07(AEy2);
        int size2 = View.MeasureSpec.getSize(i4);
        int height = AEy2.getHeight() + i3;
        if (r2 != null) {
            r6 = r2.A01;
        }
        return new Ty8(AEy2, r15, r6, size2, height, 0, i3);
    }

    public final boolean Etd(C276544tV r4, C276544tV r5, Object obj, Object obj2) {
        if (C276674ti.A00() == null && Q06.A00(r4.A07(35), r5.A07(35)) && obj == obj2) {
            return false;
        }
        return true;
    }
}
