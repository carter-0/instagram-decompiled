package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.AWz  reason: case insensitive filesystem */
public final class C40235AWz implements C374899Bg {
    public final AnonymousClass973 A00;
    public final AnonymousClass9CE A01;
    public final AnonymousClass9C0 A02;

    public final boolean ASr(Object obj, Object obj2) {
        if (!((AnonymousClass972) obj).unknownFields.equals(((AnonymousClass972) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    public final int Bsa(Object obj) {
        AnonymousClass975 r6 = ((AnonymousClass972) obj).unknownFields;
        int i = r6.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r6.A00; i2++) {
                int i3 = r6.A03[i2] >>> 3;
                int A022 = ((AnonymousClass97R) r6.A04[i2]).A02();
                i += 2 + C384019gd.A00(i3) + 1 + C384019gd.A00(A022) + A022 + 1;
            }
            r6.A01 = i;
        }
        return i;
    }

    public final int CL6(Object obj) {
        return ((AnonymousClass972) obj).unknownFields.hashCode();
    }

    public final boolean CVR(Object obj) {
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public final void ClW(Object obj) {
        AnonymousClass975 r1 = ((AnonymousClass972) obj).unknownFields;
        if (r1.A02) {
            r1.A02 = false;
        }
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public final void Co7(AnonymousClass9CF r3, C3738397d r4, Object obj) {
        AnonymousClass972 r5 = (AnonymousClass972) obj;
        if (r5.unknownFields == AnonymousClass975.A05) {
            r5.unknownFields = new AnonymousClass975();
        }
        throw AnonymousClass7TE.A11(Pxd.A00(211));
    }

    public final void Co8(AnonymousClass9CM r3, Object obj, byte[] bArr, int i, int i2) {
        AnonymousClass972 r4 = (AnonymousClass972) obj;
        if (r4.unknownFields == AnonymousClass975.A05) {
            r4.unknownFields = new AnonymousClass975();
        }
        throw AnonymousClass7TE.A11(Pxd.A00(211));
    }

    public final AnonymousClass972 Cr8() {
        AnonymousClass973 r2 = this.A00;
        boolean z = r2 instanceof AnonymousClass972;
        AnonymousClass972 r22 = (AnonymousClass972) r2;
        if (z) {
            return (AnonymousClass972) r22.A0E(AnonymousClass05K.A0N, (Object) null, (Object) null);
        }
        return ((C375269Cx) r22.A0E(AnonymousClass05K.A0Y, (Object) null, (Object) null)).A02();
    }

    public final void FOD(A8T a8t, Object obj) {
        throw AnonymousClass7TE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public C40235AWz(AnonymousClass973 r1, AnonymousClass9CE r2, AnonymousClass9C0 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Co5(Object obj, Object obj2) {
        C374949Bl.A03(obj, obj2);
    }
}
