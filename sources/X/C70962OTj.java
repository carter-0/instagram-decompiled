package X;

import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.OTj  reason: case insensitive filesystem */
public final class C70962OTj {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final RadioGroup.OnCheckedChangeListener A04;
    public final List A05;

    public C70962OTj(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, String str, List list, boolean z) {
        this.A03 = true;
        this.A02 = true;
        this.A05 = list;
        this.A00 = str;
        this.A01 = z;
        this.A04 = onCheckedChangeListener;
    }

    public C70962OTj(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, String str, List list) {
        this(onCheckedChangeListener, str, list, false);
    }
}
