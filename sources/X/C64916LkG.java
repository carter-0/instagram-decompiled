package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.LkG  reason: case insensitive filesystem */
public final class C64916LkG implements C273534mk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ PhotoSession A02;
    public final /* synthetic */ AnonymousClass36W A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AtomicInteger A06;
    public final /* synthetic */ boolean A07;

    public C64916LkG(Context context, UserSession userSession, PhotoSession photoSession, AnonymousClass36W r4, String str, String str2, AtomicInteger atomicInteger, boolean z) {
        this.A06 = atomicInteger;
        this.A00 = context;
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = userSession;
        this.A07 = z;
        this.A02 = photoSession;
    }

    public final /* synthetic */ void AGe() {
    }

    public final void AGc() {
        UserSession userSession;
        C59889JbE kpk;
        if (this.A06.decrementAndGet() != 0) {
            0KC.A0C("MediaSaveHelper", "captureCompleted(): return early from renderCounter.");
            return;
        }
        FragmentActivity fragmentActivity = this.A00;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0hq supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        if (AnonymousClass06S.A01(supportFragmentManager)) {
            AnonymousClass36W r1 = this.A03;
            if (r1 == AnonymousClass36W.PROFILE_PHOTO || r1 == AnonymousClass36W.GROUP_PHOTO) {
                String str = this.A05;
                String str2 = this.A04;
                if (str2 != null) {
                    0qQ.A0B(str, 0);
                    Intent intent = new Intent(str);
                    intent.putExtra("pending_media_key", str2);
                    Dba.A0k(fragmentActivity2, intent);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            } else if (r1 == AnonymousClass36W.REACT_MEDIA_PICKER) {
                fragmentActivity2.finish();
                AnonymousClass1Nd.A00(this.A01).A05(new C64649Lfb(this.A05));
            } else {
                if (this.A07) {
                    this.A02.A0E.EK1();
                    userSession = this.A01;
                    kpk = new KPF();
                } else {
                    0KC.A0C("MediaSaveHelper", "captureCompleted(): Safe to commit stateful transactions. Post creation event to navigate to the next screen.");
                    userSession = this.A01;
                    kpk = new KPK();
                }
                C59888JbD.A01(userSession, kpk);
            }
        }
    }
}
