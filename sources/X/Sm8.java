package X;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

public final class Sm8 implements C13555TcR {
    public final ComponentName A00;
    public final String A01;
    public final Messenger A02;

    public final void CfG(int i) {
        Messenger messenger = this.A02;
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("tag", this.A01);
        A0a.putParcelable("component", this.A00);
        obtain.setData(A0a);
        messenger.send(obtain);
    }

    public Sm8(ComponentName componentName, Messenger messenger, String str) {
        this.A02 = messenger;
        this.A01 = str;
        this.A00 = componentName;
    }
}
