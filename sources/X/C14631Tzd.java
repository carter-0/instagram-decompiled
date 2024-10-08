package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Tzd  reason: case insensitive filesystem */
public final class C14631Tzd {
    public BBV A00;
    public XA1 A01;
    public C247733gp A02;
    public Float A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final VW6 A0I;
    public final Reel A0J;
    public final C255773uh A0K;
    public final User A0L;
    public final Integer A0M;
    public final boolean A0N;

    public C14631Tzd(Reel reel, C255773uh r3, User user, boolean z) {
        Integer num;
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = reel;
        this.A0K = r3;
        if (user == null || user.BIW() != 0) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        this.A0M = num;
        this.A0L = user;
        this.A0I = null;
        this.A0N = z;
    }

    public C14631Tzd(C247733gp r4, C255773uh r5) {
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = null;
        this.A0K = r5;
        this.A0M = AnonymousClass05K.A0Y;
        this.A0I = null;
        this.A0N = false;
        this.A0L = r4.A08;
        this.A02 = r4;
    }

    public C14631Tzd(VW6 vw6, C255773uh r4) {
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = vw6.A02;
        this.A0K = r4;
        this.A0M = AnonymousClass05K.A0C;
        this.A0I = vw6;
        this.A0L = null;
        this.A0N = false;
    }

    public C14631Tzd(Reel reel, C255773uh r4) {
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = reel;
        this.A0K = r4;
        this.A0M = AnonymousClass05K.A0N;
        this.A0I = null;
        this.A0L = null;
        this.A0N = false;
    }
}
