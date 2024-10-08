package X;

import android.view.View;
import com.instagram.mainactivity.InstagramMainActivity;

public final class FPQ implements View.OnLongClickListener {
    public final /* synthetic */ InstagramMainActivity A00;

    public FPQ(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    public final boolean onLongClick(View view) {
        return InstagramMainActivity.A0T(this.A00);
    }
}
