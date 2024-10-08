package com.instagram.debug.devoptions.direct.burner;

import X.002;
import X.0qQ;
import X.2Cl;
import X.AnonymousClass7L7;
import X.C254933tI;
import X.C70766OKm;
import X.N49;
import X.PS7;

public final class BurnerSendSettingsHelper$Companion$sendMessageToThread$1$1 extends 2Cl {
    public final /* synthetic */ String $buckId;
    public final /* synthetic */ int $endingMessageNumber;
    public final /* synthetic */ AnonymousClass7L7 $sendController;
    public final /* synthetic */ int $startingMessageNumber;

    public int getRunnableId() {
        return 1334005072;
    }

    public BurnerSendSettingsHelper$Companion$sendMessageToThread$1$1(int i, int i2, AnonymousClass7L7 r3, String str) {
        this.$endingMessageNumber = i;
        this.$startingMessageNumber = i2;
        this.$sendController = r3;
        this.$buckId = str;
    }

    public Void call() {
        int i = this.$endingMessageNumber;
        int i2 = this.$startingMessageNumber;
        int i3 = i - i2;
        AnonymousClass7L7 r7 = this.$sendController;
        String str = this.$buckId;
        for (int i4 = 0; i4 < i3; i4++) {
            String A0b = 002.A0b(str, ": test ", i4 + i2 + 1);
            0qQ.A0B(A0b, 0);
            r7.A00.A02(r7.A00((N49) null, (C70766OKm) null, (C254933tI) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, A0b, (String) null, (String) null, r7.A02.A00(), (String) null, false), new PS7(r7));
        }
        return null;
    }
}
