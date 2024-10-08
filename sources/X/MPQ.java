package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

public final class MPQ extends 0Yg implements 0sK {
    public static final MPQ A00 = new MPQ();

    public MPQ() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        AnonymousClass7TF.A1H(viewGroup, obj2);
        List list = C60680JpR.A00;
        LayoutInflater A0D = DbV.A0D(viewGroup);
        C62457Kg7 kg7 = C62457Kg7.LIST;
        int i = R.layout.layout_stacked_timeline_bottom_sheet_tts_voice_grid_item;
        if (obj2 == kg7) {
            i = R.layout.layout_stacked_timeline_bottom_sheet_tts_voice_item;
        }
        return new C61782KLv(DbT.A0D(A0D, viewGroup, i, false));
    }
}
