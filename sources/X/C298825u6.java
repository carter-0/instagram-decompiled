package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5u6  reason: invalid class name and case insensitive filesystem */
public abstract class C298825u6 extends AnonymousClass3HP {
    public long A00 = -1;
    public C293585l1 A01;
    public C276104sZ A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public HashMap A08;
    public List A09;
    public List A0A = 0sn.A00;
    public List A0B;
    public long A0C = -1;

    public final void EQF(String str) {
        0qQ.A0B(str, 0);
    }

    public final long AjJ() {
        return this.A0C;
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

    public final /* bridge */ /* synthetic */ Object FH3() {
        C293585l1 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw AnonymousClass00P.createAndThrow();
    }

    public C298825u6() {
        C298855u9 A002 = C276114sa.A00.A00(false);
        A002.A00 = null;
        this.A02 = A002.A00();
    }

    public final void EQE(long j) {
        this.A0C = j;
    }

    public void EQG(long j) {
        this.A00 = j;
    }
}
