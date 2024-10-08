package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.EDl  reason: case insensitive filesystem */
public final class C47702EDl extends EDI {
    public final /* synthetic */ EQF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47702EDl(1P0 r1, EQF eqf) {
        super(r1);
        this.A00 = eqf;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr requiredTreeField;
        C250663lr reinterpretRequired;
        C250663lr requiredTreeField2;
        int A03 = AnonymousClass0fD.A03(-358997547);
        AnonymousClass3JC r9 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(963799422);
        0qQ.A0B(r9, 0);
        super.onSuccess(r9);
        C250663lr r3 = (C250663lr) r9.A01;
        if (!(r3 == null || (requiredTreeField = r3.getRequiredTreeField(0, AnonymousClass000.A00(826), C2F.class, 958712321)) == null || (reinterpretRequired = requiredTreeField.reinterpretRequired(0, C2Q.class, -294452885)) == null || (requiredTreeField2 = reinterpretRequired.getRequiredTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C2P.class, -1102752027)) == null)) {
            EQF eqf = this.A00;
            String A0D = requiredTreeField2.A0D("strong_id__");
            if (A0D != null && requiredTreeField2.hasFieldValue("account_type")) {
                eqf.A00.ENY(16U.A00(requiredTreeField2.getCoercedIntField(0, "account_type")), A0D);
            }
        }
        AnonymousClass0fD.A0A(-783898750, A032);
        AnonymousClass0fD.A0A(-686889912, A03);
    }
}
