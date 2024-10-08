package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

/* renamed from: X.Ug3  reason: case insensitive filesystem */
public final class C15637Ug3 extends C14097Tpp {
    public SeekBar.OnSeekBarChangeListener A00;
    public U6C A01;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        C66581MXm.A1A(frameLayout, -1);
        frameLayout.addView(new AppCompatSeekBar(context, (AttributeSet) null));
        return frameLayout;
    }
}
