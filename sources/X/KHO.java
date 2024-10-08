package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;

public final class KHO extends IgFrameLayout {
    public static final C71392co A06 = C71392co.A00();
    public Fragment A00;
    public LPF A01;
    public MVV A02;
    public final View A03;
    public final FrameLayout A04 = ((FrameLayout) requireViewById(R.id.album_overlay_container));
    public final FrameLayout A05;

    public KHO(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.meta_ai_picker_view, this);
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.photo_picker_container);
        this.A05 = frameLayout;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_media_picker_photos, frameLayout, false);
        this.A03 = inflate;
        frameLayout.addView(inflate);
    }

    private final C361518gM getAlbumPickerListener() {
        return new C64974LlD(this, 3);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1748175145);
        super.onDetachedFromWindow();
        this.A04.animate().cancel();
        this.A02 = null;
        this.A01 = null;
        AnonymousClass0fD.A0D(-1482856009, A062);
    }
}
