package X;

import android.net.Uri;

public final class I4Z {
    public final Uri A00;
    public final HMJ A01;
    public final JMQ A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I4Z) {
                I4Z i4z = (I4Z) obj;
                if (!(0qQ.A0K(this.A05, i4z.A05) && 0qQ.A0K(this.A06, i4z.A06) && 0qQ.A0K(this.A03, i4z.A03) && this.A01 == i4z.A01 && this.A0C == i4z.A0C && this.A0A == i4z.A0A && this.A08 == i4z.A08 && this.A07 == i4z.A07 && this.A0B == i4z.A0B && 0qQ.A0K(this.A00, i4z.A00) && this.A04 == i4z.A04 && 0qQ.A0K(this.A02, i4z.A02) && this.A09 == i4z.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(HMJ hmj, I4Z i4z, CharSequence charSequence, Object obj, 05G r20) {
        I4Z i4z2 = i4z;
        String str = i4z2.A05;
        String str2 = i4z2.A06;
        boolean z = i4z2.A0C;
        boolean z2 = i4z2.A0A;
        boolean z3 = i4z2.A08;
        boolean z4 = i4z2.A07;
        boolean z5 = i4z2.A0B;
        Uri uri = i4z2.A00;
        Integer num = i4z2.A04;
        JMQ jmq = i4z2.A02;
        boolean z6 = i4z2.A09;
        HMJ hmj2 = hmj;
        0qQ.A0B(hmj2, 3);
        return r20.AIY(obj, new I4Z(uri, hmj2, jmq, charSequence, num, str, str2, z, z2, z3, z4, z5, z6));
    }

    public final int hashCode() {
        String str;
        int A092 = (AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A07(this.A01, ((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31)))))) + AnonymousClass7TG.A0C(this.A00)) * 31;
        int intValue = this.A04.intValue();
        if (1 != intValue) {
            str = "SMALL";
        } else {
            str = "NORMAL";
        }
        return DbS.A06(this.A09, (C51971G9r.A0F(str, intValue, A092) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public I4Z(Uri uri, HMJ hmj, JMQ jmq, CharSequence charSequence, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = charSequence;
        this.A01 = hmj;
        this.A0C = z;
        this.A0A = z2;
        this.A08 = z3;
        this.A07 = z4;
        this.A0B = z5;
        this.A00 = uri;
        this.A04 = num;
        this.A02 = jmq;
        this.A09 = z6;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiVoiceSessionUiState(botTranscriptionToRender=");
        A1A.append(this.A05);
        A1A.append(", userTranscriptionTextToRender=");
        A1A.append(this.A06);
        A1A.append(", statusTextToRender=");
        A1A.append(this.A03);
        A1A.append(", voiceSessionStatus=");
        A1A.append(this.A01);
        A1A.append(", showInstructionText=");
        A1A.append(this.A0C);
        A1A.append(", isUserInputMuted=");
        A1A.append(this.A0A);
        A1A.append(", isBotOutputMuted=");
        A1A.append(this.A08);
        A1A.append(", enableAudioButtons=");
        A1A.append(this.A07);
        A1A.append(", isVideoTurnedOff=");
        A1A.append(this.A0B);
        A1A.append(", backgroundUri=");
        A1A.append(this.A00);
        A1A.append(", animationViewSize=");
        if (1 - this.A04.intValue() != 0) {
            str = "SMALL";
        } else {
            str = "NORMAL";
        }
        A1A.append(str);
        A1A.append(", multimodalUIState=");
        A1A.append(this.A02);
        A1A.append(", isRenderableMultiModelResponse=");
        return G9t.A1C(A1A, this.A09);
    }

    public I4Z() {
        this((Uri) null, HMJ.CONNECTING, (JMQ) null, (CharSequence) null, AnonymousClass05K.A01, (String) null, (String) null, false, false, false, false, true, false);
    }
}
