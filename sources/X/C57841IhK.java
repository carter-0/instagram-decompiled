package X;

import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import java.util.List;

/* renamed from: X.IhK  reason: case insensitive filesystem */
public final class C57841IhK implements Runnable {
    public final /* synthetic */ IgdsFaceSwarm A00;
    public final /* synthetic */ List A01;

    public C57841IhK(IgdsFaceSwarm igdsFaceSwarm, List list) {
        this.A00 = igdsFaceSwarm;
        this.A01 = list;
    }

    public final void run() {
        IgdsFaceSwarm.A05(this.A00, this.A01);
    }
}
