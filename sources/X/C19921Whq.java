package X;

import com.facebook.pando.IPandoGraphQLService$Token;

/* renamed from: X.Whq  reason: case insensitive filesystem */
public final class C19921Whq implements Runnable {
    public final IPandoGraphQLService$Token A00;

    public final void run() {
        this.A00.cancel();
    }

    public C19921Whq(IPandoGraphQLService$Token iPandoGraphQLService$Token) {
        this.A00 = iPandoGraphQLService$Token;
    }
}
