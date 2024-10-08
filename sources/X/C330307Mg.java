package X;

import com.instagram.user.model.User;

/* renamed from: X.7Mg  reason: invalid class name and case insensitive filesystem */
public final class C330307Mg implements C330317Mh {
    public final /* synthetic */ C330297Mf A00;

    public final void onSuccess(User user) {
        0qQ.A0B(user, 0);
        C330297Mf r2 = this.A00;
        r2.A02.put(user.getId(), user);
        if (r2.A03.decrementAndGet() <= 0) {
            C330297Mf.A00(r2);
        }
    }

    public C330307Mg(C330297Mf r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        0KC.A0C("DirectThreadUserFetcher", "Unable to fetch missing user from thread.");
        C330297Mf r2 = this.A00;
        if (r2.A03.decrementAndGet() <= 0 && r2.A02.size() > 1) {
            C330297Mf.A00(r2);
        }
    }
}
