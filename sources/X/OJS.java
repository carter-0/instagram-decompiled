package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.encryptedbackups.statemanager.model.WrongRecoveryCodeException;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

public final class OJS {
    public final C70401O5d A00 = ((C70401O5d) O5J.A00.getValue());

    public final void A00(Fragment fragment, GoogleAuthController googleAuthController, Exception exc) {
        int i;
        int i2;
        Object n9u;
        String message;
        Integer valueOf;
        int i3;
        C62320sa r0;
        Fragment fragment2 = fragment;
        C51973G9u.A1E(exc, fragment, googleAuthController);
        C70401O5d o5d = this.A00;
        if (exc instanceof UserRecoverableAuthException) {
            n9u = new C68305N9s(((UserRecoverableAuthException) exc).A00());
        } else {
            if ((exc instanceof C69539Nnj) || (exc instanceof WrongRecoveryCodeException)) {
                i = 2131961102;
                i2 = 2131961101;
            } else {
                if (exc instanceof IOException) {
                    String message2 = exc.getMessage();
                    if (message2 == null || !00l.A0d(message2, "storageQuotaExceeded", false)) {
                        String message3 = exc.getMessage();
                        if ((message3 == null || !00l.A0d(message3, "rateLimitExceeded", false)) && (message = exc.getMessage()) != null) {
                            00l.A0d(message, "dailyLimitExceeded", false);
                        }
                        String message4 = exc.getMessage();
                        if (message4 != null && 00l.A0d(message4, "Bad request: 403", false)) {
                            n9u = new C68304N9r(AnonymousClass05K.A00);
                        }
                    } else {
                        C66913Mex mex = o5d.A00.A00;
                        if (mex != null) {
                            mex.A0B("GDRIVE_STORAGE_FULL_ERROR");
                        }
                        n9u = new C68306N9t();
                    }
                }
                i = 2131961116;
                i2 = 2131961115;
            }
            n9u = new C68307N9u(i, i2);
        }
        if (n9u instanceof C68306N9t) {
            C68306N9t n9t = (C68306N9t) n9u;
            valueOf = Integer.valueOf(n9t.A01);
            i3 = n9t.A00;
            r0 = C73718Pif.A00;
        } else if (n9u instanceof C68307N9u) {
            C68307N9u n9u2 = (C68307N9u) n9u;
            valueOf = Integer.valueOf(n9u2.A01);
            i3 = n9u2.A00;
            r0 = C73719Pig.A00;
        } else if (n9u instanceof C68305N9s) {
            Intent intent = ((C68305N9s) n9u).A00;
            if (intent != null) {
                C11621SdP sdP = googleAuthController.A00;
                String A002 = Pxd.A00(502);
                if (sdP != null) {
                    AnonymousClass7TE.A1Z(new MHP((Object) sdP, (Object) fragment2, (Object) intent, (AnonymousClass4D7) null, 41), DbW.A0E(fragment));
                    return;
                }
                0KC.A0D(A002, "observer is null");
                return;
            }
            return;
        } else if (!(n9u instanceof C68304N9r)) {
            throw AnonymousClass7TE.A1K();
        } else {
            return;
        }
        C71145Oe2.A07(fragment, valueOf, r0, i3);
    }
}
