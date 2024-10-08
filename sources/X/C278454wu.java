package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4wu  reason: invalid class name and case insensitive filesystem */
public final class C278454wu extends 0Yg implements 0sL {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ C243043Xe A02;
    public final /* synthetic */ AnonymousClass9NR A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C278454wu(UserSession userSession, AnonymousClass3W1 r3, C243043Xe r4, AnonymousClass9NR r5, String str, 0sP r7, boolean z) {
        super(2);
        this.A05 = r7;
        this.A06 = z;
        this.A03 = r5;
        this.A00 = userSession;
        this.A04 = str;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0rm, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        0qQ.A0B(obj2, 1);
        C246663ey r5 = (C246663ey) this.A05.invoke(obj2);
        ? obj3 = new Object();
        boolean z = this.A06;
        if (z) {
            C258243yh r4 = r5.A07;
            if (r4 != null) {
                AnonymousClass9NR r3 = this.A03;
                C263204Jn.A00(this.A00, this.A02, r3, r4, this.A04);
                C40520AdT adT = new C40520AdT(r5);
                obj3.A00 = adT;
                this.A01.A0L(adT, (Integer) null, false);
            } else {
                throw new IllegalStateException("media interactive view holder should not be null");
            }
        }
        return new C246263eI(new AnonymousClass9MP(24, r5, obj3, this.A01, z));
    }
}
