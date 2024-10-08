package X;

import com.instagram.direct.emojipong.data.EmojiPongUser;

/* renamed from: X.JyG  reason: case insensitive filesystem */
public final class C61164JyG extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final int A01;
    public final EmojiPongUser A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61164JyG) {
                C61164JyG jyG = (C61164JyG) obj;
                if (!(0qQ.A0K(this.A02, jyG.A02) && this.A00 == jyG.A00 && this.A01 == jyG.A01 && this.A03 == jyG.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A03;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, (((AnonymousClass7TE.A0K(this.A02) + this.A00) * 31) + this.A01) * 31);
    }

    public C61164JyG(EmojiPongUser emojiPongUser, int i, int i2, boolean z) {
        this.A02 = emojiPongUser;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
