package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* renamed from: X.Xyh  reason: case insensitive filesystem */
public final class C22272Xyh implements C256853wS {
    public final /* synthetic */ AnonymousClass4OI A00;
    public final /* synthetic */ C22274Xyj A01;

    public C22272Xyh(AnonymousClass4OI r1, C22274Xyj xyj) {
        this.A01 = xyj;
        this.A00 = r1;
    }

    public final void ClG(String str) {
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A01.A09;
        String str2 = this.A00.A0K.A0G;
        if (str2 != null) {
            serviceEventCallbackImpl.callback(new C266454Yy(str2, "MANIFEST", AnonymousClass000.A00(2263), str));
        }
    }
}
