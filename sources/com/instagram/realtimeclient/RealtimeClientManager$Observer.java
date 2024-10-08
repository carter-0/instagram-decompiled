package com.instagram.realtimeclient;

import X.AnonymousClass46J;
import X.C291065gS;

public interface RealtimeClientManager$Observer {
    void onConnectionChanged(AnonymousClass46J r1);

    void onMessage(C291065gS r1);

    void onSendMessage(String str, String str2, String str3, boolean z, Long l);

    void onSendPayload(String str, byte[] bArr, String str2, Long l);
}
