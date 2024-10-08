package X;

import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;

public final class M0B implements MUR {
    public final /* synthetic */ SettableFuture A00;

    public M0B(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void DX1(Exception exc) {
        this.A00.setException(new IOException(exc));
    }

    public final void DX2(C352218Cl r2) {
        this.A00.set(r2);
    }
}
