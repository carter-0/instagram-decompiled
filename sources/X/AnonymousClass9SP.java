package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.9SP  reason: invalid class name */
public abstract class AnonymousClass9SP {
    public static final 1OC A00(UserSession userSession, String str, String str2) {
        String format = String.format(Locale.US, "music/track/%s/lyrics/", Arrays.copyOf(new Object[]{str}, 1));
        0qQ.A07(format);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0E = format;
        A0b.A9m("audio_asset_id", str);
        A0b.A9m("audio_cluster_id", str2);
        A0b.A0Q(C384569hX.class, C379009Sb.class);
        A0b.A03();
        A0b.A0A = format;
        A0b.A00 = 0;
        return A0b.A0M();
    }
}
