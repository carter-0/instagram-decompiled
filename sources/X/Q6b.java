package X;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class Q6b extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ SDP A00;

    public Q6b(SDP sdp) {
        this.A00 = sdp;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A00.A02.A01(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.A00.A00.A02.A00();
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((QAS) this.A00.A00.A02).A00;
        if (weakReference.get() != null) {
            QDG qdg = (QDG) weakReference.get();
            AnonymousClass2Fj r0 = qdg.A09;
            if (r0 == null) {
                r0 = JTO.A0K();
                qdg.A09 = r0;
            }
            QDG.A00(r0, charSequence);
        }
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        SDP sdp = this.A00;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        SNP snp = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                snp = new SNP(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                snp = new SNP(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                snp = new SNP(cryptoObject.getMac());
            }
        }
        SR5 sr5 = null;
        if (snp != null) {
            Cipher cipher = snp.A01;
            if (cipher != null) {
                sr5 = new SR5(cipher);
            } else {
                Signature signature = snp.A00;
                if (signature != null) {
                    sr5 = new SR5(signature);
                } else {
                    Mac mac = snp.A02;
                    if (mac != null) {
                        sr5 = new SR5(mac);
                    }
                }
            }
        }
        sdp.A00.A02.A02(new C10336RqZ(sr5, 2));
    }
}
