package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Tqs  reason: case insensitive filesystem */
public final class C14156Tqs implements C20910X4b {
    public final int A00;
    public final Object A01;

    public C14156Tqs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final String E4p() {
        switch (this.A00) {
            case 0:
                UZ3 uz3 = (UZ3) this.A01;
                if (uz3.A02 != null) {
                    return uz3.A07().getSearchString();
                }
                break;
            case 1:
                IgdsInlineSearchBox igdsInlineSearchBox = ((E4F) this.A01).A01;
                if (igdsInlineSearchBox != null) {
                    return igdsInlineSearchBox.getSearchString();
                }
                break;
            case 2:
                return ((C15363UbF) this.A01).A07;
            case 3:
                return ((C14138TqY) this.A01).A01.A01;
            case 6:
                return ((C18012Vjo) this.A01).A00;
            default:
                String str = ((C15286UZq) this.A01).A06().A0J;
                if (str != null) {
                    return str;
                }
                0qQ.A0F("query");
                throw AnonymousClass00P.createAndThrow();
        }
        return "";
    }
}
