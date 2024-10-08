package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.DtU  reason: case insensitive filesystem */
public final class C47243DtU extends AnonymousClass0T0 implements C232262tL {
    public final C266444Yx A00;
    public final C273014lo A01;
    public final User A02;
    public final boolean A03;
    public final Reel A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47243DtU) {
                C47243DtU dtU = (C47243DtU) obj;
                if (!0qQ.A0K(this.A02, dtU.A02) || !0qQ.A0K(this.A00, dtU.A00) || this.A01 != dtU.A01 || this.A03 != dtU.A03 || !0qQ.A0K(this.A04, dtU.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.getId();
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A02)))) + AnonymousClass7TG.A0C(this.A04);
    }

    public C47243DtU(C266444Yx r1, C273014lo r2, Reel reel, User user, boolean z) {
        this.A02 = user;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
        this.A04 = reel;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
