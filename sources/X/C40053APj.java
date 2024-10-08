package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.APj  reason: case insensitive filesystem */
public final class C40053APj implements AnonymousClass2gO {
    public final /* synthetic */ C39654A3u A00;

    public C40053APj(C39654A3u a3u) {
        this.A00 = a3u;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C361278fx r11 = (C361278fx) obj;
        0qQ.A0B(r11, 0);
        int i = r11.A00;
        if (i == 3) {
            C39654A3u a3u = this.A00;
            C349307zv r3 = (C349307zv) r11.A00();
            0qQ.A0B(r3, 0);
            int i2 = r3.A07;
            AnonymousClass51R A01 = C39821AAs.A01(r3, r3.A06(), 54, i2, 0, i2, i2);
            C353498Hw r32 = a3u.A00;
            ImmutableList of = ImmutableList.of();
            0qQ.A07(of);
            int A002 = r32.A1k.A00();
            if (i2 > A002) {
                i2 = A002;
            }
            C353498Hw.A0K(of, (ImmutableList) null, r32, A01, AnonymousClass05K.A01, A01.A0H, 0, i2, false);
        } else if (i == 4) {
            this.A00.A00.A1o.A01();
        }
    }
}
