package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: X.QIy  reason: case insensitive filesystem */
public final class C7555QIy extends 1vB {
    public FileLock A00;
    public final FileChannel A01;
    public final File A02;
    public final /* synthetic */ C7556QIz A03;

    public final String A01() {
        return "CrossProcessBatchLock";
    }

    public final synchronized void A02() {
        try {
            this.A01.close();
        } catch (IOException e) {
            0KC.A0N("CrossProcessBatchLock", "Failed to close the file channel associated with file: %s", e, new Object[]{this.A02});
        }
        return;
    }

    public final synchronized void A04() {
        RuntimeException runtimeException;
        synchronized (this) {
            while (this.A00 == null) {
                try {
                    this.A00 = this.A01.lock();
                } catch (ClosedChannelException e) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("File channel is closed prematurely or opened non-writable for: ");
                    runtimeException = Pxe.A0u(AnonymousClass7TF.A0i(this.A02, A1A), e);
                    throw runtimeException;
                } catch (FileLockInterruptionException e2) {
                    0KC.A0M("CrossProcessBatchLock", "Interrupted while waiting to lock the file: %s", e2, new Object[]{this.A02});
                } catch (IOException | NonWritableChannelException e3) {
                    runtimeException = Pxe.A0u("Failed to lock the file due to an IOException!", e3);
                    throw runtimeException;
                }
            }
        }
    }

    public final synchronized void A05() {
        this.A02.delete();
    }

    public final synchronized void A06() {
        Throwable th;
        synchronized (this) {
            FileLock fileLock = this.A00;
            if (fileLock != null) {
                try {
                    fileLock.release();
                    this.A00 = null;
                } catch (ClosedChannelException e) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("File Channel has been closed prematurely for: ");
                    th = Pxe.A0u(AnonymousClass7TF.A0i(this.A02, A1A), e);
                } catch (IOException e2) {
                    th = Pxe.A0u("Failed to unlock the file due to an IOException!", e2);
                }
            } else {
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                A1A2.append("File lock was never held for: ");
                th = AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(this.A02, A1A2));
                throw th;
            }
        }
        return;
    }

    public final synchronized boolean A09() {
        return !this.A02.exists();
    }

    public final synchronized boolean A0A() {
        boolean A1V;
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    this.A00 = this.A01.tryLock();
                } catch (ClosedChannelException e) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("File channel closed prematurely for: ");
                    throw Pxe.A0u(AnonymousClass7TF.A0i(this.A02, A1A), e);
                } catch (IOException | OverlappingFileLockException e2) {
                    0KC.A0I("CrossProcessBatchLock", "IOException happens when trying to lock the file.", e2);
                }
            }
            A1V = AnonymousClass7TF.A1V(this.A00);
        }
        return A1V;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7555QIy(C7556QIz qIz, File file) {
        super(qIz, file);
        this.A03 = qIz;
        if (file.getParentFile().isDirectory() || file.getParentFile().mkdirs()) {
            File A0U = Pxf.A0U(file.getName(), ".lock", file.getParentFile());
            this.A02 = A0U;
            this.A01 = new RandomAccessFile(A0U, "rw").getChannel();
            return;
        }
        throw JTO.A0u(AnonymousClass7TG.A0m(file, "Unable to create parent directories for: ", AnonymousClass7TE.A1A()));
    }
}
