package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2ml  reason: invalid class name and case insensitive filesystem */
public final class C229052ml extends 1P0 {
    public final /* synthetic */ UserSession A00;

    public C229052ml(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(1598513345, AnonymousClass0fD.A03(796098686));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-84759166);
        AnonymousClass3JC r9 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(-10085549);
        0qQ.A0B(r9, 0);
        C250663lr r3 = (C250663lr) r9.A01;
        if (r3 == null) {
            i = 159829422;
        } else {
            C250663lr optionalTreeField = r3.getOptionalTreeField(0, "AFSStatusGraphQLWrapper", AnonymousClass4LG.class, -1959683592);
            if (optionalTreeField == null) {
                i = -1088863148;
            } else {
                AnonymousClass3VR r2 = AnonymousClass3VR.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (optionalTreeField.getOptionalEnumField(0, "afs_enablement_status", r2) != null) {
                    1Av A002 = 1Au.A00(this.A00);
                    A002.A06.Epx(A002, String.valueOf(optionalTreeField.getOptionalEnumField(0, "afs_enablement_status", r2)), 1Av.A8a[369]);
                }
                i = -226694833;
            }
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1546919834, A03);
    }
}
