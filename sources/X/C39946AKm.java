package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.AKm  reason: case insensitive filesystem */
public final class C39946AKm implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C357918a4 A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C39946AKm(AnonymousClass4DH r1, UserSession userSession, C357918a4 r3, Integer num, String str, String str2, int i, int i2) {
        this.A02 = r1;
        this.A03 = userSession;
        this.A05 = num;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        AnonymousClass4DH r5 = this.A02;
        AnonymousClass6ST r4 = new AnonymousClass6ST(r5.requireContext(), true);
        r4.A00(r5.requireContext().getResources().getString(2131969783));
        UserSession userSession = this.A03;
        Integer num = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        int i2 = this.A01;
        int i3 = this.A00;
        0qQ.A0B(num, 1);
        String format = String.format(Locale.US, "music/track/%s/lyrics/report/", Arrays.copyOf(new Object[]{str2}, 1));
        0qQ.A07(format);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0E = format;
        A0a.A9m("audio_asset_id", str2);
        A0a.A9m("audio_cluster_id", str3);
        if (num.intValue() != 0) {
            str = "misaligned_timestamps";
        } else {
            str = "words_contain_mistakes";
        }
        A0a.A9m(C66579MXk.A00(130), str);
        A0a.A9m("audio_asset_start_time_in_ms", String.valueOf(i2));
        A0a.A9m("audio_snippet_duration_in_ms", String.valueOf(i3));
        A0a.A0Q(1XP.class, 1XY.class);
        1OC A0M = A0a.A0M();
        A0M.A00 = new H51(8, (Object) this.A04, (Object) r4);
        r5.schedule(A0M);
    }
}
