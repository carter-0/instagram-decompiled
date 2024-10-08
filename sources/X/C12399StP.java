package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.StP  reason: case insensitive filesystem */
public final class C12399StP implements C13883Tj6 {
    public final QXV A00;
    public final C13612Tde A01;

    public final CharSequence C1h(Context context) {
        String A07;
        String A072;
        QXV qxv = this.A00;
        if (qxv == null || (A07 = qxv.A07("text")) == null || 00l.A0W(A07)) {
            return null;
        }
        String A073 = qxv.A07("text");
        if (A073 != null) {
            ImmutableList A0E = qxv.A0E();
            if (A0E != null) {
                C13612Tde tde = this.A01;
                ArrayList A1C = AnonymousClass7TE.A1C();
                C249803kO A0J = C66580MXl.A0J(A0E);
                while (A0J.hasNext()) {
                    QXU qxu = (QXU) A0J.next();
                    if (qxu.A0E() != null) {
                        QUR A0E2 = qxu.A0E();
                        String str = null;
                        if (!(A0E2 == null || (A072 = A0E2.A07("url")) == null || 00l.A0W(A072))) {
                            int A002 = qxu.A00("length");
                            int coercedIntField = qxu.getCoercedIntField(1, "offset");
                            QUR A0E3 = qxu.A0E();
                            if (A0E3 != null) {
                                str = A0E3.A07("url");
                            }
                            A1C.add(new SF9(A002, coercedIntField, str));
                        }
                    }
                }
                0qQ.A0B(A1C, 1);
                C11232SGr sGr = new C11232SGr(A073, A1C);
                0qQ.A0B(tde, 0);
                return sGr.A01(tde, false);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C12399StP(QXV qxv, C13612Tde tde) {
        this.A00 = qxv;
        this.A01 = tde;
    }
}
