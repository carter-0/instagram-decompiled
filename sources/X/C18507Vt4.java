package X;

import com.instagram.model.hashtag.Hashtag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vt4  reason: case insensitive filesystem */
public final class C18507Vt4 {
    public N3M A00;
    public Hashtag A01;
    public C45235Csq A02;
    public C45355Cux A03;
    public boolean A04 = true;
    public boolean A05;
    public final C16742V3z A06;
    public final Map A07 = new HashMap();
    public final VO7 A08;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V3z, java.lang.Object] */
    public C18507Vt4(VO7 vo7, Hashtag hashtag) {
        AnonymousClass7TF.A1B(hashtag, 1, vo7);
        this.A01 = hashtag;
        ? obj = new Object();
        obj.A01 = hashtag;
        this.A06 = obj;
        this.A08 = vo7;
    }

    public static final void A00(C18507Vt4 vt4) {
        String str;
        if (vt4.A05) {
            C15381Ube ube = vt4.A08.A00;
            ube.A0P = false;
            C15381Ube.A03(ube);
            C18755Vzq vzq = ube.A0E;
            if (vzq == null) {
                str = "useHashtagController";
            } else {
                boolean z = C15381Ube.A01(ube).A04;
                HAI hai = ube.A08;
                if (hai == null) {
                    str = "dataSource";
                } else {
                    C16672Uz8 uz8 = hai.A00;
                    0qQ.A07(uz8);
                    vzq.A03 = z;
                    vzq.A01(uz8);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
