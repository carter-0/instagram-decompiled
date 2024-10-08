package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Ls8  reason: case insensitive filesystem */
public final class C65367Ls8 implements C66536MVq, AnonymousClass2sT {
    public Context A00;
    public UserSession A01;
    public AnonymousClass3Q2 A02;
    public C231822sS A03;
    public final Integer A04;
    public final HashSet A05 = AnonymousClass7TE.A1F();

    public C65367Ls8(Context context, UserSession userSession, C231822sS r4, AnonymousClass3Q2 r5, Integer num) {
        0qQ.A0B(num, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r5;
        this.A03 = r4;
        this.A04 = num;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r5;
    }

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A05.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A05.remove(r2);
    }

    public final 1iA BR7() {
        return this.A02.A1G;
    }

    public final int BhS() {
        return this.A02.A03();
    }

    public final Integer BzN() {
        AnonymousClass3Q2 r2 = this.A02;
        AnonymousClass3QD r0 = r2.A6J;
        AnonymousClass3QD r1 = AnonymousClass3QD.CONFIGURED;
        if (r0 == r1 && r2.A0n()) {
            return AnonymousClass05K.A00;
        }
        if (r2.A1f == r1) {
            Integer num = this.A04;
            if (num == AnonymousClass05K.A00) {
                return AnonymousClass05K.A0C;
            }
            Integer num2 = AnonymousClass05K.A01;
            if (num == num2) {
                return num2;
            }
        }
        if (r2.A3D != null) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0Y;
    }

    public final LSB BzP() {
        int i;
        int i2;
        if (this.A04 == AnonymousClass05K.A01) {
            AnonymousClass3Q2 r1 = this.A02;
            if (AnonymousClass7TE.A1b(r1.A4T)) {
                Context context = this.A00;
                Integer valueOf = Integer.valueOf(r1.A4T.size() + 1);
                return new LSB(DbY.A0c(context, valueOf, 2131971174), DbY.A0c(context, valueOf, 2131971176));
            }
            i = 2131971173;
            i2 = 2131971175;
        } else {
            i = 2131969675;
            i2 = 2131969672;
        }
        return new LSB(i, i2);
    }

    public final /* synthetic */ Drawable C6t() {
        return null;
    }

    public final String C6v() {
        AnonymousClass3Q2 r2 = this.A02;
        if (r2.A0u()) {
            r2 = (AnonymousClass3Q2) AnonymousClass7TE.A13(r2.A0L());
        }
        String str = r2.A33;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final void DaJ(AnonymousClass3Q2 r3) {
        Iterator A1G = AnonymousClass7TE.A1G(this.A05);
        while (A1G.hasNext()) {
            ((AnonymousClass3M8) AnonymousClass7TF.A0a(A1G)).A0B(this);
        }
    }

    public final void Dfh() {
        String str;
        AnonymousClass55U r0 = this.A02.A6I;
        if (r0 == null || (str = r0.A02) == null || !00l.A0d(str, "VIDEO_RENDER_ERROR", false)) {
            1ud r1 = 1ua.A0G;
            Context context = this.A00;
            JTU.A0g(context, this.A02, r1.A01(context, this.A01));
            return;
        }
        C358248ab A0Y = DbS.A0Y(this.A00);
        A0Y.A09(2131969308);
        A0Y.A08(2131969307);
        LV2.A01(A0Y, this, 22, 2131969290);
        Dba.A1M(A0Y);
        Dba.A0t(LV2.A00(this, 23), A0Y, 2131969304);
    }
}
