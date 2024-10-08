package X;

import android.os.Bundle;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Hf9  reason: case insensitive filesystem */
public abstract class C55280Hf9 {
    public static final C54173H1t A00(AudioOverlayTrack audioOverlayTrack, String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 0);
        C54173H1t h1t = new C54173H1t();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(139), str);
        A0a.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_CTA_TEXT", str2);
        A0a.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_SPONSORED_LABEL", true);
        A0a.putBoolean("com.instgram.android.fragment.ARGUMENTS_KEY_EXTRA_REMOVE_LOCATION", true);
        A0a.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_RESET_FEEDBACK", true);
        A0a.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_DISPLAY_PROFILE_FEED_TEXT", false);
        A0a.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_POLITICAL_CONTEXT", str3);
        A0a.putString(AnonymousClass000.A00(555), str4);
        A0a.putParcelable(AnonymousClass000.A00(3942), audioOverlayTrack);
        h1t.setArguments(A0a);
        return h1t;
    }
}
