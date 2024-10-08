package X;

import com.facebook.react.views.textinput.ReactTextInputManager;

/* renamed from: X.GbD  reason: case insensitive filesystem */
public enum C52701GbD {
    TEXT,
    NUMBER,
    A07,
    PHONE,
    PASSWORD,
    PASSCODE,
    AMOUNT,
    DATE,
    CAP_WORDS,
    CAP_SENTENCES,
    CAP_LETTERS,
    TEXT_NO_SUGGESTIONS;

    /* access modifiers changed from: public */
    static {
        C52701GbD[] gbDArr;
        A00 = 0oU.A00(gbDArr);
    }

    public final int A00() {
        switch (ordinal()) {
            case 0:
                return 131073;
            case 1:
                return 2;
            case 2:
                return 33;
            case 3:
                return 3;
            case 4:
                return 129;
            case 5:
                return 18;
            case 6:
                return ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED;
            case 7:
                return 20;
            case 8:
                return 139265;
            case 9:
                return 180225;
            case 10:
                return 135169;
            case 11:
                return 655361;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
