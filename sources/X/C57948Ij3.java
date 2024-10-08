package X;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import java.util.List;

/* renamed from: X.Ij3  reason: case insensitive filesystem */
public final class C57948Ij3 implements Runnable {
    public final /* synthetic */ GNY A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ IgdsFaceSwarm A02;
    public final /* synthetic */ List A03;

    public C57948Ij3(GNY gny, AnonymousClass0iw r2, IgdsFaceSwarm igdsFaceSwarm, List list) {
        this.A00 = gny;
        this.A02 = igdsFaceSwarm;
        this.A03 = list;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void run() {
        GNY gny = this.A00;
        List list = (List) gny.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C53338GmO gmO = (C53338GmO) list.get(i);
            int i2 = gmO.A01;
            IgdsFaceSwarm igdsFaceSwarm = this.A02;
            int A002 = (int) 0nA.A00(AnonymousClass7TE.A0S(igdsFaceSwarm), gmO.A00);
            List list2 = this.A03;
            C55640Hkz hkz = new C55640Hkz((C376699Iz) list2.get(i2), (CircularImageView) igdsFaceSwarm.getImageViews().get(i));
            igdsFaceSwarm.A0G.add(hkz);
            ? r2 = hkz.A01;
            C240923Ne.A01((C376699Iz) list2.get(i2), this.A01, r2);
            r2.setVisibility(0);
            Context A0S = AnonymousClass7TE.A0S(r2);
            Point point = gmO.A02;
            r2.setX(0nA.A04(A0S, point.x));
            r2.setY(0nA.A04(A0S, point.y));
            r2.setLayoutParams(new FrameLayout.LayoutParams(A002, A002));
            r2.setRotation(-gny.A00);
            r2.setAlpha(1.0f);
            r2.setScaleX(1.0f);
            r2.setScaleY(1.0f);
        }
    }
}
