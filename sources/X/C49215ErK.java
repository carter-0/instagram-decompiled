package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.ErK  reason: case insensitive filesystem */
public abstract class C49215ErK {
    public static final void A00(0lg r2, Integer num, Integer num2) {
        String str;
        String str2;
        AnonymousClass0kM r0 = new AnonymousClass0kM(r2);
        r0.A01 = "lightweight_connections_share_profile";
        0Aj A0e = AnonymousClass7TE.A0e(r0.A00(), "ig_lightweight_connections");
        if (A0e.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str = "entered";
                    break;
                case 1:
                    str = "share_clicked";
                    break;
                case 2:
                    str = "next_clicked";
                    break;
                case 3:
                    str = "exit_clicked";
                    break;
                case 4:
                    str = "avatar_plus_clicked";
                    break;
                default:
                    str = "avatar_updated";
                    break;
            }
            DbS.A1I(A0e, str);
            switch (num2.intValue()) {
                case 1:
                    str2 = "qp_full";
                    break;
                case 2:
                    str2 = "qp_lite";
                    break;
                default:
                    str2 = "nux";
                    break;
            }
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
            A0e.Cgf();
        }
    }
}
