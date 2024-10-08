package X;

import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;

/* renamed from: X.KsQ  reason: case insensitive filesystem */
public abstract class C63157KsQ {
    public static final C2802350v A00(Drawable drawable) {
        C2802350v r2;
        String str;
        String str2;
        String str3;
        if (!(drawable instanceof AnonymousClass5MI)) {
            return C394879yq.A00(drawable);
        }
        String str4 = null;
        AnonymousClass5MI r9 = (AnonymousClass5MI) drawable;
        if (r9 != null) {
            Drawable AfT = r9.AfT();
            if (AfT != null) {
                r2 = C394879yq.A00(AfT);
            } else {
                r2 = null;
            }
            C376699Iz CAA = r9.CAA();
            if (r2 != null) {
                String id = r9.getId();
                int Byn = r9.Byn();
                int B1e = r9.B1e();
                if (CAA != null) {
                    VoiceOption voiceOption = (VoiceOption) CAA.A01;
                    if (voiceOption != null) {
                        str = voiceOption.A02;
                    } else {
                        str = null;
                    }
                    if (voiceOption != null) {
                        str2 = voiceOption.A00;
                    } else {
                        str2 = null;
                    }
                    if (voiceOption != null) {
                        str3 = voiceOption.A01;
                    } else {
                        str3 = null;
                    }
                    str4 = CAA.A02;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                return new AnonymousClass5JL(r2, id, str, str2, str3, str4, Byn, B1e);
            }
        }
        return null;
    }
}
