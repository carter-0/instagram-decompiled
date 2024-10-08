package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.util.List;

/* renamed from: X.3HO  reason: invalid class name */
public final class AnonymousClass3HO extends AnonymousClass3HP {
    public long A00 = -1;
    public C239773Ic A01;
    public IGUserHighlightsTrayType A02;
    public AnonymousClass3If A03;
    public AnonymousClass3IY A04;
    public AnonymousClass3HX A05;
    public C239753Ia A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public long A0N = -1;

    /* renamed from: A00 */
    public final C239753Ia FH3() {
        C239753Ia r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final long AjJ() {
        return this.A0N;
    }

    public final long AjP() {
        return this.A00;
    }

    public final boolean CPt() {
        if (this.A00 != -1) {
            return true;
        }
        return false;
    }

    public final void EQE(long j) {
        this.A0N = j;
    }

    public final void EQG(long j) {
        this.A00 = j;
    }
}
