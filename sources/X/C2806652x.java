package X;

import android.view.View;
import com.instagram.api.schemas.MusicInfo;

/* renamed from: X.52x  reason: invalid class name and case insensitive filesystem */
public final class C2806652x implements C2806752y {
    public final /* synthetic */ N4R A00;
    public final /* synthetic */ C242813Wa A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public C2806652x(N4R n4r, C242813Wa r2, AnonymousClass3W1 r3) {
        this.A00 = n4r;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DSh(View view) {
        C295345o0 r1;
        MusicInfo musicInfo;
        1Xj A002 = ((AnonymousClass3ZT) this.A00.A00).A00();
        C242813Wa r4 = this.A01;
        AnonymousClass3W1 r3 = this.A02;
        if (A002.A1J() != null) {
            r1 = new C295345o0(DA2.A00());
            r1.A09 = A002.A1J();
        } else {
            C2605946h A1O = A002.A1O();
            r1 = new C295345o0(C55317Hfk.A00);
            if (A1O != null) {
                musicInfo = A1O.A00;
            } else {
                musicInfo = null;
            }
            r1.A08 = musicInfo;
        }
        r4.D3b(AnonymousClass8ZN.MUSIC_IN_FEED, r1.A00(), A002, r3);
    }

    public final View.OnTouchListener DSj() {
        return this.A01.D3c(((AnonymousClass3ZT) this.A00.A00).A00());
    }
}
