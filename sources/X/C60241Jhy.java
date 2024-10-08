package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.HashMap;

/* renamed from: X.Jhy  reason: case insensitive filesystem */
public final class C60241Jhy extends 2YL {
    public final int A00;
    public final Application A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final AnonymousClass8RL A04;
    public final AnonymousClass8RF A05;
    public final HashMap A06 = AnonymousClass7TE.A1E();
    public final C62320sa A07;
    public final boolean A08;

    public final C61805KMt A00(String str) {
        HashMap hashMap = this.A06;
        String str2 = str;
        if (!hashMap.containsKey(str)) {
            Application application = this.A01;
            UserSession userSession = this.A02;
            ClipsCreationViewModel clipsCreationViewModel = this.A03;
            AnonymousClass8RF r7 = this.A05;
            hashMap.put(str, new C61805KMt(application, userSession, clipsCreationViewModel, this.A04, r7, str2, this.A07, this.A00, this.A08));
        }
        Object obj = hashMap.get(str);
        if (obj != null) {
            return (C61805KMt) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C60241Jhy(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r5, AnonymousClass8RF r6, C62320sa r7, int i, boolean z) {
        C51974G9v.A1M(userSession, clipsCreationViewModel, r6);
        AnonymousClass7TF.A1F(r5, 5, r7);
        this.A01 = application;
        this.A02 = userSession;
        this.A03 = clipsCreationViewModel;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = i;
        this.A08 = z;
        this.A07 = r7;
    }
}
