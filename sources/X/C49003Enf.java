package X;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Enf  reason: case insensitive filesystem */
public abstract class C49003Enf {
    public static final void A00(Drawable drawable, View.OnClickListener onClickListener, View view, AnonymousClass4DH r6, String str, String str2, String str3, List list) {
        AnonymousClass7TF.A1B(view, 1, str);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.headline);
        igdsHeadline.setImageDrawable(drawable);
        igdsHeadline.setHeadline((CharSequence) str);
        igdsHeadline.setBody((CharSequence) str2);
        igdsHeadline.setAction(str3, onClickListener);
        FGX A02 = FGX.A02(r6.requireContext(), true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FAA faa = (FAA) it.next();
            A02.A05((CharSequence) null, faa.A01, faa.A00);
        }
        List<IgdsBulletCell> A04 = A02.A04();
        for (IgdsBulletCell movementMethod : A04) {
            movementMethod.setMovementMethod(LinkMovementMethod.getInstance(), LinkMovementMethod.getInstance());
        }
        igdsHeadline.setBulletList(A04);
    }
}
