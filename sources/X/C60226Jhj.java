package X;

import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;

/* renamed from: X.Jhj  reason: case insensitive filesystem */
public final class C60226Jhj extends 2YL {
    public final 2Fk A00;
    public final DirectPollMessageOptionVotersRepository A01;

    public final void A00(boolean z, String str, String str2) {
        CharSequence charSequence;
        String str3 = str;
        0qQ.A0B(str, 1);
        boolean z2 = z;
        if ((z || !((charSequence = (CharSequence) this.A01.A00.getValue()) == null || charSequence.length() == 0)) && !0qQ.A0K(this.A01.A01.getValue(), C61906KQz.A00)) {
            AnonymousClass7TE.A1Z(new C66150MEd(this, str3, str2, (AnonymousClass4D7) null, 1, z2), C318116oQ.A00(this));
        }
    }

    public C60226Jhj(DirectPollMessageOptionVotersRepository directPollMessageOptionVotersRepository) {
        this.A01 = directPollMessageOptionVotersRepository;
        this.A00 = DbT.A0G(C66193MHj.A01(directPollMessageOptionVotersRepository.A02, directPollMessageOptionVotersRepository.A01, 23));
    }
}
