package X;

import java.util.Set;
import org.json.JSONException;

/* renamed from: X.NRr  reason: case insensitive filesystem */
public final class C68659NRr extends 0ng {
    public final /* synthetic */ AnonymousClass5D8 A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68659NRr(AnonymousClass5D8 r4, String str) {
        super(1656425846, 3, false, false);
        this.A01 = str;
        this.A00 = r4;
    }

    public final void run() {
        C70688OGj oGj;
        try {
            String string = C66580MXl.A17(this.A01).getString("client_context");
            if (string != null) {
                AnonymousClass5D7 r1 = this.A00.A00;
                Set set = r1.A04;
                if (!set.contains(string) && (oGj = (C70688OGj) r1.A02.get(string)) != null) {
                    r1.A01.markerPoint(814299525, oGj.A02, "text_sent");
                    set.add(string);
                }
            }
        } catch (JSONException unused) {
        }
    }
}
