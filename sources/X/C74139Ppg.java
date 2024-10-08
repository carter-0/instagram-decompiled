package X;

import com.facebook.rsys.screenshare.gen.ScreenShareApi;

/* renamed from: X.Ppg  reason: case insensitive filesystem */
public final class C74139Ppg extends 0Yg implements 0sP {
    public static final C74139Ppg A00 = new C74139Ppg();

    public C74139Ppg() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NCZ ncz = (NCZ) obj;
        0qQ.A0B(ncz, 0);
        ScreenShareApi screenShareApi = ncz.A09.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(true, 0);
        }
        return C60340gF.A00;
    }
}
