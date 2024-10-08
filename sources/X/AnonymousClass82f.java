package X;

import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.82f  reason: invalid class name */
public final class AnonymousClass82f implements C2802350v {
    public float A00;
    public int A01;
    public int A02;
    public 1Xj A03;
    public boolean A04;
    public final float A05;
    public final int A06;
    public final 2Fk A07;
    public final AnonymousClass2Fj A08;
    public final 1sP A09;
    public final User A0A;
    public final User A0B;
    public final String A0C;
    public final boolean A0D;

    public AnonymousClass82f(1sP r3, User user, User user2, String str, float f, float f2, int i, int i2, int i3, boolean z, boolean z2) {
        0qQ.A0B(user, 1);
        0qQ.A0B(str, 3);
        this.A0B = user;
        this.A0A = user2;
        this.A0C = str;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = f;
        this.A06 = i3;
        this.A09 = r3;
        this.A04 = z;
        this.A0D = z2;
        this.A00 = f2;
        2Fk r0 = new 2Fk(Boolean.valueOf(z));
        this.A08 = r0;
        this.A07 = r0;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final C273914nO BkW() {
        C273914nO r1 = new C273914nO();
        r1.A01 = C273924nP.ANIMATED_STICKERS;
        List singletonList = Collections.singletonList("clips_reshare_sticker_id");
        0qQ.A07(singletonList);
        r1.A06 = singletonList;
        return r1;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0Y;
    }
}
