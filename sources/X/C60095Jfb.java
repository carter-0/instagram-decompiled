package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.gallery.Draft;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jfb  reason: case insensitive filesystem */
public final class C60095Jfb extends C361478gI {
    public final Application A00;
    public final JWZ A01;
    public final UserSession A02;
    public final ClipsDraftRepository A03;
    public final JWW A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60095Jfb(Application application, JWZ jwz, UserSession userSession, ClipsDraftRepository clipsDraftRepository, JWW jww) {
        super(application);
        0qQ.A0B(userSession, 2);
        C51973G9u.A0r(3, jwz, jww, clipsDraftRepository);
        this.A00 = application;
        this.A02 = userSession;
        this.A01 = jwz;
        this.A04 = jww;
        this.A03 = clipsDraftRepository;
        02z A10 = DbS.A10(new C59721JVf((C54649HMg) null, (DefaultConstructorMarker) null, (AnonymousClass62P) null, 3, 38));
        this.A06 = A10;
        this.A05 = A10;
    }

    public final void A0E() {
        Object value;
        AnonymousClass62O A032;
        C54649HMg hMg;
        String str;
        C54649HMg hMg2;
        C54649HMg hMg3;
        05G r3 = this.A06;
        do {
            value = r3.getValue();
            C59721JVf jVf = (C59721JVf) value;
            ArrayList A002 = JX7.A00(this.A02);
            ArrayList A0r = AnonymousClass7TG.A0r(A002);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                Draft draft = (Draft) it.next();
                Context A052 = DbT.A05(this.A00);
                String str2 = draft.A04;
                String str3 = draft.A02;
                if (str3 == null) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Untitled ");
                    if (draft.A05) {
                        hMg3 = C54649HMg.CAROUSEL;
                    } else if (draft.A06) {
                        hMg3 = C54649HMg.VIDEO;
                    } else {
                        hMg3 = C54649HMg.PHOTO;
                    }
                    str3 = AnonymousClass7TF.A0i(hMg3, A1A);
                }
                Long l = draft.A01;
                if (l != null) {
                    str = I4G.A00.A01(A052, l.longValue());
                } else {
                    str = null;
                }
                String str4 = "";
                if (str == null) {
                    str = str4;
                }
                if (draft.A00 != 0 && draft.A06) {
                    str4 = draft.B8E();
                }
                if (draft.A05) {
                    hMg2 = C54649HMg.CAROUSEL;
                } else if (draft.A06) {
                    hMg2 = C54649HMg.VIDEO;
                } else {
                    hMg2 = C54649HMg.PHOTO;
                }
                A0r.add(new C53294Glg(hMg2, str2, str3, str, str4, draft.A03, draft.A07));
            }
            A032 = AnonymousClass62Q.A03(A0r);
            hMg = (C54649HMg) jVf.A00;
            AnonymousClass7TG.A1N(A032, hMg);
        } while (!r3.AIY(value, new C59721JVf(hMg, (AnonymousClass62P) A032)));
    }
}
