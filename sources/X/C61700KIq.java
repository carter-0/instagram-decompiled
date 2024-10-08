package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.KIq  reason: case insensitive filesystem */
public final class C61700KIq extends 0ng {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ C59855JaW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61700KIq(Medium medium, C59855JaW jaW) {
        super(457, 3, false, false);
        this.A01 = jaW;
        this.A00 = medium;
    }

    public final void run() {
        String AvM;
        try {
            C364808m2 r0 = this.A01.call().A02;
            if (r0 != null && (AvM = r0.AvM()) != null) {
                this.A00.A0X = AvM;
            }
        } catch (Exception e) {
            0f9 AEf = 0wj.A01.AEf("Failed to load image in FeedExternalShareImageLoader", 817892914);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            AEf.ABQ("error_message", message);
        }
    }
}
