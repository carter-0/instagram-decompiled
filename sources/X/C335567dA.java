package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7dA  reason: invalid class name and case insensitive filesystem */
public final class C335567dA extends AnonymousClass3HP {
    public C337307g6 A00;
    public AnonymousClass7g4 A01;
    public GraphGuardianContentImpl A02;
    public C335577dB A03;
    public C337327gA A04;
    public 1Xj A05;
    public C270834hN A06;
    public User A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public List A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public boolean A0j;
    public long A0k = -1;
    public long A0l = -1;

    public final void EQF(String str) {
        0qQ.A0B(str, 0);
    }

    public final long AjJ() {
        return this.A0k;
    }

    public final long AjP() {
        return this.A0l;
    }

    public final boolean CPt() {
        if (this.A0l != -1) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        C335577dB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EQE(long j) {
        this.A0k = j;
    }

    public final void EQG(long j) {
        this.A0l = j;
    }
}
