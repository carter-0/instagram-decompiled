package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.TSf  reason: case insensitive filesystem */
public abstract class C13264TSf extends CancellationException {
    public final C10979S3n A00;
    public final Object A01;

    public C13264TSf(C10979S3n s3n, Object obj) {
        super("kotlin.coroutines.cancellation.CancellationException should never get swallowed. Always re-throw it if captured.This swallows the exception of Arrow's Raise, and leads to unexpected behavior.When working with Arrow prefer Either.catch or arrow.core.raise.catch to automatically rethrow CancellationException.");
        this.A01 = obj;
        this.A00 = s3n;
    }
}
