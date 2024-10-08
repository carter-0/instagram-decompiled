package X;

import com.google.gson.Gson;
import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import com.instagram.common.session.UserSession;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.TpT  reason: case insensitive filesystem */
public final class C14079TpT {
    public AutoplayConfigRoot A00;
    public String A01;
    public final Gson A02;
    public final AutoplayLayout A03;
    public final UserSession A04;
    public final ReentrantReadWriteLock A05 = new ReentrantReadWriteLock();
    public final AnonymousClass0eM A06;
    public final ReentrantReadWriteLock A07 = new ReentrantReadWriteLock();

    public final AutoplayConfigRoot A00() {
        String string;
        AutoplayConfigRoot autoplayConfigRoot = this.A00;
        if (autoplayConfigRoot != null) {
            return autoplayConfigRoot;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.A07;
        reentrantReadWriteLock.readLock().lock();
        try {
            0xa r2 = (0xa) this.A06.getValue();
            if (!(r2 == null || (string = r2.getString("last_config_from_server", "")) == null || string.length() == 0)) {
                AutoplayConfigRoot autoplayConfigRoot2 = (AutoplayConfigRoot) this.A02.A08(string, AutoplayConfigRoot.class);
                reentrantReadWriteLock.readLock().unlock();
                return autoplayConfigRoot2;
            }
        } catch (Exception e) {
            0KC.A0F("Autoplay", "SharedPreferences exception", e);
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
        reentrantReadWriteLock.readLock().unlock();
        return null;
    }

    public C14079TpT(AutoplayLayout autoplayLayout, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = autoplayLayout;
        C7210Pzc pzc = new C7210Pzc();
        pzc.A02(new Object(), AutoplayWhichVideos.class);
        this.A02 = pzc.A00();
        this.A06 = AnonymousClass0eN.A01(new C51801G2k(this, 22));
    }
}
