package android.view;

import X.AnonymousClass00P;
import android.os.Looper;

public abstract class InputEventReceiver {
    public abstract void dispose();

    public abstract void onInputEvent(InputEvent inputEvent);

    public InputEventReceiver(InputChannel inputChannel, Looper looper) {
        throw AnonymousClass00P.createAndThrow();
    }
}
