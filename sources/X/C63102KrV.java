package X;

import android.os.Bundle;

/* renamed from: X.KrV  reason: case insensitive filesystem */
public abstract class C63102KrV {
    public static final K61 A00(String str, String str2, String str3, String str4, boolean z) {
        K61 k61 = new K61();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("original_audio_current_title", str);
        A0a.putString("original_audio_media_id", str2);
        A0a.putString("audio_asset_id", str3);
        A0a.putString(AnonymousClass000.A00(371), str4);
        A0a.putBoolean("audio_page_via_notification", z);
        k61.setArguments(A0a);
        return k61;
    }
}
