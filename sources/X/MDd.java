package X;

import android.graphics.Bitmap;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.genai.imageutils.MaskUtilsKt;

public final class MDd extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDd(ContextualSuggestionsStickersRepository contextualSuggestionsStickersRepository, AnonymousClass4D7 r3) {
        super(r3);
        this.A06 = 0;
        this.A04 = contextualSuggestionsStickersRepository;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDd, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A03 = obj;
                this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ContextualSuggestionsStickersRepository) this.A04).A01(this, false);
            case 1:
                this.A04 = obj;
                this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MaskUtilsKt.A04((Bitmap) null, this);
            case 2:
                this.A04 = obj;
                this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MaskUtilsKt.A08((Bitmap) null, this, 0);
            default:
                this.A04 = obj;
                this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MaskUtilsKt.A07((Bitmap) null, this, 0.0f, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDd(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = i;
    }
}
