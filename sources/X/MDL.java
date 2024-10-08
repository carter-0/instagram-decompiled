package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.instagram.genai.imageutils.MaskUtilsKt;
import java.util.List;

public final class MDL extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDL(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A08 = i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDL, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A06 = obj;
        this.A03 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return MaskUtilsKt.A02((Bitmap) null, (Bitmap) null, (PointF) null, this);
        }
        return MaskUtilsKt.A03((Bitmap) null, (List) null, this);
    }
}
