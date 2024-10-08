package X;

import android.app.Activity;
import com.instagram.android.R;
import java.util.Iterator;

public final /* synthetic */ class AYP implements C3495480u {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ AYP(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        Object obj2;
        int i;
        Object obj3;
        AnonymousClass80R r0 = this.A00;
        AnonymousClass88F r6 = r0.A22;
        Activity activity = r0.A09;
        AnonymousClass8E7 r4 = r0.A0q;
        if (r6 == null) {
            0kD.A01("QccState", "rearrangeRemix called without visual reply thumbnail controller initialized");
        } else if (!r6.A0f) {
            r6.A06();
        } else {
            if (r6.A04 instanceof AnonymousClass803) {
                Class<C339987kV> cls = C339987kV.class;
                Iterator it = r6.A0R.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (cls.isInstance(obj3)) {
                        break;
                    }
                }
                AnonymousClass804 r1 = (AnonymousClass804) obj3;
                r1.getClass();
                r6.A07(r1);
                i = R.drawable.instagram_layout_remix1_outline_44;
            } else {
                Class<AnonymousClass803> cls2 = AnonymousClass803.class;
                Iterator it2 = r6.A0R.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (cls2.isInstance(obj2)) {
                        break;
                    }
                }
                AnonymousClass804 r12 = (AnonymousClass804) obj2;
                r12.getClass();
                r6.A07(r12);
                i = R.drawable.instagram_layout_remix3_outline_44;
            }
            r4.A00().A09(activity.getDrawable(i), AnonymousClass9QA.A00, C358088aL.A0l);
        }
    }
}
