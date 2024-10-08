package X;

import android.content.DialogInterface;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.FHl  reason: case insensitive filesystem */
public final class C49976FHl implements DialogInterface.OnClickListener {
    public final /* synthetic */ InstagramMainActivity A00;

    public C49976FHl(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.finish();
    }
}
