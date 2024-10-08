package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.avatars.status.AvatarStatusRepository;

/* renamed from: X.6oO  reason: invalid class name and case insensitive filesystem */
public final class C318096oO extends 1P0 {
    public final /* synthetic */ AvatarStatusRepository A00;
    public final /* synthetic */ 0sL A01;

    public C318096oO(AvatarStatusRepository avatarStatusRepository, 0sL r2) {
        this.A00 = avatarStatusRepository;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-2091416322);
        0qQ.A0B(r5, 0);
        this.A01.invoke((Object) null, r5.A01());
        AnonymousClass0fD.A0A(893842115, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        AnonymousClass5k8 r5;
        Integer num;
        String str;
        boolean z;
        C293115kA r4;
        int A03 = AnonymousClass0fD.A03(500283663);
        AnonymousClass3JC r14 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(285579810);
        0qQ.A0B(r14, 0);
        C250663lr r7 = (C250663lr) r14.A01;
        if (!(r7 == null || (optionalTreeField = r7.getOptionalTreeField(0, "viewer", C293105k6.class, -518179601)) == null || (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, AnonymousClass5k7.class, 1022275758)) == null || (r5 = (AnonymousClass5k8) optionalTreeField2.getOptionalTreeField(0, "user_avatar", AnonymousClass5k8.class, -417973107)) == null)) {
            String optionalStringField = r5.getOptionalStringField(0, "strong_id__");
            String optionalStringField2 = r5.getOptionalStringField(1, "config_hash");
            AnonymousClass5k9 A0E = r5.A0E();
            if (A0E == null || (r4 = (C293115kA) A0E.getOptionalEnumField(1, "avatar_style", C293115kA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
                num = null;
            } else {
                int ordinal = r4.ordinal();
                if (ordinal == -1 || ordinal == 0) {
                    num = AnonymousClass05K.A00;
                } else if (ordinal == 1) {
                    num = AnonymousClass05K.A01;
                } else if (ordinal == 2) {
                    num = AnonymousClass05K.A0C;
                } else {
                    throw new RuntimeException();
                }
            }
            AnonymousClass5k9 A0E2 = r5.A0E();
            if (A0E2 != null) {
                str = A0E2.getOptionalStringField(0, "avatar_revision");
            } else {
                str = null;
            }
            AnonymousClass5k9 A0E3 = r5.A0E();
            if (A0E3 != null) {
                z = A0E3.getCoercedBooleanField(2, "is_convergence_2_auto_migrated");
            } else {
                z = false;
            }
            if (!(optionalStringField == null || optionalStringField.length() == 0 || optionalStringField2 == null || optionalStringField2.length() == 0 || optionalStringField2.equals("0"))) {
                this.A01.invoke(new C293125kB(num, optionalStringField, optionalStringField2, str, z), (Object) null);
                AnonymousClass0fD.A0A(2087972613, A032);
                AnonymousClass0fD.A0A(1788742748, A03);
            }
        }
        this.A01.invoke((Object) null, (Object) null);
        AnonymousClass0fD.A0A(2087972613, A032);
        AnonymousClass0fD.A0A(1788742748, A03);
    }
}
