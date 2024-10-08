package X;

/* renamed from: X.5Tw  reason: invalid class name and case insensitive filesystem */
public final class C286085Tw extends 0Yg implements 0sL {
    public static final C286085Tw A00 = new C286085Tw();

    public C286085Tw() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HM9 hm9;
        C286015Tp r0;
        AnonymousClass6HK r6 = (AnonymousClass6HK) obj;
        C3022062b r7 = (C3022062b) obj2;
        Object obj3 = r7.A02;
        if (obj3 instanceof AnonymousClass5ZC) {
            hm9 = HM9.Paragraph;
        } else if (obj3 instanceof AnonymousClass5ZB) {
            hm9 = HM9.Span;
        } else if (obj3 instanceof C52947Gfy) {
            hm9 = HM9.VerbatimTts;
        } else if (obj3 instanceof C56050Hrz) {
            hm9 = HM9.Url;
        } else if (obj3 instanceof C52946Gfx) {
            hm9 = HM9.Link;
        } else if (obj3 instanceof C52945Gfw) {
            hm9 = HM9.Clickable;
        } else {
            hm9 = HM9.String;
        }
        switch (hm9.ordinal()) {
            case 0:
                0qQ.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                r0 = C286035Tr.A09;
                break;
            case 1:
                0qQ.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                r0 = C286035Tr.A0B;
                break;
            case 2:
                0qQ.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                r0 = C286035Tr.A0I;
                break;
            case 3:
                0qQ.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                r0 = C286035Tr.A0H;
                break;
            case 4:
                0qQ.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                r0 = C286035Tr.A06;
                break;
            case 5:
                0qQ.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                r0 = C286035Tr.A04;
                break;
            default:
                return 0sr.A1L(new Object[]{hm9, obj3, Integer.valueOf(r7.A01), Integer.valueOf(r7.A00), r7.A03});
        }
        obj3 = C286035Tr.A00(r0, r6, obj3);
        return 0sr.A1L(new Object[]{hm9, obj3, Integer.valueOf(r7.A01), Integer.valueOf(r7.A00), r7.A03});
    }
}
