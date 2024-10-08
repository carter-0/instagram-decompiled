package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* renamed from: X.Xyg  reason: case insensitive filesystem */
public final class C22271Xyg implements C256873wU {
    public final /* synthetic */ AnonymousClass4OI A00;
    public final /* synthetic */ C22274Xyj A01;

    public C22271Xyg(AnonymousClass4OI r1, C22274Xyj xyj) {
        this.A01 = xyj;
        this.A00 = r1;
    }

    public final void ClG(String str) {
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A01.A09;
        String str2 = this.A00.A0K.A0G;
        if (str2 != null) {
            serviceEventCallbackImpl.callback(new C266454Yy(str2, AnonymousClass000.A00(977), C273654mx.A00(219), str));
        }
    }
}
