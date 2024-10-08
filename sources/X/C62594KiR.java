package X;

import android.util.SparseArray;
import com.instagram.android.R;

/* renamed from: X.KiR  reason: case insensitive filesystem */
public enum C62594KiR {
    SUNGLASSES(0.4f, 0, 0, R.drawable.sticker_sunglasses),
    HEARTS(0.4f, 1, 1, R.drawable.sticker_hearts),
    BLUE_GLASSES(0.4f, 2, 2, R.drawable.sticker_blue_glasses),
    MUSTACHE(0.25f, 3, 3, R.drawable.sticker_mustache);
    
    public static final SparseArray A04 = null;
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    /* access modifiers changed from: public */
    static {
        C62594KiR[] kiRArr;
        A05 = 0oU.A00(kiRArr);
        A04 = new SparseArray();
        for (C62594KiR kiR : values()) {
            A04.put(kiR.A03, kiR);
        }
    }

    /* access modifiers changed from: public */
    C62594KiR(float f, int i, int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = r2;
        this.A00 = f;
    }
}
