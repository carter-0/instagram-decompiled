package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.3nx  reason: invalid class name and case insensitive filesystem */
public final class C251963nx {
    public final C251893nq A00;
    public final C251753nc A01;
    public final 1rB A02;
    public final SamplingPolicyConfig A03;

    public final void A00(IOException iOException) {
        C251893nq r1 = this.A00;
        if (r1.CK4()) {
            r1.unlock();
        }
        this.A01.DEa(iOException);
    }

    public final void A01(InputStream inputStream, int i) {
        C251893nq r1;
        if (i == 200) {
            try {
                SamplingPolicyConfig samplingPolicyConfig = this.A03;
                if (samplingPolicyConfig != null) {
                    samplingPolicyConfig.FLC(this.A02, inputStream);
                }
                r1 = this.A00;
                r1.Cm1();
                this.A01.onSuccess();
            } catch (IOException e) {
                this.A01.DEa(e);
                r1 = this.A00;
            } catch (Throwable th) {
                C251893nq r12 = this.A00;
                if (r12.CK4()) {
                    r12.unlock();
                }
                inputStream.close();
                throw th;
            }
            if (r1.CK4()) {
                r1.unlock();
            }
            inputStream.close();
            return;
        }
        throw new IOException(002.A0O("Unexpected HTTP code ", i));
    }

    public C251963nx(C251893nq r1, C251753nc r2, 1rB r3, SamplingPolicyConfig samplingPolicyConfig) {
        this.A00 = r1;
        this.A03 = samplingPolicyConfig;
        this.A02 = r3;
        this.A01 = r2;
    }
}
