package X;

import androidx.fragment.app.Fragment;
import com.instagram.newsfeed.fragment.NewsfeedFragment;

/* renamed from: X.DkF  reason: case insensitive filesystem */
public final class C46726DkF extends 06E {
    public final /* synthetic */ NewsfeedFragment A00;

    public C46726DkF(NewsfeedFragment newsfeedFragment) {
        this.A00 = newsfeedFragment;
    }

    public final Fragment A01(ClassLoader classLoader, String str) {
        AnonymousClass7TG.A1N(classLoader, str);
        if (0qQ.A0K(ERZ.class.getName(), str) && this.A00.A05 != null) {
            return new ERZ();
        }
        Fragment A01 = C46726DkF.super.A01(classLoader, str);
        0qQ.A0A(A01);
        return A01;
    }
}
