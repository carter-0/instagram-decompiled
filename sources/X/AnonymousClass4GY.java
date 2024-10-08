package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.4GY  reason: invalid class name */
public final class AnonymousClass4GY {
    public final C71662eb A00;

    public AnonymousClass4GY(View view) {
        ViewStub viewStub;
        View findViewById = view.findViewById(R.id.carousel_sub_media_deletion_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A00 = new C71662eb(viewStub);
    }
}
