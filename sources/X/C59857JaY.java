package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.JaY  reason: case insensitive filesystem */
public final class C59857JaY implements 07h {
    public final /* synthetic */ C59761JWz A00;

    public C59857JaY(C59761JWz jWz) {
        this.A00 = jWz;
    }

    public final 07p D6j(Bundle bundle, int i) {
        Uri uri;
        C59761JWz jWz = this.A00;
        UserSession userSession = jWz.A0B;
        Context context = jWz.A09;
        JX0 jx0 = jWz.A03;
        Uri uri2 = null;
        if (jx0 != null) {
            uri = jx0.A01;
        } else {
            uri = null;
        }
        0qQ.A0A(uri);
        JX0 jx02 = jWz.A03;
        if (jx02 != null) {
            uri2 = jx02.A02;
        }
        return new C59854JaV(context, uri, uri2, userSession);
    }

    public final /* bridge */ /* synthetic */ void DOK(07p r11, Object obj) {
        String AvM;
        C364808m2 r0;
        C364808m2 r02;
        String AvM2;
        C59861Jad jad = (C59861Jad) obj;
        0qQ.A0B(jad, 1);
        C59761JWz jWz = this.A00;
        C364808m2 r1 = jWz.A05;
        if (!(r1 == null || (r0 = jad.A02) == null || 2PP.A00(r1.AvM(), r0.AvM()) || (r02 = jWz.A05) == null || (AvM2 = r02.AvM()) == null)) {
            jWz.A0C.ATE(new C386549km(AvM2));
        }
        C364808m2 r3 = jad.A02;
        jWz.A05 = r3;
        jWz.A04 = jad.A01;
        jWz.A00 = jad.A00;
        jWz.A06 = true;
        if (!(r3 == null || (AvM = r3.AvM()) == null)) {
            AnonymousClass84K.A00(jWz.A09, jWz.A0B).A01(AvM, C59902JbR.A00, r3.getWidth(), r3.getHeight(), r3.Aw4());
        }
        jWz.A0A.post(new C59858Jaa(jWz));
    }
}
