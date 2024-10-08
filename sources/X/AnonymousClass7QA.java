package X;

import java.util.Comparator;

/* renamed from: X.7QA  reason: invalid class name */
public final class AnonymousClass7QA implements Comparator {
    public static final AnonymousClass7QA A00 = new AnonymousClass7QA();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str;
        C67569Mq3 mq3 = (C67569Mq3) obj;
        C67569Mq3 mq32 = (C67569Mq3) obj2;
        0qQ.A0B(mq3, 0);
        0qQ.A0B(mq32, 1);
        String str2 = mq3.A03;
        if (str2 == null || (str = mq32.A03) == null) {
            return 0;
        }
        return str2.compareTo(str);
    }
}
