package X;

import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;

/* renamed from: X.HtA  reason: case insensitive filesystem */
public final class C56122HtA {
    public final C74224PrD A00;
    public final MetaAiVoiceState A01;
    public final boolean A02;
    public final boolean A03;

    public C56122HtA(C74224PrD prD, MetaAiVoiceState metaAiVoiceState, boolean z, boolean z2) {
        0qQ.A0B(prD, 1);
        this.A00 = prD;
        this.A01 = metaAiVoiceState;
        this.A03 = z;
        this.A02 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56122HtA) {
                C56122HtA htA = (C56122HtA) obj;
                if (!0qQ.A0K(this.A00, htA.A00) || !0qQ.A0K(this.A01, htA.A01) || this.A03 != htA.A03 || this.A02 != htA.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StatusUpdate(connectionState=");
        A1A.append(this.A00);
        A1A.append(", metaAiVoiceState=");
        A1A.append(this.A01);
        A1A.append(", micState=");
        A1A.append(this.A03);
        A1A.append(", botAudioState=");
        return G9t.A1C(A1A, this.A02);
    }
}
