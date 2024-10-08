package X;

/* renamed from: X.UJh  reason: case insensitive filesystem */
public abstract class C15007UJh extends C15008UJi {
    public VLX A00;

    public final void close() {
        synchronized (this) {
            VLX vlx = this.A00;
            if (vlx != null) {
                this.A00 = null;
                synchronized (vlx) {
                }
            }
        }
    }

    public final synchronized int getHeight() {
        int i;
        VLX vlx = this.A00;
        if (vlx == null) {
            i = 0;
        } else {
            i = vlx.A00.getHeight();
        }
        return i;
    }

    public final synchronized int getSizeInBytes() {
        int i;
        VLX vlx = this.A00;
        if (vlx == null) {
            i = 0;
        } else {
            i = vlx.A00.getSizeInBytes();
        }
        return i;
    }

    public final synchronized int getWidth() {
        int i;
        VLX vlx = this.A00;
        if (vlx == null) {
            i = 0;
        } else {
            i = vlx.A00.getWidth();
        }
        return i;
    }

    public final synchronized boolean isClosed() {
        return DbW.A1a(this.A00);
    }

    public C15007UJh(VLX vlx) {
        this.A00 = vlx;
    }
}
