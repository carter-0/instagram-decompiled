package X;

import android.content.Context;
import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;

/* renamed from: X.M9o  reason: case insensitive filesystem */
public final class C66055M9o implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C363858kS A02;
    public final /* synthetic */ C59881Jb4 A03;
    public final /* synthetic */ String A04;

    public C66055M9o(Context context, C363858kS r2, C59881Jb4 jb4, String str, int i) {
        this.A03 = jb4;
        this.A01 = context;
        this.A04 = str;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void run() {
        String str;
        C59881Jb4 jb4 = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        0qQ.A0C(fragmentActivity, AnonymousClass000.A00(3653));
        FragmentActivity fragmentActivity2 = (C273554mm) fragmentActivity;
        String str2 = this.A04;
        Location location = jb4.A00;
        int i = this.A00;
        Number number = (Number) this.A02.A03(C363858kS.A0K);
        if (number == null || number.intValue() != 1) {
            str = "back";
        } else {
            str = "front";
        }
        FragmentActivity fragmentActivity3 = (MediaCaptureActivity) fragmentActivity2;
        if (AnonymousClass06S.A01(fragmentActivity3.getSupportFragmentManager())) {
            String A0Z = JTQ.A0Z();
            0qQ.A0B(A0Z, 0);
            AnonymousClass3Q2 A012 = AnonymousClass9T3.A01(A0Z);
            A012.A44 = C379839Vn.A00(str2);
            A012.A3L = str2;
            A012.A2W = str;
            fragmentActivity3.Ex2(A012);
            C3499682q r2 = fragmentActivity3.A09.A00;
            r2.getClass();
            r2.EVc(i);
            CreationSession creationSession = ((JWE) r2).A01;
            MediaSession mediaSession = creationSession.A07;
            if (mediaSession != null) {
                mediaSession.EcZ(location);
            }
            creationSession.A02 = 1;
            r2.EfU(A012.A35);
            C71342cb.A00(fragmentActivity3.A04).A0A(fragmentActivity3, "camera_capture");
            MediaCaptureActivity.A03(fragmentActivity3);
        }
    }
}
