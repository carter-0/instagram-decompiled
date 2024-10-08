package X;

import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Text;

public final class NR8 extends 0ng {
    public NR8() {
        super(2005773668, 4, false, false);
    }

    public final void run() {
        C68404NFl A00 = AddMessageContent.A00();
        R4O A0I = Text.DEFAULT_INSTANCE.A0I();
        Text text = (Text) C66580MXl.A0L(A0I);
        text.bitField0_ |= 1;
        text.text_ = "empty";
        C66582MXn.A0Q(A00, A0I).addMessageContentCase_ = 1;
        A00.A02();
    }
}
