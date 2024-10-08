package X;

import com.instagram.autoplay.models.AutoplayCustomization;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Tuh  reason: case insensitive filesystem */
public final class C14352Tuh {
    public AutoplayCustomization A00;
    public AutoplayCustomization A01;
    public Long A02;
    public Long A03;
    public final C14078TpS A04;
    public final C14079TpT A05;
    public final C61410nE A06;

    public C14352Tuh(C14078TpS tpS, C14079TpT tpT, C61410nE r4) {
        0qQ.A0B(r4, 1);
        this.A06 = r4;
        this.A04 = tpS;
        this.A05 = tpT;
        A00();
    }

    public final void A00() {
        Object obj;
        C14079TpT tpT = this.A05;
        String str = tpT.A01;
        if (str == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = tpT.A05;
            reentrantReadWriteLock.readLock().lock();
            str = null;
            try {
                0xa r2 = (0xa) tpT.A06.getValue();
                if (r2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("last_customization_used_id_for_layout_");
                    String string = r2.getString(AnonymousClass7TF.A0i(tpT.A03, sb), "");
                    if (!(string == null || string.length() == 0)) {
                        reentrantReadWriteLock.readLock().unlock();
                        str = string;
                    }
                }
            } catch (Exception e) {
                0KC.A0F("Autoplay", "SharedPreferences exception", e);
            } catch (Throwable th) {
                reentrantReadWriteLock.readLock().unlock();
                throw th;
            }
            reentrantReadWriteLock.readLock().unlock();
        }
        C14078TpS tpS = this.A04;
        List A002 = C14078TpS.A00(tpS, tpS.A01());
        Iterator it = A002.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!0qQ.A0K(((AutoplayCustomization) obj).id, str));
        AutoplayCustomization autoplayCustomization = (AutoplayCustomization) obj;
        if (autoplayCustomization == null && AnonymousClass7TE.A1b(A002)) {
            autoplayCustomization = (AutoplayCustomization) 00k.A0K(A002);
        }
        A01(autoplayCustomization);
        A002.size();
    }

    public final void A01(AutoplayCustomization autoplayCustomization) {
        String str;
        this.A01 = this.A00;
        this.A03 = this.A02;
        this.A00 = autoplayCustomization;
        this.A02 = C51968G9o.A0u();
        C14079TpT tpT = this.A05;
        if (autoplayCustomization != null) {
            str = autoplayCustomization.id;
        } else {
            str = null;
        }
        0xa r1 = (0xa) tpT.A06.getValue();
        if (r1 != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = tpT.A05;
            reentrantReadWriteLock.writeLock().lock();
            try {
                0xY AR4 = r1.AR4();
                StringBuilder sb = new StringBuilder();
                sb.append("last_customization_used_id_for_layout_");
                AR4.E5g(AnonymousClass7TF.A0i(tpT.A03, sb), str);
                AR4.apply();
                tpT.A01 = str;
            } catch (Exception e) {
                0KC.A0F("Autoplay", "SharedPreferences exception", e);
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
