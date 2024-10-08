package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;

/* renamed from: X.8Cf  reason: invalid class name */
public final class AnonymousClass8Cf implements AnonymousClass8Cg {
    public final /* synthetic */ AnonymousClass8BA A00;

    public AnonymousClass8Cf(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void DHg(boolean z) {
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        AnonymousClass8C9 r3 = this.A00.A1D;
        if (z) {
            mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.SELF_DISCLOSURE_FLOW;
        } else {
            mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0B;
        }
        AnonymousClass8CB r0 = new AnonymousClass8CB(r3.A03);
        r0.A02 = mediaGenAIDetectionMethod;
        r3.A03 = r0.A01();
    }
}
