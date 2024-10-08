package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.5c1  reason: invalid class name and case insensitive filesystem */
public final class C288505c1 extends C286545Wv {
    public static final C288505c1 A00 = new C286545Wv(1, 1);

    public C288505c1() {
        super(1, 1);
    }

    public final String A00(int i) {
        if (i == 0) {
            return "groupSlotIndex";
        }
        return 002.A0I("IntParameter(", ')', i);
    }

    public final String A01(int i) {
        if (i == 0) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        return 002.A0I("ObjectParameter(", ')', i);
    }
}
