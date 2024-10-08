package X;

import android.view.View;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

public final class LYU implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public LYU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onLongClick(View view) {
        MediaPickerItemView mediaPickerItemView;
        C62320sa r0;
        switch (this.A00) {
            case 0:
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                r0 = MJr.A00;
                break;
            case 1:
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                r0 = MK8.A00;
                break;
            case 2:
                return C60697Jpi.A00((C60697Jpi) this.A01);
            case 3:
                return C51971G9r.A1b((C62320sa) ((C61050Jvo) this.A01).A04);
            default:
                C60710Jpv jpv = (C60710Jpv) this.A01;
                C17708Vcd vcd = jpv.A02;
                vcd.getClass();
                String str = jpv.A0C.A01;
                str.getClass();
                vcd.A08.Dcf(vcd.A0B, vcd.A00, str);
                return true;
        }
        return C59848JaO.A02(mediaPickerItemView, r0);
    }
}
