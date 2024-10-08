package X;

import android.content.Context;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.lang.ref.WeakReference;

/* renamed from: X.8yv  reason: invalid class name and case insensitive filesystem */
public final class C371718yv {
    public AudioGraphClientProvider A00;
    public C357848Zx A01;
    public AudioServiceConfigurationAnnouncer A02;
    public C10212RoT A03;
    public WeakReference A04;
    public boolean A05 = false;
    public final Context A06;
    public final boolean A07;

    public C371718yv(Context context, AudioGraphClientProvider audioGraphClientProvider, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, boolean z) {
        this.A06 = context.getApplicationContext();
        this.A07 = z;
        this.A00 = audioGraphClientProvider;
        this.A02 = audioServiceConfigurationAnnouncer;
    }
}
