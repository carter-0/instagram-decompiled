package X;

import com.instagram.newsfeed.fragment.NewsfeedFragment;

/* renamed from: X.Fql  reason: case insensitive filesystem */
public final class C51230Fql implements Runnable {
    public final /* synthetic */ NewsfeedFragment A00;

    public C51230Fql(NewsfeedFragment newsfeedFragment) {
        this.A00 = newsfeedFragment;
    }

    public final void run() {
        DbW.A1K(this.A00.A03);
    }
}
