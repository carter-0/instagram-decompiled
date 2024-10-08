package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wal  reason: case insensitive filesystem */
public final class C19499Wal implements XAT {
    public int A00;
    public int A01;
    public int A02;
    public final SeekBar A03;
    public final C14668U0o A04;

    public C19499Wal(View view, C357948a7 r9) {
        0qQ.A0B(r9, 2);
        r9.A02.add(this);
        C19502Wao wao = new C19502Wao(r9);
        SeekBar seekBar = (SeekBar) view.requireViewById(R.id.fast_scrubber);
        this.A03 = seekBar;
        Context context = seekBar.getContext();
        boolean A0L = 2Yu.A0L(context, R.attr.musicCreationShadowEnabled, false);
        0qQ.A0A(context);
        C14668U0o u0o = new C14668U0o(context, A0L);
        this.A04 = u0o;
        seekBar.setThumb(new C14666U0m(context, A0L));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{u0o, new ColorDrawable(0)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        seekBar.setProgressDrawable(layerDrawable);
        DbU.A12(context, seekBar, 2131967803);
        seekBar.setOnSeekBarChangeListener(new WD8(3, context, this, wao));
    }

    public final void DTI(int i) {
    }

    public final void CMv(List list, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i3;
        this.A00 = i2;
        SeekBar seekBar = this.A03;
        seekBar.setMax(i - i2);
        seekBar.setProgress(i3);
        int i4 = this.A02 - this.A00;
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JTP.A1V(A0m, Math.min(((float) AnonymousClass7TG.A0F(it)) / ((float) i4), 1.0f));
        }
        C14668U0o u0o = this.A04;
        u0o.A00 = A0m;
        u0o.invalidateSelf();
    }

    public final void Dld(int i) {
        this.A00 = i;
        this.A03.setMax(this.A02 - i);
    }

    public final void Dle(int i) {
        this.A01 = i;
        this.A03.setProgress(i);
    }
}
