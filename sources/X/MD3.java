package X;

import androidx.paging.SingleRunner;
import java.util.concurrent.CancellationException;

public final class MD3 extends CancellationException {
    public final SingleRunner A00;

    public MD3(SingleRunner singleRunner) {
        this.A00 = singleRunner;
    }
}
