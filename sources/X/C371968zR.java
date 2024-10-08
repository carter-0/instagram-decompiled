package X;

import android.media.AudioRecord;

/* renamed from: X.8zR  reason: invalid class name and case insensitive filesystem */
public final class C371968zR {
    public int A00;
    public AudioRecord A01;
    public final short[] A02 = new short[4096];

    public final void A00() {
        synchronized (this) {
            AudioRecord audioRecord = this.A01;
            if (audioRecord != null) {
                audioRecord.stop();
            }
            AudioRecord audioRecord2 = this.A01;
            if (audioRecord2 != null) {
                audioRecord2.release();
            }
            this.A01 = null;
        }
    }
}
