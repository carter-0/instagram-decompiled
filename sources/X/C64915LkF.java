package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.LkF  reason: case insensitive filesystem */
public final class C64915LkF implements C273534mk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3499682q A02;
    public final /* synthetic */ AtomicInteger A03;
    public final /* synthetic */ boolean A04;

    public C64915LkF(Context context, UserSession userSession, C3499682q r3, AtomicInteger atomicInteger, boolean z) {
        this.A03 = atomicInteger;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = userSession;
        this.A04 = z;
    }

    public final /* synthetic */ void AGe() {
    }

    public final void AGc() {
        UserSession userSession;
        C59889JbE kpk;
        if (this.A03.decrementAndGet() != 0) {
            0KC.A0C("MediaSaveHelper", "captureCompleted(): return early from renderCounter.");
            return;
        }
        FragmentActivity fragmentActivity = this.A00;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0hq supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        if (AnonymousClass06S.A01(supportFragmentManager)) {
            C3499682q r3 = this.A02;
            CreationSession creationSession = ((JWE) r3).A01;
            AnonymousClass36W r1 = creationSession.A0A;
            r1.getClass();
            if (r1 != AnonymousClass36W.PROFILE_PHOTO) {
                AnonymousClass36W r12 = creationSession.A0A;
                r12.getClass();
                if (r12 != AnonymousClass36W.GROUP_PHOTO) {
                    AnonymousClass36W r13 = creationSession.A0A;
                    r13.getClass();
                    if (r13 == AnonymousClass36W.REACT_MEDIA_PICKER) {
                        fragmentActivity2.finish();
                        AnonymousClass1Nd.A00(this.A01).A05(new C64649Lfb(r3.E2g()));
                        return;
                    }
                    if (this.A04) {
                        PhotoSession A022 = creationSession.A02();
                        A022.getClass();
                        A022.A0E.EK1();
                        userSession = this.A01;
                        kpk = new KPF();
                    } else {
                        0KC.A0C("MediaSaveHelper", "captureCompleted(): Safe to commit stateful transactions. Post creation event to navigate to the next screen.");
                        userSession = this.A01;
                        kpk = new KPK();
                    }
                    C59888JbD.A01(userSession, kpk);
                    return;
                }
            }
            String E2g = r3.E2g();
            String E2M = r3.E2M();
            if (E2M != null) {
                Intent intent = new Intent(E2g);
                intent.putExtra("pending_media_key", E2M);
                Dba.A0k(fragmentActivity2, intent);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
