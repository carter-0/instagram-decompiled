package X;

import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.CameraVideoCapturer;

public final /* synthetic */ class WMQ implements C266054Xj {
    public final /* synthetic */ C256683wB A00;
    public final /* synthetic */ C256683wB A01;
    public final /* synthetic */ IOException A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ WMQ(C256683wB r1, C256683wB r2, IOException iOException, String str, String str2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = iOException;
    }

    public final void accept(Object obj) {
        ArrayList arrayList;
        C256683wB r1 = this.A00;
        C256683wB r0 = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        IOException iOException = this.A02;
        AnonymousClass4Yf A002 = AnonymousClass4P8.A00(r1);
        AnonymousClass4Yf A003 = AnonymousClass4P8.A00(r0);
        AnonymousClass4OS r2 = ((AnonymousClass4P8) obj).A05;
        28w Av8 = r2.A19.A07.Av8();
        if (Av8 != null) {
            arrayList = Av8.A02();
        } else {
            arrayList = new ArrayList();
        }
        C284815Oa A0K = r2.A0K(AnonymousClass5OZ.EXOPLAYER2_SOURCE, C2612348u.A00(iOException, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
        r2.A0v.Dt9(A002, A003, str, str2, A0K.A01.A00, A0K.A00.name(), A0K.A02, A0K.A03, arrayList);
    }
}
