package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.8ho  reason: invalid class name and case insensitive filesystem */
public final class C362388ho implements AnonymousClass2tH {
    public static final Executor A05 = new C362398hp();
    public C231452rh A00 = new Object();
    public List A01;
    public final Executor A02;
    public final AtomicLong A03;
    public final C61480nO A04;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.2rh] */
    public C362388ho(C61480nO r2, Executor executor) {
        0qQ.A0B(executor, 1);
        this.A02 = executor;
        this.A04 = r2;
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        this.A01 = emptyList;
        this.A03 = new AtomicLong();
    }

    public final void EcF(C231452rh r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void Eyp(ViewModelListUpdate viewModelListUpdate, AnonymousClass2tB r10) {
        0qQ.A0B(viewModelListUpdate, 0);
        0qQ.A0B(r10, 1);
        long incrementAndGet = this.A03.incrementAndGet();
        this.A04.ATE(new C362678iJ(this, viewModelListUpdate, r10, this.A01, incrementAndGet));
    }

    public final List Au8() {
        return this.A01;
    }
}
