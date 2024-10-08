package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;

@Deprecated
/* renamed from: X.USi  reason: case insensitive filesystem */
public final class C15152USi extends C19062WIs implements X7X {
    public int A00 = 0;
    public final int A01;
    public final ReadableArray A02;
    public final /* synthetic */ C18592Vuj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15152USi(ReadableArray readableArray, C18592Vuj vuj, int i, int i2) {
        super(vuj, i);
        this.A03 = vuj;
        this.A01 = i2;
        this.A02 = readableArray;
    }

    public final void AT8() {
        try {
            this.A03.A0L.A04(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            ReactSoftExceptionLogger.logSoftException("UIViewOperationQueue", new RuntimeException("Error dispatching View Command", th));
        }
    }

    public final void ATR() {
        this.A03.A0L.A04(this.A00, this.A01, this.A02);
    }

    public final int Bo3() {
        return this.A00;
    }

    public final void CM7() {
        this.A00++;
    }
}
