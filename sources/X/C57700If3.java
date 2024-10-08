package X;

/* renamed from: X.If3  reason: case insensitive filesystem */
public final /* synthetic */ class C57700If3 implements Runnable {
    public final /* synthetic */ C285895Td A00;

    public /* synthetic */ C57700If3(C285895Td r1) {
        this.A00 = r1;
    }

    public final void run() {
        C285895Td r4 = this.A00;
        r4.A02 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        C285045Pl r11 = r4.A09;
        int i = r11.A00;
        if (i > 0) {
            Object[] objArr = r11.A02;
            int i2 = 0;
            do {
                C286185Ug r6 = (C286185Ug) objArr[i2];
                int ordinal = r6.ordinal();
                boolean z = true;
                if (ordinal == 0) {
                    bool2 = true;
                    bool = bool2;
                } else if (ordinal == 1) {
                    bool2 = false;
                    bool = bool2;
                } else if ((ordinal == 2 || ordinal == 3) && !AnonymousClass7TF.A1Y(bool, false)) {
                    if (r6 != C286185Ug.ShowKeyboard) {
                        z = false;
                    }
                    bool2 = Boolean.valueOf(z);
                }
                i2++;
            } while (i2 < i);
        }
        r11.A01();
        if (AnonymousClass7TF.A1Y(bool, true)) {
            C285895Td.A01(r4);
        }
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            AnonymousClass03Z r0 = ((C285915Tf) r4.A0B).A01.A00;
            if (booleanValue) {
                r0.A02();
            } else {
                r0.A01();
            }
        }
        if (AnonymousClass7TF.A1Y(bool, false)) {
            C285895Td.A01(r4);
        }
    }
}
