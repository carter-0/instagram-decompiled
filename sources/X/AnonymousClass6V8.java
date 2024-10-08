package X;

import android.view.View;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.6V8  reason: invalid class name */
public final class AnonymousClass6V8 {
    public final View A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 45));
    public final Map A02 = 0Yt.A07(new 0eP[]{new 0eP(Integer.valueOf(R.id.header_menu_button), (Object) null), new 0eP(Integer.valueOf(R.id.toolbar_share_to_link_button), (Object) null), new 0eP(Integer.valueOf(R.id.toolbar_archive_button), (Object) null)});

    public AnonymousClass6V8(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
    }

    public static final void A00(AnonymousClass6V8 r5, C62320sa r6) {
        Map map = r5.A02;
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            if (view == null) {
                View findViewById = ((View) r5.A01.getValue()).findViewById(intValue);
                if (findViewById != null) {
                    findViewById.setEnabled(((Boolean) r6.invoke()).booleanValue());
                }
                map.put(Integer.valueOf(intValue), findViewById);
            } else {
                view.setEnabled(((Boolean) r6.invoke()).booleanValue());
            }
        }
    }
}
