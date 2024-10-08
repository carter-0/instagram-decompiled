package X;

public abstract class XUN {
    public static void A00(C21493Xck xck, 0XY r6) {
        if (!xck.A0B && xck.A0C) {
            if (xck.A08 <= xck.A06 - xck.A0D) {
                r6.BSg().A03(AnonymousClass000.A00(3592), Integer.valueOf(xck.A00));
                r6.BSg().A02("total_messages_duration", xck.A08);
                r6.BSg().A02("longest_message_duration", xck.A03);
                String str = xck.A0A;
                if (str != null) {
                    r6.BSg().A03("st200ms_longest_message_origin", str);
                }
                r6.BSg().A03("native_poll_once_count", Integer.valueOf(xck.A01));
                r6.BSg().A02("native_poll_once_duration", xck.A07);
                r6.BSg().A03("st200ms_messages_count", Integer.valueOf(xck.A02));
                r6.BSg().A02("longest_wait_time", xck.A05);
                r6.BSg().A03("longest_wait_message", xck.A09);
                r6.BSg().A02("longest_wait_message_duration", xck.A04);
            }
        }
    }
}
