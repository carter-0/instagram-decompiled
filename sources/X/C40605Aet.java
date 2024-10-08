package X;

import android.text.Layout;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.Aet  reason: case insensitive filesystem */
public final class C40605Aet implements C2802350v {
    public final float A00;
    public final int A01;
    public final Layout.Alignment A02;
    public final ClipsTextFormatType A03;
    public final C306576Mr A04;
    public final String A05;
    public final boolean A06;

    public C40605Aet(Layout.Alignment alignment, ClipsTextFormatType clipsTextFormatType, C306576Mr r4, String str, float f, int i, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(clipsTextFormatType, 5);
        this.A05 = str;
        this.A00 = f;
        this.A01 = i;
        this.A02 = alignment;
        this.A03 = clipsTextFormatType;
        this.A04 = r4;
        this.A06 = z;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final C273914nO BkW() {
        C273914nO r1 = new C273914nO();
        r1.A01 = C273924nP.TEXT;
        r1.A06 = AnonymousClass7TE.A1I(C273654mx.A00(3416));
        return r1;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0w;
    }
}
