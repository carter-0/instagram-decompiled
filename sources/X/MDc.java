package X;

import android.graphics.Bitmap;
import com.instagram.genai.imageutils.MaskUtilsKt;
import com.instagram.settings2.core.model.ActionButtonValue$Information;

public final class MDc extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDc(ActionButtonValue$Information actionButtonValue$Information, AnonymousClass4D7 r3) {
        super(r3);
        this.A05 = 2;
        this.A04 = actionButtonValue$Information;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDc, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A04 = obj;
                this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MaskUtilsKt.A05((Bitmap) null, this);
            case 1:
                this.A04 = obj;
                this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MaskUtilsKt.A06((Bitmap) null, this);
            default:
                this.A03 = obj;
                this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return C64185LSs.A00(this.A04, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDc(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = i;
    }
}
