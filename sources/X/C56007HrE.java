package X;

import android.app.Application;
import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.HrE  reason: case insensitive filesystem */
public final class C56007HrE {
    public int A00 = C229632nm.A04(2SP.A00, C229632nm.A0C(0, Integer.MAX_VALUE));
    public final Application A01;
    public final EmuFlashRepository A02;
    public final C55669HlS A03 = new C55669HlS();
    public final ConcurrentLinkedQueue A04;
    public final C262224Cq A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final I25 A08;
    public final ImagineNetworkService A09;

    public final void A00() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.A04;
            if (DbT.A1b(concurrentLinkedQueue)) {
                ((C262204Co) concurrentLinkedQueue.remove()).AG7((CancellationException) null);
            } else {
                this.A00 = C229632nm.A04(2SP.A00, C229632nm.A0C(0, Integer.MAX_VALUE));
                this.A06.Epw((Object) null);
                this.A02.A02.A00.evictAll();
                return;
            }
        }
    }

    public C56007HrE(Application application, I25 i25, HMY hmy, ImagineNetworkService imagineNetworkService, C262224Cq r8) {
        this.A01 = application;
        this.A09 = imagineNetworkService;
        this.A05 = r8;
        this.A08 = i25;
        this.A02 = new EmuFlashRepository(application, i25, hmy, imagineNetworkService);
        02z A012 = 106.A01((Object) null);
        this.A06 = A012;
        this.A07 = A012;
        this.A04 = new ConcurrentLinkedQueue();
    }
}
