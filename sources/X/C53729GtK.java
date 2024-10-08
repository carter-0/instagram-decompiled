package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.GtK  reason: case insensitive filesystem */
public final class C53729GtK extends C251343mx {
    public final SocialContextBubbleUiState A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C53729GtK(SocialContextBubbleUiState socialContextBubbleUiState, int i, int i2, int i3) {
        this.A00 = socialContextBubbleUiState;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        boolean A1Z = C51966G9m.A1Z(r14);
        long A0D = C51970G9q.A0D();
        2WX A0F = C51974G9v.A0F((2WX) null, C51965G9l.A0c(AnonymousClass05K.A07, A1Z ? 1 : 0, A0D), A1Z, C51965G9l.A07(this.A01));
        SpannableStringBuilder A0E = C51965G9l.A0E();
        A0E.append(this.A00.A04.getUsername());
        C51971G9r.A0y(A0E, new CharacterStyle(), A1Z);
        SpannableStringBuilder A0E2 = C51965G9l.A0E();
        A0E2.append(C244013aV.A0E(r14, 2131962789));
        A0E2.append(" ");
        A0E2.append(A0E);
        long A0C = C244013aV.A0C(r14, this.A03);
        2V1 r10 = r14.A05;
        int A0A = C51972G9s.A0A(r10.A0C, r14, this.A02);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, A0E2, A1Z);
        C51973G9u.A16(r14, A0b, A0A, A0C);
        A0b.A0R(A1Z);
        G9w.A11(typeface, r14, A0b, A0D2);
        C51974G9v.A19(A0b, num, A1Z);
        A0b.A0E();
        C51973G9u.A19(A0F, A0b, A1Z);
        return A0b.A0A();
    }
}
