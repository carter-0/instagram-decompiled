package X;

import com.facebook.rsys.videorender.gen.VideoRenderApi;

/* renamed from: X.PmQ  reason: case insensitive filesystem */
public final class C73946PmQ extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73946PmQ(int i, int i2, String str, int i3) {
        super(1);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            VideoRenderApi videoRenderApi = C66581MXm.A0j(obj).A01.A0D.A00;
            0JA.A03(videoRenderApi, "VideoRenderProxy setApi must be called");
            videoRenderApi.setDisplayResolution(this.A03, 1, this.A02, this.A01);
            return C60340gF.A00;
        }
        NAT nat = (NAT) obj;
        0qQ.A0B(nat, 0);
        return 1aU.A06(new C72150OxA(nat, this.A03, this.A02, this.A01));
    }
}
