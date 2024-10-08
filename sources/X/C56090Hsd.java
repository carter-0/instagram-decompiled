package X;

import com.instagram.android.R;

/* renamed from: X.Hsd  reason: case insensitive filesystem */
public final class C56090Hsd {
    public final 2WX A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56090Hsd) {
                C56090Hsd hsd = (C56090Hsd) obj;
                if (!0qQ.A0K(this.A01, hsd.A01) || !0qQ.A0K(this.A00, hsd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C56090Hsd(2WX r1, Integer num) {
        this.A01 = num;
        this.A00 = r1;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, (1865928119 + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LottieAnimationViewArgs(rawRes=");
        A1A.append(R.raw.white_sparkle_anim);
        A1A.append(", animationControl=");
        A1A.append("PLAY");
        A1A.append(", repeatCount=");
        A1A.append(-1);
        A1A.append(", repeatMode=");
        A1A.append(1);
        A1A.append(", minFrame=");
        A1A.append((Object) null);
        A1A.append(", maxFrame=");
        A1A.append((Object) null);
        A1A.append(", animatorListener=");
        A1A.append((Object) null);
        A1A.append(", tintColor=");
        A1A.append(this.A01);
        A1A.append(", style=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
