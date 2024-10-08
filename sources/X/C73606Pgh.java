package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Pgh  reason: case insensitive filesystem */
public final /* synthetic */ class C73606Pgh extends 03J implements 0sL {
    public C73606Pgh(Object obj) {
        super(2, obj, C3258874o.class, "onTranscriptionButtonClick", "onTranscriptionButtonClick(Lcom/instagram/direct/messagethread/voice/model/VoiceContentViewModel;Lcom/instagram/direct/messagethread/voice/VoiceContentViewHolder;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        1Xj r1;
        Integer num;
        String str;
        Integer num2;
        C328657Fq r4 = (C328657Fq) obj;
        C66680Man man = (C66680Man) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, man);
        C3258874o r5 = (C3258874o) this.receiver;
        if (C3258874o.A04(r5, r4)) {
            N4D n4d = r4.A02;
            N4D n4d2 = null;
            if (n4d != null) {
                int A0M = AnonymousClass7TE.A0M(n4d.A01);
                if (A0M == 4 || A0M == 2) {
                    num2 = AnonymousClass05K.A0N;
                } else if (A0M == 3 && n4d.A03 != null) {
                    num2 = AnonymousClass05K.A0Y;
                }
                n4d2 = new N4D(num2, n4d.A03, n4d.A02, n4d.A05, n4d.A04);
            }
            if (n4d2 != null) {
                AnonymousClass7GP r8 = r5.A05;
                long j = ((long) r4.A00) / 1000;
                if (n4d2.A01 == AnonymousClass05K.A0Y) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                0Aj A0e = AnonymousClass7TE.A0e(r8.A00, "audio_clips_transcription_button_click");
                if (A0e.isSampled()) {
                    C66583MXo.A12(A0e, j);
                    if (1 - num.intValue() != 0) {
                        str = "HIDE";
                    } else {
                        str = "SHOW";
                    }
                    DbV.A1G(A0e, str);
                }
                DirectMessageIdentifier directMessageIdentifier = r4.A07;
                ((AnonymousClass7X3) r5.A02).FJr(n4d2, directMessageIdentifier);
                man.A01(n4d2, directMessageIdentifier);
            } else {
                C70620ODr oDr = new C70620ODr(r5, man, r4);
                String str2 = r4.A0C;
                if (str2 == null && (r1 = r4.A06) != null && r1.A2C().A0R == A1Z) {
                    C2814057m r0 = r1.A2C().A07;
                    str2 = r0 != null ? r0.Ado() : null;
                }
                AnonymousClass7GP r12 = r5.A05;
                long j2 = ((long) r4.A00) / 1000;
                0Aj A0e2 = AnonymousClass7TE.A0e(r12.A00, "audio_clips_transcription_button_click");
                if (A0e2.isSampled()) {
                    C66583MXo.A12(A0e2, j2);
                    DbV.A1G(A0e2, "START");
                }
                ((AnonymousClass7X3) r5.A02).Exi(oDr, r4.A06, r4.A07, str2);
            }
        }
        return C60340gF.A00;
    }
}
