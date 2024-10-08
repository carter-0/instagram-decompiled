package X;

import com.facebook.react.modules.dialog.DialogModule;

public final class WLG implements C21046XBn {
    public C21046XBn A00;
    public VQ7 A01;

    public final /* bridge */ /* synthetic */ void APd(Object obj) {
        try {
            this.A00.APd(obj);
        } catch (Throwable th) {
            AnonymousClass7TF.A19(0wj.A01.AEf("ZeroDispatchError", 817900293), DialogModule.KEY_MESSAGE, 002.A0R("Error on dispatching action ", C51968G9o.A16(obj)), th);
        }
    }

    public final /* bridge */ /* synthetic */ Object getState() {
        return this.A00.getState();
    }
}
