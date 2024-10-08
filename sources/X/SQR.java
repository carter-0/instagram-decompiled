package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Set;

public abstract class SQR {
    public static final S22 A00 = new S22("GoogleSignInCommon", new String[0]);

    public static SxE A01(Intent intent) {
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new SxE(googleSignInAccount, Status.A08);
        }
        if (status == null) {
            status = Status.A06;
        }
        return new SxE((GoogleSignInAccount) null, status);
    }

    public static Intent A00(Context context, GoogleSignInOptions googleSignInOptions) {
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent A0G = Pxe.A0G("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        Pxe.A1L(context, A0G);
        A0G.setClass(context, SignInHubActivity.class);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("config", signInConfiguration);
        A0G.putExtra("config", A0a);
        return A0G;
    }

    public static void A02(Context context) {
        SHF.A00(context).A01();
        Set<AnonymousClass63S> set = AnonymousClass63S.A00;
        synchronized (set) {
        }
        for (AnonymousClass63S A0A : set) {
            A0A.A0A();
        }
        AnonymousClass63T.A03();
    }
}
