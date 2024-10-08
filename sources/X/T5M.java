package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.protobuf.CodedOutputStream;

public final class T5M implements C13903TjQ {
    public final T5J A00;
    public final C9748Rg6 A01;
    public final C10894Rzu A02;

    public final boolean ASr(Object obj, Object obj2) {
        return C51970G9q.A1U(((R5b) obj).unknownFields.equals(((R5b) obj2).unknownFields) ? 1 : 0);
    }

    public final int Bsa(Object obj) {
        C11289SJn sJn = ((R5b) obj).unknownFields;
        int i = sJn.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < sJn.A00; i2++) {
                int i3 = sJn.A03[i2] >>> 3;
                int A05 = SQE.A05(3);
                int A022 = ((TAP) sJn.A04[i2]).A02();
                i += 2 + CodedOutputStream.A00(i3) + 1 + A05 + CodedOutputStream.A00(A022) + A022;
            }
            sJn.A01 = i;
        }
        return i;
    }

    public final int CL6(Object obj) {
        return ((R5b) obj).unknownFields.hashCode();
    }

    public final boolean CVR(Object obj) {
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public final void ClW(Object obj) {
        ((R5b) obj).unknownFields.A02 = false;
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public final void Co9(SUM sum, SQg sQg, Object obj) {
        R5b r5b = (R5b) obj;
        if (r5b.unknownFields == C11289SJn.A05) {
            r5b.unknownFields = new C11289SJn();
        }
        throw AnonymousClass7TE.A11("ensureExtensionsAreMutable");
    }

    public final void CoA(SFF sff, Object obj, byte[] bArr, int i, int i2) {
        R5b r5b = (R5b) obj;
        if (r5b.unknownFields == C11289SJn.A05) {
            r5b.unknownFields = new C11289SJn();
        }
        throw AnonymousClass7TE.A11("ensureExtensionsAreMutable");
    }

    public final Object Cr9() {
        return ((R4O) ((R5b) this.A00).A0K(AnonymousClass05K.A0Y, (Object) null, (Object) null)).A03();
    }

    public final void FOC(C10281Rpf rpf, Object obj) {
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public T5M(T5J t5j, C9748Rg6 rg6, C10894Rzu rzu) {
        this.A02 = rzu;
        this.A01 = rg6;
        this.A00 = t5j;
    }

    public final void Co5(Object obj, Object obj2) {
        C11433SUe.A0Q(obj, obj2);
    }
}
