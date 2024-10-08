package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.EpO  reason: case insensitive filesystem */
public abstract class C49099EpO {
    public static final void A00(Context context, AnonymousClass0iw r15, UserSession userSession, IgdsFaceSwarm igdsFaceSwarm) {
        int i;
        int i2;
        C376699Iz r9;
        IgdsFaceSwarm igdsFaceSwarm2 = igdsFaceSwarm;
        0qQ.A0B(igdsFaceSwarm2, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int A00 = FFN.A00(userSession, A1C);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            User user = (User) next;
            if (i3 < A00) {
                if (i3 < 4) {
                    r9 = new C376699Iz((Drawable) FFN.A01(context, user.Bh3(), r15.getModuleName()), (ImageUrl) null, (String) null, 5);
                } else {
                    i3 = i4;
                }
            } else if (i3 < 4) {
                r9 = new C376699Iz((Drawable) null, user.Bh3(), (String) null, 6);
            } else {
                i3 = i4;
            }
            A1C2.add(r9);
            i3 = i4;
        }
        if (A1C2.size() < 2) {
            A1C2.add(new C376699Iz(igdsFaceSwarm2.getContext().getDrawable(R.drawable.reel_item_new_group_story_icon), (ImageUrl) null, (String) null, 5));
        }
        if (A1C2.size() == 1) {
            i = 74;
            int dimensionPixelSize = DbU.A05(igdsFaceSwarm2).getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            igdsFaceSwarm2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            i = 90;
            int A03 = AnonymousClass7TG.A03(igdsFaceSwarm2.getContext());
            igdsFaceSwarm2.setPadding(0, A03, 0, A03);
        }
        igdsFaceSwarm2.setBackgroundCircleColor(0);
        igdsFaceSwarm2.setCustomSizeDp(i);
        igdsFaceSwarm2.A08 = false;
        if (A1C.size() <= 2) {
            i2 = -85;
        } else {
            i2 = -55;
            if (A1C.size() == 3) {
                i2 = -75;
            }
        }
        igdsFaceSwarm2.A04 = i2;
        igdsFaceSwarm2.setFaceSwarmItems(A1C2, r15);
    }
}
