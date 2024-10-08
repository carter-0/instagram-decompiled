package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: X.USj  reason: case insensitive filesystem */
public final class C15153USj extends C19062WIs implements X7X {
    public int A00 = 0;
    public final ReadableArray A01;
    public final String A02;
    public final /* synthetic */ C18592Vuj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15153USj(ReadableArray readableArray, C18592Vuj vuj, String str, int i) {
        super(vuj, i);
        this.A03 = vuj;
        this.A02 = str;
        this.A01 = readableArray;
    }

    public final void AT8() {
        try {
            this.A03.A0L.A05(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            ReactSoftExceptionLogger.logSoftException("UIViewOperationQueue", new RuntimeException("Error dispatching View Command", th));
        }
    }

    public final void ATR() {
        this.A03.A0L.A05(this.A00, this.A02, this.A01);
    }

    public final int Bo3() {
        return this.A00;
    }

    public final void CM7() {
        this.A00++;
    }
}
