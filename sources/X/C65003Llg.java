package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Llg  reason: case insensitive filesystem */
public final class C65003Llg implements MS2 {
    public final /* synthetic */ C64876Ljc A00;

    public C65003Llg(C64876Ljc ljc) {
        this.A00 = ljc;
    }

    public final void DId(Hashtag hashtag, int i) {
        if (hashtag != null) {
            C64876Ljc ljc = this.A00;
            C60319JjN A002 = C64876Ljc.A00(ljc);
            A002.A09(DbS.A0C(((C61051Jvp) A002.A07.getValue()).A01), hashtag, ljc.A05.getSelectionEnd());
        }
    }
}
